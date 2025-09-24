package net.mehdinoui.veggiesdelight;

import com.mojang.logging.LogUtils;
import net.mehdinoui.veggiesdelight.registry.ModBlocks;
import net.mehdinoui.veggiesdelight.registry.ModItems;
import net.mehdinoui.veggiesdelight.registry.ModCreativeModeTabs;
import net.mehdinoui.veggiesdelight.world.VillageStructures;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(VeggiesDelight.MOD_ID)
public class VeggiesDelight {
    public static final String MOD_ID = "veggiesdelight";
    private static final Logger LOGGER = LogUtils.getLogger();

    public VeggiesDelight() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTabs.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Configuration.CONFIG);

        MinecraftForge.EVENT_BUS.addListener(VillageStructures::addNewVillageBuilding);
        MinecraftForge.EVENT_BUS.register(this);
    }
}
