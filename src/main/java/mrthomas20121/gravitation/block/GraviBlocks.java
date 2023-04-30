package mrthomas20121.gravitation.block;

import com.aetherteam.aether.block.natural.AetherDoubleDropsLeaves;
import com.aetherteam.aether.block.natural.AetherLogBlock;
import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.block.wood.EnchantedSignBlock;
import mrthomas20121.gravitation.block.wood.EnchantedWallSignBlock;
import mrthomas20121.gravitation.block.wood.GraviWoodType;
import mrthomas20121.gravitation.item.GraviItems;
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

    public static final RegistryObject<Block> ENCHANTED_LEAVES = register("enchanted_leaves", () -> new AetherDoubleDropsLeaves(Block.Properties.of(Material.LEAVES, MaterialColor.GRASS).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion().isValidSpawn(GraviBlocks::ocelotOrParrot).isSuffocating(GraviBlocks::never).isViewBlocking(GraviBlocks::never)));

    public static final RegistryObject<RotatedPillarBlock> ENCHANTED_LOG = register("enchanted_log", () -> new AetherLogBlock(Block.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<RotatedPillarBlock> STRIPPED_ENCHANTED_LOG = register("stripped_enchanted_log", () -> new RotatedPillarBlock(Block.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<RotatedPillarBlock> ENCHANTED_WOOD = register("enchanted_wood", () -> new AetherLogBlock(Block.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<RotatedPillarBlock> STRIPPED_ENCHANTED_WOOD = register("stripped_enchanted_wood", () -> new RotatedPillarBlock(Block.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));

    public static final RegistryObject<Block> ENCHANTED_PLANKS = register("enchanted_planks", () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<StandingSignBlock> ENCHANTED_SIGN = registerEnchantedSign("skyroot_sign", () -> new EnchantedSignBlock(Block.Properties.of(Material.WOOD, MaterialColor.SAND).noCollission().strength(1.0F).sound(SoundType.WOOD), GraviWoodType.ENCHANTED));
    public static final RegistryObject<WallSignBlock> ENCHANTED_WALL_SIGN = registerEnchantedSign("skyroot_wall_sign", () -> new EnchantedWallSignBlock(Block.Properties.of(Material.WOOD, MaterialColor.SAND).noCollission().strength(1.0F).sound(SoundType.WOOD).lootFrom(ENCHANTED_SIGN), GraviWoodType.ENCHANTED));

    public static final RegistryObject<SaplingBlock> ENCHANTED_SAPLING = register("enchanted_sapling", () -> new SaplingBlock(new EnchantedTree(), Block.Properties.copy(Blocks.OAK_SAPLING)));

    public static <B extends Block> RegistryObject<B> register(String name, Supplier<B> block) {
        return register(name, block, (b) -> () -> new BlockItem(b.get(), new Item.Properties()));
    }

    public static <B extends Block> RegistryObject<B> registerEnchantedSign(String name, Supplier<B> block) {
        return register(name, block, (b) -> () ->  new SignItem((new Item.Properties()).stacksTo(16), ENCHANTED_SIGN.get(), ENCHANTED_WALL_SIGN.get()));
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
}
