package mrthomas20121.gravitation.item.tools;

import com.aetherteam.aether.item.combat.AetherItemTiers;
import com.aetherteam.aether.item.tools.abilities.GravititeTool;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;

public class GravititeBattleAxeItem extends BattleAxeItem implements GravititeTool {
    public GravititeBattleAxeItem() {
        super(AetherItemTiers.GRAVITITE, 8.5F, -3.0F, new Item.Properties());
    }

    /**
     * Interaction code to prioritize the ability at {@link GravititeTool#floatBlock(UseOnContext)} over the normal tool interactions.
     * @param context The {@link UseOnContext} of the tool interaction.
     * @return The {@link InteractionResult} of the interaction, which returns the result of {@link AxeItem#useOn(UseOnContext)} if the ability fails and a {@link InteractionResult#sidedSuccess(boolean)} if it doesn't.
     */
    public InteractionResult useOn(UseOnContext context) {
        if(!this.floatBlock(context)) {
            return super.useOn(context);
        }
        else {
            return InteractionResult.sidedSuccess(context.getLevel().isClientSide());
        }
    }
}
