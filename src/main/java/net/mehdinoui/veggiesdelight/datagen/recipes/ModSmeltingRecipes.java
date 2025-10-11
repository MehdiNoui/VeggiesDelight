package net.mehdinoui.veggiesdelight.datagen.recipes;

import net.mehdinoui.veggiesdelight.VeggiesDelight;
import net.mehdinoui.veggiesdelight.registry.ModItems;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import java.util.function.Consumer;

import static net.minecraft.advancements.critereon.InventoryChangeTrigger.TriggerInstance.hasItems;

public class ModSmeltingRecipes {
    // Helper method
    private static void cookingTriplet(
            Consumer<FinishedRecipe> consumer,
            Ingredient input,
            ItemLike result,
            float xp,
            int cookTime,
            String name,
            ItemLike unlockItem
    ) {
        SimpleCookingRecipeBuilder.smelting(input, RecipeCategory.FOOD, result, xp, cookTime)
                .unlockedBy("has_" + name, hasItems(unlockItem))
                .save(consumer, new ResourceLocation(VeggiesDelight.MOD_ID, name + "_from_smelting"));

        SimpleCookingRecipeBuilder.smoking(input, RecipeCategory.FOOD, result, xp, cookTime / 2)
                .unlockedBy("has_" + name, hasItems(unlockItem))
                .save(consumer, new ResourceLocation(VeggiesDelight.MOD_ID, name + "_from_smoking"));

        SimpleCookingRecipeBuilder.campfireCooking(input, RecipeCategory.FOOD, result, xp, cookTime * 3)
                .unlockedBy("has_" + name, hasItems(unlockItem))
                .save(consumer, new ResourceLocation(VeggiesDelight.MOD_ID, name + "_from_campfire_cooking"));
    }

    public static void register(Consumer<FinishedRecipe> consumer) {
        smokingRecipes(consumer);
        tripletRecipes(consumer);
    }

    public static void smokingRecipes(Consumer<FinishedRecipe> consumer) {
        SimpleCookingRecipeBuilder.smoking
                        (Ingredient.of(ModItems.BELLPEPPER.get()), RecipeCategory.FOOD,
                        ModItems.SMOKED_BELLPEPPER.get(), 0.35F, 200)
                .unlockedBy("has_bellpepper", hasItems(ModItems.BELLPEPPER.get()))
                .save(consumer,VeggiesDelight.MOD_ID + ":bellpepper_smoking");
    }
    public static void tripletRecipes(Consumer<FinishedRecipe> consumer) {
        cookingTriplet(consumer,
                Ingredient.of(ModItems.SWEET_POTATO.get()),
                ModItems.BAKED_SWEET_POTATO.get(),
                0.35F, 200,
                "baked_sweet_potato", ModItems.SWEET_POTATO.get());
        cookingTriplet(consumer,
                Ingredient.of(ModItems.SWEET_POTATO_DOUGH.get()),
                Items.BREAD,
                0.35F, 200,
                "bread", ModItems.SWEET_POTATO_DOUGH.get());
        cookingTriplet(consumer,
                Ingredient.of(ModItems.RAW_VEGETARIAN_PATTY.get()),
                ModItems.COOKED_VEGETARIAN_PATTY.get(),
                0.35F, 200,
                "cooked_vegetarian_patty", ModItems.RAW_VEGETARIAN_PATTY.get());
        cookingTriplet(consumer,
                Ingredient.of(ModItems.UNCOOKED_MHADJEB.get()),
                ModItems.MHADJEB.get(),
                0.35F, 200,
                "mhadjeb", ModItems.UNCOOKED_MHADJEB.get());
        cookingTriplet(consumer,
                Ingredient.of(ModItems.CAULIFLOWER_FLORET.get()),
                ModItems.ROASTED_CAULIFLOWER_FLORET.get(),
                0.35F, 150,
                "roasted_cauliflower_floret", ModItems.CAULIFLOWER_FLORET.get());
        cookingTriplet(consumer,
                Ingredient.of(ModItems.GARLIC_CLOVE.get()),
                ModItems.ROASTED_GARLIC_CLOVE.get(),
                0.35F, 100,
                "roasted_garlic_clove", ModItems.GARLIC_CLOVE.get());
        cookingTriplet(consumer,
                Ingredient.of(ModItems.ZUCCHINI.get()),
                ModItems.ROASTED_ZUCCHINI.get(),
                0.35F, 200,
                "roasted_zucchini", ModItems.ZUCCHINI.get());
    }
}
