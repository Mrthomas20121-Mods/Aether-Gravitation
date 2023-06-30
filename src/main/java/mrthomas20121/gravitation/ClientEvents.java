package mrthomas20121.gravitation;

import com.aetherteam.aether.item.AetherItems;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Gravitation.MOD_ID, value = Dist.CLIENT)
public class ClientEvents {

    @SubscribeEvent
    public static void tooltipEvent(ItemTooltipEvent event) {
        if(event.getItemStack().is(GraviTags.Items.CAN_CREATE_ENCHANTING_TABLE)) {
            event.getToolTip().add(Component.translatable("gravitation.tooltip.can_create_enchanting_table").withStyle(ChatFormatting.AQUA));
        }
    }
}
