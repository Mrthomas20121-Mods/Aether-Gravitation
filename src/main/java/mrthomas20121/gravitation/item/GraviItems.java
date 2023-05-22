package mrthomas20121.gravitation.item;

import com.aetherteam.aether.item.AetherItems;
import com.aetherteam.aether.item.combat.DartItem;
import com.aetherteam.aether.item.combat.DartShooterItem;
import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.entity.GraviEntityTypes;
import mrthomas20121.gravitation.item.tools.*;
import mrthomas20121.gravitation.util.GravitationArmorMaterials;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class GraviItems {

    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Gravitation.MOD_ID);

    public static Rarity SALMON_ROSE = Rarity.create("salmon_rose", style -> style.withColor(0xff9fb2));

    public static RegistryObject<Item> BRONZITE_INGOT = ITEMS.register("bronzite_ingot", () -> new Item(new Item.Properties().rarity(SALMON_ROSE)));
    public static RegistryObject<Item> BRONZITE_NUGGET = ITEMS.register("bronzite_nugget", () -> new Item(new Item.Properties().rarity(SALMON_ROSE)));
    public static RegistryObject<Item> BRONZITE_ROCK = ITEMS.register("bronzite_rock", () -> new Item(new Item.Properties().rarity(SALMON_ROSE)));
    public static RegistryObject<Item> BRONZITE_AXE = ITEMS.register("bronzite_axe", BronziteAxeItem::new);
    public static RegistryObject<Item> BRONZITE_BATTLEAXE = ITEMS.register("bronzite_battleaxe", BronziteBattleAxeItem::new);
    public static RegistryObject<Item> BRONZITE_PICKAXE = ITEMS.register("bronzite_pickaxe", BronzitePickaxeItem::new);
    public static RegistryObject<Item> BRONZITE_HOE = ITEMS.register("bronzite_hoe", BronziteHoeItem::new);
    public static RegistryObject<Item> BRONZITE_Shovel = ITEMS.register("bronzite_shovel", BronziteShovelItem::new);
    public static RegistryObject<Item> BRONZITE_SWORD = ITEMS.register("bronzite_sword", BronziteSwordItem::new);
    public static RegistryObject<Item> BRONZITE_HELMET = ITEMS.register("bronzite_helmet", () -> new BronziteArmorItem(GravitationArmorMaterials.BRONZITE, ArmorItem.Type.HELMET, new Item.Properties().rarity(SALMON_ROSE)));
    public static RegistryObject<Item> BRONZITE_CHESTPLATE = ITEMS.register("bronzite_chestplate", () -> new BronziteArmorItem(GravitationArmorMaterials.BRONZITE, ArmorItem.Type.CHESTPLATE, new Item.Properties().rarity(SALMON_ROSE)));
    public static RegistryObject<Item> BRONZITE_LEGGING = ITEMS.register("bronzite_leggings", () -> new BronziteArmorItem(GravitationArmorMaterials.BRONZITE, ArmorItem.Type.LEGGINGS, new Item.Properties().rarity(SALMON_ROSE)));
    public static RegistryObject<Item> BRONZITE_BOOTS = ITEMS.register("bronzite_boots", () -> new BronziteArmorItem(GravitationArmorMaterials.BRONZITE, ArmorItem.Type.BOOTS, new Item.Properties().rarity(SALMON_ROSE)));
    public static RegistryObject<Item> BRONZITE_GLOVES = ITEMS.register("bronzite_gloves", () -> new BronziteGlovesItem(0.80d, "bronzite_gloves", () -> SoundEvents.ARMOR_EQUIP_CHAIN, new Item.Properties().rarity(SALMON_ROSE)));
    public static RegistryObject<Item> BRONZITE_RING = ITEMS.register("bronzite_ring", BronziteRingItem::new);
    public static RegistryObject<Item> BRONZITE_PENDANT = ITEMS.register("bronzite_pendant", BronzitePendantItem::new);
    public static RegistryObject<Item> BRONZITE_CAPE = ITEMS.register("bronzite_cape", () -> new GravitationCapeItem("bronzite_cape", new Item.Properties().rarity(SALMON_ROSE)));

    public static RegistryObject<Item> NEPTUNE_AXE = ITEMS.register("neptune_axe", NeptuneAxeItem::new);
    public static RegistryObject<Item> NEPTUNE_BATTLEAXE = ITEMS.register("neptune_battleaxe", NeptuneBattleAxeItem::new);
    public static RegistryObject<Item> NEPTUNE_CUTLASS = ITEMS.register("neptune_cutlass", NeptuneCutlassItem::new);
    public static RegistryObject<Item> NEPTUNE_PICKAXE = ITEMS.register("neptune_pickaxe", NeptunePickaxeItem::new);
    public static RegistryObject<Item> NEPTUNE_SHOVEL = ITEMS.register("neptune_shovel", NeptuneShovelItem::new);
    public static RegistryObject<Item> NEPTUNE_RING = ITEMS.register("neptune_ring", NeptuneRingItem::new);
    public static RegistryObject<Item> NEPTUNE_PENDANT = ITEMS.register("neptune_pendant", NeptunePendantItem::new);

    public static RegistryObject<Item> ZANITE_BATTLEAXE = ITEMS.register("zanite_battleaxe", ZaniteBattleAxeItem::new);
    public static RegistryObject<Item> GRAVITITE_BATTLEAXE = ITEMS.register("gravitite_battleaxe", GravititeBattleAxeItem::new);
    public static RegistryObject<Item> VALKYRIE_BATTLEAXE = ITEMS.register("valkyrie_battleaxe", ValkyrieBattleAxeItem::new);
    public static RegistryObject<Item> NETHERITE_BATTLEAXE = ITEMS.register("netherite_battleaxe", NetheriteBattleAxeItem::new);
    public static RegistryObject<Item> DIAMOND_BATTLEAXE = ITEMS.register("diamond_battleaxe", DiamondBattleAxeItem::new);
    public static RegistryObject<Item> IRON_BATTLEAXE = ITEMS.register("iron_battleaxe", IronBattleAxeItem::new);
    public static RegistryObject<Item> GOLD_BATTLEAXE = ITEMS.register("gold_battleaxe", GoldBattleAxeItem::new);

    public static RegistryObject<Item> PHOENIX_DART = ITEMS.register("phoenix_dart", () -> new DartItem(GraviEntityTypes.PHOENIX_DART, new Item.Properties().rarity(AetherItems.AETHER_LOOT)));

    public static final RegistryObject<Item> PHOENIX_DART_SHOOTER = ITEMS.register("phoenix_dart_shooter", () -> new DartShooterItem(PHOENIX_DART, new Item.Properties().rarity(AetherItems.AETHER_LOOT).stacksTo(1)));

    public static final RegistryObject<Item> ENCHANTED_BOAT = ITEMS.register("enchanted_boat", () -> new EnchantedBoatItem(false, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ENCHANTED_CHEST_BOAT = ITEMS.register("enchanted_chest_boat", () -> new EnchantedBoatItem(true, new Item.Properties().stacksTo(1)));
}
