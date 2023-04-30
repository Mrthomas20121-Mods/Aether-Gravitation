package mrthomas20121.gravitation.data;

import com.aetherteam.aether.data.resources.builders.AetherPlacedFeatureBuilders;
import mrthomas20121.gravitation.Gravitation;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraft.world.level.levelgen.placement.RarityFilter;

import java.util.List;

public class GraviPlacedFeatures {

    public static final ResourceKey<PlacedFeature> ENCHANTED_MEADOW_TREES_PLACEMENT = createKey("enchanted_tree");

    private static ResourceKey<PlacedFeature> createKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(Gravitation.MOD_ID, name));
    }

    public static void bootstrap(BootstapContext<PlacedFeature> context) {

        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, ENCHANTED_MEADOW_TREES_PLACEMENT, configuredFeatures.getOrThrow(GraviConfiguredFeatures.ENCHANTED_TREE_CONFIGURATION),
                AetherPlacedFeatureBuilders.treePlacement(RarityFilter.onAverageOnceEvery(1)));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration, PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}
