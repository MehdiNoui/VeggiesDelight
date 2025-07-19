package net.mehdinoui.veggiesdelight.registry;

import net.mehdinoui.veggiesdelight.VeggiesDelight;
import net.mehdinoui.veggiesdelight.block.ModBlocks;
import net.mehdinoui.veggiesdelight.item.ModItems;
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

                        // Crops
                        output.accept(ModItems.BELLPEPPER.get());
                        output.accept(ModItems.CAULIFLOWER.get());
                        output.accept(ModItems.DANDELION_LEAF.get());
                        output.accept(ModItems.GARLIC.get());
                        output.accept(ModItems.SWEET_POTATO.get());

                        // Seeds
                        output.accept(ModItems.BELLPEPPER_SEEDS.get());
                        output.accept(ModItems.CAULIFLOWER_SEEDS.get());

                        // Storage Crates
                        output.accept(ModBlocks.BELLPEPPER_CRATE.get());
                        output.accept(ModBlocks.CAULIFLOWER_CRATE.get());
                        output.accept(ModBlocks.GARLIC_CRATE.get());
                        output.accept(ModBlocks.SWEET_POTATO_CRATE.get());

                        // Basic Ingredients
                        output.accept(ModItems.GARLIC_CLOVE.get());
                        output.accept(ModItems.ROASTED_GARLIC_CLOVE.get());
                        output.accept(ModItems.SMOKED_BELLPEPPER.get());
                        output.accept(ModItems.CAULIFLOWER_FLORET.get());
                        output.accept(ModItems.FRIED_CAULIFLOWER_FLORET.get());
                        output.accept(ModItems.BAKED_SWEET_POTATO.get());

                        // Dough & Noodles
                        output.accept(ModItems.SWEET_POTATO_DOUGH.get());
                        output.accept(ModItems.POTATO_NOODLE.get());

                        // Snacks & Baked Goods
                        output.accept(ModItems.CAULIFLOWER_BREAD.get());
                        output.accept(ModItems.CAULIFLOWER_PATTY.get());
                        output.accept(ModItems.COOKED_CAULIFLOWER_PATTY.get());
                        output.accept(ModItems.CAULIFLOWER_BURGER.get());
                        output.accept(ModItems.CHICKEN_FAJITAS_WRAP.get());
                        output.accept(ModItems.GARLIC_BREAD.get());
                        output.accept(ModItems.GARLIC_STUFFED_MUSHROOMS.get());
                        output.accept(ModItems.UNCOOKED_MHADJEB.get());
                        output.accept(ModItems.MHADJEB.get());

                        // Drinks
                        output.accept(ModItems.CARROT_JUICE.get());
                        output.accept(ModItems.DANDELION_JUICE.get());
                        output.accept(ModItems.FERMENTED_GARLIC_HONEY.get());

                        // Desserts
                        output.accept(ModItems.SWEET_POTATO_CUPCAKE.get());
                        output.accept(ModItems.SWEET_POTATO_PIE.get());
                        output.accept(ModItems.SWEET_POTATO_PIE_SLICE.get());
                        output.accept(ModItems.VEGAN_PIZZA.get());
                        output.accept(ModItems.VEGAN_PIZZA_SLICE.get());
                        output.accept(ModItems.BEETROOT_BROWNIE_TRAY.get());
                        output.accept(ModItems.BEETROOT_BROWNIE.get());
                        output.accept(ModItems.CARROT_CAKE.get());
                        output.accept(ModItems.CARROT_CAKE_SLICE.get());

                        // Soups & Stews
                        output.accept(ModItems.CACCIATORE.get());
                        output.accept(ModItems.CAULIFLOWER_SOUP.get());
                        output.accept(ModItems.GARLIC_CHICKEN_STEW.get());
                        output.accept(ModItems.MASHED_POTATOES.get());
                        output.accept(ModItems.POTATO_NOODLES.get());

                        // Meals
                        output.accept(ModItems.CESAR_SALAD.get());
                        output.accept(ModItems.FISH_AND_CHIPS.get());
                        output.accept(ModItems.DANDELION_AND_EGGS.get());
                        output.accept(ModItems.GARLIC_BAKED_COD.get());
                        output.accept(ModItems.GARLIC_RICE_WITH_CAULIFLOWER.get());
                        output.accept(ModItems.SHAKSHOUKA.get());
                        output.accept(ModItems.ROASTED_VEGETABLES.get());
                        output.accept(ModItems.STUFFED_BELLPEPPERS.get());
                        output.accept(ModItems.SWEET_POTATO_MOCHI.get());
                        output.accept(ModItems.WHOLE_ROASTED_CAULIFLOWER.get());

                        // Wild Plants
                        output.accept(ModBlocks.MATURE_DANDELION.get());
                        output.accept(ModBlocks.WILD_BELLPEPPERS.get());
                        output.accept(ModBlocks.WILD_CAULIFLOWERS.get());
                        output.accept(ModBlocks.WILD_GARLIC.get());
                        output.accept(ModBlocks.WILD_SWEET_POTATOES.get());
                    })
                    .build()
    );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
