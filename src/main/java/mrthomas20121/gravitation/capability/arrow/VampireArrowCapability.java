package mrthomas20121.gravitation.capability.arrow;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.projectile.AbstractArrow;

public class VampireArrowCapability implements VampireArrow {
    private final AbstractArrow arrow;

    private boolean isVampireArrow;

    public VampireArrowCapability(AbstractArrow arrow) {
        this.arrow = arrow;
    }

    @Override
    public AbstractArrow getArrow() {
        return this.arrow;
    }

    @Override
    public CompoundTag serializeNBT() {
        CompoundTag tag = new CompoundTag();
        tag.putBoolean("VampireArrow", this.isVampireArrow());
        return tag;
    }

    @Override
    public void deserializeNBT(CompoundTag tag) {
        if (tag.contains("VampireArrow")) {
            this.setVampireArrow(tag.getBoolean("VampireArrow"));
        }
    }

    public void setVampireArrow(boolean isVampireArrow) {
        this.isVampireArrow = isVampireArrow;
    }

    @Override
    public boolean isVampireArrow() {
        return this.isVampireArrow;
    }
}