package net.mehdinoui.veggiesdelight.data;

import net.mehdinoui.veggiesdelight.VeggiesDelight;
import net.mehdinoui.veggiesdelight.data.recipes.ModBasicRecipes;
import net.mehdinoui.veggiesdelight.data.recipes.ModCookingRecipes;
import net.mehdinoui.veggiesdelight.data.recipes.ModCuttingRecipes;
import net.mehdinoui.veggiesdelight.data.recipes.ModSmeltingRecipes;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

@Mod.EventBusSubscriber(modid = VeggiesDelight.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        BlockTags blockTags = new BlockTags(packOutput, lookupProvider, existingFileHelper);

        // Tags
        generator.addProvider(event.includeServer(), blockTags);
        generator.addProvider(event.includeServer(),
                new ItemTags(packOutput, lookupProvider, blockTags.contentsGetter(), existingFileHelper));
        // Models
        generator.addProvider(event.includeClient(), new ModItemModelProvider(packOutput, existingFileHelper));
        // Recipes
        generator.addProvider(event.includeServer(),
                new RecipeProvider(packOutput) {
                    @Override
                    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
                        ModBasicRecipes.register(consumer);
                        ModCookingRecipes.register(consumer);
                        ModCuttingRecipes.register(consumer);
                        ModSmeltingRecipes.register(consumer);
                    }
                });
    }
}