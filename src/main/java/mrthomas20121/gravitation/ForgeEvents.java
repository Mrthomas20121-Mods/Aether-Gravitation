package mrthomas20121.gravitation;

import mrthomas20121.gravitation.enchanting.GravitationEnchantments;
import mrthomas20121.gravitation.item.tools.neptune.NeptuneTool;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

import static net.minecraft.world.item.enchantment.EnchantmentHelper.getEnchantmentLevel;

@Mod.EventBusSubscriber(modid = Gravitation.MOD_ID)
public class ForgeEvents {

    @SubscribeEvent
    public static void getEntityDamage(LivingHurtEvent event) {
        if(event.getSource().getDirectEntity() instanceof Player player) {
            if(ForgeRegistries.ENTITY_TYPES.tags().getTag(GraviTags.Entities.IS_AFFECTED_BY_NEPTUNE_WRATH).contains(event.getEntity().getType()) && hasNeptuneWrath(player)) {
                int level = getEnchantmentLevel(GravitationEnchantments.NEPTUNE_WRATH.get(), player);
                event.setAmount(event.getAmount()+1.5f*level);
            }
        }
    }

    public static boolean hasNeptuneWrath(LivingEntity p_44935_) {
        return getEnchantmentLevel(GravitationEnchantments.NEPTUNE_WRATH.get(), p_44935_) > 0;
    }

    @SubscribeEvent
    public static void breakSpeedEvent(PlayerEvent.BreakSpeed event) {
        if(event.isCanceled()) {
            return;
        }

        Player player = event.getEntity();

        if(player.isInWater()) {
            if(player.getMainHandItem().getItem() instanceof NeptuneTool) {
                event.setNewSpeed(Math.max(event.getNewSpeed(), event.getOriginalSpeed() * 5.0F));
            }
        }
    }
}
