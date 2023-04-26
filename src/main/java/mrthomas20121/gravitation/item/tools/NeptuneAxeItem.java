package mrthomas20121.gravitation.item.tools;

import com.aetherteam.aether.item.AetherItems;
import mrthomas20121.gravitation.util.GraviTiers;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;

public class NeptuneAxeItem extends AxeItem {
    public NeptuneAxeItem() {
        super(GraviTiers.NEPTUNE, 5.0f, -3.0f, new Item.Properties().rarity(AetherItems.AETHER_LOOT));
    }
}
