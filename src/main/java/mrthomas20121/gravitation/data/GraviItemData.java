package mrthomas20121.gravitation.data;

import com.aetherteam.aether.data.providers.AetherItemModelProvider;
import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.block.GraviBlocks;
import mrthomas20121.gravitation.item.GraviItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.data.ExistingFileHelper;

public class GraviItemData extends AetherItemModelProvider {

    public GraviItemData(PackOutput output, ExistingFileHelper helper) {
        super(output, Gravitation.MOD_ID, helper);
    }

    @Override
    protected void registerModels() {
        this.item(GraviItems.GREATER_HEALING_STONE.get(), "");
        this.item(GraviItems.POWER_STONE.get(), "");
        this.item(GraviItems.DENSE_STONE.get(), "");
        this.item(GraviItems.DIG_STONE.get(), "");
        this.item(GraviItems.RAINBOW_STONE.get(), "");

        this.item(GraviItems.AECHOR_STRING.get(), "");

        this.item(GraviItems.BRONZITE_UPGRADE.get(), "");
        this.itemBlock(GraviBlocks.BRONZITE_BLOCK.get());
        this.itemBlock(GraviBlocks.BRONZITE_ORE.get());
        this.itemBlock(GraviBlocks.BRONZITE_ICESTONE_ORE.get());
        this.itemBlock(GraviBlocks.ENCHANTED_MOSS.get());
        this.itemBlock(GraviBlocks.AER_GRASS.get());

        // aerfin set
        this.item(GraviItems.AERFIN_BOAT.get(), "");
        this.item(GraviItems.AERFIN_CHEST_BOAT.get(), "");
        this.item(GraviBlocks.AERFIN_SAPLING.get().asItem(), "");
        this.item(GraviBlocks.BLUE_AERFIN_SAPLING.get().asItem(), "");
        this.item(GraviBlocks.GOLDEN_AERFIN_SAPLING.get().asItem(), "");
        this.itemBlock(GraviBlocks.AERFIN_LEAVES.get());
        this.itemBlock(GraviBlocks.BLUE_AERFIN_LEAVES.get());
        this.itemBlock(GraviBlocks.GOLDEN_AERFIN_LEAVES.get());
        this.itemBlock(GraviBlocks.AERFIN_PLANKS.get());
        this.itemBlock(GraviBlocks.AERFIN_LOG.get());
        this.itemBlock(GraviBlocks.AERFIN_WOOD.get());
        this.itemBlock(GraviBlocks.STRIPPED_AERFIN_LOG.get());
        this.itemBlock(GraviBlocks.STRIPPED_AERFIN_WOOD.get());
        this.itemBlock(GraviBlocks.AERFIN_BOOKSHELF.get());
        this.itemBlock(GraviBlocks.AERFIN_STAIRS.get());
        this.itemBlock(GraviBlocks.AERFIN_SLAB.get());
        this.item(GraviBlocks.AERFIN_DOOR.get().asItem(), "");
        this.buttonInventory("aerfin_button", new ResourceLocation("gravitation:block/natural/aerfin_planks"));
        this.fenceInventory("aerfin_fence", new ResourceLocation("gravitation:block/natural/aerfin_planks"));
        this.itemBlock(GraviBlocks.AERFIN_FENCE_GATE.get());
        this.itemBlock(GraviBlocks.AERFIN_TRAPDOOR.get(), "_bottom");
        this.itemBlock(GraviBlocks.AERFIN_PREASURE_PLATE.get());
        this.item(GraviBlocks.AERFIN_SIGN.get().asItem(), "");
        this.item(GraviBlocks.AERFIN_HANGING_SIGN.get().asItem(), "");

        // beladon set
        this.item(GraviItems.BELADON_CHEST_BOAT.get(),  "");
        this.item(GraviItems.BELADON_BOAT.get(),  "");
        this.item(GraviBlocks.BELADON_SAPLING.get().asItem(), "");
        this.itemBlock(GraviBlocks.BELADON_LEAVES.get());
        this.itemBlock(GraviBlocks.BELADON_PLANKS.get());
        this.itemBlock(GraviBlocks.BELADON_LOG.get());
        this.itemBlock(GraviBlocks.BELADON_WOOD.get());
        this.itemBlock(GraviBlocks.STRIPPED_BELADON_LOG.get());
        this.itemBlock(GraviBlocks.STRIPPED_BELADON_WOOD.get());
        this.itemBlock(GraviBlocks.BELADON_BOOKSHELF.get());
        this.itemBlock(GraviBlocks.BELADON_STAIRS.get());
        this.itemBlock(GraviBlocks.BELADON_SLAB.get());
        this.item(GraviBlocks.BELADON_DOOR.get().asItem(), "");
        this.buttonInventory("beladon_button", new ResourceLocation("gravitation:block/natural/beladon_planks"));
        this.fenceInventory("beladon_fence", new ResourceLocation("gravitation:block/natural/beladon_planks"));
        this.itemBlock(GraviBlocks.BELADON_FENCE_GATE.get());
        this.itemBlock(GraviBlocks.BELADON_TRAPDOOR.get(), "_bottom");
        this.itemBlock(GraviBlocks.BELADON_PREASURE_PLATE.get());
        this.item(GraviBlocks.BELADON_SIGN.get().asItem(), "");
        this.item(GraviBlocks.BELADON_HANGING_SIGN.get().asItem(), "");

        // enchanted set
        this.item(GraviItems.ENCHANTED_CHEST_BOAT.get(),  "");
        this.item(GraviItems.ENCHANTED_BOAT.get(),  "");
        this.item(GraviBlocks.ENCHANTED_SAPLING.get().asItem(), "");
        this.itemBlock(GraviBlocks.ENCHANTED_LEAVES.get());
        this.itemBlock(GraviBlocks.ENCHANTED_PLANKS.get());
        this.itemBlock(GraviBlocks.ENCHANTED_LOG.get());
        this.itemBlock(GraviBlocks.ENCHANTED_WOOD.get());
        this.itemBlock(GraviBlocks.STRIPPED_ENCHANTED_LOG.get());
        this.itemBlock(GraviBlocks.STRIPPED_ENCHANTED_WOOD.get());
        this.itemBlock(GraviBlocks.ENCHANTED_STAIRS.get());
        this.itemBlock(GraviBlocks.ENCHANTED_SLAB.get());
        this.item(GraviBlocks.ENCHANTED_DOOR.get().asItem(), "");
        this.buttonInventory("enchanted_button", new ResourceLocation("gravitation:block/natural/enchanted_planks"));
        this.fenceInventory("enchanted_fence", new ResourceLocation("gravitation:block/natural/enchanted_planks"));
        this.itemBlock(GraviBlocks.ENCHANTED_FENCE_GATE.get());
        this.itemBlock(GraviBlocks.ENCHANTED_TRAPDOOR.get(), "_bottom");
        this.itemBlock(GraviBlocks.ENCHANTED_PREASURE_PLATE.get());
        this.item(GraviBlocks.ENCHANTED_SIGN.get().asItem(), "");
        this.item(GraviBlocks.ENCHANTED_HANGING_SIGN.get().asItem(), "");

        this.handheldItem(GraviItems.NEPTUNE_AXE.get(), "");
        this.handheldItem(GraviItems.NEPTUNE_BATTLEAXE.get(), "");
        this.handheldItem(GraviItems.NEPTUNE_CUTLASS.get(), "");
        this.handheldItem(GraviItems.NEPTUNE_PICKAXE.get(), "");
        this.handheldItem(GraviItems.NEPTUNE_SHOVEL.get(), "");
        this.item(GraviItems.NEPTUNE_RING.get(), "");
        this.item(GraviItems.NEPTUNE_PENDANT.get(), "");
        this.item(GraviItems.BRONZITE_RING.get(), "");
        this.handheldItem(GraviItems.BRONZITE_AXE.get(), "");
        this.item(GraviItems.BRONZITE_INGOT.get(), "");
        this.item(GraviItems.BRONZITE_NUGGET.get(), "");
        this.handheldItem(GraviItems.BRONZITE_BATTLEAXE.get(), "");
        this.handheldItem(GraviItems.BRONZITE_PICKAXE.get(), "");
        this.handheldItem(GraviItems.BRONZITE_HOE.get(), "");
        this.handheldItem(GraviItems.BRONZITE_Shovel.get(), "");
        this.handheldItem(GraviItems.BRONZITE_SWORD.get(), "");
        this.item(GraviItems.BRONZITE_RING.get(), "");
        this.item(GraviItems.BRONZITE_PENDANT.get(), "");
        this.item(GraviItems.BRONZITE_ROCK.get(), "");
        this.item(GraviItems.BRONZITE_HELMET.get(), "");
        this.item(GraviItems.BRONZITE_CHESTPLATE.get(), "");
        this.item(GraviItems.BRONZITE_LEGGING.get(), "");
        this.item(GraviItems.BRONZITE_BOOTS.get(), "");
        this.item(GraviItems.BRONZITE_GLOVES.get(), "");
        this.item(GraviItems.BRONZITE_CAPE.get(), "");
        this.handheldItem(GraviItems.GRAVITITE_BATTLEAXE.get(), "");
        this.handheldItem(GraviItems.ZANITE_BATTLEAXE.get(), "");
        this.handheldItem(GraviItems.VALKYRIE_BATTLEAXE.get(), "");
        this.handheldItem(GraviItems.NETHERITE_BATTLEAXE.get(), "");
        this.handheldItem(GraviItems.DIAMOND_BATTLEAXE.get(), "");
        this.handheldItem(GraviItems.IRON_BATTLEAXE.get(), "");
        this.handheldItem(GraviItems.GOLD_BATTLEAXE.get(), "");
        this.itemBlock(GraviBlocks.ENCHANTED_BOOKSHELF.get());

        // conglomerate
        this.itemBlock(GraviBlocks.CONGLOMERATE.get());
        this.itemWallBlock(GraviBlocks.CONGLOMERATE_WALLS.get(), GraviBlocks.CONGLOMERATE.get(), "natural/");
        this.itemBlock(GraviBlocks.CONGLOMERATE_STAIRS.get());
        this.itemBlock(GraviBlocks.CONGLOMERATE_SLAB.get());

        this.itemBlock(GraviBlocks.CONGLOMERATE_BRICKS.get());
        this.itemWallBlock(GraviBlocks.CONGLOMERATE_BRICK_WALLS.get(), GraviBlocks.CONGLOMERATE_BRICKS.get(), "natural/");
        this.itemBlock(GraviBlocks.CONGLOMERATE_BRICK_STAIRS.get());
        this.itemBlock(GraviBlocks.CONGLOMERATE_BRICK_SLAB.get());

        this.itemBlock(GraviBlocks.POLISHED_CONGLOMERATE.get());
        this.itemWallBlock(GraviBlocks.POLISHED_CONGLOMERATE_WALLS.get(), GraviBlocks.POLISHED_CONGLOMERATE.get(), "natural/");
        this.itemBlock(GraviBlocks.POLISHED_CONGLOMERATE_STAIRS.get());
        this.itemBlock(GraviBlocks.POLISHED_CONGLOMERATE_SLAB.get());
    }

}
