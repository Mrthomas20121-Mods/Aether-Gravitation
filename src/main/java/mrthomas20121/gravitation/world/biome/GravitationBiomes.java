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

    public static ResourceKey<Biome> ENCHANTED_FOREST = createKey("enchanted_forest");
    public static ResourceKey<Biome> GOLDEN_MOUNTAIN = createKey("golden_mountain");
    public static ResourceKey<Biome> BELADON_PLAINS = createKey("beladon_plains");

    public static ResourceKey<Biome> BELADON_FOREST = createKey("beladon_forest");
    public static ResourceKey<Biome> AERFIN_FOREST = createKey("aerfin_forest");

    private static ResourceKey<Biome> createKey(String name) {
        return ResourceKey.create(Registries.BIOME, new ResourceLocation(Gravitation.MOD_ID, name));
    }

    public static void bootstrap(BootstapContext<Biome> context) {
        HolderGetter<PlacedFeature> placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        HolderGetter<ConfiguredWorldCarver<?>> vanillaConfiguredCarvers = context.lookup(Registries.CONFIGURED_CARVER);
        context.register(ENCHANTED_FOREST, enchantedForestBiome(placedFeatures, vanillaConfiguredCarvers));
        context.register(GOLDEN_MOUNTAIN, goldenMountainBiome(placedFeatures, vanillaConfiguredCarvers));
        context.register(BELADON_PLAINS, beladonMireBiome(placedFeatures, vanillaConfiguredCarvers));
        context.register(AERFIN_FOREST, aerfinForestBiome(placedFeatures, vanillaConfiguredCarvers));
        context.register(BELADON_FOREST, beladonForest(placedFeatures, vanillaConfiguredCarvers));
    }

    public static Biome beladonForest(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<ConfiguredWorldCarver<?>> worldCarvers) {
        return makeAetherDefaultBiome(new BiomeGenerationSettings.Builder(placedFeatures, worldCarvers)
                .addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, GravitationPlacedFeatures.BELADON_FOREST_PLACEMENT));
    }

    public static Biome goldenMountainBiome(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<ConfiguredWorldCarver<?>> worldCarvers) {
        return makeAetherDefaultBiome(new BiomeGenerationSettings.Builder(placedFeatures, worldCarvers)
                .addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, GravitationPlacedFeatures.GOLDEN_AERFIN_FOREST_PLACEMENT));
    }

    public static Biome beladonMireBiome(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<ConfiguredWorldCarver<?>> worldCarvers) {
        return makeAetherDefaultBiome(new BiomeGenerationSettings.Builder(placedFeatures, worldCarvers)
                .addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, GravitationPlacedFeatures.BELADON_MIRE_PLACEMENT));
    }

    public static Biome aerfinForestBiome(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<ConfiguredWorldCarver<?>> worldCarvers) {
        return makeAetherDefaultBiome(new BiomeGenerationSettings.Builder(placedFeatures, worldCarvers)
                .addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, GravitationPlacedFeatures.AERFIN_FOREST_PLACEMENT)
                .addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, GravitationPlacedFeatures.BLUE_AERFIN_FOREST_PLACEMENT)
                .addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, GravitationPlacedFeatures.GOLDEN_AERFIN_FOREST_PLACEMENT));
    }

    public static Biome enchantedForestBiome(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<ConfiguredWorldCarver<?>> worldCarvers) {
        return makeAetherDefaultBiome(new BiomeGenerationSettings.Builder(placedFeatures, worldCarvers).addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, GravitationPlacedFeatures.SMALL_ENCHANTED_TREES_PLACEMENT).addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, GravitationPlacedFeatures.ENCHANTED_TREES_PLACEMENT));
    }

    public static Biome makeAetherDefaultBiome(BiomeGenerationSettings.Builder builder) {
        return AetherBiomeBuilders.makeDefaultBiome(builder.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, GravitationPlacedFeatures.LARGE_BRONZITE_ORE_PLACEMENT));
    }
}
