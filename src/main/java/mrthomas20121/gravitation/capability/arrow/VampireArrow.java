package mrthomas20121.gravitation.capability.arrow;

import mrthomas20121.gravitation.capability.GravitationCapabilities;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraftforge.common.util.LazyOptional;

public interface VampireArrow extends GravitationArrow {

    AbstractArrow getArrow();

    static LazyOptional<VampireArrow> get(AbstractArrow arrow) {
        return arrow.getCapability(GravitationCapabilities.VAMPIRE_ARROW_CAPABILITY);
    }

    void setVampireArrow(boolean isThunderArrow);
    boolean isVampireArrow();
}
