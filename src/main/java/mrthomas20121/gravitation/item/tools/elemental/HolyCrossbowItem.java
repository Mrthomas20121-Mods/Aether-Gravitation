package mrthomas20121.gravitation.item.tools.elemental;

import mrthomas20121.gravitation.capability.arrow.HolyArrow;
import net.minecraft.world.entity.projectile.AbstractArrow;

public class HolyCrossbowItem extends GravitationCrossbowItem {

    public HolyCrossbowItem() {
        super();
    }

    @Override
    protected AbstractArrow customArrow(AbstractArrow arrow) {
        HolyArrow.get(arrow).ifPresent(holyArrow -> {
            holyArrow.setHolyArrow(true);
        });
        return arrow;
    }
}
