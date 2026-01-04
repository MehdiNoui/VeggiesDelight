package net.mehdinoui.veggiesdelight.data;

import net.mehdinoui.veggiesdelight.common.registry.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DataMapProvider;
import net.neoforged.neoforge.registries.datamaps.builtin.Compostable;
import net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps;

import java.util.concurrent.CompletableFuture;

public class ModCompostablesDataMap extends DataMapProvider {
    protected ModCompostablesDataMap(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider);
    }
    @Override
    protected void gather(HolderLookup.Provider provider) {
        builder(NeoForgeDataMaps.COMPOSTABLES)
                // 10% chance
                .add(ModItems.GARLIC_CLOVE.get().asItem().builtInRegistryHolder(), new Compostable(0.1F), false)
                // 30% chance
                .add(ModItems.BELLPEPPER_SEEDS.get().asItem().builtInRegistryHolder(), new Compostable(0.3F), false)
                .add(ModItems.BROCCOLI_SEEDS.get().asItem().builtInRegistryHolder(), new Compostable(0.3F), false)
                .add(ModItems.CAULIFLOWER_SEEDS.get().asItem().builtInRegistryHolder(), new Compostable(0.3F), false)
                .add(ModItems.CAULIFLOWER_FLORET.get().asItem().builtInRegistryHolder(), new Compostable(0.3F), false)
                .add(ModItems.DANDELION_LEAF.get().asItem().builtInRegistryHolder(), new Compostable(0.3F), false)
                .add(ModItems.TURNIP_SEEDS.get().asItem().builtInRegistryHolder(), new Compostable(0.3F), false)
                .add(ModItems.ZUCCHINI_SEEDS.get().asItem().builtInRegistryHolder(), new Compostable(0.3F), false)
                // 65% chance
                .add(ModItems.BELLPEPPER.get().asItem().builtInRegistryHolder(), new Compostable(0.65F), false)
                .add(ModItems.BROCCOLI.get().asItem().builtInRegistryHolder(), new Compostable(0.65F), false)
                .add(ModItems.CAULIFLOWER.get().asItem().builtInRegistryHolder(), new Compostable(0.65F), false)
                .add(ModItems.GARLIC.get().asItem().builtInRegistryHolder(), new Compostable(0.65F), false)
                .add(ModItems.SWEET_POTATO.get().asItem().builtInRegistryHolder(), new Compostable(0.65F), false)
                .add(ModItems.TURNIP.get().asItem().builtInRegistryHolder(), new Compostable(0.65F), false)
                .add(ModItems.ZUCCHINI.get().asItem().builtInRegistryHolder(), new Compostable(0.65F), false)
                .add(ModItems.MATURE_DANDELION.get().asItem().builtInRegistryHolder(), new Compostable(0.65F), false)
                .add(ModItems.WILD_BELLPEPPERS.get().asItem().builtInRegistryHolder(), new Compostable(0.65F), false)
                .add(ModItems.WILD_BROCCOLI.get().asItem().builtInRegistryHolder(), new Compostable(0.65F), false)
                .add(ModItems.WILD_CAULIFLOWERS.get().asItem().builtInRegistryHolder(), new Compostable(0.65F), false)
                .add(ModItems.WILD_GARLIC.get().asItem().builtInRegistryHolder(), new Compostable(0.65F), false)
                .add(ModItems.WILD_SWEET_POTATOES.get().asItem().builtInRegistryHolder(), new Compostable(0.65F), false)
                .add(ModItems.WILD_TURNIPS.get().asItem().builtInRegistryHolder(), new Compostable(0.65F), false)
                .add(ModItems.WILD_ZUCCHINIS.get().asItem().builtInRegistryHolder(), new Compostable(0.65F), false)
                // 85% chance
                .add(ModItems.BEETROOT_BROWNIE.get().asItem().builtInRegistryHolder(), new Compostable(0.85F), false)
                .add(ModItems.CARROT_CAKE_SLICE.get().asItem().builtInRegistryHolder(), new Compostable(0.85F), false)
                .add(ModItems.SWEET_POTATO_PIE_SLICE.get().asItem().builtInRegistryHolder(), new Compostable(0.85F), false)
                .add(ModItems.VEGAN_PIZZA_SLICE.get().asItem().builtInRegistryHolder(), new Compostable(0.85F), false)
                .add(ModItems.ZUCCHINI_QUICHE_SLICE.get().asItem().builtInRegistryHolder(), new Compostable(0.85F), false) // Added missing item
                .add(ModItems.POTATO_NOODLE.get().asItem().builtInRegistryHolder(), new Compostable(0.85F), false)
                .add(ModItems.RAW_VEGETARIAN_PATTY.get().asItem().builtInRegistryHolder(), new Compostable(0.85F), false)
                .add(ModItems.SWEET_POTATO_CUPCAKE.get().asItem().builtInRegistryHolder(), new Compostable(0.85F), false)
                .add(ModItems.SWEET_POTATO_DOUGH.get().asItem().builtInRegistryHolder(), new Compostable(0.85F), false)
                .add(ModItems.UNCOOKED_MHADJEB.get().asItem().builtInRegistryHolder(), new Compostable(0.85F), false)
                // 100% chance
                .add(ModItems.BEETROOT_BROWNIE_TRAY.get().asItem().builtInRegistryHolder(), new Compostable(1.0F), false)
                .add(ModItems.CARROT_CAKE.get().asItem().builtInRegistryHolder(), new Compostable(1.0F), false)
                .add(ModItems.SWEET_POTATO_PIE.get().asItem().builtInRegistryHolder(), new Compostable(1.0F), false)
                .add(ModItems.VEGAN_PIZZA.get().asItem().builtInRegistryHolder(), new Compostable(1.0F), false)
                .add(ModItems.ZUCCHINI_QUICHE.get().asItem().builtInRegistryHolder(), new Compostable(1.0F), false); // Added missing item
    }
}