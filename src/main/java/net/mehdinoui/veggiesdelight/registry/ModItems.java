package net.mehdinoui.veggiesdelight.registry;

import net.mehdinoui.veggiesdelight.VeggiesDelight;
import net.mehdinoui.veggiesdelight.item.ModFoods;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import vectorwing.farmersdelight.common.item.ConsumableItem;
import vectorwing.farmersdelight.common.item.DrinkableItem;

import static vectorwing.farmersdelight.common.registry.ModItems.basicItem;

public class ModItems {
    public final static DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(VeggiesDelight.MOD_ID);

    public static Item.Properties bowlFoodItem(FoodProperties food) {
        return new Item.Properties().food(food).craftRemainder(Items.BOWL).stacksTo(16);
    }
    public static Item.Properties bottleItem(FoodProperties food) {
        return new Item.Properties().food(food).craftRemainder(Items.GLASS_BOTTLE).stacksTo(32);
    }
    public static Item.Properties stickItem(FoodProperties food) {
        return new Item.Properties().food(food).craftRemainder(Items.STICK).stacksTo(64);
    }
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    // Blocks
    // Crate Blocks
    public static final DeferredItem<Item> BELLPEPPER_CRATE = ITEMS.register("bellpepper_crate",
            () -> new BlockItem(ModBlocks.BELLPEPPER_CRATE.get(), basicItem()));
    public static final DeferredItem<Item> BROCCOLI_CRATE = ITEMS.register("broccoli_crate",
            () -> new BlockItem(ModBlocks.BROCCOLI_CRATE.get(), basicItem()));
    public static final DeferredItem<Item> CAULIFLOWER_CRATE = ITEMS.register("cauliflower_crate",
            () -> new BlockItem(ModBlocks.CAULIFLOWER_CRATE.get(), basicItem()));
    public static final DeferredItem<Item> GARLIC_CRATE = ITEMS.register("garlic_crate",
            () -> new BlockItem(ModBlocks.GARLIC_CRATE.get(), basicItem()));
    public static final DeferredItem<Item> SWEET_POTATO_CRATE = ITEMS.register("sweet_potato_crate",
            () -> new BlockItem(ModBlocks.SWEET_POTATO_CRATE.get(), basicItem()));
    public static final DeferredItem<Item> TURNIP_CRATE = ITEMS.register("turnip_crate",
            () -> new BlockItem(ModBlocks.TURNIP_CRATE.get(), basicItem()));
    public static final DeferredItem<Item> ZUCCHINI_CRATE = ITEMS.register("zucchini_crate",
            () -> new BlockItem(ModBlocks.ZUCCHINI_CRATE.get(), basicItem()));

    // Misc Blocks
    public static final DeferredItem<Item> BEETROOT_BROWNIE_TRAY = ITEMS.register("beetroot_brownie_tray",
            () -> new BlockItem(ModBlocks.BEETROOT_BROWNIE_TRAY.get(), basicItem()));
    public static final DeferredItem<Item> STUFFED_BELLPEPPERS_BLOCK = ITEMS.register("stuffed_bellpeppers_block",
            ()->new BlockItem(ModBlocks.STUFFED_BELLPEPPERS_BLOCK.get(), basicItem()));
    public static final DeferredItem<Item> CARROT_CAKE = ITEMS.register("carrot_cake",
            ()->new BlockItem(ModBlocks.CARROT_CAKE.get(), basicItem().stacksTo(1)));
    public static final DeferredItem<Item> SWEET_POTATO_PIE = ITEMS.register("sweet_potato_pie",
            () -> new BlockItem(ModBlocks.SWEET_POTATO_PIE.get(), basicItem()));
    public static final DeferredItem<Item> ZUCCHINI_QUICHE = ITEMS.register("zucchini_quiche",
            () -> new BlockItem(ModBlocks.ZUCCHINI_QUICHE.get(), basicItem()));
    public static final DeferredItem<Item> VEGAN_PIZZA = ITEMS.register("vegan_pizza",
            () -> new BlockItem(ModBlocks.VEGAN_PIZZA.get(), basicItem()));
    public static final DeferredItem<Item> LASAGNA_PAN = ITEMS.register("lasagna_pan",
            () -> new BlockItem(ModBlocks.LASAGNA_PAN.get(), basicItem()));

