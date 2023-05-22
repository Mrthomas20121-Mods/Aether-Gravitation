package mrthomas20121.gravitation.data;

import com.aetherteam.aether.data.providers.AetherItemModelProvider;
import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.block.GraviBlocks;
import mrthomas20121.gravitation.item.GraviItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.data.ExistingFileHelper;

public class GraviItemData extends AetherItemModelProvider {

    public GraviItemData(PackOutput output, ExistingFileHelper helper) {
        super(output, Gravitation.MOD_ID, helper);
    }

    @Override
    protected void registerModels() {
        this.item(GraviItems.ENCHANTED_CHEST_BOAT.get(),  "");
        this.item(GraviItems.ENCHANTED_BOAT.get(),  "");
        this.item(GraviBlocks.ENCHANTED_SAPLING.get().asItem(), "");
        this.itemBlock(GraviBlocks.BRONZITE_BLOCK.get());
        this.itemBlock(GraviBlocks.BRONZITE_ORE.get());
        this.itemBlock(GraviBlocks.BRONZITE_ICESTONE_ORE.get());
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
        this.item(GraviBlocks.ENCHANTED_WALL_SIGN.get().asItem(), "");
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
        this.dartShooterItem(GraviItems.PHOENIX_DART_SHOOTER.get(), "");
        this.item(GraviItems.PHOENIX_DART.get(), "");
        this.itemBlock(GraviBlocks.ENCHANTED_BOOKSHELF.get());
    }
}
