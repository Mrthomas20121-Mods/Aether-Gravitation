package mrthomas20121.gravitation.data;

import com.aetherteam.aether.AetherTags;
import mrthomas20121.gravitation.GraviTags;
import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.block.GravitationBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class GravitationBlockTags extends BlockTagsProvider {

    public GravitationBlockTags(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Gravitation.MOD_ID, existingFileHelper);
    }

    @Override
    @SuppressWarnings("unchecked")
    protected void addTags(@NotNull HolderLookup.Provider provider) {

        this.tag(BlockTags.OVERWORLD_CARVER_REPLACEABLES).addTags(AetherTags.Blocks.AETHER_DIRT);

        this.tag(AetherTags.Blocks.AETHER_DIRT).add(GravitationBlocks.AER_GRASS.get());

        this.tag(BlockTags.LEAVES).add(
                GravitationBlocks.AERFIN_LEAVES.get(),
                GravitationBlocks.BLUE_AERFIN_LEAVES.get(),
                GravitationBlocks.GOLDEN_AERFIN_LEAVES.get(),
                GravitationBlocks.ENCHANTED_LEAVES.get(),
                GravitationBlocks.BELADON_LEAVES.get()
        );

        this.tag(BlockTags.SAPLINGS).add(
                GravitationBlocks.AERFIN_SAPLING.get(),
                GravitationBlocks.BLUE_AERFIN_SAPLING.get(),
                GravitationBlocks.GOLDEN_AERFIN_SAPLING.get(),
                GravitationBlocks.ENCHANTED_SAPLING.get(),
                GravitationBlocks.BELADON_SAPLING.get()
        );

        this.tag(GraviTags.Blocks.AERFIN_LOGS).add(
                GravitationBlocks.AERFIN_LOG.get(),
                GravitationBlocks.AERFIN_WOOD.get(),
                GravitationBlocks.STRIPPED_AERFIN_LOG.get(),
                GravitationBlocks.STRIPPED_AERFIN_WOOD.get()
        );

        this.tag(GraviTags.Blocks.ENCHANTED_LOGS).add(
                GravitationBlocks.ENCHANTED_LOG.get(),
                GravitationBlocks.ENCHANTED_WOOD.get(),
                GravitationBlocks.STRIPPED_ENCHANTED_LOG.get(),
                GravitationBlocks.STRIPPED_BELADON_WOOD.get()
        );

        this.tag(GraviTags.Blocks.BELADON_LOGS).add(
                GravitationBlocks.BELADON_LOG.get(),
                GravitationBlocks.BELADON_WOOD.get(),
                GravitationBlocks.STRIPPED_BELADON_LOG.get(),
                GravitationBlocks.STRIPPED_BELADON_WOOD.get()
        );

        this.tag(BlockTags.LOGS).addTags(
                GraviTags.Blocks.AERFIN_LOGS,
                GraviTags.Blocks.ENCHANTED_LOGS,
                GraviTags.Blocks.BELADON_LOGS
        );

        this.tag(BlockTags.WOODEN_FENCES).add(
                GravitationBlocks.AERFIN_FENCE.get(),
                GravitationBlocks.ENCHANTED_FENCE.get(),
                GravitationBlocks.BELADON_FENCE.get()
        );

        this.tag(BlockTags.LOGS_THAT_BURN).addTags(
                GraviTags.Blocks.AERFIN_LOGS,
                GraviTags.Blocks.BELADON_LOGS,
                GraviTags.Blocks.ENCHANTED_LOGS
        );

        this.tag(Tags.Blocks.BOOKSHELVES).add(
                GravitationBlocks.AERFIN_BOOKSHELF.get(),
                GravitationBlocks.BELADON_BOOKSHELF.get(),
                GravitationBlocks.ENCHANTED_BOOKSHELF.get()
        );

        this.tag(BlockTags.MINEABLE_WITH_AXE).add(
                GravitationBlocks.AERFIN_LOG.get(),
                GravitationBlocks.AERFIN_WOOD.get(),
                GravitationBlocks.STRIPPED_AERFIN_LOG.get(),
                GravitationBlocks.STRIPPED_AERFIN_WOOD.get(),
                GravitationBlocks.AERFIN_BUTTON.get(),
                GravitationBlocks.AERFIN_PREASURE_PLATE.get(),
                GravitationBlocks.AERFIN_STAIRS.get(),
                GravitationBlocks.AERFIN_SIGN.get(),
                GravitationBlocks.AERFIN_HANGING_SIGN.get(),
                GravitationBlocks.AERFIN_SLAB.get(),
                GravitationBlocks.AERFIN_FENCE_GATE.get(),
                GravitationBlocks.AERFIN_FENCE.get(),
                GravitationBlocks.AERFIN_BOOKSHELF.get(),
                GravitationBlocks.BELADON_LOG.get(),
                GravitationBlocks.BELADON_WOOD.get(),
                GravitationBlocks.STRIPPED_BELADON_LOG.get(),
                GravitationBlocks.STRIPPED_BELADON_WOOD.get(),
                GravitationBlocks.BELADON_BUTTON.get(),
                GravitationBlocks.BELADON_PREASURE_PLATE.get(),
                GravitationBlocks.BELADON_STAIRS.get(),
                GravitationBlocks.BELADON_SIGN.get(),
                GravitationBlocks.BELADON_HANGING_SIGN.get(),
                GravitationBlocks.BELADON_SLAB.get(),
                GravitationBlocks.BELADON_FENCE_GATE.get(),
                GravitationBlocks.BELADON_FENCE.get(),
                GravitationBlocks.BELADON_BOOKSHELF.get(),
                GravitationBlocks.ENCHANTED_LOG.get(),
                GravitationBlocks.ENCHANTED_WOOD.get(),
                GravitationBlocks.STRIPPED_ENCHANTED_LOG.get(),
                GravitationBlocks.STRIPPED_ENCHANTED_WOOD.get(),
                GravitationBlocks.ENCHANTED_BUTTON.get(),
                GravitationBlocks.ENCHANTED_PREASURE_PLATE.get(),
                GravitationBlocks.ENCHANTED_STAIRS.get(),
                GravitationBlocks.ENCHANTED_HANGING_SIGN.get(),
                GravitationBlocks.ENCHANTED_SIGN.get(),
                GravitationBlocks.ENCHANTED_SLAB.get(),
                GravitationBlocks.ENCHANTED_FENCE_GATE.get(),
                GravitationBlocks.ENCHANTED_FENCE.get(),
                GravitationBlocks.ENCHANTED_BOOKSHELF.get()
        );

        this.tag(AetherTags.Blocks.TREATED_AS_AETHER_BLOCK).add(
                GravitationBlocks.AERFIN_LOG.get(),
                GravitationBlocks.AERFIN_WOOD.get(),
                GravitationBlocks.STRIPPED_AERFIN_LOG.get(),
                GravitationBlocks.STRIPPED_AERFIN_WOOD.get(),
                GravitationBlocks.AERFIN_BUTTON.get(),
                GravitationBlocks.AERFIN_PREASURE_PLATE.get(),
                GravitationBlocks.AERFIN_STAIRS.get(),
                GravitationBlocks.AERFIN_SIGN.get(),
                GravitationBlocks.AERFIN_HANGING_SIGN.get(),
                GravitationBlocks.AERFIN_SLAB.get(),
                GravitationBlocks.AERFIN_FENCE_GATE.get(),
                GravitationBlocks.AERFIN_FENCE.get(),
                GravitationBlocks.AERFIN_BOOKSHELF.get(),
                GravitationBlocks.BELADON_LOG.get(),
                GravitationBlocks.BELADON_WOOD.get(),
                GravitationBlocks.STRIPPED_BELADON_LOG.get(),
                GravitationBlocks.STRIPPED_BELADON_WOOD.get(),
                GravitationBlocks.BELADON_BUTTON.get(),
                GravitationBlocks.BELADON_PREASURE_PLATE.get(),
                GravitationBlocks.BELADON_STAIRS.get(),
                GravitationBlocks.BELADON_SIGN.get(),
                GravitationBlocks.BELADON_HANGING_SIGN.get(),
                GravitationBlocks.BELADON_SLAB.get(),
                GravitationBlocks.BELADON_FENCE_GATE.get(),
                GravitationBlocks.BELADON_FENCE.get(),
                GravitationBlocks.BELADON_BOOKSHELF.get(),
                GravitationBlocks.ENCHANTED_LOG.get(),
                GravitationBlocks.ENCHANTED_WOOD.get(),
                GravitationBlocks.STRIPPED_ENCHANTED_LOG.get(),
                GravitationBlocks.STRIPPED_ENCHANTED_WOOD.get(),
                GravitationBlocks.ENCHANTED_BUTTON.get(),
                GravitationBlocks.ENCHANTED_PREASURE_PLATE.get(),
                GravitationBlocks.ENCHANTED_STAIRS.get(),
                GravitationBlocks.ENCHANTED_SIGN.get(),
                GravitationBlocks.ENCHANTED_HANGING_SIGN.get(),
                GravitationBlocks.ENCHANTED_SLAB.get(),
                GravitationBlocks.ENCHANTED_FENCE_GATE.get(),
                GravitationBlocks.ENCHANTED_FENCE.get(),
                GravitationBlocks.ENCHANTED_BOOKSHELF.get(),
                GravitationBlocks.BRONZITE_ICESTONE_ORE.get(),
                GravitationBlocks.BRONZITE_ORE.get(),
                GravitationBlocks.BRONZITE_BLOCK.get()
        );

        this.tag(Tags.Blocks.ORES).add(GravitationBlocks.BRONZITE_ICESTONE_ORE.get(), GravitationBlocks.BRONZITE_ORE.get());

        // vanilla add moss to the tag so i'm doing the same
        this.tag(BlockTags.DIRT).add(GravitationBlocks.ENCHANTED_MOSS.get());

        this.tag(BlockTags.WALLS).add(
                GravitationBlocks.CONGLOMERATE_WALLS.get(),
                GravitationBlocks.CONGLOMERATE_BRICK_WALLS.get(),
                GravitationBlocks.POLISHED_CONGLOMERATE_WALLS.get()
        );

        this.tag(BlockTags.WALL_SIGNS).add(
                GravitationBlocks.BELADON_WALL_SIGN.get(),
                GravitationBlocks.ENCHANTED_WALL_SIGN.get(),
                GravitationBlocks.AERFIN_WALL_SIGN.get()
        );

        this.tag(BlockTags.SIGNS).add(
                GravitationBlocks.BELADON_SIGN.get(),
                GravitationBlocks.ENCHANTED_SIGN.get(),
                GravitationBlocks.AERFIN_SIGN.get()
        );

        this.tag(BlockTags.CEILING_HANGING_SIGNS).add(
                GravitationBlocks.BELADON_HANGING_SIGN.get(),
                GravitationBlocks.ENCHANTED_HANGING_SIGN.get(),
                GravitationBlocks.AERFIN_HANGING_SIGN.get()
        );

        this.tag(BlockTags.WALL_HANGING_SIGNS).add(
                GravitationBlocks.BELADON_WALL_HANGING_SIGN.get(),
                GravitationBlocks.ENCHANTED_WALL_HANGING_SIGN.get(),
                GravitationBlocks.AERFIN_WALL_HANGING_SIGN.get()
        );

        this.tag(BlockTags.STANDING_SIGNS).add(
                GravitationBlocks.BELADON_SIGN.get(),
                GravitationBlocks.ENCHANTED_SIGN.get(),
                GravitationBlocks.AERFIN_SIGN.get()
        );

        this.tag(BlockTags.ALL_SIGNS).add(
                GravitationBlocks.BELADON_SIGN.get(),
                GravitationBlocks.ENCHANTED_SIGN.get(),
                GravitationBlocks.BELADON_WALL_HANGING_SIGN.get(),
                GravitationBlocks.ENCHANTED_WALL_HANGING_SIGN.get(),
                GravitationBlocks.BELADON_HANGING_SIGN.get(),
                GravitationBlocks.ENCHANTED_HANGING_SIGN.get(),
                GravitationBlocks.BELADON_WALL_SIGN.get(),
                GravitationBlocks.ENCHANTED_WALL_SIGN.get(),
                GravitationBlocks.AERFIN_SIGN.get(),
                GravitationBlocks.AERFIN_WALL_SIGN.get(),
                GravitationBlocks.AERFIN_WALL_HANGING_SIGN.get(),
                GravitationBlocks.AERFIN_HANGING_SIGN.get()
        );

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                GravitationBlocks.BRONZITE_BLOCK.get(),
                GravitationBlocks.BRONZITE_ICESTONE_ORE.get(),
                GravitationBlocks.BRONZITE_ORE.get(),
                GravitationBlocks.CONGLOMERATE.get(),
                GravitationBlocks.CONGLOMERATE_STAIRS.get(),
                GravitationBlocks.CONGLOMERATE_SLAB.get(),
                GravitationBlocks.CONGLOMERATE_WALLS.get(),
                GravitationBlocks.CONGLOMERATE_BRICKS.get(),
                GravitationBlocks.CONGLOMERATE_BRICK_STAIRS.get(),
                GravitationBlocks.CONGLOMERATE_BRICK_SLAB.get(),
                GravitationBlocks.CONGLOMERATE_BRICK_WALLS.get(),
                GravitationBlocks.POLISHED_CONGLOMERATE.get(),
                GravitationBlocks.POLISHED_CONGLOMERATE_STAIRS.get(),
                GravitationBlocks.POLISHED_CONGLOMERATE_SLAB.get(),
                GravitationBlocks.POLISHED_CONGLOMERATE_WALLS.get()
        );

        this.tag(Tags.Blocks.STORAGE_BLOCKS).add(GravitationBlocks.BRONZITE_BLOCK.get());

        this.tag(GraviTags.Blocks.BRONZITE_STORAGE).add(GravitationBlocks.BRONZITE_BLOCK.get());

        this.tag(GraviTags.Blocks.BRONZITE_ORE).add(GravitationBlocks.BRONZITE_ORE.get(), GravitationBlocks.BRONZITE_ICESTONE_ORE.get());
    }
}
