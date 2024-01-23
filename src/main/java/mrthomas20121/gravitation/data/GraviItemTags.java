package mrthomas20121.gravitation.data;

import com.aetherteam.aether.AetherTags;
import com.aetherteam.aether.item.AetherItems;
import mrthomas20121.gravitation.GraviTags;
import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.block.GraviBlocks;
import mrthomas20121.gravitation.item.GraviItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class GraviItemTags extends ItemTagsProvider {

    public GraviItemTags(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_, CompletableFuture<TagLookup<Block>> p_275322_, ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, Gravitation.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(@NotNull HolderLookup.Provider provider) {
        this.tag(GraviTags.Items.ENCHANTED_LOGS).add(GraviBlocks.ENCHANTED_LOG.get().asItem(), GraviBlocks.ENCHANTED_WOOD.get().asItem(), GraviBlocks.STRIPPED_ENCHANTED_LOG.get().asItem(), GraviBlocks.STRIPPED_ENCHANTED_WOOD.get().asItem());
        this.tag(GraviTags.Items.BELADON_LOGS).add(GraviBlocks.BELADON_LOG.get().asItem(), GraviBlocks.BELADON_WOOD.get().asItem(), GraviBlocks.STRIPPED_BELADON_LOG.get().asItem(), GraviBlocks.STRIPPED_BELADON_WOOD.get().asItem());

        this.tag(Tags.Items.BOOKSHELVES).add(GraviBlocks.ENCHANTED_BOOKSHELF.get().asItem(), GraviBlocks.BELADON_BOOKSHELF.get().asItem());

        this.tag(GraviTags.Items.CAN_CREATE_ENCHANTING_TABLE).add(AetherItems.GOLDEN_AMBER.get());

        this.tag(Tags.Items.STRING).add(GraviItems.AECHOR_STRING.get());

        this.tag(AetherTags.Items.FREEZABLE_RINGS).add(GraviItems.BRONZITE_RING.get());
        this.tag(AetherTags.Items.FREEZABLE_PENDANTS).add(GraviItems.BRONZITE_PENDANT.get());

        this.tag(GraviTags.Items.BATTLEAXES).add(
                GraviItems.NEPTUNE_BATTLEAXE.get(),
                GraviItems.VALKYRIE_BATTLEAXE.get(),
                GraviItems.GRAVITITE_BATTLEAXE.get(),
                GraviItems.ZANITE_BATTLEAXE.get(),
                GraviItems.NETHERITE_BATTLEAXE.get(),
                GraviItems.DIAMOND_BATTLEAXE.get(),
                GraviItems.IRON_BATTLEAXE.get(),
                GraviItems.GOLD_BATTLEAXE.get(),
                GraviItems.BRONZITE_BATTLEAXE.get()
        );

        this.tag(AetherTags.Items.SKYROOT_TOOL_CRAFTING).add(GraviBlocks.ENCHANTED_PLANKS.get().asItem());
        this.tag(ItemTags.PICKAXES).add(GraviItems.BRONZITE_PICKAXE.get(), GraviItems.NEPTUNE_PICKAXE.get());
        this.tag(AetherTags.Items.TREATED_AS_AETHER_ITEM).add(
                GraviItems.BRONZITE_PICKAXE.get(),
                GraviItems.NEPTUNE_PICKAXE.get(),
                GraviItems.NEPTUNE_AXE.get(),
                GraviItems.NEPTUNE_CUTLASS.get(),
                GraviItems.NEPTUNE_SHOVEL.get()
        ).addTag(GraviTags.Items.BATTLEAXES);

        this.tag(GraviTags.Items.BRONZITE_REPAIRING).add(GraviItems.BRONZITE_INGOT.get());
        this.tag(GraviTags.Items.INGOT_BRONZITE).add(GraviItems.BRONZITE_INGOT.get());
        this.tag(GraviTags.Items.NUGGET_BRONZITE).add(GraviItems.BRONZITE_NUGGET.get());

        this.tag(AetherTags.Items.AETHER_RING).add(GraviItems.BRONZITE_RING.get(), GraviItems.NEPTUNE_RING.get());

        this.tag(AetherTags.Items.AETHER_PENDANT).add(GraviItems.BRONZITE_PENDANT.get(), GraviItems.NEPTUNE_PENDANT.get());

        this.tag(AetherTags.Items.FREEZABLE_PENDANTS).add(GraviItems.BRONZITE_PENDANT.get(), GraviItems.NEPTUNE_PENDANT.get());

        this.tag(AetherTags.Items.AETHER_GLOVES).add(GraviItems.BRONZITE_GLOVES.get());

        this.tag(AetherTags.Items.AETHER_CAPE).add(GraviItems.BRONZITE_CAPE.get());

        this.tag(GraviTags.Items.BRONZITE_ORE).add(GraviBlocks.BRONZITE_ORE.get().asItem(), GraviBlocks.BRONZITE_ICESTONE_ORE.get().asItem());
    }
}
