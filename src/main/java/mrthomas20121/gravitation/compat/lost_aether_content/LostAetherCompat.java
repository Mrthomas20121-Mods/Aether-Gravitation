package mrthomas20121.gravitation.compat.lost_aether_content;

import mrthomas20121.gravitation.compat.IModCompat;
import mrthomas20121.gravitation.data.GraviBlockstateData;
import mrthomas20121.gravitation.data.GraviItemData;
import mrthomas20121.gravitation.data.GraviLanguageData;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.registries.RegistryObject;

public class LostAetherCompat extends IModCompat {

    private final RegistryObject<Item> phoenixBattleAxe;

    public LostAetherCompat() {
        super("lost_aether_content");
        phoenixBattleAxe = this.ITEMS.register("phoenix_battleaxe", PhoenixBattleaxeItem::new);
    }

    @Override
    public void addLang(GraviLanguageData data) {
        data.addItem(this.phoenixBattleAxe, "Phoenix Battleaxe");
    }

    @Override
    public void addBlockModels(GraviBlockstateData data) {
        super.addBlockModels(data);
    }

    @Override
    public void addItemModels(GraviItemData data) {
        data.handheldItem(this.phoenixBattleAxe.get(), "");
        super.addItemModels(data);
    }

    @Override
    public void addToCreativeTab(CreativeModeTab.Output output) {
        output.accept(this.phoenixBattleAxe.get());
    }
}
