package mrthomas20121.gravitation.data;

import com.aetherteam.aether.data.providers.AetherLanguageProvider;
import mrthomas20121.gravitation.block.GravitationBlocks;
import mrthomas20121.gravitation.data.advancement.AdvancementRL;
import mrthomas20121.gravitation.data.advancement.GravitationAdvancements;
import mrthomas20121.gravitation.enchanting.GravitationEnchantments;
import mrthomas20121.gravitation.entity.GraviEntityTypes;
import mrthomas20121.gravitation.item.GravitationItems;
import mrthomas20121.gravitation.world.biome.GravitationBiomes;
import net.minecraft.data.PackOutput;

public class GravitationLanguageData extends AetherLanguageProvider {

    public GravitationLanguageData(PackOutput output) {
        super(output, "gravitation");
    }

    @Override
    protected void addTranslations() {
        add("gravitation.curio.pendant", "When in Pendant Slot:");
        add("gravitation.curio.bronzite_pendant", "+2 Armor Toughness");
        add("gravitation.curio.neptune_pendant", "Wearer has conduit power underwater");
        add("itemGroup.gravitation.misc", "Gravitation Misc");
        add("itemGroup.gravitation.equipments", "Gravitation Equipments & Utilities");
        add("itemGroup.gravitation.building_blocks", "Gravitation Building Blocks");

        addAdvancement(GravitationAdvancements.bronzite_ingot, "Enter the bronze age", "Get a Bronzite ingot");
        addAdvancement(GravitationAdvancements.bronzite_full_set, "Full Bronze Upgrade", "Get a fullset of Bronzite armor");
        addAdvancement(GravitationAdvancements.adamantite_gem, "Stronger Gemstone", "Get an Adamantite gem");
        addAdvancement(GravitationAdvancements.adamantite_full_set, "Adamant Armor Upgrade", "Get a fullset of Adamantite armor");
        addAdvancement(GravitationAdvancements.icy_aercloud, "Cold as Ice", "Step on an Icy Aercloud");
        addAdvancement(GravitationAdvancements.neptune_tools, "Pirate of the Sea", "Find a neptune tool in a treasure chest.");
        addAdvancement(GravitationAdvancements.stamina_of_mars, "Blessing Of Mars", "Find a boots with the stamina of mars enchantment");
        addAdvancement(GravitationAdvancements.sun_spirit_blessing, "Blessed By The Sun Spirit", "Find an armor with the sun spirit blessing enchantment");

        add("upgrade.gravitation.bronzite_upgrade", "Bronzite Upgrade");
        add("item.gravitation.smithing_template.bronzite_upgrade.applies_to", "Bronzite Rock");
        add("item.gravitation.smithing_template.bronzite_upgrade.ingredients", "Zanite Gemstone");

        addBiome(GravitationBiomes.FROSTED_FOREST, "Frosted Forest");
        addBiome(GravitationBiomes.UNDERGROWTH, "Undergrowth");

        addItem(GravitationItems.BLACK_BERRY, "Black Berry");
        addItem(GravitationItems.ICED_BLACK_BERRY, "Iced Black Berry");

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
        addItem(GravitationItems.BRONZITE_SHOVEL, "Bronzite Shovel");
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

        addItem(GravitationItems.ADAMANTITE_GEM, "Adamantite");
        addItem(GravitationItems.ADAMANTITE_BATTLEAXE, "Adamantite Battleaxe");
        addItem(GravitationItems.ADAMANTITE_AXE, "Adamantite Axe");
        addItem(GravitationItems.ADAMANTITE_HOE, "Adamantite Hoe");
        addItem(GravitationItems.ADAMANTITE_PICKAXE, "Adamantite Pickaxe");
        addItem(GravitationItems.ADAMANTITE_SHOVEL, "Adamantite Shovel");
        addItem(GravitationItems.ADAMANTITE_SWORD, "Adamantite Sword");
        addItem(GravitationItems.ADAMANTITE_HELMET, "Adamantite Helmet");
        addItem(GravitationItems.ADAMANTITE_CHESTPLATE, "Adamantite Chestplate");
        addItem(GravitationItems.ADAMANTITE_LEGGING, "Adamantite Leggings");
        addItem(GravitationItems.ADAMANTITE_BOOTS, "Adamantite Boots");
        addItem(GravitationItems.ADAMANTITE_GLOVES, "Adamantite Gloves");
        addItem(GravitationItems.ADAMANTITE_CAPE, "Adamantite Cape");
        addItem(GravitationItems.ADAMANTITE_RING, "Adamantite Ring");
        addItem(GravitationItems.ADAMANTITE_PENDANT, "Adamantite Pendant");

        addItem(GravitationItems.GRAVITITE_BATTLEAXE, "Gravitite Battleaxe");
        addItem(GravitationItems.ZANITE_BATTLEAXE, "Zanite Battleaxe");
        addItem(GravitationItems.VALKYRIE_BATTLEAXE, "Valkyrie Battleaxe");
        addItem(GravitationItems.NETHERITE_BATTLEAXE, "Netherite Battleaxe");
        addItem(GravitationItems.DIAMOND_BATTLEAXE, "Diamond Battleaxe");
        addItem(GravitationItems.IRON_BATTLEAXE, "Iron Battleaxe");
        addItem(GravitationItems.GOLD_BATTLEAXE, "Gold Battleaxe");
        addItem(GravitationItems.ENCHANTED_CHEST_BOAT, "Enchanted Chest Boat");
        addItem(GravitationItems.ENCHANTED_BOAT, "Enchanted Boat");

        addBlock(GravitationBlocks.FROZEN_AETHER_GRASS_BLOCK, "Frozen Aether Grass Block");
        addBlock(GravitationBlocks.ICY_AERCLOUD, "Icy Aercloud");
        addBlock(GravitationBlocks.CONGLOMERATE, "Conglomerate");
        addBlock(GravitationBlocks.CONGLOMERATE_WALLS, "Conglomerate Wall");
        addBlock(GravitationBlocks.CONGLOMERATE_STAIRS, "Conglomerate Stairs");
        addBlock(GravitationBlocks.CONGLOMERATE_SLAB, "Conglomerate Slab");

        addBlock(GravitationBlocks.CONGLOMERATE_BRICKS, "Conglomerate Bricks");
        addBlock(GravitationBlocks.CONGLOMERATE_BRICK_WALLS, "Conglomerate Brick Wall");
        addBlock(GravitationBlocks.CONGLOMERATE_BRICK_STAIRS, "Conglomerate Brick Stairs");
        addBlock(GravitationBlocks.CONGLOMERATE_BRICK_SLAB, "Conglomerate Brick Slab");

        addBlock(GravitationBlocks.POLISHED_CONGLOMERATE, "Polished Conglomerate");
        addBlock(GravitationBlocks.POLISHED_CONGLOMERATE_WALLS, "Polished Conglomerate Wall");
        addBlock(GravitationBlocks.POLISHED_CONGLOMERATE_STAIRS, "Polished Conglomerate Stairs");
        addBlock(GravitationBlocks.POLISHED_CONGLOMERATE_SLAB, "Polished Conglomerate Slab");

        addBlock(GravitationBlocks.CHISELED_CONGLOMERATE, "Chiseled Conglomerate");
        addBlock(GravitationBlocks.CHISELED_CONGLOMERATE_WALLS, "Chiseled Conglomerate Wall");
        addBlock(GravitationBlocks.CHISELED_CONGLOMERATE_STAIRS, "Chiseled Conglomerate Stairs");
        addBlock(GravitationBlocks.CHISELED_CONGLOMERATE_SLAB, "Chiseled Conglomerate Slab");

        this.addBlock(GravitationBlocks.BLACK_BERRY_BUSH_STEM, "Black Bush Stem");
        this.addBlock(GravitationBlocks.BLACK_BERRY_BUSH, "Black Berry Bush");

        addBlock(GravitationBlocks.BRONZITE_ORE, "Bronzite Ore");
        addBlock(GravitationBlocks.BRONZITE_BLOCK, "Bronzite Block");
        addBlock(GravitationBlocks.ENCHANTED_SIGN, "Enchanted Sign");
        addBlock(GravitationBlocks.ENCHANTED_HANGING_SIGN, "Enchanted Hanging Sign");
        addBlock(GravitationBlocks.ENCHANTED_LEAVES, "Enchanted Leaves");
        addBlock(GravitationBlocks.ENCHANTED_SAPLING, "Enchanted Sapling");
        addBlock(GravitationBlocks.ENCHANTED_PLANKS, "Enchanted Planks");
        addBlock(GravitationBlocks.ENCHANTED_STAIRS, "Enchanted Stairs");
        addBlock(GravitationBlocks.ENCHANTED_SLAB, "Enchanted Slab");
        addBlock(GravitationBlocks.ENCHANTED_BOOKSHELF, "Enchanted Bookshelf");
        addBlock(GravitationBlocks.ENCHANTED_LOG, "Enchanted Log");
        addBlock(GravitationBlocks.ENCHANTED_WOOD, "Enchanted Wood");
        addBlock(GravitationBlocks.STRIPPED_ENCHANTED_LOG, "Stripped Enchanted Log");
        addBlock(GravitationBlocks.STRIPPED_ENCHANTED_WOOD, "Stripped Enchanted Wood");
        addBlock(GravitationBlocks.ENCHANTED_DOOR, "Enchanted Door");
        addBlock(GravitationBlocks.ENCHANTED_TRAPDOOR, "Enchanted Trapdoor");
        addBlock(GravitationBlocks.ENCHANTED_BUTTON, "Enchanted Button");
        addBlock(GravitationBlocks.ENCHANTED_PREASURE_PLATE, "Enchanted Preasure Plate");
        addBlock(GravitationBlocks.ENCHANTED_FENCE, "Enchanted Fence");
        addBlock(GravitationBlocks.ENCHANTED_FENCE_GATE, "Enchanted Fence Gate");
        addEntityType(GraviEntityTypes.ENCHANTED_BOAT, "Enchanted Boat");
        addEntityType(GraviEntityTypes.ENCHANTED_CHEST_BOAT, "Enchanted Chest with Boat");

        // aerfin
        addItem(GravitationItems.AERFIN_CHEST_BOAT, "Aerfin Chest with Boat");
        addItem(GravitationItems.AERFIN_BOAT, "Aerfin Boat");
        addBlock(GravitationBlocks.AERFIN_SIGN, "Aerfin Sign");
        addBlock(GravitationBlocks.AERFIN_HANGING_SIGN, "Aerfin Hanging Sign");
        addBlock(GravitationBlocks.AERFIN_LEAVES, "Aerfin Leaves");
        addBlock(GravitationBlocks.ORANGE_AERFIN_LEAVES, "Orange Aerfin Leaves");
        addBlock(GravitationBlocks.AERFIN_SAPLING, "Aerfin Sapling");
        addBlock(GravitationBlocks.ORANGE_AERFIN_SAPLING, "Orange Aerfin Sapling");
        addBlock(GravitationBlocks.AERFIN_PLANKS, "Aerfin Planks");
        addBlock(GravitationBlocks.AERFIN_STAIRS, "Aerfin Stairs");
        addBlock(GravitationBlocks.AERFIN_SLAB, "Aerfin Slab");
        addBlock(GravitationBlocks.AERFIN_BOOKSHELF, "Aerfin Bookshelf");
        addBlock(GravitationBlocks.AERFIN_LOG, "Aerfin Log");
        addBlock(GravitationBlocks.AERFIN_WOOD, "Aerfin Wood");
        addBlock(GravitationBlocks.STRIPPED_AERFIN_LOG, "Stripped Aerfin Log");
        addBlock(GravitationBlocks.STRIPPED_AERFIN_WOOD, "Stripped Aerfin Wood");
        addBlock(GravitationBlocks.AERFIN_DOOR, "Aerfin Door");
        addBlock(GravitationBlocks.AERFIN_TRAPDOOR, "Aerfin Trapdoor");
        addBlock(GravitationBlocks.AERFIN_BUTTON, "Aerfin Button");
        addBlock(GravitationBlocks.AERFIN_PREASURE_PLATE, "Aerfin Preasure Plate");
        addBlock(GravitationBlocks.AERFIN_FENCE, "Aerfin Fence");
        addBlock(GravitationBlocks.AERFIN_FENCE_GATE, "Aerfin Fence Gate");
        addEntityType(GraviEntityTypes.AERFIN_BOAT, "Aerfin Boat");
        addEntityType(GraviEntityTypes.AERFIN_CHEST_BOAT, "Aerfin Chest with Boat");

        // beladon
        addItem(GravitationItems.BELADON_CHEST_BOAT, "Beladon Chest with Boat");
        addItem(GravitationItems.BELADON_BOAT, "Beladon Boat");
        addBlock(GravitationBlocks.BELADON_SIGN, "Beladon Sign");
        addBlock(GravitationBlocks.BELADON_HANGING_SIGN, "Beladon Hanging Sign");
        addBlock(GravitationBlocks.BELADON_LEAVES, "Beladon Leaves");
        addBlock(GravitationBlocks.BELADON_SAPLING, "Beladon Sapling");
        addBlock(GravitationBlocks.BELADON_PLANKS, "Beladon Planks");
        addBlock(GravitationBlocks.BELADON_STAIRS, "Beladon Stairs");
        addBlock(GravitationBlocks.BELADON_SLAB, "Beladon Slab");
        addBlock(GravitationBlocks.BELADON_BOOKSHELF, "Beladon Bookshelf");
        addBlock(GravitationBlocks.BELADON_LOG, "Beladon Log");
        addBlock(GravitationBlocks.BELADON_WOOD, "Beladon Wood");
        addBlock(GravitationBlocks.STRIPPED_BELADON_LOG, "Stripped Beladon Log");
        addBlock(GravitationBlocks.STRIPPED_BELADON_WOOD, "Stripped Beladon Wood");
        addBlock(GravitationBlocks.BELADON_DOOR, "Beladon Door");
        addBlock(GravitationBlocks.BELADON_TRAPDOOR, "Beladon Trapdoor");
        addBlock(GravitationBlocks.BELADON_BUTTON, "Beladon Button");
        addBlock(GravitationBlocks.BELADON_PREASURE_PLATE, "Beladon Preasure Plate");
        addBlock(GravitationBlocks.BELADON_FENCE, "Beladon Fence");
        addBlock(GravitationBlocks.BELADON_FENCE_GATE, "Beladon Fence Gate");
        addEntityType(GraviEntityTypes.BELADON_BOAT, "Beladon Boat");
        addEntityType(GraviEntityTypes.BELADON_CHEST_BOAT, "Beladon Chest with Boat");

        addEnchantment(GravitationEnchantments.STAMINA_OF_MARS, "Stamina of Mars");
        add("enchantment.gravitation.stamina_of_mars.desc", "Increases your movement speed.");
        addEnchantment(GravitationEnchantments.SUN_SPIRIT_BLESSING, "Sun Spirit's Blessing");
        add("enchantment.gravitation.sun_spirit_blessing.desc", "Increases your max health.");

        addLore(GravitationItems.ADAMANTITE_GEM, "This gem is harder than diamond.");
        addLore(GravitationItems.ADAMANTITE_HELMET, "Part of the Adamantite armor set, equivalent in protection to netherite.");
        addLore(GravitationItems.ADAMANTITE_CHESTPLATE, "Part of the Adamantite armor set, equivalent in protection to netherite.");
        addLore(GravitationItems.ADAMANTITE_LEGGING, "Part of the Adamantite armor set, equivalent in protection to netherite.");
        addLore(GravitationItems.ADAMANTITE_BOOTS, "Part of the Adamantite armor set, equivalent in protection to netherite.");
        addLore(GravitationItems.ADAMANTITE_PENDANT, "A pendant that give you Fortune 5. It doesn't last for long, so use it wisely!");
        addLore(GravitationItems.ADAMANTITE_RING, "A ring that give you Looting 5. It doesn't last for long, so use it wisely!");
        addLore(GravitationItems.ADAMANTITE_SWORD, "Part of the Adamantite tool tier, It mines what diamond can, except It apply armor reduction to the target.");
        addLore(GravitationItems.ADAMANTITE_PICKAXE, "Part of the Adamantite tool tier, It mines what diamond can, except It apply armor reduction to the target.");
        addLore(GravitationItems.ADAMANTITE_SHOVEL, "Part of the Adamantite tool tier, It mines what diamond can, except It apply armor reduction to the target.");
        addLore(GravitationItems.ADAMANTITE_HOE, "Part of the Adamantite tool tier, It mines what diamond can, except It apply armor reduction to the target.");
        addLore(GravitationItems.ADAMANTITE_AXE, "Part of the Adamantite tool tier, It mines what diamond can, except It apply armor reduction to the target.");
        addLore(GravitationItems.ADAMANTITE_BATTLEAXE, "Part of the Adamantite tool tier, It mines what diamond can, except It apply armor reduction to the target.");

        addLore(GravitationItems.BRONZITE_ROCK, "This rock was formed by tectonic activity.");
        addLore(GravitationItems.BRONZITE_UPGRADE, "A smithing upgrade used to turn bronzite rock into bronzite ingot.");
        addLore(GravitationItems.BRONZITE_HELMET, "Part of the Bronzite armor set, equivalent in protection to netherite");
        addLore(GravitationItems.BRONZITE_CHESTPLATE, "Part of the Bronzite armor set, slightly better than iron in protection");
        addLore(GravitationItems.BRONZITE_LEGGING, "Part of the Bronzite armor set, slightly better than iron in protection");
        addLore(GravitationItems.BRONZITE_BOOTS, "Part of the Bronzite armor set, slightly better than iron in protection");

        addLore(GravitationItems.BRONZITE_SWORD, "Part of the Bronzite tool tier. Last longer most of the time.");
        addLore(GravitationItems.BRONZITE_AXE, "Part of the Bronzite tool tier. Last longer most of the time.");
        addLore(GravitationItems.BRONZITE_PICKAXE, "Part of the Bronzite tool tier. Last longer most of the time.");
        addLore(GravitationItems.BRONZITE_SHOVEL, "Part of the Bronzite tool tier. Last longer most of the time.");
        addLore(GravitationItems.BRONZITE_BATTLEAXE, "Part of the Bronzite tool tier. Last longer most of the time.");
        addLore(GravitationItems.BRONZITE_PENDANT, "A pendant that give you extra Armor Toughness. It doesn't last for long, so use it wisely!");
        addLore(GravitationItems.BRONZITE_RING, "A ring that give you extra Armor. It doesn't last for long, so use it wisely!");

        addLore(GravitationItems.DIAMOND_BATTLEAXE, "This axe has a good swing to it, you should try using it like a sword.");
        addLore(GravitationItems.GOLD_BATTLEAXE, "This axe has a good swing to it, you should try using it like a sword.");
        addLore(GravitationItems.NEPTUNE_BATTLEAXE, "Found in bronze/silver dungeons, This axe has a good swing to it, you should try using it like a sword.");
        addLore(GravitationItems.IRON_BATTLEAXE, "This axe has a good swing to it, you should try using it like a sword.");
        addLore(GravitationItems.NETHERITE_BATTLEAXE, "This axe has a good swing to it, you should try using it like a sword.");
        addLore(GravitationItems.VALKYRIE_BATTLEAXE, "This axe has a good swing to it, you should try using it like a sword.");

        addLore(GravitationItems.NEPTUNE_SHOVEL, "The Shovel of Neptune.");
        addLore(GravitationItems.NEPTUNE_PICKAXE, "The Pickaxe of Neptune.");
        addLore(GravitationItems.NEPTUNE_AXE, "The Axe of Neptune.");
        addLore(GravitationItems.NEPTUNE_CUTLASS, "The Sharp Cutlass of Neptune.");

        // addLoreUnique("gravitation.neptune_wrath", "Neptune's Wrath deal more damage to Water Mobs.");
        // addLoreUnique("gravitation.hercules_strength", "Hercules's Strength deal more damage to Aether Bosses(Sun Spirit Excluded).");
    }

    public void addAdvancement(AdvancementRL advancementRL, String name, String desc) {
        this.add(advancementRL.getNameKey(), name);
        this.add(advancementRL.getDescKey(), desc);
    }
}
