package mrthomas20121.gravitation.data;

import com.aetherteam.aether.AetherTags;
import com.aetherteam.aether.block.AetherBlocks;
import com.aetherteam.aether.data.resources.AetherFeatureStates;
import com.google.common.collect.ImmutableList;
import mrthomas20121.gravitation.block.GraviBlocks;
import mrthomas20121.gravitation.world.foliageplacer.AerfinFoliagePlacer;
import mrthomas20121.gravitation.world.foliageplacer.EnchantedFoliagePlacer;
import mrthomas20121.gravitation.world.treedecorator.GraviAlterGroundDecorator;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.*;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockStateMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class GravitationConfiguredFeatures {

    public static final RuleTest ICESTONE = new BlockStateMatchTest(AetherFeatureStates.ICESTONE);
    public static final RuleTest HOLYSTONE = new TagMatchTest(AetherTags.Blocks.HOLYSTONE);

    public static final ResourceKey<ConfiguredFeature<?, ?>> AERFIN_TREE_CONFIGURATION = createKey("aerfin_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLUE_AERFIN_TREE_CONFIGURATION = createKey("blue_aerfin_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GOLDEN_AERFIN_TREE_CONFIGURATION = createKey("golden_aerfin_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BELADON_TREE_CONFIGURATION = createKey("beladon_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ENCHANTED_TREE_CONFIGURATION = createKey("enchanted_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BRONZITE_ORE = createKey("bronzite_ore");

    private static ResourceKey<ConfiguredFeature<?, ?>> createKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation("gravitation", name));
    }

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        register(context, BRONZITE_ORE, Feature.ORE, new OreConfiguration(
                List.of(
                        OreConfiguration.target(ICESTONE, GraviBlocks.BRONZITE_ICESTONE_ORE.get().defaultBlockState()),
                        OreConfiguration.target(HOLYSTONE, GraviBlocks.BRONZITE_ORE.get().defaultBlockState())), 8));
        register(context, AERFIN_TREE_CONFIGURATION, Feature.TREE, createAerfin().dirt(BlockStateProvider.simple(AetherBlocks.AETHER_DIRT.get())).build());
        register(context, BLUE_AERFIN_TREE_CONFIGURATION, Feature.TREE, createBlueAerfin().dirt(BlockStateProvider.simple(AetherBlocks.AETHER_DIRT.get()))
                .decorators(ImmutableList.of(new GraviAlterGroundDecorator(BlockStateProvider.simple(GraviBlocks.AER_GRASS.get())))).build());
        register(context, GOLDEN_AERFIN_TREE_CONFIGURATION, Feature.TREE, createGoldenAerfin().dirt(BlockStateProvider.simple(AetherBlocks.AETHER_DIRT.get()))
                .decorators(ImmutableList.of(new GraviAlterGroundDecorator(BlockStateProvider.simple(GraviBlocks.ENCHANTED_MOSS.get())))).build());
        register(context, BELADON_TREE_CONFIGURATION, Feature.TREE, createBeladon().dirt(BlockStateProvider.simple(AetherBlocks.AETHER_DIRT.get())).build());
        register(context, ENCHANTED_TREE_CONFIGURATION, Feature.TREE, createEnchanted().dirt(BlockStateProvider.simple(AetherBlocks.AETHER_DIRT.get())).build());
    }

    private static TreeConfiguration.TreeConfigurationBuilder createEnchanted() {
        return createEnchantedTree(GraviBlocks.ENCHANTED_LOG.get(), GraviBlocks.ENCHANTED_LEAVES.get(), 4, 3, 1).ignoreVines();
    }

    private static TreeConfiguration.TreeConfigurationBuilder createBeladon() {
        return createStraightBlobTree(GraviBlocks.BELADON_LOG.get(), GraviBlocks.BELADON_LEAVES.get(), 3, 2, 2, 3).ignoreVines();
    }

    private static TreeConfiguration.TreeConfigurationBuilder createBlueAerfin() {
        return createAerfinBase(GraviBlocks.AERFIN_LOG.get(), GraviBlocks.BLUE_AERFIN_LEAVES.get(), 6, 0, 2).ignoreVines();
    }

    private static TreeConfiguration.TreeConfigurationBuilder createGoldenAerfin() {
        return createAerfinBase(GraviBlocks.AERFIN_LOG.get(), GraviBlocks.GOLDEN_AERFIN_LEAVES.get(), 8, 1, 2).ignoreVines();
    }

    private static TreeConfiguration.TreeConfigurationBuilder createAerfin() {
        return createAerfinBase(GraviBlocks.AERFIN_LOG.get(), GraviBlocks.AERFIN_LEAVES.get(), 4, 2, 2).ignoreVines();
    }

    private static TreeConfiguration.TreeConfigurationBuilder createAerfinBase(Block p_195147_, Block p_195148_, int baseHeight, int heightRandA, int heightRandB) {
        return new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(p_195147_), new StraightTrunkPlacer(baseHeight, heightRandA, heightRandB), BlockStateProvider.simple(p_195148_), new AerfinFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), UniformInt.of(4, 8)), new TwoLayersFeatureSize(2, 0, 2));
    }

    private static TreeConfiguration.TreeConfigurationBuilder createStraightBlobTree(Block p_195147_, Block p_195148_, int p_195149_, int p_195150_, int p_195151_, int p_195152_) {
        return new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(p_195147_), new StraightTrunkPlacer(p_195149_, p_195150_, p_195151_), BlockStateProvider.simple(p_195148_), new AcaciaFoliagePlacer(ConstantInt.of(p_195152_), ConstantInt.of(0)), new TwoLayersFeatureSize(1, 0, 1));
    }

    private static TreeConfiguration.TreeConfigurationBuilder createEnchantedTree(Block p_195147_, Block p_195148_, int p_195149_, int p_195150_, int p_195151_) {
        return new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(p_195147_), new StraightTrunkPlacer(p_195149_, p_195150_, p_195151_), BlockStateProvider.simple(p_195148_), new EnchantedFoliagePlacer(ConstantInt.of(2), ConstantInt.of(3), UniformInt.of(3, 4)), new TwoLayersFeatureSize(2, 0, 2));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
