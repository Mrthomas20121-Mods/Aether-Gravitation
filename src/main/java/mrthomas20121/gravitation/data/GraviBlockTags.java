package mrthomas20121.gravitation.data;

import com.aetherteam.aether.block.AetherBlocks;
import mrthomas20121.gravitation.GraviTags;
import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.block.GraviBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class GraviBlockTags extends BlockTagsProvider {

    public GraviBlockTags(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Gravitation.MOD_ID, existingFileHelper);
    }

    @Override
    @SuppressWarnings("unchecked")
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(BlockTags.LOGS_THAT_BURN).add(GraviBlocks.ENCHANTED_LOG.get(), GraviBlocks.STRIPPED_ENCHANTED_LOG.get());

        this.tag(BlockTags.LEAVES).add(GraviBlocks.ENCHANTED_LEAVES.get());

        this.tag(GraviTags.BlockTags.ENCHANTED_LOGS).add(GraviBlocks.ENCHANTED_LOG.get(), GraviBlocks.ENCHANTED_WOOD.get(), GraviBlocks.STRIPPED_ENCHANTED_LOG.get(), GraviBlocks.STRIPPED_ENCHANTED_WOOD.get());

        this.tag(BlockTags.LOGS).addTags(GraviTags.BlockTags.ENCHANTED_LOGS);

        this.tag(BlockTags.FENCES).add(GraviBlocks.ENCHANTED_FENCE.get());
        this.tag(BlockTags.FENCE_GATES).add(GraviBlocks.ENCHANTED_FENCE_GATE.get());
        this.tag(BlockTags.WOODEN_FENCES).add(GraviBlocks.ENCHANTED_FENCE.get());

        this.tag(Tags.Blocks.BOOKSHELVES).add(GraviBlocks.ENCHANTED_BOOKSHELF.get());

        this.tag(BlockTags.MINEABLE_WITH_AXE).add(
                GraviBlocks.ENCHANTED_LOG.get(),
                GraviBlocks.ENCHANTED_WOOD.get(),
                GraviBlocks.STRIPPED_ENCHANTED_LOG.get(),
                GraviBlocks.STRIPPED_ENCHANTED_WOOD.get(),
                GraviBlocks.ENCHANTED_BUTTON.get(),
                GraviBlocks.ENCHANTED_PREASURE_PLATE.get(),
                GraviBlocks.ENCHANTED_STAIRS.get(),
                GraviBlocks.ENCHANTED_SIGN.get(),
                GraviBlocks.ENCHANTED_SLAB.get(),
                GraviBlocks.ENCHANTED_FENCE_GATE.get(),
                GraviBlocks.ENCHANTED_FENCE.get(),
                GraviBlocks.ENCHANTED_BOOKSHELF.get()
        );
    }
}
