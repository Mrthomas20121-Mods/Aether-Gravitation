package mrthomas20121.gravitation.client;

import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.block.wood.GraviWoodType;
import net.minecraft.client.renderer.Sheets;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Gravitation.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class GravitationClient {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(GraviModelPredicate::init);

        event.enqueueWork(() -> {
            Sheets.addWoodType(GraviWoodType.AERFIN);
            Sheets.addWoodType(GraviWoodType.BELADON);
            Sheets.addWoodType(GraviWoodType.ENCHANTED);
        });
    }
}
