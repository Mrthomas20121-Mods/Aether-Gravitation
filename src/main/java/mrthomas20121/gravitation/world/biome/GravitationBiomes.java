package mrthomas20121.gravitation.world.biome;

import com.aetherteam.aether.data.resources.builders.AetherBiomeBuilders;
import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.data.GravitationPlacedFeatures;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.carver.ConfiguredWorldCarver;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class GravitationBiomes {

    public static ResourceKey<Biome> FROSTED_FOREST = createKey("frosted_forest");
    public static ResourceKey<Biome> UNDERGROWTH = createKey("undergrowth");

    private static ResourceKey<Biome> createKey(String name) {
        return ResourceKey.create(Registries.BIOME, new ResourceLocation(Gravitation.MOD_ID, name));
    }

    public static void bootstrap(BootstapContext<Biome> context) {
        HolderGetter<PlacedFeature> placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        HolderGetter<ConfiguredWorldCarver<?>> vanillaConfiguredCarvers = context.lookup(Registries.CONFIGURED_CARVER);
        context.register(UNDERGROWTH, undergrowth(placedFeatures, vanillaConfiguredCarvers));
        context.register(FROSTED_FOREST, frostedForest(placedFeatures, vanillaConfiguredCarvers));
    }

    public static Biome frostedForest(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<ConfiguredWorldCarver<?>> worldCarvers) {
        return makeAetherDefaultBiome(new BiomeGenerationSettings.Builder(placedFeatures, worldCarvers)
                .addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, GravitationPlacedFeatures.AERFIN_FOREST_PLACEMENT)
                .addFeature(GenerationStep.Decoration.TOP_LAYER_MODIFICATION, GravitationPlacedFeatures.ICY_AERCLOUD_PLACEMENT));
    }

    public static Biome undergrowth(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<ConfiguredWorldCarver<?>> worldCarvers) {
        return makeAetherDefaultBiome(new BiomeGenerationSettings.Builder(placedFeatures, worldCarvers)
                .addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, GravitationPlacedFeatures.UNDERGROWTH_PLACEMENT));
    }

    public static Biome makeAetherDefaultBiome(BiomeGenerationSettings.Builder builder) {
        return AetherBiomeBuilders.makeDefaultBiome(builder.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, GravitationPlacedFeatures.LARGE_BRONZITE_ORE_PLACEMENT));
    }
}
