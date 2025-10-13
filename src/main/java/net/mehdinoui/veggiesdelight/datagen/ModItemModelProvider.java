package net.mehdinoui.veggiesdelight.datagen;

import net.mehdinoui.veggiesdelight.VeggiesDelight;
import net.mehdinoui.veggiesdelight.registry.ModBlocks;
import net.mehdinoui.veggiesdelight.registry.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, VeggiesDelight.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.BELLPEPPER.get());
        basicItem(ModItems.BELLPEPPER_SEEDS.get());
        basicItem(ModItems.CACCIATORE.get());
        basicItem(ModItems.SHAKSHOUKA.get());
        basicItem(ModItems.SMOKED_BELLPEPPER.get());
        basicItem(ModItems.STUFFED_BELLPEPPER.get());
        basicItem(ModItems.STUFFED_BELLPEPPERS_BLOCK.get());
        basicItem(ModItems.UNCOOKED_MHADJEB.get());
        basicItem(ModItems.MHADJEB.get());
        basicItem(ModItems.VEGAN_PIZZA.get());
        basicItem(ModItems.VEGAN_PIZZA_SLICE.get());
        basicItem(ModItems.CHICKEN_FAJITAS_WRAP.get());

        basicItem(ModItems.BROCCOLI.get());
        basicItem(ModItems.BROCCOLI_SEEDS.get());
        basicItem(ModItems.BROCCOLI_SALAD.get());
        basicItem(ModItems.BROCCOLI_SOUP.get());
        basicItem(ModItems.PASTA_WITH_BROCCOLI.get());
        basicItem(ModItems.STEAK_AND_BROCCOLI.get());

        basicItem(ModItems.CAULIFLOWER.get());
        basicItem(ModItems.CAULIFLOWER_SEEDS.get());
        basicItem(ModItems.CAULIFLOWER_FLORET.get());
        basicItem(ModItems.ROASTED_CAULIFLOWER_FLORET.get());
        basicItem(ModItems.CAULIFLOWER_BREAD.get());
        basicItem(ModItems.CAULIFLOWER_SOUP.get());
        basicItem(ModItems.CAULIFLOWER_KUKU.get());

        basicItem(ModItems.GARLIC.get());
        basicItem(ModItems.GARLIC_CLOVE.get());
        basicItem(ModItems.ROASTED_GARLIC_CLOVE.get());
        basicItem(ModItems.GARLIC_BAKED_COD.get());
        basicItem(ModItems.GARLIC_CHICKEN_STEW.get());
        basicItem(ModItems.GARLIC_RICE_WITH_CAULIFLOWER.get());
        basicItem(ModItems.GARLIC_BREAD.get());
        basicItem(ModItems.CESAR_SALAD.get());
        basicItem(ModItems.FERMENTED_GARLIC_HONEY.get());
        basicItem(ModItems.GARLIC_STUFFED_MUSHROOMS.get());

        basicItem(ModItems.SWEET_POTATO.get());
        basicItem(ModItems.MASHED_POTATOES.get());
        basicItem(ModItems.BAKED_SWEET_POTATO.get());
        basicItem(ModItems.SWEET_POTATO_PIE.get());
        basicItem(ModItems.SWEET_POTATO_PIE_SLICE.get());
        basicItem(ModItems.POTATO_NOODLE.get());
        basicItem(ModItems.POTATO_NOODLES.get());
        basicItem(ModItems.SWEET_POTATO_CUPCAKE.get());
        basicItem(ModItems.SWEET_POTATO_DOUGH.get());
        basicItem(ModItems.SWEET_POTATO_PANCAKES.get());

        basicItem(ModItems.TURNIP.get());
        basicItem(ModItems.TURNIP_SEEDS.get());
        basicItem(ModItems.TURNIP_BEEF_STEW.get());
        basicItem(ModItems.TURNIP_CAKE.get());
        basicItem(ModItems.TURNIP_SALAD.get());
        basicItem(ModItems.TURNIP_WATER.get());
        basicItem(ModItems.TURNIP_MUTTON_SKEWER.get());

        basicItem(ModItems.ZUCCHINI.get());
        basicItem(ModItems.COLESLAW.get());
        basicItem(ModItems.ROASTED_ZUCCHINI.get());
        basicItem(ModItems.STUFFED_ZUCCHINIS.get());
        basicItem(ModItems.STUFFED_ZUCCHINI_BOAT.get());
        basicItem(ModItems.ZUCCHINI_SANDWICH.get());
        basicItem(ModItems.ZUCCHINI_SLICE.get());
        basicItem(ModItems.ZUCCHINI_SEEDS.get());
        basicItem(ModItems.ZUCCHINI_QUICHE.get());
        basicItem(ModItems.ZUCCHINI_QUICHE_SLICE.get());

        basicItem(ModItems.BEETROOT_BROWNIE_TRAY.get());
        basicItem(ModItems.BEETROOT_BROWNIE.get());
        basicItem(ModItems.CARROT_JUICE.get());
        basicItem(ModItems.DANDELION_JUICE.get());
        basicItem(ModItems.DANDELION_LEAF.get());
        basicItem(ModItems.FISH_AND_CHIPS.get());
        basicItem(ModItems.ROASTED_VEGETABLES.get());
        basicItem(ModItems.DANDELION_AND_EGGS.get());
        basicItem(ModItems.CARROT_CAKE.get());
        basicItem(ModItems.CARROT_CAKE_SLICE.get());
        basicItem(ModItems.LASAGNA_PAN.get());
        basicItem(ModItems.LASAGNA_SLICE.get());
        basicItem(ModItems.RAW_VEGETARIAN_PATTY.get());
        basicItem(ModItems.COOKED_VEGETARIAN_PATTY.get());
        basicItem(ModItems.VEGETARIAN_BURGER.get());
        basicItem(ModItems.VEGETABLES_WRAP.get());
        basicItem(ModItems.RICE_AND_VEGETABLES.get());

        // Blocks
        simpleBlockItem(ModBlocks.BELLPEPPER_CRATE.get());
        simpleBlockItem(ModBlocks.BROCCOLI_CRATE.get());
        simpleBlockItem(ModBlocks.CAULIFLOWER_CRATE.get());
        simpleBlockItem(ModBlocks.GARLIC_CRATE.get());
        simpleBlockItem(ModBlocks.SWEET_POTATO_CRATE.get());
        simpleBlockItem(ModBlocks.TURNIP_CRATE.get());
        simpleBlockItem(ModBlocks.ZUCCHINI_CRATE.get());

        basicItem(ModItems.MATURE_DANDELION.get());
        basicItem(ModItems.WILD_BELLPEPPERS.get());
        basicItem(ModItems.WILD_BROCCOLI.get());
        basicItem(ModItems.WILD_CAULIFLOWERS.get());
        basicItem(ModItems.WILD_GARLIC.get());
        basicItem(ModItems.WILD_SWEET_POTATOES.get());
        basicItem(ModItems.WILD_TURNIPS.get());
        basicItem(ModItems.WILD_ZUCCHINIS.get());
    }
}
