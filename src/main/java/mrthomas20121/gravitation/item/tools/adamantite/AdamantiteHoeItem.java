package mrthomas20121.gravitation.item.tools.adamantite;

import mrthomas20121.gravitation.item.tools.bronzite.BronziteTools;
import mrthomas20121.gravitation.util.GravitationItemTiers;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;

import java.util.function.Consumer;

import static mrthomas20121.gravitation.item.GravitationItems.SALMON_ROSE;

public class AdamantiteHoeItem extends HoeItem {

    public AdamantiteHoeItem() {
        super(GravitationItemTiers.ADAMANTITE, 1, 0.0f, new Properties().rarity(Rarity.RARE));
    }
}
