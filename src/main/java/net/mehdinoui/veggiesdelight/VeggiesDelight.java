package net.mehdinoui.veggiesdelight;

import net.mehdinoui.veggiesdelight.common.registry.ModBlocks;
import net.mehdinoui.veggiesdelight.common.registry.ModItems;
import net.mehdinoui.veggiesdelight.common.registry.ModCreativeModeTabs;
import net.mehdinoui.veggiesdelight.common.world.VillageStructures;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.bus.api.IEventBus;

import static net.neoforged.neoforge.common.NeoForge.EVENT_BUS;

@Mod(VeggiesDelight.MOD_ID)
public class VeggiesDelight
{
    public static final String MOD_ID = "veggiesdelight";

    public VeggiesDelight(IEventBus modEventBus, ModContainer modContainer)
    {
        ModCreativeModeTabs.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        modContainer.registerConfig(ModConfig.Type.COMMON, Configuration.CONFIG);

        EVENT_BUS.addListener(VillageStructures::addNewVillageBuilding);
    }
}
