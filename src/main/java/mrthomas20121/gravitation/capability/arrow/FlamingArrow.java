package mrthomas20121.gravitation.capability.arrow;

import mrthomas20121.gravitation.capability.GravitationCapabilities;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraftforge.common.util.LazyOptional;

public interface FlamingArrow extends GravitationArrow {

    AbstractArrow getArrow();

    static LazyOptional<FlamingArrow> get(AbstractArrow arrow) {
        return arrow.getCapability(GravitationCapabilities.FLAMING_ARROW_CAPABILITY);
    }

    void setFlamingArrow(boolean isPhoenixArrow);
    boolean isFlamingArrow();

    void setFireTime(int time);
    int getFireTime();
}
