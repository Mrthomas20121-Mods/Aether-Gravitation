package mrthomas20121.gravitation.block.wood;

import mrthomas20121.gravitation.block.ExtendedProperties;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.CeilingHangingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class GravitationCeilingHangingSignBlock extends CeilingHangingSignBlock {

    private final ExtendedProperties extendedProperties;

    public GravitationCeilingHangingSignBlock(ExtendedProperties extendedProperties, WoodType p_248716_) {
        super(extendedProperties.getProperties(), p_248716_);
        this.extendedProperties = extendedProperties;
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return extendedProperties.getBlockEntity().apply(pos, state);
    }
}
