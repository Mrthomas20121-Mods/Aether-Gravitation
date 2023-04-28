package mrthomas20121.gravitation.item.tools;

import com.aetherteam.aether.item.AetherItems;
import mrthomas20121.gravitation.util.GraviTiers;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class NeptuneShovelItem extends ShovelItem implements NeptuneTool {

    public NeptuneShovelItem() {
        super(GraviTiers.NEPTUNE, 1.5f, -3.0f, new Item.Properties().rarity(AetherItems.AETHER_LOOT));
    }

    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        super.appendHoverText(stack, level, components, flag);
        if (flag.isCreative()) {
            components.add(AetherItems.SILVER_DUNGEON_TOOLTIP);
        }
    }
}
