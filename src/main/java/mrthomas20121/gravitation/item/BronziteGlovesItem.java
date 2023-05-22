package mrthomas20121.gravitation.item;

import com.aetherteam.aether.item.accessories.gloves.GlovesItem;
import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.item.tools.BronziteTools;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class BronziteGlovesItem extends GlovesItem {

    public BronziteGlovesItem(double punchDamage, String glovesName, Supplier<? extends SoundEvent> glovesSound, Properties properties) {
        super(punchDamage, glovesName, glovesSound, properties);

        this.setRenderTexture(Gravitation.MOD_ID, glovesName);
    }

    @Override
    public <T extends LivingEntity> int damageItem(ItemStack stack, int amount, T entity, Consumer<T> onBroken) {
        return BronziteTools.damageItem(stack, amount, entity, onBroken);
    }
}
