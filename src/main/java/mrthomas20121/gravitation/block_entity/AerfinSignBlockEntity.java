package mrthomas20121.gravitation.block_entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class AerfinSignBlockEntity extends SignBlockEntity {

    public AerfinSignBlockEntity(BlockPos pos, BlockState state) {
        super(pos, state);
    }

    public BlockEntityType<AerfinSignBlockEntity> getType() {
        return GraviBlockEntityTypes.AERFIN_SIGN.get();
    }
}
