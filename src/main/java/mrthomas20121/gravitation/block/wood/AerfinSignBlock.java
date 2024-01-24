package mrthomas20121.gravitation.block.wood;

import mrthomas20121.gravitation.block_entity.AerfinSignBlockEntity;
import mrthomas20121.gravitation.block_entity.BeladonSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class AerfinSignBlock extends StandingSignBlock {

    public AerfinSignBlock(Properties properties, WoodType type) {
        super(properties, type);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new AerfinSignBlockEntity(pos, state);
    }
}