package mrthomas20121.gravitation.item.tools;

import mrthomas20121.gravitation.item.BattleAxeItem;
import mrthomas20121.gravitation.util.GravitationItemTiers;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;

import java.util.function.Consumer;

import static mrthomas20121.gravitation.item.GraviItems.SALMON_ROSE;

public class BronziteBattleAxeItem extends BattleAxeItem {

    public BronziteBattleAxeItem() {
        super(GravitationItemTiers.BRONZITE, 8.5f, -3.1f, new Properties().rarity(SALMON_ROSE));
    }

    @Override
    public <T extends LivingEntity> int damageItem(ItemStack stack, int amount, T entity, Consumer<T> onBroken) {
        return BronziteTools.damageItem(stack, amount, entity, onBroken);
    }
}
