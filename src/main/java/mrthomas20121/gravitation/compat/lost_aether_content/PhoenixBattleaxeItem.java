package mrthomas20121.gravitation.compat.lost_aether_content;

import mrthomas20121.gravitation.item.tools.BattleAxeItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.TierSortingRegistry;

public class PhoenixBattleaxeItem extends BattleAxeItem {

    public PhoenixBattleaxeItem() {
        super(TierSortingRegistry.byName(new ResourceLocation("lost_aether:phoenix")), 8.5f, -3.3f, new Properties());
    }
}
