package mrthomas20121.gravitation.compat;

import net.minecraft.advancements.critereon.ContextAwarePredicate;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.advancements.critereon.MinMaxBounds;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.ConditionalRecipe;
import net.minecraftforge.common.crafting.conditions.ModLoadedCondition;

import java.util.function.Consumer;

public interface IModCompat {

    String getModID();

    void addRecipes(Consumer<FinishedRecipe> consumer);

    default void conditionalRecipe(Consumer<FinishedRecipe> defaultConsumer, Consumer<Consumer<FinishedRecipe>> consumer, String id) {
        ConditionalRecipe.builder().addCondition(new ModLoadedCondition(this.getModID())).addRecipe(consumer).build(defaultConsumer, new ResourceLocation(id));
    }

    default InventoryChangeTrigger.TriggerInstance has(ItemLike p_125978_) {
        return inventoryTrigger(ItemPredicate.Builder.item().of(p_125978_).build());
    }

    default InventoryChangeTrigger.TriggerInstance inventoryTrigger(ItemPredicate... p_126012_) {
        return new InventoryChangeTrigger.TriggerInstance(ContextAwarePredicate.ANY, MinMaxBounds.Ints.ANY, MinMaxBounds.Ints.ANY, MinMaxBounds.Ints.ANY, p_126012_);
    }
}
