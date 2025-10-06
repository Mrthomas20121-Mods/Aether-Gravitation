package mrthomas20121.gravitation.item.tools.adamantite;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import dev.shadowsoffire.attributeslib.api.ALObjects;
import mrthomas20121.gravitation.util.GravitationItemTiers;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Rarity;
import org.jetbrains.annotations.NotNull;

public class AdamantitePickaxeItem extends PickaxeItem implements AdamantiteTool {

    public AdamantitePickaxeItem() {
        super(GravitationItemTiers.ADAMANTITE, 1, -2.8f, new Properties().rarity(Rarity.RARE));
    }

    @Override
    public @NotNull Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlot equipmentSlot) {
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();

        builder.putAll(super.getDefaultAttributeModifiers(equipmentSlot));

        if(equipmentSlot.equals(EquipmentSlot.MAINHAND)) {
            builder.put(ALObjects.Attributes.ARMOR_SHRED.get(),
                    new AttributeModifier(ARMOR_SHRED_BASE, "gravitation:adamantite_armor_shred", 0.3f, AttributeModifier.Operation.ADDITION));
        }

        return builder.build();
    }
}
