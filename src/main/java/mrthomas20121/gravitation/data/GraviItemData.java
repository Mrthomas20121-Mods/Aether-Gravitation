package mrthomas20121.gravitation.data;

import com.aetherteam.aether.data.providers.AetherItemModelProvider;
import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.block.GraviBlocks;
import mrthomas20121.gravitation.item.GraviItems;
import net.minecraft.data.PackOutput;
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
        this.itemBlock(GraviBlocks.ENCHANTED_SIGN.get());
    }
}
