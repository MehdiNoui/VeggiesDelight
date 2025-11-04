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
import net.neoforged.fml.ModList;
import net.neoforged.neoforge.event.server.ServerAboutToStartEvent;

import java.util.ArrayList;
import java.util.List;

public class VillageStructures
{
    public static void addNewVillageBuilding(final ServerAboutToStartEvent event) {
        if (!Configuration.GENERATE_VILLAGE_STRUCTURES.get()) {
            return;
        }

        Registry<StructureTemplatePool> templatePools = event.getServer().registryAccess()
                .registry(Registries.TEMPLATE_POOL).get();
        Registry<StructureProcessorList> processorLists = event.getServer().registryAccess()
                .registry(Registries.PROCESSOR_LIST).get();

        // -- Villages
        // Vanilla Villages
        if (Configuration.GENERATE_VANILLA_VS.get()) {
            // Plains Village
            VillageStructures.addBuildingToPool(templatePools, processorLists,
                    ResourceLocation.parse("minecraft:village/plains/houses"),
                    "veggiesdelight:village/houses/plains_depot_house", 4);
            // Snowy Village
            VillageStructures.addBuildingToPool(templatePools, processorLists,
                    ResourceLocation.parse("minecraft:village/snowy/houses"),
                    "veggiesdelight:village/houses/snowy_depot_house", 5);
            // Taiga Village
            VillageStructures.addBuildingToPool(templatePools, processorLists,
                    ResourceLocation.parse("minecraft:village/taiga/houses"),
                    "veggiesdelight:village/houses/taiga_depot_house", 4);
            // Savanna Village
            VillageStructures.addBuildingToPool(templatePools, processorLists,
                    ResourceLocation.parse("minecraft:village/savanna/houses"),
                    "veggiesdelight:village/houses/savanna_depot_house", 4);
            // Desert Village
            VillageStructures.addBuildingToPool(templatePools, processorLists,
                    ResourceLocation.parse("minecraft:village/desert/houses"),
                    "veggiesdelight:village/houses/desert_depot_house", 4);
        }
        // Atmospheric Villages Compat
        if (ModList.get().isLoaded("atmospheric") && Configuration.GENERATE_COMPAT_ATMOSPHERIC_VS.get()) {
            // Scrubland Village
            VillageStructures.addBuildingToPool(templatePools, processorLists,
                    ResourceLocation.parse("atmospheric:village/scrubland/houses"),
                    "veggiesdelight:compat/atmospheric/village/houses/scrubland_depot_house", 4);
        }
        // Nature's Spirit Villages Compat
        if (ModList.get().isLoaded("natures_spirit") && Configuration.GENERATE_COMPAT_NATURESPIRIT_VS.get()) {
            // Adobe Village
            VillageStructures.addBuildingToPool(templatePools, processorLists,
                    ResourceLocation.parse("natures_spirit:village/adobe/adobe_houses_layer_1_back"),
                    "veggiesdelight:compat/natures_spirit/village/houses/adobe_depot_house", 4);
            // Coconut Village
            VillageStructures.addBuildingToPool(templatePools, processorLists,
                    ResourceLocation.parse("natures_spirit:village/coconut/houses"),
                    "veggiesdelight:compat/natures_spirit/village/houses/coconut_depot_house", 4);
            // Cypress Village
            VillageStructures.addBuildingToPool(templatePools, processorLists,
                    ResourceLocation.parse("natures_spirit:village/cypress/houses"),
                    "veggiesdelight:compat/natures_spirit/village/houses/cypress_depot_house", 4);
            // Wisteria Village
            VillageStructures.addBuildingToPool(templatePools, processorLists,
                    ResourceLocation.parse("natures_spirit:village/wisteria/houses"),
                    "veggiesdelight:compat/natures_spirit/village/houses/wisteria_depot_house", 4);
        }
        // Repurposed Structures Villages Compat
        if (ModList.get().isLoaded("repurposed_structures") && Configuration.GENERATE_COMPAT_REPURPOSED_STRUCTURES_VS.get()) {
            // Badlands Village
            VillageStructures.addBuildingToPool(
                    templatePools, processorLists,
                    ResourceLocation.parse("repurposed_structures:villages/badlands/houses"),
                    "veggiesdelight:compat/repurposed_structures/village/houses/badlands_depot_house", 4);
            // Bamboo Village
            VillageStructures.addBuildingToPool(
                    templatePools, processorLists,
                    ResourceLocation.parse("repurposed_structures:villages/bamboo/houses"),
                    "veggiesdelight:compat/repurposed_structures/village/houses/bamboo_depot_house", 4);
            // Birch Village
            VillageStructures.addBuildingToPool(
                    templatePools, processorLists,
                    ResourceLocation.parse("repurposed_structures:villages/birch/houses"),
                    "veggiesdelight:compat/repurposed_structures/village/houses/birch_depot_house", 5);
            // Cherry Village
            VillageStructures.addBuildingToPool(
                    templatePools, processorLists,
                    ResourceLocation.parse("repurposed_structures:villages/cherry/houses"),
                    "veggiesdelight:compat/repurposed_structures/village/houses/cherry_depot_house", 4);
            // Dark Forest Village
            VillageStructures.addBuildingToPool(
                    templatePools, processorLists,
                    ResourceLocation.parse("repurposed_structures:villages/dark_forest/houses"),
                    "veggiesdelight:compat/repurposed_structures/village/houses/dark_forest_depot_house", 5);
            // Giant Taiga Village
            VillageStructures.addBuildingToPool(
                    templatePools, processorLists,
                    ResourceLocation.parse("repurposed_structures:villages/giant_taiga/houses"),
                    "veggiesdelight:compat/repurposed_structures/village/houses/giant_taiga_depot_house", 5);
            // Jungle Village
            VillageStructures.addBuildingToPool(
                    templatePools, processorLists,
                    ResourceLocation.parse("repurposed_structures:villages/jungle/houses"),
                    "veggiesdelight:compat/repurposed_structures/village/houses/jungle_depot_house", 4);
            // Mountain Village
            VillageStructures.addBuildingToPool(
                    templatePools, processorLists,
                    ResourceLocation.parse("repurposed_structures:villages/mountain/houses"),
                    "veggiesdelight:compat/repurposed_structures/village/houses/mountain_depot_house", 4);
            // Mushroom Village
            VillageStructures.addBuildingToPool(
                    templatePools, processorLists,
                    ResourceLocation.parse("repurposed_structures:villages/mushroom/houses"),
                    "veggiesdelight:compat/repurposed_structures/village/houses/mushroom_depot_house", 4);
            // Oak Village
            VillageStructures.addBuildingToPool(
                    templatePools, processorLists,
                    ResourceLocation.parse("repurposed_structures:villages/oak/houses"),
                    "veggiesdelight:compat/repurposed_structures/village/houses/oak_depot_house", 5);
            // Swamp Village
            VillageStructures.addBuildingToPool(
                    templatePools, processorLists,
                    ResourceLocation.parse("repurposed_structures:villages/swamp/houses"),
                    "veggiesdelight:compat/repurposed_structures/village/houses/swamp_depot_house", 4);
        }
        // Explorify Compat
        if (ModList.get().isLoaded("explorify") && Configuration.GENERATE_COMPAT_DARK_FOREST_SETTLEMENT_VS.get()) {
            // Dark Forest Settlement
            VillageStructures.addBuildingToPool(
                    templatePools, processorLists,
                    ResourceLocation.parse("explorify:dark_forest_settlement/house"),
                    "veggiesdelight:compat/explorify/village/houses/settlement_depot_house", 3);
        }
    }

    public static void addBuildingToPool(Registry<StructureTemplatePool> templatePoolRegistry, Registry<StructureProcessorList> processorListRegistry, ResourceLocation poolRL, String nbtPieceRL, int weight) {
        StructureTemplatePool pool = templatePoolRegistry.get(poolRL);
        if (pool == null) return;

        ResourceLocation emptyProcessor = ResourceLocation.withDefaultNamespace("empty");
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
