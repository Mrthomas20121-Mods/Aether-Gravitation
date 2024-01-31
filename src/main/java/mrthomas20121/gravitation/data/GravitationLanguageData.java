package mrthomas20121.gravitation.data;

import com.aetherteam.aether.data.providers.AetherLanguageProvider;
import mrthomas20121.gravitation.block.GraviBlocks;
import mrthomas20121.gravitation.enchanting.GravitationEnchantments;
import mrthomas20121.gravitation.entity.GraviEntityTypes;
import mrthomas20121.gravitation.item.GravitationItems;
import net.minecraft.data.PackOutput;

public class GravitationLanguageData extends AetherLanguageProvider {

    public GravitationLanguageData(PackOutput output) {
        super(output, "gravitation");
    }

    @Override
    protected void addTranslations() {
        add("gravitation.curio.pendant", "When in Pendant Slot:");
        add("gravitation.curio.bronzite_pendant", "+2 Armor Toughness");
        add("gravitation.curio.neptune_pendant", "Gain water breathing underwater.");
        add("gravitation.curio.ring", "When in Ring Slot:");
        add("gravitation.curio.bronzite_ring", "+2 Armor");
        add("gravitation.curio.neptune_ring", "+1.5 Swim Speed");
        add("itemGroup.gravitation.misc", "Gravitation Misc");
        add("itemGroup.gravitation.equipments", "Gravitation Equipments & Utilities");
        add("itemGroup.gravitation.building_blocks", "Gravitation Building Blocks");

        addAdvancement("bronzite_rock", "Lucky Rock");
        addAdvancementDesc("bronzite_rock", "Obtain a Bronzite Rock.");

        addAdvancement("bronzite_upgrade", "Shiny Upgrade");
        addAdvancementDesc("bronzite_upgrade", "Find a bronzite upgrade in dungeon chests.");

        addAdvancement("bronzite_armor", "Shiny Armor Set");
        addAdvancementDesc("bronzite_armor", "Get a full bronzite armor set.");

        addAdvancement("neptune", "God of the Sea");
        addAdvancementDesc("neptune", "Find a neptune tool/weapon.");

        addAdvancement("neptune_wrath", "Angering the Sea Gods");
        addAdvancementDesc("neptune_wrath", "Enchant a tool with the Neptune Wrath enchantment.");

        addAdvancement("hercules_strength", "The Strength of Hercules");
        addAdvancementDesc("hercules_strength", "Enchant a tool with the Hercules Strength enchantment.");

        add("upgrade.gravitation.bronzite_upgrade", "Bronzite Upgrade");
        add("item.gravitation.smithing_template.bronzite_upgrade.applies_to", "Bronzite Rock");
        add("item.gravitation.smithing_template.bronzite_upgrade.ingredients", "Zanite Gemstone");

        addItem(GravitationItems.GREATER_HEALING_STONE, "Greater Healing Stone");
        addItem(GravitationItems.POWER_STONE, "Power Stone");
        addItem(GravitationItems.DENSE_STONE, "Dense Stone");
        addItem(GravitationItems.DIG_STONE, "Dig Stone");
        addItem(GravitationItems.RAINBOW_STONE, "Rainbow Stone");
        addItem(GravitationItems.AECHOR_STRING, "Aechor String");
        addItem(GravitationItems.NEPTUNE_RING, "Neptune Ring");
        addItem(GravitationItems.NEPTUNE_PENDANT, "Neptune Pendant");
        addItem(GravitationItems.NEPTUNE_AXE, "Neptune Axe");
        addItem(GravitationItems.NEPTUNE_BATTLEAXE, "Neptune Battleaxe");
        addItem(GravitationItems.NEPTUNE_CUTLASS, "Neptune Cutlass");
        addItem(GravitationItems.NEPTUNE_PICKAXE, "Neptune Pickaxe");
        addItem(GravitationItems.NEPTUNE_SHOVEL, "Neptune Shovel");
        addItem(GravitationItems.BRONZITE_ROCK, "Bronzite Rock");
        addItem(GravitationItems.BRONZITE_INGOT, "Bronzite Ingot");
        addItem(GravitationItems.BRONZITE_NUGGET, "Bronzite Nugget");
        addItem(GravitationItems.BRONZITE_BATTLEAXE, "Bronzite Battleaxe");
        addItem(GravitationItems.BRONZITE_AXE, "Bronzite Axe");
        addItem(GravitationItems.BRONZITE_HOE, "Bronzite Hoe");
        addItem(GravitationItems.BRONZITE_PICKAXE, "Bronzite Pickaxe");
        addItem(GravitationItems.BRONZITE_Shovel, "Bronzite Shovel");
        addItem(GravitationItems.BRONZITE_SWORD, "Bronzite Sword");
        addItem(GravitationItems.BRONZITE_SHIELD, "Bronzite Shield");
        addItem(GravitationItems.BRONZITE_RING, "Bronzite Ring");
        addItem(GravitationItems.BRONZITE_PENDANT, "Bronzite Pendant");
        addItem(GravitationItems.BRONZITE_HELMET, "Bronzite Helmet");
        addItem(GravitationItems.BRONZITE_CHESTPLATE, "Bronzite Chestplate");
        addItem(GravitationItems.BRONZITE_LEGGING, "Bronzite Leggings");
        addItem(GravitationItems.BRONZITE_BOOTS, "Bronzite Boots");
        addItem(GravitationItems.BRONZITE_GLOVES, "Bronzite Gloves");
        addItem(GravitationItems.BRONZITE_CAPE, "Bronzite Cape");
        addItem(GravitationItems.GRAVITITE_BATTLEAXE, "Gravitite Battleaxe");
        addItem(GravitationItems.ZANITE_BATTLEAXE, "Zanite Battleaxe");
        addItem(GravitationItems.VALKYRIE_BATTLEAXE, "Valkyrie Battleaxe");
        addItem(GravitationItems.NETHERITE_BATTLEAXE, "Netherite Battleaxe");
        addItem(GravitationItems.DIAMOND_BATTLEAXE, "Diamond Battleaxe");
        addItem(GravitationItems.IRON_BATTLEAXE, "Iron Battleaxe");
        addItem(GravitationItems.GOLD_BATTLEAXE, "Gold Battleaxe");
        addItem(GravitationItems.ENCHANTED_CHEST_BOAT, "Enchanted Chest Boat");
        addItem(GravitationItems.ENCHANTED_BOAT, "Enchanted Boat");

        addBlock(GraviBlocks.AER_GRASS, "Aer Grass");
        addBlock(GraviBlocks.CONGLOMERATE, "Conglomerate");
        addBlock(GraviBlocks.CONGLOMERATE_WALLS, "Conglomerate Wall");
        addBlock(GraviBlocks.CONGLOMERATE_STAIRS, "Conglomerate Stairs");
        addBlock(GraviBlocks.CONGLOMERATE_SLAB, "Conglomerate Slab");

        addBlock(GraviBlocks.CONGLOMERATE_BRICKS, "Conglomerate Bricks");
        addBlock(GraviBlocks.CONGLOMERATE_BRICK_WALLS, "Conglomerate Brick Wall");
        addBlock(GraviBlocks.CONGLOMERATE_BRICK_STAIRS, "Conglomerate Brick Stairs");
        addBlock(GraviBlocks.CONGLOMERATE_BRICK_SLAB, "Conglomerate Brick Slab");

        addBlock(GraviBlocks.POLISHED_CONGLOMERATE, "Polished Conglomerate");
        addBlock(GraviBlocks.POLISHED_CONGLOMERATE_WALLS, "Polished Conglomerate Wall");
        addBlock(GraviBlocks.POLISHED_CONGLOMERATE_STAIRS, "Polished Conglomerate Stairs");
        addBlock(GraviBlocks.POLISHED_CONGLOMERATE_SLAB, "Polished Conglomerate Slab");

        addBlock(GraviBlocks.BRONZITE_ORE, "Bronzite Ore");
        addBlock(GraviBlocks.BRONZITE_ICESTONE_ORE, "Bronzite Icestone Ore");
        addBlock(GraviBlocks.BRONZITE_BLOCK, "Bronzite Block");
        addBlock(GraviBlocks.ENCHANTED_SIGN, "Enchanted Sign");
        addBlock(GraviBlocks.ENCHANTED_HANGING_SIGN, "Enchanted Hanging Sign");
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
        addBlock(GraviBlocks.ENCHANTED_MOSS, "Enchanted Moss");
        addEntityType(GraviEntityTypes.ENCHANTED_BOAT, "Enchanted Boat");
        addEntityType(GraviEntityTypes.ENCHANTED_CHEST_BOAT, "Enchanted Chest Boat");

        // aerfin
        addItem(GravitationItems.AERFIN_CHEST_BOAT, "Aerfin Chest Boat");
        addItem(GravitationItems.AERFIN_BOAT, "Aerfin Boat");
        addBlock(GraviBlocks.AERFIN_SIGN, "Aerfin Sign");
        addBlock(GraviBlocks.AERFIN_HANGING_SIGN, "Aerfin Hanging Sign");
        addBlock(GraviBlocks.AERFIN_LEAVES, "Aerfin Leaves");
        addBlock(GraviBlocks.BLUE_AERFIN_LEAVES, "Blue Aerfin Leaves");
        addBlock(GraviBlocks.GOLDEN_AERFIN_LEAVES, "Golden Aerfin Leaves");
        addBlock(GraviBlocks.AERFIN_SAPLING, "Aerfin Sapling");
        addBlock(GraviBlocks.BLUE_AERFIN_SAPLING, "Blue Aerfin Sapling");
        addBlock(GraviBlocks.GOLDEN_AERFIN_SAPLING, "Golden Aerfin Sapling");
        addBlock(GraviBlocks.AERFIN_PLANKS, "Aerfin Planks");
        addBlock(GraviBlocks.AERFIN_STAIRS, "Aerfin Stairs");
        addBlock(GraviBlocks.AERFIN_SLAB, "Aerfin Slab");
        addBlock(GraviBlocks.AERFIN_BOOKSHELF, "Aerfin Bookshelf");
        addBlock(GraviBlocks.AERFIN_LOG, "Aerfin Log");
        addBlock(GraviBlocks.AERFIN_WOOD, "Aerfin Wood");
        addBlock(GraviBlocks.STRIPPED_AERFIN_LOG, "Stripped Aerfin Log");
        addBlock(GraviBlocks.STRIPPED_AERFIN_WOOD, "Stripped Aerfin Wood");
        addBlock(GraviBlocks.AERFIN_DOOR, "Aerfin Door");
        addBlock(GraviBlocks.AERFIN_TRAPDOOR, "Aerfin Trapdoor");
        addBlock(GraviBlocks.AERFIN_BUTTON, "Aerfin Button");
        addBlock(GraviBlocks.AERFIN_PREASURE_PLATE, "Aerfin Preasure Plate");
        addBlock(GraviBlocks.AERFIN_FENCE, "Aerfin Fence");
        addBlock(GraviBlocks.AERFIN_FENCE_GATE, "Aerfin Fence Gate");
        addEntityType(GraviEntityTypes.AERFIN_BOAT, "Aerfin Boat");
        addEntityType(GraviEntityTypes.AERFIN_CHEST_BOAT, "Aerfin Chest Boat");

        // beladon
        addItem(GravitationItems.BELADON_CHEST_BOAT, "Beladon Chest Boat");
        addItem(GravitationItems.BELADON_BOAT, "Beladon Boat");
        addBlock(GraviBlocks.BELADON_SIGN, "Beladon Sign");
        addBlock(GraviBlocks.BELADON_HANGING_SIGN, "Beladon Hanging Sign");
        addBlock(GraviBlocks.BELADON_LEAVES, "Beladon Leaves");
        addBlock(GraviBlocks.BELADON_SAPLING, "Beladon Sapling");
        addBlock(GraviBlocks.BELADON_PLANKS, "Beladon Planks");
        addBlock(GraviBlocks.BELADON_STAIRS, "Beladon Stairs");
        addBlock(GraviBlocks.BELADON_SLAB, "Beladon Slab");
        addBlock(GraviBlocks.BELADON_BOOKSHELF, "Beladon Bookshelf");
        addBlock(GraviBlocks.BELADON_LOG, "Beladon Log");
        addBlock(GraviBlocks.BELADON_WOOD, "Beladon Wood");
        addBlock(GraviBlocks.STRIPPED_BELADON_LOG, "Stripped Beladon Log");
        addBlock(GraviBlocks.STRIPPED_BELADON_WOOD, "Stripped Beladon Wood");
        addBlock(GraviBlocks.BELADON_DOOR, "Beladon Door");
        addBlock(GraviBlocks.BELADON_TRAPDOOR, "Beladon Trapdoor");
        addBlock(GraviBlocks.BELADON_BUTTON, "Beladon Button");
        addBlock(GraviBlocks.BELADON_PREASURE_PLATE, "Beladon Preasure Plate");
        addBlock(GraviBlocks.BELADON_FENCE, "Beladon Fence");
        addBlock(GraviBlocks.BELADON_FENCE_GATE, "Beladon Fence Gate");
        addEntityType(GraviEntityTypes.BELADON_BOAT, "Beladon Boat");
        addEntityType(GraviEntityTypes.BELADON_CHEST_BOAT, "Beladon Chest Boat");

        addEnchantment(GravitationEnchantments.NEPTUNE_WRATH, "Neptune's Wrath");
        add("enchantment.gravitation.neptune_wrath.desc", "Deal more damage to water mobs.");
        addEnchantment(GravitationEnchantments.HERCULES_STRENGTH, "Hercules's Strength");
        add("enchantment.gravitation.hercules_strength.desc", "Deal more damage to Aether Bosses(Sun Spirit not included).");
        add("gravitation.tooltip.can_create_enchanting_table", "Right click on a Enchanted Gravitite Block to create an Enchanting Table.");

        addLore(GravitationItems.BRONZITE_ROCK, "This rock was created from the fire of the sun spirit.");
        addLore(GravitationItems.BRONZITE_UPGRADE, "A smithing upgrade used by the ancients to turn bronzite into a material.");
        addLore(GravitationItems.BRONZITE_SWORD, "This sword last longer most of the time.");
        addLore(GravitationItems.BRONZITE_AXE, "This axe last longer most of the time.");
        addLore(GravitationItems.BRONZITE_PICKAXE, "This pickaxe last longer most of the time.");
        addLore(GravitationItems.BRONZITE_Shovel, "This shovel last longer most of the time.");
        addLore(GravitationItems.BRONZITE_BATTLEAXE, "This axe has a good swing to it, you should try using it like a sword.");
        addLore(GravitationItems.BRONZITE_PENDANT, "This pendant has defensive properties.");
        addLore(GravitationItems.BRONZITE_RING, "This ring has defensive properties.");

        addLore(GravitationItems.DIAMOND_BATTLEAXE, "This axe has a good swing to it, you should try using it like a sword.");
        addLore(GravitationItems.GOLD_BATTLEAXE, "This axe has a good swing to it, you should try using it like a sword.");
        addLore(GravitationItems.NEPTUNE_BATTLEAXE, "Found in bronze/silver dungeons, This axe has a good swing to it, you should try using it like a sword.");
        addLore(GravitationItems.IRON_BATTLEAXE, "This axe has a good swing to it, you should try using it like a sword.");
        addLore(GravitationItems.NETHERITE_BATTLEAXE, "This axe has a good swing to it, you should try using it like a sword.");
        addLore(GravitationItems.VALKYRIE_BATTLEAXE, "This axe has a good swing to it, you should try using it like a sword.");

        addLoreUnique("gravitation.lore.neptune_wrath", "Neptune's Wrath deal more damage to Water Mobs.");
        addLoreUnique("gravitation.lore.hercules_strength", "Hercules's Strength deal more damage to Aether Bosses(Sun Spirit Excluded).");
//        ModCompat.getCompatList().stream().filter(compat -> ModList.get().isLoaded(compat.getModID())).forEach(compat -> compat.addLang(this));
    }

    public void advancement(String advName, String name, String desc) {
        this.add("advancement.gravitation.%s".formatted(advName), name);
        this.add("advancement.gravitation.%s.desc".formatted(advName), desc);
    }
}
