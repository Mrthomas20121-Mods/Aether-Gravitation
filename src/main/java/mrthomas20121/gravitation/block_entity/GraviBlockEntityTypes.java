package mrthomas20121.gravitation.block_entity;

import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.block.GravitationBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class GraviBlockEntityTypes {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Gravitation.MOD_ID);

    public static final RegistryObject<BlockEntityType<AerfinSignBlockEntity>> AERFIN_SIGN = BLOCK_ENTITY_TYPES.register("aerfin_sign", () ->
            BlockEntityType.Builder.of(AerfinSignBlockEntity::new, GravitationBlocks.AERFIN_WALL_SIGN.get(), GravitationBlocks.AERFIN_SIGN.get()).build(null));

    public static final RegistryObject<BlockEntityType<AerfinHangingSignBlockEntity>> AERFIN_HANGING_SIGN = BLOCK_ENTITY_TYPES.register("aerfin_hanging_sign", () ->
            BlockEntityType.Builder.of(AerfinHangingSignBlockEntity::new, GravitationBlocks.AERFIN_WALL_HANGING_SIGN.get(), GravitationBlocks.AERFIN_HANGING_SIGN.get()).build(null));

    public static final RegistryObject<BlockEntityType<EnchantedSignBlockEntity>> ENCHANTED_SIGN = BLOCK_ENTITY_TYPES.register("enchanted_sign", () ->
            BlockEntityType.Builder.of(EnchantedSignBlockEntity::new, GravitationBlocks.ENCHANTED_WALL_SIGN.get(), GravitationBlocks.ENCHANTED_SIGN.get()).build(null));

    public static final RegistryObject<BlockEntityType<EnchantedHangingSignBlockEntity>> ENCHANTED_HANGING_SIGN = BLOCK_ENTITY_TYPES.register("enchanted_hanging_sign", () ->
            BlockEntityType.Builder.of(EnchantedHangingSignBlockEntity::new, GravitationBlocks.ENCHANTED_WALL_HANGING_SIGN.get(), GravitationBlocks.ENCHANTED_HANGING_SIGN.get()).build(null));

    public static final RegistryObject<BlockEntityType<BeladonSignBlockEntity>> BELADON_SIGN = BLOCK_ENTITY_TYPES.register("beladon_sign", () ->
            BlockEntityType.Builder.of(BeladonSignBlockEntity::new, GravitationBlocks.BELADON_WALL_SIGN.get(), GravitationBlocks.BELADON_SIGN.get()).build(null));

    public static final RegistryObject<BlockEntityType<BeladonHangingSignBlockEntity>> BELADON_HANGING_SIGN = BLOCK_ENTITY_TYPES.register("beladon_hanging_sign", () ->
            BlockEntityType.Builder.of(BeladonHangingSignBlockEntity::new, GravitationBlocks.BELADON_WALL_HANGING_SIGN.get(), GravitationBlocks.BELADON_HANGING_SIGN.get()).build(null));
}
