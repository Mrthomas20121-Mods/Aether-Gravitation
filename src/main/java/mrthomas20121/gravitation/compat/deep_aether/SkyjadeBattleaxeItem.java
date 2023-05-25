package mrthomas20121.gravitation.compat.deep_aether;

import mrthomas20121.gravitation.item.tools.BattleAxeItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.TierSortingRegistry;

public class SkyjadeBattleaxeItem extends BattleAxeItem {

    public SkyjadeBattleaxeItem() {
        super(TierSortingRegistry.byName(new ResourceLocation("deep_aether:skyjade")), 8.5f, -3.3f, new Item.Properties());
    }
}
