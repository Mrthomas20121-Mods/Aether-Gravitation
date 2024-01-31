package mrthomas20121.gravitation.data;

import com.aetherteam.aether.block.AetherBlocks;
import com.aetherteam.aether.data.providers.AetherBlockStateProvider;
import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.block.GravitationBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.data.ExistingFileHelper;

public class GravitationBlockstateData extends AetherBlockStateProvider {

    public GravitationBlockstateData(PackOutput output, ExistingFileHelper helper) {
        super(output, Gravitation.MOD_ID, helper);
    }

    @Override
    protected void registerStatesAndModels() {

        this.block(GravitationBlocks.ENCHANTED_MOSS.get(), "natural/");
        this.block(GravitationBlocks.BRONZITE_ORE.get(), "natural/");
        this.block(GravitationBlocks.BRONZITE_ICESTONE_ORE.get(), "natural/");
        this.block(GravitationBlocks.BRONZITE_BLOCK.get(), "construction/");
        this.grass(GravitationBlocks.AER_GRASS.get(), AetherBlocks.AETHER_DIRT.get());

        // aerfin set
        this.pottedPlant(GravitationBlocks.POTTED_AERFIN_SAPLING.get(), GravitationBlocks.AERFIN_SAPLING.get(), "natural/");
        this.pottedPlant(GravitationBlocks.POTTED_BLUE_AERFIN_SAPLING.get(), GravitationBlocks.BLUE_AERFIN_SAPLING.get(), "natural/");
        this.pottedPlant(GravitationBlocks.POTTED_GOLDEN_AERFIN_SAPLING.get(), GravitationBlocks.GOLDEN_AERFIN_SAPLING.get(), "natural/");
        this.block(GravitationBlocks.AERFIN_PLANKS.get(), "natural/");
        this.block(GravitationBlocks.AERFIN_LEAVES.get(), "natural/");
        this.block(GravitationBlocks.BLUE_AERFIN_LEAVES.get(), "natural/");
        this.block(GravitationBlocks.GOLDEN_AERFIN_LEAVES.get(), "natural/");
        this.log(GravitationBlocks.AERFIN_LOG.get());
        this.log(GravitationBlocks.STRIPPED_AERFIN_LOG.get());
        this.wood(GravitationBlocks.AERFIN_WOOD.get(), GravitationBlocks.AERFIN_LOG.get());
        this.wood(GravitationBlocks.STRIPPED_AERFIN_WOOD.get(), GravitationBlocks.STRIPPED_AERFIN_LOG.get());
        this.doorBlock(GravitationBlocks.AERFIN_DOOR.get(), new ResourceLocation("gravitation:block/natural/aerfin_door_bottom"), new ResourceLocation("gravitation:block/natural/aerfin_door_top"));
        this.trapdoorBlock(GravitationBlocks.AERFIN_TRAPDOOR.get(), new ResourceLocation("gravitation:block/natural/aerfin_trapdoor"), true);
        this.stairs(GravitationBlocks.AERFIN_STAIRS.get(), GravitationBlocks.AERFIN_PLANKS.get(), "natural/");
        this.slab(GravitationBlocks.AERFIN_SLAB.get(), GravitationBlocks.AERFIN_PLANKS.get(), "natural/");
        this.fence(GravitationBlocks.AERFIN_FENCE.get(), GravitationBlocks.AERFIN_PLANKS.get(), "natural/");
        this.fenceGateBlock(GravitationBlocks.AERFIN_FENCE_GATE.get(), GravitationBlocks.AERFIN_PLANKS.get(), "natural/");
        this.buttonBlock(GravitationBlocks.AERFIN_BUTTON.get(), new ResourceLocation("gravitation:block/natural/aerfin_planks"));
        this.pressurePlateBlock(GravitationBlocks.AERFIN_PREASURE_PLATE.get(), new ResourceLocation("gravitation:block/natural/aerfin_planks"));
        this.bookshelf(GravitationBlocks.AERFIN_BOOKSHELF.get(), GravitationBlocks.AERFIN_PLANKS.get());
        this.signBlock(GravitationBlocks.AERFIN_SIGN.get(), GravitationBlocks.AERFIN_WALL_SIGN.get(), this.texture(this.name(GravitationBlocks.AERFIN_PLANKS.get()), "natural/"));
        this.hangingSignBlock(GravitationBlocks.AERFIN_HANGING_SIGN.get(), GravitationBlocks.AERFIN_WALL_HANGING_SIGN.get(), this.texture(this.name(GravitationBlocks.AERFIN_PLANKS.get()), "natural/"));
        this.saplingBlock(GravitationBlocks.AERFIN_SAPLING.get(), "natural/");
        this.saplingBlock(GravitationBlocks.BLUE_AERFIN_SAPLING.get(), "natural/");
        this.saplingBlock(GravitationBlocks.GOLDEN_AERFIN_SAPLING.get(), "natural/");

        // beladon set
        this.pottedPlant(GravitationBlocks.POTTED_BELADON_SAPLING.get(), GravitationBlocks.BELADON_SAPLING.get(), "natural/");
        this.block(GravitationBlocks.BELADON_PLANKS.get(), "natural/");
        this.block(GravitationBlocks.BELADON_LEAVES.get(), "natural/");
        this.log(GravitationBlocks.BELADON_LOG.get());
        this.log(GravitationBlocks.STRIPPED_BELADON_LOG.get());
        this.wood(GravitationBlocks.BELADON_WOOD.get(), GravitationBlocks.BELADON_LOG.get());
        this.wood(GravitationBlocks.STRIPPED_BELADON_WOOD.get(), GravitationBlocks.STRIPPED_BELADON_LOG.get());
        this.doorBlock(GravitationBlocks.BELADON_DOOR.get(), new ResourceLocation("gravitation:block/natural/beladon_door_bottom"), new ResourceLocation("gravitation:block/natural/beladon_door_top"));
        this.trapdoorBlock(GravitationBlocks.BELADON_TRAPDOOR.get(), new ResourceLocation("gravitation:block/natural/beladon_trapdoor"), true);
        this.stairs(GravitationBlocks.BELADON_STAIRS.get(), GravitationBlocks.BELADON_PLANKS.get(), "natural/");
        this.slab(GravitationBlocks.BELADON_SLAB.get(), GravitationBlocks.BELADON_PLANKS.get(), "natural/");
        this.fence(GravitationBlocks.BELADON_FENCE.get(), GravitationBlocks.BELADON_PLANKS.get(), "natural/");
        this.fenceGateBlock(GravitationBlocks.BELADON_FENCE_GATE.get(), GravitationBlocks.BELADON_PLANKS.get(), "natural/");
        this.buttonBlock(GravitationBlocks.BELADON_BUTTON.get(), new ResourceLocation("gravitation:block/natural/beladon_planks"));
        this.pressurePlateBlock(GravitationBlocks.BELADON_PREASURE_PLATE.get(), new ResourceLocation("gravitation:block/natural/beladon_planks"));
        this.bookshelf(GravitationBlocks.BELADON_BOOKSHELF.get(), GravitationBlocks.BELADON_PLANKS.get());
        this.signBlock(GravitationBlocks.BELADON_SIGN.get(), GravitationBlocks.BELADON_WALL_SIGN.get(), this.texture(this.name(GravitationBlocks.BELADON_PLANKS.get()), "natural/"));
        this.hangingSignBlock(GravitationBlocks.BELADON_HANGING_SIGN.get(), GravitationBlocks.BELADON_WALL_HANGING_SIGN.get(), this.texture(this.name(GravitationBlocks.BELADON_PLANKS.get()), "natural/"));
        this.saplingBlock(GravitationBlocks.BELADON_SAPLING.get(), "natural/");

        // enchanted set
        this.pottedPlant(GravitationBlocks.POTTED_ENCHANTED_SAPLING.get(), GravitationBlocks.ENCHANTED_SAPLING.get(), "natural/");
        this.block(GravitationBlocks.ENCHANTED_PLANKS.get(), "natural/");
        this.block(GravitationBlocks.ENCHANTED_LEAVES.get(), "natural/");
        this.log(GravitationBlocks.ENCHANTED_LOG.get());
        this.log(GravitationBlocks.STRIPPED_ENCHANTED_LOG.get());
        this.wood(GravitationBlocks.ENCHANTED_WOOD.get(), GravitationBlocks.ENCHANTED_LOG.get());
        this.wood(GravitationBlocks.STRIPPED_ENCHANTED_WOOD.get(), GravitationBlocks.STRIPPED_ENCHANTED_LOG.get());
        this.signBlock(GravitationBlocks.ENCHANTED_SIGN.get(), GravitationBlocks.ENCHANTED_WALL_SIGN.get(), this.texture(this.name(GravitationBlocks.ENCHANTED_PLANKS.get()), "natural/"));
        this.hangingSignBlock(GravitationBlocks.ENCHANTED_HANGING_SIGN.get(), GravitationBlocks.ENCHANTED_WALL_HANGING_SIGN.get(), this.texture(this.name(GravitationBlocks.ENCHANTED_PLANKS.get()), "natural/"));
        this.saplingBlock(GravitationBlocks.ENCHANTED_SAPLING.get(), "natural/");
        this.doorBlock(GravitationBlocks.ENCHANTED_DOOR.get(), new ResourceLocation("gravitation:block/natural/enchanted_door_bottom"), new ResourceLocation("gravitation:block/natural/enchanted_door_top"));
        this.trapdoorBlock(GravitationBlocks.ENCHANTED_TRAPDOOR.get(), new ResourceLocation("gravitation:block/natural/enchanted_trapdoor"), true);
        this.stairs(GravitationBlocks.ENCHANTED_STAIRS.get(), GravitationBlocks.ENCHANTED_PLANKS.get(), "natural/");
        this.slab(GravitationBlocks.ENCHANTED_SLAB.get(), GravitationBlocks.ENCHANTED_PLANKS.get(), "natural/");
        this.fence(GravitationBlocks.ENCHANTED_FENCE.get(), GravitationBlocks.ENCHANTED_PLANKS.get(), "natural/");
        this.fenceGateBlock(GravitationBlocks.ENCHANTED_FENCE_GATE.get(), GravitationBlocks.ENCHANTED_PLANKS.get(), "natural/");
        this.buttonBlock(GravitationBlocks.ENCHANTED_BUTTON.get(), new ResourceLocation("gravitation:block/natural/enchanted_planks"));
        this.pressurePlateBlock(GravitationBlocks.ENCHANTED_PREASURE_PLATE.get(), new ResourceLocation("gravitation:block/natural/enchanted_planks"));
        this.bookshelf(GravitationBlocks.ENCHANTED_BOOKSHELF.get(), GravitationBlocks.ENCHANTED_PLANKS.get());

        // conglomerate
        this.block(GravitationBlocks.CONGLOMERATE.get(), "natural/");
        this.wallBlock(GravitationBlocks.CONGLOMERATE_WALLS.get(), new ResourceLocation("gravitation:block/natural/conglomerate"));
        this.stairsBlock(GravitationBlocks.CONGLOMERATE_STAIRS.get(), new ResourceLocation("gravitation:block/natural/conglomerate"));
        this.slab(GravitationBlocks.CONGLOMERATE_SLAB.get(), GravitationBlocks.CONGLOMERATE.get(), "natural/");

        this.block(GravitationBlocks.CONGLOMERATE_BRICKS.get(), "natural/");
        this.wallBlock(GravitationBlocks.CONGLOMERATE_BRICK_WALLS.get(), new ResourceLocation("gravitation:block/natural/conglomerate_bricks"));
        this.stairsBlock(GravitationBlocks.CONGLOMERATE_BRICK_STAIRS.get(), new ResourceLocation("gravitation:block/natural/conglomerate_bricks"));
        this.slab(GravitationBlocks.CONGLOMERATE_BRICK_SLAB.get(), GravitationBlocks.CONGLOMERATE_BRICKS.get(), "natural/");

        this.block(GravitationBlocks.POLISHED_CONGLOMERATE.get(), "natural/");
        this.wallBlock(GravitationBlocks.POLISHED_CONGLOMERATE_WALLS.get(), new ResourceLocation("gravitation:block/natural/polished_conglomerate"));
        this.stairsBlock(GravitationBlocks.POLISHED_CONGLOMERATE_STAIRS.get(), new ResourceLocation("gravitation:block/natural/polished_conglomerate"));
        this.slab(GravitationBlocks.POLISHED_CONGLOMERATE_SLAB.get(), GravitationBlocks.POLISHED_CONGLOMERATE.get(), "natural/");
    }
}