    // Wild Flowers
    public static final DeferredItem<Item> MATURE_DANDELION = ITEMS.register("mature_dandelion",
            () -> new BlockItem(ModBlocks.MATURE_DANDELION.get(), basicItem()));
    public static final DeferredItem<Item> WILD_BELLPEPPERS = ITEMS.register("wild_bellpeppers",
            () -> new BlockItem(ModBlocks.WILD_BELLPEPPERS.get(), basicItem()));
    public static final DeferredItem<Item> WILD_BROCCOLI = ITEMS.register("wild_broccoli",
            () -> new BlockItem(ModBlocks.WILD_BROCCOLI.get(), basicItem()));
    public static final DeferredItem<Item> WILD_CAULIFLOWERS = ITEMS.register("wild_cauliflowers",
            () -> new BlockItem(ModBlocks.WILD_CAULIFLOWERS.get(), basicItem()));
    public static final DeferredItem<Item> WILD_GARLIC = ITEMS.register("wild_garlic",
            () -> new BlockItem(ModBlocks.WILD_GARLIC.get(), basicItem()));
    public static final DeferredItem<Item> WILD_SWEET_POTATOES = ITEMS.register("wild_sweet_potatoes",
            () -> new BlockItem(ModBlocks.WILD_SWEET_POTATOES.get(), basicItem()));
    public static final DeferredItem<Item> WILD_TURNIPS = ITEMS.register("wild_turnips",
            () -> new BlockItem(ModBlocks.WILD_TURNIPS.get(), basicItem()));
    public static final DeferredItem<Item> WILD_ZUCCHINIS = ITEMS.register("wild_zucchinis",
            () -> new BlockItem(ModBlocks.WILD_ZUCCHINIS.get(), basicItem()));

    // Items
    // Seeds
    public static final DeferredItem<Item> BELLPEPPER_SEEDS = ITEMS.register("bellpepper_seeds",
            ()->new ItemNameBlockItem(ModBlocks.BELLPEPPER_CROP.get(),new Item.Properties()));
    public static final DeferredItem<Item> BROCCOLI_SEEDS = ITEMS.register("broccoli_seeds",
            ()->new ItemNameBlockItem(ModBlocks.BROCCOLI_CROP.get(),new Item.Properties()));
    public static final DeferredItem<Item> CAULIFLOWER_SEEDS = ITEMS.register("cauliflower_seeds",
            ()->new ItemNameBlockItem(ModBlocks.CAULIFLOWER_CROP.get(),new Item.Properties()));
    public static final DeferredItem<Item> GARLIC_CLOVE = ITEMS.register("garlic_clove",
            ()->new ItemNameBlockItem(ModBlocks.GARLIC_CROP.get(),
                    new Item.Properties().food(ModFoods.GARLIC_CLOVE)));
    public static final DeferredItem<Item> SWEET_POTATO = ITEMS.register("sweet_potato",
            () -> new ItemNameBlockItem(ModBlocks.SWEET_POTATO_CROP.get(),
                    new Item.Properties().food(ModFoods.SWEET_POTATO)));
    public static final DeferredItem<Item> TURNIP_SEEDS = ITEMS.register("turnip_seeds",
            ()->new ItemNameBlockItem(ModBlocks.TURNIP_CROP.get(),new Item.Properties()));
    public static final DeferredItem<Item> ZUCCHINI_SEEDS = ITEMS.register("zucchini_seeds",
            ()->new ItemNameBlockItem(ModBlocks.ZUCCHINI_CROP.get(),new Item.Properties()));

    // Vegetables/Foods
    // Bell Pepper
    public static final DeferredItem<Item> BELLPEPPER= ITEMS.register("bellpepper",
            ()->new Item(new Item.Properties().food(ModFoods.BELLPEPPER)));
    public static final DeferredItem<Item> SMOKED_BELLPEPPER = ITEMS.register("smoked_bellpepper",
            ()->new Item(new Item.Properties().food(ModFoods.SMOKED_BELLPEPPER)));
    public static final DeferredItem<Item> CACCIATORE = ITEMS.register("cacciatore",
            ()->new ConsumableItem(bowlFoodItem(ModFoods.CACCIATORE), true));
    public static final DeferredItem<Item> SHAKSHOUKA = ITEMS.register("shakshouka",
            ()->new ConsumableItem(bowlFoodItem(ModFoods.SHAKSHOUKA), true));
    public static final DeferredItem<Item> STUFFED_BELLPEPPER= ITEMS.register("stuffed_bellpepper",
            ()->new Item(new Item.Properties().food(ModFoods.STUFFED_BELLPEPPER)));
    public static final DeferredItem<Item> UNCOOKED_MHADJEB = ITEMS.register("uncooked_mhadjeb",
            ()->new Item(new Item.Properties().food(ModFoods.UNCOOKED_MHADJEB)));
    public static final DeferredItem<Item> MHADJEB = ITEMS.register("mhadjeb",
            ()->new Item(new Item.Properties().food(ModFoods.MHADJEB)));
    public static final DeferredItem<Item> VEGAN_PIZZA_SLICE = ITEMS.register("vegan_pizza_slice",
            ()->new Item(new Item.Properties().food(ModFoods.VEGAN_PIZZA_SLICE)));
    public static final DeferredItem<Item> CHICKEN_FAJITAS_WRAP = ITEMS.register("chicken_fajitas_wrap",
            ()->new Item(new Item.Properties().food(ModFoods.CHICKEN_FAJITAS_WRAP)));

