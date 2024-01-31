package mrthomas20121.gravitation.item.tools.bronzite;

import mrthomas20121.gravitation.util.GravitationItemTiers;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;

import java.util.function.Consumer;

import static mrthomas20121.gravitation.item.GravitationItems.SALMON_ROSE;

public class BronzitePickaxeItem extends PickaxeItem {

    public BronzitePickaxeItem() {
        super(GravitationItemTiers.BRONZITE, 1, -2.8f, new Properties().rarity(SALMON_ROSE));
    }

    @Override
    public <T extends LivingEntity> int damageItem(ItemStack stack, int amount, T entity, Consumer<T> onBroken) {
        return BronziteTools.damageItem(stack, amount, entity, onBroken);
    }
}
