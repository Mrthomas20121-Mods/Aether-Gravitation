package mrthomas20121.gravitation.item.tools.bronzite;

import com.aetherteam.aether.client.AetherSoundEvents;
import com.aetherteam.aether.item.accessories.ring.RingItem;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.ForgeMod;
import top.theillusivec4.curios.api.SlotContext;

import java.util.List;
import java.util.UUID;

import static mrthomas20121.gravitation.item.GraviItems.SALMON_ROSE;

public class BronziteRingItem extends RingItem {

    private final UUID ID = UUID.fromString("c4965505-eb9a-4d31-8896-ae0adde3c479");
    private final String NAME = "bronzite_modifier";

    public BronziteRingItem() {
        super(AetherSoundEvents.ITEM_ACCESSORY_EQUIP_ZANITE_RING, new Item.Properties().rarity(SALMON_ROSE).stacksTo(1));
    }

    @Override
    public List<Component> getAttributesTooltip(List<Component> tooltips, ItemStack stack) {
        tooltips.add(Component.translatable("gravitation.curio.ring").withStyle(ChatFormatting.GOLD));
        tooltips.add(Component.translatable("gravitation.curio.bronzite_ring").withStyle(ChatFormatting.AQUA));
        return super.getAttributesTooltip(tooltips, stack);
    }

    private AttributeModifier createModifier() {
        return new AttributeModifier(ID, NAME, 2, AttributeModifier.Operation.ADDITION);
    }

    @Override
    public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
        if (!slotContext.entity().level.isClientSide()) {
            AttributeInstance attributeInstance = slotContext.entity().getAttribute(Attributes.ARMOR);

            if(attributeInstance != null) {
                attributeInstance.removeModifier(ID);
                AttributeModifier modifier = createModifier();
                attributeInstance.addPermanentModifier(modifier);
            }
        }
    }

    @Override
    public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
        if (!slotContext.entity().level.isClientSide()) {
            AttributeInstance attributeInstance = slotContext.entity().getAttribute(ForgeMod.SWIM_SPEED.get());

            if(attributeInstance != null) {
                attributeInstance.removeModifier(ID);
            }
        }
    }
}
