package mrthomas20121.gravitation.block.wood;

import mrthomas20121.gravitation.block_entity.EnchantedSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class EnchantedWallSignBlock extends WallSignBlock {

    public EnchantedWallSignBlock(Properties properties, WoodType type) {
        super(properties, type);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new EnchantedSignBlockEntity(pos, state);
    }
}
