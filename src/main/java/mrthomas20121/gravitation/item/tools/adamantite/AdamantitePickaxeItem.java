package mrthomas20121.gravitation.item.tools.adamantite;

import mrthomas20121.gravitation.util.GravitationItemTiers;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Rarity;

import static mrthomas20121.gravitation.item.GravitationItems.SALMON_ROSE;

public class AdamantitePickaxeItem extends PickaxeItem {

    public AdamantitePickaxeItem() {
        super(GravitationItemTiers.ADAMANTITE, 1, -2.8f, new Properties().rarity(Rarity.RARE));
    }
}
