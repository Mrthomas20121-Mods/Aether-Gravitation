package mrthomas20121.gravitation.client.renderer;

import com.aetherteam.aether.client.renderer.accessory.GlovesRenderer;
import com.aetherteam.aether.client.renderer.accessory.PendantRenderer;
import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.block_entity.GraviBlockEntityTypes;
import mrthomas20121.gravitation.entity.GraviEntityTypes;
import mrthomas20121.gravitation.item.GraviItems;
import net.minecraft.client.model.BoatModel;
import net.minecraft.client.model.ChestBoatModel;
import net.minecraft.client.renderer.blockentity.HangingSignRenderer;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import top.theillusivec4.curios.api.client.CuriosRendererRegistry;

@Mod.EventBusSubscriber(modid = Gravitation.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class GraviRenderer {

    @SubscribeEvent
    public static void registerCurioRenderers(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            CuriosRendererRegistry.register(GraviItems.BRONZITE_GLOVES.get(), GlovesRenderer::new);
            CuriosRendererRegistry.register(GraviItems.BRONZITE_PENDANT.get(), PendantRenderer::new);
            CuriosRendererRegistry.register(GraviItems.NEPTUNE_PENDANT.get(), PendantRenderer::new);
        });
    }

    @SubscribeEvent
    public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        // block entities
        event.registerBlockEntityRenderer(GraviBlockEntityTypes.ENCHANTED_SIGN.get(), SignRenderer::new);
        event.registerBlockEntityRenderer(GraviBlockEntityTypes.BELADON_SIGN.get(), SignRenderer::new);
        event.registerBlockEntityRenderer(GraviBlockEntityTypes.AERFIN_SIGN.get(), SignRenderer::new);
        event.registerBlockEntityRenderer(GraviBlockEntityTypes.ENCHANTED_HANGING_SIGN.get(), HangingSignRenderer::new);
        event.registerBlockEntityRenderer(GraviBlockEntityTypes.BELADON_HANGING_SIGN.get(), HangingSignRenderer::new);
        event.registerBlockEntityRenderer(GraviBlockEntityTypes.AERFIN_HANGING_SIGN.get(), HangingSignRenderer::new);

        // entities
        event.registerEntityRenderer(GraviEntityTypes.AERFIN_BOAT.get(), (context) -> new AerfinBoatRenderer(context, false) );
        event.registerEntityRenderer(GraviEntityTypes.AERFIN_CHEST_BOAT.get(), (context) -> new AerfinBoatRenderer(context, true) );

        event.registerEntityRenderer(GraviEntityTypes.ENCHANTED_BOAT.get(), (context) -> new EnchantedBoatRenderer(context, false) );
        event.registerEntityRenderer(GraviEntityTypes.ENCHANTED_CHEST_BOAT.get(), (context) -> new EnchantedBoatRenderer(context, true) );

        event.registerEntityRenderer(GraviEntityTypes.BELADON_BOAT.get(), (context) -> new BeladonBoatRenderer(context, false) );
        event.registerEntityRenderer(GraviEntityTypes.BELADON_CHEST_BOAT.get(), (context) -> new BeladonBoatRenderer(context, true) );
    }

    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(GraviModelLayers.AERFIN_BOAT, BoatModel::createBodyModel);
        event.registerLayerDefinition(GraviModelLayers.AERFIN_CHEST_BOAT, ChestBoatModel::createBodyModel);

        event.registerLayerDefinition(GraviModelLayers.ENCHANTED_BOAT, BoatModel::createBodyModel);
        event.registerLayerDefinition(GraviModelLayers.ENCHANTED_CHEST_BOAT, ChestBoatModel::createBodyModel);

        event.registerLayerDefinition(GraviModelLayers.BELADON_BOAT, BoatModel::createBodyModel);
        event.registerLayerDefinition(GraviModelLayers.BELADON_CHEST_BOAT, ChestBoatModel::createBodyModel);
    }
}
