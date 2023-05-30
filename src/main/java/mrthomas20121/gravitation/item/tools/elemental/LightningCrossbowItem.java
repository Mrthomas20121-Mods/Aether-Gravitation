package mrthomas20121.gravitation.item.tools.elemental;

import mrthomas20121.gravitation.capability.arrow.ThunderArrow;
import net.minecraft.world.entity.projectile.AbstractArrow;

public class LightningCrossbowItem extends GravitationCrossbowItem {

    @Override
    protected AbstractArrow customArrow(AbstractArrow arrow) {
        ThunderArrow.get(arrow).ifPresent(a -> {
            a.setThunderArrow(true);
        });
        return arrow;
    }
}
