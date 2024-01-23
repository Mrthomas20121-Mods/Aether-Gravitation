package mrthomas20121.gravitation.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.flag.FeatureFlag;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class ExtendedProperties {

    BiFunction<BlockPos, BlockState, BlockEntity> blockEntity;
    private final BlockBehaviour.Properties properties;

    public ExtendedProperties(BlockBehaviour.Properties properties) {
        this.properties = properties;
    }

    public static ExtendedProperties create(Block parent, Consumer<BlockBehaviour.Properties> predicate) {
        BlockBehaviour.Properties props = BlockBehaviour.Properties.copy(parent);
        predicate.accept(props);
        return new ExtendedProperties(props);
    }

    public static ExtendedProperties create(Consumer<BlockBehaviour.Properties> predicate) {
        BlockBehaviour.Properties props = BlockBehaviour.Properties.of();
        predicate.accept(props);
        return new ExtendedProperties(props);
    }

    public ExtendedProperties blockEntity(BiFunction<BlockPos, BlockState, BlockEntity> blockEntity) {
        this.blockEntity = blockEntity;
        return this;
    }

    public BiFunction<BlockPos, BlockState, BlockEntity> getBlockEntity() {
        return blockEntity;
    }

    public BlockBehaviour.Properties getProperties() {
        return properties;
    }
}
