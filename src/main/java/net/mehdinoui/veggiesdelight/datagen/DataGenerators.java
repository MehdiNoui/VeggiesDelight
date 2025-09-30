package net.mehdinoui.veggiesdelight.datagen;

import net.mehdinoui.veggiesdelight.VeggiesDelight;
import net.mehdinoui.veggiesdelight.datagen.recipe.ModBasicRecipes;
import net.mehdinoui.veggiesdelight.datagen.recipe.ModCookingRecipes;
import net.mehdinoui.veggiesdelight.datagen.recipe.ModCuttingRecipes;
import net.mehdinoui.veggiesdelight.datagen.recipe.ModSmeltingRecipes;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = VeggiesDelight.MOD_ID)
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
        // Compostables (DataMapProvider)
        generator.addProvider(event.includeServer(),
                new ModCompostablesDataMap(packOutput, lookupProvider));
        // Models
        generator.addProvider(event.includeClient(), new ModItemModelProvider(packOutput, existingFileHelper));
        // Recipes
        generator.addProvider(event.includeServer(),
                new RecipeProvider(packOutput,lookupProvider) {
                    @Override
                    protected void buildRecipes(@NotNull RecipeOutput output) {
                        ModBasicRecipes.register(output);
                        ModCookingRecipes.register(output);
                        ModCuttingRecipes.register(output);
                        ModSmeltingRecipes.register(output);
                    }
                });
    }
}