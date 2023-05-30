package mrthomas20121.gravitation.capability.arrow;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.projectile.AbstractArrow;

public class ThunderArrowCapability implements ThunderArrow {
    private final AbstractArrow arrow;

    private boolean isThunderArrow;

    public ThunderArrowCapability(AbstractArrow arrow) {
        this.arrow = arrow;
    }

    @Override
    public AbstractArrow getArrow() {
        return this.arrow;
    }

    @Override
    public CompoundTag serializeNBT() {
        CompoundTag tag = new CompoundTag();
        tag.putBoolean("ThunderArrow", this.isThunderArrow());
        return tag;
    }

    @Override
    public void deserializeNBT(CompoundTag tag) {
        if (tag.contains("ThunderArrow")) {
            this.setThunderArrow(tag.getBoolean("ThunderArrow"));
        }
    }

    public void setThunderArrow(boolean isPhoenixArrow) {
        this.isThunderArrow = isPhoenixArrow;
    }

    @Override
    public boolean isThunderArrow() {
        return this.isThunderArrow;
    }
}