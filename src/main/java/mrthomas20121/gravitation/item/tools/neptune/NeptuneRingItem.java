package mrthomas20121.gravitation.item.tools.neptune;

import com.aetherteam.aether.client.AetherSoundEvents;
import com.aetherteam.aether.item.AetherItems;
import com.aetherteam.aether.item.accessories.ring.RingItem;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.common.ForgeMod;
import top.theillusivec4.curios.api.SlotContext;

import java.util.List;
import java.util.UUID;

public class NeptuneRingItem extends RingItem {

    private final UUID ID = UUID.fromString("208796c7-820a-4467-98c3-be2b605a5240");
    private final String NAME = "npetune_modifier";

    public NeptuneRingItem() {
        super(AetherSoundEvents.ITEM_ACCESSORY_EQUIP_ZANITE_RING, new Properties().rarity(AetherItems.AETHER_LOOT).stacksTo(1));
        this.addDungeonTooltip(AetherItems.SILVER_DUNGEON_TOOLTIP);
    }

    private AttributeModifier createModifier() {
        return new AttributeModifier(ID, NAME, 1.5f, AttributeModifier.Operation.ADDITION);
    }

    @Override
    public List<Component> getAttributesTooltip(List<Component> tooltips, ItemStack stack) {
        tooltips.add(Component.translatable("gravitation.curio.ring").withStyle(ChatFormatting.GOLD));
        tooltips.add(Component.translatable("gravitation.curio.neptune_ring").withStyle(ChatFormatting.AQUA));
        return super.getAttributesTooltip(tooltips, stack);
    }

    @Override
    public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
        if (!slotContext.entity().level.isClientSide()) {
            AttributeInstance attributeInstance = slotContext.entity().getAttribute(ForgeMod.SWIM_SPEED.get());

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
