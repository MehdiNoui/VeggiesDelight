package net.mehdinoui.veggiesdelight.common.event;

import net.mehdinoui.veggiesdelight.Configuration;
import net.mehdinoui.veggiesdelight.VeggiesDelight;
import net.mehdinoui.veggiesdelight.common.registry.ModItems;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.ItemCost;
import net.minecraft.world.item.trading.MerchantOffer;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.BasicItemListing;
import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.neoforge.event.village.WandererTradesEvent;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@EventBusSubscriber(modid = VeggiesDelight.MOD_ID)
public class ModVillagerEvents {
    @SubscribeEvent
    public static <Map> void onCommonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            // Villager Wanted Items
            Set<Item> wantedItems = new HashSet<>(Villager.WANTED_ITEMS);
            wantedItems.addAll(List.of(
                    ModItems.CAULIFLOWER_BREAD.get(),
                    ModItems.BELLPEPPER.get(),
                    ModItems.BELLPEPPER_SEEDS.get(),
                    ModItems.BROCCOLI.get(),
                    ModItems.BROCCOLI_SEEDS.get(),
                    ModItems.CAULIFLOWER.get(),
                    ModItems.CAULIFLOWER_SEEDS.get(),
                    ModItems.GARLIC.get(),
                    ModItems.GARLIC_CLOVE.get(),
                    ModItems.SWEET_POTATO.get(),
                    ModItems.TURNIP.get(),
                    ModItems.TURNIP_SEEDS.get(),
                    ModItems.ZUCCHINI.get(),
                    ModItems.ZUCCHINI_SLICE.get()
            ));
            Villager.WANTED_ITEMS = ImmutableSet.copyOf(wantedItems);

            // Food Points
            HashMap<Item, Integer> newFoodPoints = new HashMap<>();
            // Bread equivalents get 4 points
            newFoodPoints.put(ModItems.CAULIFLOWER_BREAD.get(), 4);
            // Raw veggies get 1 point
            newFoodPoints.put(ModItems.BELLPEPPER.get(), 1);
            newFoodPoints.put(ModItems.BROCCOLI.get(), 1);
            newFoodPoints.put(ModItems.CAULIFLOWER.get(), 1);
            newFoodPoints.put(ModItems.GARLIC.get(), 1);
            newFoodPoints.put(ModItems.GARLIC_CLOVE.get(), 1);
            newFoodPoints.put(ModItems.SWEET_POTATO.get(), 1);
            newFoodPoints.put(ModItems.TURNIP.get(), 1);
            newFoodPoints.put(ModItems.ZUCCHINI.get(), 1);
            newFoodPoints.put(ModItems.ZUCCHINI_SLICE.get(), 1);
            newFoodPoints.putAll(Villager.FOOD_POINTS);
            Villager.FOOD_POINTS = ImmutableMap.copyOf(newFoodPoints);
        });
    }

    @SubscribeEvent
    public static void onVillagerTrades(VillagerTradesEvent event) {
        if (Configuration.ENABLE_VILLAGER_TRADES.get()) {
            if (event.getType() == VillagerProfession.FARMER) {
                List<VillagerTrades.ItemListing> level1Trades = event.getTrades().get(1);

                level1Trades.add((entity, random) -> new MerchantOffer(
                        new ItemCost(ModItems.BELLPEPPER.get(), 26),
                        new ItemStack(Items.EMERALD, 1),
                        12, // Max uses
                        2, // Villager XP
                        0.05f // Price multiplier
                ));

                level1Trades.add((entity, random) -> new MerchantOffer(
                        new ItemCost(ModItems.BROCCOLI.get(), 26),
                        new ItemStack(Items.EMERALD, 1),
                        12, // Max uses
                        2, // Villager XP
                        0.05f // Price multiplier
                ));

                level1Trades.add((entity, random) -> new MerchantOffer(
                        new ItemCost(ModItems.CAULIFLOWER.get(), 16),
                        new ItemStack(Items.EMERALD, 1),
                        16, // Max uses
                        5, // Villager XP
                        0.05f // Price multiplier
                ));

                level1Trades.add((entity, random) -> new MerchantOffer(
                        new ItemCost(ModItems.GARLIC.get(), 26),
                        new ItemStack(Items.EMERALD, 1),
                        12, // Max uses
                        2, // Villager XP
                        0.05f // Price multiplier
                ));
                level1Trades.add((entity, random) -> new MerchantOffer(
                        new ItemCost(ModItems.SWEET_POTATO.get(), 26),
                        new ItemStack(Items.EMERALD, 1),
                        12, // Max uses
                        2, // Villager XP
                        0.05f // Price multiplier
                ));

                level1Trades.add((entity, random) -> new MerchantOffer(
                        new ItemCost(ModItems.TURNIP.get(), 16),
                        new ItemStack(Items.EMERALD, 1),
                        16, // Max uses
                        5, // Villager XP
                        0.05f // Price multiplier
                ));

                level1Trades.add((entity, random) -> new MerchantOffer(
                        new ItemCost(ModItems.ZUCCHINI.get(), 16),
                        new ItemStack(Items.EMERALD, 1),
                        16, // Max uses
                        5, // Villager XP
                        0.05f // Price multiplier
                ));
            }
        }
    }
    @SubscribeEvent
    public static void onWandererTrades(WandererTradesEvent event) {
        if (Configuration.ENABLE_WANDERING_TRADER_SELLS.get()) {
            List<VillagerTrades.ItemListing> trades = event.getGenericTrades();
            trades.add(new BasicItemListing(1, new ItemStack(ModItems.BELLPEPPER_SEEDS.get()), 12, 1, 0.05f));
            trades.add(new BasicItemListing(1, new ItemStack(ModItems.BROCCOLI_SEEDS.get()), 12, 1, 0.05f));
            trades.add(new BasicItemListing(1, new ItemStack(ModItems.CAULIFLOWER_SEEDS.get()), 12, 1, 0.05f));
            trades.add(new BasicItemListing(1, new ItemStack(ModItems.GARLIC_CLOVE.get()), 12, 1, 0.05f));
            trades.add(new BasicItemListing(1, new ItemStack(ModItems.SWEET_POTATO.get()), 12, 1, 0.05f));
            trades.add(new BasicItemListing(1, new ItemStack(ModItems.TURNIP_SEEDS.get()), 12, 1, 0.05f));
            trades.add(new BasicItemListing(1, new ItemStack(ModItems.ZUCCHINI_SEEDS.get()), 12, 1, 0.05f));
            trades.add(new BasicItemListing(1, new ItemStack(ModItems.DANDELION_LEAF.get()), 12, 1, 0.05f));
        }
    }
}
