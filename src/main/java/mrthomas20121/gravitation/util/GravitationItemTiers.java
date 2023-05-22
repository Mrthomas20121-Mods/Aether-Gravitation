package mrthomas20121.gravitation.util;

import com.aetherteam.aether.AetherTags;
import mrthomas20121.gravitation.GraviTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public enum GravitationItemTiers implements Tier {
    NEPTUNE(3, 1561, 8.0f, 3.0f, 15, () -> Ingredient.of(AetherTags.Items.NEPTUNE_REPAIRING)),
    BRONZITE(2, 1500, 7.0f, 2.5f, 50, () -> Ingredient.of(GraviTags.Items.BRONZITE_REPAIRING));

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final Supplier<Ingredient> repairIngredient;
    private final TagKey<Block> tag;

    GravitationItemTiers(int harvestLevel, int uses, float speed, float damage, int enchantmentValue, Supplier<Ingredient> ingredientSupplier, TagKey<Block> tag) {
        this.level = harvestLevel;
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = ingredientSupplier;
        this.tag = tag;
    }
    GravitationItemTiers(int level, int uses, float speed, float damage, int enchantmentValue, Supplier<Ingredient> ingredientSupplier) {
        this(level, uses, speed, damage, enchantmentValue, ingredientSupplier, null);
    }

    public int getUses() {
        return this.uses;
    }

    public float getSpeed() {
        return this.speed;
    }

    public float getAttackDamageBonus() {
        return this.damage;
    }

    @SuppressWarnings("deprecation")
    public int getLevel() {
        return this.level;
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public @NotNull Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public @Nullable TagKey<Block> getTag() {
        return tag;
    }
}
