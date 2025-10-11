package net.mehdinoui.veggiesdelight.datagen.recipes;

import net.mehdinoui.veggiesdelight.VeggiesDelight;
import net.mehdinoui.veggiesdelight.registry.ModBlocks;
import net.mehdinoui.veggiesdelight.registry.ModItems;
import net.mehdinoui.veggiesdelight.tag.VDForgeTags;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;
import vectorwing.farmersdelight.common.tag.ForgeTags;

import java.util.function.Consumer;
import java.util.stream.Stream;

import static net.minecraft.advancements.critereon.InventoryChangeTrigger.TriggerInstance.hasItems;

public class ModBasicRecipes {
    public static void register(Consumer<FinishedRecipe> consumer) {
        shapefulRecipes(consumer);
        shapelessRecipes(consumer);;
    }
    public static void shapefulRecipes(Consumer<FinishedRecipe> consumer){
        // Crates
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BELLPEPPER_CRATE.get(), 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.BELLPEPPER.get())
                .unlockedBy("has_bellpepper", hasItems(ModItems.BELLPEPPER.get()))
                .save(consumer, new ResourceLocation(VeggiesDelight.MOD_ID,"bellpepper_crate"));
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROCCOLI_CRATE.get(), 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.BROCCOLI.get())
                .unlockedBy("has_broccoli", hasItems(ModItems.BROCCOLI.get()))
                .save(consumer, new ResourceLocation(VeggiesDelight.MOD_ID,"broccoli_crate"));
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CAULIFLOWER_CRATE.get(), 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.CAULIFLOWER.get())
                .unlockedBy("has_cauliflower", hasItems(ModItems.CAULIFLOWER.get()))
                .save(consumer, new ResourceLocation(VeggiesDelight.MOD_ID,"cauliflower_crate"));
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GARLIC_CRATE.get(), 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.GARLIC.get())
                .unlockedBy("has_garlic", hasItems(ModItems.GARLIC.get()))
                .save(consumer, new ResourceLocation(VeggiesDelight.MOD_ID,"garlic_crate"));
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SWEET_POTATO_CRATE.get(), 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.SWEET_POTATO.get())
                .unlockedBy("has_sweet_potato", hasItems(ModItems.SWEET_POTATO.get()))
                .save(consumer, new ResourceLocation(VeggiesDelight.MOD_ID,"sweet_potato_crate"));
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TURNIP_CRATE.get(), 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.TURNIP.get())
                .unlockedBy("has_turnip", hasItems(ModItems.TURNIP.get()))
                .save(consumer, new ResourceLocation(VeggiesDelight.MOD_ID,"turnip_crate"));
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ZUCCHINI_CRATE.get(), 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.ZUCCHINI.get())
                .unlockedBy("has_zucchini", hasItems(ModItems.ZUCCHINI.get()))
                .save(consumer, new ResourceLocation(VeggiesDelight.MOD_ID,"zucchini_crate"));
        // Pies and stuff
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.SWEET_POTATO_PIE.get(), 1)
                .pattern("aaa")
                .pattern("xOx")
                .define('a', ModItems.BAKED_SWEET_POTATO.get())
                .define('x', Items.SUGAR)
                .define('O', vectorwing.farmersdelight.common.registry.ModItems.PIE_CRUST.get())
                .unlockedBy("has_pie_crust", hasItems(vectorwing.farmersdelight.common.registry.ModItems.PIE_CRUST.get()))
                .save(consumer, new ResourceLocation(VeggiesDelight.MOD_ID,"sweet_potato_pie"));
        // Pies from slices
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.BEETROOT_BROWNIE_TRAY.get(), 1)
                .pattern("##")
                .pattern("##")
                .define('#', ModItems.BEETROOT_BROWNIE.get())
                .unlockedBy("has_slice", hasItems( ModItems.BEETROOT_BROWNIE.get()))
                .save(consumer, new ResourceLocation(VeggiesDelight.MOD_ID,"beetroot_brownie_from_slices"));
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.SWEET_POTATO_PIE.get(), 1)
                .pattern("##")
                .pattern("##")
                .define('#', ModItems.SWEET_POTATO_PIE_SLICE.get())
                .unlockedBy("has_slice", hasItems( ModItems.SWEET_POTATO_PIE_SLICE.get()))
                .save(consumer, new ResourceLocation(VeggiesDelight.MOD_ID,"sweet_potato_pie_from_slices"));
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.VEGAN_PIZZA.get(), 1)
                .pattern("abc")
                .pattern("xOx")
                .define('a', VDForgeTags.CROPS_BELLPEPPER)
                .define('b', ForgeTags.VEGETABLES)
                .define('c', ForgeTags.CROPS_ONION)
                .define('x', ForgeTags.DOUGH)
                .define('O', vectorwing.farmersdelight.common.registry.ModItems.TOMATO_SAUCE.get())
                .unlockedBy("has_sauce", hasItems(vectorwing.farmersdelight.common.registry.ModItems.TOMATO_SAUCE.get()))
                .save(consumer, new ResourceLocation(VeggiesDelight.MOD_ID,"vegan_pizza"));
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.VEGAN_PIZZA.get(), 1)
                .pattern("##")
                .pattern("##")
                .define('#', ModItems.VEGAN_PIZZA_SLICE.get())
                .unlockedBy("has_slice", hasItems( ModItems.VEGAN_PIZZA_SLICE.get()))
                .save(consumer, new ResourceLocation(VeggiesDelight.MOD_ID,"vegan_pizza_from_slices"));
    }
    public static void shapelessRecipes(Consumer<FinishedRecipe> consumer){
        // Bowled Food Recipes
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.BROCCOLI_SALAD.get(),1)
                .requires(VDForgeTags.CROPS_BROCCOLI)
                .requires(ForgeTags.CROPS_TOMATO)
                .requires(ForgeTags.CROPS_ONION)
                .requires(Items.BOWL)
                .unlockedBy("has_bowl", hasItems(Items.BOWL))
                .save(consumer, new ResourceLocation(VeggiesDelight.MOD_ID,"broccoli_salad"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.CESAR_SALAD.get(),1)
                .requires(ForgeTags.CROPS_CABBAGE)
                .requires(ForgeTags.BREAD)
                .requires(VDForgeTags.CROPS_GARLIC)
                .requires(Items.BOWL)
                .requires(ForgeTags.CROPS_TOMATO)
                .unlockedBy("has_bowl", hasItems(Items.BOWL))
                .save(consumer, new ResourceLocation(VeggiesDelight.MOD_ID,"cesar_salad"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.DANDELION_AND_EGGS.get(),1)
                .requires(ModItems.DANDELION_LEAF.get())
                .requires(ModItems.DANDELION_LEAF.get())
                .requires(ForgeTags.COOKED_EGGS)
                .requires(Items.BOWL)
                .requires(ForgeTags.COOKED_EGGS)
                .requires(ForgeTags.COOKED_EGGS)
                .unlockedBy("has_dandelion", hasItems(ModItems.DANDELION_LEAF.get()))
                .save(consumer, new ResourceLocation(VeggiesDelight.MOD_ID,"dandelion_and_eggs"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.GARLIC_BAKED_COD.get(),1)
                .requires(ForgeTags.COOKED_FISHES_COD)
                .requires(ModItems.ROASTED_GARLIC_CLOVE.get())
                .requires(ModItems.ROASTED_GARLIC_CLOVE.get())
                .requires(Items.BOWL)
                .requires(ForgeTags.CROPS_ONION)
                .unlockedBy("has_fish", hasItems(Items.COD))
                .save(consumer, new ResourceLocation(VeggiesDelight.MOD_ID,"garlic_baked_cod"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.GARLIC_RICE_WITH_CAULIFLOWER.get(),1)
                .requires(ModItems.ROASTED_GARLIC_CLOVE.get())
                .requires(ModItems.ROASTED_CAULIFLOWER_FLORET.get())
                .requires(ModItems.ROASTED_CAULIFLOWER_FLORET.get())
                .requires(Items.BOWL)
                .requires(vectorwing.farmersdelight.common.registry.ModItems.COOKED_RICE.get())
                .unlockedBy("has_rice", hasItems(vectorwing.farmersdelight.common.registry.ModItems.COOKED_RICE.get()))
                .save(consumer, new ResourceLocation(VeggiesDelight.MOD_ID,"garlic_rice_with_cauliflower"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.TURNIP_SALAD.get(),1)
                .requires(ForgeTags.SALAD_INGREDIENTS)
                .requires(VDForgeTags.CROPS_TURNIP)
                .requires(Items.BOWL)
                .unlockedBy("has_bowl", hasItems(Items.BOWL))
                .save(consumer, new ResourceLocation(VeggiesDelight.MOD_ID,"turnip_salad"));


        // Food Recipes
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.CAULIFLOWER_BREAD.get(),1)
                .requires(VDForgeTags.CROPS_CAULIFLOWER)
                .requires(VDForgeTags.CROPS_CAULIFLOWER)
                .requires(ForgeTags.GRAIN_WHEAT)
                .unlockedBy("has_wheat", hasItems(Items.WHEAT))
                .save(consumer, new ResourceLocation(VeggiesDelight.MOD_ID,"cauliflower_bread"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.VEGETARIAN_BURGER.get(),1)
                .requires(ForgeTags.BREAD)
                .requires(ForgeTags.CROPS_CABBAGE)
                .requires(ModItems.COOKED_VEGETARIAN_PATTY.get())
                .requires(ForgeTags.CROPS_TOMATO)
                .unlockedBy("has_patty", hasItems(ModItems.COOKED_VEGETARIAN_PATTY.get()))
                .save(consumer, new ResourceLocation(VeggiesDelight.MOD_ID,"vegetarian_burger"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.CHICKEN_FAJITAS_WRAP.get(),1)
                .requires(ForgeTags.DOUGH)
                .requires(ForgeTags.CROPS_ONION)
                .requires(ForgeTags.COOKED_CHICKEN)
                .requires(ModItems.SMOKED_BELLPEPPER.get())
                .unlockedBy("has_bellpepper", hasItems(ModItems.BELLPEPPER.get()))
                .save(consumer, new ResourceLocation(VeggiesDelight.MOD_ID,"chicken_fajitas_wrap"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.FERMENTED_GARLIC_HONEY.get(),1)
                .requires(ModItems.GARLIC_CLOVE.get())
                .requires(ModItems.GARLIC_CLOVE.get())
                .requires(ModItems.GARLIC_CLOVE.get())
                .requires(ModItems.GARLIC_CLOVE.get())
                .requires(Items.HONEY_BOTTLE)
                .unlockedBy("has_honey", hasItems(Items.HONEY_BOTTLE))
                .save(consumer, new ResourceLocation(VeggiesDelight.MOD_ID,"fermented_garlic_honey"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.GARLIC_BREAD.get(),4)
                .requires(ForgeTags.BREAD)
                .requires(ModItems.ROASTED_GARLIC_CLOVE.get())
                .requires(ModItems.ROASTED_GARLIC_CLOVE.get())
                .requires(ModItems.ROASTED_GARLIC_CLOVE.get())
                .requires(ModItems.ROASTED_GARLIC_CLOVE.get())
                .unlockedBy("has_roasted_garlic_clove", hasItems(ModItems.ROASTED_GARLIC_CLOVE.get()))
                .save(consumer, new ResourceLocation(VeggiesDelight.MOD_ID,"garlic_bread"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.SWEET_POTATO_CUPCAKE.get(),3)
                .requires(ModItems.SWEET_POTATO_DOUGH.get())
                .requires(ForgeTags.EGGS)
                .requires(ForgeTags.MILK)
                .unlockedBy("has_sweet_potato_dough", hasItems(ModItems.SWEET_POTATO_DOUGH.get()))
                .save(consumer, new ResourceLocation(VeggiesDelight.MOD_ID,"sweet_potato_cupcakes"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.ZUCCHINI_SANDWICH.get(),1)
                .requires(ForgeTags.BREAD)
                .requires(VDForgeTags.CROPS_ZUCCHINI)
                .requires(ForgeTags.SALAD_INGREDIENTS)
                .requires(ForgeTags.CROPS_TOMATO)
                .unlockedBy("has_zucchini", hasItems(ModItems.ZUCCHINI.get()))
                .save(consumer, new ResourceLocation(VeggiesDelight.MOD_ID,"zucchini_sandwich"));


        // Misc
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CAULIFLOWER_FLORET.get(),2)
                .requires(ModItems.CAULIFLOWER.get())
                .unlockedBy("has_cauliflower", hasItems(ModItems.CAULIFLOWER.get()))
                .save(consumer, new ResourceLocation(VeggiesDelight.MOD_ID,"cauliflower_florets"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_VEGETARIAN_PATTY.get(),1)
                .requires(Ingredient.fromValues(Stream.of(
                        new Ingredient.TagValue(VDForgeTags.CROPS_CAULIFLOWER),
                        new Ingredient.TagValue(Tags.Items.CROPS_POTATO),
                        new Ingredient.TagValue(VDForgeTags.CROPS_ZUCCHINI)
                )))
                .requires(ForgeTags.GRAIN)
                .unlockedBy("has_potato", hasItems(Items.POTATO))
                .unlockedBy("has_cauliflower", hasItems(ModItems.CAULIFLOWER.get()))
                .unlockedBy("has_zucchini", hasItems(ModItems.ZUCCHINI.get()))
                .save(consumer, new ResourceLocation(VeggiesDelight.MOD_ID,"vegetarian_patty"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SWEET_POTATO_DOUGH.get(),3)
                .requires(VDForgeTags.CROPS_SWEET_POTATO)
                .requires(VDForgeTags.CROPS_SWEET_POTATO)
                .requires(ForgeTags.GRAIN_WHEAT)
                .requires(ForgeTags.EGGS)
                .unlockedBy("has_sweet_potato", hasItems(ModItems.SWEET_POTATO.get()))
                .save(consumer, new ResourceLocation(VeggiesDelight.MOD_ID,"sweet_potato_dough_from_eggs"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SWEET_POTATO_DOUGH.get(),3)
                .requires(VDForgeTags.CROPS_SWEET_POTATO)
                .requires(VDForgeTags.CROPS_SWEET_POTATO)
                .requires(ForgeTags.GRAIN_WHEAT)
                .requires(ForgeTags.BUCKETS_WATER)
                .unlockedBy("has_sweet_potato", hasItems(ModItems.SWEET_POTATO.get()))
                .save(consumer, new ResourceLocation(VeggiesDelight.MOD_ID,"sweet_potato_dough_from_water"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.UNCOOKED_MHADJEB.get(),2)
                .requires(ForgeTags.DOUGH)
                .requires(vectorwing.farmersdelight.common.registry.ModItems.TOMATO_SAUCE.get())
                .requires(ForgeTags.CROPS_ONION)
                .requires(VDForgeTags.CROPS_BELLPEPPER)
                .unlockedBy("has_tomato_sauce", hasItems(vectorwing.farmersdelight.common.registry.ModItems.TOMATO_SAUCE.get()))
                .save(consumer, new ResourceLocation(VeggiesDelight.MOD_ID,"uncooked_mhadjeb"));


        // Pies and stuff
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.BEETROOT_BROWNIE_TRAY.get(),1)
                .requires(ForgeTags.VEGETABLES_BEETROOT)
                .requires(ForgeTags.VEGETABLES_BEETROOT)
                .requires(ForgeTags.VEGETABLES_BEETROOT)
                .requires(Items.COCOA_BEANS)
                .requires(Items.SUGAR)
                .requires(Items.COCOA_BEANS)
                .requires(ForgeTags.EGGS)
                .requires(Items.SUGAR)
                .requires(ForgeTags.EGGS)
                .unlockedBy("has_beetroot", hasItems(Items.BEETROOT))
                .save(consumer, new ResourceLocation(VeggiesDelight.MOD_ID,"beetroot_brownie_tray"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.CARROT_CAKE.get(),1)
                .requires(ForgeTags.MILK)
                .requires(ForgeTags.MILK)
                .requires(ForgeTags.MILK)
                .requires(Items.SUGAR)
                .requires(ForgeTags.EGGS)
                .requires(ForgeTags.GRAIN_WHEAT)
                .requires(ForgeTags.VEGETABLES_CARROT)
                .requires(ForgeTags.VEGETABLES_CARROT)
                .requires(ForgeTags.VEGETABLES_CARROT)
                .unlockedBy("has_carrot", hasItems(Items.CARROT))
                .save(consumer, new ResourceLocation(VeggiesDelight.MOD_ID,"carrot_cake"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.CARROT_CAKE.get(), 1)
                .requires(ModItems.CARROT_CAKE_SLICE.get())
                .requires(ModItems.CARROT_CAKE_SLICE.get())
                .requires(ModItems.CARROT_CAKE_SLICE.get())
                .requires(ModItems.CARROT_CAKE_SLICE.get())
                .requires(ModItems.CARROT_CAKE_SLICE.get())
                .requires(ModItems.CARROT_CAKE_SLICE.get())
                .requires(ModItems.CARROT_CAKE_SLICE.get())
                .unlockedBy("has_slice", hasItems( ModItems.CARROT_CAKE_SLICE.get()))
                .save(consumer, new ResourceLocation(VeggiesDelight.MOD_ID,"carrot_cake_from_slices"));

        // Seeds
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BELLPEPPER_SEEDS.get(),1)
                .requires(ModItems.BELLPEPPER.get())
                .unlockedBy("has_bellpepper", hasItems(ModItems.BELLPEPPER.get()))
                .save(consumer, new ResourceLocation(VeggiesDelight.MOD_ID,"seeds_from_bellpepper"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.GARLIC_CLOVE.get(),3)
                .requires(ModItems.GARLIC.get())
                .unlockedBy("has_garlic", hasItems(ModItems.GARLIC.get()))
                .save(consumer, new ResourceLocation(VeggiesDelight.MOD_ID,"cloves_from_garlic"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ZUCCHINI_SEEDS.get(),1)
                .requires(ModItems.ZUCCHINI.get())
                .unlockedBy("has_zucchini", hasItems(ModItems.ZUCCHINI.get()))
                .save(consumer, new ResourceLocation(VeggiesDelight.MOD_ID,"seeds_from_zucchini"));

        // Vegetables from crates
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BELLPEPPER.get(),9)
                .requires(ModBlocks.BELLPEPPER_CRATE.get())
                .unlockedBy("has_bellpepper_crate", hasItems(ModBlocks.BELLPEPPER_CRATE.get()))
                .save(consumer, new ResourceLocation(VeggiesDelight.MOD_ID,"bellpeppers_from_crate"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BROCCOLI.get(),9)
                .requires(ModBlocks.BROCCOLI_CRATE.get())
                .unlockedBy("has_broccoli_crate", hasItems(ModBlocks.BROCCOLI_CRATE.get()))
                .save(consumer, new ResourceLocation(VeggiesDelight.MOD_ID,"broccoli_from_crate"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CAULIFLOWER.get(),9)
                .requires(ModBlocks.CAULIFLOWER_CRATE.get())
                .unlockedBy("has_cauliflower_crate", hasItems(ModBlocks.CAULIFLOWER_CRATE.get()))
                .save(consumer, new ResourceLocation(VeggiesDelight.MOD_ID,"cauliflowers_from_crate"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.GARLIC.get(),9)
                .requires(ModBlocks.GARLIC_CRATE.get())
                .unlockedBy("has_garlic_crate", hasItems(ModBlocks.GARLIC_CRATE.get()))
                .save(consumer, new ResourceLocation(VeggiesDelight.MOD_ID,"garlic_from_crate"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SWEET_POTATO.get(),9)
                .requires(ModBlocks.SWEET_POTATO_CRATE.get())
                .unlockedBy("has_sweet_potato_crate", hasItems(ModBlocks.SWEET_POTATO_CRATE.get()))
                .save(consumer, new ResourceLocation(VeggiesDelight.MOD_ID,"sweet_potatoes_from_crate"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TURNIP.get(),9)
                .requires(ModBlocks.TURNIP_CRATE.get())
                .unlockedBy("has_turnip_crate", hasItems(ModBlocks.TURNIP_CRATE.get()))
                .save(consumer, new ResourceLocation(VeggiesDelight.MOD_ID,"turnips_from_crate"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ZUCCHINI.get(),9)
                .requires(ModBlocks.ZUCCHINI_CRATE.get())
                .unlockedBy("has_zucchini_crate", hasItems(ModBlocks.ZUCCHINI_CRATE.get()))
                .save(consumer, new ResourceLocation(VeggiesDelight.MOD_ID,"zucchinis_from_crate"));

        // Wild And Flowers
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.YELLOW_DYE,2)
                .requires(ModBlocks.MATURE_DANDELION.get())
                .unlockedBy("has_mature_dandelion", hasItems(ModBlocks.MATURE_DANDELION.get()))
                .save(consumer, new ResourceLocation(VeggiesDelight.MOD_ID,"dye_from_mature_dandelion"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.WHITE_DYE,1)
                .requires(ModBlocks.WILD_GARLIC.get())
                .unlockedBy("has_wild_flower", hasItems(ModBlocks.WILD_GARLIC.get()))
                .save(consumer, new ResourceLocation(VeggiesDelight.MOD_ID,"dye_from_wild_garlic"));
    }
}
