package mrthomas20121.gravitation.item.stone;

import mrthomas20121.gravitation.item.FoilItem;
import mrthomas20121.gravitation.item.GravitationFoods;
import net.minecraft.world.item.Rarity;

public class DigStoneItem extends FoilItem {

    public DigStoneItem() {
        super(new Properties().rarity(Rarity.EPIC).food(GravitationFoods.DIG_STONE).stacksTo(16));
    }
}
