package mrthomas20121.gravitation.data;

import com.aetherteam.aether.data.providers.AetherBlockStateProvider;
import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.block.GraviBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.data.ExistingFileHelper;

public class GraviBlockstateData extends AetherBlockStateProvider {

    public GraviBlockstateData(PackOutput output, ExistingFileHelper helper) {
        super(output, Gravitation.MOD_ID, helper);
    }

    @Override
    protected void registerStatesAndModels() {

        this.block(GraviBlocks.ENCHANTED_MOSS.get(), "natural/");
        this.block(GraviBlocks.BRONZITE_ORE.get(), "natural/");
        this.block(GraviBlocks.BRONZITE_ICESTONE_ORE.get(), "natural/");
        this.block(GraviBlocks.BRONZITE_BLOCK.get(), "construction/");

        this.block(GraviBlocks.BELADON_PLANKS.get(), "natural/");
        this.block(GraviBlocks.BELADON_LEAVES.get(), "natural/");
        this.log(GraviBlocks.BELADON_LOG.get());
        this.log(GraviBlocks.STRIPPED_BELADON_LOG.get());
        this.wood(GraviBlocks.BELADON_WOOD.get(), GraviBlocks.BELADON_LOG.get());
        this.wood(GraviBlocks.STRIPPED_BELADON_WOOD.get(), GraviBlocks.STRIPPED_BELADON_LOG.get());

        this.doorBlock(GraviBlocks.BELADON_DOOR.get(), new ResourceLocation("gravitation:block/natural/beladon_door_bottom"), new ResourceLocation("gravitation:block/natural/beladon_door_top"));
        this.trapdoorBlock(GraviBlocks.BELADON_TRAPDOOR.get(), new ResourceLocation("gravitation:block/natural/beladon_trapdoor"), true);
        this.stairs(GraviBlocks.BELADON_STAIRS.get(), GraviBlocks.BELADON_PLANKS.get(), "natural/");
        this.slab(GraviBlocks.BELADON_SLAB.get(), GraviBlocks.BELADON_PLANKS.get(), "natural/");
        this.fence(GraviBlocks.BELADON_FENCE.get(), GraviBlocks.BELADON_PLANKS.get(), "natural/");
        this.fenceGateBlock(GraviBlocks.BELADON_FENCE_GATE.get(), GraviBlocks.BELADON_PLANKS.get(), "natural/");
        this.buttonBlock(GraviBlocks.BELADON_BUTTON.get(), new ResourceLocation("gravitation:block/natural/beladon_planks"));
        this.pressurePlateBlock(GraviBlocks.BELADON_PREASURE_PLATE.get(), new ResourceLocation("gravitation:block/natural/beladon_planks"));
        this.bookshelf(GraviBlocks.BELADON_BOOKSHELF.get(), GraviBlocks.BELADON_PLANKS.get());

        this.signBlock(GraviBlocks.BELADON_SIGN.get(), GraviBlocks.BELADON_WALL_SIGN.get(), this.texture(this.name(GraviBlocks.BELADON_PLANKS.get()), "natural/"));

        this.saplingBlock(GraviBlocks.BELADON_SAPLING.get(), "natural/");

        this.block(GraviBlocks.ENCHANTED_PLANKS.get(), "natural/");
        this.block(GraviBlocks.ENCHANTED_LEAVES.get(), "natural/");
        this.log(GraviBlocks.ENCHANTED_LOG.get());
        this.log(GraviBlocks.STRIPPED_ENCHANTED_LOG.get());
        this.wood(GraviBlocks.ENCHANTED_WOOD.get(), GraviBlocks.ENCHANTED_LOG.get());
        this.wood(GraviBlocks.STRIPPED_ENCHANTED_WOOD.get(), GraviBlocks.STRIPPED_ENCHANTED_LOG.get());

        this.signBlock(GraviBlocks.ENCHANTED_SIGN.get(), GraviBlocks.ENCHANTED_WALL_SIGN.get(), this.texture(this.name(GraviBlocks.ENCHANTED_PLANKS.get()), "natural/"));

        this.saplingBlock(GraviBlocks.ENCHANTED_SAPLING.get(), "natural/");

        // wood stuff
        this.doorBlock(GraviBlocks.ENCHANTED_DOOR.get(), new ResourceLocation("gravitation:block/natural/enchanted_door_bottom"), new ResourceLocation("gravitation:block/natural/enchanted_door_top"));
        this.trapdoorBlock(GraviBlocks.ENCHANTED_TRAPDOOR.get(), new ResourceLocation("gravitation:block/natural/enchanted_trapdoor"), true);
        this.stairs(GraviBlocks.ENCHANTED_STAIRS.get(), GraviBlocks.ENCHANTED_PLANKS.get(), "natural/");
        this.slab(GraviBlocks.ENCHANTED_SLAB.get(), GraviBlocks.ENCHANTED_PLANKS.get(), "natural/");
        this.fence(GraviBlocks.ENCHANTED_FENCE.get(), GraviBlocks.ENCHANTED_PLANKS.get(), "natural/");
        this.fenceGateBlock(GraviBlocks.ENCHANTED_FENCE_GATE.get(), GraviBlocks.ENCHANTED_PLANKS.get(), "natural/");
        this.buttonBlock(GraviBlocks.ENCHANTED_BUTTON.get(), new ResourceLocation("gravitation:block/natural/enchanted_planks"));
        this.pressurePlateBlock(GraviBlocks.ENCHANTED_PREASURE_PLATE.get(), new ResourceLocation("gravitation:block/natural/enchanted_planks"));
        this.bookshelf(GraviBlocks.ENCHANTED_BOOKSHELF.get(), GraviBlocks.ENCHANTED_PLANKS.get());
    }
}
