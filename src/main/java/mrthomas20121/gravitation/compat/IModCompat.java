package mrthomas20121.gravitation.compat;

import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.data.GraviBlockstateData;
import mrthomas20121.gravitation.data.GraviItemData;
import mrthomas20121.gravitation.data.GraviLanguageData;
import mrthomas20121.gravitation.data.GraviRecipes;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Consumer;

public abstract class IModCompat {

    protected final DeferredRegister<Item> ITEMS;
    protected final DeferredRegister<Block> BLOCKS;
    private final String modid;

    public IModCompat(String modID) {
        this.modid = modID;

        this.ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Gravitation.MOD_ID);
        this.BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Gravitation.MOD_ID);
    }

    public void register(IEventBus bus) {
        this.ITEMS.register(bus);
        this.BLOCKS.register(bus);
    }

    public String getModID() {
        return this.modid;
    }

    public abstract void addLang(GraviLanguageData data);

    public void addItemModels(GraviItemData data) {

    }

    public void addBlockModels(GraviBlockstateData data) {

    }

    public void addToCreativeTab(CreativeModeTab.Output output) {

    }

    public void addRecipes(Consumer<FinishedRecipe> consumer, GraviRecipes recipes) {}
}
