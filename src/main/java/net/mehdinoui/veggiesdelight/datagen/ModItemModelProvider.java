package net.mehdinoui.veggiesdelight.datagen;

import net.mehdinoui.veggiesdelight.VeggiesDelight;
import net.mehdinoui.veggiesdelight.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, VeggiesDelight.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.BELLPEPPER);
        simpleItem(ModItems.BELLPEPPER_SEEDS);
        simpleItem(ModItems.CACCIATORE);
        simpleItem(ModItems.SHAKSHOUKA);
        simpleItem(ModItems.SMOKED_BELLPEPPER);
        simpleItem(ModItems.STUFFED_BELLPEPPERS);

        simpleItem(ModItems.CAULIFLOWER);
        simpleItem(ModItems.CAULIFLOWER_SEEDS);
        simpleItem(ModItems.CAULIFLOWER_FLORET);
        simpleItem(ModItems.FRIED_CAULIFLOWER_FLORET);
        simpleItem(ModItems.CAULIFLOWER_PATTY);
        simpleItem(ModItems.COOKED_CAULIFLOWER_PATTY);
        simpleItem(ModItems.CAULIFLOWER_SOUP);
        simpleItem(ModItems.CAULIFLOWER_BURGER);

        simpleItem(ModItems.VEGAN_PIZZA);
        simpleItem(ModItems.VEGAN_PIZZA_SLICE);

        simpleItem(ModItems.SWEET_POTATO);
        simpleItem(ModItems.MASHED_POTATOES);
        simpleItem(ModItems.BAKED_SWEET_POTATO);
        simpleItem(ModItems.SWEET_POTATO_PIE);
        simpleItem(ModItems.SWEET_POTATO_PIE_SLICE);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(VeggiesDelight.MOD_ID,"item/" + item.getId().getPath()));
    }
}