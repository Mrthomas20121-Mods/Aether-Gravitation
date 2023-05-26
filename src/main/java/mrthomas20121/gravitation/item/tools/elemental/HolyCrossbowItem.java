package mrthomas20121.gravitation.item.tools.elemental;

import com.aetherteam.aether.data.resources.AetherDamageTypes;
import com.aetherteam.aether.item.AetherItems;
import com.aetherteam.aether.util.EquipmentUtil;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.item.CrossbowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantments;

public class HolyCrossbowItem extends CrossbowItem {

    public HolyCrossbowItem() {
        super(new Properties().rarity(AetherItems.AETHER_LOOT));
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (EquipmentUtil.isFullStrength(attacker)) {
            if (target.getMobType() == MobType.UNDEAD || target.isInvertedHealAndHarm()) {
                DamageSource damageSource = AetherDamageTypes.entityDamageSource(attacker.level, AetherDamageTypes.ARMOR_PIERCING_ATTACK, attacker);
                float damageAmount = 15.0F;
                int smiteModifier = stack.getEnchantmentLevel(Enchantments.SMITE);
                if (smiteModifier > 0) {
                    damageAmount += (smiteModifier * 2.5);
                }
                target.hurt(damageSource, damageAmount);
                stack.hurtAndBreak(10, attacker, (entity) -> entity.broadcastBreakEvent(EquipmentSlot.MAINHAND));
            }
        }
        return super.hurtEnemy(stack, target, attacker);
    }
}
