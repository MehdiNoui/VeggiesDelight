package net.mehdinoui.veggiesdelight.common.event;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import net.mehdinoui.veggiesdelight.common.registry.ModItems;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.entity.animal.Parrot;
import net.minecraft.world.entity.animal.Pig;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.crafting.CompoundIngredient;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

import java.util.*;

import static net.mehdinoui.veggiesdelight.VeggiesDelight.MOD_ID;

@Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModMobsEvents {
    @SubscribeEvent
    public static void onCommonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
        // Chicken Food
            Ingredient newChickenFood = Ingredient.of(
                    ModItems.BELLPEPPER_SEEDS.get(),
                    ModItems.BROCCOLI_SEEDS.get(),
                    ModItems.CAULIFLOWER_SEEDS.get(),
                    ModItems.TURNIP_SEEDS.get(),
                    ModItems.ZUCCHINI_SEEDS.get()
            );
            Chicken.FOOD_ITEMS = new CompoundIngredient(Arrays.asList(Chicken.FOOD_ITEMS, newChickenFood)) {};
        // Pig Food
            Ingredient newPigFood = Ingredient.of(
                    ModItems.BELLPEPPER.get(),
                    ModItems.CAULIFLOWER.get(),
                    ModItems.CAULIFLOWER_FLORET.get(),
                    ModItems.SWEET_POTATO.get(),
                    ModItems.TURNIP.get(),
                    ModItems.ZUCCHINI.get(),
                    ModItems.ZUCCHINI_SLICE.get());
            Pig.FOOD_ITEMS = new CompoundIngredient(Arrays.asList(Pig.FOOD_ITEMS, newPigFood)) {};
        });
        // Parrot Tame Food
        Collections.addAll(Parrot.TAME_FOOD,
                ModItems.BROCCOLI_SEEDS.get(),
                ModItems.CAULIFLOWER_SEEDS.get(),
                ModItems.TURNIP_SEEDS.get(),
                ModItems.ZUCCHINI_SEEDS.get());

        // Villager Wanted Items
        Set<Item> newWantedItems = Sets.newHashSet(
                ModItems.CAULIFLOWER_BREAD.get(),
                ModItems.BELLPEPPER.get(),
                ModItems.BELLPEPPER_SEEDS.get(),
                ModItems.BROCCOLI.get(),
                ModItems.BROCCOLI_SEEDS.get(),
                ModItems.CAULIFLOWER.get(),
                ModItems.CAULIFLOWER_SEEDS.get(),
                ModItems.GARLIC.get(),
                ModItems.GARLIC_CLOVE.get(),
                ModItems.SWEET_POTATO.get(),
                ModItems.TURNIP.get(),
                ModItems.TURNIP_SEEDS.get(),
                ModItems.ZUCCHINI.get(),
                ModItems.ZUCCHINI_SLICE.get());

        newWantedItems.addAll(Villager.WANTED_ITEMS);
        Villager.WANTED_ITEMS = ImmutableSet.copyOf(newWantedItems);

        // Food Points
        HashMap<Item, Integer> newFoodPoints = new HashMap<>();
        // Bread equivalents get 4 points
        newFoodPoints.put(ModItems.CAULIFLOWER_BREAD.get(), 4);
        // Raw veggies get 1 point
        newFoodPoints.put(ModItems.BELLPEPPER.get(), 1);
        newFoodPoints.put(ModItems.BROCCOLI.get(), 1);
        newFoodPoints.put(ModItems.CAULIFLOWER.get(), 1);
        newFoodPoints.put(ModItems.GARLIC.get(), 1);
        newFoodPoints.put(ModItems.GARLIC_CLOVE.get(), 1);
        newFoodPoints.put(ModItems.SWEET_POTATO.get(), 1);
        newFoodPoints.put(ModItems.TURNIP.get(), 1);
        newFoodPoints.put(ModItems.ZUCCHINI.get(), 1);
        newFoodPoints.put(ModItems.ZUCCHINI_SLICE.get(), 1);
        newFoodPoints.putAll(Villager.FOOD_POINTS);

        Villager.FOOD_POINTS = ImmutableMap.copyOf(newFoodPoints);
    };
}
