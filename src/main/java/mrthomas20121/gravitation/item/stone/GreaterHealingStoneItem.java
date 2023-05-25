package mrthomas20121.gravitation.item.stone;

import mrthomas20121.gravitation.item.FoilItem;
import mrthomas20121.gravitation.item.GravitationFoods;
import net.minecraft.world.item.Rarity;

public class GreaterHealingStoneItem extends FoilItem {

    public GreaterHealingStoneItem() {
        super(new Properties().rarity(Rarity.EPIC).food(GravitationFoods.GREATER_HEALING_STONE));
    }
}
