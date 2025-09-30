package mrthomas20121.gravitation.client;

import com.aetherteam.aether.mixin.mixins.client.accessor.BlockColorsAccessor;
import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.block.GravitationBlocks;
import mrthomas20121.gravitation.block.wood.GraviWoodType;
import mrthomas20121.gravitation.particle.AerfinParticle;
import mrthomas20121.gravitation.particle.GraviParticleTypes;
import net.minecraft.client.color.block.BlockColor;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DoublePlantBlock;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.HashMap;
import java.util.Map;

@Mod.EventBusSubscriber(modid = Gravitation.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class GravitationClient {

    private static final int FROZEN_AETHER_GRASS_COLOR = 0xA1D2EA;

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(GraviModelPredicate::init);

        event.enqueueWork(() -> {
            Sheets.addWoodType(GraviWoodType.AERFIN);
            Sheets.addWoodType(GraviWoodType.BELADON);
            Sheets.addWoodType(GraviWoodType.ENCHANTED);
        });

        //MinecraftForge.EVENT_BUS.register(new CuriosClientEventHandler());

        // LoreBookMenu.addLoreEntryOverride(stack -> stack.getEnchantmentLevel(GravitationEnchantments.HERCULES_STRENGTH.get()) > 0, "lore.gravitation.hercules_strength");
        // LoreBookMenu.addLoreEntryOverride(stack -> stack.getEnchantmentLevel(GravitationEnchantments.NEPTUNE_WRATH.get()) > 0, "lore.gravitation.neptune_wrath");
    }

    @SubscribeEvent
    public static void registerParticle(RegisterParticleProvidersEvent event) {
        event.registerSpriteSet(GraviParticleTypes.ORANGE_AERFIN_LEAVES.get(), (p_277215_) -> (p_277217_, p_277218_, p_277219_, p_277220_, p_277221_, p_277222_, p_277223_, p_277224_) ->
                new AerfinParticle(p_277218_, p_277219_, p_277220_, p_277221_, p_277215_));
    }

    @SubscribeEvent
    static void registerBlockColor(RegisterColorHandlersEvent.Block event) {
        Map<Block, BlockColor> map = new HashMap<>();
        Map<Holder.Reference<Block>, BlockColor> blockColors = ((BlockColorsAccessor) event.getBlockColors()).aether$getBlockColors();
        map.put(Blocks.GRASS, blockColors.get(ForgeRegistries.BLOCKS.getDelegateOrThrow(Blocks.GRASS)));
        map.put(Blocks.FERN, blockColors.get(ForgeRegistries.BLOCKS.getDelegateOrThrow(Blocks.FERN)));
        map.put(Blocks.TALL_GRASS, blockColors.get(ForgeRegistries.BLOCKS.getDelegateOrThrow(Blocks.TALL_GRASS)));
        map.put(Blocks.LARGE_FERN, blockColors.get(ForgeRegistries.BLOCKS.getDelegateOrThrow(Blocks.LARGE_FERN)));

        for (Map.Entry<Block, BlockColor> entry : map.entrySet()) { // Recolors tintable plants when placed on Aether Grass and Enchanted Grass.
            event.register(((state, level, pos, tintIndex) -> {
                if (level != null && pos != null) {
                    BlockPos newPos = state.hasProperty(DoublePlantBlock.HALF) ? (state.getValue(DoublePlantBlock.HALF) == DoubleBlockHalf.UPPER ? pos.below() : pos) : pos;
                    BlockPos baseBlock = newPos.below();
                    if (level.getBlockState(baseBlock).is(GravitationBlocks.FROZEN_AETHER_GRASS_BLOCK.get())) {
                        return FROZEN_AETHER_GRASS_COLOR;
                    }
                }
                return entry.getValue().getColor(state, level, pos, tintIndex);
            }), entry.getKey());
        }
    }
}
