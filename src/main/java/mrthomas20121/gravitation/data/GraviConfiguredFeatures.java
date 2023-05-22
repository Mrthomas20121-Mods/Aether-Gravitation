package mrthomas20121.gravitation.data;

import com.aetherteam.aether.AetherTags;
import com.aetherteam.aether.block.AetherBlocks;
import com.aetherteam.aether.data.resources.AetherFeatureStates;
import mrthomas20121.gravitation.block.GraviBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BushFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FancyFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.FancyTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockStateMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;
import java.util.OptionalInt;
import java.util.function.Supplier;

public class GraviConfiguredFeatures {

    public static final RuleTest ICESTONE = new BlockStateMatchTest(AetherFeatureStates.ICESTONE);
    public static final RuleTest HOLYSTONE = new TagMatchTest(AetherTags.Blocks.HOLYSTONE);

    public static final ResourceKey<ConfiguredFeature<?, ?>> ENCHANTED_TREE_CONFIGURATION = createKey("enchanted_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SMALL_ENCHANTED_TREE_CONFIGURATION = createKey("small_enchanted_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BRONZITE_ORE = createKey("bronzite_ore");

    private static ResourceKey<ConfiguredFeature<?, ?>> createKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation("gravitation", name));
    }

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        register(context, BRONZITE_ORE, Feature.ORE, new OreConfiguration(List.of(OreConfiguration.target(ICESTONE, GraviBlocks.BRONZITE_ICESTONE_ORE.get().defaultBlockState()), OreConfiguration.target(HOLYSTONE, GraviBlocks.BRONZITE_ORE.get().defaultBlockState())), 8));
        register(context, ENCHANTED_TREE_CONFIGURATION, Feature.TREE, createEnchanted().dirt(BlockStateProvider.simple(AetherBlocks.AETHER_DIRT.get())).build());
        register(context, SMALL_ENCHANTED_TREE_CONFIGURATION, Feature.TREE, createBush(GraviBlocks.ENCHANTED_LEAVES, GraviBlocks.ENCHANTED_LOG).dirt(BlockStateProvider.simple(AetherBlocks.AETHER_DIRT.get())).build());
    }

    private static TreeConfiguration.TreeConfigurationBuilder createEnchanted() {
        return createStraightBlobTree(GraviBlocks.ENCHANTED_LOG.get(), GraviBlocks.ENCHANTED_LEAVES.get(), 5, 3, 0, 3).ignoreVines();
    }

    private static TreeConfiguration.TreeConfigurationBuilder createBush(Supplier<Block> leaves, Supplier<RotatedPillarBlock> log) {
        return new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(log.get()), new StraightTrunkPlacer(1, 0, 0), BlockStateProvider.simple(leaves.get()), new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 2), new TwoLayersFeatureSize(0, 0, 0)).ignoreVines();
    }

    private static TreeConfiguration.TreeConfigurationBuilder createStraightBlobTree(Block p_195147_, Block p_195148_, int p_195149_, int p_195150_, int p_195151_, int p_195152_) {
        return new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(p_195147_), new StraightTrunkPlacer(p_195149_, p_195150_, p_195151_), BlockStateProvider.simple(p_195148_), new BlobFoliagePlacer(ConstantInt.of(p_195152_), ConstantInt.of(0), 3), new TwoLayersFeatureSize(1, 0, 1));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
