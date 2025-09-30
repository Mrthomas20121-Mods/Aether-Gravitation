package mrthomas20121.gravitation.world.biome;

import com.aetherteam.aether.block.AetherBlocks;
import com.aetherteam.aether.data.resources.AetherFeatureStates;
import mrthomas20121.gravitation.block.GravitationBlocks;
import mrthomas20121.gravitation.data.GravitationFeatureStates;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.Noises;
import net.minecraft.world.level.levelgen.SurfaceRules;

public class GravitationSurfaceData {

    private static SurfaceRules.RuleSource makeStateRule(Block block) {
        return SurfaceRules.state(block.defaultBlockState());
    }

    public static SurfaceRules.RuleSource rules() {

        //SurfaceRules.RuleSource holystone = makeStateRule(AetherFeatureStates.HOLYSTONE);
        //SurfaceRules.RuleSource grass = makeStateRule(AetherBlocks.AETHER_GRASS_BLOCK.get());

        return SurfaceRules.sequence(
                SurfaceRules.ifTrue(SurfaceRules.isBiome(GravitationBiomes.FROSTED_FOREST),
                        SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR,
                                SurfaceRules.state(GravitationFeatureStates.FROZEN_AETHER_GRASS)))
        );
    }
}
