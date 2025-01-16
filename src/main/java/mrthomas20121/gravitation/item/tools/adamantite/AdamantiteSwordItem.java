package mrthomas20121.gravitation.item.tools.adamantite;

import mrthomas20121.gravitation.item.tools.bronzite.BronziteTools;
import mrthomas20121.gravitation.util.GravitationItemTiers;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SwordItem;

import java.util.function.Consumer;

import static mrthomas20121.gravitation.item.GravitationItems.SALMON_ROSE;

public class AdamantiteSwordItem extends SwordItem {

    public AdamantiteSwordItem() {
        super(GravitationItemTiers.ADAMANTITE, 4, -2.4f, new Properties().rarity(Rarity.RARE));
    }
}
