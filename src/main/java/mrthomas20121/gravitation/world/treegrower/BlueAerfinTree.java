package mrthomas20121.gravitation.world.treegrower;

import mrthomas20121.gravitation.data.GraviConfiguredFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

import javax.annotation.Nullable;

public class BlueAerfinTree extends AbstractTreeGrower {
    public BlueAerfinTree() {
    }

    @Nullable
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource random, boolean largeHive) {
        return GraviConfiguredFeatures.BLUE_AERFIN_TREE_CONFIGURATION;
    }
}