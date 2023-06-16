package mrthomas20121.gravitation.item.tools.neptune;

import com.aetherteam.aether.client.AetherSoundEvents;
import com.aetherteam.aether.item.AetherItems;
import com.aetherteam.aether.item.accessories.pendant.PendantItem;
import mrthomas20121.gravitation.Gravitation;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ItemStack;
import top.theillusivec4.curios.api.SlotContext;

import java.util.List;

public class NeptunePendantItem extends PendantItem {

    public NeptunePendantItem() {
        super("neptune_pendant", AetherSoundEvents.ITEM_ACCESSORY_EQUIP_ZANITE_RING, new Properties().rarity(AetherItems.AETHER_LOOT).stacksTo(1));
        this.addDungeonTooltip(AetherItems.SILVER_DUNGEON_TOOLTIP);
        this.setRenderTexture(Gravitation.MOD_ID, "neptune_pendant");
    }

    @Override
    public List<Component> getAttributesTooltip(List<Component> tooltips, ItemStack stack) {
        tooltips.add(Component.translatable("gravitation.curio.pendant").withStyle(ChatFormatting.GOLD));
        tooltips.add(Component.translatable("gravitation.curio.neptune_pendant").withStyle(ChatFormatting.AQUA));
        return super.getAttributesTooltip(tooltips, stack);
    }

    @Override
    public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
        if (slotContext.entity().isInWaterRainOrBubble()) {
            slotContext.entity().addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 200, 0, false, false));
        }
    }
}
