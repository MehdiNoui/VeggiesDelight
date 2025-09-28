package net.mehdinoui.veggiesdelight.datagen.recipe;

import net.mehdinoui.veggiesdelight.VeggiesDelight;
import net.mehdinoui.veggiesdelight.registry.ModItems;
import net.mehdinoui.veggiesdelight.tag.VDCommonTags;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.Tags;
import vectorwing.farmersdelight.client.recipebook.CookingPotRecipeBookTab;
import vectorwing.farmersdelight.common.tag.CommonTags;
import vectorwing.farmersdelight.data.builder.CookingPotRecipeBuilder;

import java.util.function.Consumer;
import java.util.stream.Stream;

import static vectorwing.farmersdelight.data.recipe.CookingRecipes.SMALL_EXP;
import static vectorwing.farmersdelight.data.recipe.CookingRecipes.MEDIUM_EXP;
import static vectorwing.farmersdelight.data.recipe.CookingRecipes.LARGE_EXP;

import static vectorwing.farmersdelight.data.recipe.CookingRecipes.FAST_COOKING;
import static vectorwing.farmersdelight.data.recipe.CookingRecipes.NORMAL_COOKING;
import static vectorwing.farmersdelight.data.recipe.CookingRecipes.SLOW_COOKING;

public class ModCookingRecipes {
    public static void register(RecipeOutput output) {
        cookingMeals(output);
        cookMiscellaneous(output);
        cookDrinks(output);
    }
    private static void cookingMeals(RecipeOutput output) {
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.BROCCOLI_SOUP.get(), 1, NORMAL_COOKING, MEDIUM_EXP, Items.BOWL)
                .addIngredient(VDCommonTags.CROPS_BROCCOLI)
                .addIngredient(VDCommonTags.CROPS_BROCCOLI)
                .addIngredient(CommonTags.FOODS_MILK)
                .unlockedByItems("has_broccoli",ModItems.BROCCOLI.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(output,String.valueOf(ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID, "cooking/broccoli_soup")));

        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.CACCIATORE.get(), 1, NORMAL_COOKING, MEDIUM_EXP, Items.BOWL)
                .addIngredient(VDCommonTags.CROPS_BELLPEPPER)
                .addIngredient(CommonTags.FOODS_RAW_CHICKEN)
                .addIngredient(CommonTags.CROPS_TOMATO)
                .unlockedByItems("has_bellpepper",ModItems.BELLPEPPER.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(output,String.valueOf(ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID, "cooking/cacciatore")));

        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.CAULIFLOWER_KUKU.get(), 1, NORMAL_COOKING, MEDIUM_EXP, Items.BOWL)
                .addIngredient(ModItems.CAULIFLOWER.get())
                .addIngredient(CommonTags.CROPS_ONION)
                .addIngredient(VDCommonTags.CROPS_GARLIC)
                .addIngredient(CommonTags.FOODS_MILK)
                .unlockedByItems("has_cauliflower", ModItems.CAULIFLOWER.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(output,String.valueOf(ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID, "cooking/cauliflower_kuku")));

        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.CAULIFLOWER_SOUP.get(), 1, NORMAL_COOKING, MEDIUM_EXP, Items.BOWL)
                .addIngredient(VDCommonTags.CROPS_CAULIFLOWER)
                .addIngredient(VDCommonTags.CROPS_CAULIFLOWER)
                .addIngredient(CommonTags.FOODS_MILK)
                .unlockedByItems("has_cauliflower", ModItems.CAULIFLOWER.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(output,String.valueOf(ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID, "cooking/cauliflower_soup")));

        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.FISH_AND_CHIPS.get(), 1, NORMAL_COOKING, MEDIUM_EXP, Items.BOWL)
                .addIngredient(VDCommonTags.FOODS_POTATOES)
                .addIngredient(CommonTags.FOODS_SAFE_RAW_FISH)
                .addIngredient(Tags.Items.EGGS)
                .unlockedByAnyIngredient(Items.COD,Items.SALMON)
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(output,String.valueOf(ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID, "cooking/fish_and_chips")));

        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.GARLIC_CHICKEN_STEW.get(), 1, NORMAL_COOKING, MEDIUM_EXP, Items.BOWL)
                .addIngredient(VDCommonTags.CROPS_GARLIC)
                .addIngredient(CommonTags.FOODS_COOKED_CHICKEN)
                .addIngredient(CommonTags.FOODS_MILK)
                .unlockedByAnyIngredient(ModItems.GARLIC.get(),ModItems.GARLIC_CLOVE.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(output,String.valueOf(ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID, "cooking/garlic_chicken_stew")));

        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.MASHED_POTATOES.get(), 1, NORMAL_COOKING, MEDIUM_EXP, Items.BOWL)
                .addIngredient(VDCommonTags.CROPS_SWEET_POTATO)
                .addIngredient(VDCommonTags.FOODS_POTATOES)
                .addIngredient(CommonTags.FOODS_MILK)
                .unlockedByAnyIngredient(Items.POTATO,ModItems.SWEET_POTATO.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(output,String.valueOf(ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID, "cooking/mashed_potatoes")));

        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.PASTA_WITH_BROCCOLI.get(), 1, NORMAL_COOKING, MEDIUM_EXP, Items.BOWL)
                .addIngredient(VDCommonTags.CROPS_BROCCOLI)
                .addIngredient(CommonTags.FOODS_PASTA)
                .addIngredient(CommonTags.FOODS_MILK)
                .unlockedByItems("has_pasta",vectorwing.farmersdelight.common.registry.ModItems.RAW_PASTA.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(output,String.valueOf(ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID, "cooking/pasta_with_broccoli")));

        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.POTATO_NOODLES.get(), 1, NORMAL_COOKING, MEDIUM_EXP, Items.BOWL)
                .addIngredient(ModItems.POTATO_NOODLE.get())
                .addIngredient(ModItems.POTATO_NOODLE.get())
                .addIngredient(CommonTags.CROPS_ONION)
                .unlockedByItems("has_noodle",ModItems.POTATO_NOODLE.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(output,String.valueOf(ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID, "cooking/potato_noodles")));

        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.ROASTED_VEGETABLES.get(), 1, NORMAL_COOKING, MEDIUM_EXP, Items.BOWL)
                .addIngredient(Items.POTATO)
                .addIngredient(Items.CARROT)
                .addIngredient(CommonTags.CROPS_ONION)
                .addIngredient(CommonTags.CROPS_TOMATO)
                .addIngredient(Tags.Items.FOODS_VEGETABLE)
                .addIngredient(VDCommonTags.CROPS_BELLPEPPER)
                .unlockedByAnyIngredient(
                        Items.POTATO,Items.CARROT,
                        ModItems.BELLPEPPER.get(),
                        vectorwing.farmersdelight.common.registry.ModItems.TOMATO.get(),
                        vectorwing.farmersdelight.common.registry.ModItems.ONION.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(output,String.valueOf(ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID, "cooking/roasted_veggies")));

        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.SHAKSHOUKA.get(), 1, NORMAL_COOKING, MEDIUM_EXP, Items.BOWL)
                .addIngredient(VDCommonTags.CROPS_BELLPEPPER)
                .addIngredient(CommonTags.CROPS_ONION)
                .addIngredient(CommonTags.CROPS_TOMATO)
                .addIngredient(Tags.Items.EGGS)
                .unlockedByItems("has_bellpepper",ModItems.BELLPEPPER.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(output,String.valueOf(ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID, "cooking/shakshouka")));

        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.STUFFED_BELLPEPPERS.get(), 1, NORMAL_COOKING, MEDIUM_EXP, Items.BOWL)
                .addIngredient(ModItems.BELLPEPPER.get())
                .addIngredient(ModItems.BELLPEPPER.get())
                .addIngredient(ModItems.BELLPEPPER.get())
                .addIngredient(CommonTags.CROPS_TOMATO)
                .addIngredient(Ingredient.fromValues(Stream.of(
                        new Ingredient.TagValue(CommonTags.FOODS_RAW_BEEF),
                        new Ingredient.TagValue(CommonTags.FOODS_RAW_CHICKEN),
                        new Ingredient.TagValue(CommonTags.FOODS_RAW_MUTTON)
                )))
                .unlockedByItems("has_bellpepper",ModItems.BELLPEPPER.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(output,String.valueOf(ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID, "cooking/stuffed_bellpeppers")));

        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.STUFFED_ZUCCHINIS.get(), 1, NORMAL_COOKING, MEDIUM_EXP, Items.BOWL)
                .addIngredient(ModItems.ZUCCHINI.get())
                .addIngredient(ModItems.ZUCCHINI.get())
                .addIngredient(CommonTags.CROPS_TOMATO)
                .addIngredient(Ingredient.fromValues(Stream.of(
                        new Ingredient.TagValue(CommonTags.FOODS_RAW_BEEF),
                        new Ingredient.TagValue(CommonTags.FOODS_RAW_CHICKEN),
                        new Ingredient.TagValue(CommonTags.FOODS_RAW_MUTTON)
                )))
                .unlockedByItems("has_zucchini",ModItems.ZUCCHINI.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(output,String.valueOf(ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID, "cooking/stuffed_zucchinis")));

        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.TURNIP_BEEF_STEW.get(), 1, NORMAL_COOKING, MEDIUM_EXP, Items.BOWL)
                .addIngredient(VDCommonTags.CROPS_TURNIP)
                .addIngredient(Items.CARROT)
                .addIngredient(CommonTags.FOODS_RAW_BEEF)
                .unlockedByItems("has_turnip",ModItems.TURNIP.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(output,String.valueOf(ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID, "cooking/turnip_beef_stew")));

        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.TURNIP_CAKE.get(), 1, NORMAL_COOKING, MEDIUM_EXP, Items.BOWL)
                .addIngredient(VDCommonTags.CROPS_TURNIP)
                .addIngredient(CommonTags.CROPS_GRAIN)
                .addIngredient(CommonTags.CROPS_RICE)
                .addIngredient(Ingredient.fromValues(Stream.of(
                        new Ingredient.TagValue(CommonTags.FOODS_RAW_BACON),
                        new Ingredient.TagValue(CommonTags.FOODS_RAW_BEEF),
                        new Ingredient.TagValue(CommonTags.FOODS_RAW_CHICKEN),
                        new Ingredient.TagValue(CommonTags.FOODS_SAFE_RAW_FISH),
                        new Ingredient.TagValue(CommonTags.FOODS_RAW_MUTTON),
                        new Ingredient.TagValue(CommonTags.FOODS_RAW_PORK)
                )))
                .unlockedByItems("has_turnip",ModItems.TURNIP.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(output,String.valueOf(ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID, "cooking/turnip_cake")));

    }
    private static void cookMiscellaneous(RecipeOutput output) {
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.GARLIC_STUFFED_MUSHROOMS.get(), 1, NORMAL_COOKING, MEDIUM_EXP)
                .addIngredient(VDCommonTags.CROPS_GARLIC)
                .addIngredient(CommonTags.CROPS_CABBAGE)
                .addIngredient(Items.BROWN_MUSHROOM)
                .addIngredient(Items.BROWN_MUSHROOM)
                .unlockedByItems("has_garlic",ModItems.GARLIC.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MISC)
                .build(output,String.valueOf(ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID, "cooking/garlic_stuffed_mushrooms")));

        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.POTATO_NOODLE.get(), 3, FAST_COOKING, SMALL_EXP)
                .addIngredient(VDCommonTags.FOODS_POTATOES)
                .addIngredient(VDCommonTags.FOODS_POTATOES)
                .addIngredient(VDCommonTags.FOODS_POTATOES)
                .unlockedByAnyIngredient(Items.POTATO,ModItems.SWEET_POTATO.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MISC)
                .build(output,String.valueOf(ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID, "cooking/potato_noodle")));

        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.SWEET_POTATO_PANCAKES.get(), 1, NORMAL_COOKING, MEDIUM_EXP, Items.BOWL)
                .addIngredient(ModItems.SWEET_POTATO_DOUGH.get())
                .addIngredient(Items.HONEY_BOTTLE)
                .addIngredient(CommonTags.FOODS_MILK)
                .unlockedByItems("has_sweet_dough",ModItems.SWEET_POTATO_PANCAKES.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MISC)
                .build(output,String.valueOf(ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID, "cooking/sweet_potato_pancakes")));
    }
    private static void cookDrinks(RecipeOutput output) {
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.CARROT_JUICE.get(), 1, NORMAL_COOKING, MEDIUM_EXP, Items.GLASS_BOTTLE)
                .addIngredient(Items.CARROT)
                .addIngredient(Items.CARROT)
                .addIngredient(Items.SUGAR)
                .unlockedByItems("has_carrot",Items.CARROT)
                .setRecipeBookTab(CookingPotRecipeBookTab.DRINKS)
                .build(output, String.valueOf(ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID, "cooking/carrot_juice")));

        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.DANDELION_JUICE.get(), 1, NORMAL_COOKING, MEDIUM_EXP, Items.GLASS_BOTTLE)
                .addIngredient(ModItems.DANDELION_LEAF.get())
                .addIngredient(ModItems.DANDELION_LEAF.get())
                .addIngredient(Items.SUGAR_CANE)
                .unlockedByItems("has_dandelion",ModItems.DANDELION_LEAF.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.DRINKS)
                .build(output,String.valueOf(ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID, "cooking/dandelion_juice")));

        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.TURNIP_WATER.get(), 1, NORMAL_COOKING, MEDIUM_EXP, Items.GLASS_BOTTLE)
                .addIngredient(VDCommonTags.CROPS_TURNIP)
                .addIngredient(VDCommonTags.CROPS_TURNIP)
                .addIngredient(Items.SUGAR)
                .unlockedByItems("has_turnip",ModItems.TURNIP.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.DRINKS)
                .build(output,String.valueOf(ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID, "cooking/turnip_water")));
    }
}