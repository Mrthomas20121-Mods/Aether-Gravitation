package mrthomas20121.gravitation.data;

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
        stickFromPlanks(consumer, AetherItems.SKYROOT_STICK.get(), GraviBlocks.ENCHANTED_PLANKS.get());
        woodenBoat(consumer, GraviItems.ENCHANTED_BOAT.get(), GraviBlocks.ENCHANTED_PLANKS.get());
        chestBoat(consumer, GraviItems.ENCHANTED_CHEST_BOAT.get(), GraviBlocks.ENCHANTED_PLANKS.get());
        signBuilder(GraviBlocks.ENCHANTED_SIGN.get(), Ingredient.of(GraviBlocks.ENCHANTED_PLANKS.get()), AetherItems.SKYROOT_STICK.get()).group("sign").unlockedBy("has_enchanted_planks", has(GraviBlocks.ENCHANTED_PLANKS.get())).save(consumer);
    }

    protected static void stickFromPlanks(Consumer<FinishedRecipe> consumer, ItemLike output, ItemLike input) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, output, 4).requires(input).group("planks").unlockedBy("has_enchanted_planks", has(input)).save(consumer);
    }

    protected static RecipeBuilder signBuilder(ItemLike p_176727_, Ingredient p_176728_, ItemLike stick) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, p_176727_, 3).group("sign").define('#', p_176728_).define('X', stick).pattern("###").pattern("###").pattern(" X ");
    }
}
