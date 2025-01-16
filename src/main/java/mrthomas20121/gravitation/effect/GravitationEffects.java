package mrthomas20121.gravitation.effect;

import mrthomas20121.gravitation.Gravitation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class GravitationEffects {

    public static DeferredRegister<MobEffect> EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, Gravitation.MOD_ID);

    public static RegistryObject<MobEffect> SHIELDED = EFFECTS.register("shielded", () -> new ShieldedEffect(MobEffectCategory.BENEFICIAL, 11449279).addAttributeModifier(Attributes.ARMOR, "4226f2b0-b9fd-11ef-9cd2-0242ac120002", 0.5F, AttributeModifier.Operation.MULTIPLY_TOTAL));
}
