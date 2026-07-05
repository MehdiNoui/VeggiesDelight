package net.mehdinoui.veggiesdelight.data;

import net.mehdinoui.veggiesdelight.VeggiesDelight;
import net.mehdinoui.veggiesdelight.common.registry.ModItems;
import net.mehdinoui.veggiesdelight.common.tag.VDCommonTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vectorwing.farmersdelight.common.tag.CommonTags;
import vectorwing.farmersdelight.common.tag.ModTags;

import java.util.concurrent.CompletableFuture;

public class ItemTags extends ItemTagsProvider {
    public ItemTags(PackOutput output, CompletableFuture<HolderLookup.Provider> provider, CompletableFuture<TagsProvider.TagLookup<Block>> blockTagProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, provider, blockTagProvider, VeggiesDelight.MOD_ID, existingFileHelper);
    }
    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        this.registerCommonTags();
        this.registerMinecraftTags();
        this.registerFarmersDelightTags();
    }
    protected void registerCommonTags() {
        tag(CommonTags.Items.BREAD).addTag(VDCommonTags.BREAD_CAULIFLOWER);
        tag(VDCommonTags.BREAD_CAULIFLOWER).add(ModItems.CAULIFLOWER_BREAD.get());

        tag(CommonTags.Items.CROPS).addTag(VDCommonTags.CROPS_BELLPEPPER);
        tag(VDCommonTags.CROPS_BELLPEPPER).add(ModItems.BELLPEPPER.get());
        tag(CommonTags.Items.CROPS).addTag(VDCommonTags.CROPS_BROCCOLI);
        tag(VDCommonTags.CROPS_BROCCOLI).add(ModItems.BROCCOLI.get());
        tag(CommonTags.Items.CROPS).addTag(VDCommonTags.CROPS_CAULIFLOWER);
        tag(VDCommonTags.CROPS_CAULIFLOWER).add(ModItems.CAULIFLOWER.get());
        tag(VDCommonTags.CROPS_CAULIFLOWER).add(ModItems.CAULIFLOWER_FLORET.get());
        tag(CommonTags.Items.CROPS).addTag(VDCommonTags.CROPS_GARLIC);
        tag(VDCommonTags.CROPS_GARLIC).add(ModItems.GARLIC.get());
        tag(VDCommonTags.CROPS_GARLIC).add(ModItems.GARLIC_CLOVE.get());
        tag(CommonTags.Items.CROPS).addTag(VDCommonTags.CROPS_SWEET_POTATO);
        tag(VDCommonTags.CROPS_SWEET_POTATO).add(ModItems.SWEET_POTATO.get());
        tag(CommonTags.Items.CROPS).addTag(VDCommonTags.CROPS_TURNIP);
        tag(VDCommonTags.CROPS_TURNIP).add(ModItems.TURNIP.get());
        tag(CommonTags.Items.CROPS).addTag(VDCommonTags.CROPS_ZUCCHINI);
        tag(VDCommonTags.CROPS_ZUCCHINI).add(ModItems.ZUCCHINI.get());
        tag(VDCommonTags.CROPS_ZUCCHINI).add(ModItems.ZUCCHINI_SLICE.get());

        tag(CommonTags.Items.DOUGH).addTag(VDCommonTags.DOUGH_SWEET_POTATO);
        tag(VDCommonTags.DOUGH_SWEET_POTATO).add(ModItems.SWEET_POTATO_DOUGH.get());

        tag(CommonTags.Items.SALAD_INGREDIENTS).addTag(VDCommonTags.SALAD_INGREDIENTS_DANDELION);
        tag(VDCommonTags.SALAD_INGREDIENTS_DANDELION).add(ModItems.DANDELION_LEAF.get());


        tag(CommonTags.Items.SEEDS).addTag(VDCommonTags.SEEDS_BELLPEPPER);
        tag(VDCommonTags.SEEDS_BELLPEPPER).add(ModItems.BELLPEPPER_SEEDS.get());
        tag(CommonTags.Items.SEEDS).addTag(VDCommonTags.SEEDS_BROCCOLI);
        tag(VDCommonTags.SEEDS_BROCCOLI).add(ModItems.BROCCOLI_SEEDS.get());
        tag(CommonTags.Items.SEEDS).addTag(VDCommonTags.SEEDS_CAULIFLOWER);
        tag(VDCommonTags.SEEDS_CAULIFLOWER).add(ModItems.CAULIFLOWER_SEEDS.get());
        tag(CommonTags.Items.SEEDS).addTag(VDCommonTags.SEEDS_TURNIP);
        tag(VDCommonTags.SEEDS_TURNIP).add(ModItems.TURNIP_SEEDS.get());
        tag(CommonTags.Items.SEEDS).addTag(VDCommonTags.SEEDS_ZUCCHINI);
        tag(VDCommonTags.SEEDS_ZUCCHINI).add(ModItems.ZUCCHINI_SEEDS.get());

        tag(VDCommonTags.STORAGE_BLOCKS_ITEM_BELLPEPPER).add(ModItems.BELLPEPPER_CRATE.get());
        tag(VDCommonTags.STORAGE_BLOCKS_ITEM_BROCCOLI).add(ModItems.BROCCOLI_CRATE.get());
        tag(VDCommonTags.STORAGE_BLOCKS_ITEM_CAULIFLOWER).add(ModItems.CAULIFLOWER_CRATE.get());
        tag(VDCommonTags.STORAGE_BLOCKS_ITEM_GARLIC).add(ModItems.GARLIC_CRATE.get());
        tag(VDCommonTags.STORAGE_BLOCKS_ITEM_SWEET_POTATO).add(ModItems.SWEET_POTATO_CRATE.get());
        tag(VDCommonTags.STORAGE_BLOCKS_ITEM_TURNIP).add(ModItems.TURNIP_CRATE.get());
        tag(VDCommonTags.STORAGE_BLOCKS_ITEM_ZUCCHINI).add(ModItems.ZUCCHINI_CRATE.get());

        tag(CommonTags.Items.VEGETABLES).addTag(VDCommonTags.VEGETABLES_BELLPEPPER);
        tag(VDCommonTags.VEGETABLES_BELLPEPPER).add(ModItems.BELLPEPPER.get());
        tag(CommonTags.Items.VEGETABLES).addTag(VDCommonTags.VEGETABLES_BROCCOLI);
        tag(VDCommonTags.VEGETABLES_BROCCOLI).add(ModItems.BROCCOLI.get());
        tag(CommonTags.Items.VEGETABLES).addTag(VDCommonTags.VEGETABLES_CAULIFLOWER);
        tag(VDCommonTags.VEGETABLES_CAULIFLOWER).add(ModItems.CAULIFLOWER.get());
        tag(VDCommonTags.VEGETABLES_CAULIFLOWER).add(ModItems.CAULIFLOWER_FLORET.get());
        tag(CommonTags.Items.VEGETABLES).addTag(VDCommonTags.VEGETABLES_GARLIC);
        tag(VDCommonTags.VEGETABLES_GARLIC).add(ModItems.GARLIC.get());
        tag(VDCommonTags.VEGETABLES_GARLIC).add(ModItems.GARLIC_CLOVE.get());
        tag(CommonTags.Items.VEGETABLES).addTag(VDCommonTags.VEGETABLES_SWEET_POTATO);
        tag(VDCommonTags.VEGETABLES_SWEET_POTATO).add(ModItems.SWEET_POTATO.get());
        tag(CommonTags.Items.VEGETABLES_POTATO).add(ModItems.SWEET_POTATO.get());
        tag(CommonTags.Items.VEGETABLES).addTag(VDCommonTags.VEGETABLES_TURNIP);
        tag(VDCommonTags.VEGETABLES_TURNIP).add(ModItems.TURNIP.get());
        tag(CommonTags.Items.VEGETABLES).addTag(VDCommonTags.VEGETABLES_ZUCCHINI);
        tag(VDCommonTags.VEGETABLES_ZUCCHINI).add(ModItems.ZUCCHINI.get());
        tag(VDCommonTags.VEGETABLES_ZUCCHINI).add(ModItems.ZUCCHINI_SLICE.get());

    }
    protected void registerMinecraftTags() {
        tag(net.minecraft.tags.ItemTags.VILLAGER_PLANTABLE_SEEDS).add(
                ModItems.BELLPEPPER_SEEDS.get(),
                ModItems.BROCCOLI_SEEDS.get(),
                ModItems.CAULIFLOWER_SEEDS.get(),
                ModItems.GARLIC_CLOVE.get(),
                ModItems.SWEET_POTATO.get(),
                ModItems.TURNIP_SEEDS.get(),
                ModItems.ZUCCHINI_SEEDS.get()
        );
        tag(net.minecraft.tags.ItemTags.SMALL_FLOWERS).add(
                ModItems.MATURE_DANDELION.get(),
                ModItems.WILD_BELLPEPPERS.get(),
                ModItems.WILD_BROCCOLI.get(),
                ModItems.WILD_CAULIFLOWERS.get(),
                ModItems.WILD_GARLIC.get(),
                ModItems.WILD_SWEET_POTATOES.get(),
                ModItems.WILD_TURNIPS.get(),
                ModItems.WILD_ZUCCHINIS.get()
        );
    }
    protected void registerFarmersDelightTags(){
        tag(ModTags.Items.DRINKS).add(
                ModItems.CARROT_JUICE.get(),
                ModItems.DANDELION_JUICE.get(),
                ModItems.TURNIP_WATER.get()
        );
        tag(ModTags.Items.FEASTS).add(
                ModItems.LASAGNA_PAN.get(),
                ModItems.STUFFED_BELLPEPPERS_BLOCK.get()
        );
        tag(ModTags.Items.MEALS).add(
                // Bell pepper
                ModItems.CACCIATORE.get(),
                ModItems.SHAKSHOUKA.get(),
                // Broccoli
                ModItems.BROCCOLI_SOUP.get(),
                ModItems.PASTA_WITH_BROCCOLI.get(),
                ModItems.STEAK_AND_BROCCOLI.get(),
                // Cauliflower
                ModItems.CAULIFLOWER_KUKU.get(),
                ModItems.CAULIFLOWER_SOUP.get(),
                // Dandelion
                ModItems.DANDELION_AND_EGGS.get(),
                // Garlic
                ModItems.GARLIC_BAKED_COD.get(),
                ModItems.GARLIC_CHICKEN_STEW.get(),
                ModItems.GARLIC_RICE_WITH_CAULIFLOWER.get(),
                // Sweet Potato
                ModItems.MASHED_POTATOES.get(),
                ModItems.POTATO_NOODLES.get(),
                // Turnip
                ModItems.TURNIP_BEEF_STEW.get(),
                ModItems.TURNIP_CAKE.get(),
                // Zucchini
                ModItems.STUFFED_ZUCCHINIS.get(),
                // Misc
                ModItems.LASAGNA_SLICE.get(),
                ModItems.RICE_AND_VEGETABLES.get()
        );
        tag(ModTags.Items.PIES).add(
                ModItems.SWEET_POTATO_PIE.get(),
                ModItems.ZUCCHINI_QUICHE.get()
        );
        tag(ModTags.Items.SNACKS).add(
                ModItems.CAULIFLOWER_BREAD.get(),
                ModItems.GARLIC_BREAD.get(),
                ModItems.GARLIC_STUFFED_MUSHROOMS.get(),
                ModItems.TURNIP_MUTTON_SKEWER.get(),
                ModItems.CHICKEN_FAJITAS_WRAP.get(),
                ModItems.VEGETABLES_WRAP.get(),
                ModItems.VEGETARIAN_BURGER.get(),
                ModItems.ZUCCHINI_SANDWICH.get(),
                ModItems.MHADJEB.get(),
                ModItems.VEGAN_PIZZA.get(),
                ModItems.VEGAN_PIZZA_SLICE.get(),
                ModItems.ZUCCHINI_QUICHE_SLICE.get(),
                ModItems.STUFFED_ZUCCHINI_BOAT.get()
        );
        tag(ModTags.Items.SWEETS).add(
                ModItems.BEETROOT_BROWNIE_TRAY.get(),
                ModItems.BEETROOT_BROWNIE.get(),
                ModItems.CARROT_CAKE.get(),
                ModItems.CARROT_CAKE_SLICE.get(),
                ModItems.SWEET_POTATO_PIE_SLICE.get(),
                ModItems.SWEET_POTATO_CUPCAKE.get(),
                ModItems.SWEET_POTATO_PANCAKES.get()
        );
        tag(ModTags.Items.WILD_CROPS).add(
                ModItems.WILD_BELLPEPPERS.get(),
                ModItems.WILD_BROCCOLI.get(),
                ModItems.WILD_CAULIFLOWERS.get(),
                ModItems.WILD_GARLIC.get(),
                ModItems.WILD_SWEET_POTATOES.get(),
                ModItems.WILD_TURNIPS.get(),
                ModItems.WILD_ZUCCHINIS.get()
        );
    }
}
