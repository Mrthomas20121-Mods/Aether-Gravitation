package mrthomas20121.gravitation.item.tools.bronzite;

import mrthomas20121.gravitation.util.GravitationItemTiers;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;

import java.util.function.Consumer;

public class BronziteHoeItem extends HoeItem {

    public BronziteHoeItem() {
        super(GravitationItemTiers.BRONZITE, 1, 0.0f, new Properties().rarity(Rarity.UNCOMMON));
    }

    @Override
    public <T extends LivingEntity> int damageItem(ItemStack stack, int amount, T entity, Consumer<T> onBroken) {
        return BronziteTools.damageItem(stack, amount, entity, onBroken);
    }
}
