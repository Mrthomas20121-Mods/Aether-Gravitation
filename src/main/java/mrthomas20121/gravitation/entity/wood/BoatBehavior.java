package mrthomas20121.gravitation.entity.wood;

import com.aetherteam.aether.mixin.mixins.common.accessor.BoatAccessor;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.level.block.Block;

public interface BoatBehavior {

    Item getStick();
    Block getPlanks();

    default void fall(Boat boat, double y, boolean onGround) {
        BoatAccessor boatAccessor = (BoatAccessor)boat;
        boatAccessor.aether$setLastYd(boat.getDeltaMovement().y);
        if (!boat.isPassenger()) {
            if (onGround) {
                if (boat.fallDistance > 3.0F) {
                    if (boatAccessor.aether$getStatus() != Boat.Status.ON_LAND) {
                        boat.resetFallDistance();
                        return;
                    }

                    boat.causeFallDamage(boat.fallDistance, 1.0F, boat.damageSources().fall());
                    if (!boat.level().isClientSide() && !boat.isRemoved()) {
                        boat.kill();
                        if (boat.level().getGameRules().getBoolean(GameRules.RULE_DOENTITYDROPS)) {
                            int j;
                            for(j = 0; j < 3; ++j) {
                                boat.spawnAtLocation(getPlanks());
                            }

                            for(j = 0; j < 2; ++j) {
                                boat.spawnAtLocation(getStick());
                            }
                        }
                    }
                }

                boat.resetFallDistance();
            } else if (!boat.level().getFluidState(boat.blockPosition().below()).is(FluidTags.WATER) && y < 0.0) {
                boat.fallDistance -= (float)y;
            }
        }

    }
}
