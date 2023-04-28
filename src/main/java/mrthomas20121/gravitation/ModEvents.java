package mrthomas20121.gravitation;

import mrthomas20121.gravitation.item.GraviCreativeTabs;
import mrthomas20121.gravitation.item.GraviItems;
import mrthomas20121.gravitation.loot.LootDataProvider;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Gravitation.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {

    @SubscribeEvent
    public static void datagen(GatherDataEvent event) {
        event.getGenerator().addProvider(event.includeServer(), new LootDataProvider(event.getGenerator().getPackOutput()));
    }

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        GraviCreativeTabs.TOOLS = event.registerCreativeModeTab(new ResourceLocation(Gravitation.MOD_ID, "tools"), (builder) -> builder
                .icon(() -> new ItemStack(GraviItems.NEPTUNE_CUTLASS.get()))
                .title(Component.translatable("itemGroup.gravitation.tools"))
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
                }));
    }
}
