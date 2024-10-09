package net.mehdinoui.veggiesdelight.item;

import net.mehdinoui.veggiesdelight.VeggiesDelight;
import net.mehdinoui.veggiesdelight.block.ModBlocks;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.common.item.ConsumableItem;
import vectorwing.farmersdelight.common.item.DrinkableItem;

public class ModItems {
    //long list of ITEMS
    public final static DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, VeggiesDelight.MOD_ID);

    public static Item.Properties bowlFoodItem(FoodProperties food) {
        return new Item.Properties().food(food).craftRemainder(Items.BOWL).stacksTo(16);
    }

    public static Item.Properties bottleItem(FoodProperties food) {
        return new Item.Properties().food(food).craftRemainder(Items.GLASS_BOTTLE).stacksTo(32);
    }


    //SEEDS
    public static final RegistryObject<Item> BELLPEPPER_SEEDS = ITEMS.register("bellpepper_seeds",
            ()->new ItemNameBlockItem(ModBlocks.BELLPEPPER_CROP.get(),new Item.Properties()));
    public static final RegistryObject<Item> CAULIFLOWER_SEEDS = ITEMS.register("cauliflower_seeds",
            ()->new ItemNameBlockItem(ModBlocks.CAULIFLOWER_CROP.get(),new Item.Properties()));
    public static final RegistryObject<Item> SWEET_POTATO = ITEMS.register("sweet_potato",
            () -> new ItemNameBlockItem(ModBlocks.SWEET_POTATO_CROP.get(),
                    new Item.Properties().food(new FoodProperties.Builder()
                            .nutrition(1)
                            .saturationMod(0.1f)
                            .build())));
    public static final RegistryObject<Item> GARLIC_SEEDS = ITEMS.register("garlic_seeds",
            ()->new ItemNameBlockItem(ModBlocks.GARLIC_CROP.get(),new Item.Properties()));


    //POUCHES
    public static final RegistryObject<Item> BELLPEPPER_POUCH = ITEMS.register("bellpepper_pouch",
            ()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> BEETROOT_POUCH = ITEMS.register("beetroot_pouch",
            ()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> CABBAGE_POUCH = ITEMS.register("cabbage_pouch",
            ()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> CAULIFLOWER_POUCH = ITEMS.register("cauliflower_pouch",
            ()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> GARLIC_POUCH = ITEMS.register("garlic_pouch",
            ()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> PUMPKIN_POUCH = ITEMS.register("pumpkin_pouch",
            ()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> TOMATO_POUCH = ITEMS.register("tomato_pouch",
            ()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> MELON_POUCH = ITEMS.register("melon_pouch",
            ()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> WHEAT_POUCH = ITEMS.register("wheat_pouch",
            ()->new Item(new Item.Properties()));


    //BELL PEPPER
    public static final RegistryObject<Item> BELLPEPPER= ITEMS.register("bellpepper",
            ()->new Item(new Item.Properties().food(ModFoods.BELLPEPPER)));
    public static final RegistryObject<Item> SMOKED_BELLPEPPER = ITEMS.register("smoked_bellpepper",
            ()->new Item(new Item.Properties().food(ModFoods.SMOKED_BELLPEPPER)));
    public static final RegistryObject<Item> CACCIATORE = ITEMS.register("cacciatore",
            ()->new ConsumableItem(bowlFoodItem(ModFoods.CACCIATORE), true));
    public static final RegistryObject<Item> SHAKSHOUKA = ITEMS.register("shakshouka",
            ()->new ConsumableItem(bowlFoodItem(ModFoods.SHAKSHOUKA), true));
    public static final RegistryObject<Item> STUFFED_BELLPEPPERS= ITEMS.register("stuffed_bellpeppers",
            ()->new ConsumableItem(bowlFoodItem(ModFoods.STUFFED_BELLPEPPERS), true));
    public static final RegistryObject<Item> UNCOOKED_MHADJEB = ITEMS.register("uncooked_mhadjeb",
            ()->new Item(new Item.Properties().food(ModFoods.UNCOOKED_MHADJEB)));
    public static final RegistryObject<Item> MHADJEB = ITEMS.register("mhadjeb",
            ()->new Item(new Item.Properties().food(ModFoods.MHADJEB)));
    public static final RegistryObject<Item> VEGAN_PIZZA = ITEMS.register("vegan_pizza",
            ()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> VEGAN_PIZZA_SLICE = ITEMS.register("vegan_pizza_slice",
            ()->new Item(new Item.Properties().food(ModFoods.VEGAN_PIZZA_SLICE)));

    //CAULIFLOWER
    public static final RegistryObject<Item> CAULIFLOWER = ITEMS.register("cauliflower",
            ()->new Item(new Item.Properties().food(ModFoods.CAULIFLOWER)));
    public static final RegistryObject<Item> CAULIFLOWER_FLORET = ITEMS.register("cauliflower_floret",
            ()->new Item(new Item.Properties().food(ModFoods.CAULIFLOWER_FLORET)));
    public static final RegistryObject<Item> FRIED_CAULIFLOWER_FLORET = ITEMS.register("fried_cauliflower_floret",
            ()->new Item(new Item.Properties().food(ModFoods.FRIED_CAULIFLOWER_FLORET)));
    public static final RegistryObject<Item> CAULIFLOWER_PATTY = ITEMS.register("cauliflower_patty",
            ()->new Item(new Item.Properties().food(ModFoods.CAULIFLOWER_PATTY)));
    public static final RegistryObject<Item> COOKED_CAULIFLOWER_PATTY = ITEMS.register("cooked_cauliflower_patty",
            ()->new Item(new Item.Properties().food(ModFoods.COOKED_CAULIFLOWER_PATTY)));
    public static final RegistryObject<Item> CAULIFLOWER_SOUP = ITEMS.register("cauliflower_soup",
            ()->new ConsumableItem(bowlFoodItem(ModFoods.CAULIFLOWER_SOUP), true));
    public static final RegistryObject<Item> CAULIFLOWER_BURGER = ITEMS.register("cauliflower_burger",
            ()->new Item(new Item.Properties().food(ModFoods.CAULIFLOWER_BURGER)));


    //SWEET POTATO
    public static final RegistryObject<Item> BAKED_SWEET_POTATO = ITEMS.register("baked_sweet_potato",
            ()->new Item(new Item.Properties().food(ModFoods.BAKED_SWEET_POTATO)));
    public static final RegistryObject<Item> MASHED_POTATOES = ITEMS.register("mashed_potatoes",
            ()->new ConsumableItem(bowlFoodItem(ModFoods.MASHED_POTATOES), true));
    public static final RegistryObject<Item> POTATO_NOODLE = ITEMS.register("potato_noodle",
            ()->new Item(new Item.Properties().food(ModFoods.POTATO_NOODLE)));
    public static final RegistryObject<Item> POTATO_NOODLES = ITEMS.register("potato_noodles",
            ()->new ConsumableItem(bowlFoodItem(ModFoods.POTATO_NOODLES), true));
    public static final RegistryObject<Item> SWEET_POTATO_PIE = ITEMS.register("sweet_potato_pie",
            ()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> SWEET_POTATO_PIE_SLICE = ITEMS.register("sweet_potato_pie_slice",
            ()->new Item(new Item.Properties().food(ModFoods.SWEET_POTATO_PIE_SLICE)));

    //GARLIC
    public static final RegistryObject<Item> GARLIC = ITEMS.register("garlic",
            ()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> GARLIC_CLOVE = ITEMS.register("garlic_clove",
            ()-> new Item(new Item.Properties().food(ModFoods.GARLIC_CLOVE)));
    public static final RegistryObject<Item> ROASTED_GARLIC_CLOVE = ITEMS.register("roasted_garlic_clove",
            ()-> new Item(new Item.Properties().food(ModFoods.ROASTED_GARLIC_CLOVE)));
    public static final RegistryObject<Item> GARLIC_BREAD = ITEMS.register("garlic_bread",
            ()-> new Item(new Item.Properties().food(ModFoods.GARLIC_BREAD)));
    public static final RegistryObject<Item> GARLIC_CHICKEN_STEW = ITEMS.register("garlic_chicken_stew",
            ()->new ConsumableItem(bowlFoodItem(ModFoods.GARLIC_CHICKEN_STEW), true));
    public static final RegistryObject<Item> GARLIC_BAKED_COD = ITEMS.register("garlic_baked_cod",
            ()->new ConsumableItem(bowlFoodItem(ModFoods.GARLIC_BAKED_COD), true));
    public static final RegistryObject<Item> GARLIC_RICE_WITH_CAULIFLOWER= ITEMS.register("garlic_rice_with_cauliflower",
            ()->new ConsumableItem(bowlFoodItem(ModFoods.GARLIC_RICE_WITH_CAULIFLOWER), true));
    public static final RegistryObject<Item> CESAR_SALAD = ITEMS.register("cesar_salad",
            ()->new ConsumableItem(bowlFoodItem(ModFoods.CESAR_SALAD), true));
    public static final RegistryObject<Item> FERMENTED_GARLIC_HONEY = ITEMS.register("fermented_garlic_honey",
            ()->new DrinkableItem(bottleItem(ModFoods.FERMENTED_GARLIC_HONEY),true));

    //MISC
    public static final RegistryObject<Item> BEETROOT_BROWNIE = ITEMS.register("beetroot_brownie",
            ()-> new Item(new Item.Properties().food(ModFoods.BEETROOT_BROWNIE)));
    public static final RegistryObject<Item> CARROT_JUICE = ITEMS.register("carrot_juice",
            ()->new DrinkableItem(bottleItem(ModFoods.CARROT_JUICE),true));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
