package net.mehdinoui.veggiesdelight;

import net.minecraftforge.common.ForgeConfigSpec;

public class Configuration {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec CONFIG;

    // Configurable Values
    public static final ForgeConfigSpec.BooleanValue ENABLE_VILLAGER_TRADES;
    public static final ForgeConfigSpec.BooleanValue ENABLE_WANDERING_TRADER_SELLS;
    public static final ForgeConfigSpec.BooleanValue GENERATE_VILLAGE_STRUCTURES;
    public static final ForgeConfigSpec.BooleanValue GENERATE_VANILLA_VS;
    public static final ForgeConfigSpec.BooleanValue GENERATE_COMPAT_ATMOSPHERIC_VS;
    public static final ForgeConfigSpec.BooleanValue GENERATE_COMPAT_NATURESPIRIT_VS;
    public static final ForgeConfigSpec.BooleanValue GENERATE_COMPAT_REPURPOSED_STRUCTURES_VS;
    public static final ForgeConfigSpec.BooleanValue GENERATE_COMPAT_WINDSWEPT_VS;
    public static final ForgeConfigSpec.BooleanValue GENERATE_COMPAT_DARK_FOREST_SETTLEMENT_VS;

    static {
        // Trade Settings
        BUILDER.push("Villager Settings");
        ENABLE_VILLAGER_TRADES = BUILDER
                .comment("Enable Veggies Delight villager trades")
                .define("enableVillagerTrades", true);
        ENABLE_WANDERING_TRADER_SELLS = BUILDER
                .comment("Enable Veggies Delight Wandering Trader trades")
                .define("enableWanderingTrades", true);
        BUILDER.pop();

        // Structure Settings
        BUILDER.push("Structure Settings");
        GENERATE_VILLAGE_STRUCTURES = BUILDER
                .comment("Enable Veggies Delight to add new village structures (disables all compat if false)")
                .define("generateVeggiesDelightStructures", true);

            // Village Settings
            BUILDER.push("Village Settings");
            GENERATE_VANILLA_VS = BUILDER
                .comment("Enable generation of Veggies Delight structures in Vanilla villages")
                .define("generateVanillaVillageStructures", true);
            BUILDER.pop();

            // Compat Settings
            BUILDER.push("Compat Settings");
            GENERATE_COMPAT_ATMOSPHERIC_VS = BUILDER
                .comment("Enable generation of Veggies Delight structures in Atmospheric villages")
                .define("generateAtmosphericVillageStructures", true);
            GENERATE_COMPAT_NATURESPIRIT_VS = BUILDER
                .comment("Enable generation of Veggies Delight structures in Nature's Spirit villages")
                .define("generateNatureSpiritVillageStructures", true);
            GENERATE_COMPAT_REPURPOSED_STRUCTURES_VS = BUILDER
                .comment("Enable generation of Veggies Delight structures in Repurposed villages")
                .define("generateRepurposedStructuresVillageStructures", true);

            GENERATE_COMPAT_WINDSWEPT_VS = BUILDER
                .comment("Enable generation of Veggies Delight structures in Windswept villages")
                .define("generateWindsweptVillageStructures", true);
            GENERATE_COMPAT_DARK_FOREST_SETTLEMENT_VS = BUILDER
                .comment("Enable generation of Veggies Delight structures in Explorify's Dark Forest Settlement")
                .define("generateExplorifyStructures", true);
            BUILDER.pop();

        BUILDER.pop();
        // Config Build
        CONFIG = BUILDER.build();
    }
}
