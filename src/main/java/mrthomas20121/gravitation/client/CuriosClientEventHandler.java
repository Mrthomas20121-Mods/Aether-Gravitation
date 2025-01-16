package mrthomas20121.gravitation.client;

import com.google.common.collect.Multimap;
import dev.shadowsoffire.attributeslib.impl.PercentBasedAttribute;
import net.minecraft.ChatFormatting;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.contents.TranslatableContents;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import top.theillusivec4.curios.api.CuriosApi;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.ISlotType;
import top.theillusivec4.curios.api.type.capability.ICurio;

import java.util.*;

public class CuriosClientEventHandler {

    private static final UUID ATTACK_DAMAGE_MODIFIER = UUID
            .fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
    private static final UUID ATTACK_SPEED_MODIFIER = UUID
            .fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3");

    @SubscribeEvent
    public void onTooltip(ItemTooltipEvent evt) {
        ItemStack stack = evt.getItemStack();
        Player player = evt.getEntity();

        if (!stack.isEmpty()) {
            List<Component> tooltip = evt.getToolTip();

            // Process non-Curio equipment items with slot modifier tooltips
            // todo: There's probably a better way to accomplish this
            for (int i = 0; i < tooltip.size(); i++) {
                Component component = tooltip.get(i);

                if (component.getContents() instanceof TranslatableContents contents) {
                    boolean replace = false;
                    Object[] args = contents.getArgs();

                    // https://github.com/TheIllusiveC4/Curios/issues/388
                    // noinspection ConstantConditions
                    if (args != null) {

                        for (int i1 = 0; i1 < args.length; i1++) {
                            Object arg = args[i1];

                            if (arg instanceof MutableComponent mutableComponent &&
                                    mutableComponent.getContents() instanceof TranslatableContents contents1) {

                                if (contents1.getKey().startsWith("curios.slot.")) {
                                    String actualKey = contents1.getKey().replace(".slot.", ".identifier.");
                                    contents.getArgs()[i1] = Component.translatable(actualKey, contents1.getArgs());
                                    replace = true;
                                    break;
                                }
                            }
                        }
                    }

                    if (replace) {
                        tooltip.set(i, Component.translatable(
                                contents.getKey().replace("attribute.modifier.", "curios.modifiers.slots."),
                                contents.getArgs()).withStyle(component.getStyle()));
                    }
                }
            }

            CompoundTag tag = stack.getTag();
            int i = 0;

            if (tag != null && tag.contains("HideFlags", 99)) {
                i = tag.getInt("HideFlags");
            }

            Map<String, ISlotType> map = player != null ? CuriosApi.getItemStackSlots(stack, player) :
                    CuriosApi.getItemStackSlots(stack);
            // Remove slots that have curios:all validators to avoid tooltip bloat on every item
//            map = new HashMap<>(map);
//            Set<String> toRemove = new HashSet<>();
//
//            for (ISlotType value : map.values()) {
//
//                for (ResourceLocation validator : value.getValidators()) {
//
//                    if (validator.getNamespace().equals(CuriosApi.MODID) &&
//                            validator.getPath().equals("all")) {
//                        toRemove.add(value.getIdentifier());
//                        break;
//                    }
//                }
//            }
//
//            for (String s : toRemove) {
//                map.remove(s);
//            }
            Set<String> curioTags = Set.copyOf(map.keySet());

            if (curioTags.contains("curio")) {
                curioTags = Set.of("curio");
            }
            List<String> slots = new ArrayList<>(curioTags);

            if (!slots.isEmpty()) {
                List<Component> tagTooltips = new ArrayList<>();
                MutableComponent slotsTooltip =
                        Component.translatable("curios.tooltip.slot").append(" ")
                                .withStyle(ChatFormatting.GOLD);

                for (int j = 0; j < slots.size(); j++) {
                    String key = "curios.identifier." + slots.get(j);
                    MutableComponent type = Component.translatable(key);

                    if (j < slots.size() - 1) {
                        type = type.append(", ");
                    }

                    type = type.withStyle(ChatFormatting.YELLOW);
                    slotsTooltip.append(type);
                }
                tagTooltips.add(slotsTooltip);

                LazyOptional<ICurio> optionalCurio = CuriosApi.getCurio(stack);
                optionalCurio.ifPresent(curio -> {
                    List<Component> actualSlotsTooltip = curio.getSlotsTooltip(tagTooltips);

                    if (!actualSlotsTooltip.isEmpty()) {
                        tooltip.addAll(1, actualSlotsTooltip);
                    }
                });

                if (!optionalCurio.isPresent()) {
                    tooltip.addAll(1, tagTooltips);
                }
                List<Component> attributeTooltip = new ArrayList<>();

                for (String identifier : slots) {
                    Multimap<Attribute, AttributeModifier> multimap =
                            CuriosApi.getAttributeModifiers(new SlotContext(identifier, player, 0, false, true),
                                    UUID.randomUUID(), stack);

                    if (!multimap.isEmpty() && (i & 2) == 0) {
                        boolean init = false;

                        for (Map.Entry<Attribute, AttributeModifier> entry : multimap.entries()) {

                            // Some mods are adding null attributes so add a guard here to not crash the client
                            if (entry.getKey() == null) {
                                continue;
                            }

                            if (!init) {
                                attributeTooltip.add(Component.empty());
                                attributeTooltip.add(Component.translatable("curios.modifiers." + identifier)
                                        .withStyle(ChatFormatting.GOLD));
                                init = true;
                            }
                            AttributeModifier attributemodifier = entry.getValue();
                            double amount = attributemodifier.getAmount();
                            boolean flag = false;

                            if (player != null) {

                                if (attributemodifier.getId() == ATTACK_DAMAGE_MODIFIER) {
                                    AttributeInstance att = player.getAttribute(Attributes.ATTACK_DAMAGE);

                                    if (att != null) {
                                        amount = amount + att.getBaseValue();
                                    }
                                    amount = amount + EnchantmentHelper
                                            .getDamageBonus(stack, MobType.UNDEFINED);
                                    flag = true;
                                } else if (attributemodifier.getId() == ATTACK_SPEED_MODIFIER) {
                                    AttributeInstance att = player.getAttribute(Attributes.ATTACK_SPEED);

                                    if (att != null) {
                                        amount += att.getBaseValue();
                                    }
                                    flag = true;
                                }

                                double d1;

                                if (attributemodifier.getOperation() != AttributeModifier.Operation.MULTIPLY_BASE
                                        && attributemodifier.getOperation() !=
                                        AttributeModifier.Operation.MULTIPLY_TOTAL) {

                                    if (entry.getKey().equals(Attributes.KNOCKBACK_RESISTANCE)) {
                                        d1 = amount * 10.0D;
                                    } else {
                                        d1 = amount;
                                    }
                                } else {
                                    d1 = amount * 100.0D;
                                }

                                if (entry.getKey() instanceof PercentBasedAttribute percentBasedAttribute)
                                {
                                    attributeTooltip.add(percentBasedAttribute.toComponent(attributemodifier, evt.getFlags()));
                                }
                            }
                        }
                    }
                }
                optionalCurio.ifPresent(curio -> {
                    List<Component> actualAttributeTooltips =
                            curio.getAttributesTooltip(attributeTooltip);

                    if (!actualAttributeTooltips.isEmpty()) {
                        tooltip.addAll(actualAttributeTooltips);
                    }
                });

                if (!optionalCurio.isPresent()) {
                    tooltip.addAll(attributeTooltip);
                }
            }
        }
    }
}
