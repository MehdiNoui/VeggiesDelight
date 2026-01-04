package net.mehdinoui.veggiesdelight.common.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import vectorwing.farmersdelight.common.registry.ModEffects;

import static vectorwing.farmersdelight.common.FoodValues.*;

public class ModFoods {

    // RAW CROPS
    public static final FoodProperties DANDELION_LEAF = new FoodProperties.Builder().
            nutrition(1).saturationModifier(0.1F).
            effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 100, 0), 1.0F)
            .fast().build();
    public static final FoodProperties BELLPEPPER = new FoodProperties.Builder().
            nutrition(2).saturationModifier(0.2F).build();
    public static final FoodProperties BROCCOLI = new FoodProperties.Builder().
            nutrition(2).saturationModifier(0.4f).build();
    public static final FoodProperties CAULIFLOWER = new FoodProperties.Builder().
            nutrition(4).saturationModifier(0.4f).build();
    public static final FoodProperties GARLIC_CLOVE = new FoodProperties.Builder().
            nutrition(1).saturationModifier(0.1f).fast().build();
    public static final FoodProperties SWEET_POTATO = new FoodProperties.Builder().
            nutrition(2).saturationModifier(0.4f).build();
    public static final FoodProperties TURNIP = new FoodProperties.Builder().
            nutrition(2).saturationModifier(0.4f).build();
    public static final FoodProperties ZUCCHINI = new FoodProperties.Builder().
            nutrition(3).saturationModifier(0.4f).build();


    // DRINKS
    public static final FoodProperties CARROT_JUICE = new FoodProperties.Builder().
            effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0), 1.0F)
            .alwaysEdible().build();
    public static final FoodProperties DANDELION_JUICE = new FoodProperties.Builder().
            effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 400, 0), 1.0F)
            .alwaysEdible().build();
    public static final FoodProperties TURNIP_WATER = new FoodProperties.Builder().
            effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 400, 0), 1.0F)
            .alwaysEdible().build();
    public static final FoodProperties FERMENTED_GARLIC_HONEY = new FoodProperties.Builder().
            nutrition(7).saturationModifier(0.7F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 100, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 100, 0), 1.0F)
            .alwaysEdible().build();


    // BASIC INGREDIENTS & COMPONENTS
    public static final FoodProperties SMOKED_BELLPEPPER = new FoodProperties.Builder().
            nutrition(4).saturationModifier(0.4f).build();
    public static final FoodProperties BAKED_SWEET_POTATO = new FoodProperties.Builder().
            nutrition(4).saturationModifier(0.5f).build();
    public static final FoodProperties CAULIFLOWER_FLORET = new FoodProperties.Builder().
            nutrition(1).saturationModifier(0.1f).fast().build();
    public static final FoodProperties ROASTED_CAULIFLOWER_FLORET = new FoodProperties.Builder().
            nutrition(2).saturationModifier(0.3f).fast().build();
    public static final FoodProperties ROASTED_GARLIC_CLOVE = new FoodProperties.Builder().
            nutrition(2).saturationModifier(0.2f).fast().build();
    public static final FoodProperties ZUCCHINI_SLICE = new FoodProperties.Builder().
            nutrition(2).saturationModifier(0.1f).build();
    public static final FoodProperties ROASTED_ZUCCHINI = new FoodProperties.Builder().
            nutrition(4).saturationModifier(0.4f).build();
    public static final FoodProperties POTATO_NOODLE = new FoodProperties.Builder().
            nutrition(4).saturationModifier(0.2f).build();
    public static final FoodProperties SWEET_POTATO_DOUGH = new FoodProperties.Builder().
            nutrition(3).saturationModifier(0.2F)
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 300, 0), 0.3F)
            .build();
    public static final FoodProperties RAW_VEGETARIAN_PATTY = new FoodProperties.Builder().
            nutrition(3).saturationModifier(0.3f).build();
    public static final FoodProperties COOKED_VEGETARIAN_PATTY = new FoodProperties.Builder().
            nutrition(6).saturationModifier(0.8f).build();


    // DESSERTS
    public static final FoodProperties BEETROOT_BROWNIE = new FoodProperties.Builder().
            nutrition(6).saturationModifier(0.5f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 0), 1.0F)
            .build();
    public static final FoodProperties CARROT_CAKE_SLICE = new FoodProperties.Builder().
            nutrition(3).saturationModifier(0.2f).build();
    public static final FoodProperties SWEET_POTATO_PIE_SLICE = new FoodProperties.Builder().
            nutrition(5).saturationModifier(0.3f).build();
    public static final FoodProperties SWEET_POTATO_CUPCAKE = new FoodProperties.Builder().
            nutrition(6).saturationModifier(0.5f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 0), 1.0F)
            .build();
    public static final FoodProperties SWEET_POTATO_PANCAKES = new FoodProperties.Builder().
            nutrition(12).saturationModifier(0.8f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 0), 1.0F)
            .effect(()-> new MobEffectInstance(ModEffects.COMFORT,MEDIUM_DURATION,0),1.0f)
            .build();


    // SALADS
    public static final FoodProperties BROCCOLI_SALAD = new FoodProperties.Builder().
            nutrition(6).saturationModifier(0.6f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE,100 , 0), 1.0F).build();
    public static final FoodProperties CESAR_SALAD = new FoodProperties.Builder().
            nutrition(10).saturationModifier(0.7f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 100, 0), 1.0F).build();
    public static final FoodProperties COLESLAW = new FoodProperties.Builder().
            nutrition(8).saturationModifier(0.6f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT, MEDIUM_DURATION, 0), 1.0F)
            .build();
    public static final FoodProperties TURNIP_SALAD = new FoodProperties.Builder().
            nutrition(6).saturationModifier(0.6f)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 100, 0), 1.0F)
            .build();


    // SNACKS & BAKED GOODS
    public static final FoodProperties CAULIFLOWER_BREAD = new FoodProperties.Builder().
            nutrition(6).saturationModifier(0.6f).build();
    public static final FoodProperties GARLIC_BREAD = new FoodProperties.Builder().
            nutrition(5).saturationModifier(0.4f).fast().build();
    public static final FoodProperties GARLIC_STUFFED_MUSHROOMS = new FoodProperties.Builder().
            nutrition(7).saturationModifier(0.6f).build();
    public static final FoodProperties TURNIP_MUTTON_SKEWER = new FoodProperties.Builder().
            nutrition(7).saturationModifier(0.7f).build();
    public static final FoodProperties CHICKEN_FAJITAS_WRAP = new FoodProperties.Builder().
            nutrition(10).saturationModifier(0.7f).build();
    public static final FoodProperties VEGETABLES_WRAP = new FoodProperties.Builder().
            nutrition(12).saturationModifier(0.8f).build();
    public static final FoodProperties VEGETARIAN_BURGER = new FoodProperties.Builder().
            nutrition(12).saturationModifier(0.8f).build();
    public static final FoodProperties ZUCCHINI_SANDWICH = new FoodProperties.Builder().
            nutrition(10).saturationModifier(0.7f).build();
    public static final FoodProperties UNCOOKED_MHADJEB = new FoodProperties.Builder().
            nutrition(6).saturationModifier(0.4F).build();
    public static final FoodProperties MHADJEB= new FoodProperties.Builder().
            nutrition(12).saturationModifier(0.8f).build();
    public static final FoodProperties VEGAN_PIZZA_SLICE = new FoodProperties.Builder().
            nutrition(5).saturationModifier(0.5f).build();
    public static final FoodProperties ZUCCHINI_QUICHE_SLICE = new FoodProperties.Builder().
            nutrition(6).saturationModifier(0.5f).build();
    public static final FoodProperties STUFFED_ZUCCHINI_BOAT = new FoodProperties.Builder().
            nutrition(10).saturationModifier(0.7f).build();


    // SOUPS & BOWLED MEALS
    public static final FoodProperties BROCCOLI_SOUP = new FoodProperties.Builder().
            nutrition(10).saturationModifier(0.7f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT, BRIEF_DURATION, 0), 1.0F).build();
    public static final FoodProperties CAULIFLOWER_SOUP = new FoodProperties.Builder().
            nutrition(10).saturationModifier(0.7f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT, BRIEF_DURATION, 0), 1.0F).build();
    public static final FoodProperties GARLIC_CHICKEN_STEW = new FoodProperties.Builder().
            nutrition(12).saturationModifier(0.8f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT, MEDIUM_DURATION, 0), 1.0F).build();
    public static final FoodProperties TURNIP_BEEF_STEW = new FoodProperties.Builder().
            nutrition(14).saturationModifier(0.75f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT, LONG_DURATION, 0), 1.0F).build();
    public static final FoodProperties CACCIATORE = new FoodProperties.Builder().
            nutrition(14).saturationModifier(0.75f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT, LONG_DURATION, 0), 1.0F).build();
    public static final FoodProperties MASHED_POTATOES = new FoodProperties.Builder().
            nutrition(10).saturationModifier(0.7f)
            .effect(()-> new MobEffectInstance(ModEffects.COMFORT, BRIEF_DURATION,0),1.0f).build();
    public static final FoodProperties POTATO_NOODLES = new FoodProperties.Builder().
            nutrition(12).saturationModifier(0.8f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 100, 0), 1.0F)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT, MEDIUM_DURATION,0), 1.0F).build();


    // PLATED MEALS
    public static final FoodProperties DANDELION_WITH_EGGS = new FoodProperties.Builder(). // Note: DANDELION_AND_EGGS in output.accept.
            nutrition(10).saturationModifier(0.6f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 100, 0), 1.0F)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT, BRIEF_DURATION, 0), 1.0F)
            .build();
    public static final FoodProperties CAULIFLOWER_KUKU = new FoodProperties.Builder().
            nutrition(12).saturationModifier(0.8f)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT, MEDIUM_DURATION, 0), 1.0F).build();
    public static final FoodProperties TURNIP_CAKE = new FoodProperties.Builder().
            nutrition(14).saturationModifier(0.75f)
            .effect(()-> new MobEffectInstance(ModEffects.NOURISHMENT, LONG_DURATION,0),1.0f)
            .build();
    public static final FoodProperties RICE_AND_VEGETABLES = new FoodProperties.Builder().
            nutrition(14).saturationModifier(0.75f)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT, LONG_DURATION, 0), 1.0F).build();
    public static final FoodProperties ROASTED_VEGETABLES = new FoodProperties.Builder().
            nutrition(12).saturationModifier(0.8f)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT, MEDIUM_DURATION, 0), 1.0F).build();
    public static final FoodProperties SHAKSHOUKA = new FoodProperties.Builder().
            nutrition(12).saturationModifier(0.8f)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT, MEDIUM_DURATION, 0), 1.0F).build();
    public static final FoodProperties PASTA_WITH_BROCCOLI = new FoodProperties.Builder().
            nutrition(12).saturationModifier(0.8f)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT, MEDIUM_DURATION, 0), 1.0F).build();
    public static final FoodProperties GARLIC_RICE_WITH_CAULIFLOWER = new FoodProperties.Builder().
            nutrition(14).saturationModifier(0.75f)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT, LONG_DURATION, 0), 1.0F).build();
    public static final FoodProperties STEAK_AND_BROCCOLI = new FoodProperties.Builder().
            nutrition(12).saturationModifier(0.8f)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT, MEDIUM_DURATION, 0), 1.0F).build();
    public static final FoodProperties FISH_AND_CHIPS = new FoodProperties.Builder().
            nutrition(10).saturationModifier(0.6f)
            .effect(()-> new MobEffectInstance(ModEffects.NOURISHMENT, BRIEF_DURATION,0),1.0f)
            .build();
    public static final FoodProperties GARLIC_BAKED_COD = new FoodProperties.Builder().
            nutrition(10).saturationModifier(0.6f)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT, LONG_DURATION, 0), 1.0F).build();
    public static final FoodProperties STUFFED_ZUCCHINIS = new FoodProperties.Builder().
            nutrition(14).saturationModifier(0.75f)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT, LONG_DURATION, 0), 1.0F)
            .build();

    // FEAST SLICES
    public static final FoodProperties LASAGNA_SLICE = new FoodProperties.Builder().
            nutrition(14).saturationModifier(0.75f)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT, MEDIUM_DURATION, 0), 1.0F).build();
    public static final FoodProperties STUFFED_BELLPEPPER = new FoodProperties.Builder().
            nutrition(8).saturationModifier(0.65f)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT, LONG_DURATION, 0), 1.0F).build();
}