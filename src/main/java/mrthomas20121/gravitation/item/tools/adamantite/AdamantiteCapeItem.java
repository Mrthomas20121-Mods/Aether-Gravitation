package mrthomas20121.gravitation.item.tools.adamantite;

import com.aetherteam.aether.item.accessories.cape.CapeItem;
import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;
import dev.shadowsoffire.attributeslib.api.ALObjects;
import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.item.GravitationCapeItem;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.ForgeMod;
import top.theillusivec4.curios.api.SlotContext;

import java.util.List;
import java.util.UUID;

public class AdamantiteCapeItem extends GravitationCapeItem {

    public AdamantiteCapeItem(String capeLocation, Properties properties) {
        super(capeLocation, properties);
    }

    @Override
    public List<Component> getAttributesTooltip(List<Component> tooltips, ItemStack stack) {



        return super.getAttributesTooltip(tooltips, stack);
    }

    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(SlotContext slotContext, UUID uuid, ItemStack stack) {
        Multimap<Attribute, AttributeModifier> atts = LinkedHashMultimap.create();

        atts.put(ALObjects.Attributes.DODGE_CHANCE.get(),
                new AttributeModifier(uuid, Gravitation.MOD_ID + ":adamantite_cape_overheal", 0.1f,
                        AttributeModifier.Operation.ADDITION));

        return atts;
    }
}
