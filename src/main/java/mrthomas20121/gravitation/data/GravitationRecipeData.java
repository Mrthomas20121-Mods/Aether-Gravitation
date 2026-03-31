package mrthomas20121.gravitation.data;

import com.aetherteam.aether.AetherTags;
import com.aetherteam.aether.block.AetherBlocks;
import com.aetherteam.aether.data.providers.AetherRecipeProvider;
import com.aetherteam.aether.item.AetherItems;
import mrthomas20121.gravitation.GraviTags;
import mrthomas20121.gravitation.block.GravitationBlocks;
import mrthomas20121.gravitation.compat.ModCompat;
import mrthomas20121.gravitation.item.GravitationItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.*;
import net.minecraftforge.common.crafting.ConditionalRecipe;
import net.minecraftforge.common.crafting.conditions.ModLoadedCondition;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class GravitationRecipeData extends AetherRecipeProvider {

    public GravitationRecipeData(PackOutput output) {
        super(output, "gravitation");
    }

    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> consumer) {

        ModCompat.getModCompatList().forEach(mod -> {
            mod.addRecipes(consumer);
        });

        woodRecipes(
                "aerfin",
                GravitationBlocks.AERFIN_PLANKS,
                GravitationBlocks.AERFIN_DOOR.get(),
                GravitationBlocks.AERFIN_TRAPDOOR.get(),
                GravitationBlocks.AERFIN_BUTTON.get(),
                GravitationBlocks.AERFIN_FENCE,
                GravitationBlocks.AERFIN_FENCE_GATE,
                GravitationBlocks.AERFIN_STAIRS,
                GravitationBlocks.AERFIN_SLAB.get(),
                GravitationBlocks.STRIPPED_AERFIN_LOG.get(),
                GravitationBlocks.STRIPPED_AERFIN_WOOD.get(),
                GravitationBlocks.AERFIN_WOOD.get(),
                GravitationBlocks.AERFIN_LOG.get(),
                GraviTags.Items.AERFIN_LOGS,
                GravitationBlocks.AERFIN_BOOKSHELF.get(),
                GravitationBlocks.AERFIN_SIGN.get(),
                GravitationBlocks.AERFIN_HANGING_SIGN.get(),
                GravitationItems.AERFIN_BOAT.get(),
                GravitationItems.AERFIN_CHEST_BOAT.get(),
                consumer);

        woodRecipes(
                "enchanted",
                GravitationBlocks.ENCHANTED_PLANKS,
                GravitationBlocks.ENCHANTED_DOOR.get(),
                GravitationBlocks.ENCHANTED_TRAPDOOR.get(),
                GravitationBlocks.ENCHANTED_BUTTON.get(),
                GravitationBlocks.ENCHANTED_FENCE,
                GravitationBlocks.ENCHANTED_FENCE_GATE,
                GravitationBlocks.ENCHANTED_STAIRS,
                GravitationBlocks.ENCHANTED_SLAB.get(),
                GravitationBlocks.STRIPPED_ENCHANTED_LOG.get(),
                GravitationBlocks.STRIPPED_ENCHANTED_WOOD.get(),
                GravitationBlocks.ENCHANTED_WOOD.get(),
                GravitationBlocks.ENCHANTED_LOG.get(),
                GraviTags.Items.ENCHANTED_LOGS,
                GravitationBlocks.ENCHANTED_BOOKSHELF.get(),
                GravitationBlocks.ENCHANTED_SIGN.get(),
                GravitationBlocks.ENCHANTED_HANGING_SIGN.get(),
                GravitationItems.ENCHANTED_BOAT.get(),
                GravitationItems.ENCHANTED_CHEST_BOAT.get(),
                consumer);

        woodRecipes(
                "beladon",
                GravitationBlocks.BELADON_PLANKS,
                GravitationBlocks.BELADON_DOOR.get(),
                GravitationBlocks.BELADON_TRAPDOOR.get(),
                GravitationBlocks.BELADON_BUTTON.get(),
                GravitationBlocks.BELADON_FENCE,
                GravitationBlocks.BELADON_FENCE_GATE,
                GravitationBlocks.BELADON_STAIRS,
                GravitationBlocks.BELADON_SLAB.get(),
                GravitationBlocks.STRIPPED_BELADON_LOG.get(),
                GravitationBlocks.STRIPPED_BELADON_WOOD.get(),
                GravitationBlocks.BELADON_WOOD.get(),
                GravitationBlocks.BELADON_LOG.get(),
                GraviTags.Items.BELADON_LOGS,
                GravitationBlocks.BELADON_BOOKSHELF.get(),
                GravitationBlocks.BELADON_SIGN.get(),
                GravitationBlocks.BELADON_HANGING_SIGN.get(),
                GravitationItems.BELADON_BOAT.get(),
                GravitationItems.BELADON_CHEST_BOAT.get(),
                consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, GravitationBlocks.POLISHED_CONGLOMERATE.get())
                .define('X', GravitationBlocks.CONGLOMERATE.get())
                .pattern("XX")
                .pattern("XX")
                .unlockedBy("has_conglomerate_ingot", has(GravitationBlocks.CONGLOMERATE.get()))
                .save(consumer, new ResourceLocation("gravitation:crafting/polished_conglomerate"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, GravitationBlocks.CONGLOMERATE_BRICKS.get())
                .define('X', GravitationBlocks.POLISHED_CONGLOMERATE.get())
                .pattern("XX")
                .pattern("XX")
                .unlockedBy("has_polished_conglomerate_ingot", has(GravitationBlocks.POLISHED_CONGLOMERATE.get()))
                .save(consumer, new ResourceLocation("gravitation:crafting/conglomerate_bricks"));

        wall(consumer, new ResourceLocation("gravitation:crafting/conglomerate_wall"), RecipeCategory.BUILDING_BLOCKS,
                GravitationBlocks.CONGLOMERATE_WALLS.get(), GravitationBlocks.CONGLOMERATE.get());
        wall(consumer, new ResourceLocation("gravitation:crafting/conglomerate_brick_wall"), RecipeCategory.BUILDING_BLOCKS,
                GravitationBlocks.CONGLOMERATE_BRICK_WALLS.get(), GravitationBlocks.CONGLOMERATE_BRICKS.get());
        wall(consumer, new ResourceLocation("gravitation:crafting/polished_conglomerate_wall"), RecipeCategory.BUILDING_BLOCKS,
                GravitationBlocks.POLISHED_CONGLOMERATE_WALLS.get(), GravitationBlocks.POLISHED_CONGLOMERATE.get());
        wall(consumer, new ResourceLocation("gravitation:crafting/chiseled_conglomerate_wall"), RecipeCategory.BUILDING_BLOCKS,
                GravitationBlocks.CHISELED_CONGLOMERATE_WALLS.get(), GravitationBlocks.CHISELED_CONGLOMERATE.get());
        stairs(consumer, new ResourceLocation("gravitation:crafting/conglomerate_stairs"),
                GravitationBlocks.CONGLOMERATE_STAIRS, GravitationBlocks.CONGLOMERATE);
        stairs(consumer, new ResourceLocation("gravitation:crafting/conglomerate_brick_stairs"),
                GravitationBlocks.CONGLOMERATE_BRICK_STAIRS, GravitationBlocks.CONGLOMERATE_BRICKS);
        stairs(consumer, new ResourceLocation("gravitation:crafting/polished_conglomerate_stairs"),
                GravitationBlocks.CHISELED_CONGLOMERATE_STAIRS, GravitationBlocks.CHISELED_CONGLOMERATE);
        stairs(consumer, new ResourceLocation("gravitation:crafting/chiseled_conglomerate_stairs"),
                GravitationBlocks.POLISHED_CONGLOMERATE_STAIRS, GravitationBlocks.POLISHED_CONGLOMERATE);
        slab(consumer, new ResourceLocation("gravitation:crafting/conglomerate_slab"),RecipeCategory.BUILDING_BLOCKS,
                GravitationBlocks.CONGLOMERATE_SLAB.get(), GravitationBlocks.CONGLOMERATE.get());
        slab(consumer, new ResourceLocation("gravitation:crafting/conglomerate_brick_slab"),RecipeCategory.BUILDING_BLOCKS,
                GravitationBlocks.CONGLOMERATE_BRICK_SLAB.get(), GravitationBlocks.CONGLOMERATE_BRICKS.get());
        slab(consumer, new ResourceLocation("gravitation:crafting/polished_conglomerate_slab"),RecipeCategory.BUILDING_BLOCKS,
                GravitationBlocks.POLISHED_CONGLOMERATE_SLAB.get(), GravitationBlocks.POLISHED_CONGLOMERATE.get());
        slab(consumer, new ResourceLocation("gravitation:crafting/chiseled_conglomerate_slab"),RecipeCategory.BUILDING_BLOCKS,
                GravitationBlocks.CHISELED_CONGLOMERATE_SLAB.get(), GravitationBlocks.CHISELED_CONGLOMERATE.get());

        ShapelessRecipeBuilder.shapeless(RecipeCategory.TOOLS, GravitationItems.ADAMANTITE_GEM.get(), 1)
                .requires(GravitationItems.BRONZITE_INGOT.get())
                .requires(AetherBlocks.ENCHANTED_GRAVITITE.get())
                .requires(AetherBlocks.HELLFIRE_STONE.get())
                .unlockedBy(getHasName(AetherBlocks.HELLFIRE_STONE.get()), has(AetherBlocks.HELLFIRE_STONE.get()))
                .unlockedBy(getHasName(GravitationItems.BRONZITE_INGOT.get()), has(GravitationItems.BRONZITE_INGOT.get()))
                .save(consumer, new ResourceLocation("gravitation:crafting/adamantite_gem"));

        makeAxe(GravitationItems.ADAMANTITE_AXE, GravitationItems.ADAMANTITE_GEM).save(consumer, new ResourceLocation("gravitation:crafting/adamantite_axe"));
        makeShovel(GravitationItems.ADAMANTITE_SHOVEL, GravitationItems.ADAMANTITE_GEM).save(consumer, new ResourceLocation("gravitation:crafting/adamantite_shovel"));
        makeSword(GravitationItems.ADAMANTITE_SWORD, GravitationItems.ADAMANTITE_GEM).save(consumer, new ResourceLocation("gravitation:crafting/adamantite_sword"));
        makePickaxe(GravitationItems.ADAMANTITE_PICKAXE, GravitationItems.ADAMANTITE_GEM).save(consumer, new ResourceLocation("gravitation:crafting/adamantite_pickaxe"));
        makeHoe(GravitationItems.ADAMANTITE_HOE, GravitationItems.ADAMANTITE_GEM).save(consumer, new ResourceLocation("gravitation:crafting/adamantite_hoe"));
        battleaxeRecipe(consumer, GravitationItems.ADAMANTITE_GEM.get(), Ingredient.of(AetherTags.Items.SKYROOT_STICKS), GravitationItems.ADAMANTITE_BATTLEAXE.get());
        makeHelmet(GravitationItems.ADAMANTITE_HELMET, GravitationItems.ADAMANTITE_GEM).save(consumer, new ResourceLocation("gravitation:crafting/adamantite_helmet"));
        makeChestplate(GravitationItems.ADAMANTITE_CHESTPLATE, GravitationItems.ADAMANTITE_GEM).save(consumer, new ResourceLocation("gravitation:crafting/adamantite_chestplate"));
        makeLeggings(GravitationItems.ADAMANTITE_LEGGING, GravitationItems.ADAMANTITE_GEM).save(consumer, new ResourceLocation("gravitation:crafting/adamantite_leggings"));
        makeBoots(GravitationItems.ADAMANTITE_BOOTS, GravitationItems.ADAMANTITE_GEM).save(consumer, new ResourceLocation("gravitation:crafting/adamantite_boots"));
        makeCape(GravitationItems.ADAMANTITE_CAPE, GravitationItems.ADAMANTITE_GEM.get()).save(consumer, new ResourceLocation("gravitation:crafting/adamantite_cape"));
        makeGloves(GravitationItems.ADAMANTITE_GLOVES, GravitationItems.ADAMANTITE_GEM).save(consumer, new ResourceLocation("gravitation:crafting/adamantite_gloves"));

        makePendant(GravitationItems.ADAMANTITE_PENDANT, GravitationItems.ADAMANTITE_GEM.get()).save(consumer, new ResourceLocation("gravitation:crafting/adamantite_pendant"));
        makeRing(GravitationItems.ADAMANTITE_RING, GravitationItems.ADAMANTITE_GEM.get()).save(consumer, new ResourceLocation("gravitation:crafting/adamantite_ring"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, GravitationItems.BRONZITE_UPGRADE.get())
                .define('X', GravitationItems.BRONZITE_ROCK.get())
                .define('Y', AetherTags.Items.DUNGEON_BLOCKS)
                .pattern("YYY")
                .pattern("YXY")
                .pattern("YYY")
                .unlockedBy("has_bronzite_ingot", has(GravitationItems.BRONZITE_INGOT.get()))
                .save(consumer, new ResourceLocation("gravitation:crafting/bronzite_upgrade"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, GravitationBlocks.BRONZITE_BLOCK.get())
                .define('X', GravitationItems.BRONZITE_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_bronzite_ingot", has(GravitationItems.BRONZITE_INGOT.get()))
                .save(consumer, new ResourceLocation("gravitation:crafting/bronzite_block"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, GravitationItems.BRONZITE_INGOT.get(), 9)
                .requires(GravitationBlocks.BRONZITE_BLOCK.get())
                .unlockedBy("has_bronzite_ingot", has(GravitationBlocks.BRONZITE_BLOCK.get()))
                .save(consumer, new ResourceLocation("gravitation:crafting/bronzite_ingot_from_block"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, GravitationItems.BRONZITE_INGOT.get())
                .define('X', GravitationItems.BRONZITE_NUGGET.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_bronzite_nugget", has(GravitationItems.BRONZITE_NUGGET.get()))
                .save(consumer, new ResourceLocation("gravitation:crafting/bronzite_ingot_from_nugget"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, GravitationItems.BRONZITE_NUGGET.get(), 9)
                .requires(GravitationItems.BRONZITE_INGOT.get())
                .unlockedBy("has_bronzite_ingot", has(GravitationItems.BRONZITE_INGOT.get()))
                .save(consumer, new ResourceLocation("gravitation:crafting/bronzite_nugget_from_ingot"));

        ConditionalRecipe.builder().addCondition(new ModLoadedCondition("lost_aether_content")).addRecipe(b -> ShapedRecipeBuilder.shaped(RecipeCategory.MISC, GravitationItems.BRONZITE_SHIELD.get())
                .define('X', GravitationItems.BRONZITE_INGOT.get())
                .define('Y', Ingredient.of(AetherTags.Items.SKYROOT_STICKS))
                .pattern("XYX")
                .pattern("XXX")
                .pattern(" X ")
                .unlockedBy("has_bronzite_ingot", has(GravitationItems.BRONZITE_INGOT.get())).save(b, "gravitation:compat/lost_aether_content/bronzite_shield"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, GravitationItems.BRONZITE_SHIELD.get())
                .define('X', GravitationItems.BRONZITE_INGOT.get())
                .define('Y', Ingredient.of(AetherTags.Items.SKYROOT_STICKS))
                .pattern("XYX")
                .pattern("XXX")
                .pattern(" X ")
                .unlockedBy("has_bronzite_ingot", has(GravitationItems.BRONZITE_INGOT.get()))
                .save(consumer, new ResourceLocation("gravitation:crafting/bronzite_shield"));


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, GravitationItems.BRONZITE_HELMET.get())
                .define('X', GravitationItems.BRONZITE_INGOT.get())
                .pattern("XXX")
                .pattern("X X")
                .unlockedBy("has_bronzite_ingot", has(GravitationItems.BRONZITE_INGOT.get()))
                .save(consumer, new ResourceLocation("gravitation:crafting/bronzite_helmet"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, GravitationItems.BRONZITE_CHESTPLATE.get())
                .define('X', GravitationItems.BRONZITE_INGOT.get())
                .pattern("X X")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_bronzite_ingot", has(GravitationItems.BRONZITE_INGOT.get()))
                .save(consumer, new ResourceLocation("gravitation:crafting/bronzite_chestplate"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, GravitationItems.BRONZITE_LEGGING.get())
                .define('X', GravitationItems.BRONZITE_INGOT.get())
                .pattern("XXX")
                .pattern("X X")
                .pattern("X X")
                .unlockedBy("has_bronzite_ingot", has(GravitationItems.BRONZITE_INGOT.get()))
                .save(consumer, new ResourceLocation("gravitation:crafting/bronzite_leggings"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, GravitationItems.BRONZITE_BOOTS.get())
                .define('X', GravitationItems.BRONZITE_INGOT.get())
                .pattern("X X")
                .pattern("X X")
                .unlockedBy("has_bronzite_ingot", has(GravitationItems.BRONZITE_INGOT.get()))
                .save(consumer, new ResourceLocation("gravitation:crafting/bronzite_boots"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, GravitationItems.BRONZITE_CAPE.get())
                .define('X', GravitationItems.BRONZITE_INGOT.get())
                .pattern("XX")
                .pattern("XX")
                .pattern("XX")
                .unlockedBy("has_bronzite_ingot", has(GravitationItems.BRONZITE_INGOT.get()))
                .save(consumer, new ResourceLocation("gravitation:crafting/bronzite_cape"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blocks.ENCHANTING_TABLE)
                .define('B', Items.BOOK)
                .define('A', AetherItems.AMBROSIUM_SHARD.get())
                .define('G', AetherItems.GOLDEN_AMBER.get())
                .define('O', AetherTags.Items.ANGELIC_BLOCKS)
                .pattern("GBG")
                .pattern("AOA")
                .pattern("OOO")
                .unlockedBy("has_angelic_blocks", has(AetherTags.Items.ANGELIC_BLOCKS))
                .save(consumer, new ResourceLocation("gravitation:crafting/enchanting_table"));

        makePendant(GravitationItems.BRONZITE_PENDANT, GravitationItems.BRONZITE_INGOT.get()).save(consumer, new ResourceLocation("gravitation:crafting/bronzite_pendant"));
        makeRing(GravitationItems.BRONZITE_RING, GravitationItems.BRONZITE_INGOT.get()).save(consumer, new ResourceLocation("gravitation:crafting/bronzite_ring"));

        makePickaxe(GravitationItems.BRONZITE_PICKAXE, GravitationItems.BRONZITE_INGOT).save(consumer, new ResourceLocation("gravitation:crafting/bronzite_pickaxe"));
        makeHoe(GravitationItems.BRONZITE_HOE, GravitationItems.BRONZITE_INGOT).save(consumer, new ResourceLocation("gravitation:crafting/bronzite_hoe"));
        makeSword(GravitationItems.BRONZITE_SWORD, GravitationItems.BRONZITE_INGOT).save(consumer, new ResourceLocation("gravitation:crafting/bronzite_sword"));
        makeAxe(GravitationItems.BRONZITE_AXE, GravitationItems.BRONZITE_INGOT).save(consumer, new ResourceLocation("gravitation:crafting/bronzite_axe"));
        makeShovel(GravitationItems.BRONZITE_SHOVEL, GravitationItems.BRONZITE_INGOT).save(consumer, new ResourceLocation("gravitation:crafting/bronzite_shovel"));

        repairingRecipe(RecipeCategory.TOOLS, GravitationItems.GRAVITITE_BATTLEAXE.get(), 1500).save(consumer, new ResourceLocation("gravitation:repairing/gravitite_battleaxe"));
        repairingRecipe(RecipeCategory.TOOLS, GravitationItems.ZANITE_BATTLEAXE.get(), 750).save(consumer, new ResourceLocation("gravitation:repairing/zanite_battleaxe"));
        repairingRecipe(RecipeCategory.TOOLS, GravitationItems.NETHERITE_BATTLEAXE.get(), 1500).save(consumer, new ResourceLocation("gravitation:repairing/netherite_battleaxe"));
        repairingRecipe(RecipeCategory.TOOLS, GravitationItems.DIAMOND_BATTLEAXE.get(), 1500).save(consumer, new ResourceLocation("gravitation:repairing/diamond_battleaxe"));
        repairingRecipe(RecipeCategory.TOOLS, GravitationItems.IRON_BATTLEAXE.get(), 750).save(consumer, new ResourceLocation("gravitation:repairing/iron_battleaxe"));
        repairingRecipe(RecipeCategory.TOOLS, GravitationItems.GOLD_BATTLEAXE.get(), 500).save(consumer, new ResourceLocation("gravitation:repairing/gold_battleaxe"));
        repairingRecipe(RecipeCategory.TOOLS, GravitationItems.BRONZITE_HELMET.get(), 500).save(consumer, new ResourceLocation("gravitation:repairing/bronzite_helmet"));
        repairingRecipe(RecipeCategory.TOOLS, GravitationItems.BRONZITE_CHESTPLATE.get(), 500).save(consumer, new ResourceLocation("gravitation:repairing/bronzite_chestplate"));
        repairingRecipe(RecipeCategory.TOOLS, GravitationItems.BRONZITE_GLOVES.get(), 500).save(consumer, new ResourceLocation("gravitation:repairing/bronzite_gloves"));
        repairingRecipe(RecipeCategory.TOOLS, GravitationItems.BRONZITE_BOOTS.get(), 500).save(consumer, new ResourceLocation("gravitation:repairing/bronzite_boots"));
        repairingRecipe(RecipeCategory.TOOLS, GravitationItems.BRONZITE_LEGGING.get(), 500).save(consumer, new ResourceLocation("gravitation:repairing/bronzite_leggings"));

        battleaxeRecipe(consumer, AetherBlocks.ENCHANTED_GRAVITITE.get(), AetherItems.SKYROOT_STICK.get(), GravitationItems.GRAVITITE_BATTLEAXE.get());
        battleaxeRecipe(consumer, AetherItems.ZANITE_GEMSTONE.get(), AetherItems.SKYROOT_STICK.get(), GravitationItems.ZANITE_BATTLEAXE.get());
        battleaxeRecipe(consumer, Items.DIAMOND, Items.STICK, GravitationItems.DIAMOND_BATTLEAXE.get());
        battleaxeRecipe(consumer, Items.IRON_INGOT, Items.STICK, GravitationItems.IRON_BATTLEAXE.get());
        battleaxeRecipe(consumer, Items.GOLD_INGOT, Items.STICK, GravitationItems.GOLD_BATTLEAXE.get());
        battleaxeRecipe(consumer, GravitationItems.BRONZITE_INGOT.get(), AetherItems.SKYROOT_STICK.get(), GravitationItems.BRONZITE_BATTLEAXE.get());
        netheriteSmithing(consumer, GravitationItems.DIAMOND_BATTLEAXE.get(), RecipeCategory.TOOLS, GravitationItems.NETHERITE_BATTLEAXE.get());
        //conditionalBattleaxeRecipe("deep_aether", ForgeRegistries.ITEMS.getValue(new ResourceLocation("deep_aether:skyjade")), AetherItems.SKYROOT_STICK.get(), GraviItems.SKYJADE_BATTLEAXE.get());

        zaniteSmithing(consumer, GravitationItems.BRONZITE_ROCK.get(), RecipeCategory.TOOLS, GravitationItems.BRONZITE_INGOT.get());

        freezingRecipe(RecipeCategory.MISC, GravitationItems.ICED_BLACK_BERRY.get(), GravitationItems.BLACK_BERRY.get(), 0.20f, 60).save(consumer, new ResourceLocation("gravitation:freezing/enchanted_black_berry"));

        //ModCompat.getCompatList().forEach(compat -> compat.addRecipes(consumer, this));
    }

    protected static void stickFromPlanks(Consumer<FinishedRecipe> consumer, ResourceLocation name, ItemLike output, ItemLike input) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 4).pattern("X").pattern("X").define('X', input).group("planks").unlockedBy(getHasName(input), has(input)).save(consumer, name);
    }

    protected static RecipeBuilder signBuilder(ItemLike p_176727_, Ingredient p_176728_, ItemLike stick) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, p_176727_, 3).group("sign").define('#', p_176728_).define('X', stick).pattern("###").pattern("###").pattern(" X ");
    }

    protected static void battleaxeRecipe(Consumer<FinishedRecipe> consumer, ItemLike material, Item stick, Item output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, output).group("battleaxe").define('#', material).define('X', stick).pattern("###").pattern("#X#").pattern(" X ").unlockedBy("has", has(material)).save(consumer);
    }

    protected static void battleaxeRecipe(Consumer<FinishedRecipe> consumer, ItemLike material, Ingredient stick, Item output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, output).group("battleaxe").define('#', material).define('X', stick).pattern("###").pattern("#X#").pattern(" X ").unlockedBy("has", has(material)).save(consumer);
    }

    protected void woodRecipes(String woodName, Supplier<Block> planks, DoorBlock door, TrapDoorBlock trapDoorBlock, ButtonBlock buttonBlock, Supplier<FenceBlock> fenceBlock, Supplier<FenceGateBlock> fenceGateBlock, Supplier<StairBlock> stairBlock, SlabBlock slabBlock, Block strippedLog, Block strippedWood, Block wood, Block log, TagKey<Item> woodType, Block bookshelf, SignBlock signBlock, SignBlock hangingSign, Item boat, Item chestBoat, Consumer<FinishedRecipe> consumer) {
        Block plank = planks.get();
        Ingredient ingredient = Ingredient.of(plank);
        doorBuilder(door, ingredient).group("door").unlockedBy("has_"+ woodName +"_planks", has(plank)).save(consumer);
        trapdoorBuilder(trapDoorBlock, ingredient).group("trapdoor").unlockedBy("has_"+ woodName +"_planks", has(plank)).save(consumer);
        fence(fenceBlock, planks).save(consumer);
        fenceGate(fenceGateBlock, planks).save(consumer);
        buttonBuilder(buttonBlock, ingredient).group("wooden").unlockedBy("has_"+ woodName +"_planks", has(plank)).save(consumer, new ResourceLocation("gravitation:"+ woodName +"_button"));
        stairs(stairBlock, planks).group("stairs").save(consumer, new ResourceLocation("gravitation:"+ woodName +"_stairs_from_planks"));
        slab(consumer, RecipeCategory.BUILDING_BLOCKS, slabBlock, plank);
        woodFromLogs(consumer, strippedWood, strippedLog);
        woodFromLogs(consumer, wood, log);
        planksFromLogs(consumer, plank, woodType, 4);
        stickFromPlanks(consumer, new ResourceLocation("gravitation:skyroot_stick_from_"+ woodName +"_planks"), AetherItems.SKYROOT_STICK.get(), plank);
        woodenBoat(consumer, boat, plank);
        chestBoat(consumer, chestBoat, plank);
        signBuilder(signBlock, ingredient, AetherItems.SKYROOT_STICK.get()).group("sign").unlockedBy("has_"+ woodName +"_planks", has(plank)).save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, bookshelf, 1)
                .define('P', ingredient)
                .define('B', Items.BOOK)
                .pattern("PPP")
                .pattern("BBB")
                .pattern("PPP")
                .unlockedBy(getHasName(Items.BOOK), has(Items.BOOK))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, hangingSign, 6)
                .group("hanging_sign")
                .define('#', strippedLog)
                .define('X', Items.CHAIN)
                .pattern("X X")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_stripped_logs", has(strippedLog))
                .save(consumer);

    }

    protected static void zaniteSmithing(Consumer<FinishedRecipe> p_251614_, Item p_250046_, RecipeCategory p_248986_, Item p_250389_) {
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(GravitationItems.BRONZITE_UPGRADE.get()), Ingredient.of(p_250046_), Ingredient.of(AetherItems.ZANITE_GEMSTONE.get()), p_248986_, p_250389_).unlocks("has_zanite_gemstone", has(AetherItems.ZANITE_GEMSTONE.get())).save(p_251614_, "gravitation:"+getItemName(p_250389_) + "_zanite_smithing");
    }

    protected void stairs(Consumer<FinishedRecipe> consumer, ResourceLocation name, Supplier<? extends Block> stairs, Supplier<? extends Block> material) {
        stairs(stairs, material).save(consumer, name);
    }

    protected static void wall(Consumer<FinishedRecipe> p_251034_, ResourceLocation name, RecipeCategory p_251148_, ItemLike p_250499_, ItemLike p_249970_) {
        wallBuilder(p_251148_, p_250499_, Ingredient.of(p_249970_)).unlockedBy(getHasName(p_249970_), has(p_249970_)).save(p_251034_, name);
    }

    protected static void slab(Consumer<FinishedRecipe> p_248880_, ResourceLocation name, RecipeCategory p_251848_, ItemLike p_249368_, ItemLike p_252133_) {
        slabBuilder(p_251848_, p_249368_, Ingredient.of(p_252133_)).unlockedBy(getHasName(p_252133_), has(p_252133_)).save(p_248880_, name);
    }
}
