package mrthomas20121.gravitation.item.tools;

import mrthomas20121.gravitation.GraviTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShieldItem;
import org.jetbrains.annotations.NotNull;

import static mrthomas20121.gravitation.item.GraviItems.SALMON_ROSE;

public class BronziteShieldItem extends ShieldItem {

    public BronziteShieldItem() {
        super(new Item.Properties().rarity(SALMON_ROSE));
    }

    @Override
    public boolean isValidRepairItem(@NotNull ItemStack p_43091_, ItemStack p_43092_) {
        return p_43092_.is(GraviTags.Items.BRONZITE_REPAIRING);
    }

    public int getUseDuration(@NotNull ItemStack p_43107_) {
        return 74000;
    }
}
