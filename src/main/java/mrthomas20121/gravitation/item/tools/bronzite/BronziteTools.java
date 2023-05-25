package mrthomas20121.gravitation.item.tools.bronzite;

import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;

import java.util.function.Consumer;

public class BronziteTools {

    public static <T extends LivingEntity> int damageItem(ItemStack stack, int amount, T entity, Consumer<T> onBroken) {
        RandomSource randomSource = RandomSource.create();

        if(randomSource.nextFloat() > 0.8f) {
            return 0;
        }
        return amount;
    }
}
