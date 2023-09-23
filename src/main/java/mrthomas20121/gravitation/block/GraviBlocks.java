package mrthomas20121.gravitation.block;

import com.aetherteam.aether.block.AetherBlocks;
import com.aetherteam.aether.block.construction.BookshelfBlock;
import com.aetherteam.aether.block.natural.AetherDoubleDropsLeaves;
import com.aetherteam.aether.block.natural.AetherLogBlock;
import com.aetherteam.aether.mixin.mixins.common.accessor.FireBlockAccessor;
import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.block.wood.*;
import mrthomas20121.gravitation.item.GraviItems;
import mrthomas20121.gravitation.util.ToolAction;
import mrthomas20121.gravitation.world.BeladonTree;
import mrthomas20121.gravitation.world.EnchantedTree;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;
import java.util.function.Supplier;

public class GraviBlocks {

    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Gravitation.MOD_ID);

    public static final RegistryObject<Block> BELADON_LEAVES = register("beladon_leaves", () -> new AetherDoubleDropsLeaves(Block.Properties.of(Material.LEAVES, MaterialColor.GRASS).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion().isValidSpawn(GraviBlocks::ocelotOrParrot).isSuffocating(GraviBlocks::never).isViewBlocking(GraviBlocks::never)));
    public static final RegistryObject<RotatedPillarBlock> BELADON_LOG = register("beladon_log", () -> new AetherLogBlock(Block.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<RotatedPillarBlock> STRIPPED_BELADON_LOG = register("stripped_beladon_log", () -> new RotatedPillarBlock(Block.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<RotatedPillarBlock> BELADON_WOOD = register("beladon_wood", () -> new AetherLogBlock(Block.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<RotatedPillarBlock> STRIPPED_BELADON_WOOD = register("stripped_beladon_wood", () -> new RotatedPillarBlock(Block.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> BELADON_PLANKS = register("beladon_planks", () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> BELADON_BOOKSHELF = register("beladon_bookshelf", () -> new BookshelfBlock(Block.Properties.copy(Blocks.BOOKSHELF)));
    public static final RegistryObject<StairBlock> BELADON_STAIRS = register("beladon_stairs", () -> new StairBlock(() -> BELADON_PLANKS.get().defaultBlockState(), Block.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<SlabBlock> BELADON_SLAB = register("beladon_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<TrapDoorBlock> BELADON_TRAPDOOR = register("beladon_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).noOcclusion().isValidSpawn(GraviBlocks::never), GraviWoodType.BELADON_BLOCK_SET));
    public static final RegistryObject<DoorBlock> BELADON_DOOR = register("beladon_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).noOcclusion().isValidSpawn(GraviBlocks::never), GraviWoodType.BELADON_BLOCK_SET));
    public static final RegistryObject<FenceBlock> BELADON_FENCE = register("beladon_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).noOcclusion().isValidSpawn(GraviBlocks::never)));
    public static final RegistryObject<FenceGateBlock> BELADON_FENCE_GATE = register("beladon_fence_gate", () -> new FenceGateBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).noOcclusion().isValidSpawn(GraviBlocks::never), GraviWoodType.BELADON));
    public static final RegistryObject<ButtonBlock> BELADON_BUTTON = register("beladon_button", () -> new ButtonBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).noOcclusion().isValidSpawn(GraviBlocks::never), GraviWoodType.BELADON_BLOCK_SET, 30, true));
    public static final RegistryObject<PressurePlateBlock> BELADON_PREASURE_PLATE = register("beladon_preasure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).noOcclusion().isValidSpawn(GraviBlocks::never), GraviWoodType.BELADON_BLOCK_SET));
    public static final RegistryObject<StandingSignBlock> BELADON_SIGN = registerBeladonSign("beladon_sign", () -> new BeladonSignBlock(Block.Properties.of(Material.WOOD, MaterialColor.SAND).noCollission().strength(1.0F).sound(SoundType.WOOD), GraviWoodType.BELADON));
    public static final RegistryObject<WallSignBlock> BELADON_WALL_SIGN = BLOCKS.register("beladon_wall_sign", () -> new BeladonWallSignBlock(Block.Properties.of(Material.WOOD, MaterialColor.SAND).noCollission().strength(1.0F).sound(SoundType.WOOD).lootFrom(BELADON_SIGN), GraviWoodType.BELADON));
    public static final RegistryObject<SaplingBlock> BELADON_SAPLING = register("beladon_sapling", () -> new SaplingBlock(new BeladonTree(), Block.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> ENCHANTED_LEAVES = register("enchanted_leaves", () -> new AetherDoubleDropsLeaves(Block.Properties.of(Material.LEAVES, MaterialColor.GRASS).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion().isValidSpawn(GraviBlocks::ocelotOrParrot).isSuffocating(GraviBlocks::never).isViewBlocking(GraviBlocks::never)));
    public static final RegistryObject<RotatedPillarBlock> ENCHANTED_LOG = register("enchanted_log", () -> new AetherLogBlock(Block.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<RotatedPillarBlock> STRIPPED_ENCHANTED_LOG = register("stripped_enchanted_log", () -> new RotatedPillarBlock(Block.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<RotatedPillarBlock> ENCHANTED_WOOD = register("enchanted_wood", () -> new AetherLogBlock(Block.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<RotatedPillarBlock> STRIPPED_ENCHANTED_WOOD = register("stripped_enchanted_wood", () -> new RotatedPillarBlock(Block.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> ENCHANTED_PLANKS = register("enchanted_planks", () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> ENCHANTED_BOOKSHELF = register("enchanted_bookshelf", () -> new BookshelfBlock(Block.Properties.copy(Blocks.BOOKSHELF)));
    public static final RegistryObject<StairBlock> ENCHANTED_STAIRS = register("enchanted_stairs", () -> new StairBlock(() -> ENCHANTED_PLANKS.get().defaultBlockState(), Block.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<SlabBlock> ENCHANTED_SLAB = register("enchanted_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<TrapDoorBlock> ENCHANTED_TRAPDOOR = register("enchanted_trapdoor", () -> new TrapDoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).noOcclusion().isValidSpawn(GraviBlocks::never), GraviWoodType.ENCHANTED_BLOCK_SET));
    public static final RegistryObject<DoorBlock> ENCHANTED_DOOR = register("enchanted_door", () -> new DoorBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).noOcclusion().isValidSpawn(GraviBlocks::never), GraviWoodType.ENCHANTED_BLOCK_SET));
    public static final RegistryObject<FenceBlock> ENCHANTED_FENCE = register("enchanted_fence", () -> new FenceBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).noOcclusion().isValidSpawn(GraviBlocks::never)));
    public static final RegistryObject<FenceGateBlock> ENCHANTED_FENCE_GATE = register("enchanted_fence_gate", () -> new FenceGateBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).noOcclusion().isValidSpawn(GraviBlocks::never), GraviWoodType.ENCHANTED));
    public static final RegistryObject<ButtonBlock> ENCHANTED_BUTTON = register("enchanted_button", () -> new ButtonBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).noOcclusion().isValidSpawn(GraviBlocks::never), GraviWoodType.ENCHANTED_BLOCK_SET, 30, true));
    public static final RegistryObject<PressurePlateBlock> ENCHANTED_PREASURE_PLATE = register("enchanted_preasure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).noOcclusion().isValidSpawn(GraviBlocks::never), GraviWoodType.ENCHANTED_BLOCK_SET));
    public static final RegistryObject<StandingSignBlock> ENCHANTED_SIGN = registerEnchantedSign("enchanted_sign", () -> new EnchantedSignBlock(Block.Properties.of(Material.WOOD, MaterialColor.SAND).noCollission().strength(1.0F).sound(SoundType.WOOD), GraviWoodType.ENCHANTED));
    public static final RegistryObject<WallSignBlock> ENCHANTED_WALL_SIGN = BLOCKS.register("enchanted_wall_sign", () -> new EnchantedWallSignBlock(Block.Properties.of(Material.WOOD, MaterialColor.SAND).noCollission().strength(1.0F).sound(SoundType.WOOD).lootFrom(ENCHANTED_SIGN), GraviWoodType.ENCHANTED));
    public static final RegistryObject<SaplingBlock> ENCHANTED_SAPLING = register("enchanted_sapling", () -> new SaplingBlock(new EnchantedTree(), Block.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> BRONZITE_BLOCK = register("bronzite_block", () -> new Block(Block.Properties.copy(Blocks.IRON_BLOCK)), (b) -> () -> new BlockItem(b.get(), new Item.Properties().rarity(GraviItems.SALMON_ROSE)));

    public static final RegistryObject<Block> BRONZITE_ORE = register("bronzite_ore", () -> new Block(Block.Properties.copy(AetherBlocks.ZANITE_ORE.get())), (b) -> () -> new BlockItem(b.get(), new Item.Properties().rarity(GraviItems.SALMON_ROSE)));

    public static final RegistryObject<Block> BRONZITE_ICESTONE_ORE = register("bronzite_icestone_ore", () -> new Block(Block.Properties.copy(AetherBlocks.ZANITE_ORE.get())), (b) -> () -> new BlockItem(b.get(), new Item.Properties().rarity(GraviItems.SALMON_ROSE)));

    public static final RegistryObject<Block> ENCHANTED_MOSS = register("enchanted_moss", () -> new Block(Block.Properties.copy(Blocks.MOSS_BLOCK)));

    public static void registerPots() {
        FlowerPotBlock pot = (FlowerPotBlock) Blocks.FLOWER_POT;
        pot.addPlant(GraviBlocks.ENCHANTED_SAPLING.getId(), GraviBlocks.ENCHANTED_SAPLING);
    }

    public static void registerFlammability() {
        FireBlockAccessor fireBlockAccessor = (FireBlockAccessor) Blocks.FIRE;
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
        ToolAction.registerStripping(GraviBlocks.ENCHANTED_LOG.get(), GraviBlocks.STRIPPED_ENCHANTED_LOG.get());
        ToolAction.registerStripping(GraviBlocks.ENCHANTED_WOOD.get(), GraviBlocks.STRIPPED_ENCHANTED_WOOD.get());
    }


    public static <B extends Block> RegistryObject<B> register(String name, Supplier<B> block) {
        return register(name, block, (b) -> () -> new BlockItem(b.get(), new Item.Properties()));
    }

    public static <B extends Block> RegistryObject<B> registerEnchantedSign(String name, Supplier<B> block) {
        return register(name, block, (b) -> () ->  new SignItem((new Item.Properties()).stacksTo(16), ENCHANTED_SIGN.get(), ENCHANTED_WALL_SIGN.get()));
    }

    public static <B extends Block> RegistryObject<B> registerBeladonSign(String name, Supplier<B> block) {
        return register(name, block, (b) -> () ->  new SignItem((new Item.Properties()).stacksTo(16), BELADON_SIGN.get(), BELADON_WALL_SIGN.get()));
    }

    public static <B extends Block, I extends Item> RegistryObject<B> register(String name, Supplier<B> block, Function<RegistryObject<B>, Supplier<I>> blockItem) {
        RegistryObject<B> registeredBlock = BLOCKS.register(name, block);
        GraviItems.ITEMS.register(name, blockItem.apply(registeredBlock));
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
