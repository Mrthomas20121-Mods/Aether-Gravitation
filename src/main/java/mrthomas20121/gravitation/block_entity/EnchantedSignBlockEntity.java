package mrthomas20121.gravitation.block_entity;

import com.aetherteam.aether.blockentity.AetherBlockEntityTypes;
import com.aetherteam.aether.blockentity.SkyrootSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class EnchantedSignBlockEntity extends SignBlockEntity {

    public EnchantedSignBlockEntity(BlockPos pos, BlockState state) {
        super(pos, state);
    }

    public BlockEntityType<EnchantedSignBlockEntity> getType() {
        return GraviBlockEntityTypes.ENCHANTED_SIGN.get();
    }
}
