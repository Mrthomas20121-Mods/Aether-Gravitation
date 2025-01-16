package mrthomas20121.gravitation.enchanting;

import com.aetherteam.aether.data.resources.registries.AetherDamageTypes;
import com.aetherteam.aether.entity.AetherEntityTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class EnchantmentEtherealProtection extends Enchantment {

    protected EnchantmentEtherealProtection() {
        super(Rarity.RARE, EnchantmentCategory.ARMOR, new EquipmentSlot[] { EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET });
    }

    @Override
    public int getDamageProtection(int n, DamageSource source) {
        if(source.is(DamageTypes.MOB_ATTACK) && source.getEntity() != null && source.getEntity().getType().equals(AetherEntityTypes.VALKYRIE.get())) {
            return super.getDamageProtection(n, source)*3;
        }
        return super.getDamageProtection(n, source);
    }
}
