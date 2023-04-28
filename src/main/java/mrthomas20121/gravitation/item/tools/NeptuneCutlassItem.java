package mrthomas20121.gravitation.item.tools;

import com.aetherteam.aether.item.AetherItems;
import mrthomas20121.gravitation.item.CutlassItem;
import mrthomas20121.gravitation.util.GraviTiers;
import net.minecraft.world.item.Item;

public class NeptuneCutlassItem extends CutlassItem implements NeptuneTool {

    public NeptuneCutlassItem() {
        super(GraviTiers.NEPTUNE, 5, 1.5f, new Item.Properties().rarity(AetherItems.AETHER_LOOT));
        this.addDungeonTooltip(AetherItems.SILVER_DUNGEON_TOOLTIP);
    }
}
