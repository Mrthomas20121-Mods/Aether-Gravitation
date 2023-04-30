package mrthomas20121.gravitation.entity;

import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.entity.wood.EnchantedBoat;
import mrthomas20121.gravitation.entity.wood.EnchantedChestBoat;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class GraviEntityTypes {

    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Gravitation.MOD_ID);

    public static RegistryObject<EntityType<PhoenixDart>> PHOENIX_DART = ENTITY_TYPES.register("phoenix_dart", () -> EntityType.Builder.<PhoenixDart>of(PhoenixDart::new, MobCategory.MISC).fireImmune().sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build("phoenix_dart"));

    public static final RegistryObject<EntityType<EnchantedBoat>> ENCHANTED_BOAT = ENTITY_TYPES.register("enchanted_boat",
            () -> EntityType.Builder.<EnchantedBoat>of(EnchantedBoat::new, MobCategory.MISC).sized(1.375F, 0.5625F).clientTrackingRange(10).build("enchanted_boat"));

    public static final RegistryObject<EntityType<EnchantedChestBoat>> ENCHANTED_CHEST_BOAT = ENTITY_TYPES.register("enchanted_chest_boat",
            () -> EntityType.Builder.<EnchantedChestBoat>of(EnchantedChestBoat::new, MobCategory.MISC).sized(1.375F, 0.5625F).clientTrackingRange(10).build("enchanted_boat"));
}
