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
                Climate.Parameter.span(0.3f, 1f),
                Climate.Parameter.span(-0.30F, 0.3F)
        };

        Climate.Parameter[] humidities = new Climate.Parameter[] {
                Climate.Parameter.span(-0.35F, -0.1F),
                Climate.Parameter.span(-0.1F, 0.1F)
        };

        Climate.Parameter depth = Climate.Parameter.span(0F, 1F);

        this.addBiome(mapper, temperatures[0], humidities[0], fullRange, fullRange, fullRange, depth, 0,
                GravitationBiomes.FROSTED_FOREST);

        this.addBiome(mapper, temperatures[1], humidities[1], fullRange, fullRange, fullRange, depth, 0,
                GravitationBiomes.UNDERGROWTH);
    }
}
