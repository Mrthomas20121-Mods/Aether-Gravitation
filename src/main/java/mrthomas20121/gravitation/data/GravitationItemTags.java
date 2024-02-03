package mrthomas20121.gravitation.data;

import com.aetherteam.aether.AetherTags;
import com.aetherteam.aether.item.AetherItems;
import mrthomas20121.gravitation.GraviTags;
import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.block.GravitationBlocks;
import mrthomas20121.gravitation.item.GravitationItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class GravitationItemTags extends ItemTagsProvider {

    public GravitationItemTags(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_, CompletableFuture<TagLookup<Block>> p_275322_, ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, Gravitation.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(@NotNull HolderLookup.Provider provider) {

        this.tag(AetherTags.Items.AETHER_DIRT).add(GravitationBlocks.AER_GRASS.get().asItem());

        this.tag(GraviTags.Items.NEPTUNE_TOOLS).add(
                GravitationItems.NEPTUNE_CUTLASS.get(),
                GravitationItems.NEPTUNE_PICKAXE.get(),
                GravitationItems.NEPTUNE_AXE.get(),
                GravitationItems.NEPTUNE_SHOVEL.get(),
                GravitationItems.NEPTUNE_BATTLEAXE.get()
        );

        this.tag(GraviTags.Items.AERFIN_LOGS).add(
                GravitationBlocks.AERFIN_LOG.get().asItem(),
                GravitationBlocks.AERFIN_WOOD.get().asItem(),
                GravitationBlocks.STRIPPED_AERFIN_LOG.get().asItem(),
                GravitationBlocks.STRIPPED_AERFIN_WOOD.get().asItem()
        );
        this.tag(GraviTags.Items.ENCHANTED_LOGS).add(
                GravitationBlocks.ENCHANTED_LOG.get().asItem(),
                GravitationBlocks.ENCHANTED_WOOD.get().asItem(),
                GravitationBlocks.STRIPPED_ENCHANTED_LOG.get().asItem(),
                GravitationBlocks.STRIPPED_ENCHANTED_WOOD.get().asItem()
        );
        this.tag(GraviTags.Items.BELADON_LOGS).add(
                GravitationBlocks.BELADON_LOG.get().asItem(),
                GravitationBlocks.BELADON_WOOD.get().asItem(),
                GravitationBlocks.STRIPPED_BELADON_LOG.get().asItem(),
                GravitationBlocks.STRIPPED_BELADON_WOOD.get().asItem()
        );

        this.tag(Tags.Items.BOOKSHELVES).add(
                GravitationBlocks.AERFIN_BOOKSHELF.get().asItem(),
                GravitationBlocks.ENCHANTED_BOOKSHELF.get().asItem(),
                GravitationBlocks.BELADON_BOOKSHELF.get().asItem()
        );

        this.tag(ItemTags.SAPLINGS).add(
                GravitationBlocks.AERFIN_SAPLING.get().asItem(),
                GravitationBlocks.BLUE_AERFIN_SAPLING.get().asItem(),
                GravitationBlocks.GOLDEN_AERFIN_SAPLING.get().asItem(),
                GravitationBlocks.ENCHANTED_SAPLING.get().asItem(),
                GravitationBlocks.BELADON_SAPLING.get().asItem()
        );

        this.tag(GraviTags.Items.CAN_CREATE_ENCHANTING_TABLE).add(AetherItems.GOLDEN_AMBER.get());

        this.tag(AetherTags.Items.FREEZABLE_RINGS).add(GravitationItems.BRONZITE_RING.get());
        this.tag(AetherTags.Items.FREEZABLE_PENDANTS).add(GravitationItems.BRONZITE_PENDANT.get());

        this.tag(GraviTags.Items.BATTLEAXES).add(
                GravitationItems.NEPTUNE_BATTLEAXE.get(),
                GravitationItems.VALKYRIE_BATTLEAXE.get(),
                GravitationItems.GRAVITITE_BATTLEAXE.get(),
                GravitationItems.ZANITE_BATTLEAXE.get(),
                GravitationItems.NETHERITE_BATTLEAXE.get(),
                GravitationItems.DIAMOND_BATTLEAXE.get(),
                GravitationItems.IRON_BATTLEAXE.get(),
                GravitationItems.GOLD_BATTLEAXE.get(),
                GravitationItems.BRONZITE_BATTLEAXE.get()
        );

        this.tag(AetherTags.Items.SKYROOT_TOOL_CRAFTING).add(GravitationBlocks.ENCHANTED_PLANKS.get().asItem());
        this.tag(ItemTags.PICKAXES).add(GravitationItems.BRONZITE_PICKAXE.get(), GravitationItems.NEPTUNE_PICKAXE.get());
        this.tag(AetherTags.Items.TREATED_AS_AETHER_ITEM).add(
                GravitationItems.BRONZITE_PICKAXE.get(),
                GravitationItems.NEPTUNE_PICKAXE.get(),
                GravitationItems.NEPTUNE_AXE.get(),
                GravitationItems.NEPTUNE_CUTLASS.get(),
                GravitationItems.NEPTUNE_SHOVEL.get()
        ).addTag(GraviTags.Items.BATTLEAXES);

        this.tag(GraviTags.Items.BRONZITE_REPAIRING).add(GravitationItems.BRONZITE_INGOT.get());
        this.tag(GraviTags.Items.INGOT_BRONZITE).add(GravitationItems.BRONZITE_INGOT.get());
        this.tag(GraviTags.Items.NUGGET_BRONZITE).add(GravitationItems.BRONZITE_NUGGET.get());

        this.tag(AetherTags.Items.AETHER_RING).add(GravitationItems.BRONZITE_RING.get(), GravitationItems.NEPTUNE_RING.get());

        this.tag(AetherTags.Items.AETHER_PENDANT).add(GravitationItems.BRONZITE_PENDANT.get(), GravitationItems.NEPTUNE_PENDANT.get());

        this.tag(AetherTags.Items.FREEZABLE_PENDANTS).add(GravitationItems.BRONZITE_PENDANT.get(), GravitationItems.NEPTUNE_PENDANT.get());

        this.tag(AetherTags.Items.AETHER_GLOVES).add(GravitationItems.BRONZITE_GLOVES.get());

        this.tag(AetherTags.Items.AETHER_CAPE).add(GravitationItems.BRONZITE_CAPE.get());

        this.tag(GraviTags.Items.BRONZITE_ORE).add(GravitationBlocks.BRONZITE_ORE.get().asItem(), GravitationBlocks.BRONZITE_ICESTONE_ORE.get().asItem());
    }
}
