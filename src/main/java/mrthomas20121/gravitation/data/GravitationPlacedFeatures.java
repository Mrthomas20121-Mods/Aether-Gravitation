package mrthomas20121.gravitation.data;

import com.aetherteam.aether.data.resources.builders.AetherPlacedFeatureBuilders;
import com.aetherteam.aether.world.placementmodifier.DungeonBlacklistFilter;
import com.aetherteam.aether.world.placementmodifier.ImprovedLayerPlacementModifier;
import com.aetherteam.nitrogen.data.resources.builders.NitrogenPlacedFeatureBuilders;
import com.google.common.collect.ImmutableList;
import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.block.GravitationBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.features.VegetationFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class GravitationPlacedFeatures {

    public static final ResourceKey<PlacedFeature> AERFIN_FOREST_PLACEMENT = createKey("aerfin_forest_placement");
    public static final ResourceKey<PlacedFeature> UNDERGROWTH_PLACEMENT = createKey("beladon_undergrowth_placement");
    public static final ResourceKey<PlacedFeature> TREE_AERFIN_AND_ORANGE_AERFIN_CONFIGURATION = createKey("tree_aerfin_and_orange_aerfin_configuration");
    public static final ResourceKey<PlacedFeature> TREE_BELATON_AND_ENCHANTED_CONFIGURATION = createKey("tree_belaton_and_enchanted_configuration");
    public static final ResourceKey<PlacedFeature> BRONZITE_ORE_PLACEMENT = createKey("bronzite_ore");
    public static final ResourceKey<PlacedFeature> LARGE_BRONZITE_ORE_PLACEMENT = createKey("large_bronzite_ore");
    public static final ResourceKey<PlacedFeature> FROZEN_AETHER_GRASS_BONEMEAL = createKey("frozen_aether_grass_bonemeal");
    public static final ResourceKey<PlacedFeature> ICY_AERCLOUD_PLACEMENT = createKey("icy_aercloud");
    public static final ResourceKey<PlacedFeature> CONGLOMERATE_PLACEMENT = createKey("conglomerate_placement");
    public static final ResourceKey<PlacedFeature> BLACK_BERRY_BUSH_PATCH_PLACEMENT = createKey("black_berry_bush_patch");

    private static ResourceKey<PlacedFeature> createKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(Gravitation.MOD_ID, name));
    }

    public static void bootstrap(BootstapContext<PlacedFeature> context) {

        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, BLACK_BERRY_BUSH_PATCH_PLACEMENT, configuredFeatures.getOrThrow(GravitationConfiguredFeatures.BLACK_BERRY_BUSH_PATCH_CONFIGURATION),
                RarityFilter.onAverageOnceEvery(8),
                ImprovedLayerPlacementModifier.of(Heightmap.Types.MOTION_BLOCKING, UniformInt.of(0, 1), 4),
                BiomeFilter.biome());

        register(context, ICY_AERCLOUD_PLACEMENT, configuredFeatures.getOrThrow(GravitationConfiguredFeatures.ICY_AERCLOUD_CONFIGURATION), AetherPlacedFeatureBuilders.aercloudPlacement(32, 64, 10));

        register(context, FROZEN_AETHER_GRASS_BONEMEAL, configuredFeatures.getOrThrow(VegetationFeatures.SINGLE_PIECE_OF_GRASS),
                PlacementUtils.isEmpty());

        register(context, CONGLOMERATE_PLACEMENT, configuredFeatures.getOrThrow(GravitationConfiguredFeatures.CONGLOMERATE_ORE),
                NitrogenPlacedFeatureBuilders.commonOrePlacement(8, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(90))));

        register(context, BRONZITE_ORE_PLACEMENT, configuredFeatures.getOrThrow(GravitationConfiguredFeatures.BRONZITE_ORE),
                NitrogenPlacedFeatureBuilders.commonOrePlacement(12, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(75))));

        register(context, LARGE_BRONZITE_ORE_PLACEMENT, configuredFeatures.getOrThrow(GravitationConfiguredFeatures.BRONZITE_ORE),
                NitrogenPlacedFeatureBuilders.commonOrePlacement(20, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(128))));

        register(context, AERFIN_FOREST_PLACEMENT, configuredFeatures.getOrThrow(GravitationConfiguredFeatures.TREE_AERFIN_AND_ORANGE_AERFIN_CONFIGURATION),
                AetherPlacedFeatureBuilders.treePlacement(PlacementUtils.countExtra(6, 0.1F, 1)));

        register(context, UNDERGROWTH_PLACEMENT, configuredFeatures.getOrThrow(GravitationConfiguredFeatures.TREE_BELATON_AND_ENCHANTED_CONFIGURATION),
                AetherPlacedFeatureBuilders.treePlacement(PlacementUtils.countExtra(6, 0.1F, 1)));
    }

    public static List<PlacementModifier> treePlacement(PlacementModifier count) {
        return treePlacementBase(count).add(BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(GravitationBlocks.AERFIN_SAPLING.get().defaultBlockState(), BlockPos.ZERO))).add(BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(GravitationBlocks.BELADON_SAPLING.get().defaultBlockState(), BlockPos.ZERO))).add(BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(GravitationBlocks.ENCHANTED_SAPLING.get().defaultBlockState(), BlockPos.ZERO))).build();
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
