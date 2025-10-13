package net.mehdinoui.veggiesdelight.registry;

import net.mehdinoui.veggiesdelight.VeggiesDelight;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, VeggiesDelight.MOD_ID);

    public static final RegistryObject<CreativeModeTab> VEGGIESDELIGHT_TAB = CREATIVE_MODE_TABS.register(
            "veggiesdelight_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.BELLPEPPER.get()))
                    .title(Component.translatable("creativetab.veggiesdelight_tab"))
                    .displayItems((params, output) -> {
                        // Storage Crates
                        output.accept(ModItems.BELLPEPPER_CRATE.get());
                        output.accept(ModItems.BROCCOLI_CRATE.get());
                        output.accept(ModItems.CAULIFLOWER_CRATE.get());
                        output.accept(ModItems.GARLIC_CRATE.get());
                        output.accept(ModItems.SWEET_POTATO_CRATE.get());
                        output.accept(ModItems.TURNIP_CRATE.get());
                        output.accept(ModItems.ZUCCHINI_CRATE.get());

                        // Wild Flowers
                        output.accept(ModItems.MATURE_DANDELION.get());
                        output.accept(ModItems.WILD_BELLPEPPERS.get());
                        output.accept(ModItems.WILD_BROCCOLI.get());
                        output.accept(ModItems.WILD_CAULIFLOWERS.get());
                        output.accept(ModItems.WILD_GARLIC.get());
                        output.accept(ModItems.WILD_SWEET_POTATOES.get());
                        output.accept(ModItems.WILD_TURNIPS.get());
                        output.accept(ModItems.WILD_ZUCCHINIS.get());

                        // Crops
                        output.accept(ModItems.DANDELION_LEAF.get());
                        output.accept(ModItems.BELLPEPPER.get());
                        output.accept(ModItems.BROCCOLI.get());
                        output.accept(ModItems.CAULIFLOWER.get());
                        output.accept(ModItems.GARLIC.get());
                        output.accept(ModItems.SWEET_POTATO.get());
                        output.accept(ModItems.TURNIP.get());
                        output.accept(ModItems.ZUCCHINI.get());

                        // Seeds
                        output.accept(ModItems.BELLPEPPER_SEEDS.get());
                        output.accept(ModItems.BROCCOLI_SEEDS.get());
                        output.accept(ModItems.CAULIFLOWER_SEEDS.get());
                        output.accept(ModItems.TURNIP_SEEDS.get());
                        output.accept(ModItems.ZUCCHINI_SEEDS.get());

                        // Drinks
                        output.accept(ModItems.CARROT_JUICE.get());
                        output.accept(ModItems.DANDELION_JUICE.get());
                        output.accept(ModItems.TURNIP_WATER.get());
                        output.accept(ModItems.FERMENTED_GARLIC_HONEY.get());

                        // Basic Ingredients & Components
                        output.accept(ModItems.SMOKED_BELLPEPPER.get());
                        output.accept(ModItems.BAKED_SWEET_POTATO.get());
                        output.accept(ModItems.CAULIFLOWER_FLORET.get());
                        output.accept(ModItems.ROASTED_CAULIFLOWER_FLORET.get());
                        output.accept(ModItems.GARLIC_CLOVE.get());
                        output.accept(ModItems.ROASTED_GARLIC_CLOVE.get());
                        output.accept(ModItems.ZUCCHINI_SLICE.get());
                        output.accept(ModItems.ROASTED_ZUCCHINI.get());

                        output.accept(ModItems.POTATO_NOODLE.get());
                        output.accept(ModItems.SWEET_POTATO_DOUGH.get());

                        output.accept(ModItems.RAW_VEGETARIAN_PATTY.get());
                        output.accept(ModItems.COOKED_VEGETARIAN_PATTY.get());

                        // Desserts
                        output.accept(ModItems.BEETROOT_BROWNIE_TRAY.get());
                        output.accept(ModItems.BEETROOT_BROWNIE.get());
                        output.accept(ModItems.CARROT_CAKE.get());
                        output.accept(ModItems.CARROT_CAKE_SLICE.get());
                        output.accept(ModItems.SWEET_POTATO_PIE.get());
                        output.accept(ModItems.SWEET_POTATO_PIE_SLICE.get());
                        output.accept(ModItems.SWEET_POTATO_CUPCAKE.get());
                        output.accept(ModItems.SWEET_POTATO_PANCAKES.get());

                        // Salads
                        output.accept(ModItems.BROCCOLI_SALAD.get());
                        output.accept(ModItems.CESAR_SALAD.get());
                        output.accept(ModItems.COLESLAW.get());
                        output.accept(ModItems.TURNIP_SALAD.get());

                        // Snacks & Baked Goods
                        output.accept(ModItems.CAULIFLOWER_BREAD.get());
                        output.accept(ModItems.GARLIC_BREAD.get());
                        output.accept(ModItems.GARLIC_STUFFED_MUSHROOMS.get());
                        output.accept(ModItems.TURNIP_MUTTON_SKEWER.get());
                        output.accept(ModItems.CHICKEN_FAJITAS_WRAP.get());
                        output.accept(ModItems.VEGETABLES_WRAP.get());
                        output.accept(ModItems.VEGETARIAN_BURGER.get());
                        output.accept(ModItems.ZUCCHINI_SANDWICH.get());
                        output.accept(ModItems.UNCOOKED_MHADJEB.get());
                        output.accept(ModItems.MHADJEB.get());
                        output.accept(ModItems.VEGAN_PIZZA.get());
                        output.accept(ModItems.VEGAN_PIZZA_SLICE.get());
                        output.accept(ModItems.ZUCCHINI_QUICHE.get());
                        output.accept(ModItems.ZUCCHINI_QUICHE_SLICE.get());
                        output.accept(ModItems.STUFFED_ZUCCHINI_BOAT.get());

                        // Soups & Bowled Meals
                        output.accept(ModItems.BROCCOLI_SOUP.get());
                        output.accept(ModItems.CAULIFLOWER_SOUP.get());
                        output.accept(ModItems.GARLIC_CHICKEN_STEW.get());
                        output.accept(ModItems.TURNIP_BEEF_STEW.get());
                        output.accept(ModItems.CACCIATORE.get());
                        output.accept(ModItems.MASHED_POTATOES.get());
                        output.accept(ModItems.POTATO_NOODLES.get());

                        // Plated Meals
                        output.accept(ModItems.DANDELION_AND_EGGS.get());
                        output.accept(ModItems.CAULIFLOWER_KUKU.get());
                        output.accept(ModItems.TURNIP_CAKE.get());
                        output.accept(ModItems.RICE_AND_VEGETABLES.get());
                        output.accept(ModItems.ROASTED_VEGETABLES.get());
                        output.accept(ModItems.SHAKSHOUKA.get());
                        output.accept(ModItems.PASTA_WITH_BROCCOLI.get());
                        output.accept(ModItems.GARLIC_RICE_WITH_CAULIFLOWER.get());
                        output.accept(ModItems.STEAK_AND_BROCCOLI.get());
                        output.accept(ModItems.FISH_AND_CHIPS.get());
                        output.accept(ModItems.GARLIC_BAKED_COD.get());
                        output.accept(ModItems.STUFFED_ZUCCHINIS.get());

                        // Feasts
                        output.accept(ModItems.LASAGNA_PAN.get());
                        output.accept(ModItems.LASAGNA_SLICE.get());
                        output.accept(ModItems.STUFFED_BELLPEPPERS_BLOCK.get());
                        output.accept(ModItems.STUFFED_BELLPEPPER.get());
                    })
                    .build()
    );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
