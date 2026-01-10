package net.mehdinoui.veggiesdelight.common.registry;

import net.mehdinoui.veggiesdelight.VeggiesDelight;
import net.mehdinoui.veggiesdelight.common.world.ConfigurableRarityFilter;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.levelgen.placement.PlacementModifierType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModPlacementModifiers {
    public static final DeferredRegister<PlacementModifierType<?>> PLACEMENT_MODIFIERS =
            DeferredRegister.create(BuiltInRegistries.PLACEMENT_MODIFIER_TYPE, VeggiesDelight.MOD_ID);

    public static final Supplier<PlacementModifierType<ConfigurableRarityFilter>> CONFIGURABLE_RARITY_FILTER =
            PLACEMENT_MODIFIERS.register("configurable_rarity_filter", () -> () -> ConfigurableRarityFilter.CODEC);

    public static void register(IEventBus eventBus) {
        PLACEMENT_MODIFIERS.register(eventBus);
    }
}