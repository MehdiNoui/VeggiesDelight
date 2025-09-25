package net.mehdinoui.veggiesdelight.datagen.recipes;
import net.mehdinoui.veggiesdelight.registry.ModItems;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import vectorwing.farmersdelight.client.recipebook.CookingPotRecipeBookTab;
import vectorwing.farmersdelight.common.tag.ForgeTags;
import vectorwing.farmersdelight.data.builder.CookingPotRecipeBuilder;

import java.util.function.Consumer;

import static vectorwing.farmersdelight.data.recipe.CookingRecipes.SMALL_EXP;
import static vectorwing.farmersdelight.data.recipe.CookingRecipes.MEDIUM_EXP;
import static vectorwing.farmersdelight.data.recipe.CookingRecipes.LARGE_EXP;

import static vectorwing.farmersdelight.data.recipe.CookingRecipes.FAST_COOKING;
import static vectorwing.farmersdelight.data.recipe.CookingRecipes.NORMAL_COOKING;
import static vectorwing.farmersdelight.data.recipe.CookingRecipes.SLOW_COOKING;

public class ModCookingRecipes {
    public static void register(Consumer<FinishedRecipe> consumer) {
        cookMiscellaneous(consumer);
        cookMinecraftSoups(consumer);
        cookMeals(consumer);
    }
    private static void cookMiscellaneous(Consumer<FinishedRecipe> consumer) {
    }
    private static void cookMinecraftSoups(Consumer<FinishedRecipe> consumer) {
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.BROCCOLI_SOUP.get(), 1, NORMAL_COOKING, MEDIUM_EXP, Items.BOWL)
                .addIngredient(ModItems.BROCCOLI.get())
                .addIngredient(ModItems.BROCCOLI.get())
                .addIngredient(ForgeTags.VEGETABLES)
                .addIngredient(ForgeTags.MILK)
                .unlockedByItems("has_broccoli",ModItems.BROCCOLI.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(consumer,new ResourceLocation("veggiesdelight", "cooking/broccoli_soup"));
    }
    private static void cookMeals(Consumer<FinishedRecipe> consumer) {
    }
}
