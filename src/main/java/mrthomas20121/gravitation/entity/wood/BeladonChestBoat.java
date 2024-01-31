package mrthomas20121.gravitation.entity.wood;

import com.aetherteam.aether.item.AetherItems;
import mrthomas20121.gravitation.block.GravitationBlocks;
import mrthomas20121.gravitation.entity.GraviEntityTypes;
import mrthomas20121.gravitation.item.GravitationItems;
import net.minecraft.core.BlockPos;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.ChestBoat;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.network.NetworkHooks;

import javax.annotation.Nonnull;

public class BeladonChestBoat extends ChestBoat implements BoatBehavior {
    public BeladonChestBoat(EntityType<? extends BeladonChestBoat> entityType, Level level) {
        super(entityType, level);
    }

    public BeladonChestBoat(Level level, double x, double y, double z) {
        this(GraviEntityTypes.BELADON_CHEST_BOAT.get(), level);
        this.setPos(x, y, z);
        this.xo = x;
        this.yo = y;
        this.zo = z;
    }

    @Nonnull
    @Override
    public Item getDropItem() {
        return GravitationItems.BELADON_CHEST_BOAT.get();
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

    @Override
    public Item getStick() {
        return AetherItems.SKYROOT_STICK.get();
    }

    @Override
    public Block getPlanks() {
        return GravitationBlocks.BELADON_PLANKS.get();
    }
}