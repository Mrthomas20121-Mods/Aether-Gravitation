package mrthomas20121.gravitation.util;

import com.aetherteam.aether.capability.lightning.LightningTracker;
import com.aetherteam.aether.capability.player.AetherPlayer;
import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.capability.arrow.FlamingArrow;
import mrthomas20121.gravitation.capability.arrow.HolyArrow;
import mrthomas20121.gravitation.capability.arrow.ThunderArrow;
import mrthomas20121.gravitation.capability.arrow.VampireArrow;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraftforge.event.entity.ProjectileImpactEvent;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Gravitation.MOD_ID)
public class CrossbowHooks {

    public static void damageEvent(LivingDamageEvent event) {
        DamageSource source = event.getSource();

        if(source.is(DamageTypes.ARROW)) {
            if(source.getDirectEntity() instanceof AbstractArrow arrow) {
                if(event.getEntity().getMobType().equals(MobType.UNDEAD)) {
                    HolyArrow.get(arrow).ifPresent(holyArrow -> {
                        if(holyArrow.isHolyArrow()) {
                            event.setAmount(event.getAmount()+15.0f);
                        }
                    });
                }
            }
        }
    }

    @SubscribeEvent
    public static void arrowEvent(ProjectileImpactEvent event) {
        HitResult result = event.getRayTraceResult();
        Projectile projectile = event.getProjectile();

        if(!event.isCanceled()) {
            if (result instanceof EntityHitResult entityHitResult && projectile instanceof AbstractArrow abstractArrow) {
                Entity impactedEntity = entityHitResult.getEntity();
                if (impactedEntity.getType() == EntityType.ENDERMAN) {
                    return;
                }
                vampireArrowHit(impactedEntity, abstractArrow);
                thunderArrowHit(impactedEntity, abstractArrow);
                flamingArrowHit(impactedEntity, abstractArrow);
            }
        }
    }

    public static void flamingArrowHit(Entity impactedEntity, AbstractArrow abstractArrow) {
        FlamingArrow.get(abstractArrow).ifPresent(arrow -> {
            if (arrow.isFlamingArrow() && arrow.getFireTime() > 0) {
                impactedEntity.setSecondsOnFire(arrow.getFireTime());
            }
        });
    }

    public static void vampireArrowHit(Entity impactedEntity, AbstractArrow abstractArrow) {
        VampireArrow.get(abstractArrow).ifPresent(arrow -> {
            if (arrow.isVampireArrow()) {
                if(abstractArrow.getOwner() != null && abstractArrow.getOwner() instanceof LivingEntity attacker) {
                    if (isFullStrength(attacker)) {
                        if (attacker.getHealth() < attacker.getMaxHealth()) {
                            if (attacker instanceof Player player) {
                                AetherPlayer.get(player).ifPresent(aetherPlayer -> aetherPlayer.setVampireHealing(true));
                            } else {
                                attacker.heal(1.0F);
                            }
                        }
                    }
                }
            }
        });
    }

    public static void thunderArrowHit(Entity impactedEntity, AbstractArrow abstractArrow) {
        ThunderArrow.get(abstractArrow).ifPresent(arrow -> {
            if (arrow.isThunderArrow()) {
                if(abstractArrow.getOwner() != null) {
                    summonLightning(impactedEntity, abstractArrow.getOwner());
                }
            }
        });
    }

    /**
     * Summon a lightning at the target position if the player is full strength or the entity is not a player
     * @param target the target entity
     * @param attacker the attacker entity
     */
    private static void summonLightning(Entity target, Entity attacker) {
        if (isFullStrength(attacker)) {
            LightningBolt lightningBolt = EntityType.LIGHTNING_BOLT.create(attacker.getLevel());
            if (lightningBolt != null) {
                LightningTracker.get(lightningBolt).ifPresent(lightningTracker -> lightningTracker.setOwner(attacker));
                lightningBolt.setPos(target.getX(), target.getY(), target.getZ());
                attacker.getLevel().addFreshEntity(lightningBolt);
            }
        }
    }

    /**
     * An attack is full strength if either it's a player that attacked with full attack strength, or if the entity is not a player.
     * @param attacker The attacking {@link LivingEntity}.
     * @return Whether the attack was full strength, as a {@link Boolean}.
     */
    private static boolean isFullStrength(Entity attacker) {
        return !(attacker instanceof Player player) || player.getAttackStrengthScale(1.0F) == 1.0F;
    }
}
