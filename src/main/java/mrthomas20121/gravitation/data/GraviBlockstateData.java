package mrthomas20121.gravitation.data;

import com.aetherteam.aether.data.providers.AetherBlockStateProvider;
import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.block.GraviBlocks;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;

public class GraviBlockstateData extends AetherBlockStateProvider {

    public GraviBlockstateData(PackOutput output, ExistingFileHelper helper) {
        super(output, Gravitation.MOD_ID, helper);
    }

    @Override
    protected void registerStatesAndModels() {
        this.block(GraviBlocks.ENCHANTED_PLANKS.get(), "natural/");
        this.block(GraviBlocks.ENCHANTED_LEAVES.get(), "natural/");
        this.log(GraviBlocks.ENCHANTED_LOG.get());
        this.log(GraviBlocks.STRIPPED_ENCHANTED_LOG.get());
        this.wood(GraviBlocks.ENCHANTED_WOOD.get(), GraviBlocks.ENCHANTED_LOG.get());
        this.wood(GraviBlocks.STRIPPED_ENCHANTED_WOOD.get(), GraviBlocks.STRIPPED_ENCHANTED_LOG.get());

        this.signBlock(GraviBlocks.ENCHANTED_SIGN.get(), GraviBlocks.ENCHANTED_WALL_SIGN.get(), this.texture(this.name(GraviBlocks.ENCHANTED_PLANKS.get()), "natural/"));

        this.saplingBlock(GraviBlocks.ENCHANTED_SAPLING.get(), "natural/");
    }
}
