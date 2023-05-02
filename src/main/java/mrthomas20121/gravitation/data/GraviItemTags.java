package mrthomas20121.gravitation.data;

import mrthomas20121.gravitation.GraviTags;
import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.block.GraviBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.concurrent.CompletableFuture;

public class GraviItemTags extends ItemTagsProvider {

    public GraviItemTags(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_, CompletableFuture<TagLookup<Block>> p_275322_, ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, Gravitation.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(GraviTags.ItemTags.ENCHANTED_LOGS).add(GraviBlocks.ENCHANTED_LOG.get().asItem(), GraviBlocks.ENCHANTED_WOOD.get().asItem(), GraviBlocks.STRIPPED_ENCHANTED_LOG.get().asItem(), GraviBlocks.STRIPPED_ENCHANTED_WOOD.get().asItem());

    }
}
