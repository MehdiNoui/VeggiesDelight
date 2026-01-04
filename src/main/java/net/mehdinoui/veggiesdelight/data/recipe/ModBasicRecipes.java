package net.mehdinoui.veggiesdelight.data.recipe;

import net.mehdinoui.veggiesdelight.VeggiesDelight;
import net.mehdinoui.veggiesdelight.common.registry.ModBlocks;
import net.mehdinoui.veggiesdelight.common.registry.ModItems;
import net.mehdinoui.veggiesdelight.common.tag.VDCommonTags;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.Tags;
import vectorwing.farmersdelight.common.tag.CommonTags;

import java.util.stream.Stream;

import static net.minecraft.advancements.critereon.InventoryChangeTrigger.TriggerInstance.hasItems;

public class ModBasicRecipes {
    public static void register(RecipeOutput output) {
        shapefulRecipes(output);
        shapelessRecipes(output);
    }
    public static void shapefulRecipes(RecipeOutput output){
        // Crates
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BELLPEPPER_CRATE.get(), 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.BELLPEPPER.get())
                .unlockedBy("has_bellpepper", hasItems(ModItems.BELLPEPPER.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID,"bellpepper_crate"));
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROCCOLI_CRATE.get(), 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.BROCCOLI.get())
                .unlockedBy("has_broccoli", hasItems(ModItems.BROCCOLI.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID,"broccoli_crate"));
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CAULIFLOWER_CRATE.get(), 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.CAULIFLOWER.get())
                .unlockedBy("has_cauliflower", hasItems(ModItems.CAULIFLOWER.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID,"cauliflower_crate"));
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GARLIC_CRATE.get(), 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.GARLIC.get())
                .unlockedBy("has_garlic", hasItems(ModItems.GARLIC.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID,"garlic_crate"));
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SWEET_POTATO_CRATE.get(), 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.SWEET_POTATO.get())
                .unlockedBy("has_sweet_potato", hasItems(ModItems.SWEET_POTATO.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID,"sweet_potato_crate"));
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TURNIP_CRATE.get(), 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.TURNIP.get())
                .unlockedBy("has_turnip", hasItems(ModItems.TURNIP.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID,"turnip_crate"));
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ZUCCHINI_CRATE.get(), 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.ZUCCHINI.get())
                .unlockedBy("has_zucchini", hasItems(ModItems.ZUCCHINI.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID,"zucchini_crate"));

        // Pies and stuff (from ingredients)
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.SWEET_POTATO_PIE.get(), 1)
                .pattern("ppp")
                .pattern("sOs")
                .define('p', ModItems.BAKED_SWEET_POTATO.get())
                .define('s', Items.SUGAR)
                .define('O', vectorwing.farmersdelight.common.registry.ModItems.PIE_CRUST.get())
                .unlockedBy("has_pie_crust", hasItems(vectorwing.farmersdelight.common.registry.ModItems.PIE_CRUST.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID,"sweet_potato_pie"));
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.ZUCCHINI_QUICHE.get(), 1) // Added missing Zucchini Quiche
                .pattern("zzz")
                .pattern("aOm")
                .define('z', ModItems.ROASTED_ZUCCHINI.get())
                .define('a', CommonTags.FOODS_MILK)
                .define('m', Ingredient.fromValues(Stream.of(
                        new Ingredient.TagValue(CommonTags.FOODS_COOKED_MUTTON),
                        new Ingredient.TagValue(CommonTags.FOODS_COOKED_CHICKEN),
                        new Ingredient.TagValue(CommonTags.FOODS_COOKED_BEEF),
                        new Ingredient.TagValue(CommonTags.FOODS_COOKED_PORK),
                        new Ingredient.TagValue(CommonTags.FOODS_COOKED_BACON)
                )))
                .define('O', vectorwing.farmersdelight.common.registry.ModItems.PIE_CRUST.get())
                .unlockedBy("has_pie_crust", hasItems(vectorwing.farmersdelight.common.registry.ModItems.PIE_CRUST.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID,"zucchini_quiche"));

        // Pies from slices
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.BEETROOT_BROWNIE_TRAY.get(), 1)
                .pattern("##")
                .pattern("##")
                .define('#', ModItems.BEETROOT_BROWNIE.get())
                .unlockedBy("has_slice", hasItems( ModItems.BEETROOT_BROWNIE.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID,"beetroot_brownie_from_slices"));
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.SWEET_POTATO_PIE.get(), 1)
                .pattern("##")
                .pattern("##")
                .define('#', ModItems.SWEET_POTATO_PIE_SLICE.get())
                .unlockedBy("has_slice", hasItems( ModItems.SWEET_POTATO_PIE_SLICE.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID,"sweet_potato_pie_from_slices"));
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.VEGAN_PIZZA.get(), 1)
                .pattern("abc")
                .pattern("xOx")
                .define('a', VDCommonTags.CROPS_BELLPEPPER)
                .define('b', Tags.Items.FOODS_VEGETABLE)
                .define('c', CommonTags.CROPS_ONION)
                .define('x', CommonTags.FOODS_DOUGH)
                .define('O', vectorwing.farmersdelight.common.registry.ModItems.TOMATO_SAUCE.get())
                .unlockedBy("has_sauce", hasItems(vectorwing.farmersdelight.common.registry.ModItems.TOMATO_SAUCE.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID,"vegan_pizza"));
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.VEGAN_PIZZA.get(), 1)
                .pattern("##")
                .pattern("##")
                .define('#', ModItems.VEGAN_PIZZA_SLICE.get())
                .unlockedBy("has_slice", hasItems( ModItems.VEGAN_PIZZA_SLICE.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID,"vegan_pizza_from_slices"));
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.ZUCCHINI_QUICHE.get(), 1) // Added missing Zucchini Quiche from Slices
                .pattern("##")
                .pattern("##")
                .define('#', ModItems.ZUCCHINI_QUICHE_SLICE.get())
                .unlockedBy("has_slice", hasItems( ModItems.ZUCCHINI_QUICHE_SLICE.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID,"zucchini_quiche_from_slices"));
    }
    public static void shapelessRecipes(RecipeOutput output){
        // Bowled Food Recipes
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.BROCCOLI_SALAD.get(),1)
                .requires(VDCommonTags.CROPS_BROCCOLI)
                .requires(CommonTags.CROPS_TOMATO)
                .requires(CommonTags.CROPS_ONION)
                .requires(Items.BOWL)
                .unlockedBy("has_bowl", hasItems(Items.BOWL))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID,"broccoli_salad"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.COLESLAW.get(),1) // Added missing Coleslaw
                .requires(VDCommonTags.CROPS_ZUCCHINI)
                .requires(Tags.Items.CROPS_POTATO)
                .requires(Tags.Items.CROPS_CARROT)
                .requires(CommonTags.CROPS_CABBAGE)
                .requires(Items.BOWL)
                .unlockedBy("has_bowl", hasItems(Items.BOWL))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID,"coleslaw"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.CESAR_SALAD.get(),1)
                .requires(CommonTags.CROPS_CABBAGE)
                .requires(Tags.Items.FOODS_BREAD)
                .requires(VDCommonTags.CROPS_GARLIC)
                .requires(Items.BOWL)
                .requires(CommonTags.CROPS_TOMATO)
                .unlockedBy("has_bowl", hasItems(Items.BOWL))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID,"cesar_salad"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.DANDELION_AND_EGGS.get(),1)
                .requires(ModItems.DANDELION_LEAF.get())
                .requires(ModItems.DANDELION_LEAF.get())
                .requires(CommonTags.FOODS_COOKED_EGG)
                .requires(Items.BOWL)
                .requires(CommonTags.FOODS_COOKED_EGG)
                .requires(CommonTags.FOODS_COOKED_EGG)
                .unlockedBy("has_dandelion", hasItems(ModItems.DANDELION_LEAF.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID,"dandelion_and_eggs"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.GARLIC_BAKED_COD.get(),1)
                .requires(CommonTags.FOODS_COOKED_COD)
                .requires(ModItems.ROASTED_GARLIC_CLOVE.get())
                .requires(ModItems.ROASTED_GARLIC_CLOVE.get())
                .requires(Items.BOWL)
                .requires(CommonTags.CROPS_ONION)
                .unlockedBy("has_fish", hasItems(Items.COD))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID,"garlic_baked_cod"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.GARLIC_RICE_WITH_CAULIFLOWER.get(),1)
                .requires(ModItems.ROASTED_GARLIC_CLOVE.get())
                .requires(ModItems.ROASTED_CAULIFLOWER_FLORET.get())
                .requires(ModItems.ROASTED_CAULIFLOWER_FLORET.get())
                .requires(Items.BOWL)
                .requires(vectorwing.farmersdelight.common.registry.ModItems.COOKED_RICE.get())
                .unlockedBy("has_rice", hasItems(vectorwing.farmersdelight.common.registry.ModItems.COOKED_RICE.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID,"garlic_rice_with_cauliflower"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.STEAK_AND_BROCCOLI.get(),1) // Added missing Steak and Broccoli
                .requires(Items.COOKED_BEEF)
                .requires(VDCommonTags.CROPS_BROCCOLI)
                .requires(vectorwing.farmersdelight.common.registry.ModItems.COOKED_RICE.get())
                .requires(Items.BOWL)
                .unlockedBy("has_rice", hasItems(vectorwing.farmersdelight.common.registry.ModItems.COOKED_RICE.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID,"steak_and_broccoli"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.TURNIP_SALAD.get(),1)
                .requires(CommonTags.FOODS_LEAFY_GREEN)
                .requires(VDCommonTags.CROPS_TURNIP)
                .requires(Items.BOWL)
                .unlockedBy("has_bowl", hasItems(Items.BOWL))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID,"turnip_salad"));


        // Food Recipes
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.CAULIFLOWER_BREAD.get(),1)
                .requires(VDCommonTags.CROPS_CAULIFLOWER)
                .requires(VDCommonTags.CROPS_CAULIFLOWER)
                .requires(Items.WHEAT)
                .unlockedBy("has_wheat", hasItems(Items.WHEAT))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID,"cauliflower_bread"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.VEGETARIAN_BURGER.get(),1)
                .requires(Tags.Items.FOODS_BREAD)
                .requires(CommonTags.CROPS_CABBAGE)
                .requires(ModItems.COOKED_VEGETARIAN_PATTY.get())
                .requires(CommonTags.CROPS_TOMATO)
                .unlockedBy("has_patty", hasItems(ModItems.COOKED_VEGETARIAN_PATTY.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID,"vegetarian_burger")); // Corrected ID from cauliflower_burger
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.CHICKEN_FAJITAS_WRAP.get(),1)
                .requires(CommonTags.FOODS_DOUGH)
                .requires(CommonTags.CROPS_ONION)
                .requires(CommonTags.FOODS_COOKED_CHICKEN)
                .requires(ModItems.SMOKED_BELLPEPPER.get())
                .unlockedBy("has_bellpepper", hasItems(ModItems.BELLPEPPER.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID,"chicken_fajitas_wrap"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.FERMENTED_GARLIC_HONEY.get(),1)
                .requires(ModItems.GARLIC_CLOVE.get())
                .requires(ModItems.GARLIC_CLOVE.get())
                .requires(ModItems.GARLIC_CLOVE.get())
                .requires(ModItems.GARLIC_CLOVE.get())
                .requires(Items.HONEY_BOTTLE)
                .unlockedBy("has_honey", hasItems(Items.HONEY_BOTTLE))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID,"fermented_garlic_honey"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.GARLIC_BREAD.get(),4)
                .requires(Tags.Items.FOODS_BREAD)
                .requires(ModItems.ROASTED_GARLIC_CLOVE.get())
                .requires(ModItems.ROASTED_GARLIC_CLOVE.get())
                .requires(ModItems.ROASTED_GARLIC_CLOVE.get())
                .requires(ModItems.ROASTED_GARLIC_CLOVE.get())
                .unlockedBy("has_roasted_garlic_clove", hasItems(ModItems.ROASTED_GARLIC_CLOVE.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID,"garlic_bread"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.TURNIP_MUTTON_SKEWER.get(),1) // Added missing Turnip Mutton Skewer
                .requires(CommonTags.FOODS_COOKED_MUTTON)
                .requires(VDCommonTags.CROPS_TURNIP)
                .requires(Items.STICK)
                .unlockedBy("has_turnip", hasItems(ModItems.TURNIP.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID,"turnip_mutton_skewer"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.STUFFED_ZUCCHINI_BOAT.get(),1) // Added missing Stuffed Zucchini Boat
                .requires(ModItems.ROASTED_ZUCCHINI.get())
                .requires(Ingredient.fromValues(Stream.of(
                        new Ingredient.TagValue(CommonTags.FOODS_COOKED_MUTTON),
                        new Ingredient.TagValue(CommonTags.FOODS_COOKED_CHICKEN),
                        new Ingredient.TagValue(CommonTags.FOODS_COOKED_BEEF)
                )))
                .requires(CommonTags.FOODS_MILK)
                .unlockedBy("has_roasted_zucchini", hasItems(ModItems.ROASTED_ZUCCHINI.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID,"stuffed_zucchini_boat"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.SWEET_POTATO_CUPCAKE.get(),3)
                .requires(ModItems.SWEET_POTATO_DOUGH.get())
                .requires(Tags.Items.EGGS)
                .requires(CommonTags.FOODS_MILK)
                .unlockedBy("has_sweet_potato_dough", hasItems(ModItems.SWEET_POTATO_DOUGH.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID,"sweet_potato_cupcakes"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.VEGETABLES_WRAP.get(),1) // Added missing Vegetables Wrap
                .requires(CommonTags.FOODS_DOUGH)
                .requires(CommonTags.CROPS_ONION)
                .requires(Ingredient.fromValues(Stream.of(
                        new Ingredient.TagValue(VDCommonTags.CROPS_BROCCOLI),
                        new Ingredient.TagValue(CommonTags.FOODS_LEAFY_GREEN)
                )))
                .requires(Ingredient.fromValues(Stream.of(
                        new Ingredient.ItemValue(new ItemStack(ModItems.SMOKED_BELLPEPPER.get())),
                        new Ingredient.ItemValue(new ItemStack(ModItems.ROASTED_ZUCCHINI.get())),
                        new Ingredient.TagValue(Tags.Items.MUSHROOMS)
                )))
                .requires(vectorwing.farmersdelight.common.registry.ModItems.COOKED_RICE.get())
                .unlockedBy("has_rice", hasItems(vectorwing.farmersdelight.common.registry.ModItems.COOKED_RICE.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID,"vegetable_wrap"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.ZUCCHINI_SANDWICH.get(),1)
                .requires(Tags.Items.FOODS_BREAD)
                .requires(VDCommonTags.CROPS_ZUCCHINI)
                .requires(CommonTags.FOODS_LEAFY_GREEN)
                .requires(CommonTags.CROPS_TOMATO)
                .unlockedBy("has_zucchini", hasItems(ModItems.ZUCCHINI.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID,"zucchini_sandwich"));


        // Misc
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CAULIFLOWER_FLORET.get(),2)
                .requires(ModItems.CAULIFLOWER.get())
                .unlockedBy("has_cauliflower", hasItems(ModItems.CAULIFLOWER.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID,"cauliflower_florets"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_VEGETARIAN_PATTY.get(),1)
                .requires(Ingredient.fromValues(Stream.of( // Corrected to match the multi-veg ingredient from the original
                        new Ingredient.TagValue(VDCommonTags.CROPS_CAULIFLOWER),
                        new Ingredient.TagValue(Tags.Items.CROPS_POTATO),
                        new Ingredient.TagValue(VDCommonTags.CROPS_ZUCCHINI)
                )))
                .requires(CommonTags.CROPS_ONION)
                .requires(CommonTags.CROPS_GRAIN)
                .unlockedBy("has_potato", hasItems(Items.POTATO))
                .unlockedBy("has_cauliflower", hasItems(ModItems.CAULIFLOWER.get()))
                .unlockedBy("has_zucchini", hasItems(ModItems.ZUCCHINI.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID,"vegetarian_patty")); // Corrected ID from cauliflower_patty
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SWEET_POTATO_DOUGH.get(),3)
                .requires(VDCommonTags.CROPS_SWEET_POTATO)
                .requires(VDCommonTags.CROPS_SWEET_POTATO)
                .requires(Items.WHEAT)
                .requires(Tags.Items.EGGS)
                .unlockedBy("has_sweet_potato", hasItems(ModItems.SWEET_POTATO.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID,"sweet_potato_dough_from_eggs"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SWEET_POTATO_DOUGH.get(),3)
                .requires(VDCommonTags.CROPS_SWEET_POTATO)
                .requires(VDCommonTags.CROPS_SWEET_POTATO)
                .requires(Items.WHEAT)
                .requires(Tags.Items.BUCKETS_WATER)
                .unlockedBy("has_sweet_potato", hasItems(ModItems.SWEET_POTATO.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID,"sweet_potato_dough_from_water"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.UNCOOKED_MHADJEB.get(),2)
                .requires(CommonTags.FOODS_DOUGH)
                .requires(vectorwing.farmersdelight.common.registry.ModItems.TOMATO_SAUCE.get())
                .requires(CommonTags.CROPS_ONION)
                .requires(VDCommonTags.CROPS_BELLPEPPER)
                .unlockedBy("has_tomato_sauce", hasItems(vectorwing.farmersdelight.common.registry.ModItems.TOMATO_SAUCE.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID,"uncooked_mhadjeb"));


        // Pies and stuff (shapeless)
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.BEETROOT_BROWNIE_TRAY.get(),1)
                .requires(Tags.Items.CROPS_BEETROOT)
                .requires(Tags.Items.CROPS_BEETROOT)
                .requires(Tags.Items.CROPS_BEETROOT)
                .requires(Items.COCOA_BEANS)
                .requires(Items.SUGAR)
                .requires(Items.COCOA_BEANS)
                .requires(Tags.Items.EGGS)
                .requires(Items.SUGAR)
                .requires(Tags.Items.EGGS)
                .unlockedBy("has_beetroot", hasItems(Items.BEETROOT))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID,"beetroot_brownie_tray"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.CARROT_CAKE.get(),1)
                .requires(CommonTags.FOODS_MILK)
                .requires(CommonTags.FOODS_MILK)
                .requires(CommonTags.FOODS_MILK)
                .requires(Items.SUGAR)
                .requires(Tags.Items.EGGS)
                .requires(Items.WHEAT)
                .requires(Tags.Items.CROPS_CARROT)
                .requires(Tags.Items.CROPS_CARROT)
                .requires(Tags.Items.CROPS_CARROT)
                .unlockedBy("has_carrot", hasItems(Items.CARROT))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID,"carrot_cake"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.CARROT_CAKE.get(), 1)
                .requires(ModItems.CARROT_CAKE_SLICE.get())
                .requires(ModItems.CARROT_CAKE_SLICE.get())
                .requires(ModItems.CARROT_CAKE_SLICE.get())
                .requires(ModItems.CARROT_CAKE_SLICE.get())
                .requires(ModItems.CARROT_CAKE_SLICE.get())
                .requires(ModItems.CARROT_CAKE_SLICE.get())
                .requires(ModItems.CARROT_CAKE_SLICE.get())
                .unlockedBy("has_slice", hasItems( ModItems.CARROT_CAKE_SLICE.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID,"carrot_cake_from_slices"));

        // Seeds
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BELLPEPPER_SEEDS.get(),1)
                .requires(ModItems.BELLPEPPER.get())
                .unlockedBy("has_bellpepper", hasItems(ModItems.BELLPEPPER.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID,"seeds_from_bellpepper"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.GARLIC_CLOVE.get(),3)
                .requires(ModItems.GARLIC.get())
                .unlockedBy("has_garlic", hasItems(ModItems.GARLIC.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID,"cloves_from_garlic"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ZUCCHINI_SEEDS.get(),1)
                .requires(ModItems.ZUCCHINI.get())
                .unlockedBy("has_zucchini", hasItems(ModItems.ZUCCHINI.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID,"seeds_from_zucchini"));

        // Vegetables from crates
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BELLPEPPER.get(),9)
                .requires(ModBlocks.BELLPEPPER_CRATE.get())
                .unlockedBy("has_bellpepper_crate", hasItems(ModBlocks.BELLPEPPER_CRATE.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID,"bellpeppers_from_crate"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BROCCOLI.get(),9)
                .requires(ModBlocks.BROCCOLI_CRATE.get())
                .unlockedBy("has_broccoli_crate", hasItems(ModBlocks.BROCCOLI_CRATE.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID,"broccoli_from_crate"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CAULIFLOWER.get(),9)
                .requires(ModBlocks.CAULIFLOWER_CRATE.get())
                .unlockedBy("has_cauliflower_crate", hasItems(ModBlocks.CAULIFLOWER_CRATE.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID,"cauliflowers_from_crate"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.GARLIC.get(),9)
                .requires(ModBlocks.GARLIC_CRATE.get())
                .unlockedBy("has_garlic_crate", hasItems(ModBlocks.GARLIC_CRATE.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID,"garlic_from_crate"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SWEET_POTATO.get(),9)
                .requires(ModBlocks.SWEET_POTATO_CRATE.get())
                .unlockedBy("has_sweet_potato_crate", hasItems(ModBlocks.SWEET_POTATO_CRATE.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID,"sweet_potatoes_from_crate"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TURNIP.get(),9)
                .requires(ModBlocks.TURNIP_CRATE.get())
                .unlockedBy("has_turnip_crate", hasItems(ModBlocks.TURNIP_CRATE.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID,"turnips_from_crate"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ZUCCHINI.get(),9)
                .requires(ModBlocks.ZUCCHINI_CRATE.get())
                .unlockedBy("has_zucchini_crate", hasItems(ModBlocks.ZUCCHINI_CRATE.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID,"zucchinis_from_crate"));

        // Wild And Flowers
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.YELLOW_DYE,2)
                .requires(ModBlocks.MATURE_DANDELION.get())
                .unlockedBy("has_mature_dandelion", hasItems(ModBlocks.MATURE_DANDELION.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID,"dye_from_mature_dandelion"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.WHITE_DYE,1)
                .requires(ModBlocks.WILD_GARLIC.get())
                .unlockedBy("has_wild_flower", hasItems(ModBlocks.WILD_GARLIC.get()))
                .save(output, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID,"dye_from_wild_garlic"));
    }
}