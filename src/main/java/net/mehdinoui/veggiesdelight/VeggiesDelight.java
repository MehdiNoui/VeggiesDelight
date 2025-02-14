package net.mehdinoui.veggiesdelight;

import com.mojang.logging.LogUtils;
import net.mehdinoui.veggiesdelight.block.ModBlocks;
import net.mehdinoui.veggiesdelight.item.ModItems;
import net.mehdinoui.veggiesdelight.registry.ModCreativeModeTabs;
import net.mehdinoui.veggiesdelight.world.VillageStructures;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraft.world.entity.animal.Pig;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.crafting.CompoundIngredient;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import java.util.Arrays;
import java.util.List;


@Mod(VeggiesDelight.MOD_ID)
public class VeggiesDelight
{
    public static final String MOD_ID = "veggiesdelight";
    private static final Logger LOGGER = LogUtils.getLogger();

    public VeggiesDelight()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTabs.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Configuration.CONFIG);

        MinecraftForge.EVENT_BUS.addListener(VillageStructures::addNewVillageBuilding);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        event.enqueueWork(() -> {});
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEventSubscriber {
        @SubscribeEvent
        public static void onCommonSetup(FMLCommonSetupEvent event) {
            event.enqueueWork(() -> {
                    //10%
                    ComposterBlock.COMPOSTABLES.put(ModItems.GARLIC_CLOVE.get(),0.1F);

                    //30%
                    ComposterBlock.COMPOSTABLES.put(ModItems.BELLPEPPER_SEEDS.get(), 0.3F);
                    ComposterBlock.COMPOSTABLES.put(ModItems.CAULIFLOWER_SEEDS.get(), 0.3F);
                    ComposterBlock.COMPOSTABLES.put(ModItems.CAULIFLOWER_FLORET.get(), 0.3F);
                    ComposterBlock.COMPOSTABLES.put(ModItems.GARLIC_SEEDS.get(),0.3F);
                    ComposterBlock.COMPOSTABLES.put(ModItems.GARLIC_CLOVE.get(),0.3F);
                    ComposterBlock.COMPOSTABLES.put(ModItems.DANDELION_LEAF.get(),0.3F);

                    //65%
                    ComposterBlock.COMPOSTABLES.put(ModItems.SWEET_POTATO.get(), 0.65F);
                    ComposterBlock.COMPOSTABLES.put(ModItems.BELLPEPPER.get(), 0.65F);
                    ComposterBlock.COMPOSTABLES.put(ModItems.GARLIC.get(),0.65F);
                    ComposterBlock.COMPOSTABLES.put(ModItems.CAULIFLOWER.get(), 0.65F);
                    ComposterBlock.COMPOSTABLES.put(ModBlocks.WILD_BELLPEPPERS.get(), 0.65F);
                    ComposterBlock.COMPOSTABLES.put(ModBlocks.WILD_CAULIFLOWERS.get(), 0.65F);
                    ComposterBlock.COMPOSTABLES.put(ModBlocks.WILD_GARLIC.get(), 0.65F);
                    ComposterBlock.COMPOSTABLES.put(ModBlocks.WILD_SWEET_POTATOES.get(), 0.65F);
                    // 85%
                    ComposterBlock.COMPOSTABLES.put(ModItems.BEETROOT_BROWNIE.get(), 0.85F);
                    ComposterBlock.COMPOSTABLES.put(ModItems.VEGAN_PIZZA_SLICE.get(), 0.85F);
                    ComposterBlock.COMPOSTABLES.put(ModItems.SWEET_POTATO_PIE_SLICE.get(), 0.85F);
                    ComposterBlock.COMPOSTABLES.put(ModItems.POTATO_NOODLE.get(), 0.85F);
                    ComposterBlock.COMPOSTABLES.put(ModItems.CAULIFLOWER_PATTY.get(), 0.85F);
                    ComposterBlock.COMPOSTABLES.put(ModItems.UNCOOKED_MHADJEB.get(), 0.85F);
                    //100%
                    ComposterBlock.COMPOSTABLES.put(ModItems.VEGAN_PIZZA.get(), 1F);
                    ComposterBlock.COMPOSTABLES.put(ModItems.SWEET_POTATO_PIE.get(), 1F);
                    ComposterBlock.COMPOSTABLES.put(ModItems.BEETROOT_BROWNIE_TRAY.get(), 0.1F);
                    ComposterBlock.COMPOSTABLES.put(ModItems.MHADJEB.get(), 1F);

                Ingredient newPigFood = Ingredient.of(ModItems.BELLPEPPER.get(), ModItems.SWEET_POTATO.get());
                Pig.FOOD_ITEMS = new CompoundIngredient(Arrays.asList(Pig.FOOD_ITEMS, newPigFood)) {};

                Ingredient newChickenFood = Ingredient.of(ModItems.BELLPEPPER_SEEDS.get(), ModItems.CAULIFLOWER_SEEDS.get(), ModItems.GARLIC_SEEDS.get());
                Chicken.FOOD_ITEMS = new CompoundIngredient(Arrays.asList(Chicken.FOOD_ITEMS, newChickenFood)) {};


            });
        }
    }

    @Mod.EventBusSubscriber(modid = MOD_ID)
    public static class newSubscriber {
        public newSubscriber() {
            MinecraftForge.EVENT_BUS.register(this);
        }

        @SubscribeEvent
        public static void onVillagerTrades(VillagerTradesEvent event) {
            if (Configuration.ENABLE_VILLAGER_TRADES.get()) {

                if (event.getType() == VillagerProfession.FARMER) {
                    List<VillagerTrades.ItemListing> level1Trades = event.getTrades().get(1);
                    List<VillagerTrades.ItemListing> level2Trades = event.getTrades().get(2);

                    level1Trades.add((entity, random) -> new MerchantOffer(
                            new ItemStack(ModItems.BELLPEPPER.get(), 26), // Soybean in quantity
                            new ItemStack(Items.EMERALD, 1), // Resulting Emeralds
                            12, // Max uses
                            3, // Villager XP
                            0.05f // Price multiplier
                    ));

                    level1Trades.add((entity, random) -> new MerchantOffer(
                            new ItemStack(ModItems.GARLIC.get(), 26), // Soybean in quantity
                            new ItemStack(Items.EMERALD, 1), // Resulting Emeralds
                            12, // Max uses
                            3, // Villager XP
                            0.05f // Price multiplier
                    ));
                    level1Trades.add((entity, random) -> new MerchantOffer(
                            new ItemStack(ModItems.SWEET_POTATO.get(), 26), // Soybean in quantity
                            new ItemStack(Items.EMERALD, 1), // Resulting Emeralds
                            12, // Max uses
                            3, // Villager XP
                            0.05f // Price multiplier
                    ));
                    level2Trades.add((entity, random) -> new MerchantOffer(
                            new ItemStack(ModItems.CAULIFLOWER.get(), 18), // Soybean in quantity
                            new ItemStack(Items.EMERALD, 1), // Resulting Emeralds
                            12, // Max uses
                            7, // Villager XP
                            0.05f // Price multiplier
                    ));
                }
            }
        }
    }
}
