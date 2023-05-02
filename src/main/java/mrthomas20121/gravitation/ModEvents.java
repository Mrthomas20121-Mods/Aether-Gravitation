package mrthomas20121.gravitation;

import mrthomas20121.gravitation.block.GraviBlocks;
import mrthomas20121.gravitation.item.GraviCreativeTabs;
import mrthomas20121.gravitation.item.GraviItems;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Gravitation.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        GraviCreativeTabs.TOOLS = event.registerCreativeModeTab(new ResourceLocation(Gravitation.MOD_ID, "equipments"), (builder) -> builder
                .icon(() -> new ItemStack(GraviItems.NEPTUNE_PICKAXE.get()))
                .title(Component.translatable("itemGroup.gravitation.equipments"))
                .displayItems((parameters, output) -> {
                    output.accept(GraviItems.NEPTUNE_AXE.get());
                    output.accept(GraviItems.NEPTUNE_BATTLEAXE.get());
                    output.accept(GraviItems.NEPTUNE_CUTLASS.get());
                    output.accept(GraviItems.NEPTUNE_PICKAXE.get());
                    output.accept(GraviItems.NEPTUNE_SHOVEL.get());
                    output.accept(GraviItems.VALKYRIE_BATTLEAXE.get());
                    output.accept(GraviItems.GRAVITITE_BATTLEAXE.get());
                    output.accept(GraviItems.ZANITE_BATTLEAXE.get());
                    output.accept(GraviItems.PHOENIX_DART.get());
                    output.accept(GraviItems.PHOENIX_DART_SHOOTER.get());
                    output.accept(GraviBlocks.ENCHANTED_SAPLING.get());
                }));

        GraviCreativeTabs.BUILDING_BLOCKS = event.registerCreativeModeTab(new ResourceLocation(Gravitation.MOD_ID, "building_blocks"), (builder) -> builder
                .icon(() -> new ItemStack(GraviBlocks.STRIPPED_ENCHANTED_LOG.get()))
                .title(Component.translatable("itemGroup.gravitation.building_blocks"))
                .displayItems((parameters, output) -> {
                    output.accept(GraviBlocks.ENCHANTED_SIGN.get());
                    output.accept(GraviBlocks.ENCHANTED_WALL_SIGN.get());
                    output.accept(GraviBlocks.ENCHANTED_LOG.get());
                    output.accept(GraviBlocks.STRIPPED_ENCHANTED_LOG.get());
                    output.accept(GraviBlocks.ENCHANTED_WOOD.get());
                    output.accept(GraviBlocks.STRIPPED_ENCHANTED_WOOD.get());
                    output.accept(GraviBlocks.ENCHANTED_PLANKS.get());
                    output.accept(GraviBlocks.ENCHANTED_STAIRS.get());
                    output.accept(GraviBlocks.ENCHANTED_SLAB.get());
                    output.accept(GraviBlocks.ENCHANTED_DOOR.get());
                    output.accept(GraviBlocks.ENCHANTED_TRAPDOOR.get());
                    output.accept(GraviBlocks.ENCHANTED_FENCE.get());
                    output.accept(GraviBlocks.ENCHANTED_FENCE_GATE.get());
                    output.accept(GraviBlocks.ENCHANTED_BUTTON.get());

                }));
    }
}
