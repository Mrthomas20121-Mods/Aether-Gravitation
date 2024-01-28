package mrthomas20121.gravitation.world.treegrower;

import com.aetherteam.aether.data.resources.registries.AetherConfiguredFeatures;
import mrthomas20121.gravitation.data.GraviConfiguredFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

import javax.annotation.Nullable;

public class EnchantedTree extends AbstractTreeGrower {
    public EnchantedTree() {
    }

    @Nullable
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource random, boolean largeHive) {
        return GraviConfiguredFeatures.ENCHANTED_TREE_CONFIGURATION;
    }
}