package mrthomas20121.gravitation.entity;

import mrthomas20121.gravitation.Gravitation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class GraviEntityTypes {

    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Gravitation.MOD_ID);

    public static RegistryObject<EntityType<PhoenixDart>> PHOENIX_DART = ENTITY_TYPES.register("phoenix_dart", () -> {
        return EntityType.Builder.of(PhoenixDart::new, MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build("phoenix_dart");
    });
}
