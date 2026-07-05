package net.mehdinoui.veggiesdelight.common.registry;

import net.mehdinoui.veggiesdelight.VeggiesDelight;
import net.mehdinoui.veggiesdelight.common.crafting.SweetPotatoDoughRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.SimpleCraftingRecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipeSerializers {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, VeggiesDelight.MOD_ID);
    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }

    // Sweet Potato Dough
    public static final RegistryObject<RecipeSerializer<SweetPotatoDoughRecipe>> SWEET_POTATO_DOUGH =
            SERIALIZERS.register("crafting_special_sweet_potato_dough",
                    () -> new SimpleCraftingRecipeSerializer<>(SweetPotatoDoughRecipe::new));
}