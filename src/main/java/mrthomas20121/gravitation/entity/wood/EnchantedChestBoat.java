package mrthomas20121.gravitation.entity.wood;

import mrthomas20121.gravitation.entity.GraviEntityTypes;
import mrthomas20121.gravitation.item.GraviItems;
import net.minecraft.core.BlockPos;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.ChestBoat;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.network.NetworkHooks;

import javax.annotation.Nonnull;

public class EnchantedChestBoat extends ChestBoat implements EnchantedBoatBehavior {
    public EnchantedChestBoat(EntityType<? extends EnchantedChestBoat> entityType, Level level) {
        super(entityType, level);
    }

    public EnchantedChestBoat(Level level, double x, double y, double z) {
        this(GraviEntityTypes.ENCHANTED_CHEST_BOAT.get(), level);
        this.setPos(x, y, z);
        this.xo = x;
        this.yo = y;
        this.zo = z;
    }

    @Nonnull
    @Override
    public Item getDropItem() {
        return GraviItems.ENCHANTED_CHEST_BOAT.get();
    }

    @Override
    protected void checkFallDamage(double y, boolean onGround, @Nonnull BlockState state, @Nonnull BlockPos pos) {
        this.fall(this, y, onGround);
    }

    @Nonnull
    @Override
    public Packet<ClientGamePacketListener> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }
}