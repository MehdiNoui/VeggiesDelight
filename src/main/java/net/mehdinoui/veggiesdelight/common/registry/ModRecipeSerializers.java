package net.mehdinoui.veggiesdelight.common.registry;

import net.mehdinoui.veggiesdelight.VeggiesDelight;
import net.mehdinoui.veggiesdelight.common.crafting.SweetPotatoDoughRecipe;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.SimpleCraftingRecipeSerializer;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModRecipeSerializers {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(BuiltInRegistries.RECIPE_SERIALIZER, VeggiesDelight.MOD_ID);
    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }

    // Sweet Potato Dough
    public static final Supplier<SimpleCraftingRecipeSerializer<?>> SWEET_POTATO_DOUGH =
            SERIALIZERS.register("crafting_special_sweet_potato_dough",
                    () -> new SimpleCraftingRecipeSerializer<>(SweetPotatoDoughRecipe::new));
}