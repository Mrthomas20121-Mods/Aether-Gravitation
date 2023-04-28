package mrthomas20121.gravitation;

import mrthomas20121.gravitation.item.tools.NeptuneTool;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Gravitation.MOD_ID)
public class ForgeEvents {

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
}
