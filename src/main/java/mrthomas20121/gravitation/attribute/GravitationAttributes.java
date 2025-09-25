package mrthomas20121.gravitation.attribute;

import mrthomas20121.gravitation.Gravitation;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.RangedAttribute;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class GravitationAttributes {

    public static final DeferredRegister<Attribute> ATTRIBUTES = DeferredRegister.create(ForgeRegistries.ATTRIBUTES, Gravitation.MOD_ID);

    public static final RegistryObject<Attribute> SUN_SPIRIT_BLESSING = ATTRIBUTES.register("sun_spirit_blessing", () -> new RangedAttribute("aether_gravitation:sun_spirit_blessing", 0.0D, 0.0D, 10.0D).setSyncable(true));
}
