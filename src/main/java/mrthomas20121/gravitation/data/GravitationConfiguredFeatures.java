package mrthomas20121.gravitation.data;

import com.aetherteam.aether.AetherTags;
import com.aetherteam.aether.block.AetherBlocks;
import com.aetherteam.aether.data.resources.AetherFeatureStates;
import com.aetherteam.aether.data.resources.builders.AetherConfiguredFeatureBuilders;
import com.aetherteam.aether.world.feature.AetherFeatures;
import com.google.common.collect.ImmutableList;
import mrthomas20121.gravitation.block.GravitationBlocks;
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

    public static final ResourceKey<ConfiguredFeature<?, ?>> ICY_AERCLOUD_CONFIGURATION = createKey("icy_aercloud");
    public static final ResourceKey<ConfiguredFeature<?, ?>> AERFIN_TREE_CONFIGURATION = createKey("aerfin_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORANGE_AERFIN_TREE_CONFIGURATION = createKey("orange_aerfin_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BELADON_TREE_CONFIGURATION = createKey("beladon_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ENCHANTED_TREE_CONFIGURATION = createKey("enchanted_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BRONZITE_ORE = createKey("bronzite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CONGLOMERATE_ORE = createKey("conglomerate_ore");

    private static ResourceKey<ConfiguredFeature<?, ?>> createKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation("gravitation", name));
    }

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {

        register(context, ICY_AERCLOUD_CONFIGURATION, AetherFeatures.AERCLOUD.get(), AetherConfiguredFeatureBuilders.aercloud(12, GravitationFeatureStates.ICY_AERCLOUD));

        register(context, BRONZITE_ORE, Feature.ORE, new OreConfiguration(List.of(
                        OreConfiguration.target(HOLYSTONE, GravitationBlocks.BRONZITE_ORE.get().defaultBlockState())), 8));
        register(context, CONGLOMERATE_ORE, Feature.ORE, new OreConfiguration(new TagMatchTest(AetherTags.Blocks.HOLYSTONE), GravitationBlocks.CONGLOMERATE.get().defaultBlockState(), 32));
        register(context, AERFIN_TREE_CONFIGURATION, Feature.TREE,
                createAerfin(4, GravitationBlocks.AERFIN_LEAVES.get()).dirt(BlockStateProvider.simple(AetherBlocks.AETHER_DIRT.get())).build());
        register(context, ORANGE_AERFIN_TREE_CONFIGURATION, Feature.TREE,
                createAerfin(5, GravitationBlocks.ORANGE_AERFIN_LEAVES.get()).dirt(BlockStateProvider.simple(AetherBlocks.AETHER_DIRT.get())).build());
        register(context, BELADON_TREE_CONFIGURATION, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(GravitationBlocks.BELADON_LOG.get().defaultBlockState()),
                new StraightTrunkPlacer(5, 2, 0),
                BlockStateProvider.simple(GravitationBlocks.BELADON_LEAVES.get().defaultBlockState()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, ENCHANTED_TREE_CONFIGURATION, Feature.TREE, createEnchanted().dirt(BlockStateProvider.simple(AetherBlocks.AETHER_DIRT.get()))
                .decorators(ImmutableList.of(new GraviAlterGroundDecorator(BlockStateProvider.simple(AetherBlocks.ENCHANTED_AETHER_GRASS_BLOCK.get())))).build());
    }

    private static TreeConfiguration.TreeConfigurationBuilder createEnchanted() {
        return createEnchantedTree(GravitationBlocks.ENCHANTED_LOG.get(), GravitationBlocks.ENCHANTED_LEAVES.get(), 4, 3, 1).ignoreVines();
    }

    private static TreeConfiguration.TreeConfigurationBuilder createAerfin(int height, Block leaves) {
        return createAerfinBase(GravitationBlocks.AERFIN_LOG.get(), leaves, height, 1, 2).ignoreVines();
    }

    private static TreeConfiguration.TreeConfigurationBuilder createAerfinBase(Block p_195147_, Block p_195148_, int baseHeight, int heightRandA, int heightRandB) {
        return new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(p_195147_), new StraightTrunkPlacer(baseHeight, heightRandA, heightRandB), BlockStateProvider.simple(p_195148_), new AerfinFoliagePlacer(ConstantInt.of(2), ConstantInt.of(2), UniformInt.of(3, 4)), new TwoLayersFeatureSize(2, 0, 2));
    }

    private static TreeConfiguration.TreeConfigurationBuilder createEnchantedTree(Block p_195147_, Block p_195148_, int p_195149_, int p_195150_, int p_195151_) {
        return new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(p_195147_), new StraightTrunkPlacer(p_195149_, p_195150_, p_195151_), BlockStateProvider.simple(p_195148_), new EnchantedFoliagePlacer(ConstantInt.of(2), ConstantInt.of(3), UniformInt.of(3, 4)), new TwoLayersFeatureSize(2, 0, 2));
    }

    private static TreeConfiguration.TreeConfigurationBuilder createStraightBlobTree(Block p_195147_, Block p_195148_, int p_195149_, int p_195150_, int p_195151_, int p_195152_) {
        return new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(p_195147_), new StraightTrunkPlacer(p_195149_, p_195150_, p_195151_), BlockStateProvider.simple(p_195148_), new BlobFoliagePlacer(ConstantInt.of(p_195152_), ConstantInt.of(0), 3), new TwoLayersFeatureSize(1, 0, 1));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
