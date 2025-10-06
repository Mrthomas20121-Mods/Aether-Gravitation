package mrthomas20121.gravitation;

import com.aetherteam.aether.AetherTags;
import dev.shadowsoffire.attributeslib.api.ALObjects;
import mrthomas20121.gravitation.enchanting.GravitationEnchantments;
import mrthomas20121.gravitation.item.tools.neptune.NeptuneTool;
import net.minecraft.tags.TagKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.Tags;
import net.minecraftforge.event.ItemAttributeModifierEvent;
import net.minecraftforge.event.entity.living.LivingEquipmentChangeEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.CriticalHitEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import top.theillusivec4.curios.api.CuriosApi;
import top.theillusivec4.curios.api.SlotResult;
import top.theillusivec4.curios.api.event.CurioAttributeModifierEvent;
import top.theillusivec4.curios.api.type.capability.ICuriosItemHandler;

import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

import static net.minecraft.world.item.enchantment.EnchantmentHelper.getEnchantmentLevel;

@Mod.EventBusSubscriber(modid = Gravitation.MOD_ID)
public class ForgeEvents {

    private static final UUID SUN_HELMET_UUID = UUID.fromString("1137ca50-652c-4227-9adb-81bffd379687");
    private static final UUID SUN_CHESTPLATE_UUID = UUID.fromString("7077e71f-1ca2-4d27-8cad-d3d1539384ee");
    private static final UUID SUN_LEGGINGS_UUID = UUID.fromString("9039b4ff-4127-4d8f-895a-c510e6fcd49f");
    private static final UUID SUN_BOOTS_UUID = UUID.fromString("5f209dc2-f8ad-4499-a109-eaba300b2ba4");
    private static final UUID STAMINA_MARS = UUID.fromString("3899287f-ff09-485b-9152-6d995e80b5db");

    @SubscribeEvent
    public static void modifyItemEvent(ItemAttributeModifierEvent event) {
        ItemStack stack = event.getItemStack();

        int level = stack.getEnchantmentLevel(GravitationEnchantments.SUN_SPIRIT_BLESSING.get());

        if(event.getSlotType().isArmor() && level > 0) {
            if(event.getSlotType().equals(EquipmentSlot.HEAD) && stack.is(Tags.Items.ARMORS_HELMETS)) {
                event.addModifier(Attributes.MAX_HEALTH, new AttributeModifier(SUN_HELMET_UUID, "gravitation:sun_spirit_blessing_max_health", level, AttributeModifier.Operation.ADDITION));
            }
            else if(event.getSlotType().equals(EquipmentSlot.CHEST) && stack.is(Tags.Items.ARMORS_CHESTPLATES)) {
                event.addModifier(Attributes.MAX_HEALTH, new AttributeModifier(SUN_CHESTPLATE_UUID, "gravitation:sun_spirit_blessing_max_health", level, AttributeModifier.Operation.ADDITION));
            }
            else if(event.getSlotType().equals(EquipmentSlot.LEGS) && stack.is(Tags.Items.ARMORS_LEGGINGS)) {
                event.addModifier(Attributes.MAX_HEALTH, new AttributeModifier(SUN_LEGGINGS_UUID, "gravitation:sun_spirit_blessing_max_health", level, AttributeModifier.Operation.ADDITION));
            }
            else if(event.getSlotType().equals(EquipmentSlot.FEET) && stack.is(Tags.Items.ARMORS_BOOTS)) {
                event.addModifier(Attributes.MAX_HEALTH, new AttributeModifier(SUN_BOOTS_UUID, "gravitation:sun_spirit_blessing_max_health", level, AttributeModifier.Operation.ADDITION));
            }
        }

        int marsLevel = stack.getEnchantmentLevel(GravitationEnchantments.STAMINA_OF_MARS.get());;

        if(event.getSlotType().equals(EquipmentSlot.FEET) && marsLevel > 0) {
            event.addModifier(Attributes.MOVEMENT_SPEED, new AttributeModifier(STAMINA_MARS, "gravitation:stamina_mars_boost", marsLevel, AttributeModifier.Operation.ADDITION));
        }
    }

    @SubscribeEvent
    public static void unequipEvent(LivingEquipmentChangeEvent event) {
        ItemStack from = event.getFrom();
        ItemStack to = event.getTo();
        if(!from.isEmpty() && event.getSlot().isArmor()) {
            int level = from.getEnchantmentLevel(GravitationEnchantments.SUN_SPIRIT_BLESSING.get());
            int toLevel = event.getTo().getEnchantmentLevel(GravitationEnchantments.SUN_SPIRIT_BLESSING.get());
            if(level > 0 && toLevel == 0) {
                LivingEntity entity = event.getEntity();
                if(entity.getAttribute(Attributes.MAX_HEALTH) != null) {
                    UUID uuid = SUN_HELMET_UUID;

                    if(from.is(Tags.Items.ARMORS_CHESTPLATES)) {
                        uuid = SUN_CHESTPLATE_UUID;
                    }
                    else if(from.is(Tags.Items.ARMORS_LEGGINGS)) {
                        uuid = SUN_LEGGINGS_UUID;
                    }
                    else if(from.is(Tags.Items.ARMORS_BOOTS)) {
                        uuid = SUN_LEGGINGS_UUID;
                    }

                    Objects.requireNonNull(entity.getAttribute(Attributes.MAX_HEALTH)).removePermanentModifier(uuid);
                    entity.hurt(entity.damageSources().genericKill(), level);
                    //entity.setHealth(entity.getMaxHealth());
                }
            }
        }
    }

    @SubscribeEvent
    public static void modifyCurioEvent(CurioAttributeModifierEvent event) {
        if(event.getSlotContext().identifier().equals("aether_gloves") && event.getItemStack().is(AetherTags.Items.AETHER_GLOVES)) {
            event.addModifier(Attributes.ATTACK_KNOCKBACK, new AttributeModifier(event.getUuid(), "gravitation:crit_chance_gloves", 0.1f, AttributeModifier.Operation.ADDITION));
        }
    }

    @SubscribeEvent
    public static void breakSpeedEvent(PlayerEvent.BreakSpeed event) {
        if(event.isCanceled()) {
            return;
        }

        Player player = event.getEntity();

        if(player.isInWater()) {
            if(player.getMainHandItem().getItem() instanceof NeptuneTool) {
                event.setNewSpeed(Math.max(event.getNewSpeed(), event.getOriginalSpeed() * 5.0F));
            }
        }
    }

    private static boolean hasArmor(TagKey<Item> armor, LivingEntity entity) {
        Optional<ICuriosItemHandler> inv = CuriosApi.getCuriosInventory(entity).resolve();
        int i = 0;

        if(inv.isPresent()) {
            ICuriosItemHandler handler = inv.get();
            Optional<SlotResult> result = handler.findFirstCurio(stack -> stack.is(armor));
            if(result.isPresent()) {
                i++;
            }
        }

        for(ItemStack stack : entity.getArmorSlots()) {

            // set bool to true if any of the stack match
            if(!stack.isEmpty() && stack.is(armor)) {
                i++;
            }
        }

        return i == 5;
    }
}
