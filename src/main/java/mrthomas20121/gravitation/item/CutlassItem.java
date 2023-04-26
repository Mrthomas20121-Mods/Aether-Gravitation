package mrthomas20121.gravitation.item;

import com.aetherteam.aether.item.combat.AetherSwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraftforge.common.ToolActions;

public class CutlassItem extends AetherSwordItem {
    public CutlassItem(Tier p_43269_, int attackDamage, float attackSpeed, Properties properties) {
        super(p_43269_, attackDamage, attackSpeed, properties);
    }

    @Override
    public boolean canPerformAction(ItemStack stack, net.minecraftforge.common.ToolAction toolAction) {
        return toolAction.equals(ToolActions.SWORD_DIG);
    }
}
