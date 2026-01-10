package net.mehdinoui.veggiesdelight;

import net.neoforged.neoforge.common.ModConfigSpec;

public class Configuration {
    public static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
    public static final ModConfigSpec CONFIG;

    // Configurable Values
    public static final ModConfigSpec.BooleanValue ENABLE_VILLAGER_TRADES;
    public static final ModConfigSpec.BooleanValue ENABLE_WANDERING_TRADER_SELLS;
    public static final ModConfigSpec.BooleanValue GENERATE_VILLAGE_STRUCTURES;
    public static final ModConfigSpec.BooleanValue GENERATE_VANILLA_VS;
    public static final ModConfigSpec.BooleanValue GENERATE_COMPAT_ATMOSPHERIC_VS;
    public static final ModConfigSpec.BooleanValue GENERATE_COMPAT_NATURESPIRIT_VS;
    public static final ModConfigSpec.BooleanValue GENERATE_COMPAT_REPURPOSED_STRUCTURES_VS;
    public static final ModConfigSpec.BooleanValue GENERATE_COMPAT_WINDSWEPT_VS;
    public static final ModConfigSpec.BooleanValue GENERATE_COMPAT_DARK_FOREST_SETTLEMENT_VS;

    // World Generation
    public static final ModConfigSpec.IntValue CHANCE_BELL_PEPPERS;
    public static final ModConfigSpec.IntValue CHANCE_BROCCOLI;
    public static final ModConfigSpec.IntValue CHANCE_CAULIFLOWERS;
    public static final ModConfigSpec.IntValue CHANCE_GARLIC;
    public static final ModConfigSpec.IntValue CHANCE_SWEET_POTATOES;
    public static final ModConfigSpec.IntValue CHANCE_TURNIPS;
    public static final ModConfigSpec.IntValue CHANCE_ZUCCHINIS;
    public static final ModConfigSpec.IntValue CHANCE_MATURE_DANDELION;

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
                .comment("Enable generation of Veggies Delight structures in Repurposed Structures villages")
                .define("generateRepurposedStructuresVillageStructures", true);

        GENERATE_COMPAT_WINDSWEPT_VS = BUILDER
                .comment("Enable generation of Veggies Delight structures in Windswept villages")
                .define("generateWindsweptVillageStructures", true);
        GENERATE_COMPAT_DARK_FOREST_SETTLEMENT_VS = BUILDER
                .comment("Enable generation of Veggies Delight structures in Explorify's Dark Forest Settlement")
                .define("generateExplorifyStructures", true);
        BUILDER.pop();

        BUILDER.push("Worldgen Settings");

        CHANCE_BELL_PEPPERS = BUILDER
                .comment("Chance of Bell Peppers generating in the world. (0 to disable, higher = rarer)")
                .defineInRange("chanceBellPeppers", 100, 0, 512);
        CHANCE_BROCCOLI = BUILDER
                .comment("Chance of Broccoli generating in the world. (0 to disable, higher = rarer)")
                .defineInRange("chanceBroccoli", 120, 0, 512);
        CHANCE_CAULIFLOWERS = BUILDER
                .comment("Chance of Cauliflowers generating in the world. (0 to disable, higher = rarer)")
                .defineInRange("chanceCauliflowers", 120, 0, 512);
        CHANCE_GARLIC = BUILDER
                .comment("Chance of Garlic generating in the world. (0 to disable, higher = rarer)")
                .defineInRange("chanceGarlic", 120, 0, 512);
        CHANCE_SWEET_POTATOES = BUILDER
                .comment("Chance of Sweet Potatoes generating in the world. (0 to disable, higher = rarer)")
                .defineInRange("chanceSweetPotatoes", 120, 0, 512);
        CHANCE_TURNIPS = BUILDER
                .comment("Chance of Turnips generating in the world. (0 to disable, higher = rarer)")
                .defineInRange("chanceTurnips", 20, 0, 512);
        CHANCE_ZUCCHINIS = BUILDER
                .comment("Chance of Zucchinis generating in the world. (0 to disable, higher = rarer)")
                .defineInRange("chanceZucchinis", 100, 0, 512);
        CHANCE_MATURE_DANDELION = BUILDER
                .comment("Chance of Mature Dandelions generating in the world. (0 to disable, higher = rarer)")
                .defineInRange("chanceMatureDandelion", 130, 0, 512);
        BUILDER.pop();

        BUILDER.pop();
        // Config Build
        CONFIG = BUILDER.build();
    }
}