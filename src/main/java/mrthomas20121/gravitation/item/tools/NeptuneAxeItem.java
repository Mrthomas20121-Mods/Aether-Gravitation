package mrthomas20121.gravitation.item.tools;

import com.aetherteam.aether.item.AetherItems;
import mrthomas20121.gravitation.util.GraviTiers;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class NeptuneAxeItem extends AxeItem {
    public NeptuneAxeItem() {
        super(GraviTiers.NEPTUNE, 5.0f, -3.0f, new Item.Properties().rarity(AetherItems.AETHER_LOOT));
    }

    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        super.appendHoverText(stack, level, components, flag);
        if (flag.isCreative()) {
            components.add(AetherItems.SILVER_DUNGEON_TOOLTIP);
        }

    }
}
