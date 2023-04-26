package mrthomas20121.gravitation.item.tools;

import com.aetherteam.aether.item.AetherItems;
import com.aetherteam.aether.item.combat.AetherItemTiers;
import com.aetherteam.aether.item.tools.abilities.ValkyrieTool;
import com.aetherteam.aether.item.tools.valkyrie.ValkyrieAxeItem;
import mrthomas20121.gravitation.item.BattleAxeItem;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class ValkyrieBattleAxeItem extends BattleAxeItem implements ValkyrieTool {

    public ValkyrieBattleAxeItem() {
        super(AetherItemTiers.VALKYRIE, 5.0F, -3.3F, (new Item.Properties()).rarity(AetherItems.AETHER_LOOT));
    }

    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        super.appendHoverText(stack, level, components, flag);
        if (flag.isCreative()) {
            components.add(AetherItems.SILVER_DUNGEON_TOOLTIP);
        }
    }
}
