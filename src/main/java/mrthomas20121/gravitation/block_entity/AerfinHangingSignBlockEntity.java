package mrthomas20121.gravitation.block_entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.HangingSignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class AerfinHangingSignBlockEntity extends HangingSignBlockEntity {

    public AerfinHangingSignBlockEntity(BlockPos p_250603_, BlockState p_251674_) {
        super(p_250603_, p_251674_);
    }

    @Override
    public BlockEntityType<AerfinHangingSignBlockEntity> getType() {
        return GraviBlockEntityTypes.AERFIN_HANGING_SIGN.get();
    }
}
