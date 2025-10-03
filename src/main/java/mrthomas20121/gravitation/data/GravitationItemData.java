package mrthomas20121.gravitation.data;

import com.aetherteam.aether.Aether;
import com.aetherteam.aether.data.providers.AetherItemModelProvider;
import com.aetherteam.nitrogen.data.providers.NitrogenItemModelProvider;
import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.block.GravitationBlocks;
import mrthomas20121.gravitation.item.GravitationItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.common.data.ExistingFileHelper;

public class GravitationItemData extends AetherItemModelProvider {

    public GravitationItemData(PackOutput output, ExistingFileHelper helper) {
        super(output, Gravitation.MOD_ID, helper);
    }

    @Override
    protected void registerModels() {
        this.item(GravitationItems.BRONZITE_UPGRADE.get(), "");
        this.itemBlock(GravitationBlocks.BRONZITE_BLOCK.get());
        this.itemBlock(GravitationBlocks.BRONZITE_ORE.get());
        this.itemBlock(GravitationBlocks.FROZEN_AETHER_GRASS_BLOCK.get());
        this.aercloudItem(GravitationBlocks.ICY_AERCLOUD.get());

        this.item(GravitationItems.BLACK_BERRY.get(), "");
        this.item(GravitationItems.ICED_BLACK_BERRY.get(), "");

        this.itemBlock(GravitationBlocks.BLACK_BERRY_BUSH.get());
        this.itemBlockFlat(GravitationBlocks.BLACK_BERRY_BUSH_STEM.get(), "natural/");

        // aerfin set
        this.item(GravitationItems.AERFIN_BOAT.get(), "");
        this.item(GravitationItems.AERFIN_CHEST_BOAT.get(), "");
        this.itemBlockFlat(GravitationBlocks.AERFIN_SAPLING.get(), "natural/");
        this.itemBlockFlat(GravitationBlocks.ORANGE_AERFIN_SAPLING.get(), "natural/");
        this.itemBlock(GravitationBlocks.AERFIN_LEAVES.get());
        this.itemBlock(GravitationBlocks.ORANGE_AERFIN_LEAVES.get());
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
        this.itemBlockFlat(GravitationBlocks.BELADON_SAPLING.get(), "natural/");
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
        this.itemBlockFlat(GravitationBlocks.ENCHANTED_SAPLING.get(), "natural/");
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
        this.handheldItem(GravitationItems.NEPTUNE_HOE.get(), "");
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
        this.handheldItem(GravitationItems.BRONZITE_SHOVEL.get(), "");
        this.handheldItem(GravitationItems.BRONZITE_SWORD.get(), "");
        this.item(GravitationItems.BRONZITE_RING.get(), "");
        this.item(GravitationItems.BRONZITE_PENDANT.get(), "");
        this.item(GravitationItems.BRONZITE_ROCK.get(), "");
        this.helmetItem(GravitationItems.BRONZITE_HELMET.get(), "");
        this.chestplateItem(GravitationItems.BRONZITE_CHESTPLATE.get(), "");
        this.leggingsItem(GravitationItems.BRONZITE_LEGGING.get(), "");
        this.bootsItem(GravitationItems.BRONZITE_BOOTS.get(), "");
        this.glovesItem(GravitationItems.BRONZITE_GLOVES.get(), "");
        this.item(GravitationItems.BRONZITE_CAPE.get(), "");

        this.item(GravitationItems.ADAMANTITE_GEM.get(), "");
        this.handheldItem(GravitationItems.ADAMANTITE_AXE.get(), "");
        this.handheldItem(GravitationItems.ADAMANTITE_BATTLEAXE.get(), "");
        this.handheldItem(GravitationItems.ADAMANTITE_PICKAXE.get(), "");
        this.handheldItem(GravitationItems.ADAMANTITE_HOE.get(), "");
        this.handheldItem(GravitationItems.ADAMANTITE_SHOVEL.get(), "");
        this.handheldItem(GravitationItems.ADAMANTITE_SWORD.get(), "");
        this.helmetItem(GravitationItems.ADAMANTITE_HELMET.get(), "");
        this.chestplateItem(GravitationItems.ADAMANTITE_CHESTPLATE.get(), "");
        this.leggingsItem(GravitationItems.ADAMANTITE_LEGGING.get(), "");
        this.bootsItem(GravitationItems.ADAMANTITE_BOOTS.get(), "");
        this.glovesItem(GravitationItems.ADAMANTITE_GLOVES.get(), "");
        this.item(GravitationItems.ADAMANTITE_CAPE.get(), "");

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

    public void glovesItem(Item item, String location) {
        ItemModelBuilder builder = this.withExistingParent(this.itemName(item), this.mcLoc("item/generated")).texture("layer0", this.modLoc("item/" + location + this.itemName(item)));
        double index = 0.1;
        for (ResourceKey<TrimMaterial> trimMaterial : NitrogenItemModelProvider.VANILLA_TRIM_MATERIALS) {
            String material = trimMaterial.location().getPath();
            String name = this.itemName(item) + "_" + material + "_trim";
            this.withExistingParent(name, this.mcLoc("item/generated"))
                    .texture("layer0", this.modLoc("item/" + location + this.itemName(item)))
                    .texture("layer1", this.aetherLoc("trims/items/gloves_trim_" + material));
            builder.override().predicate(new ResourceLocation("trim_type"), (float) index).model(this.getExistingFile(this.modLoc("item/" + name))).end();
            index += 0.1;
        }
    }

    private ResourceLocation aetherLoc(String loc) {
        return new ResourceLocation(Aether.MODID, loc);
    }
}
