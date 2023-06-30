package mrthomas20121.gravitation.compat.lost_aether_content;

import com.aetherteam.aether.item.AetherItems;
import com.legacy.lost_aether.item.util.LCItemTier;
import mrthomas20121.gravitation.item.tools.BattleAxeItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.TierSortingRegistry;

public class PhoenixBattleaxeItem extends BattleAxeItem {

    public PhoenixBattleaxeItem() {
        super(LCItemTier.PHOENIX, 8.5f, -3.3f, new Properties().rarity(AetherItems.AETHER_LOOT));
    }
}
