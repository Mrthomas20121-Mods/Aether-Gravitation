package mrthomas20121.gravitation.item.tools;

import com.aetherteam.aether.item.combat.AetherItemTiers;
import com.aetherteam.aether.item.tools.abilities.GravititeTool;
import com.aetherteam.aether.item.tools.gravitite.GravititeAxeItem;
import mrthomas20121.gravitation.item.BattleAxeItem;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public class GravititeBattleAxeItem extends BattleAxeItem implements GravititeTool {
    public GravititeBattleAxeItem() {
        super(AetherItemTiers.GRAVITITE, 5.0F, -3.0F, new Item.Properties());
    }

    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        BlockPos blockPos = context.getClickedPos();
        ItemStack itemStack = context.getItemInHand();
        BlockState blockState = level.getBlockState(blockPos);
        Player player = context.getPlayer();
        InteractionHand hand = context.getHand();
        return !this.floatBlock(level, blockPos, itemStack, blockState, player, hand) ? super.useOn(context) : InteractionResult.sidedSuccess(level.isClientSide());
    }
}
