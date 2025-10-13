package net.mehdinoui.veggiesdelight.datagen.recipes;
import net.mehdinoui.veggiesdelight.registry.ModItems;
import net.mehdinoui.veggiesdelight.tag.VDForgeTags;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;
import vectorwing.farmersdelight.client.recipebook.CookingPotRecipeBookTab;
import vectorwing.farmersdelight.common.tag.ForgeTags;
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
    public static void register(Consumer<FinishedRecipe> consumer) {
        cookingMeals(consumer);
        cookMiscellaneous(consumer);
        cookDrinks(consumer);
    }
    private static void cookingMeals(Consumer<FinishedRecipe> consumer) {
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.BROCCOLI_SOUP.get(), 1, NORMAL_COOKING, MEDIUM_EXP, Items.BOWL)
                .addIngredient(VDForgeTags.CROPS_BROCCOLI)
                .addIngredient(VDForgeTags.CROPS_BROCCOLI)
                .addIngredient(ForgeTags.MILK)
                .unlockedByItems("has_broccoli",ModItems.BROCCOLI.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(consumer,new ResourceLocation("veggiesdelight", "cooking/broccoli_soup"));

        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.CACCIATORE.get(), 1, NORMAL_COOKING, MEDIUM_EXP, Items.BOWL)
                .addIngredient(VDForgeTags.CROPS_BELLPEPPER)
                .addIngredient(ForgeTags.RAW_CHICKEN)
                .addIngredient(ForgeTags.CROPS_TOMATO)
                .unlockedByItems("has_bellpepper",ModItems.BELLPEPPER.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(consumer,new ResourceLocation("veggiesdelight", "cooking/cacciatore"));

        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.CAULIFLOWER_KUKU.get(), 1, NORMAL_COOKING, MEDIUM_EXP, Items.BOWL)
                .addIngredient(ModItems.CAULIFLOWER.get())
                .addIngredient(ForgeTags.CROPS_ONION)
                .addIngredient(VDForgeTags.CROPS_GARLIC)
                .addIngredient(ForgeTags.MILK)
                .unlockedByItems("has_cauliflower", ModItems.CAULIFLOWER.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(consumer,new ResourceLocation("veggiesdelight", "cooking/cauliflower_kuku"));

        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.CAULIFLOWER_SOUP.get(), 1, NORMAL_COOKING, MEDIUM_EXP, Items.BOWL)
                .addIngredient(VDForgeTags.CROPS_CAULIFLOWER)
                .addIngredient(VDForgeTags.CROPS_CAULIFLOWER)
                .addIngredient(ForgeTags.MILK)
                .unlockedByItems("has_cauliflower", ModItems.CAULIFLOWER.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(consumer,new ResourceLocation("veggiesdelight", "cooking/cauliflower_soup"));

        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.FISH_AND_CHIPS.get(), 1, NORMAL_COOKING, MEDIUM_EXP, Items.BOWL)
                .addIngredient(ForgeTags.RAW_FISHES)
                .addIngredient(ForgeTags.VEGETABLES_POTATO)
                .addIngredient(ForgeTags.EGGS)
                .unlockedByAnyIngredient(Items.COD,Items.SALMON)
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(consumer,new ResourceLocation("veggiesdelight", "cooking/fish_and_chips"));

        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.GARLIC_CHICKEN_STEW.get(), 1, NORMAL_COOKING, MEDIUM_EXP, Items.BOWL)
                .addIngredient(VDForgeTags.CROPS_GARLIC)
                .addIngredient(ForgeTags.COOKED_CHICKEN)
                .addIngredient(ForgeTags.MILK)
                .unlockedByAnyIngredient(ModItems.GARLIC.get(),ModItems.GARLIC_CLOVE.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(consumer,new ResourceLocation("veggiesdelight", "cooking/garlic_chicken_stew"));

        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.MASHED_POTATOES.get(), 1, NORMAL_COOKING, MEDIUM_EXP, Items.BOWL)
                .addIngredient(VDForgeTags.CROPS_SWEET_POTATO)
                .addIngredient(ForgeTags.VEGETABLES_POTATO)
                .addIngredient(ForgeTags.MILK)
                .unlockedByAnyIngredient(Items.POTATO,ModItems.SWEET_POTATO.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(consumer,new ResourceLocation("veggiesdelight", "cooking/mashed_potatoes"));

        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.LASAGNA_PAN.get(), 1, SLOW_COOKING, LARGE_EXP, Items.BOWL)
                .addIngredient(ForgeTags.DOUGH)
                .addIngredient(ForgeTags.DOUGH)
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.TOMATO_SAUCE.get())
                .addIngredient(ForgeTags.MILK)
                .addIngredient(Ingredient.fromValues(Stream.of(
                        new Ingredient.TagValue(ForgeTags.RAW_BACON),
                        new Ingredient.TagValue(ForgeTags.RAW_BEEF),
                        new Ingredient.TagValue(ForgeTags.RAW_CHICKEN),
                        new Ingredient.TagValue(ForgeTags.RAW_MUTTON),
                        new Ingredient.TagValue(ForgeTags.RAW_PORK)
                )))
                .addIngredient(Ingredient.fromValues(Stream.of(
                        new Ingredient.TagValue(VDForgeTags.CROPS_BELLPEPPER),
                        new Ingredient.TagValue(Tags.Items.CROPS_CARROT),
                        new Ingredient.TagValue(ForgeTags.CROPS_ONION),
                        new Ingredient.TagValue(VDForgeTags.CROPS_ZUCCHINI)
                )))
                .unlockedByItems("has_sauce",vectorwing.farmersdelight.common.registry.ModItems.TOMATO_SAUCE.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(consumer,new ResourceLocation("veggiesdelight", "cooking/lasagna_pan"));


        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.PASTA_WITH_BROCCOLI.get(), 1, NORMAL_COOKING, MEDIUM_EXP, Items.BOWL)
                .addIngredient(VDForgeTags.CROPS_BROCCOLI)
                .addIngredient(ForgeTags.PASTA)
                .addIngredient(ForgeTags.MILK)
                .unlockedByItems("has_pasta",vectorwing.farmersdelight.common.registry.ModItems.RAW_PASTA.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(consumer,new ResourceLocation("veggiesdelight", "cooking/pasta_with_broccoli"));

        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.POTATO_NOODLES.get(), 1, NORMAL_COOKING, MEDIUM_EXP, Items.BOWL)
                .addIngredient(ModItems.POTATO_NOODLE.get())
                .addIngredient(ModItems.POTATO_NOODLE.get())
                .addIngredient(Ingredient.fromValues(Stream.of(
                                new Ingredient.TagValue(VDForgeTags.CROPS_GARLIC),
                                new Ingredient.TagValue(ForgeTags.CROPS_ONION)
                        )))
                .unlockedByItems("has_noodle",ModItems.POTATO_NOODLE.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(consumer,new ResourceLocation("veggiesdelight", "cooking/potato_noodles"));

        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.RICE_AND_VEGETABLES.get(), 1, NORMAL_COOKING, MEDIUM_EXP, Items.BOWL)
                .addIngredient(ForgeTags.GRAIN_RICE)
                .addIngredient(Tags.Items.CROPS_CARROT)
                .addIngredient(ForgeTags.CROPS_ONION)
                .addIngredient(VDForgeTags.CROPS_ZUCCHINI)
                .addIngredient(ForgeTags.VEGETABLES)
                .unlockedByItems("has_rice",vectorwing.farmersdelight.common.registry.ModItems.RICE.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(consumer,new ResourceLocation("veggiesdelight", "cooking/rice_and_vegetables"));

        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.ROASTED_VEGETABLES.get(), 1, NORMAL_COOKING, MEDIUM_EXP, Items.BOWL)
                .addIngredient(ForgeTags.VEGETABLES_POTATO)
                .addIngredient(Items.CARROT)
                .addIngredient(ForgeTags.CROPS_ONION)
                .addIngredient(ForgeTags.CROPS_TOMATO)
                .addIngredient(ForgeTags.VEGETABLES)
                .addIngredient(VDForgeTags.CROPS_BELLPEPPER)
                .unlockedByAnyIngredient(
                        Items.POTATO,Items.CARROT,
                        ModItems.BELLPEPPER.get(),
                        vectorwing.farmersdelight.common.registry.ModItems.TOMATO.get(),
                        vectorwing.farmersdelight.common.registry.ModItems.ONION.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(consumer,new ResourceLocation("veggiesdelight", "cooking/roasted_veggies"));

        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.SHAKSHOUKA.get(), 1, NORMAL_COOKING, MEDIUM_EXP, Items.BOWL)
                .addIngredient(VDForgeTags.CROPS_BELLPEPPER)
                .addIngredient(ForgeTags.CROPS_ONION)
                .addIngredient(ForgeTags.CROPS_TOMATO)
                .addIngredient(ForgeTags.EGGS)
                .unlockedByItems("has_bellpepper",ModItems.BELLPEPPER.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(consumer,new ResourceLocation("veggiesdelight", "cooking/shakshouka"));

        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.STUFFED_BELLPEPPERS_BLOCK.get(), 1, NORMAL_COOKING, MEDIUM_EXP, Items.BOWL)
                .addIngredient(ModItems.BELLPEPPER.get())
                .addIngredient(ModItems.BELLPEPPER.get())
                .addIngredient(ModItems.BELLPEPPER.get())
                .addIngredient(ForgeTags.CROPS_TOMATO)
                .addIngredient(Ingredient.fromValues(Stream.of(
                        new Ingredient.TagValue(ForgeTags.RAW_BEEF),
                        new Ingredient.TagValue(ForgeTags.RAW_CHICKEN),
                        new Ingredient.TagValue(ForgeTags.RAW_MUTTON)
                        )))
                .unlockedByItems("has_bellpepper",ModItems.BELLPEPPER.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(consumer,new ResourceLocation("veggiesdelight", "cooking/stuffed_bellpeppers"));

        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.STUFFED_ZUCCHINIS.get(), 1, NORMAL_COOKING, MEDIUM_EXP, Items.BOWL)
                .addIngredient(ModItems.ZUCCHINI.get())
                .addIngredient(ModItems.ZUCCHINI.get())
                .addIngredient(ForgeTags.CROPS_TOMATO)
                .addIngredient(Ingredient.fromValues(Stream.of(
                        new Ingredient.TagValue(ForgeTags.RAW_BEEF),
                        new Ingredient.TagValue(ForgeTags.RAW_CHICKEN),
                        new Ingredient.TagValue(ForgeTags.RAW_MUTTON)
                )))
                .unlockedByItems("has_zucchini",ModItems.ZUCCHINI.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(consumer,new ResourceLocation("veggiesdelight", "cooking/stuffed_zucchinis"));

        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.TURNIP_BEEF_STEW.get(), 1, NORMAL_COOKING, MEDIUM_EXP, Items.BOWL)
                .addIngredient(VDForgeTags.CROPS_TURNIP)
                .addIngredient(Items.CARROT)
                .addIngredient(ForgeTags.RAW_BEEF)
                .unlockedByItems("has_turnip",ModItems.TURNIP.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(consumer,new ResourceLocation("veggiesdelight", "cooking/turnip_beef_stew"));

        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.TURNIP_CAKE.get(), 1, NORMAL_COOKING, MEDIUM_EXP, Items.BOWL)
                .addIngredient(VDForgeTags.CROPS_TURNIP)
                .addIngredient(ForgeTags.GRAIN)
                .addIngredient(ForgeTags.GRAIN_RICE)
                .addIngredient(Ingredient.fromValues(Stream.of(
                        new Ingredient.TagValue(ForgeTags.RAW_BACON),
                        new Ingredient.TagValue(ForgeTags.RAW_BEEF),
                        new Ingredient.TagValue(ForgeTags.RAW_CHICKEN),
                        new Ingredient.TagValue(ForgeTags.RAW_FISHES),
                        new Ingredient.TagValue(ForgeTags.RAW_MUTTON),
                        new Ingredient.TagValue(ForgeTags.RAW_PORK)
                )))
                .unlockedByItems("has_turnip",ModItems.TURNIP.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(consumer,new ResourceLocation("veggiesdelight", "cooking/turnip_cake"));

    }
    private static void cookMiscellaneous(Consumer<FinishedRecipe> consumer) {
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.GARLIC_STUFFED_MUSHROOMS.get(), 1, NORMAL_COOKING, MEDIUM_EXP)
                .addIngredient(VDForgeTags.CROPS_GARLIC)
                .addIngredient(ForgeTags.CROPS_CABBAGE)
                .addIngredient(Items.BROWN_MUSHROOM)
                .addIngredient(Items.BROWN_MUSHROOM)
                .unlockedByItems("has_garlic",ModItems.GARLIC.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MISC)
                .build(consumer,new ResourceLocation("veggiesdelight", "cooking/garlic_stuffed_mushrooms"));

        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.POTATO_NOODLE.get(), 3, FAST_COOKING, SMALL_EXP)
                .addIngredient(ForgeTags.VEGETABLES_POTATO)
                .addIngredient(ForgeTags.VEGETABLES_POTATO)
                .addIngredient(ForgeTags.VEGETABLES_POTATO)
                .unlockedByAnyIngredient(Items.POTATO,ModItems.SWEET_POTATO.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MISC)
                .build(consumer,new ResourceLocation("veggiesdelight", "cooking/potato_noodle"));

        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.SWEET_POTATO_PANCAKES.get(), 1, NORMAL_COOKING, MEDIUM_EXP, Items.BOWL)
                .addIngredient(ModItems.SWEET_POTATO_DOUGH.get())
                .addIngredient(Items.HONEY_BOTTLE)
                .addIngredient(ForgeTags.MILK)
                .unlockedByItems("has_sweet_dough",ModItems.SWEET_POTATO_DOUGH.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MISC)
                .build(consumer,new ResourceLocation("veggiesdelight", "cooking/sweet_potato_pancakes"));
    }
    private static void cookDrinks(Consumer<FinishedRecipe> consumer) {
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.CARROT_JUICE.get(), 1, NORMAL_COOKING, MEDIUM_EXP, Items.GLASS_BOTTLE)
                .addIngredient(Items.CARROT)
                .addIngredient(Items.CARROT)
                .addIngredient(Items.SUGAR)
                .unlockedByItems("has_carrot",Items.CARROT)
                .setRecipeBookTab(CookingPotRecipeBookTab.DRINKS)
                .build(consumer,new ResourceLocation("veggiesdelight", "cooking/carrot_juice"));

        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.DANDELION_JUICE.get(), 1, NORMAL_COOKING, MEDIUM_EXP, Items.GLASS_BOTTLE)
                .addIngredient(ModItems.DANDELION_LEAF.get())
                .addIngredient(ModItems.DANDELION_LEAF.get())
                .addIngredient(Items.SUGAR_CANE)
                .unlockedByItems("has_dandelion",ModItems.DANDELION_LEAF.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.DRINKS)
                .build(consumer,new ResourceLocation("veggiesdelight", "cooking/dandelion_juice"));

        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.TURNIP_WATER.get(), 1, NORMAL_COOKING, MEDIUM_EXP, Items.GLASS_BOTTLE)
                .addIngredient(VDForgeTags.CROPS_TURNIP)
                .addIngredient(VDForgeTags.CROPS_TURNIP)
                .addIngredient(Items.SUGAR)
                .unlockedByItems("has_turnip",ModItems.TURNIP.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.DRINKS)
                .build(consumer,new ResourceLocation("veggiesdelight", "cooking/turnip_water"));

    }
}
