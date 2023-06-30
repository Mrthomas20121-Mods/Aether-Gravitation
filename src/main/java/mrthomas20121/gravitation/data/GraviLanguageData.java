package mrthomas20121.gravitation.data;

import mrthomas20121.gravitation.block.GraviBlocks;
import mrthomas20121.gravitation.compat.ModCompat;
import mrthomas20121.gravitation.enchanting.GravitationEnchantments;
import mrthomas20121.gravitation.entity.GraviEntityTypes;
import mrthomas20121.gravitation.item.GraviItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.fml.ModList;

public class GraviLanguageData extends LanguageProvider {

    public GraviLanguageData(PackOutput output) {
        super(output, "gravitation", "en_us");
    }

    @Override
    protected void addTranslations() {
        add("gravitation.curio.pendant", "When in Pendant Slot:");
        add("gravitation.curio.bronzite_pendant", "+2 Armor Toughness");
        add("gravitation.curio.neptune_pendant", "Gain water breathing underwater.");
        add("gravitation.curio.ring", "When in Ring Slot:");
        add("gravitation.curio.bronzite_ring", "+2 Armor");
        add("gravitation.curio.neptune_ring", "+1.5 Swim Speed");
        add("itemGroup.gravitation.equipments", "Gravitation Equipments & Utilities");
        add("itemGroup.gravitation.building_blocks", "Gravitation Building Blocks");
        addItem(GraviItems.GREATER_HEALING_STONE, "Greater Healing Stone");
        addItem(GraviItems.POWER_STONE, "Power Stone");
        addItem(GraviItems.DENSE_STONE, "Dense Stone");
        addItem(GraviItems.DIG_STONE, "Dig Stone");
        addItem(GraviItems.RAINBOW_STONE, "Rainbow Stone");
        addItem(GraviItems.NEPTUNE_RING, "Neptune Ring");
        addItem(GraviItems.NEPTUNE_PENDANT, "Neptune Pendant");
        addItem(GraviItems.NEPTUNE_AXE, "Neptune Axe");
        addItem(GraviItems.NEPTUNE_BATTLEAXE, "Neptune Battleaxe");
        addItem(GraviItems.NEPTUNE_CUTLASS, "Neptune Cutlass");
        addItem(GraviItems.NEPTUNE_PICKAXE, "Neptune Pickaxe");
        addItem(GraviItems.NEPTUNE_SHOVEL, "Neptune Shovel");
        addItem(GraviItems.BRONZITE_ROCK, "Bronzite Rock");
        addItem(GraviItems.BRONZITE_INGOT, "Bronzite Ingot");
        addItem(GraviItems.BRONZITE_NUGGET, "Bronzite Nugget");
        addItem(GraviItems.BRONZITE_BATTLEAXE, "Bronzite Battleaxe");
        addItem(GraviItems.BRONZITE_AXE, "Bronzite Axe");
        addItem(GraviItems.BRONZITE_HOE, "Bronzite Hoe");
        addItem(GraviItems.BRONZITE_PICKAXE, "Bronzite Pickaxe");
        addItem(GraviItems.BRONZITE_Shovel, "Bronzite Shovel");
        addItem(GraviItems.BRONZITE_SWORD, "Bronzite Sword");
        addItem(GraviItems.BRONZITE_SHIELD, "Bronzite Shield");
        addItem(GraviItems.BRONZITE_RING, "Bronzite Ring");
        addItem(GraviItems.BRONZITE_PENDANT, "Bronzite Pendant");
        addItem(GraviItems.BRONZITE_HELMET, "Bronzite Helmet");
        addItem(GraviItems.BRONZITE_CHESTPLATE, "Bronzite Chestplate");
        addItem(GraviItems.BRONZITE_LEGGING, "Bronzite Leggings");
        addItem(GraviItems.BRONZITE_BOOTS, "Bronzite Boots");
        addItem(GraviItems.BRONZITE_GLOVES, "Bronzite Gloves");
        addItem(GraviItems.BRONZITE_CAPE, "Bronzite Cape");
        addItem(GraviItems.GRAVITITE_BATTLEAXE, "Gravitite Battleaxe");
        addItem(GraviItems.ZANITE_BATTLEAXE, "Zanite Battleaxe");
        addItem(GraviItems.VALKYRIE_BATTLEAXE, "Valkyrie Battleaxe");
        addItem(GraviItems.NETHERITE_BATTLEAXE, "Netherite Battleaxe");
        addItem(GraviItems.DIAMOND_BATTLEAXE, "Diamond Battleaxe");
        addItem(GraviItems.IRON_BATTLEAXE, "Iron Battleaxe");
        addItem(GraviItems.GOLD_BATTLEAXE, "Gold Battleaxe");
        addItem(GraviItems.FLAMING_CROSSBOW, "Flaming Crossbow");
        addItem(GraviItems.HOLY_CROSSBOW, "Holy Crossbow");
        addItem(GraviItems.LIGHTNING_CROSSBOW, "Lightning Crossbow");
        addItem(GraviItems.VAMPIRE_CROSSBOW, "Vampire Crossbow");
        addItem(GraviItems.ENCHANTED_CHEST_BOAT, "Enchanted Chest Boat");
        addItem(GraviItems.ENCHANTED_BOAT, "Enchanted Boat");
        addBlock(GraviBlocks.BRONZITE_ORE, "Bronzite Ore");
        addBlock(GraviBlocks.BRONZITE_ICESTONE_ORE, "Bronzite Icestone Ore");
        addBlock(GraviBlocks.BRONZITE_BLOCK, "Bronzite Block");
        addBlock(GraviBlocks.ENCHANTED_SIGN, "Enchanted Sign");
        addBlock(GraviBlocks.ENCHANTED_LEAVES, "Enchanted Leaves");
        addBlock(GraviBlocks.ENCHANTED_SAPLING, "Enchanted Sapling");
        addBlock(GraviBlocks.ENCHANTED_PLANKS, "Enchanted Planks");
        addBlock(GraviBlocks.ENCHANTED_STAIRS, "Enchanted Stairs");
        addBlock(GraviBlocks.ENCHANTED_SLAB, "Enchanted Slab");
        addBlock(GraviBlocks.ENCHANTED_BOOKSHELF, "Enchanted Bookshelf");
        addBlock(GraviBlocks.ENCHANTED_LOG, "Enchanted Log");
        addBlock(GraviBlocks.ENCHANTED_WOOD, "Enchanted Wood");
        addBlock(GraviBlocks.STRIPPED_ENCHANTED_LOG, "Stripped Enchanted Log");
        addBlock(GraviBlocks.STRIPPED_ENCHANTED_WOOD, "Stripped Enchanted Wood");
        addBlock(GraviBlocks.ENCHANTED_DOOR, "Enchanted Door");
        addBlock(GraviBlocks.ENCHANTED_TRAPDOOR, "Enchanted Trapdoor");
        addBlock(GraviBlocks.ENCHANTED_BUTTON, "Enchanted Button");
        addBlock(GraviBlocks.ENCHANTED_PREASURE_PLATE, "Enchanted Preasure Plate");
        addBlock(GraviBlocks.ENCHANTED_FENCE, "Enchanted Fence");
        addBlock(GraviBlocks.ENCHANTED_FENCE_GATE, "Enchanted Fence Gate");
        addEntityType(GraviEntityTypes.ENCHANTED_BOAT, "Enchanted Boat");
        addEntityType(GraviEntityTypes.ENCHANTED_CHEST_BOAT, "Enchanted Chest Boat");
        addEnchantment(GravitationEnchantments.NEPTUNE_WRATH, "Neptune's Wrath");
        add("enchantment.gravitation.neptune_wrath.desc", "Deal more damage to water mobs.");
        addEnchantment(GravitationEnchantments.HERCULES_STRENGTH, "Hercules's Strength");
        add("enchantment.gravitation.hercules_strength.desc", "Deal more damage to Aether Bosses(Sun Spirit not included).");
        add("gravitation.tooltip.can_create_enchanting_table", "Right click on a Enchanted Gravitite Block to create an Enchanting Table.");

        // lore
        add("lore.item.gravitation.bronzite_rock", "Rock with durable properties.");
        add("lore.item.gravitation.bronzite_sword", "This Sword was crafted in the fire of the Sun Spirit. It last longer most of the time.");
        add("lore.item.gravitation.bronzite_shovel", "This Shovel was crafted in the fire of the Sun Spirit. It last longer most of the time.");
        add("lore.item.gravitation.bronzite_axe", "This Axe was crafted in the fire of the Sun Spirit. It last longer most of the time.");
        add("lore.item.gravitation.bronzite_battleaxe", "This Battleaxe was crafted in the fire of the Sun Spirit. It last longer most of the time.");
        add("lore.item.gravitation.bronzite_pickaxe", "This Pickaxe was crafted in the fire of the Sun Spirit. It last longer most of the time.");
        add("lore.item.gravitation.bronzite_hoe", "This Hoe was crafted in the fire of the Sun Spirit. It last longer most of the time.");
        add("lore.item.gravitation.bronzite_helmet", "This Helmet was crafted in the fire of the Sun Spirit. It last longer most of the time.");
        add("lore.item.gravitation.bronzite_chestplate", "This Chestplate was crafted in the fire of the Sun Spirit. It last longer most of the time.");
        add("lore.item.gravitation.bronzite_leggings", "Those Leggings were crafted in the fire of the Sun Spirit. It last longer most of the time.");
        add("lore.item.gravitation.bronzite_boots", "Those Boots were crafted in the fire of the Sun Spirit. It last longer most of the time.");
        add("lore.item.gravitation.bronzite_gloves", "Those Gloves were crafted in the fire of the Sun Spirit. It last longer most of the time.");
        add("lore.item.gravitation.bronzite_ring", "This Ring was crafted in the fire of the Sun Spirit. Grant +2 Armor when worn.");
        add("lore.item.gravitation.bronzite_pendent", "This Pendent was crafted in the fire of the Sun Spirit. Grant +2 Armor Toughness when worn.");

        add("lore.item.gravitation.neptune_cutlass", "Found in Silver Dungeon, The Neptune Cutlass is a single target weapon with high attack speed.");
        add("lore.item.gravitation.neptune_axe", "Found in Silver Dungeon.");
        add("lore.item.gravitation.neptune_battleaxe", "Found in Silver Dungeon, The Neptune Battleaxe is a slower axe with sweeping.");
        add("lore.item.gravitation.neptune_pickaxe", "Found in Silver Dungeon.");
        add("lore.item.gravitation.neptune_shovel", "Found in Silver Dungeon.");
        add("lore.item.gravitation.neptune_hoe", "Found in Silver Dungeon.");
        add("lore.item.gravitation.neptune_pendant", "Found in Silver Dungeon, The Neptune Pendant grant the user +1.5 Swim Speed.");
        add("lore.item.gravitation.neptune_ring", "Found in Silver Dungeon, The Neptune Ring grant the user +1.5 Swim Speed.");
        add("lore.item.gravitation.valkyrie_battleaxe", "Found in Silver Dungeon, The Valkyrie Battleaxe is a slower Valkyrie axe with sweeping.");

        add("lore.block.gravitation.enchanted_sapling", "These blue saplings will grow into Enchanted Trees. They can be grown faster with Bone Meal.");
        add("lore.block.gravitation.enchanted_log", "These spawn on Enchanted Tree. They can double dropped with Skyroot Axes. When put in the crafting table they will provide 4 Enchanted Planks");
        add("lore.item.gravitation.phoenix_dart", "These Phoenix Darts are found in Gold Dungeon. Set the target on fire on hit.");
        add("lore.item.gravitation.phoenix_dart_shooter", "The Phoenix Dart Shooter is found in Gold Dungeon. It can shoot Phoenix Darts");

        ModCompat.GetCompatList().stream().filter(compat -> ModList.get().isLoaded(compat.getModID())).forEach(compat -> compat.addLang(this));
    }
}
