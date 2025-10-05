package mrthomas20121.gravitation.enchanting;

import mrthomas20121.gravitation.Gravitation;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class GravitationEnchantments {

    public static DeferredRegister<Enchantment> ENCHANTING = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, Gravitation.MOD_ID);

    public static RegistryObject<Enchantment> STAMINA_OF_MARS = ENCHANTING.register("stamina_of_mars", EnchantmentStaminaMars::new);

    public static RegistryObject<Enchantment> SUN_SPIRIT_BLESSING = ENCHANTING.register("sun_spirit_blessing", EnchantmentSunSpiritBlessing::new);
}
