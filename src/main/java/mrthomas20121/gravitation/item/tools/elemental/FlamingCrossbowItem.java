package mrthomas20121.gravitation.item.tools.elemental;

import com.aetherteam.aether.item.AetherItems;
import com.aetherteam.aether.util.EquipmentUtil;
import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.item.GraviItems;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.CrossbowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Gravitation.MOD_ID)
public class FlamingCrossbowItem extends CrossbowItem {

    public FlamingCrossbowItem() {
        super(new Properties().rarity(AetherItems.AETHER_LOOT));
    }

    @SubscribeEvent
    public static void onLivingDamage(LivingDamageEvent event) {
        LivingEntity target = event.getEntity();
        DamageSource damageSource = event.getSource();
        handleFlamingSwordAbility(target, damageSource);
    }

    /**
     * Inflicts 30 seconds of fire on the target with an extra 10 seconds if the item has flame. This occurs if the attacker attacked with full strength as determined by {@link EquipmentUtil#isFullStrength(LivingEntity)}.
     * @param target The damaged {@link LivingEntity}.
     * @param source The attacking {@link DamageSource}.
     */
    public static void handleFlamingSwordAbility(LivingEntity target, DamageSource source) {
        if (source.getDirectEntity() instanceof LivingEntity attacker) {
            if (EquipmentUtil.isFullStrength(attacker)) {
                ItemStack heldStack = attacker.getMainHandItem();
                if (heldStack.is(GraviItems.FLAMING_CROSSBOW.get())) {
                    int defaultTime = 30;
                    int fireAspectModifier = EnchantmentHelper.getEnchantmentLevel(Enchantments.FLAMING_ARROWS, attacker);
                    if (fireAspectModifier > 0) {
                        defaultTime += 10;
                    }
                    target.setSecondsOnFire(defaultTime);
                }
            }
        }
    }
}
