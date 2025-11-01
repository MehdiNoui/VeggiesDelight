package net.mehdinoui.veggiesdelight.world;

import com.mojang.datafixers.util.Pair;
import net.mehdinoui.veggiesdelight.Configuration;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.structure.pools.SinglePoolElement;
import net.minecraft.world.level.levelgen.structure.pools.StructurePoolElement;
import net.minecraft.world.level.levelgen.structure.pools.StructureTemplatePool;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessorList;
import net.minecraftforge.event.server.ServerAboutToStartEvent;
import net.minecraftforge.fml.ModList;

import java.util.ArrayList;
import java.util.List;

public class VillageStructures
{
    public static void addNewVillageBuilding(final ServerAboutToStartEvent event) {
        if (!Configuration.GENERATE_VILLAGE_STRUCTURES.get()) {
            return;
        }
        Registry<StructureTemplatePool> templatePools = event.getServer().registryAccess().registry(Registries.TEMPLATE_POOL).get();
        Registry<StructureProcessorList> processorLists = event.getServer().registryAccess().registry(Registries.PROCESSOR_LIST).get();
        // -- Villages
        // Vanilla Villages
        if (Configuration.GENERATE_VANILLA_VS.get()) {
            // Plains Village
            VillageStructures.addBuildingToPool(templatePools, processorLists,
                    new ResourceLocation("minecraft:village/plains/houses"),
                    "veggiesdelight:village/houses/plains_depot_house", 4);
            // Snowy Village
            VillageStructures.addBuildingToPool(templatePools, processorLists,
                    new ResourceLocation("minecraft:village/snowy/houses"),
                    "veggiesdelight:village/houses/snowy_depot_house", 5);
            // Taiga Village
            VillageStructures.addBuildingToPool(templatePools, processorLists,
                    new ResourceLocation("minecraft:village/taiga/houses"),
                    "veggiesdelight:village/houses/taiga_depot_house", 5);
            // Savanna Village
            VillageStructures.addBuildingToPool(templatePools, processorLists,
                    new ResourceLocation("minecraft:village/savanna/houses"),
                    "veggiesdelight:village/houses/savanna_depot_house", 4);
            // Desert Village
            VillageStructures.addBuildingToPool(templatePools, processorLists,
                    new ResourceLocation("minecraft:village/desert/houses"),
                    "veggiesdelight:village/houses/desert_depot_house", 4);
        }
        // Atmospheric Villages Compat
        if (ModList.get().isLoaded("atmospheric")) {
            if (Configuration.GENERATE_COMPAT_ATMOSPHERIC_VS.get()) {
                // Scrubland Village
                VillageStructures.addBuildingToPool(
                        templatePools, processorLists,
                        new ResourceLocation("atmospheric:village/scrubland/houses"),
                        "veggiesdelight:village/houses/scrubland_depot_house", 4);
            }
        }
        // Nature's Spirit Villages Compat
        if (ModList.get().isLoaded("natures_spirit")) {
            if (Configuration.GENERATE_COMPAT_NATURESPIRIT_VS.get()) {
                // Adobe Village
                VillageStructures.addBuildingToPool(
                        templatePools, processorLists,
                        new ResourceLocation("natures_spirit:village/adobe/adobe_houses_layer_1_back"),
                        "veggiesdelight:village/houses/adobe_depot_house", 4);
                // Coconut Village
                VillageStructures.addBuildingToPool(
                        templatePools, processorLists,
                        new ResourceLocation("natures_spirit:village/coconut/houses"),
                        "veggiesdelight:village/houses/coconut_depot_house", 4);
                // Cypress Village
                VillageStructures.addBuildingToPool(
                        templatePools, processorLists,
                        new ResourceLocation("natures_spirit:village/cypress/houses"),
                        "veggiesdelight:village/houses/cypress_depot_house", 4);
                // Wisteria Village
                VillageStructures.addBuildingToPool(
                        templatePools, processorLists,
                        new ResourceLocation("natures_spirit:village/wisteria/houses"),
                        "veggiesdelight:village/houses/wisteria_depot_house", 4);
            }
        }
        // Windswept Villages Compat
        if (ModList.get().isLoaded("windswept")) {
            if (Configuration.GENERATE_COMPAT_WINDSWEPT_VS.get()) {
                // Frozen Village
                VillageStructures.addBuildingToPool(
                        templatePools, processorLists,
                        new ResourceLocation("windswept:village/frozen/houses"),
                        "veggiesdelight:village/houses/frozen_depot_house", 4);
            }
        }
        // -- Others
        // Explorify Compat
        if (ModList.get().isLoaded("explorify")) {
            if (Configuration.GENERATE_COMPAT_DARK_FOREST_SETTLEMENT_VS.get()) {
                VillageStructures.addBuildingToPool(
                        templatePools, processorLists,
                        new ResourceLocation("explorify:dark_forest_settlement/house"),
                        "veggiesdelight:dark_forest_settlement/house/dark_forest_settlement_depot_house", 4);
            }
        }
    }

    public static void addBuildingToPool(Registry<StructureTemplatePool> templatePoolRegistry, Registry<StructureProcessorList> processorListRegistry, ResourceLocation poolRL, String nbtPieceRL, int weight) {
        StructureTemplatePool pool = templatePoolRegistry.get(poolRL);
        if (pool == null) return;

        ResourceLocation emptyProcessor = new ResourceLocation("minecraft", "empty");
        Holder<StructureProcessorList> processorHolder = processorListRegistry.getHolderOrThrow(ResourceKey.create(Registries.PROCESSOR_LIST, emptyProcessor));

        SinglePoolElement piece = SinglePoolElement.single(nbtPieceRL, processorHolder).apply(StructureTemplatePool.Projection.RIGID);

        for (int i = 0; i < weight; i++) {
            pool.templates.add(piece);
        }

        List<Pair<StructurePoolElement, Integer>> listOfPieceEntries = new ArrayList<>(pool.rawTemplates);
        listOfPieceEntries.add(new Pair<>(piece, weight));
        pool.rawTemplates = listOfPieceEntries;
    }
}
