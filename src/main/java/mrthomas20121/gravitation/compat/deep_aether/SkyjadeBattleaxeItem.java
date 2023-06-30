package mrthomas20121.gravitation.compat.deep_aether;

import mrthomas20121.gravitation.item.tools.BattleAxeItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.TierSortingRegistry;
import teamrazor.deepaether.init.DATiers;

public class SkyjadeBattleaxeItem extends BattleAxeItem {

    public SkyjadeBattleaxeItem() {
        super(DATiers.SKYJADE, 8.5f, -3.3f, new Item.Properties());
    }
}
