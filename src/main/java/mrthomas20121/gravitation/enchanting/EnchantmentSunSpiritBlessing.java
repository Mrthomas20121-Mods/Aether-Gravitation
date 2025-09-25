package mrthomas20121.gravitation.enchanting;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraftforge.fml.ModList;

public class EnchantmentSunSpiritBlessing extends Enchantment {

    protected EnchantmentSunSpiritBlessing() {
        super(Rarity.RARE, EnchantmentCategory.ARMOR, new EquipmentSlot[] {
                EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.LEGS
        });


    }

    @Override
    public int getMaxLevel() {
        if(ModList.get().isLoaded("apotheosis")) {
            return 8;
        }
        return 6;
    }

    @Override
    public boolean isDiscoverable() {
        return false;
    }
}
