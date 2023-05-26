package mrthomas20121.gravitation.item.tools.elemental;

import com.aetherteam.aether.capability.lightning.LightningTracker;
import com.aetherteam.aether.item.AetherItems;
import com.aetherteam.aether.util.EquipmentUtil;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.CrossbowItem;
import net.minecraft.world.item.ItemStack;

public class LightningCrossbowItem extends CrossbowItem {

    public LightningCrossbowItem() {
        super(new Properties().rarity(AetherItems.AETHER_LOOT));
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (EquipmentUtil.isFullStrength(attacker)) {
            LightningBolt lightningBolt = EntityType.LIGHTNING_BOLT.create(attacker.getLevel());
            if (lightningBolt != null) {
                LightningTracker.get(lightningBolt).ifPresent(lightningTracker -> lightningTracker.setOwner(attacker));
                lightningBolt.setPos(target.getX(), target.getY(), target.getZ());
                attacker.getLevel().addFreshEntity(lightningBolt);
            }
        }
        return super.hurtEnemy(stack, target, attacker);
    }
}
