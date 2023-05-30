package mrthomas20121.gravitation.capability.arrow;

import mrthomas20121.gravitation.capability.GravitationCapabilities;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraftforge.common.util.LazyOptional;

public interface HolyArrow extends GravitationArrow {

    AbstractArrow getArrow();

    static LazyOptional<HolyArrow> get(AbstractArrow arrow) {
        return arrow.getCapability(GravitationCapabilities.HOLY_ARROW_CAPABILITY);
    }

    void setHolyArrow(boolean isThunderArrow);
    boolean isHolyArrow();
}
