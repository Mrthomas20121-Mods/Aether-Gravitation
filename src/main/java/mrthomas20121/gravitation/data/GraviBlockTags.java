package mrthomas20121.gravitation.data;

import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.block.GraviBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class GraviBlockTags extends BlockTagsProvider {

    public GraviBlockTags(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Gravitation.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(BlockTags.LOGS).add(GraviBlocks.ENCHANTED_LOG.get(), GraviBlocks.STRIPPED_ENCHANTED_LOG.get());
        this.tag(BlockTags.LOGS_THAT_BURN).add(GraviBlocks.ENCHANTED_LOG.get(), GraviBlocks.STRIPPED_ENCHANTED_LOG.get());

        this.tag(BlockTags.LEAVES).add(GraviBlocks.ENCHANTED_LEAVES.get());
    }
}
