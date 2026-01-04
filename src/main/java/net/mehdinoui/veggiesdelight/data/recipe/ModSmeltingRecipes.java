package net.mehdinoui.veggiesdelight.data.recipe;

import net.mehdinoui.veggiesdelight.VeggiesDelight;
import net.mehdinoui.veggiesdelight.common.registry.ModItems;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import static net.minecraft.advancements.critereon.InventoryChangeTrigger.TriggerInstance.hasItems;

public class ModSmeltingRecipes {
    // Helper method
    private static void cookingTriplet(
            RecipeOutput output,
            Ingredient input,
            ItemLike result,
            float xp,
            int cookTime,
            String name,
            ItemLike unlockItem
    ) {
        SimpleCookingRecipeBuilder.smelting(input, RecipeCategory.FOOD, result, xp, cookTime)
                .unlockedBy("has_" + name, hasItems(unlockItem))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID, name + "_from_smelting"));

        SimpleCookingRecipeBuilder.smoking(input, RecipeCategory.FOOD, result, xp, cookTime / 2)
                .unlockedBy("has_" + name, hasItems(unlockItem))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID, name + "_from_smoking"));

        SimpleCookingRecipeBuilder.campfireCooking(input, RecipeCategory.FOOD, result, xp, cookTime * 3)
                .unlockedBy("has_" + name, hasItems(unlockItem))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID, name + "_from_campfire_cooking"));
    }

    public static void register(RecipeOutput output) {
        smokingRecipes(output);
        tripletRecipes(output);
    }

    public static void smokingRecipes(RecipeOutput output) {
        SimpleCookingRecipeBuilder.smoking
                        (Ingredient.of(ModItems.BELLPEPPER.get()), RecipeCategory.FOOD,
                                ModItems.SMOKED_BELLPEPPER.get(), 0.35F, 200)
                .unlockedBy("has_bellpepper", hasItems(ModItems.BELLPEPPER.get()))
                .save(output,VeggiesDelight.MOD_ID + ":bellpepper_smoking");
    }
    public static void tripletRecipes(RecipeOutput output) {
        cookingTriplet(output,
                Ingredient.of(ModItems.SWEET_POTATO.get()),
                ModItems.BAKED_SWEET_POTATO.get(),
                0.35F, 200,
                "baked_sweet_potato", ModItems.SWEET_POTATO.get());
        cookingTriplet(output,
                Ingredient.of(ModItems.SWEET_POTATO_DOUGH.get()),
                Items.BREAD,
                0.35F, 200,
                "bread", ModItems.SWEET_POTATO_DOUGH.get());
        cookingTriplet(output,
                Ingredient.of(ModItems.RAW_VEGETARIAN_PATTY.get()),
                ModItems.COOKED_VEGETARIAN_PATTY.get(),
                0.35F, 200,
                "cooked_cauliflower_patty", ModItems.RAW_VEGETARIAN_PATTY.get());
        cookingTriplet(output,
                Ingredient.of(ModItems.UNCOOKED_MHADJEB.get()),
                ModItems.MHADJEB.get(),
                0.35F, 200,
                "mhadjeb", ModItems.UNCOOKED_MHADJEB.get());
        cookingTriplet(output,
                Ingredient.of(ModItems.CAULIFLOWER_FLORET.get()),
                ModItems.ROASTED_CAULIFLOWER_FLORET.get(),
                0.35F, 150,
                "roasted_cauliflower_floret", ModItems.CAULIFLOWER_FLORET.get());
        cookingTriplet(output,
                Ingredient.of(ModItems.GARLIC_CLOVE.get()),
                ModItems.ROASTED_GARLIC_CLOVE.get(),
                0.35F, 100,
                "roasted_garlic_clove", ModItems.GARLIC_CLOVE.get());
        cookingTriplet(output,
                Ingredient.of(ModItems.ZUCCHINI.get()),
                ModItems.ROASTED_ZUCCHINI.get(),
                0.35F, 200,
                "roasted_zucchini", ModItems.ZUCCHINI.get());
    }
}