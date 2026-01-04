package net.mehdinoui.veggiesdelight.common.event;

import net.mehdinoui.veggiesdelight.Configuration;
import net.mehdinoui.veggiesdelight.VeggiesDelight;
import net.mehdinoui.veggiesdelight.common.registry.ModItems;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.ItemCost;
import net.minecraft.world.item.trading.MerchantOffer;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.BasicItemListing;
import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.neoforge.event.village.WandererTradesEvent;

import java.util.List;

@EventBusSubscriber(modid = VeggiesDelight.MOD_ID)
public class ModVillagerEvents {
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
