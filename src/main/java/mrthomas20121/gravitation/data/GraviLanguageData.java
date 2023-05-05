package mrthomas20121.gravitation.data;

import mrthomas20121.gravitation.block.GraviBlocks;
import mrthomas20121.gravitation.entity.GraviEntityTypes;
import mrthomas20121.gravitation.item.GraviItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class GraviLanguageData extends LanguageProvider {

    public GraviLanguageData(PackOutput output) {
        super(output, "gravitation", "en_us");
    }

    @Override
    protected void addTranslations() {
        add("itemGroup.gravitation.equipments", "Gravitation Equipments & Utilities");
        add("itemGroup.gravitation.building_blocks", "Gravitation Building Blocks");
        addItem(GraviItems.NEPTUNE_AXE, "Neptune Axe");
        addItem(GraviItems.NEPTUNE_BATTLEAXE, "Neptune Battleaxe");
        addItem(GraviItems.NEPTUNE_CUTLASS, "Neptune Cutlass");
        addItem(GraviItems.NEPTUNE_PICKAXE, "Neptune Pickaxe");
        addItem(GraviItems.NEPTUNE_SHOVEL, "Neptune Shovel");
        addItem(GraviItems.GRAVITITE_BATTLEAXE, "Gravitite Battleaxe");
        addItem(GraviItems.ZANITE_BATTLEAXE, "Zanite Battleaxe");
        addItem(GraviItems.VALKYRIE_BATTLEAXE, "Valkyrie Battleaxe");
        addItem(GraviItems.NETHERITE_BATTLEAXE, "Netherite Battleaxe");
        addItem(GraviItems.DIAMOND_BATTLEAXE, "Diamond Battleaxe");
        addItem(GraviItems.IRON_BATTLEAXE, "Iron Battleaxe");
        addItem(GraviItems.GOLD_BATTLEAXE, "Gold Battleaxe");
        addItem(GraviItems.ENCHANTED_CHEST_BOAT, "Enchanted Chest Boat");
        addItem(GraviItems.ENCHANTED_BOAT, "Enchanted Boat");
        addItem(GraviItems.PHOENIX_DART, "Phoenix Dart");
        addItem(GraviItems.PHOENIX_DART_SHOOTER, "Phoenix Dart Shooter");
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
        addEntityType(GraviEntityTypes.PHOENIX_DART, "Phoenix Dart");

        // lore
        add("lore.gravitation.enchanted_sapling", "These blue saplings will grow into Enchanted Trees. They can be grown faster with Bone Meal.");
        add("lore.gravitation.enchanted_log", "These spawn on Enchanted Tree. They can double dropped with Skyroot Axes. When put in the crafting table they will provide 4 Enchanted Planks");
        add("lore.gravitation.phoenix_dart", "These Phoenix Darts are found in Gold Dungeon. Set the target on fire on hit.");
        add("lore.gravitation.phoenix_dart_shooter", "The Phoenix Dart Shooter is found in Gold Dungeon. It can shoot Phoenix Darts");
    }
}
