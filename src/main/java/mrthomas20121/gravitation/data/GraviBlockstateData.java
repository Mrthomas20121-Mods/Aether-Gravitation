package mrthomas20121.gravitation.data;

import com.aetherteam.aether.block.AetherBlocks;
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
        this.grass(GraviBlocks.AER_GRASS.get(), AetherBlocks.AETHER_DIRT.get());

        // aerfin set
        this.block(GraviBlocks.AERFIN_PLANKS.get(), "natural/");
        this.block(GraviBlocks.AERFIN_LEAVES.get(), "natural/");
        this.block(GraviBlocks.BLUE_AERFIN_LEAVES.get(), "natural/");
        this.block(GraviBlocks.GOLDEN_AERFIN_LEAVES.get(), "natural/");
        this.log(GraviBlocks.AERFIN_LOG.get());
        this.log(GraviBlocks.STRIPPED_AERFIN_LOG.get());
        this.wood(GraviBlocks.AERFIN_WOOD.get(), GraviBlocks.AERFIN_LOG.get());
        this.wood(GraviBlocks.STRIPPED_AERFIN_WOOD.get(), GraviBlocks.STRIPPED_AERFIN_LOG.get());
        this.doorBlock(GraviBlocks.AERFIN_DOOR.get(), new ResourceLocation("gravitation:block/natural/aerfin_door_bottom"), new ResourceLocation("gravitation:block/natural/aerfin_door_top"));
        this.trapdoorBlock(GraviBlocks.AERFIN_TRAPDOOR.get(), new ResourceLocation("gravitation:block/natural/aerfin_trapdoor"), true);
        this.stairs(GraviBlocks.AERFIN_STAIRS.get(), GraviBlocks.AERFIN_PLANKS.get(), "natural/");
        this.slab(GraviBlocks.AERFIN_SLAB.get(), GraviBlocks.AERFIN_PLANKS.get(), "natural/");
        this.fence(GraviBlocks.AERFIN_FENCE.get(), GraviBlocks.AERFIN_PLANKS.get(), "natural/");
        this.fenceGateBlock(GraviBlocks.AERFIN_FENCE_GATE.get(), GraviBlocks.AERFIN_PLANKS.get(), "natural/");
        this.buttonBlock(GraviBlocks.AERFIN_BUTTON.get(), new ResourceLocation("gravitation:block/natural/aerfin_planks"));
        this.pressurePlateBlock(GraviBlocks.AERFIN_PREASURE_PLATE.get(), new ResourceLocation("gravitation:block/natural/aerfin_planks"));
        this.bookshelf(GraviBlocks.AERFIN_BOOKSHELF.get(), GraviBlocks.AERFIN_PLANKS.get());
        this.signBlock(GraviBlocks.AERFIN_SIGN.get(), GraviBlocks.AERFIN_WALL_SIGN.get(), this.texture(this.name(GraviBlocks.AERFIN_PLANKS.get()), "natural/"));
        this.hangingSignBlock(GraviBlocks.AERFIN_HANGING_SIGN.get(), GraviBlocks.AERFIN_WALL_HANGING_SIGN.get(), this.texture(this.name(GraviBlocks.AERFIN_PLANKS.get()), "natural/"));
        this.saplingBlock(GraviBlocks.AERFIN_SAPLING.get(), "natural/");
        this.saplingBlock(GraviBlocks.BLUE_AERFIN_SAPLING.get(), "natural/");
        this.saplingBlock(GraviBlocks.GOLDEN_AERFIN_SAPLING.get(), "natural/");

        // beladon set
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
        this.hangingSignBlock(GraviBlocks.BELADON_HANGING_SIGN.get(), GraviBlocks.BELADON_WALL_HANGING_SIGN.get(), this.texture(this.name(GraviBlocks.BELADON_PLANKS.get()), "natural/"));
        this.saplingBlock(GraviBlocks.BELADON_SAPLING.get(), "natural/");

        // enchanted set
        this.block(GraviBlocks.ENCHANTED_PLANKS.get(), "natural/");
        this.block(GraviBlocks.ENCHANTED_LEAVES.get(), "natural/");
        this.log(GraviBlocks.ENCHANTED_LOG.get());
        this.log(GraviBlocks.STRIPPED_ENCHANTED_LOG.get());
        this.wood(GraviBlocks.ENCHANTED_WOOD.get(), GraviBlocks.ENCHANTED_LOG.get());
        this.wood(GraviBlocks.STRIPPED_ENCHANTED_WOOD.get(), GraviBlocks.STRIPPED_ENCHANTED_LOG.get());
        this.signBlock(GraviBlocks.ENCHANTED_SIGN.get(), GraviBlocks.ENCHANTED_WALL_SIGN.get(), this.texture(this.name(GraviBlocks.ENCHANTED_PLANKS.get()), "natural/"));
        this.hangingSignBlock(GraviBlocks.ENCHANTED_HANGING_SIGN.get(), GraviBlocks.ENCHANTED_WALL_HANGING_SIGN.get(), this.texture(this.name(GraviBlocks.ENCHANTED_PLANKS.get()), "natural/"));
        this.saplingBlock(GraviBlocks.ENCHANTED_SAPLING.get(), "natural/");
        this.doorBlock(GraviBlocks.ENCHANTED_DOOR.get(), new ResourceLocation("gravitation:block/natural/enchanted_door_bottom"), new ResourceLocation("gravitation:block/natural/enchanted_door_top"));
        this.trapdoorBlock(GraviBlocks.ENCHANTED_TRAPDOOR.get(), new ResourceLocation("gravitation:block/natural/enchanted_trapdoor"), true);
        this.stairs(GraviBlocks.ENCHANTED_STAIRS.get(), GraviBlocks.ENCHANTED_PLANKS.get(), "natural/");
        this.slab(GraviBlocks.ENCHANTED_SLAB.get(), GraviBlocks.ENCHANTED_PLANKS.get(), "natural/");
        this.fence(GraviBlocks.ENCHANTED_FENCE.get(), GraviBlocks.ENCHANTED_PLANKS.get(), "natural/");
        this.fenceGateBlock(GraviBlocks.ENCHANTED_FENCE_GATE.get(), GraviBlocks.ENCHANTED_PLANKS.get(), "natural/");
        this.buttonBlock(GraviBlocks.ENCHANTED_BUTTON.get(), new ResourceLocation("gravitation:block/natural/enchanted_planks"));
        this.pressurePlateBlock(GraviBlocks.ENCHANTED_PREASURE_PLATE.get(), new ResourceLocation("gravitation:block/natural/enchanted_planks"));
        this.bookshelf(GraviBlocks.ENCHANTED_BOOKSHELF.get(), GraviBlocks.ENCHANTED_PLANKS.get());

        // conglomerate
        this.block(GraviBlocks.CONGLOMERATE.get(), "natural/");
        this.wallBlock(GraviBlocks.CONGLOMERATE_WALLS.get(), new ResourceLocation("gravitation:block/natural/conglomerate"));
        this.stairsBlock(GraviBlocks.CONGLOMERATE_STAIRS.get(), new ResourceLocation("gravitation:block/natural/conglomerate"));
        this.slab(GraviBlocks.CONGLOMERATE_SLAB.get(), GraviBlocks.CONGLOMERATE.get(), "natural/");

        this.block(GraviBlocks.CONGLOMERATE_BRICKS.get(), "natural/");
        this.wallBlock(GraviBlocks.CONGLOMERATE_BRICK_WALLS.get(), new ResourceLocation("gravitation:block/natural/conglomerate_bricks"));
        this.stairsBlock(GraviBlocks.CONGLOMERATE_BRICK_STAIRS.get(), new ResourceLocation("gravitation:block/natural/conglomerate_bricks"));
        this.slab(GraviBlocks.CONGLOMERATE_BRICK_SLAB.get(), GraviBlocks.CONGLOMERATE_BRICKS.get(), "natural/");

        this.block(GraviBlocks.POLISHED_CONGLOMERATE.get(), "natural/");
        this.wallBlock(GraviBlocks.POLISHED_CONGLOMERATE_WALLS.get(), new ResourceLocation("gravitation:block/natural/polished_conglomerate"));
        this.stairsBlock(GraviBlocks.POLISHED_CONGLOMERATE_STAIRS.get(), new ResourceLocation("gravitation:block/natural/polished_conglomerate"));
        this.slab(GraviBlocks.POLISHED_CONGLOMERATE_SLAB.get(), GraviBlocks.POLISHED_CONGLOMERATE.get(), "natural/");
    }
}
