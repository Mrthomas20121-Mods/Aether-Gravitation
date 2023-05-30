package mrthomas20121.gravitation.capability.arrow;

import com.aetherteam.aether.capability.AetherCapabilities;
import com.aetherteam.aether.capability.arrow.PhoenixArrow;
import com.aetherteam.aether.capability.lightning.LightningTracker;
import com.aetherteam.aether.util.EquipmentUtil;
import mrthomas20121.gravitation.capability.GravitationCapabilities;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraftforge.common.util.LazyOptional;

public interface ThunderArrow extends GravitationArrow {

    AbstractArrow getArrow();

    static LazyOptional<ThunderArrow> get(AbstractArrow arrow) {
        return arrow.getCapability(GravitationCapabilities.THUNDER_ARROW_CAPABILITY);
    }

    void setThunderArrow(boolean isThunderArrow);
    boolean isThunderArrow();
}
