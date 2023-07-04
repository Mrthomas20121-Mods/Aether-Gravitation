package mrthomas20121.gravitation.world.biome;

import com.aetherteam.aether.block.AetherBlocks;
import net.minecraft.world.level.levelgen.Noises;
import net.minecraft.world.level.levelgen.SurfaceRules;

public class GravitationSurfaceData {

    public static SurfaceRules.RuleSource rules() {
        return SurfaceRules.sequence(
                SurfaceRules.ifTrue(SurfaceRules.isBiome(GravitationBiomes.ENCHANTED_FOREST),
                        SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR,
                                SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.SWAMP, 0.1D),
                                        SurfaceRules.state(AetherBlocks.HOLYSTONE.get().defaultBlockState())))),
                SurfaceRules.ifTrue(SurfaceRules.isBiome(GravitationBiomes.ENCHANTED_SHORE),
                        SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR,
                                SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.SWAMP, 0.1D),
                                        SurfaceRules.state(AetherBlocks.HOLYSTONE.get().defaultBlockState())))),
                SurfaceRules.ifTrue(SurfaceRules.isBiome(GravitationBiomes.GOLDEN_ENCHANTED_FOREST),
                        SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR,
                                SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.SWAMP, 0.1D),
                                        SurfaceRules.state(AetherBlocks.HOLYSTONE.get().defaultBlockState())))),
                SurfaceRules.ifTrue(SurfaceRules.isBiome(GravitationBiomes.GOLDEN_MOUNTAIN),
                        SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR,
                                SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.SWAMP, 0.1D),
                                        SurfaceRules.state(AetherBlocks.HOLYSTONE.get().defaultBlockState())))),
                SurfaceRules.ifTrue(SurfaceRules.isBiome(GravitationBiomes.GOLDEN_MOUNTAIN),
                        SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR,
                                SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.VEGETATION, 0.1D),
                                        SurfaceRules.state(AetherBlocks.ENCHANTED_AETHER_GRASS_BLOCK.get().defaultBlockState()))))
        );
    }
}
