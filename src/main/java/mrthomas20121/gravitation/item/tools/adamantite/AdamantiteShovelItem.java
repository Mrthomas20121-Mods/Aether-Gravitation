package mrthomas20121.gravitation.item.tools.adamantite;

import mrthomas20121.gravitation.util.GravitationItemTiers;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ShovelItem;

public class AdamantiteShovelItem extends ShovelItem {

    public AdamantiteShovelItem() {
        super(GravitationItemTiers.ADAMANTITE, 2f, -3.0f, new Properties().rarity(Rarity.RARE));
    }
}
