package mrthomas20121.gravitation.client;

import com.aetherteam.aether.inventory.menu.LoreBookMenu;
import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.block.wood.GraviWoodType;
import mrthomas20121.gravitation.enchanting.GravitationEnchantments;
import mrthomas20121.gravitation.item.GravitationItems;
import mrthomas20121.gravitation.particle.AerfinParticle;
import mrthomas20121.gravitation.particle.GraviParticleTypes;
import net.minecraft.client.particle.CherryParticle;
import net.minecraft.client.renderer.Sheets;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
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

        // LoreBookMenu.addLoreEntryOverride(stack -> stack.getEnchantmentLevel(GravitationEnchantments.HERCULES_STRENGTH.get()) > 0, "lore.gravitation.hercules_strength");
        // LoreBookMenu.addLoreEntryOverride(stack -> stack.getEnchantmentLevel(GravitationEnchantments.NEPTUNE_WRATH.get()) > 0, "lore.gravitation.neptune_wrath");
    }

    @SubscribeEvent
    public static void registerParticle(RegisterParticleProvidersEvent event) {
        event.registerSpriteSet(GraviParticleTypes.BLUE_AERFIN_LEAVES.get(), (p_277215_) -> (p_277217_, p_277218_, p_277219_, p_277220_, p_277221_, p_277222_, p_277223_, p_277224_) ->
                new AerfinParticle(p_277218_, p_277219_, p_277220_, p_277221_, p_277215_));
        event.registerSpriteSet(GraviParticleTypes.GOLDEN_AERFIN_LEAVES.get(), (p_277215_) -> (p_277217_, p_277218_, p_277219_, p_277220_, p_277221_, p_277222_, p_277223_, p_277224_) ->
                new AerfinParticle(p_277218_, p_277219_, p_277220_, p_277221_, p_277215_));
    }
}
