package mrthomas20121.gravitation.capability.arrow;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.projectile.AbstractArrow;

public class FlamingArrowCapability implements FlamingArrow {
    private final AbstractArrow arrow;

    private boolean isFlamingArrow;
    private int fireTime;

    public FlamingArrowCapability(AbstractArrow arrow) {
        this.arrow = arrow;
    }

    @Override
    public AbstractArrow getArrow() {
        return this.arrow;
    }

    @Override
    public CompoundTag serializeNBT() {
        CompoundTag tag = new CompoundTag();
        tag.putBoolean("FlamingArrow", this.isFlamingArrow());
        tag.putInt("FireTime", this.getFireTime());
        return tag;
    }

    @Override
    public void deserializeNBT(CompoundTag tag) {
        if (tag.contains("FlamingArrow")) {
            this.setFlamingArrow(tag.getBoolean("FlamingArrow"));
        }
        if (tag.contains("FireTime")) {
            this.setFireTime(tag.getInt("FireTime"));
        }
    }

    @Override
    public void setFlamingArrow(boolean isPhoenixArrow) {
        this.isFlamingArrow = isPhoenixArrow;
    }

    @Override
    public boolean isFlamingArrow() {
        return this.isFlamingArrow;
    }

    @Override
    public void setFireTime(int time) {
        this.fireTime = time;
    }

    @Override
    public int getFireTime() {
        return this.fireTime;
    }
}