package mrthomas20121.gravitation.block;

import com.aetherteam.aether.block.AetherBlocks;
import com.aetherteam.aether.block.construction.BookshelfBlock;
import com.aetherteam.aether.block.natural.AetherDoubleDropsLeaves;
import com.aetherteam.aether.block.natural.AetherGrassBlock;
import com.aetherteam.aether.block.natural.AetherLogBlock;
import com.aetherteam.aether.mixin.mixins.common.accessor.FireBlockAccessor;
import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.block.wood.*;
import mrthomas20121.gravitation.block_entity.EnchantedHangingSignBlockEntity;
import mrthomas20121.gravitation.item.GravitationItems;
import mrthomas20121.gravitation.util.ToolAction;
import mrthomas20121.gravitation.world.treegrower.*;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.HangingSignItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;
import java.util.function.Supplier;

public class GraviBlocks {

    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Gravitation.MOD_ID);

    public static final RegistryObject<AetherGrassBlock> AER_GRASS = register("aer_grass", () -> new AetherGrassBlock(Block.Properties.copy(AetherBlocks.AETHER_GRASS_BLOCK.get())));

    public static final RegistryObject<Block> AERFIN_LEAVES = register("aerfin_leaves", () -> new AetherDoubleDropsLeaves(Block.Properties.copy(Blocks.OAK_LEAVES).mapColor(MapColor.TERRACOTTA_BLUE).ignitedByLava().pushReaction(PushReaction.DESTROY).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion().isValidSpawn(GraviBlocks::ocelotOrParrot).isSuffocating(GraviBlocks::never).isViewBlocking(GraviBlocks::never)));
    public static final RegistryObject<Block> BLUE_AERFIN_LEAVES = register("blue_aerfin_leaves", () -> new BlueAerfinLeaves(Block.Properties.copy(Blocks.OAK_LEAVES).mapColor(MapColor.COLOR_BLUE).ignitedByLava().pushReaction(PushReaction.DESTROY).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion().isValidSpawn(GraviBlocks::ocelotOrParrot).isSuffocating(GraviBlocks::never).isViewBlocking(GraviBlocks::never)));
    public static final RegistryObject<Block> GOLDEN_AERFIN_LEAVES = register("golden_aerfin_leaves", () -> new GoldenAerfinLeaves(Block.Properties.copy(Blocks.OAK_LEAVES).mapColor(MapColor.GOLD).ignitedByLava().pushReaction(PushReaction.DESTROY).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion().isValidSpawn(GraviBlocks::ocelotOrParrot).isSuffocating(GraviBlocks::never).isViewBlocking(GraviBlocks::never)));

    public static final RegistryObject<SaplingBlock> AERFIN_SAPLING = register("aerfin_sapling", () -> new SaplingBlock(new AerfinTree(), Block.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<SaplingBlock> BLUE_AERFIN_SAPLING = register("blue_aerfin_sapling", () -> new SaplingBlock(new BlueAerfinTree(), Block.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<SaplingBlock> GOLDEN_AERFIN_SAPLING = register("golden_aerfin_sapling", () -> new SaplingBlock(new GoldenAerfinTree(), Block.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<FlowerPotBlock> POTTED_AERFIN_SAPLING = BLOCKS.register("potted_aerfin_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, AERFIN_SAPLING, Block.Properties.copy(Blocks.FLOWER_POT)));
    public static final RegistryObject<FlowerPotBlock> POTTED_BLUE_AERFIN_SAPLING = BLOCKS.register("potted_blue_aerfin_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, BLUE_AERFIN_SAPLING, Block.Properties.copy(Blocks.FLOWER_POT)));
    public static final RegistryObject<FlowerPotBlock> POTTED_GOLDEN_AERFIN_SAPLING = BLOCKS.register("potted_golden_aerfin_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, GOLDEN_AERFIN_SAPLING, Block.Properties.copy(Blocks.FLOWER_POT)));

    public static final RegistryObject<RotatedPillarBlock> AERFIN_LOG = register("aerfin_log", () -> new AetherLogBlock(Block.Properties.copy(Blocks.OAK_LOG).mapColor(MapColor.COLOR_PURPLE)));
    public static final RegistryObject<RotatedPillarBlock> STRIPPED_AERFIN_LOG = register("stripped_aerfin_log", () -> new RotatedPillarBlock(Block.Properties.copy(Blocks.STRIPPED_OAK_LOG).mapColor(MapColor.COLOR_PURPLE)));
    public static final RegistryObject<RotatedPillarBlock> AERFIN_WOOD = register("aerfin_wood", () -> new AetherLogBlock(Block.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.COLOR_PURPLE)));
    public static final RegistryObject<RotatedPillarBlock> STRIPPED_AERFIN_WOOD = register("stripped_aerfin_wood", () -> new RotatedPillarBlock(Block.Properties.copy(Blocks.STRIPPED_OAK_WOOD).mapColor(MapColor.COLOR_PURPLE)));
    public static final RegistryObject<Block> AERFIN_PLANKS = register("aerfin_planks", () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS).mapColor(MapColor.COLOR_PURPLE)));
    public static final RegistryObject<Block> AERFIN_BOOKSHELF = register("aerfin_bookshelf", () -> new BookshelfBlock(Block.Properties.copy(Blocks.BOOKSHELF)));
    public static final RegistryObject<StairBlock> AERFIN_STAIRS = register("aerfin_stairs", () -> new StairBlock(() -> AERFIN_PLANKS.get().defaultBlockState(), Block.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<SlabBlock> AERFIN_SLAB = register("aerfin_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<TrapDoorBlock> AERFIN_TRAPDOOR = register("aerfin_trapdoor", () -> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(3.0F).noOcclusion().isValidSpawn(GraviBlocks::never), GraviWoodType.AERFIN_BLOCK_SET));
    public static final RegistryObject<DoorBlock> AERFIN_DOOR = register("aerfin_door", () -> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(3.0F).noOcclusion().isValidSpawn(GraviBlocks::never), GraviWoodType.AERFIN_BLOCK_SET));
    public static final RegistryObject<FenceBlock> AERFIN_FENCE = register("aerfin_fence", () -> new FenceBlock(Block.Properties.copy(Blocks.OAK_FENCE).strength(3.0F).noOcclusion().isValidSpawn(GraviBlocks::never)));
    public static final RegistryObject<FenceGateBlock> AERFIN_FENCE_GATE = register("aerfin_fence_gate", () -> new FenceGateBlock(Block.Properties.copy(Blocks.OAK_FENCE_GATE).strength(3.0F).noOcclusion().isValidSpawn(GraviBlocks::never), GraviWoodType.AERFIN));
    public static final RegistryObject<ButtonBlock> AERFIN_BUTTON = register("aerfin_button", () -> new ButtonBlock(Block.Properties.copy(Blocks.OAK_BUTTON).strength(3.0F).noOcclusion().isValidSpawn(GraviBlocks::never), GraviWoodType.AERFIN_BLOCK_SET, 30, true));
    public static final RegistryObject<PressurePlateBlock> AERFIN_PREASURE_PLATE = register("aerfin_preasure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.copy(Blocks.OAK_PRESSURE_PLATE).strength(3.0F).noOcclusion().isValidSpawn(GraviBlocks::never), GraviWoodType.AERFIN_BLOCK_SET));
    public static final RegistryObject<StandingSignBlock> AERFIN_SIGN = registerAerfinSign("aerfin_sign", () -> new AerfinSignBlock(Block.Properties.copy(Blocks.OAK_SIGN).noCollission().strength(1.0F).sound(SoundType.WOOD), GraviWoodType.AERFIN));
    public static final RegistryObject<WallSignBlock> AERFIN_WALL_SIGN = register("aerfin_wall_sign", () -> new AerfinWallSignBlock(Block.Properties.copy(Blocks.OAK_WALL_SIGN).noCollission().strength(1.0F).sound(SoundType.WOOD).lootFrom(AERFIN_SIGN), GraviWoodType.AERFIN));
    public static final RegistryObject<CeilingHangingSignBlock> AERFIN_HANGING_SIGN = registerAerfinHangingSign("aerfin_hanging_sign", () -> new AerfinHangingSignBlock(BlockBehaviour.Properties.of().mapColor(Blocks.OAK_LOG.defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0F).ignitedByLava(), GraviWoodType.AERFIN));
    public static final RegistryObject<WallHangingSignBlock> AERFIN_WALL_HANGING_SIGN = register("aerfin_wall_hanging_sign", () -> new AerfinWallHangingSignBlock(BlockBehaviour.Properties.of().mapColor(Blocks.OAK_LOG.defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0F).ignitedByLava(), GraviWoodType.AERFIN));

    public static final RegistryObject<Block> BELADON_LEAVES = register("beladon_leaves", () -> new AetherDoubleDropsLeaves(Block.Properties.copy(Blocks.OAK_LEAVES).mapColor(MapColor.TERRACOTTA_ORANGE).ignitedByLava().pushReaction(PushReaction.DESTROY).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion().isValidSpawn(GraviBlocks::ocelotOrParrot).isSuffocating(GraviBlocks::never).isViewBlocking(GraviBlocks::never)));
    public static final RegistryObject<RotatedPillarBlock> BELADON_LOG = register("beladon_log", () -> new AetherLogBlock(Block.Properties.copy(Blocks.OAK_LOG).mapColor(MapColor.TERRACOTTA_BROWN)));
    public static final RegistryObject<RotatedPillarBlock> STRIPPED_BELADON_LOG = register("stripped_beladon_log", () -> new RotatedPillarBlock(Block.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<RotatedPillarBlock> BELADON_WOOD = register("beladon_wood", () -> new AetherLogBlock(Block.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<RotatedPillarBlock> STRIPPED_BELADON_WOOD = register("stripped_beladon_wood", () -> new RotatedPillarBlock(Block.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> BELADON_PLANKS = register("beladon_planks", () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> BELADON_BOOKSHELF = register("beladon_bookshelf", () -> new BookshelfBlock(Block.Properties.copy(Blocks.BOOKSHELF)));
    public static final RegistryObject<StairBlock> BELADON_STAIRS = register("beladon_stairs", () -> new StairBlock(() -> BELADON_PLANKS.get().defaultBlockState(), Block.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<SlabBlock> BELADON_SLAB = register("beladon_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<TrapDoorBlock> BELADON_TRAPDOOR = register("beladon_trapdoor", () -> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(3.0F).noOcclusion().isValidSpawn(GraviBlocks::never), GraviWoodType.BELADON_BLOCK_SET));
    public static final RegistryObject<DoorBlock> BELADON_DOOR = register("beladon_door", () -> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(3.0F).noOcclusion().isValidSpawn(GraviBlocks::never), GraviWoodType.BELADON_BLOCK_SET));
    public static final RegistryObject<FenceBlock> BELADON_FENCE = register("beladon_fence", () -> new FenceBlock(Block.Properties.copy(Blocks.OAK_FENCE).strength(3.0F).noOcclusion().isValidSpawn(GraviBlocks::never)));
    public static final RegistryObject<FenceGateBlock> BELADON_FENCE_GATE = register("beladon_fence_gate", () -> new FenceGateBlock(Block.Properties.copy(Blocks.OAK_FENCE_GATE).strength(3.0F).noOcclusion().isValidSpawn(GraviBlocks::never), GraviWoodType.BELADON));
    public static final RegistryObject<ButtonBlock> BELADON_BUTTON = register("beladon_button", () -> new ButtonBlock(Block.Properties.copy(Blocks.OAK_BUTTON).strength(3.0F).noOcclusion().isValidSpawn(GraviBlocks::never), GraviWoodType.BELADON_BLOCK_SET, 30, true));
    public static final RegistryObject<PressurePlateBlock> BELADON_PREASURE_PLATE = register("beladon_preasure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.copy(Blocks.OAK_PRESSURE_PLATE).strength(3.0F).noOcclusion().isValidSpawn(GraviBlocks::never), GraviWoodType.BELADON_BLOCK_SET));
    public static final RegistryObject<StandingSignBlock> BELADON_SIGN = registerBeladonSign("beladon_sign", () -> new BeladonSignBlock(Block.Properties.copy(Blocks.OAK_SIGN).noCollission().strength(1.0F).sound(SoundType.WOOD), GraviWoodType.BELADON));
    public static final RegistryObject<WallSignBlock> BELADON_WALL_SIGN = register("beladon_wall_sign", () -> new BeladonWallSignBlock(Block.Properties.copy(Blocks.OAK_WALL_SIGN).noCollission().strength(1.0F).sound(SoundType.WOOD).lootFrom(BELADON_SIGN), GraviWoodType.BELADON));
    public static final RegistryObject<CeilingHangingSignBlock> BELADON_HANGING_SIGN = registerBeladonHangingSign("beladon_hanging_sign", () -> new BeladonHangingSignBlock(Block.Properties.copy(Blocks.OAK_WALL_SIGN).mapColor(Blocks.OAK_LOG.defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0F).ignitedByLava(), GraviWoodType.BELADON));
    public static final RegistryObject<WallHangingSignBlock> BELADON_WALL_HANGING_SIGN = register("beladon_wall_hanging_sign", () -> new BeladonWallHangingSignBlock(Block.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN).mapColor(Blocks.OAK_LOG.defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0F).ignitedByLava(), GraviWoodType.BELADON));
    public static final RegistryObject<SaplingBlock> BELADON_SAPLING = register("beladon_sapling", () -> new SaplingBlock(new BeladonTree(), Block.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<FlowerPotBlock> POTTED_BELADON_SAPLING = BLOCKS.register("potted_beladon_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, BELADON_SAPLING, Block.Properties.copy(Blocks.FLOWER_POT)));
    public static final RegistryObject<Block> ENCHANTED_LEAVES = register("enchanted_leaves", () -> new AetherDoubleDropsLeaves(Block.Properties.copy(Blocks.OAK_LEAVES).ignitedByLava().pushReaction(PushReaction.DESTROY).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion().isValidSpawn(GraviBlocks::ocelotOrParrot).isSuffocating(GraviBlocks::never).isViewBlocking(GraviBlocks::never)));
    public static final RegistryObject<RotatedPillarBlock> ENCHANTED_LOG = register("enchanted_log", () -> new AetherLogBlock(Block.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<RotatedPillarBlock> STRIPPED_ENCHANTED_LOG = register("stripped_enchanted_log", () -> new RotatedPillarBlock(Block.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<RotatedPillarBlock> ENCHANTED_WOOD = register("enchanted_wood", () -> new AetherLogBlock(Block.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<RotatedPillarBlock> STRIPPED_ENCHANTED_WOOD = register("stripped_enchanted_wood", () -> new RotatedPillarBlock(Block.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> ENCHANTED_PLANKS = register("enchanted_planks", () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> ENCHANTED_BOOKSHELF = register("enchanted_bookshelf", () -> new BookshelfBlock(Block.Properties.copy(Blocks.BOOKSHELF)));
    public static final RegistryObject<StairBlock> ENCHANTED_STAIRS = register("enchanted_stairs", () -> new StairBlock(() -> ENCHANTED_PLANKS.get().defaultBlockState(), Block.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<SlabBlock> ENCHANTED_SLAB = register("enchanted_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<TrapDoorBlock> ENCHANTED_TRAPDOOR = register("enchanted_trapdoor", () -> new TrapDoorBlock(Block.Properties.copy(Blocks.OAK_TRAPDOOR).strength(3.0F).noOcclusion().isValidSpawn(GraviBlocks::never), GraviWoodType.ENCHANTED_BLOCK_SET));
    public static final RegistryObject<DoorBlock> ENCHANTED_DOOR = register("enchanted_door", () -> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR).strength(3.0F).noOcclusion().isValidSpawn(GraviBlocks::never), GraviWoodType.ENCHANTED_BLOCK_SET));
    public static final RegistryObject<FenceBlock> ENCHANTED_FENCE = register("enchanted_fence", () -> new FenceBlock(Block.Properties.copy(Blocks.OAK_FENCE).strength(3.0F).noOcclusion().isValidSpawn(GraviBlocks::never)));
    public static final RegistryObject<FenceGateBlock> ENCHANTED_FENCE_GATE = register("enchanted_fence_gate", () -> new FenceGateBlock(Block.Properties.copy(Blocks.OAK_FENCE_GATE).strength(3.0F).noOcclusion().isValidSpawn(GraviBlocks::never), GraviWoodType.ENCHANTED));
    public static final RegistryObject<ButtonBlock> ENCHANTED_BUTTON = register("enchanted_button", () -> new ButtonBlock(Block.Properties.copy(Blocks.OAK_BUTTON).strength(3.0F).noOcclusion().isValidSpawn(GraviBlocks::never), GraviWoodType.ENCHANTED_BLOCK_SET, 30, true));
    public static final RegistryObject<PressurePlateBlock> ENCHANTED_PREASURE_PLATE = register("enchanted_preasure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.copy(Blocks.OAK_PRESSURE_PLATE).strength(3.0F).noOcclusion().isValidSpawn(GraviBlocks::never), GraviWoodType.ENCHANTED_BLOCK_SET));
    public static final RegistryObject<StandingSignBlock> ENCHANTED_SIGN = registerEnchantedSign("enchanted_sign", () -> new EnchantedSignBlock(Block.Properties.copy(Blocks.OAK_SIGN).noCollission().strength(1.0F).sound(SoundType.WOOD), GraviWoodType.ENCHANTED));
    public static final RegistryObject<WallSignBlock> ENCHANTED_WALL_SIGN = register("enchanted_wall_sign", () -> new EnchantedWallSignBlock(Block.Properties.copy(Blocks.OAK_WALL_SIGN).noCollission().strength(1.0F).sound(SoundType.WOOD).lootFrom(ENCHANTED_SIGN), GraviWoodType.ENCHANTED));
    public static final RegistryObject<CeilingHangingSignBlock> ENCHANTED_HANGING_SIGN = registerEnchantedHangingSign("enchanted_hanging_sign", () -> new GravitationCeilingHangingSignBlock(ExtendedProperties.create(properties ->
            properties.mapColor(Blocks.OAK_LOG.defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0F).ignitedByLava()).blockEntity(EnchantedHangingSignBlockEntity::new), GraviWoodType.ENCHANTED));
    public static final RegistryObject<WallHangingSignBlock> ENCHANTED_WALL_HANGING_SIGN = register("enchanted_wall_hanging_sign", () -> new GravitationWallHangingSignBlock(ExtendedProperties.create(properties ->
            properties.mapColor(Blocks.OAK_LOG.defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(1.0F).ignitedByLava()).blockEntity(EnchantedHangingSignBlockEntity::new), GraviWoodType.ENCHANTED));
    public static final RegistryObject<SaplingBlock> ENCHANTED_SAPLING = register("enchanted_sapling", () -> new SaplingBlock(new EnchantedTree(), Block.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<FlowerPotBlock> POTTED_ENCHANTED_SAPLING = BLOCKS.register("potted_enchanted_sapling", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, ENCHANTED_SAPLING, Block.Properties.copy(Blocks.FLOWER_POT)));

    public static final RegistryObject<Block> BRONZITE_BLOCK = register("bronzite_block", () -> new Block(Block.Properties.copy(Blocks.IRON_BLOCK)), (b) -> () -> new BlockItem(b.get(), new Item.Properties().rarity(GravitationItems.SALMON_ROSE)));

    public static final RegistryObject<Block> BRONZITE_ORE = register("bronzite_ore", () -> new Block(Block.Properties.copy(AetherBlocks.ZANITE_ORE.get())), (b) -> () -> new BlockItem(b.get(), new Item.Properties().rarity(GravitationItems.SALMON_ROSE)));

    public static final RegistryObject<Block> BRONZITE_ICESTONE_ORE = register("bronzite_icestone_ore", () -> new Block(Block.Properties.copy(AetherBlocks.ZANITE_ORE.get())), (b) -> () -> new BlockItem(b.get(), new Item.Properties().rarity(GravitationItems.SALMON_ROSE)));

    public static final RegistryObject<Block> ENCHANTED_MOSS = register("enchanted_moss", () -> new Block(Block.Properties.copy(Blocks.MOSS_BLOCK)));

    public static final RegistryObject<Block> CONGLOMERATE = register("conglomerate", () -> new Block(Block.Properties.copy(Blocks.STONE)), (b) -> () -> new BlockItem(b.get(), new Item.Properties()));
    public static final RegistryObject<StairBlock> CONGLOMERATE_STAIRS = register("conglomerate_stairs", () -> new StairBlock(() -> CONGLOMERATE.get().defaultBlockState(), Block.Properties.copy(Blocks.STONE)), (b) -> () -> new BlockItem(b.get(), new Item.Properties()));
    public static final RegistryObject<SlabBlock> CONGLOMERATE_SLAB = register("conglomerate_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.STONE)), (b) -> () -> new BlockItem(b.get(), new Item.Properties()));
    public static final RegistryObject<WallBlock> CONGLOMERATE_WALLS = register("conglomerate_wall", () -> new WallBlock(Block.Properties.copy(Blocks.STONE)), (b) -> () -> new BlockItem(b.get(), new Item.Properties()));

    public static final RegistryObject<Block> POLISHED_CONGLOMERATE = register("polished_conglomerate", () -> new Block(Block.Properties.copy(Blocks.STONE)), (b) -> () -> new BlockItem(b.get(), new Item.Properties()));
    public static final RegistryObject<StairBlock> POLISHED_CONGLOMERATE_STAIRS = register("polished_conglomerate_stairs", () -> new StairBlock(() -> POLISHED_CONGLOMERATE.get().defaultBlockState(), Block.Properties.copy(Blocks.STONE)), (b) -> () -> new BlockItem(b.get(), new Item.Properties()));
    public static final RegistryObject<SlabBlock> POLISHED_CONGLOMERATE_SLAB = register("polished_conglomerate_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.STONE)), (b) -> () -> new BlockItem(b.get(), new Item.Properties()));
    public static final RegistryObject<WallBlock> POLISHED_CONGLOMERATE_WALLS = register("polished_conglomerate_wall", () -> new WallBlock(Block.Properties.copy(Blocks.STONE)), (b) -> () -> new BlockItem(b.get(), new Item.Properties()));

    public static final RegistryObject<Block> CONGLOMERATE_BRICKS = register("conglomerate_bricks", () -> new Block(Block.Properties.copy(Blocks.STONE)), (b) -> () -> new BlockItem(b.get(), new Item.Properties()));
    public static final RegistryObject<StairBlock> CONGLOMERATE_BRICK_STAIRS = register("conglomerate_brick_stairs", () -> new StairBlock(() -> CONGLOMERATE_BRICKS.get().defaultBlockState(), Block.Properties.copy(Blocks.STONE)), (b) -> () -> new BlockItem(b.get(), new Item.Properties()));
    public static final RegistryObject<SlabBlock> CONGLOMERATE_BRICK_SLAB = register("conglomerate_brick_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.STONE)), (b) -> () -> new BlockItem(b.get(), new Item.Properties()));
    public static final RegistryObject<WallBlock> CONGLOMERATE_BRICK_WALLS = register("conglomerate_brick_wall", () -> new WallBlock(Block.Properties.copy(Blocks.STONE)), (b) -> () -> new BlockItem(b.get(), new Item.Properties()));

    public static void registerPots() {
        FlowerPotBlock pot = (FlowerPotBlock) Blocks.FLOWER_POT;
        pot.addPlant(GraviBlocks.AERFIN_SAPLING.getId(), GraviBlocks.POTTED_AERFIN_SAPLING);
        pot.addPlant(GraviBlocks.BLUE_AERFIN_SAPLING.getId(), GraviBlocks.POTTED_BLUE_AERFIN_SAPLING);
        pot.addPlant(GraviBlocks.GOLDEN_AERFIN_SAPLING.getId(), GraviBlocks.POTTED_GOLDEN_AERFIN_SAPLING);
        pot.addPlant(GraviBlocks.BELADON_SAPLING.getId(), GraviBlocks.POTTED_BELADON_SAPLING);
        pot.addPlant(GraviBlocks.ENCHANTED_SAPLING.getId(), GraviBlocks.POTTED_ENCHANTED_SAPLING);
    }

    public static void registerFlammability() {
        FireBlockAccessor fireBlockAccessor = (FireBlockAccessor) Blocks.FIRE;

        fireBlockAccessor.callSetFlammable(GraviBlocks.AERFIN_LEAVES.get(), 30, 60);
        fireBlockAccessor.callSetFlammable(GraviBlocks.BLUE_AERFIN_LEAVES.get(), 30, 60);
        fireBlockAccessor.callSetFlammable(GraviBlocks.GOLDEN_AERFIN_LEAVES.get(), 30, 60);
        fireBlockAccessor.callSetFlammable(GraviBlocks.AERFIN_PLANKS.get(), 5, 20);
        fireBlockAccessor.callSetFlammable(GraviBlocks.AERFIN_LOG.get(), 5, 5);
        fireBlockAccessor.callSetFlammable(GraviBlocks.STRIPPED_AERFIN_LOG.get(), 5, 5);
        fireBlockAccessor.callSetFlammable(GraviBlocks.AERFIN_WOOD.get(), 5, 5);
        fireBlockAccessor.callSetFlammable(GraviBlocks.STRIPPED_AERFIN_WOOD.get(), 5, 5);
        fireBlockAccessor.callSetFlammable(GraviBlocks.AERFIN_FENCE.get(), 5, 20);
        fireBlockAccessor.callSetFlammable(GraviBlocks.AERFIN_FENCE_GATE.get(), 5, 20);

        fireBlockAccessor.callSetFlammable(GraviBlocks.BELADON_LEAVES.get(), 30, 60);
        fireBlockAccessor.callSetFlammable(GraviBlocks.BELADON_PLANKS.get(), 5, 20);
        fireBlockAccessor.callSetFlammable(GraviBlocks.BELADON_LOG.get(), 5, 5);
        fireBlockAccessor.callSetFlammable(GraviBlocks.STRIPPED_BELADON_LOG.get(), 5, 5);
        fireBlockAccessor.callSetFlammable(GraviBlocks.BELADON_WOOD.get(), 5, 5);
        fireBlockAccessor.callSetFlammable(GraviBlocks.STRIPPED_BELADON_WOOD.get(), 5, 5);
        fireBlockAccessor.callSetFlammable(GraviBlocks.BELADON_FENCE.get(), 5, 20);
        fireBlockAccessor.callSetFlammable(GraviBlocks.BELADON_FENCE_GATE.get(), 5, 20);

        fireBlockAccessor.callSetFlammable(GraviBlocks.ENCHANTED_LEAVES.get(), 30, 60);
        fireBlockAccessor.callSetFlammable(GraviBlocks.ENCHANTED_PLANKS.get(), 5, 20);
        fireBlockAccessor.callSetFlammable(GraviBlocks.ENCHANTED_LOG.get(), 5, 5);
        fireBlockAccessor.callSetFlammable(GraviBlocks.STRIPPED_ENCHANTED_LOG.get(), 5, 5);
        fireBlockAccessor.callSetFlammable(GraviBlocks.ENCHANTED_WOOD.get(), 5, 5);
        fireBlockAccessor.callSetFlammable(GraviBlocks.STRIPPED_ENCHANTED_WOOD.get(), 5, 5);
        fireBlockAccessor.callSetFlammable(GraviBlocks.ENCHANTED_FENCE.get(), 5, 20);
        fireBlockAccessor.callSetFlammable(GraviBlocks.ENCHANTED_FENCE_GATE.get(), 5, 20);
    }

    public static void registerStripping() {

        ToolAction.registerStripping(GraviBlocks.AERFIN_LOG.get(), GraviBlocks.STRIPPED_AERFIN_LOG.get());
        ToolAction.registerStripping(GraviBlocks.AERFIN_WOOD.get(), GraviBlocks.STRIPPED_AERFIN_WOOD.get());

        ToolAction.registerStripping(GraviBlocks.BELADON_LOG.get(), GraviBlocks.STRIPPED_BELADON_LOG.get());
        ToolAction.registerStripping(GraviBlocks.BELADON_WOOD.get(), GraviBlocks.STRIPPED_BELADON_WOOD.get());

        ToolAction.registerStripping(GraviBlocks.ENCHANTED_LOG.get(), GraviBlocks.STRIPPED_ENCHANTED_LOG.get());
        ToolAction.registerStripping(GraviBlocks.ENCHANTED_WOOD.get(), GraviBlocks.STRIPPED_ENCHANTED_WOOD.get());
    }


    public static <B extends Block> RegistryObject<B> register(String name, Supplier<B> block) {
        return register(name, block, (b) -> () -> new BlockItem(b.get(), new Item.Properties()));
    }

    public static <B extends Block> RegistryObject<B> registerEnchantedSign(String name, Supplier<B> block) {
        return register(name, block, (b) -> () ->  new SignItem(new Item.Properties().stacksTo(16), ENCHANTED_SIGN.get(), ENCHANTED_WALL_SIGN.get()));
    }

    public static <B extends Block> RegistryObject<B> registerEnchantedHangingSign(String name, Supplier<B> block) {
        return register(name, block, (b) -> () ->  new HangingSignItem(ENCHANTED_HANGING_SIGN.get(), ENCHANTED_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    }

    public static <B extends Block> RegistryObject<B> registerBeladonSign(String name, Supplier<B> block) {
        return register(name, block, (b) -> () ->  new SignItem(new Item.Properties().stacksTo(16), BELADON_SIGN.get(), BELADON_WALL_SIGN.get()));
    }

    public static <B extends Block> RegistryObject<B> registerBeladonHangingSign(String name, Supplier<B> block) {
        return register(name, block, (b) -> () ->  new HangingSignItem(BELADON_HANGING_SIGN.get(), BELADON_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    }

    public static <B extends Block> RegistryObject<B> registerAerfinSign(String name, Supplier<B> block) {
        return register(name, block, (b) -> () ->  new SignItem(new Item.Properties().stacksTo(16), AERFIN_SIGN.get(), AERFIN_WALL_SIGN.get()));
    }

    public static <B extends Block> RegistryObject<B> registerAerfinHangingSign(String name, Supplier<B> block) {
        return register(name, block, (b) -> () ->  new HangingSignItem(AERFIN_HANGING_SIGN.get(), AERFIN_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    }

    public static <B extends Block, I extends Item> RegistryObject<B> register(String name, Supplier<B> block, Function<RegistryObject<B>, Supplier<I>> blockItem) {
        RegistryObject<B> registeredBlock = BLOCKS.register(name, block);
        GravitationItems.ITEMS.register(name, blockItem.apply(registeredBlock));
        return registeredBlock;
    }

    private static boolean never(BlockState p_test_1_, BlockGetter p_test_2_, BlockPos p_test_3_) {
        return false;
    }

    private static boolean ocelotOrParrot(BlockState p_235441_0_, BlockGetter p_235441_1_, BlockPos p_235441_2_, EntityType<?> p_235441_3_) {
        return p_235441_3_ == EntityType.OCELOT || p_235441_3_ == EntityType.PARROT;
    }

    private static Boolean never(BlockState p_50779_, BlockGetter p_50780_, BlockPos p_50781_, EntityType<?> p_50782_) {
        return false;
    }
}
