package net.mehdinoui.veggiesdelight.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;
import vectorwing.farmersdelight.common.registry.ModEffects;

import static vectorwing.farmersdelight.common.FoodValues.*;

public class ModFoods {

    public static final FoodProperties BELLPEPPER = new FoodProperties.Builder().
            nutrition(2).saturationMod(0.1F).build();
    public static final FoodProperties SMOKED_BELLPEPPER = new FoodProperties.Builder().
            nutrition(4).saturationMod(0.4f).fast().build();
    public static final FoodProperties CACCIATORE = new FoodProperties.Builder().
            nutrition(8).saturationMod(0.75f)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), BRIEF_DURATION, 0), 1.0F).build();
    public static final FoodProperties SHAKSHOUKA = new FoodProperties.Builder().
            nutrition(7).saturationMod(1.0f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), BRIEF_DURATION, 0), 1.0F).build();
    public static final FoodProperties STUFFED_BELLPEPPERS = new FoodProperties.Builder().
            nutrition(12).saturationMod(1.0f)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), MEDIUM_DURATION, 0), 1.0F).build();

    public static final FoodProperties CAULIFLOWER = new FoodProperties.Builder().
            nutrition(4).saturationMod(0.4F).build();
    public static final FoodProperties CAULIFLOWER_FLORET = new FoodProperties.Builder().
            nutrition(1).saturationMod(0.1f).fast().build();
    public static final FoodProperties FRIED_CAULIFLOWER_FLORET = new FoodProperties.Builder().
            nutrition(2).saturationMod(0.2f).fast().build();
    public static final FoodProperties CAULIFLOWER_PATTY = new FoodProperties.Builder().
            nutrition(3).saturationMod(0.2f).build();
    public static final FoodProperties COOKED_CAULIFLOWER_PATTY = new FoodProperties.Builder().
            nutrition(4).saturationMod(0.7f).build();
    public static final FoodProperties CAULIFLOWER_SOUP = new FoodProperties.Builder().
            nutrition(5).saturationMod(0.5f)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), BRIEF_DURATION, 0), 1.0F).build();

    public static final FoodProperties VEGAN_PIZZA_SLICE = new FoodProperties.Builder().
            nutrition(4).saturationMod(0.8f)
            .effect(()-> new MobEffectInstance(ModEffects.COMFORT.get(),BRIEF_DURATION,0),1.0f).build();

    public static final FoodProperties SWEET_POTATO = new FoodProperties.Builder().
            nutrition(2).saturationMod(0.1F).build();

}
