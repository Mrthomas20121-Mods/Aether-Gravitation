package mrthomas20121.gravitation.world.biome;

import com.aetherteam.aether.block.AetherBlockStateProperties;
import com.aetherteam.aether.block.AetherBlocks;
import mrthomas20121.gravitation.block.GraviBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.Noises;
import net.minecraft.world.level.levelgen.SurfaceRules;

public class GravitationSurfaceData {

    private static SurfaceRules.RuleSource makeStateRule(Block p_194811_) {
        return SurfaceRules.state(p_194811_.defaultBlockState());
    }

    public static SurfaceRules.RuleSource rules() {

        SurfaceRules.RuleSource holystone = makeStateRule(AetherBlocks.HOLYSTONE.get());
        SurfaceRules.RuleSource moss = makeStateRule(GraviBlocks.ENCHANTED_MOSS.get());

        return SurfaceRules.sequence(
                SurfaceRules.ifTrue(SurfaceRules.isBiome(GravitationBiomes.ENCHANTED_FOREST),
                        SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR,
                                SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.SWAMP, 0.1D),
                                        SurfaceRules.state(AetherBlocks.HOLYSTONE.get().defaultBlockState())))),
                SurfaceRules.ifTrue(SurfaceRules.isBiome(GravitationBiomes.ENCHANTED_SHORE),
                        SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR,
                                SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.SWAMP, -0.1D, 0.1d),
                                        SurfaceRules.state(AetherBlocks.HOLYSTONE.get().defaultBlockState())))),
                SurfaceRules.ifTrue(
                        SurfaceRules.isBiome(GravitationBiomes.GOLDEN_MOUNTAIN),
                        SurfaceRules.sequence(
                                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.POWDER_SNOW, -0.2d, 0.2d), moss)),
                                holystone
                        )
                )
        );
    }
}
