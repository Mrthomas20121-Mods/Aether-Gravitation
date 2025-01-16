package mrthomas20121.gravitation.item.tools.adamantite;

import com.aetherteam.aether.item.accessories.gloves.GlovesItem;
import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.item.tools.bronzite.BronziteTools;
import mrthomas20121.gravitation.util.GravitationArmorMaterials;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class AdamantiteGlovesItem extends GlovesItem {

    public AdamantiteGlovesItem(double punchDamage, String glovesName, Supplier<? extends SoundEvent> glovesSound, Properties properties) {
        super(GravitationArmorMaterials.ADAMANTITE, punchDamage, glovesName, glovesSound, properties.stacksTo(1).rarity(Rarity.RARE));

        this.setRenderTexture(Gravitation.MOD_ID, glovesName);
    }
}
