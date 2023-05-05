package mrthomas20121.gravitation.data;

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
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class GraviRecipes extends AetherRecipeProvider {

    public GraviRecipes(PackOutput output) {
        super(output, "gravitation");
    }

    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> consumer) {

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, GraviBlocks.ENCHANTED_BOOKSHELF.get(), 1)
                .define('P', GraviBlocks.ENCHANTED_PLANKS.get())
                .define('B', Items.BOOK)
                .pattern("PPP")
                .pattern("BBB")
                .pattern("PPP")
                .unlockedBy(getHasName(Items.BOOK), has(Items.BOOK))
                .save(consumer);

        doorBuilder(GraviBlocks.ENCHANTED_DOOR.get(), Ingredient.of(GraviBlocks.ENCHANTED_PLANKS.get())).group("door").unlockedBy("has_enchanted_planks", has(GraviBlocks.ENCHANTED_PLANKS.get())).save(consumer);
        trapdoorBuilder(GraviBlocks.ENCHANTED_TRAPDOOR.get(), Ingredient.of(GraviBlocks.ENCHANTED_PLANKS.get())).group("trapdoor").unlockedBy("has_enchanted_planks", has(GraviBlocks.ENCHANTED_PLANKS.get())).save(consumer);
        fence(GraviBlocks.ENCHANTED_FENCE, GraviBlocks.ENCHANTED_PLANKS).save(consumer);
        fenceGate(GraviBlocks.ENCHANTED_FENCE_GATE, GraviBlocks.ENCHANTED_PLANKS).save(consumer);
        buttonBuilder(GraviBlocks.ENCHANTED_BUTTON.get(), Ingredient.of(GraviBlocks.ENCHANTED_PLANKS.get())).group("wooden").unlockedBy("has_enchanted_planks", has(GraviBlocks.ENCHANTED_PLANKS.get())).save(consumer, new ResourceLocation("gravitation:enchanted_button"));
        stairs(GraviBlocks.ENCHANTED_STAIRS, GraviBlocks.ENCHANTED_PLANKS).group("stairs").save(consumer, new ResourceLocation("gravitation:enchanted_stairs_from_planks"));
        slab(consumer, RecipeCategory.BUILDING_BLOCKS, GraviBlocks.ENCHANTED_SLAB.get(), GraviBlocks.ENCHANTED_PLANKS.get());
        woodFromLogs(consumer, GraviBlocks.STRIPPED_ENCHANTED_WOOD.get(), GraviBlocks.STRIPPED_ENCHANTED_LOG.get());
        woodFromLogs(consumer, GraviBlocks.ENCHANTED_WOOD.get(), GraviBlocks.ENCHANTED_LOG.get());
        planksFromLogs(consumer, GraviBlocks.ENCHANTED_PLANKS.get(), GraviTags.ItemTags.ENCHANTED_LOGS, 4);
        stickFromPlanks(consumer, new ResourceLocation("gravitation:skyroot_stick_from_enchanted_planks"), AetherItems.SKYROOT_STICK.get(), GraviBlocks.ENCHANTED_PLANKS.get());
        woodenBoat(consumer, GraviItems.ENCHANTED_BOAT.get(), GraviBlocks.ENCHANTED_PLANKS.get());
        chestBoat(consumer, GraviItems.ENCHANTED_CHEST_BOAT.get(), GraviBlocks.ENCHANTED_PLANKS.get());
        signBuilder(GraviBlocks.ENCHANTED_SIGN.get(), Ingredient.of(GraviBlocks.ENCHANTED_PLANKS.get()), AetherItems.SKYROOT_STICK.get()).group("sign").unlockedBy("has_enchanted_planks", has(GraviBlocks.ENCHANTED_PLANKS.get())).save(consumer);

        repairingRecipe(RecipeCategory.TOOLS, GraviItems.GRAVITITE_BATTLEAXE.get(), 1500).save(consumer, new ResourceLocation("gravitation:gravitite_battleaxe_repair"));
        repairingRecipe(RecipeCategory.TOOLS, GraviItems.ZANITE_BATTLEAXE.get(), 750).save(consumer, new ResourceLocation("gravitation:zanite_battleaxe_repair"));

        battleaxeRecipe(consumer, AetherBlocks.ENCHANTED_GRAVITITE.get(), AetherItems.SKYROOT_STICK.get(), GraviItems.GRAVITITE_BATTLEAXE.get());
        battleaxeRecipe(consumer, AetherItems.ZANITE_GEMSTONE.get(), AetherItems.SKYROOT_STICK.get(), GraviItems.ZANITE_BATTLEAXE.get());
        battleaxeRecipe(consumer, Items.DIAMOND, Items.STICK, GraviItems.DIAMOND_BATTLEAXE.get());
        battleaxeRecipe(consumer, Items.IRON_INGOT, Items.STICK, GraviItems.IRON_BATTLEAXE.get());
        battleaxeRecipe(consumer, Items.GOLD_INGOT, Items.STICK, GraviItems.GOLD_BATTLEAXE.get());
        netheriteSmithing(consumer, GraviItems.DIAMOND_BATTLEAXE.get(), RecipeCategory.TOOLS, GraviItems.NETHERITE_BATTLEAXE.get());
    }

    protected static void stickFromPlanks(Consumer<FinishedRecipe> consumer, ResourceLocation name, ItemLike output, ItemLike input) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, output, 2).requires(input).group("planks").unlockedBy("has_enchanted_planks", has(input)).save(consumer, name);
    }

    protected static RecipeBuilder signBuilder(ItemLike p_176727_, Ingredient p_176728_, ItemLike stick) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, p_176727_, 3).group("sign").define('#', p_176728_).define('X', stick).pattern("###").pattern("###").pattern(" X ");
    }

    protected static void battleaxeRecipe(Consumer<FinishedRecipe> consumer, ItemLike material, Item stick, Item output) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, output).group("battleaxe").define('#', material).define('X', stick).pattern("###").pattern("#X#").pattern(" X ").unlockedBy("has", has(material)).save(consumer);
    }
}
