package mrthomas20121.gravitation.item.tools.elemental;

import com.aetherteam.aether.capability.player.AetherPlayer;
import com.aetherteam.aether.item.AetherItems;
import com.aetherteam.aether.util.EquipmentUtil;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CrossbowItem;
import net.minecraft.world.item.ItemStack;

public class VampireCrossbowItem extends CrossbowItem {

    public VampireCrossbowItem() {
        super(new Properties().rarity(AetherItems.AETHER_LOOT));
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (EquipmentUtil.isFullStrength(attacker)) {
            if (attacker.getHealth() < attacker.getMaxHealth()) {
                if (attacker instanceof Player player) {
                    AetherPlayer.get(player).ifPresent(aetherPlayer -> aetherPlayer.setVampireHealing(true));
                } else {
                    attacker.heal(1.0F);
                }
            }
        }
        return super.hurtEnemy(stack, target, attacker);
    }
}
