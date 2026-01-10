package net.mehdinoui.veggiesdelight.common.registry;

import net.mehdinoui.veggiesdelight.VeggiesDelight;
import net.minecraft.core.Holder;
import net.minecraft.core.Vec3i;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.SimpleStateProvider;
import net.minecraft.world.level.levelgen.placement.BlockPredicateFilter;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import vectorwing.farmersdelight.common.registry.ModBiomeFeatures;
import vectorwing.farmersdelight.common.registry.ModBlocks;
import vectorwing.farmersdelight.common.world.configuration.WildCropConfiguration;

import java.util.List;

public class ModConfiguredFeatures {
    // --- Keys ---
    public static final ResourceKey<ConfiguredFeature<?, ?>> BELLPEPPERS_CONFIGURED_KEY =
            ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID, "patch_wild_bellpeppers"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> BROCCOLI_CONFIGURED_KEY =
            ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID, "patch_wild_broccoli"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> CAULIFLOWERS_CONFIGURED_KEY =
            ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID, "patch_wild_cauliflowers"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> GARLIC_CONFIGURED_KEY =
            ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID, "patch_wild_garlic"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> SWEET_POTATOES_CONFIGURED_KEY =
            ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID, "patch_wild_sweet_potato"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> TURNIPS_CONFIGURED_KEY =
            ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID, "patch_wild_turnips"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> ZUCCHINIS_CONFIGURED_KEY =
            ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID, "patch_wild_zucchinis"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> MATURE_DANDELION_CONFIGURED_KEY =
            ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(VeggiesDelight.MOD_ID, "patch_mature_dandelion"));

    // --- Register ---
    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        BlockPredicate onDirt = BlockPredicate.matchesTag(new Vec3i(0, -1, 0), BlockTags.DIRT);
        BlockPredicate onSand = BlockPredicate.matchesTag(new Vec3i(0, -1, 0), BlockTags.SAND);

        BlockPredicate onValidBellPepperSoil = BlockPredicate.matchesBlocks(new Vec3i(0, -1, 0), List.of(
                Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.COARSE_DIRT, Blocks.PODZOL, Blocks.SAND, Blocks.RED_SAND
        ));

        context.register(BELLPEPPERS_CONFIGURED_KEY, new ConfiguredFeature<>(
                ModBiomeFeatures.WILD_CROP.get(),
                new WildCropConfiguration(64, 6, 3,
                        patchEntry(net.mehdinoui.veggiesdelight.common.registry.ModBlocks.WILD_BELLPEPPERS.get().defaultBlockState(),
                                onValidBellPepperSoil),
                        patchEntry(Blocks.SHORT_GRASS.defaultBlockState(), onDirt),
                        coarseDirtFloor()
                )
        ));
        context.register(BROCCOLI_CONFIGURED_KEY, new ConfiguredFeature<>(
                ModBiomeFeatures.WILD_CROP.get(),
                new WildCropConfiguration(64, 6, 3,
                        patchEntry(net.mehdinoui.veggiesdelight.common.registry.ModBlocks.WILD_BROCCOLI.get().defaultBlockState(),
                                onDirt),
                        patchEntry(Blocks.SHORT_GRASS.defaultBlockState(), onDirt),
                        coarseDirtFloor()
                )
        ));
        context.register(CAULIFLOWERS_CONFIGURED_KEY, new ConfiguredFeature<>(
                ModBiomeFeatures.WILD_CROP.get(),
                new WildCropConfiguration(64, 6, 3,
                        patchEntry(net.mehdinoui.veggiesdelight.common.registry.ModBlocks.WILD_CAULIFLOWERS.get().defaultBlockState(),
                                onDirt),
                        patchEntry(Blocks.SHORT_GRASS.defaultBlockState(), onDirt),
                        coarseDirtFloor()
                )
        ));
        context.register(GARLIC_CONFIGURED_KEY, new ConfiguredFeature<>(
                ModBiomeFeatures.WILD_CROP.get(),
                new WildCropConfiguration(64, 6, 3,
                        patchEntry(net.mehdinoui.veggiesdelight.common.registry.ModBlocks.WILD_GARLIC.get().defaultBlockState(),
                                onDirt),
                        patchEntry(Blocks.SHORT_GRASS.defaultBlockState(), onDirt),
                        coarseDirtFloor()
                )
        ));
        context.register(SWEET_POTATOES_CONFIGURED_KEY, new ConfiguredFeature<>(
                ModBiomeFeatures.WILD_CROP.get(),
                new WildCropConfiguration(64, 6, 3,
                        patchEntry(net.mehdinoui.veggiesdelight.common.registry.ModBlocks.WILD_SWEET_POTATOES.get().defaultBlockState(),
                                onDirt),
                        patchEntry(Blocks.SHORT_GRASS.defaultBlockState(), onDirt),
                        coarseDirtFloor()
                )
        ));
        context.register(TURNIPS_CONFIGURED_KEY, new ConfiguredFeature<>(
                ModBiomeFeatures.WILD_CROP.get(),
                new WildCropConfiguration(64, 6, 3,
                        patchEntry(net.mehdinoui.veggiesdelight.common.registry.ModBlocks.WILD_TURNIPS.get().defaultBlockState(),
                                onSand),
                        patchEntry(ModBlocks.SANDY_SHRUB.get().defaultBlockState(), onSand),
                        coarseDirtFloor()
                )
        ));
        context.register(ZUCCHINIS_CONFIGURED_KEY, new ConfiguredFeature<>(
                ModBiomeFeatures.WILD_CROP.get(),
                new WildCropConfiguration(64, 6, 3,
                        patchEntry(net.mehdinoui.veggiesdelight.common.registry.ModBlocks.WILD_ZUCCHINIS.get().defaultBlockState(),
                                onDirt),
                        patchEntry(Blocks.SHORT_GRASS.defaultBlockState(), onDirt),
                        coarseDirtFloor()
                )
        ));

        context.register(MATURE_DANDELION_CONFIGURED_KEY, new ConfiguredFeature<>(
                ModBiomeFeatures.WILD_CROP.get(),
                new WildCropConfiguration(64, 6, 3,
                        patchEntry(net.mehdinoui.veggiesdelight.common.registry.ModBlocks.MATURE_DANDELION.get().defaultBlockState(),
                                onDirt),
                        patchEntry(Blocks.DANDELION.defaultBlockState(), onDirt),
                        coarseDirtFloor()
                )
        ));
    }

    // --- Helpers ---
    private static Holder<PlacedFeature> patchEntry(BlockState block, BlockPredicate plantedOn) {
        return Holder.direct(new PlacedFeature(
                Holder.direct(new ConfiguredFeature<>(
                        Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(SimpleStateProvider.simple(block))
                )),
                List.of(BlockPredicateFilter.forPredicate(
                        BlockPredicate.allOf(
                                BlockPredicate.ONLY_IN_AIR_PREDICATE,
                                plantedOn
                        )
                ))
        ));
    }

    private static Holder<PlacedFeature> coarseDirtFloor() {
        return Holder.direct(new PlacedFeature(
                Holder.direct(new ConfiguredFeature<>(
                        Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(SimpleStateProvider.simple(Blocks.COARSE_DIRT.defaultBlockState()))
                )),
                List.of(BlockPredicateFilter.forPredicate(
                        BlockPredicate.allOf(
                                BlockPredicate.matchesTag(BlockTags.DIRT),
                                BlockPredicate.replaceable(new Vec3i(0, 1, 0))
                        )
                ))
        ));
    }
}