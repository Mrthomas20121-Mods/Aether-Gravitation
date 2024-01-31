package mrthomas20121.gravitation.item.tools.bronzite;

import mrthomas20121.gravitation.util.GravitationItemTiers;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;

import java.util.function.Consumer;

import static mrthomas20121.gravitation.item.GravitationItems.SALMON_ROSE;

public class BronziteAxeItem extends AxeItem {
    public BronziteAxeItem() {
        super(GravitationItemTiers.BRONZITE, 5.5f, -3.0f, new Properties().rarity(SALMON_ROSE));
    }

    @Override
    public <T extends LivingEntity> int damageItem(ItemStack stack, int amount, T entity, Consumer<T> onBroken) {
        return BronziteTools.damageItem(stack, amount, entity, onBroken);
    }
}