    // Broccoli
    public static final DeferredItem<Item> BROCCOLI = ITEMS.register("broccoli",
            ()-> new Item(new Item.Properties().food(ModFoods.BROCCOLI)));
    public static final DeferredItem<Item> BROCCOLI_SALAD = ITEMS.register("broccoli_salad",
            ()->new ConsumableItem(bowlFoodItem(ModFoods.BROCCOLI_SALAD), true));
    public static final DeferredItem<Item> BROCCOLI_SOUP = ITEMS.register("broccoli_soup",
            ()->new ConsumableItem(bowlFoodItem(ModFoods.BROCCOLI_SOUP), true));
    public static final DeferredItem<Item> PASTA_WITH_BROCCOLI = ITEMS.register("pasta_with_broccoli",
            ()->new ConsumableItem(bowlFoodItem(ModFoods.PASTA_WITH_BROCCOLI), true));
    public static final DeferredItem<Item> STEAK_AND_BROCCOLI = ITEMS.register("steak_and_broccoli",
            ()->new ConsumableItem(bowlFoodItem(ModFoods.STEAK_AND_BROCCOLI),  true));


    // Cauliflower
    public static final DeferredItem<Item> CAULIFLOWER = ITEMS.register("cauliflower",
            ()->new Item(new Item.Properties().food(ModFoods.CAULIFLOWER)));
    public static final DeferredItem<Item> CAULIFLOWER_FLORET = ITEMS.register("cauliflower_floret",
            ()->new Item(new Item.Properties().food(ModFoods.CAULIFLOWER_FLORET)));
    public static final DeferredItem<Item> ROASTED_CAULIFLOWER_FLORET = ITEMS.register("roasted_cauliflower_floret",
            ()->new Item(new Item.Properties().food(ModFoods.ROASTED_CAULIFLOWER_FLORET)));
    public static final DeferredItem<Item> CAULIFLOWER_BREAD = ITEMS.register("cauliflower_bread",
            ()->new Item(new Item.Properties().food(ModFoods.CAULIFLOWER_BREAD)));
    public static final DeferredItem<Item> CAULIFLOWER_SOUP = ITEMS.register("cauliflower_soup",
            ()->new ConsumableItem(bowlFoodItem(ModFoods.CAULIFLOWER_SOUP), true));
    public static final DeferredItem<Item> CAULIFLOWER_KUKU = ITEMS.register("cauliflower_kuku",
            ()->new ConsumableItem(bowlFoodItem(ModFoods.CAULIFLOWER_KUKU), true));

