package mrthomas20121.gravitation.data;

import com.aetherteam.aether.data.providers.AetherItemModelProvider;
import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.block.GravitationBlocks;
import mrthomas20121.gravitation.item.GravitationItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.data.ExistingFileHelper;

public class GravitationItemData extends AetherItemModelProvider {

    public GravitationItemData(PackOutput output, ExistingFileHelper helper) {
        super(output, Gravitation.MOD_ID, helper);
    }

    @Override
    protected void registerModels() {
        this.item(GravitationItems.GREATER_HEALING_STONE.get(), "");
        this.item(GravitationItems.POWER_STONE.get(), "");
        this.item(GravitationItems.DENSE_STONE.get(), "");
        this.item(GravitationItems.DIG_STONE.get(), "");
        this.item(GravitationItems.RAINBOW_STONE.get(), "");

        this.item(GravitationItems.AECHOR_STRING.get(), "");

        this.item(GravitationItems.BRONZITE_UPGRADE.get(), "");
        this.itemBlock(GravitationBlocks.BRONZITE_BLOCK.get());
        this.itemBlock(GravitationBlocks.BRONZITE_ORE.get());
        this.itemBlock(GravitationBlocks.BRONZITE_ICESTONE_ORE.get());
        this.itemBlock(GravitationBlocks.ENCHANTED_MOSS.get());
        this.itemBlock(GravitationBlocks.AER_GRASS.get());

        // aerfin set
        this.item(GravitationItems.AERFIN_BOAT.get(), "");
        this.item(GravitationItems.AERFIN_CHEST_BOAT.get(), "");
        this.item(GravitationBlocks.AERFIN_SAPLING.get().asItem(), "");
        this.item(GravitationBlocks.BLUE_AERFIN_SAPLING.get().asItem(), "");
        this.item(GravitationBlocks.GOLDEN_AERFIN_SAPLING.get().asItem(), "");
        this.itemBlock(GravitationBlocks.AERFIN_LEAVES.get());
        this.itemBlock(GravitationBlocks.BLUE_AERFIN_LEAVES.get());
        this.itemBlock(GravitationBlocks.GOLDEN_AERFIN_LEAVES.get());
        this.itemBlock(GravitationBlocks.AERFIN_PLANKS.get());
        this.itemBlock(GravitationBlocks.AERFIN_LOG.get());
        this.itemBlock(GravitationBlocks.AERFIN_WOOD.get());
        this.itemBlock(GravitationBlocks.STRIPPED_AERFIN_LOG.get());
        this.itemBlock(GravitationBlocks.STRIPPED_AERFIN_WOOD.get());
        this.itemBlock(GravitationBlocks.AERFIN_BOOKSHELF.get());
        this.itemBlock(GravitationBlocks.AERFIN_STAIRS.get());
        this.itemBlock(GravitationBlocks.AERFIN_SLAB.get());
        this.item(GravitationBlocks.AERFIN_DOOR.get().asItem(), "");
        this.buttonInventory("aerfin_button", new ResourceLocation("gravitation:block/natural/aerfin_planks"));
        this.fenceInventory("aerfin_fence", new ResourceLocation("gravitation:block/natural/aerfin_planks"));
        this.itemBlock(GravitationBlocks.AERFIN_FENCE_GATE.get());
        this.itemBlock(GravitationBlocks.AERFIN_TRAPDOOR.get(), "_bottom");
        this.itemBlock(GravitationBlocks.AERFIN_PREASURE_PLATE.get());
        this.item(GravitationBlocks.AERFIN_SIGN.get().asItem(), "");
        this.item(GravitationBlocks.AERFIN_HANGING_SIGN.get().asItem(), "");

        // beladon set
        this.item(GravitationItems.BELADON_CHEST_BOAT.get(),  "");
        this.item(GravitationItems.BELADON_BOAT.get(),  "");
        this.item(GravitationBlocks.BELADON_SAPLING.get().asItem(), "");
        this.itemBlock(GravitationBlocks.BELADON_LEAVES.get());
        this.itemBlock(GravitationBlocks.BELADON_PLANKS.get());
        this.itemBlock(GravitationBlocks.BELADON_LOG.get());
        this.itemBlock(GravitationBlocks.BELADON_WOOD.get());
        this.itemBlock(GravitationBlocks.STRIPPED_BELADON_LOG.get());
        this.itemBlock(GravitationBlocks.STRIPPED_BELADON_WOOD.get());
        this.itemBlock(GravitationBlocks.BELADON_BOOKSHELF.get());
        this.itemBlock(GravitationBlocks.BELADON_STAIRS.get());
        this.itemBlock(GravitationBlocks.BELADON_SLAB.get());
        this.item(GravitationBlocks.BELADON_DOOR.get().asItem(), "");
        this.buttonInventory("beladon_button", new ResourceLocation("gravitation:block/natural/beladon_planks"));
        this.fenceInventory("beladon_fence", new ResourceLocation("gravitation:block/natural/beladon_planks"));
        this.itemBlock(GravitationBlocks.BELADON_FENCE_GATE.get());
        this.itemBlock(GravitationBlocks.BELADON_TRAPDOOR.get(), "_bottom");
        this.itemBlock(GravitationBlocks.BELADON_PREASURE_PLATE.get());
        this.item(GravitationBlocks.BELADON_SIGN.get().asItem(), "");
        this.item(GravitationBlocks.BELADON_HANGING_SIGN.get().asItem(), "");

        // enchanted set
        this.item(GravitationItems.ENCHANTED_CHEST_BOAT.get(),  "");
        this.item(GravitationItems.ENCHANTED_BOAT.get(),  "");
        this.item(GravitationBlocks.ENCHANTED_SAPLING.get().asItem(), "");
        this.itemBlock(GravitationBlocks.ENCHANTED_LEAVES.get());
        this.itemBlock(GravitationBlocks.ENCHANTED_PLANKS.get());
        this.itemBlock(GravitationBlocks.ENCHANTED_LOG.get());
        this.itemBlock(GravitationBlocks.ENCHANTED_WOOD.get());
        this.itemBlock(GravitationBlocks.STRIPPED_ENCHANTED_LOG.get());
        this.itemBlock(GravitationBlocks.STRIPPED_ENCHANTED_WOOD.get());
        this.itemBlock(GravitationBlocks.ENCHANTED_STAIRS.get());
        this.itemBlock(GravitationBlocks.ENCHANTED_SLAB.get());
        this.item(GravitationBlocks.ENCHANTED_DOOR.get().asItem(), "");
        this.buttonInventory("enchanted_button", new ResourceLocation("gravitation:block/natural/enchanted_planks"));
        this.fenceInventory("enchanted_fence", new ResourceLocation("gravitation:block/natural/enchanted_planks"));
        this.itemBlock(GravitationBlocks.ENCHANTED_FENCE_GATE.get());
        this.itemBlock(GravitationBlocks.ENCHANTED_TRAPDOOR.get(), "_bottom");
        this.itemBlock(GravitationBlocks.ENCHANTED_PREASURE_PLATE.get());
        this.item(GravitationBlocks.ENCHANTED_SIGN.get().asItem(), "");
        this.item(GravitationBlocks.ENCHANTED_HANGING_SIGN.get().asItem(), "");

        this.handheldItem(GravitationItems.NEPTUNE_AXE.get(), "");
        this.handheldItem(GravitationItems.NEPTUNE_BATTLEAXE.get(), "");
        this.handheldItem(GravitationItems.NEPTUNE_CUTLASS.get(), "");
        this.handheldItem(GravitationItems.NEPTUNE_PICKAXE.get(), "");
        this.handheldItem(GravitationItems.NEPTUNE_SHOVEL.get(), "");
        this.item(GravitationItems.NEPTUNE_RING.get(), "");
        this.item(GravitationItems.NEPTUNE_PENDANT.get(), "");
        this.item(GravitationItems.BRONZITE_RING.get(), "");
        this.handheldItem(GravitationItems.BRONZITE_AXE.get(), "");
        this.item(GravitationItems.BRONZITE_INGOT.get(), "");
        this.item(GravitationItems.BRONZITE_NUGGET.get(), "");
        this.handheldItem(GravitationItems.BRONZITE_BATTLEAXE.get(), "");
        this.handheldItem(GravitationItems.BRONZITE_PICKAXE.get(), "");
        this.handheldItem(GravitationItems.BRONZITE_HOE.get(), "");
        this.handheldItem(GravitationItems.BRONZITE_Shovel.get(), "");
        this.handheldItem(GravitationItems.BRONZITE_SWORD.get(), "");
        this.item(GravitationItems.BRONZITE_RING.get(), "");
        this.item(GravitationItems.BRONZITE_PENDANT.get(), "");
        this.item(GravitationItems.BRONZITE_ROCK.get(), "");
        this.item(GravitationItems.BRONZITE_HELMET.get(), "");
        this.item(GravitationItems.BRONZITE_CHESTPLATE.get(), "");
        this.item(GravitationItems.BRONZITE_LEGGING.get(), "");
        this.item(GravitationItems.BRONZITE_BOOTS.get(), "");
        this.item(GravitationItems.BRONZITE_GLOVES.get(), "");
        this.item(GravitationItems.BRONZITE_CAPE.get(), "");
        this.handheldItem(GravitationItems.GRAVITITE_BATTLEAXE.get(), "");
        this.handheldItem(GravitationItems.ZANITE_BATTLEAXE.get(), "");
        this.handheldItem(GravitationItems.VALKYRIE_BATTLEAXE.get(), "");
        this.handheldItem(GravitationItems.NETHERITE_BATTLEAXE.get(), "");
        this.handheldItem(GravitationItems.DIAMOND_BATTLEAXE.get(), "");
        this.handheldItem(GravitationItems.IRON_BATTLEAXE.get(), "");
        this.handheldItem(GravitationItems.GOLD_BATTLEAXE.get(), "");
        this.itemBlock(GravitationBlocks.ENCHANTED_BOOKSHELF.get());

        // conglomerate
        this.itemBlock(GravitationBlocks.CONGLOMERATE.get());
        this.itemWallBlock(GravitationBlocks.CONGLOMERATE_WALLS.get(), GravitationBlocks.CONGLOMERATE.get(), "natural/");
        this.itemBlock(GravitationBlocks.CONGLOMERATE_STAIRS.get());
        this.itemBlock(GravitationBlocks.CONGLOMERATE_SLAB.get());

        this.itemBlock(GravitationBlocks.CONGLOMERATE_BRICKS.get());
        this.itemWallBlock(GravitationBlocks.CONGLOMERATE_BRICK_WALLS.get(), GravitationBlocks.CONGLOMERATE_BRICKS.get(), "natural/");
        this.itemBlock(GravitationBlocks.CONGLOMERATE_BRICK_STAIRS.get());
        this.itemBlock(GravitationBlocks.CONGLOMERATE_BRICK_SLAB.get());

        this.itemBlock(GravitationBlocks.POLISHED_CONGLOMERATE.get());
        this.itemWallBlock(GravitationBlocks.POLISHED_CONGLOMERATE_WALLS.get(), GravitationBlocks.POLISHED_CONGLOMERATE.get(), "natural/");
        this.itemBlock(GravitationBlocks.POLISHED_CONGLOMERATE_STAIRS.get());
        this.itemBlock(GravitationBlocks.POLISHED_CONGLOMERATE_SLAB.get());
    }

}
