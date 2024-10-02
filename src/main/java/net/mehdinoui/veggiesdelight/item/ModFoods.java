package net.mehdinoui.veggiesdelight.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import vectorwing.farmersdelight.common.registry.ModEffects;

import static vectorwing.farmersdelight.common.FoodValues.*;

public class ModFoods {


    //bell_pepper
    public static final FoodProperties BELLPEPPER = new FoodProperties.Builder().
            nutrition(2).saturationMod(0.1F).build();
    public static final FoodProperties SMOKED_BELLPEPPER = new FoodProperties.Builder().
            nutrition(4).saturationMod(0.4f).fast().build();
    public static final FoodProperties CACCIATORE = new FoodProperties.Builder().
            nutrition(10).saturationMod(0.9f)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), BRIEF_DURATION, 0), 1.0F).build();
    public static final FoodProperties SHAKSHOUKA = new FoodProperties.Builder().
            nutrition(10).saturationMod(0.8f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), MEDIUM_DURATION, 0), 1.0F).build();
    public static final FoodProperties STUFFED_BELLPEPPERS = new FoodProperties.Builder().
            nutrition(16).saturationMod(0.8f)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), MEDIUM_DURATION, 0), 1.0F).build();
    public static final FoodProperties UNCOOKED_MHADJEB = new FoodProperties.Builder().
            nutrition(4).saturationMod(0.2F).build();
    public static final FoodProperties MHADJEB= new FoodProperties.Builder().
            nutrition(8).saturationMod(0.5f).fast().build();
    public static final FoodProperties VEGAN_PIZZA_SLICE = new FoodProperties.Builder().
            nutrition(4).saturationMod(0.7f).build();

    //cauliflower
    public static final FoodProperties CAULIFLOWER = new FoodProperties.Builder().
            nutrition(4).saturationMod(0.4f).build();
    public static final FoodProperties CAULIFLOWER_FLORET = new FoodProperties.Builder().
            nutrition(1).saturationMod(0.1f).fast().build();
    public static final FoodProperties FRIED_CAULIFLOWER_FLORET = new FoodProperties.Builder().
            nutrition(2).saturationMod(0.2f).fast().build();
    public static final FoodProperties CAULIFLOWER_PATTY = new FoodProperties.Builder().
            nutrition(3).saturationMod(0.2f).build();
    public static final FoodProperties COOKED_CAULIFLOWER_PATTY = new FoodProperties.Builder().
            nutrition(4).saturationMod(0.6f).build();
    public static final FoodProperties CAULIFLOWER_SOUP = new FoodProperties.Builder().
            nutrition(7).saturationMod(0.7f).fast()
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), BRIEF_DURATION, 0), 1.0F).build();
    public static final FoodProperties CAULIFLOWER_BURGER = new FoodProperties.Builder().
            nutrition(9).saturationMod(0.6f)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), BRIEF_DURATION, 0), 1.0F).build();

    //sweet poatoes
    public static final FoodProperties SWEET_POTATO = new FoodProperties.Builder().
            nutrition(2).saturationMod(0.1f).build();
    public static final FoodProperties BAKED_SWEET_POTATO = new FoodProperties.Builder().
            nutrition(4).saturationMod(0.4f).build();
    public static final FoodProperties MASHED_POTATOES = new FoodProperties.Builder().
            nutrition(7).saturationMod(0.6f)
            .effect(()-> new MobEffectInstance(ModEffects.COMFORT.get(),BRIEF_DURATION,0),1.0f).build();
    public static final FoodProperties SWEET_POTATO_PIE_SLICE = new FoodProperties.Builder().
            nutrition(5).saturationMod(0.4f).build();
    public static final FoodProperties POTATO_NOODLE = new FoodProperties.Builder().
            nutrition(4).saturationMod(0.2f).build();
    public static final FoodProperties POTATO_NOODLES = new FoodProperties.Builder().
            nutrition(12).saturationMod(0.8f).fast()
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, BRIEF_DURATION, 0), 1.0F).build();
    //garlic
    public static final FoodProperties GARLIC_CLOVE = new FoodProperties.Builder().
            nutrition(1).saturationMod(0.1f).fast().build();
    public static final FoodProperties ROASTED_GARLIC_CLOVE = new FoodProperties.Builder().
            nutrition(2).saturationMod(0.2f).fast().build();
    public static final FoodProperties GARLIC_BREAD = new FoodProperties.Builder().
            nutrition(5).saturationMod(0.4f).fast().build();
    public static final FoodProperties GARLIC_CHICKEN_STEW = new FoodProperties.Builder().
            nutrition(10).saturationMod(0.7f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, BRIEF_DURATION, 0), 1.0F).build();
    public static final FoodProperties GARLIC_BAKED_COD = new FoodProperties.Builder().
            nutrition(10).saturationMod(0.8f)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), MEDIUM_DURATION, 0), 1.0F).build();
    public static final FoodProperties GARLIC_RICE_WITH_CAULIFLOWER = new FoodProperties.Builder().
            nutrition(12).saturationMod(0.9f)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), MEDIUM_DURATION, 0), 1.0F).build();
    public static final FoodProperties CESAR_SALAD = new FoodProperties.Builder().
            nutrition(10).saturationMod(0.7f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, MEDIUM_DURATION, 0), 1.0F).build();
    public static final FoodProperties FERMENTED_GARLIC_HONEY = new FoodProperties.Builder().
            nutrition(6).saturationMod(0.6f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 400, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 200, 0), 1.0F)
            .build();

    //misc
    public static final FoodProperties CARROT_JUICE = new FoodProperties.Builder().
            nutrition(6).saturationMod(0.6f)
            .effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0), 1.0F).build();
    public static final FoodProperties BEETROOT_BROWNIE = new FoodProperties.Builder().
            nutrition(6).saturationMod(0.5f).alwaysEat()
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, BRIEF_DURATION, 0), 1.0F).build();

}
