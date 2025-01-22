package mrthomas20121.gravitation.compat;

import com.aetherteam.aether.AetherTags;
import com.aetherteam.aether.item.AetherItems;
import com.aetherteam.treasure_reforging.item.ReforgingItems;
import mrthomas20121.gravitation.GraviTags;
import mrthomas20121.gravitation.item.GravitationItems;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.crafting.ConditionalRecipe;
import net.minecraftforge.common.crafting.conditions.ModLoadedCondition;

import java.util.function.Consumer;
import java.util.function.Function;

public class TreasureReforgingCompat implements IModCompat {

    public static TreasureReforgingCompat INSTANCE = new TreasureReforgingCompat();

    @Override
    public String getModID() {
        return "aether_treasure_reforging";
    }

    @Override
    public void addRecipes(Consumer<FinishedRecipe> consumer) {
        toolRecipe(consumer, "neptune_axe", GravitationItems.NEPTUNE_AXE.get(), AetherItems.ZANITE_AXE.get());

        toolRecipe(consumer, "neptune_battleaxe", GravitationItems.NEPTUNE_BATTLEAXE.get(), GravitationItems.ZANITE_BATTLEAXE.get());

        toolRecipe(consumer, "neptune_cutlass", GravitationItems.NEPTUNE_CUTLASS.get(), AetherItems.ZANITE_SWORD.get());

        toolRecipe(consumer, "neptune_hoe", GravitationItems.NEPTUNE_HOE.get(), AetherItems.ZANITE_HOE.get());

        toolRecipe(consumer, "neptune_pickaxe", GravitationItems.NEPTUNE_PICKAXE.get(), AetherItems.ZANITE_PICKAXE.get());

        toolRecipe(consumer, "neptune_shovel", GravitationItems.NEPTUNE_SHOVEL.get(), AetherItems.ZANITE_SHOVEL.get());
        toolRecipe(consumer, "neptune_ring", GravitationItems.NEPTUNE_RING.get(), AetherItems.ZANITE_RING.get());
        toolRecipe(consumer, "neptune_pendant", GravitationItems.NEPTUNE_PENDANT.get(), AetherItems.ZANITE_PENDANT.get());

        conditionalRecipe(consumer, c -> {
            SimpleCookingRecipeBuilder
                    .smelting(Ingredient.of(GraviTags.Items.NEPTUNE_TOOLS), RecipeCategory.TOOLS, ReforgingItems.NEPTUNE_MESH.get(), 0.35f, 200)
                    .unlockedBy("has_neptune_mesh", has(ReforgingItems.NEPTUNE_MESH.get()))
                    .save(c);
        }, "gravitation:compat/treasure_reforging/neptune_smelting");

        conditionalRecipe(consumer, c -> {
            SimpleCookingRecipeBuilder
                    .smelting(Ingredient.of(GravitationItems.NEPTUNE_RING.get()), RecipeCategory.TOOLS, ReforgingItems.NEPTUNE_MESH.get(), 0.35f, 200)
                    .unlockedBy("has_neptune_mesh", has(ReforgingItems.NEPTUNE_MESH.get()))
                    .save(c);
        }, "gravitation:compat/treasure_reforging/neptune_ring_smelting");

        conditionalRecipe(consumer, c -> {
            SimpleCookingRecipeBuilder
                    .smelting(Ingredient.of(GravitationItems.NEPTUNE_PENDANT.get()), RecipeCategory.TOOLS, ReforgingItems.NEPTUNE_MESH.get(), 0.35f, 200)
                    .unlockedBy("has_neptune_mesh", has(ReforgingItems.NEPTUNE_MESH.get()))
                    .save(c);
        }, "gravitation:compat/treasure_reforging/neptune_pendant_smelting");

    }



    private void toolRecipe(Consumer<FinishedRecipe> consumer, String name, Item item, Item item2) {
        ConditionalRecipe.builder().addCondition(new ModLoadedCondition(this.getModID())).addRecipe(c -> {
            SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ReforgingItems.NEPTUNE_UPGRADE_SMITHING_TEMPLATE.get()),
                        Ingredient.of(item2),
                        Ingredient.of(ReforgingItems.NEPTUNE_MESH.get()),
                        RecipeCategory.TOOLS, item)
                    .unlocks("has_neptune_mesh", has(ReforgingItems.NEPTUNE_MESH.get()))
                    .save(c, "gravitation:compat/treasure_reforging/"+ name);
        }).build(consumer, new ResourceLocation("gravitation:compat/treasure_reforging/"+ name));
    }
}
