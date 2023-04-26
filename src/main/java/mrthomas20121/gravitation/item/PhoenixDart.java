package mrthomas20121.gravitation.item;

import com.aetherteam.aether.entity.projectile.dart.EnchantedDart;
import com.aetherteam.aether.item.combat.DartItem;
import net.minecraft.world.entity.EntityType;

import java.util.function.Supplier;

public class PhoenixDart extends DartItem {
    public PhoenixDart(Supplier<? extends EntityType<?>> dartEntityType, Properties properties) {
        super(dartEntityType, properties);
    }
}
