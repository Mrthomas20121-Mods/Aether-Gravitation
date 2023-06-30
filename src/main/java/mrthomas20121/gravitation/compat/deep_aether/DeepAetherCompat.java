package mrthomas20121.gravitation.compat.deep_aether;

import com.aetherteam.aether.item.AetherItems;
import mrthomas20121.gravitation.compat.IModCompat;
import mrthomas20121.gravitation.data.GraviItemData;
import mrthomas20121.gravitation.data.GraviLanguageData;
import mrthomas20121.gravitation.data.GraviRecipes;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;
import teamrazor.deepaether.init.DAItems;

import java.util.function.Consumer;

public class DeepAetherCompat extends IModCompat {

    private final RegistryObject<Item> skyjadeBattleaxe;
    private final RegistryObject<Item> cloudiumBattleaxe;

    public DeepAetherCompat() {
        super("deep_aether");
        this.skyjadeBattleaxe = ITEMS.register("skyjade_battleaxe", SkyjadeBattleaxeItem::new);
        this.cloudiumBattleaxe = ITEMS.register("cloudium_battleaxe", CloudiumBattleaxeItem::new);
    }

    @Override
    public void addLang(GraviLanguageData data) {
        data.addItem(this.skyjadeBattleaxe, "SkyJade Battleaxe");
        data.addItem(this.cloudiumBattleaxe, "Cloudium Battleaxe");
    }

    @Override
    public void addItemModels(GraviItemData data) {
        data.handheldItem(this.skyjadeBattleaxe.get(), "");
        data.handheldItem(this.cloudiumBattleaxe.get(), "");
        super.addItemModels(data);
    }

    @Override
    public void addToCreativeTab(CreativeModeTab.Output output) {
        output.accept(this.skyjadeBattleaxe.get());
        output.accept(this.cloudiumBattleaxe.get());
    }

    @Override
    public void addRecipes(Consumer<FinishedRecipe> consumer, GraviRecipes recipes) {
        super.addRecipes(consumer, recipes);
        //recipes.conditionalBattleaxeRecipe(consumer, "compat/deep_aether/skyjade_battleaxe", this.getModID(), DAItems.SKYJADE.get(), AetherItems.SKYROOT_STICK.get(), this.skyjadeBattleaxe.get());
    }
}
