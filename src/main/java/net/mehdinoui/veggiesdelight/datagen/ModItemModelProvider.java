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
        simpleItem(ModItems.BEETROOT_POUCH);
        simpleItem(ModItems.BELLPEPPER_POUCH);
        simpleItem(ModItems.CABBAGE_POUCH);
        simpleItem(ModItems.CAULIFLOWER_POUCH);
        simpleItem(ModItems.GARLIC_POUCH);
        simpleItem(ModItems.PUMPKIN_POUCH);
        simpleItem(ModItems.TOMATO_POUCH);
        simpleItem(ModItems.MELON_POUCH);
        simpleItem(ModItems.WHEAT_POUCH);


        simpleItem(ModItems.BELLPEPPER);
        simpleItem(ModItems.BELLPEPPER_SEEDS);
        simpleItem(ModItems.CACCIATORE);
        simpleItem(ModItems.SHAKSHOUKA);
        simpleItem(ModItems.SMOKED_BELLPEPPER);
        simpleItem(ModItems.STUFFED_BELLPEPPERS);
        simpleItem(ModItems.UNCOOKED_MHADJEB);
        simpleItem(ModItems.MHADJEB);
        simpleItem(ModItems.VEGAN_PIZZA);
        simpleItem(ModItems.VEGAN_PIZZA_SLICE);
        simpleItem(ModItems.STEAK_FAJITAS);

        simpleItem(ModItems.CAULIFLOWER);
        simpleItem(ModItems.CAULIFLOWER_SEEDS);
        simpleItem(ModItems.CAULIFLOWER_FLORET);
        simpleItem(ModItems.FRIED_CAULIFLOWER_FLORET);
        simpleItem(ModItems.CAULIFLOWER_PATTY);
        simpleItem(ModItems.COOKED_CAULIFLOWER_PATTY);
        simpleItem(ModItems.CAULIFLOWER_SOUP);
        simpleItem(ModItems.CAULIFLOWER_BURGER);
        simpleItem(ModItems.WHOLE_ROASTED_CAULIFLOWER);

        simpleItem(ModItems.SWEET_POTATO);
        simpleItem(ModItems.MASHED_POTATOES);
        simpleItem(ModItems.BAKED_SWEET_POTATO);
        simpleItem(ModItems.SWEET_POTATO_PIE);
        simpleItem(ModItems.SWEET_POTATO_PIE_SLICE);
        simpleItem(ModItems.POTATO_NOODLE);
        simpleItem(ModItems.POTATO_NOODLES);
        simpleItem(ModItems.SWEET_POTATO_CUPCAKE);
        simpleItem(ModItems.SWEET_POTATO_DOUGH);
        simpleItem(ModItems.SWEET_POTATO_MOCHI);

        simpleItem(ModItems.GARLIC);
        simpleItem(ModItems.GARLIC_CLOVE);
        simpleItem(ModItems.GARLIC_SEEDS);
        simpleItem(ModItems.ROASTED_GARLIC_CLOVE);
        simpleItem(ModItems.GARLIC_BAKED_COD);
        simpleItem(ModItems.GARLIC_CHICKEN_STEW);
        simpleItem(ModItems.GARLIC_RICE_WITH_CAULIFLOWER);
        simpleItem(ModItems.GARLIC_BREAD);
        simpleItem(ModItems.CESAR_SALAD);
        simpleItem(ModItems.FERMENTED_GARLIC_HONEY);
        simpleItem(ModItems.GARLIC_STUFFED_MUSHROOMS);

        simpleItem(ModItems.BEETROOT_BROWNIE_TRAY);
        simpleItem(ModItems.BEETROOT_BROWNIE);
        simpleItem(ModItems.CARROT_JUICE);
        simpleItem(ModItems.DANDELION_JUICE);
        simpleItem(ModItems.DANDELION_LEAF);
        simpleItem(ModItems.FISH_AND_CHIPS);
        simpleItem(ModItems.ROASTED_VEGETABLES);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(VeggiesDelight.MOD_ID,"item/" + item.getId().getPath()));
    }
}