package mrthomas20121.gravitation.item.tools.adamantite;

import com.aetherteam.aether.item.combat.AetherItemTiers;
import com.aetherteam.aether.item.tools.abilities.GravititeTool;
import mrthomas20121.gravitation.item.tools.BattleAxeItem;
import mrthomas20121.gravitation.util.GravitationItemTiers;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.context.UseOnContext;

public class AdamantiteBattleAxeItem extends BattleAxeItem {
    public AdamantiteBattleAxeItem() {
        super(GravitationItemTiers.ADAMANTITE, 8.5F, -3.0F, new Properties().rarity(Rarity.RARE));
    }
}
