package mrthomas20121.gravitation.item;

import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.item.stone.*;
import mrthomas20121.gravitation.item.tools.*;
import mrthomas20121.gravitation.item.tools.bronzite.*;
import mrthomas20121.gravitation.item.tools.neptune.*;
import mrthomas20121.gravitation.item.wood.AerfinBoatItem;
import mrthomas20121.gravitation.item.wood.BeladonBoatItem;
import mrthomas20121.gravitation.item.wood.EnchantedBoatItem;
import mrthomas20121.gravitation.util.GravitationArmorMaterials;
import net.minecraft.ChatFormatting;
import net.minecraft.Util;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SmithingTemplateItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class GravitationItems {

    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Gravitation.MOD_ID);

    public static Rarity SALMON_ROSE = Rarity.create("salmon_rose", style -> style.withColor(0xff9fb2));

    public static RegistryObject<Item> AECHOR_STRING = ITEMS.register("aechor_string", () -> new Item(new Item.Properties()));

    public static RegistryObject<Item> GREATER_HEALING_STONE = ITEMS.register("greater_healing_stone", GreaterHealingStoneItem::new);
    public static RegistryObject<Item> POWER_STONE = ITEMS.register("power_stone", PowerStoneItem::new);
    public static RegistryObject<Item> DENSE_STONE = ITEMS.register("dense_stone", DenseStoneItem::new);
    public static RegistryObject<Item> DIG_STONE = ITEMS.register("dig_stone", DigStoneItem::new);
    public static RegistryObject<Item> RAINBOW_STONE = ITEMS.register("rainbow_stone", RainbowStoneItem::new);

    public static RegistryObject<Item> BRONZITE_UPGRADE = ITEMS.register("bronzite_upgrade_smithing_template", GravitationItems::createBronziteUpgradeTemplate);
    public static RegistryObject<Item> BRONZITE_INGOT = ITEMS.register("bronzite_ingot", () -> new Item(new Item.Properties().rarity(SALMON_ROSE)));
    public static RegistryObject<Item> BRONZITE_NUGGET = ITEMS.register("bronzite_nugget", () -> new Item(new Item.Properties().rarity(SALMON_ROSE)));
    public static RegistryObject<Item> BRONZITE_ROCK = ITEMS.register("bronzite_rock", () -> new Item(new Item.Properties().rarity(SALMON_ROSE)));
    public static RegistryObject<Item> BRONZITE_AXE = ITEMS.register("bronzite_axe", BronziteAxeItem::new);
    public static RegistryObject<Item> BRONZITE_BATTLEAXE = ITEMS.register("bronzite_battleaxe", BronziteBattleAxeItem::new);
    public static RegistryObject<Item> BRONZITE_PICKAXE = ITEMS.register("bronzite_pickaxe", BronzitePickaxeItem::new);
    public static RegistryObject<Item> BRONZITE_HOE = ITEMS.register("bronzite_hoe", BronziteHoeItem::new);
    public static RegistryObject<Item> BRONZITE_Shovel = ITEMS.register("bronzite_shovel", BronziteShovelItem::new);
    public static RegistryObject<Item> BRONZITE_SWORD = ITEMS.register("bronzite_sword", BronziteSwordItem::new);

    public static RegistryObject<Item> BRONZITE_SHIELD = ITEMS.register("bronzite_shield", BronziteShieldItem::new);
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

    public static final RegistryObject<Item> AERFIN_BOAT = ITEMS.register("aerfin_boat", () -> new AerfinBoatItem(false, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> AERFIN_CHEST_BOAT = ITEMS.register("aerfin_chest_boat", () -> new AerfinBoatItem(true, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> BELADON_BOAT = ITEMS.register("beladon_boat", () -> new BeladonBoatItem(false, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BELADON_CHEST_BOAT = ITEMS.register("beladon_chest_boat", () -> new BeladonBoatItem(true, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> ENCHANTED_BOAT = ITEMS.register("enchanted_boat", () -> new EnchantedBoatItem(false, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ENCHANTED_CHEST_BOAT = ITEMS.register("enchanted_chest_boat", () -> new EnchantedBoatItem(true, new Item.Properties().stacksTo(1)));

    private static final Component BRONZITE_UPGRADE_TEXT = Component.translatable(Util.makeDescriptionId("upgrade", new ResourceLocation("gravitation:bronzite_upgrade"))).withStyle(ChatFormatting.BLUE);
    private static final Component BRONZITE_UPGRADE_APPLIES_TO = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation("gravitation:smithing_template.bronzite_upgrade.applies_to"))).withStyle(ChatFormatting.BLUE);
    private static final Component BRONZITE_UPGRADE_INGREDIENTS = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation("gravitation:smithing_template.bronzite_upgrade.ingredients"))).withStyle(ChatFormatting.BLUE);
    private static final Component BRONZITE_UPGRADE_BASE_SLOT_DESCRIPTION = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation("gravitation:smithing_template.bronzite_upgrade.base_slot_description")));
    private static final Component BRONZITE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation("gravitation:smithing_template.bronzite_upgrade.additions_slot_description")));

    private static final ResourceLocation EMPTY_SLOT_HELMET = new ResourceLocation("item/empty_armor_slot_helmet");
    private static final ResourceLocation EMPTY_SLOT_CHESTPLATE = new ResourceLocation("item/empty_armor_slot_chestplate");
    private static final ResourceLocation EMPTY_SLOT_LEGGINGS = new ResourceLocation("item/empty_armor_slot_leggings");
    private static final ResourceLocation EMPTY_SLOT_BOOTS = new ResourceLocation("item/empty_armor_slot_boots");
    private static final ResourceLocation EMPTY_SLOT_HOE = new ResourceLocation("item/empty_slot_hoe");
    private static final ResourceLocation EMPTY_SLOT_AXE = new ResourceLocation("item/empty_slot_axe");
    private static final ResourceLocation EMPTY_SLOT_SWORD = new ResourceLocation("item/empty_slot_sword");
    private static final ResourceLocation EMPTY_SLOT_SHOVEL = new ResourceLocation("item/empty_slot_shovel");
    private static final ResourceLocation EMPTY_SLOT_PICKAXE = new ResourceLocation("item/empty_slot_pickaxe");
    private static final ResourceLocation EMPTY_SLOT_INGOT = new ResourceLocation("item/empty_slot_ingot");

    private static List<ResourceLocation> createNetheriteUpgradeIconList() {
        return List.of(EMPTY_SLOT_HELMET, EMPTY_SLOT_SWORD, EMPTY_SLOT_CHESTPLATE, EMPTY_SLOT_PICKAXE, EMPTY_SLOT_LEGGINGS, EMPTY_SLOT_AXE, EMPTY_SLOT_BOOTS, EMPTY_SLOT_HOE, EMPTY_SLOT_SHOVEL);
    }

    private static List<ResourceLocation> createNetheriteUpgradeMaterialList() {
        return List.of(EMPTY_SLOT_INGOT);
    }

    public static SmithingTemplateItem createBronziteUpgradeTemplate() {
        return new SmithingTemplateItem(BRONZITE_UPGRADE_APPLIES_TO, BRONZITE_UPGRADE_INGREDIENTS, BRONZITE_UPGRADE_TEXT, BRONZITE_UPGRADE_BASE_SLOT_DESCRIPTION, BRONZITE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION, createNetheriteUpgradeIconList(), createNetheriteUpgradeMaterialList());
    }
}
