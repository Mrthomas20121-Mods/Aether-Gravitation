package mrthomas20121.gravitation.data;

import com.aetherteam.aether.data.providers.AetherItemModelProvider;
import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.block.GraviBlocks;
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
        this.itemBlock(GraviBlocks.BRONZITE_BLOCK.get());
        this.itemBlock(GraviBlocks.BRONZITE_ORE.get());
        this.itemBlock(GraviBlocks.BRONZITE_ICESTONE_ORE.get());
        this.itemBlock(GraviBlocks.ENCHANTED_MOSS.get());
        this.itemBlock(GraviBlocks.AER_GRASS.get());

        // aerfin set
        this.item(GravitationItems.AERFIN_BOAT.get(), "");
        this.item(GravitationItems.AERFIN_CHEST_BOAT.get(), "");
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
        this.item(GravitationItems.BELADON_CHEST_BOAT.get(),  "");
        this.item(GravitationItems.BELADON_BOAT.get(),  "");
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
        this.item(GravitationItems.ENCHANTED_CHEST_BOAT.get(),  "");
        this.item(GravitationItems.ENCHANTED_BOAT.get(),  "");
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
