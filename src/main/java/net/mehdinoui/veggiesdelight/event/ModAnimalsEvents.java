package net.mehdinoui.veggiesdelight.event;

import net.mehdinoui.veggiesdelight.registry.ModItems;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.entity.animal.Pig;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.crafting.CompoundIngredient;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

import java.util.Arrays;

import static net.mehdinoui.veggiesdelight.VeggiesDelight.MOD_ID;

@Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModAnimalsEvents {
    @SubscribeEvent
    public static void onCommonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            Ingredient newPigFood = Ingredient.of(
                    ModItems.BELLPEPPER.get(),
                    ModItems.CAULIFLOWER.get(),
                    ModItems.CAULIFLOWER_FLORET.get(),
                    ModItems.SWEET_POTATO.get(),
                    ModItems.TURNIP.get(),
                    ModItems.ZUCCHINI.get(),
                    ModItems.ZUCCHINI_SLICE.get());
            Pig.FOOD_ITEMS = new CompoundIngredient(Arrays.asList(Pig.FOOD_ITEMS, newPigFood)) {};

            Ingredient newChickenFood = Ingredient.of(
                    ModItems.BELLPEPPER_SEEDS.get(),
                    ModItems.BROCCOLI_SEEDS.get(),
                    ModItems.CAULIFLOWER_SEEDS.get(),
                    ModItems.TURNIP_SEEDS.get(),
                    ModItems.ZUCCHINI_SEEDS.get()
            );
            Chicken.FOOD_ITEMS = new CompoundIngredient(Arrays.asList(Chicken.FOOD_ITEMS, newChickenFood)) {};
        });
    }
}
