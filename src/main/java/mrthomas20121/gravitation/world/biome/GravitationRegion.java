package mrthomas20121.gravitation.world.biome;

import com.aetherteam.aether.data.resources.registries.AetherBiomes;
import com.mojang.datafixers.util.Pair;
import mrthomas20121.gravitation.world.biome.GravitationBiomes;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Climate;
import teamrazor.aeroblender.aether.AetherRegionType;
import terrablender.api.Region;
import terrablender.api.RegionType;

import java.util.function.Consumer;

public class GravitationRegion extends Region {


    public GravitationRegion(ResourceLocation name, int weight) {
        super(name, AetherRegionType.THE_AETHER, weight);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper) {
        // full range
        Climate.Parameter fullRange = Climate.Parameter.span(-1.0F, 1.0F);

        Climate.Parameter[] temperatures = {
                Climate.Parameter.span(-1.0F, -0.40F),
                Climate.Parameter.span(-0.40F, -0.10F),
                Climate.Parameter.span(-0.10F, 0.1F),
                Climate.Parameter.span(0.1F, 0.45F),
                Climate.Parameter.span(0.45F, 1.0F)
        };

        Climate.Parameter[] humidities = new Climate.Parameter[] {
                Climate.Parameter.span(-1.0F, -0.35F),
                Climate.Parameter.span(-0.35F, -0.1F),
                Climate.Parameter.span(-0.1F, 0.1F),
                Climate.Parameter.span(0.1F, 0.3F),
                Climate.Parameter.span(0.3F, 1.0F)
        };

        Climate.Parameter[] erosions = new Climate.Parameter[] {
                Climate.Parameter.span(-1.0F, -0.78F),
                Climate.Parameter.span(-0.78F, -0.375F),
                Climate.Parameter.span(-0.375F, -0.2225F),
                Climate.Parameter.span(-0.2225F, 0.05F),
                Climate.Parameter.span(0.05F, 0.45F),
                Climate.Parameter.span(0.45F, 0.55F),
                Climate.Parameter.span(0.55F, 1.0F)
        };

        this.addBiome(mapper, temperatures[2], humidities[0], Climate.Parameter.span(-1F, -0.45F), erosions[0], fullRange, fullRange, 0,
                GravitationBiomes.ENCHANTED_SHORE);

        this.addBiome(mapper, temperatures[3], humidities[3], Climate.Parameter.span(-0.45F, -0.20F), erosions[1], fullRange, fullRange, 0,
                GravitationBiomes.BELADON_MIRE);

        this.addBiome(mapper, temperatures[1], humidities[3], Climate.Parameter.span(-0.40F, 0F), erosions[2], fullRange, fullRange, 0,
                GravitationBiomes.MIXED_FOREST);

        this.addBiome(mapper, temperatures[1], humidities[3], fullRange, fullRange, fullRange, fullRange, 0,
                AetherBiomes.SKYROOT_FOREST);

        this.addBiome(mapper, temperatures[4], humidities[1], Climate.Parameter.span(-0.33F, 0.11F), Climate.Parameter.span(erosions[4], erosions[5]), fullRange, fullRange, 0,
                GravitationBiomes.GOLDEN_MOUNTAIN);

        this.addBiome(mapper, temperatures[2], humidities[1], Climate.Parameter.span(0.22F, 0.55F), Climate.Parameter.span(erosions[4], erosions[5]), fullRange, fullRange, 0,
                GravitationBiomes.ENCHANTED_FOREST);

        this.addBiome(mapper, temperatures[2], humidities[2], fullRange, erosions[0], fullRange, fullRange, 0,
                AetherBiomes.SKYROOT_FOREST);

        this.addBiome(mapper, temperatures[2], humidities[1], fullRange, fullRange, fullRange, fullRange, 0,
                AetherBiomes.SKYROOT_GROVE);
    }
}
