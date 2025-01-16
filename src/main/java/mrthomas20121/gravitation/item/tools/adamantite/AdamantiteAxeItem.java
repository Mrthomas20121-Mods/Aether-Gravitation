package mrthomas20121.gravitation.item.tools.adamantite;

import mrthomas20121.gravitation.util.GravitationItemTiers;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Rarity;

public class AdamantiteAxeItem extends AxeItem {
    public AdamantiteAxeItem() {
        super(GravitationItemTiers.ADAMANTITE, 5.5f, -3.0f, new Properties().rarity(Rarity.RARE));
    }
}
