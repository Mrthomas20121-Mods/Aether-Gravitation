package mrthomas20121.gravitation.item.tools.neptune;

import com.aetherteam.aether.client.AetherSoundEvents;
import com.aetherteam.aether.item.AetherItems;
import com.aetherteam.aether.item.accessories.pendant.PendantItem;
import com.aetherteam.aether.item.accessories.ring.RingItem;
import mrthomas20121.gravitation.Gravitation;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.ForgeMod;
import top.theillusivec4.curios.api.SlotContext;

import java.util.List;
import java.util.UUID;

public class NeptunePendantItem extends PendantItem {

    private final UUID ID = UUID.fromString("66a7b21e-db9a-4206-9bee-f41d9cfa2c27");
    private final String NAME = "npetune_pendant_modifier";

    public NeptunePendantItem() {
        super("neptune_pendant", AetherSoundEvents.ITEM_ACCESSORY_EQUIP_ZANITE_RING, new Properties().rarity(AetherItems.AETHER_LOOT));
        this.addDungeonTooltip(AetherItems.SILVER_DUNGEON_TOOLTIP);
        this.setRenderTexture(Gravitation.MOD_ID, "neptune_pendant");
    }

    private AttributeModifier createModifier() {
        return new AttributeModifier(ID, NAME, 1.5f, AttributeModifier.Operation.ADDITION);
    }

    @Override
    public List<Component> getAttributesTooltip(List<Component> tooltips, ItemStack stack) {
        tooltips.add(Component.translatable("gravitation.curio.pendant").withStyle(ChatFormatting.GOLD));
        tooltips.add(Component.translatable("gravitation.curio.neptune_pendant").withStyle(ChatFormatting.AQUA));
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
