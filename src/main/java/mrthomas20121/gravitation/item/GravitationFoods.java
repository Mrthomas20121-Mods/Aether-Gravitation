package mrthomas20121.gravitation.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class GravitationFoods {

    public static final FoodProperties GREATER_HEALING_STONE = new FoodProperties.Builder().alwaysEat().nutrition(0).effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 610, 1), 1.0F).build();

    public static final FoodProperties DENSE_STONE = new FoodProperties.Builder().alwaysEat().nutrition(0).effect(() -> new MobEffectInstance(MobEffects.SLOW_FALLING, 610, 0), 1.0F).build();

    public static final FoodProperties POWER_STONE = new FoodProperties.Builder().alwaysEat().nutrition(0).effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 610, 0), 1.0F).build();

    public static final FoodProperties DIG_STONE = new FoodProperties.Builder().alwaysEat().nutrition(0).effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 610, 0), 1.0F).build();

    public static final FoodProperties RAINBOW_STONE = new FoodProperties.Builder().alwaysEat().nutrition(0).effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 610, 0), 1.0F).effect(() -> new MobEffectInstance(MobEffects.SLOW_FALLING, 610, 0), 1.0F).effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 610, 0), 1.0F).build();


}