    // Garlic
    public static final DeferredItem<Item> GARLIC = ITEMS.register("garlic",
            ()->new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROASTED_GARLIC_CLOVE = ITEMS.register("roasted_garlic_clove",
            ()-> new Item(new Item.Properties().food(ModFoods.ROASTED_GARLIC_CLOVE)));
    public static final DeferredItem<Item> GARLIC_BREAD = ITEMS.register("garlic_bread",
            ()-> new Item(new Item.Properties().food(ModFoods.GARLIC_BREAD)));
    public static final DeferredItem<Item> GARLIC_CHICKEN_STEW = ITEMS.register("garlic_chicken_stew",
            ()->new ConsumableItem(bowlFoodItem(ModFoods.GARLIC_CHICKEN_STEW), true));
    public static final DeferredItem<Item> GARLIC_BAKED_COD = ITEMS.register("garlic_baked_cod",
            ()->new ConsumableItem(bowlFoodItem(ModFoods.GARLIC_BAKED_COD), true));
    public static final DeferredItem<Item> GARLIC_RICE_WITH_CAULIFLOWER= ITEMS.register("garlic_rice_with_cauliflower",
            ()->new ConsumableItem(bowlFoodItem(ModFoods.GARLIC_RICE_WITH_CAULIFLOWER), true));
    public static final DeferredItem<Item> CESAR_SALAD = ITEMS.register("cesar_salad",
            ()->new ConsumableItem(bowlFoodItem(ModFoods.CESAR_SALAD), true));
    public static final DeferredItem<Item> FERMENTED_GARLIC_HONEY = ITEMS.register("fermented_garlic_honey",
            ()->new DrinkableItem(bottleItem(ModFoods.FERMENTED_GARLIC_HONEY),true));
    public static final DeferredItem<Item> GARLIC_STUFFED_MUSHROOMS = ITEMS.register("garlic_stuffed_mushrooms",
            ()-> new Item(new Item.Properties().food(ModFoods.GARLIC_STUFFED_MUSHROOMS)));

    // Sweet Potato
    public static final DeferredItem<Item> BAKED_SWEET_POTATO = ITEMS.register("baked_sweet_potato",
            ()->new Item(new Item.Properties().food(ModFoods.BAKED_SWEET_POTATO)));
    public static final DeferredItem<Item> MASHED_POTATOES = ITEMS.register("mashed_potatoes",
            ()->new ConsumableItem(bowlFoodItem(ModFoods.MASHED_POTATOES), true));
    public static final DeferredItem<Item> POTATO_NOODLE = ITEMS.register("potato_noodle",
            ()->new Item(new Item.Properties().food(ModFoods.POTATO_NOODLE)));
    public static final DeferredItem<Item> POTATO_NOODLES = ITEMS.register("potato_noodles",
            ()->new ConsumableItem(bowlFoodItem(ModFoods.POTATO_NOODLES), true));
    public static final DeferredItem<Item> SWEET_POTATO_PIE_SLICE = ITEMS.register("sweet_potato_pie_slice",
            ()->new Item(new Item.Properties().food(ModFoods.SWEET_POTATO_PIE_SLICE)));
    public static final DeferredItem<Item> SWEET_POTATO_DOUGH = ITEMS.register("sweet_potato_dough",
            ()-> new Item(new Item.Properties().food(ModFoods.SWEET_POTATO_DOUGH)));
    public static final DeferredItem<Item> SWEET_POTATO_CUPCAKE = ITEMS.register("sweet_potato_cupcake",
            ()-> new Item(new Item.Properties().food(ModFoods.SWEET_POTATO_CUPCAKE)));
    public static final DeferredItem<Item> SWEET_POTATO_PANCAKES = ITEMS.register("sweet_potato_pancakes",
            ()->new ConsumableItem(bowlFoodItem(ModFoods.SWEET_POTATO_PANCAKES), true));

    // Turnip
    public static final DeferredItem<Item> TURNIP = ITEMS.register("turnip",
            ()->new Item(new Item.Properties().food(ModFoods.TURNIP)));
    public static final DeferredItem<Item> TURNIP_BEEF_STEW = ITEMS.register("turnip_beef_stew",
            ()->new ConsumableItem(bowlFoodItem(ModFoods.TURNIP_BEEF_STEW), true));
    public static final DeferredItem<Item> TURNIP_CAKE = ITEMS.register("turnip_cake",
            ()->new Item(new Item.Properties().food(ModFoods.TURNIP_CAKE)));
    public static final DeferredItem<Item> TURNIP_SALAD = ITEMS.register("turnip_salad",
            ()->new ConsumableItem(bowlFoodItem(ModFoods.TURNIP_SALAD), true));
    public static final DeferredItem<Item> TURNIP_WATER = ITEMS.register("turnip_water",
            ()->new DrinkableItem(bottleItem(ModFoods.TURNIP_WATER),true));
    public static final DeferredItem<Item> TURNIP_MUTTON_SKEWER = ITEMS.register("turnip_mutton_skewer",
            ()->new ConsumableItem(stickItem(ModFoods.TURNIP_MUTTON_SKEWER)));

    // Zucchini
    public static final DeferredItem<Item> COLESLAW = ITEMS.register("coleslaw",
            ()->new ConsumableItem(bowlFoodItem(ModFoods.COLESLAW), true));
    public static final DeferredItem<Item> ZUCCHINI = ITEMS.register("zucchini",
            ()->new Item(new Item.Properties().food(ModFoods.ZUCCHINI)));
    public static final DeferredItem<Item> ROASTED_ZUCCHINI = ITEMS.register("roasted_zucchini",
            ()->new Item(new Item.Properties().food(ModFoods.ROASTED_ZUCCHINI)));
    public static final DeferredItem<Item> ZUCCHINI_SANDWICH = ITEMS.register("zucchini_sandwich",
            ()->new Item(new Item.Properties().food(ModFoods.ZUCCHINI_SANDWICH)));
    public static final DeferredItem<Item> ZUCCHINI_SLICE = ITEMS.register("zucchini_slice",
            ()->new Item(new Item.Properties().food(ModFoods.ZUCCHINI_SLICE)));
    public static final DeferredItem<Item> STUFFED_ZUCCHINIS = ITEMS.register("stuffed_zucchinis",
            ()->new ConsumableItem(bowlFoodItem(ModFoods.STUFFED_ZUCCHINIS), true));
    public static final DeferredItem<Item> ZUCCHINI_QUICHE_SLICE = ITEMS.register("zucchini_quiche_slice",
            ()->new Item(new Item.Properties().food(ModFoods.ZUCCHINI_QUICHE_SLICE)));
    public static final DeferredItem<Item> STUFFED_ZUCCHINI_BOAT = ITEMS.register("stuffed_zucchini_boat",
            ()->new Item(new Item.Properties().food(ModFoods.STUFFED_ZUCCHINI_BOAT)));

    // Misc
    public static final DeferredItem<Item> CARROT_JUICE = ITEMS.register("carrot_juice",
            ()->new DrinkableItem(bottleItem(ModFoods.CARROT_JUICE),true));
    public static final DeferredItem<Item> DANDELION_JUICE = ITEMS.register("dandelion_juice",
            ()->new DrinkableItem(bottleItem(ModFoods.DANDELION_JUICE),true));
    public static final DeferredItem<Item> DANDELION_LEAF = ITEMS.register("dandelion_leaf",
            ()->new Item(new Item.Properties().food(ModFoods.DANDELION_LEAF)));
    public static final DeferredItem<Item> DANDELION_AND_EGGS = ITEMS.register("dandelion_and_eggs",
            ()->new ConsumableItem(bowlFoodItem(ModFoods.DANDELION_WITH_EGGS), true));
    public static final DeferredItem<Item> FISH_AND_CHIPS = ITEMS.register("fish_and_chips",
            ()->new ConsumableItem(bowlFoodItem(ModFoods.FISH_AND_CHIPS), true));
    public static final DeferredItem<Item> ROASTED_VEGETABLES = ITEMS.register("roasted_vegetables",
            ()->new ConsumableItem(bowlFoodItem(ModFoods.ROASTED_VEGETABLES), true));
    public static final DeferredItem<Item> BEETROOT_BROWNIE = ITEMS.register("beetroot_brownie",
            ()-> new Item(new Item.Properties().food(ModFoods.BEETROOT_BROWNIE)));
    public static final DeferredItem<Item> CARROT_CAKE_SLICE = ITEMS.register("carrot_cake_slice",
            ()-> new Item(new Item.Properties().food(ModFoods.CARROT_CAKE_SLICE)));
    public static final DeferredItem<Item> LASAGNA_SLICE = ITEMS.register("lasagna_slice",
            ()->new ConsumableItem(bowlFoodItem(ModFoods.LASAGNA_SLICE), true));
    public static final DeferredItem<Item> RAW_VEGETARIAN_PATTY = ITEMS.register("raw_vegetarian_patty",
            ()->new Item(new Item.Properties().food(ModFoods.RAW_VEGETARIAN_PATTY)));
    public static final DeferredItem<Item> COOKED_VEGETARIAN_PATTY = ITEMS.register("cooked_vegetarian_patty",
            ()->new Item(new Item.Properties().food(ModFoods.COOKED_VEGETARIAN_PATTY)));
    public static final DeferredItem<Item> VEGETARIAN_BURGER = ITEMS.register("vegetarian_burger",
            ()->new Item(new Item.Properties().food(ModFoods.VEGETARIAN_BURGER)));
    public static final DeferredItem<Item> RICE_AND_VEGETABLES = ITEMS.register("rice_and_vegetables",
            ()-> new ConsumableItem(bowlFoodItem(ModFoods.RICE_AND_VEGETABLES), true));
    public static final DeferredItem<Item> VEGETABLES_WRAP = ITEMS.register("vegetables_wrap",
            ()->new Item(new Item.Properties().food(ModFoods.VEGETABLES_WRAP)));
}
