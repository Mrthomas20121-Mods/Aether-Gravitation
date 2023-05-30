package mrthomas20121.gravitation.capability.arrow;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.projectile.AbstractArrow;

public class HolyArrowCapability implements HolyArrow {
    private final AbstractArrow arrow;

    private boolean isHolyArrow;

    public HolyArrowCapability(AbstractArrow arrow) {
        this.arrow = arrow;
    }

    @Override
    public AbstractArrow getArrow() {
        return this.arrow;
    }

    @Override
    public CompoundTag serializeNBT() {
        CompoundTag tag = new CompoundTag();
        tag.putBoolean("HolyArrow", this.isHolyArrow());
        return tag;
    }

    @Override
    public void deserializeNBT(CompoundTag tag) {
        if (tag.contains("HolyArrow")) {
            this.setHolyArrow(tag.getBoolean("HolyArrow"));
        }
    }

    @Override
    public void setHolyArrow(boolean isHolyArrow) {
        this.isHolyArrow = isHolyArrow;
    }

    @Override
    public boolean isHolyArrow() {
        return this.isHolyArrow;
    }
}