package mrthomas20121.gravitation;

import com.aetherteam.aether.block.AetherBlocks;
import com.aetherteam.aether.item.AetherItems;
import mrthomas20121.gravitation.enchanting.GravitationEnchantments;
import mrthomas20121.gravitation.item.tools.neptune.NeptuneTool;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ItemParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.Event;
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

            if(ForgeRegistries.ENTITY_TYPES.tags().getTag(GraviTags.Entities.IS_AFFECTED_BY_HERCULE_STRENGTH).contains(event.getEntity().getType()) && hasHerculeStrength(player)) {
                int level = getEnchantmentLevel(GravitationEnchantments.HERCULES_STRENGTH.get(), player);
                event.setAmount(event.getAmount()+2f*level);
            }
        }
    }

    public static boolean hasHerculeStrength(LivingEntity p_44935_) {
        return getEnchantmentLevel(GravitationEnchantments.HERCULES_STRENGTH.get(), p_44935_) > 0;
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

    @SubscribeEvent
    public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
        BlockPos blockpos = event.getPos();
        Player livingEntity = event.getEntity();
        Level level = event.getEntity().level;
        BlockState state = level.getBlockState(blockpos);
        if(event.getItemStack().is(GraviTags.Items.CAN_CREATE_ENCHANTING_TABLE) && state.is(AetherBlocks.ENCHANTED_GRAVITITE.get())) {
            event.setUseBlock(Event.Result.ALLOW);
            level.setBlockAndUpdate(blockpos, Blocks.ENCHANTING_TABLE.defaultBlockState());
        }
    }
}
