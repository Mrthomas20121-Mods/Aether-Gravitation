package mrthomas20121.gravitation.world.biome;

import com.aetherteam.aether.data.resources.registries.AetherBiomes;
import com.mojang.datafixers.util.Pair;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Climate;
import teamrazor.aeroblender.aether.AetherRegionType;
import terrablender.api.Region;

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
                Climate.Parameter.span(-1.0F, -0.1F),
                Climate.Parameter.span(0.55F, 1.0F)
        };

        this.addBiome(mapper, temperatures[2], humidities[1], Climate.Parameter.span(-1F, -0.45F), erosions[0], fullRange, fullRange, 0,
                GravitationBiomes.BELADON_PLAINS);
        this.addBiome(mapper, temperatures[3], humidities[2], Climate.Parameter.span(-0.45F, -0.2F), fullRange, fullRange, fullRange, 0,
                GravitationBiomes.BELADON_FOREST);

        this.addBiome(mapper, temperatures[3], humidities[3], Climate.Parameter.span(-0.40F, 0F), fullRange, fullRange, fullRange, 0,
                GravitationBiomes.AERFIN_FOREST);

        this.addBiome(mapper, temperatures[3], humidities[2], Climate.Parameter.span(0.1F, 0.55F), fullRange, fullRange, fullRange, 0,
                GravitationBiomes.ENCHANTED_FOREST);

        this.addBiome(mapper, temperatures[4], humidities[2], Climate.Parameter.span(-0.33F, 0.11F), erosions[1], fullRange, fullRange, 0,
                GravitationBiomes.GOLDEN_MOUNTAIN);
    }
}
