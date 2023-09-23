package mrthomas20121.gravitation.item.tools;

import com.aetherteam.aether.item.combat.AetherItemTiers;
import com.aetherteam.aether.item.tools.abilities.GravititeTool;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;

public class GravititeBattleAxeItem extends BattleAxeItem implements GravititeTool {
    public GravititeBattleAxeItem() {
        super(AetherItemTiers.GRAVITITE, 8.5F, -3.0F, new Item.Properties());
    }

    public InteractionResult useOn(UseOnContext context) {
        return !this.floatBlock(context) ? super.useOn(context) : InteractionResult.sidedSuccess(context.getLevel().isClientSide());
    }
}
