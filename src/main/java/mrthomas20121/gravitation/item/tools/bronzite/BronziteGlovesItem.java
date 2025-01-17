package mrthomas20121.gravitation.item.tools.bronzite;

import com.aetherteam.aether.item.accessories.gloves.GlovesItem;
import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.util.GravitationArmorMaterials;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class BronziteGlovesItem extends GlovesItem {

    public BronziteGlovesItem(double punchDamage, String glovesName, Supplier<? extends SoundEvent> glovesSound, Properties properties) {
        super(GravitationArmorMaterials.BRONZITE, punchDamage, new ResourceLocation(Gravitation.MOD_ID, glovesName), glovesSound, properties.stacksTo(1));
    }

    @Override
    public <T extends LivingEntity> int damageItem(ItemStack stack, int amount, T entity, Consumer<T> onBroken) {
        return BronziteTools.damageItem(stack, amount, entity, onBroken);
    }
}
