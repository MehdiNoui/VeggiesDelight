package net.mehdinoui.veggiesdelight.datagen;

import net.mehdinoui.veggiesdelight.VeggiesDelight;
import net.mehdinoui.veggiesdelight.registry.ModBlocks;
import net.mehdinoui.veggiesdelight.registry.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, VeggiesDelight.MOD_ID, existingFileHelper);
    }
    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(VeggiesDelight.MOD_ID,"item/" + item.getId().getPath()));
    }
    public void simpleBlock(RegistryObject<Block> block) {
        this.withExistingParent(VeggiesDelight.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }
    private ItemModelBuilder flowerItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(VeggiesDelight.MOD_ID,"block/" + item.getId().getPath()));
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.BELLPEPPER);
        simpleItem(ModItems.BELLPEPPER_SEEDS);
        simpleItem(ModItems.CACCIATORE);
        simpleItem(ModItems.SHAKSHOUKA);
        simpleItem(ModItems.SMOKED_BELLPEPPER);
        simpleItem(ModItems.STUFFED_BELLPEPPERS_BLOCK);
        simpleItem(ModItems.UNCOOKED_MHADJEB);
        simpleItem(ModItems.MHADJEB);
        simpleItem(ModItems.VEGAN_PIZZA);
        simpleItem(ModItems.VEGAN_PIZZA_SLICE);
        simpleItem(ModItems.CHICKEN_FAJITAS_WRAP);
        simpleItem(ModItems.STUFFED_BELLPEPPER);

        simpleItem(ModItems.BROCCOLI);
        simpleItem(ModItems.BROCCOLI_SEEDS);
        simpleItem(ModItems.BROCCOLI_SALAD);
        simpleItem(ModItems.BROCCOLI_SOUP);
        simpleItem(ModItems.PASTA_WITH_BROCCOLI);

        simpleItem(ModItems.CAULIFLOWER);
        simpleItem(ModItems.CAULIFLOWER_SEEDS);
        simpleItem(ModItems.CAULIFLOWER_FLORET);
        simpleItem(ModItems.ROASTED_CAULIFLOWER_FLORET);
        simpleItem(ModItems.CAULIFLOWER_BREAD);
        simpleItem(ModItems.CAULIFLOWER_PATTY);
        simpleItem(ModItems.COOKED_CAULIFLOWER_PATTY);
        simpleItem(ModItems.CAULIFLOWER_SOUP);
        simpleItem(ModItems.CAULIFLOWER_BURGER);
        simpleItem(ModItems.CAULIFLOWER_KUKU);

        simpleItem(ModItems.GARLIC);
        simpleItem(ModItems.GARLIC_CLOVE);
        simpleItem(ModItems.ROASTED_GARLIC_CLOVE);
        simpleItem(ModItems.GARLIC_BAKED_COD);
        simpleItem(ModItems.GARLIC_CHICKEN_STEW);
        simpleItem(ModItems.GARLIC_RICE_WITH_CAULIFLOWER);
        simpleItem(ModItems.GARLIC_BREAD);
        simpleItem(ModItems.CESAR_SALAD);
        simpleItem(ModItems.FERMENTED_GARLIC_HONEY);
        simpleItem(ModItems.GARLIC_STUFFED_MUSHROOMS);

        simpleItem(ModItems.SWEET_POTATO);
        simpleItem(ModItems.MASHED_POTATOES);
        simpleItem(ModItems.BAKED_SWEET_POTATO);
        simpleItem(ModItems.SWEET_POTATO_PIE);
        simpleItem(ModItems.SWEET_POTATO_PIE_SLICE);
        simpleItem(ModItems.POTATO_NOODLE);
        simpleItem(ModItems.POTATO_NOODLES);
        simpleItem(ModItems.SWEET_POTATO_CUPCAKE);
        simpleItem(ModItems.SWEET_POTATO_DOUGH);
        simpleItem(ModItems.SWEET_POTATO_PANCAKES);

        simpleItem(ModItems.TURNIP);
        simpleItem(ModItems.TURNIP_SEEDS);
        simpleItem(ModItems.TURNIP_BEEF_STEW);
        simpleItem(ModItems.TURNIP_CAKE);
        simpleItem(ModItems.TURNIP_SALAD);
        simpleItem(ModItems.TURNIP_WATER);

        simpleItem(ModItems.ZUCCHINI);
        simpleItem(ModItems.ROASTED_ZUCCHINI);
        simpleItem(ModItems.STUFFED_ZUCCHINIS);
        simpleItem(ModItems.ZUCCHINI_SANDWICH);
        simpleItem(ModItems.ZUCCHINI_SLICE);
        simpleItem(ModItems.ZUCCHINI_SEEDS);

        simpleItem(ModItems.BEETROOT_BROWNIE_TRAY);
        simpleItem(ModItems.BEETROOT_BROWNIE);
        simpleItem(ModItems.CARROT_JUICE);
        simpleItem(ModItems.DANDELION_JUICE);
        simpleItem(ModItems.DANDELION_LEAF);
        simpleItem(ModItems.FISH_AND_CHIPS);
        simpleItem(ModItems.ROASTED_VEGETABLES);
        simpleItem(ModItems.DANDELION_AND_EGGS);
        simpleItem(ModItems.CARROT_CAKE);
        simpleItem(ModItems.CARROT_CAKE_SLICE);

        // Blocks
        simpleBlock(ModBlocks.BELLPEPPER_CRATE);
        simpleBlock(ModBlocks.BROCCOLI_CRATE);
        simpleBlock(ModBlocks.CAULIFLOWER_CRATE);
        simpleBlock(ModBlocks.GARLIC_CRATE);
        simpleBlock(ModBlocks.SWEET_POTATO_CRATE);
        simpleBlock(ModBlocks.TURNIP_CRATE);
        simpleBlock(ModBlocks.ZUCCHINI_CRATE);

        flowerItem(ModBlocks.MATURE_DANDELION);
        flowerItem(ModBlocks.WILD_BELLPEPPERS);
        flowerItem(ModBlocks.WILD_BROCCOLI);
        flowerItem(ModBlocks.WILD_CAULIFLOWERS);
        flowerItem(ModBlocks.WILD_GARLIC);
        flowerItem(ModBlocks.WILD_SWEET_POTATOES);
        flowerItem(ModBlocks.WILD_TURNIPS);
        flowerItem(ModBlocks.WILD_ZUCCHINIS);
    }
}