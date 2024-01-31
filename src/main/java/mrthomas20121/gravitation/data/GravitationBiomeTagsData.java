package mrthomas20121.gravitation.data;

import com.aetherteam.aether.AetherTags;
import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.world.biome.GravitationBiomes;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.BiomeTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class GravitationBiomeTagsData extends BiomeTagsProvider {

    public GravitationBiomeTagsData(PackOutput p_255800_, CompletableFuture<HolderLookup.Provider> p_256205_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_255800_, p_256205_, Gravitation.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(AetherTags.Biomes.IS_AETHER).add(
                GravitationBiomes.ENCHANTED_FOREST,
                GravitationBiomes.BELADON_FOREST,
                GravitationBiomes.BELADON_PLAINS,
                GravitationBiomes.AERFIN_FOREST,
                GravitationBiomes.GOLDEN_MOUNTAIN
        );
    }
}
