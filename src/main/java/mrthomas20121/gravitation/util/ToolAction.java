package mrthomas20121.gravitation.util;

import com.aetherteam.aether.event.hooks.AbilityHooks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolActions;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.HashMap;
import java.util.Map;

@Mod.EventBusSubscriber
public class ToolAction {

    private static final Map<Block, Block> stripping = new HashMap<>();

    public static void registerStripping(Block wood, Block s) {
        if(!stripping.containsKey(wood)) {
            stripping.put(wood, s);
        }
    }

    @SubscribeEvent
    public static void setupToolModifications(BlockEvent.BlockToolModificationEvent event) {
        LevelAccessor levelAccessor = event.getLevel();
        BlockPos pos = event.getPos();
        BlockState oldState = event.getState();
        net.minecraftforge.common.ToolAction toolAction = event.getToolAction();
        if(toolAction == ToolActions.AXE_STRIP) {
            if(stripping.containsKey(oldState.getBlock())) {
                BlockState newState = stripping.get(oldState.getBlock()).withPropertiesOf(oldState);
                if (newState != oldState && !event.isSimulated() && !event.isCanceled()) {
                    event.setFinalState(newState);
                }
            }
        }

    }
}
