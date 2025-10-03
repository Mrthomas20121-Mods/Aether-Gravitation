package mrthomas20121.gravitation.item.tools.bronzite;

import com.aetherteam.aether.client.AetherSoundEvents;
import com.aetherteam.aether.item.accessories.ring.RingItem;
import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;
import mrthomas20121.gravitation.Gravitation;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import top.theillusivec4.curios.api.SlotContext;

import java.util.UUID;

public class BronziteRingItem extends RingItem {

    public BronziteRingItem() {
        super(AetherSoundEvents.ITEM_ACCESSORY_EQUIP_ZANITE_RING, new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(1));
    }

    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(SlotContext slotContext, UUID uuid, ItemStack stack) {
        Multimap<Attribute, AttributeModifier> atts = LinkedHashMultimap.create();

        atts.put(Attributes.ARMOR,
                new AttributeModifier(uuid, Gravitation.MOD_ID + ":armor_bronzite_ring", 2,
                        AttributeModifier.Operation.ADDITION));

        return atts;
    }
}
