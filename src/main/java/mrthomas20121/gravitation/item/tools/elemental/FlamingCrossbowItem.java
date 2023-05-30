package mrthomas20121.gravitation.item.tools.elemental;

import mrthomas20121.gravitation.capability.arrow.FlamingArrow;
import net.minecraft.world.entity.projectile.AbstractArrow;

public class FlamingCrossbowItem extends GravitationCrossbowItem {

    @Override
    protected AbstractArrow customArrow(AbstractArrow arrow) {
        FlamingArrow.get(arrow).ifPresent(flamingArrow -> {
            flamingArrow.setFlamingArrow(true);
            flamingArrow.setFireTime(20);
        });
        return arrow;
    }
}
