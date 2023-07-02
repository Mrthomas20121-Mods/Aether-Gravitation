package mrthomas20121.gravitation.data;

import com.aetherteam.aether.AetherTags;
import com.aetherteam.aether.block.AetherBlocks;
import com.aetherteam.aether.data.resources.builders.AetherPlacedFeatureBuilders;
import com.aetherteam.aether.data.resources.registries.AetherConfiguredFeatures;
import com.aetherteam.aether.world.placementmodifier.DungeonBlacklistFilter;
import com.aetherteam.aether.world.placementmodifier.ImprovedLayerPlacementModifier;
import com.google.common.collect.ImmutableList;
import mrthomas20121.gravitation.GraviTags;
import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.block.GraviBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class GraviPlacedFeatures {

    public static final ResourceKey<PlacedFeature> ENCHANTED_TREES_PLACEMENT = createKey("enchanted_tree");
    public static final ResourceKey<PlacedFeature> SMALL_ENCHANTED_TREES_PLACEMENT = createKey("small_enchanted_tree");
    public static final ResourceKey<PlacedFeature> BRONZITE_ORE_PLACEMENT = createKey("bronzite_ore");

    private static ResourceKey<PlacedFeature> createKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(Gravitation.MOD_ID, name));
    }

    public static void bootstrap(BootstapContext<PlacedFeature> context) {

        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, ENCHANTED_TREES_PLACEMENT, configuredFeatures.getOrThrow(GraviConfiguredFeatures.ENCHANTED_TREE_CONFIGURATION),
                treePlacement(PlacementUtils.countExtra(5, 0.1F, 1)));

        register(context, SMALL_ENCHANTED_TREES_PLACEMENT, configuredFeatures.getOrThrow(GraviConfiguredFeatures.SMALL_ENCHANTED_TREE_CONFIGURATION),
                treePlacement(PlacementUtils.countExtra(1, 0.1F, 1)));

        register(context, BRONZITE_ORE_PLACEMENT, configuredFeatures.getOrThrow(GraviConfiguredFeatures.BRONZITE_ORE),
                AetherPlacedFeatureBuilders.commonOrePlacement(12, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(75))));
    }

    public static List<PlacementModifier> treePlacement(PlacementModifier count) {
        return treePlacementBase(count).add(BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(GraviBlocks.ENCHANTED_SAPLING.get().defaultBlockState(), BlockPos.ZERO))).build();
    }

    private static ImmutableList.Builder<PlacementModifier> treePlacementBase(PlacementModifier count) {
        return ImmutableList.<PlacementModifier>builder().add(count).add(SurfaceWaterDepthFilter.forMaxDepth(0)).add(ImprovedLayerPlacementModifier.of(Heightmap.Types.OCEAN_FLOOR, UniformInt.of(0, 1), 4)).add(BiomeFilter.biome()).add(new DungeonBlacklistFilter());
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration, PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}
