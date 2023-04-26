package mrthomas20121.gravitation.item;

import com.aetherteam.aether.item.AetherItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;

public class GraviCreativeTabs {
    public static CreativeModeTab TOOLS = CreativeModeTab.builder(CreativeModeTab.Row.TOP, 5).icon(() -> new ItemStack(AetherItems.NEPTUNE_BOOTS.get())).title(Component.translatable("itemGroup.gravitation_tools")).build();
}
