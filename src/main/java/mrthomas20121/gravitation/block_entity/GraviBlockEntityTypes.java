package mrthomas20121.gravitation.block_entity;

import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.block.GraviBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class GraviBlockEntityTypes {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Gravitation.MOD_ID);

    public static final RegistryObject<BlockEntityType<EnchantedSignBlockEntity>> ENCHANTED_SIGN = BLOCK_ENTITY_TYPES.register("enchanted_sign", () ->
            BlockEntityType.Builder.of(EnchantedSignBlockEntity::new, GraviBlocks.ENCHANTED_WALL_SIGN.get(), GraviBlocks.ENCHANTED_SIGN.get()).build(null));
}
