package mrthomas20121.gravitation.capability.arrow;

import mrthomas20121.gravitation.capability.GravitationCapabilities;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.util.LazyOptional;

import javax.annotation.Nonnull;

public class ThunderArrowProvider implements ICapabilitySerializable<CompoundTag> {
        private final ThunderArrow arrow;

        public ThunderArrowProvider(ThunderArrow arrow) {
            this.arrow = arrow;
        }

        @Override
        public CompoundTag serializeNBT() {
            return this.arrow.serializeNBT();
        }

        @Override
        public void deserializeNBT(CompoundTag tag) {
            this.arrow.deserializeNBT(tag);
        }

        @SuppressWarnings("unchecked")
        @Nonnull
        @Override
        public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, Direction side) {
            if (cap == GravitationCapabilities.THUNDER_ARROW_CAPABILITY) {
                return LazyOptional.of(() -> (T) this.arrow);
            }
            return LazyOptional.empty();
        }
}
