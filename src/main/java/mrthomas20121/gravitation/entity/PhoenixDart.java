package mrthomas20121.gravitation.entity;

import com.aetherteam.aether.entity.projectile.dart.AbstractDart;
import mrthomas20121.gravitation.item.GraviItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import javax.annotation.Nonnull;

public class PhoenixDart extends AbstractDart {

    public PhoenixDart(EntityType<? extends PhoenixDart> type, Level level) {
        super(type, level);
        this.setBaseDamage(5.0);
    }

    public PhoenixDart(Level level) {
        super(GraviEntityTypes.PHOENIX_DART.get(), level);
        this.setBaseDamage(5.0);
    }

    protected void doPostHurtEffects(@Nonnull LivingEntity living) {
        super.doPostHurtEffects(living);
        living.setSecondsOnFire(5);
    }

    @Nonnull
    protected ItemStack getPickupItem() {
        return new ItemStack(GraviItems.PHOENIX_DART.get());
    }
}