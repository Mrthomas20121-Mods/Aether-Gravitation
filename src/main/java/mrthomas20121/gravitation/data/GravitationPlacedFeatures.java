package mrthomas20121.gravitation.data;

import com.aetherteam.aether.data.resources.registries.AetherConfiguredFeatures;
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
    public static final ResourceKey<PlacedFeature> BLUE_AERFIN_FOREST_PLACEMENT = createKey("blue_aerfin_forest_placement");
    public static final ResourceKey<PlacedFeature> GOLDEN_AERFIN_FOREST_PLACEMENT = createKey("golden_aerfin_forest_placement");
    public static final ResourceKey<PlacedFeature> BELADON_FOREST_PLACEMENT = createKey("beladon_forest_placement");
    public static final ResourceKey<PlacedFeature> BELADON_PLAINS_PLACEMENT = createKey("beladon_plains");
    public static final ResourceKey<PlacedFeature> ENCHANTED_TREES_PLACEMENT = createKey("enchanted_tree");
    public static final ResourceKey<PlacedFeature> GOLDEN_ENCHANTED_TREES_PLACEMENT = createKey("golden_enchanted_tree");
    public static final ResourceKey<PlacedFeature> SMALL_ENCHANTED_TREES_PLACEMENT = createKey("small_enchanted_tree");
    public static final ResourceKey<PlacedFeature> BRONZITE_ORE_PLACEMENT = createKey("bronzite_ore");
    public static final ResourceKey<PlacedFeature> LARGE_BRONZITE_ORE_PLACEMENT = createKey("large_bronzite_ore");
    public static final ResourceKey<PlacedFeature> LARGE_BLUE_AERCLOUD_PLACEMENT = createKey("large_blue_aercloud");

    private static ResourceKey<PlacedFeature> createKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(Gravitation.MOD_ID, name));
    }

    public static void bootstrap(BootstapContext<PlacedFeature> context) {

        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, AERFIN_FOREST_PLACEMENT, configuredFeatures.getOrThrow(GravitationConfiguredFeatures.AERFIN_TREE_CONFIGURATION),
                treePlacement(PlacementUtils.countExtra(3, 0.1F, 2)));

        register(context, BLUE_AERFIN_FOREST_PLACEMENT, configuredFeatures.getOrThrow(GravitationConfiguredFeatures.BLUE_AERFIN_TREE_CONFIGURATION),
                treePlacement(PlacementUtils.countExtra(2, 0.1F, 1)));

        register(context, GOLDEN_AERFIN_FOREST_PLACEMENT, configuredFeatures.getOrThrow(GravitationConfiguredFeatures.GOLDEN_AERFIN_TREE_CONFIGURATION),
                treePlacement(PlacementUtils.countExtra(2, 0.1F, 1)));

        register(context, BELADON_FOREST_PLACEMENT, configuredFeatures.getOrThrow(GravitationConfiguredFeatures.BELADON_TREE_CONFIGURATION),
                treePlacement(PlacementUtils.countExtra(2, 0.1F, 2)));

        register(context, BELADON_PLAINS_PLACEMENT, configuredFeatures.getOrThrow(GravitationConfiguredFeatures.BELADON_TREE_CONFIGURATION),
                treePlacement(PlacementUtils.countExtra(1, 0.1F, 1)));

        register(context, ENCHANTED_TREES_PLACEMENT, configuredFeatures.getOrThrow(GravitationConfiguredFeatures.ENCHANTED_TREE_CONFIGURATION),
                treePlacement(PlacementUtils.countExtra(4, 0.01F, 3)));

        register(context, GOLDEN_ENCHANTED_TREES_PLACEMENT, configuredFeatures.getOrThrow(AetherConfiguredFeatures.GOLDEN_OAK_TREE_CONFIGURATION),
                treePlacement(PlacementUtils.countExtra(2, 0.1F, 1)));

        register(context, SMALL_ENCHANTED_TREES_PLACEMENT, configuredFeatures.getOrThrow(GravitationConfiguredFeatures.ENCHANTED_TREE_CONFIGURATION),
                treePlacement(PlacementUtils.countExtra(1, 0.1F, 1)));

        register(context, LARGE_BLUE_AERCLOUD_PLACEMENT, configuredFeatures.getOrThrow(AetherConfiguredFeatures.BLUE_AERCLOUD_CONFIGURATION),
                treePlacement(PlacementUtils.countExtra(1, 0.1F, 1)));

        register(context, BRONZITE_ORE_PLACEMENT, configuredFeatures.getOrThrow(GravitationConfiguredFeatures.BRONZITE_ORE),
                NitrogenPlacedFeatureBuilders.commonOrePlacement(12, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(75))));

        register(context, LARGE_BRONZITE_ORE_PLACEMENT, configuredFeatures.getOrThrow(GravitationConfiguredFeatures.BRONZITE_ORE),
                NitrogenPlacedFeatureBuilders.commonOrePlacement(20, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(128))));
    }

    public static List<PlacementModifier> treePlacement(PlacementModifier count) {
        return treePlacementBase(count).add(BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(GravitationBlocks.BELADON_SAPLING.get().defaultBlockState(), BlockPos.ZERO))).add(BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(GravitationBlocks.ENCHANTED_SAPLING.get().defaultBlockState(), BlockPos.ZERO))).build();
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
