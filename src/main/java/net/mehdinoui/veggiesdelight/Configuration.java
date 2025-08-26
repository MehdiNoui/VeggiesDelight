package net.mehdinoui.veggiesdelight;
import net.neoforged.neoforge.common.ModConfigSpec;

public class Configuration {
    public static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
    public static final ModConfigSpec CONFIG;
    // Configurable values
    public static final ModConfigSpec.BooleanValue ENABLE_VILLAGER_TRADES;
    public static final ModConfigSpec.BooleanValue ENABLE_WANDERING_TRADER_SELLS;
    public static final ModConfigSpec.BooleanValue GENERATE_VILLAGE_STRUCTURES;

    static {
        BUILDER.push("Villager Settings");
        ENABLE_VILLAGER_TRADES = BUILDER
                .comment("Enable Veggies Delight villager trades")
                .define("enableVillagerTrades", true);
        ENABLE_WANDERING_TRADER_SELLS = BUILDER
                .comment("Enable Veggies Delight Wandering Trader trades")
                .define("enableWanderingTrades", true);
        BUILDER.pop();

        BUILDER.push("Village Settings");
        GENERATE_VILLAGE_STRUCTURES = BUILDER
                .comment("Enable Veggies Delight village structures")
                .define("generateVillageStructures", true);
        BUILDER.pop();

        CONFIG = BUILDER.build();
    }
}
