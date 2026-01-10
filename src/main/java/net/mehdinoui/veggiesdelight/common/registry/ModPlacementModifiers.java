package net.mehdinoui.veggiesdelight.common.registry;

import com.mojang.serialization.MapCodec;
import net.mehdinoui.veggiesdelight.VeggiesDelight;
import net.mehdinoui.veggiesdelight.common.world.ConfigurableRarityFilter;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraft.world.level.levelgen.placement.PlacementModifierType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModPlacementModifiers {
    public static final DeferredRegister<PlacementModifierType<?>> PLACEMENT_MODIFIERS = DeferredRegister.create(BuiltInRegistries.PLACEMENT_MODIFIER_TYPE.key(), VeggiesDelight.MOD_ID);
    public static final Supplier<PlacementModifierType<ConfigurableRarityFilter>> CONFIGURABLE_RARITY_FILTER = PLACEMENT_MODIFIERS.register("configurable_rarity_filter", () -> typeConvert(ConfigurableRarityFilter.CODEC));

    private static <P extends PlacementModifier> PlacementModifierType<P> typeConvert(MapCodec<P> codec) {
        return codec::codec;
    }
    public static void register(IEventBus eventBus) {
        PLACEMENT_MODIFIERS.register(eventBus);
    }
}