package mrthomas20121.gravitation.item.tools;

import com.aetherteam.aether.item.AetherItems;
import mrthomas20121.gravitation.item.CutlassItem;
import mrthomas20121.gravitation.util.GravitationItemTiers;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class NeptuneCutlassItem extends CutlassItem implements NeptuneTool {

    public NeptuneCutlassItem() {
        super(GravitationItemTiers.NEPTUNE, 2, -2f, new Item.Properties().rarity(AetherItems.AETHER_LOOT));
        this.addDungeonTooltip(AetherItems.SILVER_DUNGEON_TOOLTIP);
    }
}
