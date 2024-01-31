package mrthomas20121.gravitation.entity.wood;

import com.aetherteam.aether.item.AetherItems;
import mrthomas20121.gravitation.block.GravitationBlocks;
import mrthomas20121.gravitation.entity.GraviEntityTypes;
import mrthomas20121.gravitation.item.GravitationItems;
import net.minecraft.core.BlockPos;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.network.NetworkHooks;

import javax.annotation.Nonnull;

public class EnchantedBoat extends Boat implements BoatBehavior {
    public EnchantedBoat(EntityType<? extends EnchantedBoat> type, Level level) {
        super(type, level);
    }

    public EnchantedBoat(Level level, double x, double y, double z) {
        this(GraviEntityTypes.ENCHANTED_BOAT.get(), level);
        this.setPos(x, y, z);
        this.xo = x;
        this.yo = y;
        this.zo = z;
    }

    @Nonnull
    @Override
    public Item getDropItem() {
        return GravitationItems.ENCHANTED_BOAT.get();
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
        return GravitationBlocks.ENCHANTED_PLANKS.get();
    }
}