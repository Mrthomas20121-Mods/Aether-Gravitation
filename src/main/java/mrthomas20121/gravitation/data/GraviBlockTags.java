package mrthomas20121.gravitation.data;

import com.aetherteam.aether.AetherTags;
import com.aetherteam.aether.block.AetherBlocks;
import mrthomas20121.gravitation.GraviTags;
import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.block.GraviBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class GraviBlockTags extends BlockTagsProvider {

    public GraviBlockTags(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Gravitation.MOD_ID, existingFileHelper);
    }

    @Override
    @SuppressWarnings("unchecked")
    protected void addTags(@NotNull HolderLookup.Provider provider) {

        this.tag(BlockTags.OVERWORLD_CARVER_REPLACEABLES).addTags(AetherTags.Blocks.AETHER_DIRT);

        this.tag(BlockTags.LEAVES).add(
                GraviBlocks.AERFIN_LEAVES.get(),
                GraviBlocks.BLUE_AERFIN_LEAVES.get(),
                GraviBlocks.GOLDEN_AERFIN_LEAVES.get(),
                GraviBlocks.ENCHANTED_LEAVES.get(),
                GraviBlocks.BELADON_LEAVES.get()
        );

        this.tag(BlockTags.SAPLINGS).add(
                GraviBlocks.AERFIN_SAPLING.get(),
                GraviBlocks.BLUE_AERFIN_SAPLING.get(),
                GraviBlocks.GOLDEN_AERFIN_SAPLING.get(),
                GraviBlocks.ENCHANTED_SAPLING.get(),
                GraviBlocks.BELADON_SAPLING.get()
        );

        this.tag(GraviTags.Blocks.AERFIN_LOGS).add(
                GraviBlocks.AERFIN_LOG.get(),
                GraviBlocks.AERFIN_WOOD.get(),
                GraviBlocks.STRIPPED_AERFIN_LOG.get(),
                GraviBlocks.STRIPPED_AERFIN_WOOD.get()
        );

        this.tag(GraviTags.Blocks.ENCHANTED_LOGS).add(
                GraviBlocks.ENCHANTED_LOG.get(),
                GraviBlocks.ENCHANTED_WOOD.get(),
                GraviBlocks.STRIPPED_ENCHANTED_LOG.get(),
                GraviBlocks.STRIPPED_BELADON_WOOD.get()
        );

        this.tag(GraviTags.Blocks.BELADON_LOGS).add(
                GraviBlocks.BELADON_LOG.get(),
                GraviBlocks.BELADON_WOOD.get(),
                GraviBlocks.STRIPPED_BELADON_LOG.get(),
                GraviBlocks.STRIPPED_BELADON_WOOD.get()
        );

        this.tag(BlockTags.LOGS).addTags(
                GraviTags.Blocks.AERFIN_LOGS,
                GraviTags.Blocks.ENCHANTED_LOGS,
                GraviTags.Blocks.BELADON_LOGS
        );

        this.tag(BlockTags.FENCES).add(
                GraviBlocks.AERFIN_FENCE.get(),
                GraviBlocks.ENCHANTED_FENCE.get(),
                GraviBlocks.BELADON_FENCE.get()
        );
        this.tag(BlockTags.WOODEN_FENCES).add(
                GraviBlocks.AERFIN_FENCE.get(),
                GraviBlocks.ENCHANTED_FENCE.get(),
                GraviBlocks.BELADON_FENCE.get()
        );

        this.tag(BlockTags.LOGS_THAT_BURN).addTags(
                GraviTags.Blocks.AERFIN_LOGS,
                GraviTags.Blocks.BELADON_LOGS,
                GraviTags.Blocks.ENCHANTED_LOGS
        );

        this.tag(Tags.Blocks.BOOKSHELVES).add(
                GraviBlocks.AERFIN_BOOKSHELF.get(),
                GraviBlocks.BELADON_BOOKSHELF.get(),
                GraviBlocks.ENCHANTED_BOOKSHELF.get()
        );

        this.tag(BlockTags.MINEABLE_WITH_AXE).add(
                GraviBlocks.AERFIN_LOG.get(),
                GraviBlocks.AERFIN_WOOD.get(),
                GraviBlocks.STRIPPED_AERFIN_LOG.get(),
                GraviBlocks.STRIPPED_AERFIN_WOOD.get(),
                GraviBlocks.AERFIN_BUTTON.get(),
                GraviBlocks.AERFIN_PREASURE_PLATE.get(),
                GraviBlocks.AERFIN_STAIRS.get(),
                GraviBlocks.AERFIN_SIGN.get(),
                GraviBlocks.AERFIN_HANGING_SIGN.get(),
                GraviBlocks.AERFIN_SLAB.get(),
                GraviBlocks.AERFIN_FENCE_GATE.get(),
                GraviBlocks.AERFIN_FENCE.get(),
                GraviBlocks.AERFIN_BOOKSHELF.get(),
                GraviBlocks.BELADON_LOG.get(),
                GraviBlocks.BELADON_WOOD.get(),
                GraviBlocks.STRIPPED_BELADON_LOG.get(),
                GraviBlocks.STRIPPED_BELADON_WOOD.get(),
                GraviBlocks.BELADON_BUTTON.get(),
                GraviBlocks.BELADON_PREASURE_PLATE.get(),
                GraviBlocks.BELADON_STAIRS.get(),
                GraviBlocks.BELADON_SIGN.get(),
                GraviBlocks.BELADON_HANGING_SIGN.get(),
                GraviBlocks.BELADON_SLAB.get(),
                GraviBlocks.BELADON_FENCE_GATE.get(),
                GraviBlocks.BELADON_FENCE.get(),
                GraviBlocks.BELADON_BOOKSHELF.get(),
                GraviBlocks.ENCHANTED_LOG.get(),
                GraviBlocks.ENCHANTED_WOOD.get(),
                GraviBlocks.STRIPPED_ENCHANTED_LOG.get(),
                GraviBlocks.STRIPPED_ENCHANTED_WOOD.get(),
                GraviBlocks.ENCHANTED_BUTTON.get(),
                GraviBlocks.ENCHANTED_PREASURE_PLATE.get(),
                GraviBlocks.ENCHANTED_STAIRS.get(),
                GraviBlocks.ENCHANTED_HANGING_SIGN.get(),
                GraviBlocks.ENCHANTED_SIGN.get(),
                GraviBlocks.ENCHANTED_SLAB.get(),
                GraviBlocks.ENCHANTED_FENCE_GATE.get(),
                GraviBlocks.ENCHANTED_FENCE.get(),
                GraviBlocks.ENCHANTED_BOOKSHELF.get()
        );

        this.tag(AetherTags.Blocks.TREATED_AS_AETHER_BLOCK).add(
                GraviBlocks.AERFIN_LOG.get(),
                GraviBlocks.AERFIN_WOOD.get(),
                GraviBlocks.STRIPPED_AERFIN_LOG.get(),
                GraviBlocks.STRIPPED_AERFIN_WOOD.get(),
                GraviBlocks.AERFIN_BUTTON.get(),
                GraviBlocks.AERFIN_PREASURE_PLATE.get(),
                GraviBlocks.AERFIN_STAIRS.get(),
                GraviBlocks.AERFIN_SIGN.get(),
                GraviBlocks.AERFIN_HANGING_SIGN.get(),
                GraviBlocks.AERFIN_SLAB.get(),
                GraviBlocks.AERFIN_FENCE_GATE.get(),
                GraviBlocks.AERFIN_FENCE.get(),
                GraviBlocks.AERFIN_BOOKSHELF.get(),
                GraviBlocks.BELADON_LOG.get(),
                GraviBlocks.BELADON_WOOD.get(),
                GraviBlocks.STRIPPED_BELADON_LOG.get(),
                GraviBlocks.STRIPPED_BELADON_WOOD.get(),
                GraviBlocks.BELADON_BUTTON.get(),
                GraviBlocks.BELADON_PREASURE_PLATE.get(),
                GraviBlocks.BELADON_STAIRS.get(),
                GraviBlocks.BELADON_SIGN.get(),
                GraviBlocks.BELADON_HANGING_SIGN.get(),
                GraviBlocks.BELADON_SLAB.get(),
                GraviBlocks.BELADON_FENCE_GATE.get(),
                GraviBlocks.BELADON_FENCE.get(),
                GraviBlocks.BELADON_BOOKSHELF.get(),
                GraviBlocks.ENCHANTED_LOG.get(),
                GraviBlocks.ENCHANTED_WOOD.get(),
                GraviBlocks.STRIPPED_ENCHANTED_LOG.get(),
                GraviBlocks.STRIPPED_ENCHANTED_WOOD.get(),
                GraviBlocks.ENCHANTED_BUTTON.get(),
                GraviBlocks.ENCHANTED_PREASURE_PLATE.get(),
                GraviBlocks.ENCHANTED_STAIRS.get(),
                GraviBlocks.ENCHANTED_SIGN.get(),
                GraviBlocks.ENCHANTED_HANGING_SIGN.get(),
                GraviBlocks.ENCHANTED_SLAB.get(),
                GraviBlocks.ENCHANTED_FENCE_GATE.get(),
                GraviBlocks.ENCHANTED_FENCE.get(),
                GraviBlocks.ENCHANTED_BOOKSHELF.get(),
                GraviBlocks.BRONZITE_ICESTONE_ORE.get(),
                GraviBlocks.BRONZITE_ORE.get(),
                GraviBlocks.BRONZITE_BLOCK.get()
        );

        this.tag(Tags.Blocks.ORES).add(GraviBlocks.BRONZITE_ICESTONE_ORE.get(), GraviBlocks.BRONZITE_ORE.get());

        // vanilla add moss to the tag so i'm doing the same
        this.tag(BlockTags.DIRT).add(GraviBlocks.ENCHANTED_MOSS.get());

        this.tag(BlockTags.WALLS).add(
                GraviBlocks.CONGLOMERATE_WALLS.get(),
                GraviBlocks.CONGLOMERATE_BRICK_WALLS.get(),
                GraviBlocks.POLISHED_CONGLOMERATE_WALLS.get()
        );

        this.tag(BlockTags.WALL_SIGNS).add(
                GraviBlocks.BELADON_WALL_SIGN.get(),
                GraviBlocks.ENCHANTED_WALL_SIGN.get(),
                GraviBlocks.AERFIN_WALL_SIGN.get()
        );

        this.tag(BlockTags.SIGNS).add(
                GraviBlocks.BELADON_SIGN.get(),
                GraviBlocks.ENCHANTED_SIGN.get(),
                GraviBlocks.AERFIN_SIGN.get()
        );

        this.tag(BlockTags.CEILING_HANGING_SIGNS).add(
                GraviBlocks.BELADON_HANGING_SIGN.get(),
                GraviBlocks.ENCHANTED_HANGING_SIGN.get(),
                GraviBlocks.AERFIN_HANGING_SIGN.get()
        );

        this.tag(BlockTags.WALL_HANGING_SIGNS).add(
                GraviBlocks.BELADON_WALL_HANGING_SIGN.get(),
                GraviBlocks.ENCHANTED_WALL_HANGING_SIGN.get(),
                GraviBlocks.AERFIN_WALL_HANGING_SIGN.get()
        );

        this.tag(BlockTags.STANDING_SIGNS).add(
                GraviBlocks.BELADON_SIGN.get(),
                GraviBlocks.ENCHANTED_SIGN.get(),
                GraviBlocks.AERFIN_SIGN.get()
        );

        this.tag(BlockTags.ALL_SIGNS).add(
                GraviBlocks.BELADON_SIGN.get(),
                GraviBlocks.ENCHANTED_SIGN.get(),
                GraviBlocks.BELADON_WALL_HANGING_SIGN.get(),
                GraviBlocks.ENCHANTED_WALL_HANGING_SIGN.get(),
                GraviBlocks.BELADON_HANGING_SIGN.get(),
                GraviBlocks.ENCHANTED_HANGING_SIGN.get(),
                GraviBlocks.BELADON_WALL_SIGN.get(),
                GraviBlocks.ENCHANTED_WALL_SIGN.get(),
                GraviBlocks.AERFIN_SIGN.get(),
                GraviBlocks.AERFIN_WALL_SIGN.get(),
                GraviBlocks.AERFIN_WALL_HANGING_SIGN.get(),
                GraviBlocks.AERFIN_HANGING_SIGN.get()
        );

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                GraviBlocks.BRONZITE_BLOCK.get(),
                GraviBlocks.BRONZITE_ICESTONE_ORE.get(),
                GraviBlocks.BRONZITE_ORE.get(),
                GraviBlocks.CONGLOMERATE.get(),
                GraviBlocks.CONGLOMERATE_STAIRS.get(),
                GraviBlocks.CONGLOMERATE_SLAB.get(),
                GraviBlocks.CONGLOMERATE_WALLS.get(),
                GraviBlocks.CONGLOMERATE_BRICKS.get(),
                GraviBlocks.CONGLOMERATE_BRICK_STAIRS.get(),
                GraviBlocks.CONGLOMERATE_BRICK_SLAB.get(),
                GraviBlocks.CONGLOMERATE_BRICK_WALLS.get(),
                GraviBlocks.POLISHED_CONGLOMERATE.get(),
                GraviBlocks.POLISHED_CONGLOMERATE_STAIRS.get(),
                GraviBlocks.POLISHED_CONGLOMERATE_SLAB.get(),
                GraviBlocks.POLISHED_CONGLOMERATE_WALLS.get()
        );

        this.tag(Tags.Blocks.STORAGE_BLOCKS).add(GraviBlocks.BRONZITE_BLOCK.get());

        this.tag(GraviTags.Blocks.BRONZITE_STORAGE).add(GraviBlocks.BRONZITE_BLOCK.get());

        this.tag(GraviTags.Blocks.BRONZITE_ORE).add(GraviBlocks.BRONZITE_ORE.get(), GraviBlocks.BRONZITE_ICESTONE_ORE.get());
    }
}
