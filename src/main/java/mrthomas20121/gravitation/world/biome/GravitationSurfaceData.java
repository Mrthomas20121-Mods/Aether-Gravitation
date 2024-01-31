package mrthomas20121.gravitation.world.biome;

import com.aetherteam.aether.block.AetherBlocks;
import mrthomas20121.gravitation.block.GravitationBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.Noises;
import net.minecraft.world.level.levelgen.SurfaceRules;

public class GravitationSurfaceData {

    private static SurfaceRules.RuleSource makeStateRule(Block block) {
        return SurfaceRules.state(block.defaultBlockState());
    }

    public static SurfaceRules.RuleSource rules() {

        SurfaceRules.RuleSource holystone = makeStateRule(AetherBlocks.HOLYSTONE.get());
        SurfaceRules.RuleSource grass = makeStateRule(AetherBlocks.AETHER_GRASS_BLOCK.get());

        return SurfaceRules.sequence(
                SurfaceRules.ifTrue(SurfaceRules.isBiome(GravitationBiomes.ENCHANTED_FOREST),
                        SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR,
                                SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.SWAMP, 0.1D),
                                        SurfaceRules.state(AetherBlocks.HOLYSTONE.get().defaultBlockState())))),
                SurfaceRules.ifTrue(SurfaceRules.isBiome(GravitationBiomes.BELADON_PLAINS),
                        SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR,
                                SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.SWAMP, -0.1D, 0.1d),
                                        makeStateRule(GravitationBlocks.AER_GRASS.get())))),
                SurfaceRules.ifTrue(
                        SurfaceRules.isBiome(GravitationBiomes.GOLDEN_MOUNTAIN),
                        SurfaceRules.sequence(
                                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.POWDER_SNOW, -0.2d, 0.2d), grass)),
                                holystone
                        )
                )
        );
    }
}
