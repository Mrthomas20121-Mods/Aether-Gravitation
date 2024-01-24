package mrthomas20121.gravitation.block.wood;

import mrthomas20121.gravitation.block_entity.AerfinHangingSignBlockEntity;
import mrthomas20121.gravitation.block_entity.BeladonHangingSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.CeilingHangingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class BeladonHangingSignBlock extends CeilingHangingSignBlock {

    public BeladonHangingSignBlock(Properties properties, WoodType type) {
        super(properties, type);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new BeladonHangingSignBlockEntity(pos, state);
    }
}
