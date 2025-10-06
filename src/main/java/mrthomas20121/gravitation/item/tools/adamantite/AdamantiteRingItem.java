package mrthomas20121.gravitation.item.tools.adamantite;

import com.aetherteam.aether.client.AetherSoundEvents;
import com.aetherteam.aether.item.accessories.ring.RingItem;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import top.theillusivec4.curios.api.SlotContext;

public class AdamantiteRingItem extends RingItem {

    public AdamantiteRingItem() {
        super(AetherSoundEvents.ITEM_ACCESSORY_EQUIP_IRON_RING, new Properties().durability(150).rarity(Rarity.RARE));
    }

    @Override
    public int getLootingLevel(SlotContext slotContext, DamageSource source, LivingEntity target, int baseLooting, ItemStack stack) {

        return switch (baseLooting) {
            case 0 -> 5;
            case 1 -> 4;
            case 2 -> 3;
            case 3 -> 2;
            default -> super.getLootingLevel(slotContext, source, target, baseLooting, stack);
        };
    }
}
