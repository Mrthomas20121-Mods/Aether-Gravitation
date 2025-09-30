package mrthomas20121.gravitation.block.natural;

import com.aetherteam.aether.block.natural.AercloudBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public class IcyAercloud extends AercloudBlock {
    public IcyAercloud(Properties properties) {
        super(properties);
    }

    @SuppressWarnings("deprecation")
    @Override
    public void entityInside(BlockState state, Level level, BlockPos pos, Entity entity) {
        super.entityInside(state, level, pos, entity);

        if(entity instanceof LivingEntity living) {
            living.setIsInPowderSnow(true);
        }
    }
}
