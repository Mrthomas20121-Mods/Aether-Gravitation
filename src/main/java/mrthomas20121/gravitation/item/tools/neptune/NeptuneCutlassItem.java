package mrthomas20121.gravitation.item.tools.neptune;

import com.aetherteam.aether.item.AetherItems;
import mrthomas20121.gravitation.item.tools.CutlassItem;
import mrthomas20121.gravitation.util.GravitationItemTiers;
import net.minecraft.world.item.Item;

public class NeptuneCutlassItem extends CutlassItem implements NeptuneTool {

    public NeptuneCutlassItem() {
        super(GravitationItemTiers.NEPTUNE, 2, -2f, new Item.Properties().rarity(AetherItems.AETHER_LOOT));
        this.addDungeonTooltip(AetherItems.SILVER_DUNGEON_TOOLTIP);
    }
}
