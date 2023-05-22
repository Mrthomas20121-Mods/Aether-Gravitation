package mrthomas20121.gravitation.enchanting;

import mrthomas20121.gravitation.Gravitation;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class GravitationEnchantments {

    public static DeferredRegister<Enchantment> ENCHANTING = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, Gravitation.MOD_ID);

    public static RegistryObject<Enchantment> NEPTUNE_WRATH = ENCHANTING.register("neptune_wrath", EnchantmentNeptuneWrath::new);
}
