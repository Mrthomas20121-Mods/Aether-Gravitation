package mrthomas20121.gravitation.data;

import com.aetherteam.aether.block.AetherBlockStateProperties;
import mrthomas20121.gravitation.block.GravitationBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class GravitationFeatureStates {

    public static final BlockState FROZEN_AETHER_GRASS = doubleDrop(GravitationBlocks.FROZEN_AETHER_GRASS_BLOCK.get());
    public static final BlockState ICY_AERCLOUD = doubleDrop(GravitationBlocks.ICY_AERCLOUD.get());
    public static final BlockState ENCHANTED_LEAVES = doubleDrop(GravitationBlocks.ENCHANTED_LEAVES.get());
    public static final BlockState BELADON_LEAVES = doubleDrop(GravitationBlocks.BELADON_LEAVES.get());
    public static final BlockState AERFIN_LEAVES = doubleDrop(GravitationBlocks.AERFIN_LEAVES.get());
    public static final BlockState ORANGE_AERFIN_LEAVES = doubleDrop(GravitationBlocks.ORANGE_AERFIN_LEAVES.get());
    public static final BlockState BLACK_BERRY_BUSH = doubleDrop(GravitationBlocks.BLACK_BERRY_BUSH.get());

    private static BlockState doubleDrop(Block state) {
        return state.defaultBlockState().setValue(AetherBlockStateProperties.DOUBLE_DROPS, true);
    }
}
