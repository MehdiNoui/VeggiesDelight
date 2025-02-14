package net.mehdinoui.veggiesdelight;

import net.minecraftforge.common.ForgeConfigSpec;

public class Configuration {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec CONFIG;

    // Configurable values
    public static final ForgeConfigSpec.BooleanValue ENABLE_VILLAGER_TRADES;
    public static final ForgeConfigSpec.BooleanValue GENERATE_VILLAGE_STRUCTURES;

    static {
        BUILDER.push("Villager Settings");
        ENABLE_VILLAGER_TRADES = BUILDER
                .comment("Enable custom villager trades (default: true)")
                .define("enableVillagerTrades", true);
        BUILDER.pop();

        BUILDER.push("Structures");
        GENERATE_VILLAGE_STRUCTURES = BUILDER
                .comment("Enable or disable Veggies Delight village structures.")
                .define("generateVillageStructures", true);
        BUILDER.pop();

        CONFIG = BUILDER.build();
    }
}
