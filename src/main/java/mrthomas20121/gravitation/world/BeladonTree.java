package mrthomas20121.gravitation.world;

import mrthomas20121.gravitation.data.GraviConfiguredFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

import javax.annotation.Nullable;

public class BeladonTree extends AbstractTreeGrower {
    public BeladonTree() {
    }

    @Nullable
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource random, boolean largeHive) {
        return GraviConfiguredFeatures.BELADON_TREE_CONFIGURATION;
    }
}