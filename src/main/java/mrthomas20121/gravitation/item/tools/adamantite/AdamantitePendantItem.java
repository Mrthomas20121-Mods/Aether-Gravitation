package mrthomas20121.gravitation.item.tools.adamantite;

import com.aetherteam.aether.client.AetherSoundEvents;
import com.aetherteam.aether.item.accessories.pendant.PendantItem;
import mrthomas20121.gravitation.Gravitation;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.storage.loot.LootContext;
import top.theillusivec4.curios.api.SlotContext;

public class AdamantitePendantItem extends PendantItem {

    public AdamantitePendantItem() {
        super(new ResourceLocation(Gravitation.MOD_ID, "adamantite_pendant"), AetherSoundEvents.ITEM_ACCESSORY_EQUIP_IRON_RING, new Properties().durability(150).rarity(Rarity.RARE));
    }

    @Override
    public int getFortuneLevel(SlotContext slotContext, LootContext lootContext, ItemStack stack) {
        return 5;
    }
}
