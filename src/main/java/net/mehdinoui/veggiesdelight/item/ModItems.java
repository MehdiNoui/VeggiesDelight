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

public class ModItems {
    //long list of ITEMS
    public final static DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, VeggiesDelight.MOD_ID);

    public static Item.Properties bowlFoodItem(FoodProperties food) {
        return new Item.Properties().food(food).craftRemainder(Items.BOWL).stacksTo(16);
    }

    public static final RegistryObject<Item> BELLPEPPER_SEEDS = ITEMS.register("bellpepper_seeds",
            ()->new ItemNameBlockItem(ModBlocks.BELLPEPPER_CROP.get(),new Item.Properties()));

    public static final RegistryObject<Item> CAULIFLOWER_SEEDS = ITEMS.register("cauliflower_seeds",
            ()->new ItemNameBlockItem(ModBlocks.CAULIFLOWER_CROP.get(),new Item.Properties()));


    //BELL PEPPER

    public static final RegistryObject<Item> BELLPEPPER= ITEMS.register("bellpepper",
            ()->new Item(new Item.Properties().food(ModFoods.BELLPEPPER)));
    public static final RegistryObject<Item> SMOKED_BELLPEPPER = ITEMS.register("smoked_bellpepper",
            ()->new Item(new Item.Properties().food(ModFoods.SMOKED_BELLPEPPER)));

    public static final RegistryObject<Item> VEGAN_PIZZA = ITEMS.register("vegan_pizza",
            ()->new Item(new Item.Properties()));
    public static final RegistryObject<Item> VEGAN_PIZZA_SLICE = ITEMS.register("vegan_pizza_slice",
            ()->new ConsumableItem(bowlFoodItem(ModFoods.VEGAN_PIZZA_SLICE), true));

    public static final RegistryObject<Item> CACCIATORE = ITEMS.register("cacciatore",
            ()->new ConsumableItem(bowlFoodItem(ModFoods.CACCIATORE), true));
    public static final RegistryObject<Item> SHAKSHOUKA = ITEMS.register("shakshouka",
            ()->new ConsumableItem(bowlFoodItem(ModFoods.SHAKSHOUKA), true));
    public static final RegistryObject<Item> STUFFED_BELLPEPPERS= ITEMS.register("stuffed_bellpeppers",
            ()->new ConsumableItem(bowlFoodItem(ModFoods.STUFFED_BELLPEPPERS), true));

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


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
