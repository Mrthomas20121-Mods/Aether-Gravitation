package mrthomas20121.gravitation.block_entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BeladonSignBlockEntity extends SignBlockEntity {

    public BeladonSignBlockEntity(BlockPos pos, BlockState state) {
        super(pos, state);
    }

    public BlockEntityType<BeladonSignBlockEntity> getType() {
        return GraviBlockEntityTypes.BELADON_SIGN.get();
    }
}
