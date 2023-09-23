package mrthomas20121.gravitation.item.tools.neptune;

import com.aetherteam.aether.item.AetherItems;
import mrthomas20121.gravitation.item.tools.CutlassItem;
import mrthomas20121.gravitation.util.GravitationItemTiers;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class NeptuneCutlassItem extends CutlassItem implements NeptuneTool {

    public NeptuneCutlassItem() {
        super(GravitationItemTiers.NEPTUNE, 2, -2f, new Item.Properties().rarity(AetherItems.AETHER_LOOT));
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        super.appendHoverText(stack, level, components, flag);
        if (flag.isCreative()) {
            components.add(AetherItems.SILVER_DUNGEON_TOOLTIP);
        }

    }
}
