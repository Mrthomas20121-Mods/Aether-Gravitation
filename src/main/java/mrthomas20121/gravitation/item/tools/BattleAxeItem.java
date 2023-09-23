package mrthomas20121.gravitation.item.tools;

import mrthomas20121.gravitation.enchanting.GravitationEnchantments;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraftforge.common.ToolActions;

public class BattleAxeItem extends AxeItem {

    public BattleAxeItem(Tier tier, float attackSpeed, float attack, Properties properties) {
        super(tier, attackSpeed, attack, properties);
    }

    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment) {
        return super.canApplyAtEnchantingTable(stack, enchantment) || enchantment.equals(GravitationEnchantments.HERCULES_STRENGTH.get());
    }

    @Override
    public boolean canPerformAction(ItemStack stack, net.minecraftforge.common.ToolAction toolAction) {
        return net.minecraftforge.common.ToolActions.DEFAULT_AXE_ACTIONS.contains(toolAction) || toolAction.equals(ToolActions.SWORD_SWEEP);
    }
}
