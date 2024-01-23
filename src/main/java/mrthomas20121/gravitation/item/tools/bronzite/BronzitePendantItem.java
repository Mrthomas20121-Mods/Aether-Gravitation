package mrthomas20121.gravitation.item.tools.bronzite;

import com.aetherteam.aether.client.AetherSoundEvents;
import com.aetherteam.aether.item.accessories.pendant.PendantItem;
import mrthomas20121.gravitation.Gravitation;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.ForgeMod;
import top.theillusivec4.curios.api.SlotContext;

import java.util.List;
import java.util.UUID;

import static mrthomas20121.gravitation.item.GraviItems.SALMON_ROSE;

public class BronzitePendantItem extends PendantItem {

    private final UUID ID = UUID.fromString("824475d0-ac60-448f-8d2e-242d5914cf3e");
    private final String NAME = "bronzite_pendant_modifier";

    public BronzitePendantItem() {
        super("neptune_pendant", AetherSoundEvents.ITEM_ACCESSORY_EQUIP_ZANITE_RING, new Properties().rarity(SALMON_ROSE).stacksTo(1));
        this.setRenderTexture(Gravitation.MOD_ID, "bronzite_pendant");
    }

    private AttributeModifier createModifier() {
        return new AttributeModifier(ID, NAME, 2, AttributeModifier.Operation.ADDITION);
    }

    @Override
    public List<Component> getAttributesTooltip(List<Component> tooltips, ItemStack stack) {
        tooltips.add(Component.translatable("gravitation.curio.pendant").withStyle(ChatFormatting.GOLD));
        tooltips.add(Component.translatable("gravitation.curio.bronzite_pendant").withStyle(ChatFormatting.AQUA));
        return super.getAttributesTooltip(tooltips, stack);
    }

    @Override
    public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
        if (!slotContext.entity().level().isClientSide()) {
            AttributeInstance attributeInstance = slotContext.entity().getAttribute(Attributes.ARMOR_TOUGHNESS);

            if(attributeInstance != null) {
                attributeInstance.removeModifier(ID);
                AttributeModifier modifier = createModifier();
                attributeInstance.addPermanentModifier(modifier);
            }
        }
    }

    @Override
    public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
        if (!slotContext.entity().level().isClientSide()) {
            AttributeInstance attributeInstance = slotContext.entity().getAttribute(ForgeMod.SWIM_SPEED.get());

            if(attributeInstance != null) {
                attributeInstance.removeModifier(ID);
            }
        }
    }
}
