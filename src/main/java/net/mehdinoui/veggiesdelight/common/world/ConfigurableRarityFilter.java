package net.mehdinoui.veggiesdelight.common.world;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import net.mehdinoui.veggiesdelight.Configuration;
import net.mehdinoui.veggiesdelight.common.registry.ModPlacementModifiers;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.levelgen.placement.PlacementContext;
import net.minecraft.world.level.levelgen.placement.PlacementFilter;
import net.minecraft.world.level.levelgen.placement.PlacementModifierType;
import org.jetbrains.annotations.NotNull;

public class ConfigurableRarityFilter extends PlacementFilter {
    public static final MapCodec<ConfigurableRarityFilter> CODEC =
            Codec.STRING.fieldOf("config_key")
                    .xmap(ConfigurableRarityFilter::new, ConfigurableRarityFilter::getConfigKey);

    private final String configKey;

    public ConfigurableRarityFilter(String configKey) {
        this.configKey = configKey;
    }

    public String getConfigKey() {
        return this.configKey;
    }

    @Override
    protected boolean shouldPlace(@NotNull PlacementContext ctx, @NotNull RandomSource random, @NotNull BlockPos pos) {
        int chance = getConfigValue(this.configKey);
        if (chance == 0) {
            return false;
        }
        if (chance == 1) {
            return true;
        }
        return random.nextInt(chance) == 0;
    }

    private int getConfigValue(String key) {
        return switch (key) {
            case "bell_peppers" -> Configuration.CHANCE_BELL_PEPPERS.get();
            case "broccoli" -> Configuration.CHANCE_BROCCOLI.get();
            case "cauliflowers" -> Configuration.CHANCE_CAULIFLOWERS.get();
            case "garlic" -> Configuration.CHANCE_GARLIC.get();
            case "sweet_potatoes" -> Configuration.CHANCE_SWEET_POTATOES.get();
            case "turnips" -> Configuration.CHANCE_TURNIPS.get();
            case "zucchinis" -> Configuration.CHANCE_ZUCCHINIS.get();
            case "mature_dandelion" -> Configuration.CHANCE_MATURE_DANDELION.get();
            default -> 0;
        };
    }

    @Override
    public @NotNull PlacementModifierType<?> type() {
        return ModPlacementModifiers.CONFIGURABLE_RARITY_FILTER.get();
    }
}