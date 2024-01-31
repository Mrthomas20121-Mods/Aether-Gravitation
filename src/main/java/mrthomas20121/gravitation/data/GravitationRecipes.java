package mrthomas20121.gravitation.data;

import com.aetherteam.aether.AetherTags;
import com.aetherteam.aether.block.AetherBlocks;
import com.aetherteam.aether.data.providers.AetherRecipeProvider;
import com.aetherteam.aether.item.AetherItems;
import mrthomas20121.gravitation.GraviTags;
import mrthomas20121.gravitation.block.GraviBlocks;
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

public class GravitationRecipes extends AetherRecipeProvider {

    public GravitationRecipes(PackOutput output) {
        super(output, "gravitation");
    }

    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> consumer) {

        freezingRecipe(RecipeCategory.MISC, GravitationItems.AECHOR_STRING.get(), AetherItems.AECHOR_PETAL.get(), 0.5f, 10)
                .save(consumer, new ResourceLocation("gravitation:freezing/aechor_string"));

        woodRecipes(
                "aerfin",
                GraviBlocks.AERFIN_PLANKS,
                GraviBlocks.AERFIN_DOOR.get(),
                GraviBlocks.AERFIN_TRAPDOOR.get(),
                GraviBlocks.AERFIN_BUTTON.get(),
                GraviBlocks.AERFIN_FENCE,
                GraviBlocks.AERFIN_FENCE_GATE,
                GraviBlocks.AERFIN_STAIRS,
                GraviBlocks.AERFIN_SLAB.get(),
                GraviBlocks.STRIPPED_AERFIN_LOG.get(),
                GraviBlocks.STRIPPED_AERFIN_WOOD.get(),
                GraviBlocks.AERFIN_WOOD.get(),
                GraviBlocks.AERFIN_LOG.get(),
                GraviTags.Items.AERFIN_LOGS,
                GraviBlocks.AERFIN_BOOKSHELF.get(),
                GraviBlocks.AERFIN_SIGN.get(),
                GravitationItems.AERFIN_BOAT.get(),
                GravitationItems.AERFIN_CHEST_BOAT.get(),
                consumer);

        woodRecipes(
                "enchanted",
                GraviBlocks.ENCHANTED_PLANKS,
                GraviBlocks.ENCHANTED_DOOR.get(),
                GraviBlocks.ENCHANTED_TRAPDOOR.get(),
                GraviBlocks.ENCHANTED_BUTTON.get(),
                GraviBlocks.ENCHANTED_FENCE,
                GraviBlocks.ENCHANTED_FENCE_GATE,
                GraviBlocks.ENCHANTED_STAIRS,
                GraviBlocks.ENCHANTED_SLAB.get(),
                GraviBlocks.STRIPPED_ENCHANTED_LOG.get(),
                GraviBlocks.STRIPPED_ENCHANTED_WOOD.get(),
                GraviBlocks.ENCHANTED_WOOD.get(),
                GraviBlocks.ENCHANTED_LOG.get(),
                GraviTags.Items.ENCHANTED_LOGS,
                GraviBlocks.ENCHANTED_BOOKSHELF.get(),
                GraviBlocks.ENCHANTED_SIGN.get(),
                GravitationItems.ENCHANTED_BOAT.get(),
                GravitationItems.ENCHANTED_CHEST_BOAT.get(),
                consumer);

        woodRecipes(
                "beladon",
                GraviBlocks.BELADON_PLANKS,
                GraviBlocks.BELADON_DOOR.get(),
                GraviBlocks.BELADON_TRAPDOOR.get(),
                GraviBlocks.BELADON_BUTTON.get(),
                GraviBlocks.BELADON_FENCE,
                GraviBlocks.BELADON_FENCE_GATE,
                GraviBlocks.BELADON_STAIRS,
                GraviBlocks.BELADON_SLAB.get(),
                GraviBlocks.STRIPPED_BELADON_LOG.get(),
                GraviBlocks.STRIPPED_BELADON_WOOD.get(),
                GraviBlocks.BELADON_WOOD.get(),
                GraviBlocks.BELADON_LOG.get(),
                GraviTags.Items.BELADON_LOGS,
                GraviBlocks.BELADON_BOOKSHELF.get(),
                GraviBlocks.BELADON_SIGN.get(),
                GravitationItems.BELADON_BOAT.get(),
                GravitationItems.BELADON_CHEST_BOAT.get(),
                consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, GraviBlocks.POLISHED_CONGLOMERATE.get())
                .define('X', GraviBlocks.CONGLOMERATE.get())
                .pattern("XX")
                .pattern("XX")
                .unlockedBy("has_conglomerate_ingot", has(GraviBlocks.CONGLOMERATE.get()))
                .save(consumer, new ResourceLocation("gravitation:crafting/polished_conglomerate"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, GraviBlocks.CONGLOMERATE_BRICKS.get())
                .define('X', GraviBlocks.POLISHED_CONGLOMERATE.get())
                .pattern("XX")
                .pattern("XX")
                .unlockedBy("has_polished_conglomerate_ingot", has(GraviBlocks.POLISHED_CONGLOMERATE.get()))
                .save(consumer, new ResourceLocation("gravitation:crafting/conglomerate_bricks"));

        wall(consumer, new ResourceLocation("gravitation:crafting/conglomerate_wall"), RecipeCategory.BUILDING_BLOCKS,
                GraviBlocks.CONGLOMERATE_WALLS.get(), GraviBlocks.CONGLOMERATE.get());
        wall(consumer, new ResourceLocation("gravitation:crafting/conglomerate_brick_wall"), RecipeCategory.BUILDING_BLOCKS,
                GraviBlocks.CONGLOMERATE_BRICK_WALLS.get(), GraviBlocks.CONGLOMERATE_BRICKS.get());
        wall(consumer, new ResourceLocation("gravitation:crafting/polished_conglomerate_wall"), RecipeCategory.BUILDING_BLOCKS,
                GraviBlocks.POLISHED_CONGLOMERATE_WALLS.get(), GraviBlocks.POLISHED_CONGLOMERATE.get());
        stairs(consumer, new ResourceLocation("gravitation:crafting/conglomerate_stairs"),
                GraviBlocks.CONGLOMERATE_STAIRS, GraviBlocks.CONGLOMERATE);
        stairs(consumer, new ResourceLocation("gravitation:crafting/conglomerate_brick_stairs"),
                GraviBlocks.CONGLOMERATE_BRICK_STAIRS, GraviBlocks.CONGLOMERATE_BRICKS);
        stairs(consumer, new ResourceLocation("gravitation:crafting/polished_conglomerate_stairs"),
                GraviBlocks.POLISHED_CONGLOMERATE_STAIRS, GraviBlocks.POLISHED_CONGLOMERATE);
        slab(consumer, new ResourceLocation("gravitation:crafting/conglomerate_slab"),RecipeCategory.BUILDING_BLOCKS,
                GraviBlocks.CONGLOMERATE_SLAB.get(), GraviBlocks.CONGLOMERATE.get());
        slab(consumer, new ResourceLocation("gravitation:crafting/conglomerate_brick_slab"),RecipeCategory.BUILDING_BLOCKS,
                GraviBlocks.CONGLOMERATE_BRICK_SLAB.get(), GraviBlocks.CONGLOMERATE_BRICKS.get());
        slab(consumer, new ResourceLocation("gravitation:crafting/polished_conglomerate_slab"),RecipeCategory.BUILDING_BLOCKS,
                GraviBlocks.POLISHED_CONGLOMERATE_SLAB.get(), GraviBlocks.POLISHED_CONGLOMERATE.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, GraviBlocks.BRONZITE_BLOCK.get())
                .define('X', GravitationItems.BRONZITE_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_bronzite_ingot", has(GravitationItems.BRONZITE_INGOT.get()))
                .save(consumer, new ResourceLocation("gravitation:crafting/bronzite_block"));

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

        makePendant(GravitationItems.BRONZITE_PENDANT, GravitationItems.BRONZITE_INGOT.get()).save(consumer, new ResourceLocation("gravitation:crafting/bronzite_pendant"));

        makePickaxe(GravitationItems.BRONZITE_PICKAXE, GravitationItems.BRONZITE_INGOT).save(consumer, new ResourceLocation("gravitation:crafting/bronzite_pickaxe"));
        makeHoe(GravitationItems.BRONZITE_HOE, GravitationItems.BRONZITE_INGOT).save(consumer, new ResourceLocation("gravitation:crafting/bronzite_hoe"));
        makeSword(GravitationItems.BRONZITE_SWORD, GravitationItems.BRONZITE_INGOT).save(consumer, new ResourceLocation("gravitation:crafting/bronzite_sword"));
        makeAxe(GravitationItems.BRONZITE_AXE, GravitationItems.BRONZITE_INGOT).save(consumer, new ResourceLocation("gravitation:crafting/bronzite_axe"));
        makeRing(GravitationItems.BRONZITE_RING, GravitationItems.BRONZITE_INGOT.get()).save(consumer, new ResourceLocation("gravitation:crafting/bronzite_ring"));
        makeShovel(GravitationItems.BRONZITE_Shovel, GravitationItems.BRONZITE_INGOT).save(consumer, new ResourceLocation("gravitation:crafting/bronzite_shovel"));

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

        enchantingRecipe(RecipeCategory.MISC, GraviBlocks.ENCHANTED_SAPLING.get(), AetherBlocks.SKYROOT_SAPLING.get(), 0.20f, 50).save(consumer, new ResourceLocation("gravitation:enchanting/enchanted_sapling"));
        enchantingRecipe(RecipeCategory.MISC, GraviBlocks.ENCHANTED_MOSS.get(), Blocks.MOSS_BLOCK, 0.20f, 60).save(consumer, new ResourceLocation("gravitation:enchanting/enchanted_moss"));

        enchantingRecipe(RecipeCategory.MISC, GravitationItems.DIG_STONE.get(), AetherBlocks.CARVED_STONE.get(), 0.20f, 20).save(consumer, new ResourceLocation("gravitation:enchanting/dig_stone"));
        enchantingRecipe(RecipeCategory.MISC, GravitationItems.DENSE_STONE.get(), AetherBlocks.ANGELIC_STONE.get(), 0.20f, 30).save(consumer, new ResourceLocation("gravitation:enchanting/dense_stone"));
        enchantingRecipe(RecipeCategory.MISC, GravitationItems.POWER_STONE.get(), AetherBlocks.HELLFIRE_STONE.get(), 0.20f, 40).save(consumer, new ResourceLocation("gravitation:enchanting/power_stone"));
        enchantingRecipe(RecipeCategory.MISC, GravitationItems.GREATER_HEALING_STONE.get(), AetherItems.HEALING_STONE.get(), 0.20f, 120).save(consumer, new ResourceLocation("gravitation:enchanting/greater_healing_stone"));

        freezingRecipe(RecipeCategory.MISC, Items.LAPIS_LAZULI, AetherItems.GOLDEN_AMBER.get(), 1.0f, 10).save(consumer, "gravitation:golden_amber_to_lapis");

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

    protected void woodRecipes(String woodName, Supplier<Block> planks, DoorBlock door, TrapDoorBlock trapDoorBlock, ButtonBlock buttonBlock, Supplier<FenceBlock> fenceBlock, Supplier<FenceGateBlock> fenceGateBlock, Supplier<StairBlock> stairBlock, SlabBlock slabBlock, Block strippedLog, Block strippedWood, Block wood, Block log, TagKey<Item> woodType, Block bookshelf, SignBlock signBlock, Item boat, Item chestBoat, Consumer<FinishedRecipe> consumer) {
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

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, Blocks.CRAFTING_TABLE)
                .define('X', ingredient)
                .pattern("XX")
                .pattern("XX")
                .unlockedBy("has_"+ woodName +"_planks", has(plank))
                .save(consumer, new ResourceLocation("gravitation:crafting/"+ woodName +"_crafting_table"));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, bookshelf, 1)
                .define('P', ingredient)
                .define('B', Items.BOOK)
                .pattern("PPP")
                .pattern("BBB")
                .pattern("PPP")
                .unlockedBy(getHasName(Items.BOOK), has(Items.BOOK))
                .save(consumer);

    }

    protected static void zaniteSmithing(Consumer<FinishedRecipe> p_251614_, Item p_250046_, RecipeCategory p_248986_, Item p_250389_) {
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(GravitationItems.BRONZITE_UPGRADE.get()), Ingredient.of(p_250046_), Ingredient.of(AetherItems.ZANITE_GEMSTONE.get()), p_248986_, p_250389_).unlocks("has_zanite_gemstone", has(AetherItems.ZANITE_GEMSTONE.get())).save(p_251614_, getItemName(p_250389_) + "_zanite_smithing");
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
