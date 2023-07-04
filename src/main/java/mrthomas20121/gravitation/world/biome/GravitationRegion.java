package mrthomas20121.gravitation.world.biome;

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

        // golden mountain, golden enchanted forest and enchanted forest
        Climate.Parameter temps1 = Climate.Parameter.span(-0.1F, 0.0F);

        // enchanted shore
        Climate.Parameter temps2 = Climate.Parameter.span(0.0F, 0.4F);

        this.addBiome(mapper, new Climate.ParameterPoint(temps1, Climate.Parameter.span(-1F, 0.5F), fullRange, fullRange, fullRange, fullRange, 0),
                GravitationBiomes.GOLDEN_MOUNTAIN);

        this.addBiome(mapper, new Climate.ParameterPoint(temps1, Climate.Parameter.span(-0.8F, 1F), fullRange, fullRange, fullRange, fullRange, 0),
                GravitationBiomes.GOLDEN_ENCHANTED_FOREST);
        this.addBiome(mapper, new Climate.ParameterPoint(temps1, Climate.Parameter.span(-1F, 0.8F), fullRange, fullRange, fullRange, fullRange, 0),
                GravitationBiomes.ENCHANTED_FOREST);

        this.addBiome(mapper, new Climate.ParameterPoint(temps2, Climate.Parameter.span(0F, 1F), fullRange, fullRange, fullRange, fullRange, 1),
                GravitationBiomes.ENCHANTED_SHORE);
    }
}
