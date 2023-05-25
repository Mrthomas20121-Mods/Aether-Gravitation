package mrthomas20121.gravitation.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class FoilItem extends Item {

    public FoilItem(Properties properties) {
        super(properties);
    }

    /**
     * @param stack The {@link ItemStack}.
     * @return Whether the item should render an enchantment glint, as a {@link Boolean}.
     */
    @Override
    public boolean isFoil(@NotNull ItemStack stack) {
        return true;
    }
}
