package mrthomas20121.gravitation.client;

import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.entity.GraviEntityTypes;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Gravitation.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class GraviRenderer {


    @SubscribeEvent
    public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(GraviEntityTypes.PHOENIX_DART.get(), PhoenixDartRenderer::new);
    }
}
