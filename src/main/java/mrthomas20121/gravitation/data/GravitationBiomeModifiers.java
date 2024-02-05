package mrthomas20121.gravitation.data;

import com.aetherteam.aether.AetherTags;
import mrthomas20121.gravitation.Gravitation;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

public class GravitationBiomeModifiers {

    public static ResourceKey<BiomeModifier> CONGLOMERATE = createKey("conglomerate");

    private static ResourceKey<BiomeModifier> createKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(Gravitation.MOD_ID, name));
    }

    public static void bootstrap(BootstapContext<BiomeModifier> context) {

        HolderGetter<Biome> biomeLookup = context.lookup(Registries.BIOME);
        HolderGetter<PlacedFeature> placedFeatureLookup = context.lookup(Registries.PLACED_FEATURE);
        context.register(CONGLOMERATE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomeLookup.getOrThrow(AetherTags.Biomes.IS_AETHER), HolderSet.direct(placedFeatureLookup.getOrThrow(GravitationPlacedFeatures.CONGLOMERATE_PLACEMENT)), GenerationStep.Decoration.UNDERGROUND_ORES));
    }
}
