package net.mehdinoui.veggiesdelight.datagen.recipes;

import net.mehdinoui.veggiesdelight.VeggiesDelight;
import net.mehdinoui.veggiesdelight.registry.ModBlocks;
import net.mehdinoui.veggiesdelight.registry.ModItems;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import vectorwing.farmersdelight.common.tag.ForgeTags;
import vectorwing.farmersdelight.data.builder.CuttingBoardRecipeBuilder;

import java.util.function.Consumer;

public class ModCuttingRecipes {
    public static void register(Consumer<FinishedRecipe> consumer) {
        // Flowers
        CuttingBoardRecipeBuilder.cuttingRecipe(
                        Ingredient.of(ModBlocks.MATURE_DANDELION.get()),
                        Ingredient.of(ForgeTags.TOOLS_KNIVES), ModItems.DANDELION_LEAF.get(),3)
                .addResult(Items.YELLOW_DYE,2)
                .build(consumer,new ResourceLocation(VeggiesDelight.MOD_ID, "cutting/mature_dandelion"));
        CuttingBoardRecipeBuilder.cuttingRecipe(
                        Ingredient.of(ModBlocks.WILD_BELLPEPPERS.get()),
                        Ingredient.of(ForgeTags.TOOLS_KNIVES), ModItems.BELLPEPPER_SEEDS.get(),1)
                .addResultWithChance(Items.GREEN_DYE,0.5f,1)
                .build(consumer,new ResourceLocation(VeggiesDelight.MOD_ID, "cutting/wild_bellpeppers"));
        CuttingBoardRecipeBuilder.cuttingRecipe(
                        Ingredient.of(ModBlocks.WILD_BROCCOLI.get()),
                        Ingredient.of(ForgeTags.TOOLS_KNIVES), ModItems.BROCCOLI_SEEDS.get(),1)
                .addResultWithChance(Items.GREEN_DYE,0.5f,1)
                .build(consumer,new ResourceLocation(VeggiesDelight.MOD_ID, "cutting/wild_broccoli"));
        CuttingBoardRecipeBuilder.cuttingRecipe(
                        Ingredient.of(ModBlocks.WILD_CAULIFLOWERS.get()),
                        Ingredient.of(ForgeTags.TOOLS_KNIVES), ModItems.CAULIFLOWER_SEEDS.get(),1)
                .addResultWithChance(Items.LIME_DYE,0.5f,1)
                .build(consumer,new ResourceLocation(VeggiesDelight.MOD_ID, "cutting/wild_cauliflower"));
        CuttingBoardRecipeBuilder.cuttingRecipe(
                        Ingredient.of(ModBlocks.WILD_GARLIC.get()),
                        Ingredient.of(ForgeTags.TOOLS_KNIVES), ModItems.GARLIC_CLOVE.get(),1)
                .addResult(Items.WHITE_DYE)
                .build(consumer,new ResourceLocation(VeggiesDelight.MOD_ID, "cutting/wild_garlic"));
        CuttingBoardRecipeBuilder.cuttingRecipe(
                        Ingredient.of(ModBlocks.WILD_SWEET_POTATOES.get()),
                        Ingredient.of(ForgeTags.TOOLS_KNIVES), ModItems.SWEET_POTATO.get(),1)
                .addResultWithChance(Items.MAGENTA_DYE,0.5f,1)
                .build(consumer,new ResourceLocation(VeggiesDelight.MOD_ID, "cutting/wild_sweet_potatoes"));
        CuttingBoardRecipeBuilder.cuttingRecipe(
                        Ingredient.of(ModBlocks.WILD_TURNIPS.get()),
                        Ingredient.of(ForgeTags.TOOLS_KNIVES), ModItems.TURNIP_SEEDS.get(),1)
                .addResultWithChance(Items.MAGENTA_DYE,0.5f,1)
                .build(consumer,new ResourceLocation(VeggiesDelight.MOD_ID, "cutting/wild_turnip"));
        CuttingBoardRecipeBuilder.cuttingRecipe(
                        Ingredient.of(ModBlocks.WILD_ZUCCHINIS.get()),
                        Ingredient.of(ForgeTags.TOOLS_KNIVES), ModItems.ZUCCHINI_SEEDS.get(),1)
                .addResult(Items.YELLOW_DYE,1)
                .addResultWithChance(ModItems.ZUCCHINI.get(),0.2f,1)
                .build(consumer,new ResourceLocation(VeggiesDelight.MOD_ID, "cutting/wild_zucchini"));

        // Slices
        CuttingBoardRecipeBuilder.cuttingRecipe(
                        Ingredient.of(ModItems.BEETROOT_BROWNIE_TRAY.get()),
                        Ingredient.of(ForgeTags.TOOLS_KNIVES), ModItems.BEETROOT_BROWNIE.get(),4)
                .build(consumer,new ResourceLocation(VeggiesDelight.MOD_ID, "cutting/beetroot_brownie"));
        CuttingBoardRecipeBuilder.cuttingRecipe(
                        Ingredient.of(ModItems.CARROT_CAKE.get()),
                        Ingredient.of(ForgeTags.TOOLS_KNIVES), ModItems.CARROT_CAKE_SLICE.get(),7)
                .build(consumer,new ResourceLocation(VeggiesDelight.MOD_ID, "cutting/carrot_cake_slice"));
        CuttingBoardRecipeBuilder.cuttingRecipe(
                        Ingredient.of(ModItems.SWEET_POTATO_PIE.get()),
                        Ingredient.of(ForgeTags.TOOLS_KNIVES), ModItems.SWEET_POTATO_PIE_SLICE.get(),4)
                .build(consumer,new ResourceLocation(VeggiesDelight.MOD_ID, "cutting/sweet_potato_pie_slice"));
        CuttingBoardRecipeBuilder.cuttingRecipe(
                        Ingredient.of(ModItems.VEGAN_PIZZA.get()),
                        Ingredient.of(ForgeTags.TOOLS_KNIVES), ModItems.VEGAN_PIZZA_SLICE.get(),4)
                .build(consumer,new ResourceLocation(VeggiesDelight.MOD_ID, "cutting/vegan_pizza_slice"));
        // Vegetables
        CuttingBoardRecipeBuilder.cuttingRecipe(
                        Ingredient.of(ModItems.CAULIFLOWER.get()),
                        Ingredient.of(ForgeTags.TOOLS_KNIVES), ModItems.CAULIFLOWER_FLORET.get(),2)
                .addResult(ModItems.CAULIFLOWER_SEEDS.get())
                .build(consumer,new ResourceLocation(VeggiesDelight.MOD_ID, "cutting/cauliflower_floret_from_cutting"));
        CuttingBoardRecipeBuilder.cuttingRecipe(
                        Ingredient.of(ModItems.GARLIC.get()),
                        Ingredient.of(ForgeTags.TOOLS_KNIVES), ModItems.GARLIC_CLOVE.get(),3)
                .build(consumer,new ResourceLocation(VeggiesDelight.MOD_ID, "cutting/garlic_clove_from_cutting"));
        CuttingBoardRecipeBuilder.cuttingRecipe(
                        Ingredient.of(ModItems.ZUCCHINI.get()),
                        Ingredient.of(ForgeTags.TOOLS_KNIVES), ModItems.ZUCCHINI_SLICE.get(),2)
                .build(consumer,new ResourceLocation(VeggiesDelight.MOD_ID, "cutting/zucchini_slice"));
    }
}
