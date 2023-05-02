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
        this.item(GraviItems.NEPTUNE_AXE.get(), "");
        this.item(GraviItems.NEPTUNE_BATTLEAXE.get(), "");
        this.item(GraviItems.NEPTUNE_CUTLASS.get(), "");
        this.item(GraviItems.NEPTUNE_PICKAXE.get(), "");
        this.item(GraviItems.NEPTUNE_SHOVEL.get(), "");
        this.item(GraviItems.GRAVITITE_BATTLEAXE.get(), "");
        this.item(GraviItems.ZANITE_BATTLEAXE.get(), "");
        this.item(GraviItems.VALKYRIE_BATTLEAXE.get(), "");
        this.item(GraviItems.PHOENIX_DART_SHOOTER.get(), "");
        this.item(GraviItems.PHOENIX_DART.get(), "");
    }
}
