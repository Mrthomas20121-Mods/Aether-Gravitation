package mrthomas20121.gravitation.particle;

import mrthomas20121.gravitation.Gravitation;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class GraviParticleTypes {

    public static DeferredRegister<ParticleType<?>> PARTICLES = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, Gravitation.MOD_ID);

    public static RegistryObject<SimpleParticleType> GOLDEN_AERFIN_LEAVES = PARTICLES.register("golden_aerfin_leaves", () -> new SimpleParticleType(false));
    public static RegistryObject<SimpleParticleType> BLUE_AERFIN_LEAVES = PARTICLES.register("blue_aerfin_leaves", () -> new SimpleParticleType(false));
}
