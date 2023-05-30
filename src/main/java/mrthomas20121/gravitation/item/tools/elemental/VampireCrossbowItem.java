package mrthomas20121.gravitation.item.tools.elemental;

import com.aetherteam.aether.capability.player.AetherPlayer;
import com.aetherteam.aether.item.AetherItems;
import com.aetherteam.aether.util.EquipmentUtil;
import mrthomas20121.gravitation.capability.arrow.FlamingArrow;
import mrthomas20121.gravitation.capability.arrow.VampireArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.CrossbowItem;
import net.minecraft.world.item.ItemStack;

public class VampireCrossbowItem extends GravitationCrossbowItem {

    @Override
    protected AbstractArrow customArrow(AbstractArrow arrow) {
        VampireArrow.get(arrow).ifPresent(vampireArrow -> {
            vampireArrow.setVampireArrow(true);
        });
        return arrow;
    }
}
