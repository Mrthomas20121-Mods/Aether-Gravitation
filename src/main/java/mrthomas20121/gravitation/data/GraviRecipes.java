package mrthomas20121.gravitation.data;

import com.aetherteam.aether.AetherTags;
import com.aetherteam.aether.block.AetherBlocks;
import com.aetherteam.aether.data.providers.AetherRecipeProvider;
import com.aetherteam.aether.item.AetherItems;
import mrthomas20121.gravitation.GraviTags;
import mrthomas20121.gravitation.block.GraviBlocks;
import mrthomas20121.gravitation.item.GraviItems;
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

public class GraviRecipes extends AetherRecipeProvider {

    public GraviRecipes(PackOutput output) {
        super(output, "gravitation");
    }

    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> consumer) {

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
                GraviItems.ENCHANTED_BOAT.get(),
                GraviItems.ENCHANTED_CHEST_BOAT.get(),
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
                GraviItems.BELADON_BOAT.get(),
                GraviItems.BELADON_CHEST_BOAT.get(),
                consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, GraviBlocks.BRONZITE_BLOCK.get())
                .define('X', GraviItems.BRONZITE_INGOT.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_bronzite_ingot", has(GraviItems.BRONZITE_INGOT.get()))
                .save(consumer, new ResourceLocation("gravitation:crafting/bronzite_block"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, GraviItems.BRONZITE_INGOT.get())
                .define('X', GraviItems.BRONZITE_NUGGET.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_bronzite_nugget", has(GraviItems.BRONZITE_NUGGET.get()))
                .save(consumer, new ResourceLocation("gravitation:crafting/bronzite_ingot_from_nugget"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, GraviItems.BRONZITE_NUGGET.get(), 9)
                .requires(GraviItems.BRONZITE_INGOT.get())
                .unlockedBy("has_bronzite_ingot", has(GraviItems.BRONZITE_INGOT.get()))
                .save(consumer, new ResourceLocation("gravitation:crafting/bronzite_nugget_from_ingot"));

        ConditionalRecipe.builder().addCondition(new ModLoadedCondition("lost_aether_content")).addRecipe(b -> ShapedRecipeBuilder.shaped(RecipeCategory.MISC, GraviItems.BRONZITE_SHIELD.get())
                .define('X', GraviItems.BRONZITE_INGOT.get())
                .define('Y', Ingredient.of(AetherTags.Items.SKYROOT_STICKS))
                .pattern("XYX")
                .pattern("XXX")
                .pattern(" X ")
                .unlockedBy("has_bronzite_ingot", has(GraviItems.BRONZITE_INGOT.get())).save(b, "gravitation:compat/lost_aether_content/bronzite_shield"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, GraviItems.BRONZITE_SHIELD.get())
                .define('X', GraviItems.BRONZITE_INGOT.get())
                .define('Y', Ingredient.of(AetherTags.Items.SKYROOT_STICKS))
                .pattern("XYX")
                .pattern("XXX")
                .pattern(" X ")
                .unlockedBy("has_bronzite_ingot", has(GraviItems.BRONZITE_INGOT.get()))
                .save(consumer, new ResourceLocation("gravitation:crafting/bronzite_shield"));


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, GraviItems.BRONZITE_HELMET.get())
                .define('X', GraviItems.BRONZITE_INGOT.get())
                .pattern("XXX")
                .pattern("X X")
                .unlockedBy("has_bronzite_ingot", has(GraviItems.BRONZITE_INGOT.get()))
                .save(consumer, new ResourceLocation("gravitation:crafting/bronzite_helmet"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, GraviItems.BRONZITE_CHESTPLATE.get())
                .define('X', GraviItems.BRONZITE_INGOT.get())
                .pattern("X X")
                .pattern("XXX")
                .pattern("XXX")
                .unlockedBy("has_bronzite_ingot", has(GraviItems.BRONZITE_INGOT.get()))
                .save(consumer, new ResourceLocation("gravitation:crafting/bronzite_chestplate"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, GraviItems.BRONZITE_LEGGING.get())
                .define('X', GraviItems.BRONZITE_INGOT.get())
                .pattern("XXX")
                .pattern("X X")
                .pattern("X X")
                .unlockedBy("has_bronzite_ingot", has(GraviItems.BRONZITE_INGOT.get()))
                .save(consumer, new ResourceLocation("gravitation:crafting/bronzite_leggings"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, GraviItems.BRONZITE_BOOTS.get())
                .define('X', GraviItems.BRONZITE_INGOT.get())
                .pattern("X X")
                .pattern("X X")
                .unlockedBy("has_bronzite_ingot", has(GraviItems.BRONZITE_INGOT.get()))
                .save(consumer, new ResourceLocation("gravitation:crafting/bronzite_boots"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, GraviItems.BRONZITE_CAPE.get())
                .define('X', GraviItems.BRONZITE_INGOT.get())
                .pattern("XX")
                .pattern("XX")
                .pattern("XX")
                .unlockedBy("has_bronzite_ingot", has(GraviItems.BRONZITE_INGOT.get()))
                .save(consumer, new ResourceLocation("gravitation:crafting/bronzite_cape"));

        makePendant(GraviItems.BRONZITE_PENDANT, GraviItems.BRONZITE_INGOT.get()).save(consumer, new ResourceLocation("gravitation:crafting/bronzite_pendant"));

        makePickaxe(GraviItems.BRONZITE_PICKAXE, GraviItems.BRONZITE_INGOT).save(consumer, new ResourceLocation("gravitation:crafting/bronzite_pickaxe"));
        makeHoe(GraviItems.BRONZITE_HOE, GraviItems.BRONZITE_INGOT).save(consumer, new ResourceLocation("gravitation:crafting/bronzite_hoe"));
        makeSword(GraviItems.BRONZITE_SWORD, GraviItems.BRONZITE_INGOT).save(consumer, new ResourceLocation("gravitation:crafting/bronzite_sword"));
        makeAxe(GraviItems.BRONZITE_AXE, GraviItems.BRONZITE_INGOT).save(consumer, new ResourceLocation("gravitation:crafting/bronzite_axe"));
        makeRing(GraviItems.BRONZITE_RING, GraviItems.BRONZITE_INGOT.get()).save(consumer, new ResourceLocation("gravitation:crafting/bronzite_ring"));
        makeShovel(GraviItems.BRONZITE_Shovel, GraviItems.BRONZITE_INGOT).save(consumer, new ResourceLocation("gravitation:crafting/bronzite_shovel"));

        repairingRecipe(RecipeCategory.TOOLS, GraviItems.GRAVITITE_BATTLEAXE.get(), 1500).save(consumer, new ResourceLocation("gravitation:repairing/gravitite_battleaxe"));
        repairingRecipe(RecipeCategory.TOOLS, GraviItems.ZANITE_BATTLEAXE.get(), 750).save(consumer, new ResourceLocation("gravitation:repairing/zanite_battleaxe"));
        repairingRecipe(RecipeCategory.TOOLS, GraviItems.NETHERITE_BATTLEAXE.get(), 1500).save(consumer, new ResourceLocation("gravitation:repairing/netherite_battleaxe"));
        repairingRecipe(RecipeCategory.TOOLS, GraviItems.DIAMOND_BATTLEAXE.get(), 1500).save(consumer, new ResourceLocation("gravitation:repairing/diamond_battleaxe"));
        repairingRecipe(RecipeCategory.TOOLS, GraviItems.IRON_BATTLEAXE.get(), 750).save(consumer, new ResourceLocation("gravitation:repairing/iron_battleaxe"));
        repairingRecipe(RecipeCategory.TOOLS, GraviItems.GOLD_BATTLEAXE.get(), 500).save(consumer, new ResourceLocation("gravitation:repairing/gold_battleaxe"));
        repairingRecipe(RecipeCategory.TOOLS, GraviItems.BRONZITE_HELMET.get(), 500).save(consumer, new ResourceLocation("gravitation:repairing/bronzite_helmet"));
        repairingRecipe(RecipeCategory.TOOLS, GraviItems.BRONZITE_CHESTPLATE.get(), 500).save(consumer, new ResourceLocation("gravitation:repairing/bronzite_chestplate"));
        repairingRecipe(RecipeCategory.TOOLS, GraviItems.BRONZITE_GLOVES.get(), 500).save(consumer, new ResourceLocation("gravitation:repairing/bronzite_gloves"));
        repairingRecipe(RecipeCategory.TOOLS, GraviItems.BRONZITE_BOOTS.get(), 500).save(consumer, new ResourceLocation("gravitation:repairing/bronzite_boots"));
        repairingRecipe(RecipeCategory.TOOLS, GraviItems.BRONZITE_LEGGING.get(), 500).save(consumer, new ResourceLocation("gravitation:repairing/bronzite_leggings"));

        battleaxeRecipe(consumer, AetherBlocks.ENCHANTED_GRAVITITE.get(), AetherItems.SKYROOT_STICK.get(), GraviItems.GRAVITITE_BATTLEAXE.get());
        battleaxeRecipe(consumer, AetherItems.ZANITE_GEMSTONE.get(), AetherItems.SKYROOT_STICK.get(), GraviItems.ZANITE_BATTLEAXE.get());
        battleaxeRecipe(consumer, Items.DIAMOND, Items.STICK, GraviItems.DIAMOND_BATTLEAXE.get());
        battleaxeRecipe(consumer, Items.IRON_INGOT, Items.STICK, GraviItems.IRON_BATTLEAXE.get());
        battleaxeRecipe(consumer, Items.GOLD_INGOT, Items.STICK, GraviItems.GOLD_BATTLEAXE.get());
        battleaxeRecipe(consumer, GraviItems.BRONZITE_INGOT.get(), AetherItems.SKYROOT_STICK.get(), GraviItems.BRONZITE_BATTLEAXE.get());
        netheriteSmithing(consumer, GraviItems.DIAMOND_BATTLEAXE.get(), RecipeCategory.TOOLS, GraviItems.NETHERITE_BATTLEAXE.get());
        //conditionalBattleaxeRecipe("deep_aether", ForgeRegistries.ITEMS.getValue(new ResourceLocation("deep_aether:skyjade")), AetherItems.SKYROOT_STICK.get(), GraviItems.SKYJADE_BATTLEAXE.get());

        zaniteSmithing(consumer, GraviItems.BRONZITE_ROCK.get(), RecipeCategory.TOOLS, GraviItems.BRONZITE_INGOT.get());

        enchantingRecipe(RecipeCategory.MISC, GraviBlocks.ENCHANTED_SAPLING.get(), AetherBlocks.SKYROOT_SAPLING.get(), 0.20f, 50).save(consumer, new ResourceLocation("gravitation:enchanting/enchanted_sapling"));
        enchantingRecipe(RecipeCategory.MISC, GraviBlocks.ENCHANTED_MOSS.get(), Blocks.MOSS_BLOCK, 0.20f, 60).save(consumer, new ResourceLocation("gravitation:enchanting/enchanted_moss"));

        enchantingRecipe(RecipeCategory.MISC, GraviItems.DIG_STONE.get(), AetherBlocks.CARVED_STONE.get(), 0.20f, 20).save(consumer, new ResourceLocation("gravitation:enchanting/dig_stone"));
        enchantingRecipe(RecipeCategory.MISC, GraviItems.DENSE_STONE.get(), AetherBlocks.ANGELIC_STONE.get(), 0.20f, 30).save(consumer, new ResourceLocation("gravitation:enchanting/dense_stone"));
        enchantingRecipe(RecipeCategory.MISC, GraviItems.POWER_STONE.get(), AetherBlocks.HELLFIRE_STONE.get(), 0.20f, 40).save(consumer, new ResourceLocation("gravitation:enchanting/power_stone"));
        enchantingRecipe(RecipeCategory.MISC, GraviItems.GREATER_HEALING_STONE.get(), AetherItems.HEALING_STONE.get(), 0.20f, 120).save(consumer, new ResourceLocation("gravitation:enchanting/greater_healing_stone"));

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

    @SuppressWarnings("deprecation")
    protected static void zaniteSmithing(Consumer<FinishedRecipe> consumer, Item input, RecipeCategory p_248986_, Item p_250389_) {
        LegacyUpgradeRecipeBuilder.smithing(Ingredient.of(input), Ingredient.of(AetherItems.ZANITE_GEMSTONE.get()), RecipeCategory.TOOLS, p_250389_).unlocks(getHasName(input), has(input)).save(consumer, getItemName(p_250389_) + "_smithing");
        //SmithingTransformRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), Ingredient.of(input), Ingredient.of(AetherItems.ZANITE_GEMSTONE.get()), p_248986_, p_250389_).unlocks("has_netherite_ingot", has(Items.NETHERITE_INGOT)).save(consumer, getItemName(p_250389_) + "_smithing");
    }
}
