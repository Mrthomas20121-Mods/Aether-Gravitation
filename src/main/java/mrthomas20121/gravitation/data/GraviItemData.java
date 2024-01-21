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
        this.itemBlock(GraviBlocks.BRONZITE_BLOCK.get());
        this.itemBlock(GraviBlocks.BRONZITE_ORE.get());
        this.itemBlock(GraviBlocks.BRONZITE_ICESTONE_ORE.get());
        this.itemBlock(GraviBlocks.ENCHANTED_MOSS.get());

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
        this.item(GraviBlocks.BELADON_WALL_SIGN.get().asItem(), "");

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
        this.itemBlock(GraviBlocks.ENCHANTED_BOOKSHELF.get());
    }

    public void crossbowItem(Item item) {
        this.withExistingParent(this.itemName(item) + "_pulling_0", this.mcLoc("item/crossbow")).texture("layer0", this.modLoc("item/" + this.itemName(item) + "_pulling_0"));
        this.withExistingParent(this.itemName(item) + "_pulling_1", this.mcLoc("item/crossbow")).texture("layer0", this.modLoc("item/" + this.itemName(item) + "_pulling_1"));
        this.withExistingParent(this.itemName(item) + "_pulling_2", this.mcLoc("item/crossbow")).texture("layer0", this.modLoc("item/" + this.itemName(item) + "_pulling_2"));
        this.withExistingParent(this.itemName(item) + "_arrow", this.mcLoc("item/crossbow")).texture("layer0", this.modLoc("item/" + this.itemName(item) + "_arrow"));
        this.withExistingParent(this.itemName(item) + "_firework", this.mcLoc("item/crossbow")).texture("layer0", this.modLoc("item/" + this.itemName(item) + "_firework"));

        this.withExistingParent(this.itemName(item), this.mcLoc("item/crossbow"))
                .texture("layer0", this.modLoc("item/" + this.itemName(item)  + "_standby"))
                .override().predicate(new ResourceLocation("pulling"), 1).model(this.getExistingFile(this.modLoc("item/" + this.itemName(item) + "_pulling_0"))).end()
                .override().predicate(new ResourceLocation("pulling"), 1).predicate(new ResourceLocation("pull"), 0.58F).model(this.getExistingFile(this.modLoc("item/" + this.itemName(item) + "_pulling_1"))).end()
                .override().predicate(new ResourceLocation("pulling"), 1).predicate(new ResourceLocation("pull"), 1.0F).model(this.getExistingFile(this.modLoc("item/" + this.itemName(item) + "_pulling_2"))).end()
                .override().predicate(new ResourceLocation("charged"), 1).model(this.getExistingFile(this.modLoc("item/" + this.itemName(item) + "_arrow"))).end()
                .override().predicate(new ResourceLocation("charged"), 1).predicate(new ResourceLocation("firework"), 1).model(this.getExistingFile(this.modLoc("item/" + this.itemName(item) + "_firework"))).end();
    }
}
