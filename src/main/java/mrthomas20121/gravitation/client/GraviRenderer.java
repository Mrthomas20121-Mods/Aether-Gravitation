package mrthomas20121.gravitation.client;

import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.block.GraviBlocks;
import mrthomas20121.gravitation.block_entity.GraviBlockEntityTypes;
import mrthomas20121.gravitation.entity.GraviEntityTypes;
import net.minecraft.client.model.BoatModel;
import net.minecraft.client.model.ChestBoatModel;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Gravitation.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class GraviRenderer {

    @SubscribeEvent
    public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        // block entities
        event.registerBlockEntityRenderer(GraviBlockEntityTypes.ENCHANTED_SIGN.get(), SignRenderer::new);

        // entities
        event.registerEntityRenderer(GraviEntityTypes.PHOENIX_DART.get(), PhoenixDartRenderer::new);
        event.registerEntityRenderer(GraviEntityTypes.ENCHANTED_BOAT.get(), (context) -> new EnchantedBoatRenderer(context, false) );
        event.registerEntityRenderer(GraviEntityTypes.ENCHANTED_CHEST_BOAT.get(), (context) -> new EnchantedBoatRenderer(context, true) );
    }

    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(GraviModelLayers.ENCHANTED_BOAT, BoatModel::createBodyModel);
        event.registerLayerDefinition(GraviModelLayers.ENCHANTED_CHEST_BOAT, ChestBoatModel::createBodyModel);
    }
}
