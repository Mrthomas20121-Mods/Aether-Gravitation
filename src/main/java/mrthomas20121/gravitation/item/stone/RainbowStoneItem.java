package mrthomas20121.gravitation.item.stone;

import mrthomas20121.gravitation.item.FoilItem;
import mrthomas20121.gravitation.item.GravitationFoods;
import net.minecraft.world.item.Rarity;

public class RainbowStoneItem extends FoilItem {

    public RainbowStoneItem() {
        super(new Properties().rarity(Rarity.EPIC).food(GravitationFoods.RAINBOW_STONE));
    }
}
