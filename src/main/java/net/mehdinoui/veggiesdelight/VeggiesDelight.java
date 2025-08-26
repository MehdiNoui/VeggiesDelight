package net.mehdinoui.veggiesdelight;

import com.mojang.logging.LogUtils;
import net.mehdinoui.veggiesdelight.common.block.ModBlocks;
import net.mehdinoui.veggiesdelight.common.item.ModItems;
import net.mehdinoui.veggiesdelight.registry.ModCreativeModeTabs;
import net.mehdinoui.veggiesdelight.world.VillageStructures;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.ItemCost;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraft.world.level.block.ComposterBlock;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.BasicItemListing;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.neoforge.event.village.WandererTradesEvent;
import org.slf4j.Logger;

import java.util.List;

import static net.neoforged.neoforge.common.NeoForge.EVENT_BUS;

@Mod(VeggiesDelight.MOD_ID)
public class VeggiesDelight
{
    public static final String MOD_ID = "veggiesdelight";
    private static final Logger LOGGER = LogUtils.getLogger();

    public VeggiesDelight(IEventBus modEventBus, ModContainer modContainer)
    {
        modEventBus.addListener(this::commonSetup);

        ModCreativeModeTabs.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        modContainer.registerConfig(ModConfig.Type.COMMON, Configuration.CONFIG);

        EVENT_BUS.addListener(VillageStructures::addNewVillageBuilding);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {}

    @EventBusSubscriber(modid = MOD_ID)
    public static class ModEventSubscriber {
        @SubscribeEvent
        public static void onCommonSetup(FMLCommonSetupEvent event) {
            event.enqueueWork(() -> {
                //10%
                ComposterBlock.COMPOSTABLES.put(ModItems.GARLIC_CLOVE.get(),0.1F);
                //30%
                ComposterBlock.COMPOSTABLES.put(ModItems.BELLPEPPER_SEEDS.get(), 0.3F);
                ComposterBlock.COMPOSTABLES.put(ModItems.BROCCOLI_SEEDS.get(), 0.3F);
                ComposterBlock.COMPOSTABLES.put(ModItems.CAULIFLOWER_SEEDS.get(), 0.3F);
                ComposterBlock.COMPOSTABLES.put(ModItems.CAULIFLOWER_FLORET.get(), 0.3F);
                ComposterBlock.COMPOSTABLES.put(ModItems.DANDELION_LEAF.get(),0.3F);
                ComposterBlock.COMPOSTABLES.put(ModItems.TURNIP_SEEDS.get(), 0.3F);
                ComposterBlock.COMPOSTABLES.put(ModItems.ZUCCHINI_SEEDS.get(), 0.3F);
                //65%
                ComposterBlock.COMPOSTABLES.put(ModItems.BELLPEPPER.get(), 0.65F);
                ComposterBlock.COMPOSTABLES.put(ModItems.BROCCOLI.get(), 0.65F);
                ComposterBlock.COMPOSTABLES.put(ModItems.CAULIFLOWER.get(), 0.65F);
                ComposterBlock.COMPOSTABLES.put(ModItems.GARLIC.get(),0.65F);
                ComposterBlock.COMPOSTABLES.put(ModItems.SWEET_POTATO.get(), 0.65F);
                ComposterBlock.COMPOSTABLES.put(ModItems.TURNIP.get(), 0.65F);
                ComposterBlock.COMPOSTABLES.put(ModItems.ZUCCHINI.get(), 0.65F);
                ComposterBlock.COMPOSTABLES.put(ModBlocks.WILD_BELLPEPPERS.get().asItem(), 0.65F);
                ComposterBlock.COMPOSTABLES.put(ModBlocks.WILD_BROCCOLI.get().asItem(), 0.65F);
                ComposterBlock.COMPOSTABLES.put(ModBlocks.WILD_CAULIFLOWERS.get().asItem(), 0.65F);
                ComposterBlock.COMPOSTABLES.put(ModBlocks.WILD_GARLIC.get().asItem(), 0.65F);
                ComposterBlock.COMPOSTABLES.put(ModBlocks.WILD_SWEET_POTATOES.get().asItem(), 0.65F);
                ComposterBlock.COMPOSTABLES.put(ModBlocks.WILD_TURNIPS.get().asItem(), 0.65F);
                ComposterBlock.COMPOSTABLES.put(ModBlocks.WILD_ZUCCHINIS.get().asItem(), 0.65F);
                ComposterBlock.COMPOSTABLES.put(ModBlocks.MATURE_DANDELION.get().asItem(), 0.65F);
                //85%
                ComposterBlock.COMPOSTABLES.put(ModItems.BEETROOT_BROWNIE.get(), 0.85F);
                ComposterBlock.COMPOSTABLES.put(ModItems.VEGAN_PIZZA_SLICE.get(), 0.85F);
                ComposterBlock.COMPOSTABLES.put(ModItems.SWEET_POTATO_PIE_SLICE.get(), 0.85F);
                ComposterBlock.COMPOSTABLES.put(ModItems.CARROT_CAKE_SLICE.get(), 0.85F);
                ComposterBlock.COMPOSTABLES.put(ModItems.POTATO_NOODLE.get(), 0.85F);
                ComposterBlock.COMPOSTABLES.put(ModItems.CAULIFLOWER_PATTY.get(), 0.85F);
                ComposterBlock.COMPOSTABLES.put(ModItems.UNCOOKED_MHADJEB.get(), 0.85F);
                ComposterBlock.COMPOSTABLES.put(ModItems.SWEET_POTATO_DOUGH.get(), 0.85F);
                ComposterBlock.COMPOSTABLES.put(ModItems.SWEET_POTATO_CUPCAKE.get(), 0.85F);
                //100%
                ComposterBlock.COMPOSTABLES.put(ModItems.VEGAN_PIZZA.get(), 1F);
                ComposterBlock.COMPOSTABLES.put(ModItems.SWEET_POTATO_PIE.get(), 1F);
                ComposterBlock.COMPOSTABLES.put(ModItems.BEETROOT_BROWNIE_TRAY.get(), 1F);
                ComposterBlock.COMPOSTABLES.put(ModItems.CARROT_CAKE.get(), 1F);
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
}
