package net.mehdinoui.veggiesdelight;

import com.mojang.logging.LogUtils;
import net.mehdinoui.veggiesdelight.block.ModBlocks;
import net.mehdinoui.veggiesdelight.item.ModItems;
import net.mehdinoui.veggiesdelight.item.ModCreativeModeTabs;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import java.util.List;

// The value here should match an entry in the META-INF/mods.toml file
//testing

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

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ComposterBlock.COMPOSTABLES.put(ModItems.SWEET_POTATO.get(), 0.4F);
            ComposterBlock.COMPOSTABLES.put(ModItems.BELLPEPPER.get(), 0.4F);
            ComposterBlock.COMPOSTABLES.put(ModItems.BELLPEPPER_SEEDS.get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModItems.CAULIFLOWER_FLORET.get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModItems.CAULIFLOWER_SEEDS.get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModItems.CAULIFLOWER.get(), 0.6F);
        });
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
        }
    }

    @Mod.EventBusSubscriber(modid = MOD_ID)
    public static class newSubscriber {
        public newSubscriber() {
            MinecraftForge.EVENT_BUS.register(this);
        }
        @SubscribeEvent
        public static void onVillagerTrades(VillagerTradesEvent event) {
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
