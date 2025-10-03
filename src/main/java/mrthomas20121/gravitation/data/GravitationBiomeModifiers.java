package mrthomas20121.gravitation.data;

import com.aetherteam.aether.AetherTags;
import com.aetherteam.aether.data.resources.registries.AetherPlacedFeatures;
import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.world.biome.GravitationBiomes;
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

import java.util.Set;

public class GravitationBiomeModifiers {

    public static ResourceKey<BiomeModifier> CONGLOMERATE = createKey("conglomerate");
    public static ResourceKey<BiomeModifier> BERRY_BUSH = createKey("berry_bush");

    private static ResourceKey<BiomeModifier> createKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(Gravitation.MOD_ID, name));
    }

    public static void bootstrap(BootstapContext<BiomeModifier> context) {

        HolderGetter<Biome> biomeLookup = context.lookup(Registries.BIOME);
        HolderGetter<PlacedFeature> placedFeatureLookup = context.lookup(Registries.PLACED_FEATURE);
        context.register(CONGLOMERATE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomeLookup.getOrThrow(AetherTags.Biomes.IS_AETHER), HolderSet.direct(placedFeatureLookup.getOrThrow(GravitationPlacedFeatures.CONGLOMERATE_PLACEMENT)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(BERRY_BUSH, new ForgeBiomeModifiers.RemoveFeaturesBiomeModifier(HolderSet.direct(biomeLookup.getOrThrow(GravitationBiomes.FROSTED_FOREST)), HolderSet.direct(placedFeatureLookup.getOrThrow(AetherPlacedFeatures.BERRY_BUSH_PATCH_PLACEMENT)), Set.of(GenerationStep.Decoration.VEGETAL_DECORATION)));
    }
}
