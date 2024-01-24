package mrthomas20121.gravitation.block.wood;

import mrthomas20121.gravitation.block_entity.AerfinHangingSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.CeilingHangingSignBlock;
import net.minecraft.world.level.block.WallHangingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class AerfinWallHangingSignBlock extends WallHangingSignBlock {

    public AerfinWallHangingSignBlock(Properties properties, WoodType type) {
        super(properties, type);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new AerfinHangingSignBlockEntity(pos, state);
    }
}
