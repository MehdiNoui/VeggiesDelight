package net.mehdinoui.veggiesdelight.common.registry;

import net.mehdinoui.veggiesdelight.VeggiesDelight;
import net.mehdinoui.veggiesdelight.common.world.ConfigurableRarityFilter;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModPlacedFeatures {
    // --- Keys ---
    public static final ResourceKey<PlacedFeature> BELLPEPPERS_PLACED_KEY =
            ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(VeggiesDelight.MOD_ID, "patch_wild_bellpeppers"));
    public static final ResourceKey<PlacedFeature> BROCCOLI_PLACED_KEY =
            ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(VeggiesDelight.MOD_ID, "patch_wild_broccoli"));
    public static final ResourceKey<PlacedFeature> CAULIFLOWERS_PLACED_KEY =
            ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(VeggiesDelight.MOD_ID, "patch_wild_cauliflowers"));
    public static final ResourceKey<PlacedFeature> GARLIC_PLACED_KEY =
            ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(VeggiesDelight.MOD_ID, "patch_wild_garlic"));
    public static final ResourceKey<PlacedFeature> SWEET_POTATOES_PLACED_KEY =
            ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(VeggiesDelight.MOD_ID, "patch_wild_sweet_potatoes"));
    public static final ResourceKey<PlacedFeature> TURNIPS_PLACED_KEY =
            ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(VeggiesDelight.MOD_ID, "patch_wild_turnips"));
    public static final ResourceKey<PlacedFeature> ZUCCHINIS_PLACED_KEY =
            ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(VeggiesDelight.MOD_ID, "patch_wild_zucchinis"));
    public static final ResourceKey<PlacedFeature> MATURE_DANDELION_PLACED_KEY =
            ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(VeggiesDelight.MOD_ID, "patch_mature_dandelion"));
    // --- Register ---
    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configured = context.lookup(Registries.CONFIGURED_FEATURE);
        context.register(
                BELLPEPPERS_PLACED_KEY,
                new PlacedFeature(
                        configured.getOrThrow(ModConfiguredFeatures.BELLPEPPERS_CONFIGURED_KEY),
                        List.of(
                                new ConfigurableRarityFilter("bell_peppers"),
                                InSquarePlacement.spread(),
                                PlacementUtils.HEIGHTMAP,
                                BiomeFilter.biome()
                        )
                )
        );
        context.register(
                BROCCOLI_PLACED_KEY,
                new PlacedFeature(
                        configured.getOrThrow(ModConfiguredFeatures.BROCCOLI_CONFIGURED_KEY),
                        List.of(
                                new ConfigurableRarityFilter("broccoli"),
                                InSquarePlacement.spread(),
                                PlacementUtils.HEIGHTMAP,
                                BiomeFilter.biome()
                        )
                )
        );
        context.register(
                CAULIFLOWERS_PLACED_KEY,
                new PlacedFeature(
                        configured.getOrThrow(ModConfiguredFeatures.CAULIFLOWERS_CONFIGURED_KEY),
                        List.of(
                                new ConfigurableRarityFilter("cauliflowers"),
                                InSquarePlacement.spread(),
                                PlacementUtils.HEIGHTMAP,
                                BiomeFilter.biome()
                        )
                )
        );
        context.register(
                GARLIC_PLACED_KEY,
                new PlacedFeature(
                        configured.getOrThrow(ModConfiguredFeatures.GARLIC_CONFIGURED_KEY),
                        List.of(
                                new ConfigurableRarityFilter("garlic"),
                                InSquarePlacement.spread(),
                                PlacementUtils.HEIGHTMAP,
                                BiomeFilter.biome()
                        )
                )
        );
        context.register(
                SWEET_POTATOES_PLACED_KEY,
                new PlacedFeature(
                        configured.getOrThrow(ModConfiguredFeatures.SWEET_POTATOES_CONFIGURED_KEY),
                        List.of(
                                new ConfigurableRarityFilter("sweet_potatoes"),
                                InSquarePlacement.spread(),
                                PlacementUtils.HEIGHTMAP,
                                BiomeFilter.biome()
                        )
                )
        );
        context.register(
                TURNIPS_PLACED_KEY,
                new PlacedFeature(
                        configured.getOrThrow(ModConfiguredFeatures.TURNIPS_CONFIGURED_KEY),
                        List.of(
                                new ConfigurableRarityFilter("turnips"),
                                InSquarePlacement.spread(),
                                PlacementUtils.HEIGHTMAP,
                                BiomeFilter.biome()
                        )
                )
        );
        context.register(
                ZUCCHINIS_PLACED_KEY,
                new PlacedFeature(
                        configured.getOrThrow(ModConfiguredFeatures.ZUCCHINIS_CONFIGURED_KEY),
                        List.of(
                                new ConfigurableRarityFilter("zucchinis"),
                                InSquarePlacement.spread(),
                                PlacementUtils.HEIGHTMAP,
                                BiomeFilter.biome()
                        )
                )
        );
        context.register(
                MATURE_DANDELION_PLACED_KEY,
                new PlacedFeature(
                        configured.getOrThrow(ModConfiguredFeatures.MATURE_DANDELION_CONFIGURED_KEY),
                        List.of(
                                new ConfigurableRarityFilter("mature_dandelion"),
                                InSquarePlacement.spread(),
                                PlacementUtils.HEIGHTMAP,
                                BiomeFilter.biome()
                        )
                )
        );
    }
}
