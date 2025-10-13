package net.mehdinoui.veggiesdelight.datagen;

import net.mehdinoui.veggiesdelight.VeggiesDelight;
import net.mehdinoui.veggiesdelight.registry.ModBlocks;
import net.mehdinoui.veggiesdelight.registry.ModItems;
import net.mehdinoui.veggiesdelight.tag.VDCommonTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
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
        this.registerNeoforgeTags();
    }
    protected void registerCommonTags() {
        tag(VDCommonTags.STORAGE_ITEM_BLOCKS_BELLPEPPER).add(ModItems.BELLPEPPER_CRATE.get());
        tag(VDCommonTags.STORAGE_ITEM_BLOCKS_BROCCOLI).add(ModItems.BROCCOLI_CRATE.get());
        tag(VDCommonTags.STORAGE_ITEM_BLOCKS_CAULIFLOWER).add(ModItems.CAULIFLOWER_CRATE.get());
        tag(VDCommonTags.STORAGE_ITEM_BLOCKS_GARLIC).add(ModItems.GARLIC_CRATE.get());
        tag(VDCommonTags.STORAGE_ITEM_BLOCKS_SWEET_POTATO).add(ModItems.SWEET_POTATO_CRATE.get());
        tag(VDCommonTags.STORAGE_ITEM_BLOCKS_TURNIP).add(ModItems.TURNIP_CRATE.get());
        tag(VDCommonTags.STORAGE_ITEM_BLOCKS_ZUCCHINI).add(ModItems.ZUCCHINI_CRATE.get());

        tag(VDCommonTags.CROPS_BELLPEPPER).add(ModItems.BELLPEPPER.get());
        tag(VDCommonTags.CROPS_BROCCOLI).add(ModItems.BROCCOLI.get());
        tag(VDCommonTags.CROPS_CAULIFLOWER).add(ModItems.CAULIFLOWER.get());
        tag(VDCommonTags.CROPS_CAULIFLOWER).add(ModItems.CAULIFLOWER_FLORET.get());
        tag(VDCommonTags.CROPS_GARLIC).add(ModItems.GARLIC.get());
        tag(VDCommonTags.CROPS_GARLIC).add(ModItems.GARLIC_CLOVE.get());
        tag(VDCommonTags.CROPS_SWEET_POTATO).add(ModItems.SWEET_POTATO.get());
        tag(VDCommonTags.CROPS_TURNIP).add(ModItems.TURNIP.get());
        tag(VDCommonTags.CROPS_ZUCCHINI).add(ModItems.ZUCCHINI.get());
        tag(VDCommonTags.CROPS_ZUCCHINI).add(ModItems.ZUCCHINI_SLICE.get());

        tag(VDCommonTags.FOODS_BELLPEPPER).add(ModItems.BELLPEPPER.get());
        tag(VDCommonTags.FOODS_BROCCOLI).add(ModItems.BROCCOLI.get());
        tag(VDCommonTags.FOODS_CAULIFLOWER).add(ModItems.CAULIFLOWER.get());
        tag(VDCommonTags.FOODS_CAULIFLOWER).add(ModItems.CAULIFLOWER_FLORET.get());
        tag(VDCommonTags.FOODS_GARLIC).add(ModItems.GARLIC.get());
        tag(VDCommonTags.FOODS_GARLIC).add(ModItems.GARLIC_CLOVE.get());
        tag(VDCommonTags.FOODS_SWEET_POTATO).add(ModItems.SWEET_POTATO.get());
        tag(VDCommonTags.FOODS_TURNIP).add(ModItems.TURNIP.get());
        tag(VDCommonTags.FOODS_ZUCCHINI).add(ModItems.ZUCCHINI.get());
        tag(VDCommonTags.FOODS_ZUCCHINI).add(ModItems.ZUCCHINI_SLICE.get());

        tag(CommonTags.FOODS_DOUGH).add(ModItems.SWEET_POTATO_DOUGH.get());

        tag(CommonTags.FOODS_LEAFY_GREEN).add(ModItems.DANDELION_LEAF.get());
    }
    protected void registerMinecraftTags() {
        // Animals food
        tag(net.minecraft.tags.ItemTags.ARMADILLO_FOOD).add(
                ModItems.DANDELION_LEAF.get()
        );
        tag(net.minecraft.tags.ItemTags.CAMEL_FOOD).add(
                ModItems.DANDELION_LEAF.get()
        );
        tag(net.minecraft.tags.ItemTags.CHICKEN_FOOD).add(
                ModItems.BELLPEPPER_SEEDS.get(),
                ModItems.BROCCOLI_SEEDS.get(),
                ModItems.CAULIFLOWER_SEEDS.get(),
                ModItems.TURNIP_SEEDS.get(),
                ModItems.ZUCCHINI_SEEDS.get()
        );
        tag(net.minecraft.tags.ItemTags.COW_FOOD).add(
                ModItems.DANDELION_LEAF.get(),
                ModItems.BROCCOLI.get(),
                ModItems.CAULIFLOWER.get(),
                ModItems.CAULIFLOWER_FLORET.get()
        );
        tag(net.minecraft.tags.ItemTags.GOAT_FOOD).add(
                ModItems.DANDELION_LEAF.get(),
                ModItems.BROCCOLI.get(),
                ModItems.CAULIFLOWER.get()
        );
        tag(net.minecraft.tags.ItemTags.HORSE_FOOD).add(
                ModItems.DANDELION_LEAF.get(),
                ModItems.BROCCOLI.get(),
                ModItems.CAULIFLOWER.get(),
                ModItems.SWEET_POTATO.get(),
                ModItems.TURNIP.get(),
                ModItems.ZUCCHINI.get()
        );
        tag(net.minecraft.tags.ItemTags.LLAMA_FOOD).add(
                ModItems.DANDELION_LEAF.get()
        );
        tag(net.minecraft.tags.ItemTags.PARROT_FOOD).add(
                ModItems.BROCCOLI_SEEDS.get(),
                ModItems.CAULIFLOWER_SEEDS.get(),
                ModItems.TURNIP_SEEDS.get(),
                ModItems.ZUCCHINI_SEEDS.get()
        );
        tag(net.minecraft.tags.ItemTags.PARROT_POISONOUS_FOOD).add(
                ModItems.BELLPEPPER_SEEDS.get()
        );
        tag(net.minecraft.tags.ItemTags.PIG_FOOD).add(
                ModItems.BELLPEPPER.get(),
                ModItems.CAULIFLOWER.get(),
                ModItems.CAULIFLOWER_FLORET.get(),
                ModItems.SWEET_POTATO.get(),
                ModItems.TURNIP.get(),
                ModItems.ZUCCHINI.get(),
                ModItems.ZUCCHINI_SLICE.get()
        );
        tag(net.minecraft.tags.ItemTags.RABBIT_FOOD).add(
                ModItems.DANDELION_LEAF.get(),
                ModItems.BROCCOLI.get(),
                ModItems.CAULIFLOWER_FLORET.get(),
                ModItems.ZUCCHINI_SLICE.get()
        );
        tag(net.minecraft.tags.ItemTags.SHEEP_FOOD).add(
                ModItems.DANDELION_LEAF.get(),
                ModItems.BROCCOLI.get(),
                ModItems.CAULIFLOWER.get()
        );
        // Small Flowers
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
        // Villager
        tag(net.minecraft.tags.ItemTags.VILLAGER_PLANTABLE_SEEDS).add(
                ModItems.BELLPEPPER_SEEDS.get(),
                ModItems.BROCCOLI_SEEDS.get(),
                ModItems.CAULIFLOWER_SEEDS.get(),
                ModItems.GARLIC_CLOVE.get(),
                ModItems.SWEET_POTATO.get(),
                ModItems.TURNIP_SEEDS.get(),
                ModItems.ZUCCHINI_SEEDS.get()
        );
    }
    protected void registerFarmersDelightTags(){
        tag(ModTags.DRINKS).add(
                ModItems.CARROT_JUICE.get(),
                ModItems.DANDELION_JUICE.get(),
                ModItems.TURNIP_WATER.get()
        );
        tag(ModTags.MEALS).add(
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
                ModItems.RICE_AND_VEGETABLES.get()
        );
        tag(ModTags.FEASTS).add(
                ModItems.LASAGNA_PAN.get(),
                ModItems.STUFFED_BELLPEPPERS_BLOCK.get()
        );
        // Wild Crops
        tag(ModTags.WILD_CROPS_ITEM).add(
                ModItems.WILD_BELLPEPPERS.get(),
                ModItems.WILD_BROCCOLI.get(),
                ModItems.WILD_CAULIFLOWERS.get(),
                ModItems.WILD_GARLIC.get(),
                ModItems.WILD_SWEET_POTATOES.get(),
                ModItems.WILD_TURNIPS.get(),
                ModItems.WILD_ZUCCHINIS.get()
        );
    }
    protected void registerNeoforgeTags() {
        tag(Tags.Items.CROPS).add(
                ModItems.BELLPEPPER.get(),
                ModItems.BROCCOLI.get(),
                ModItems.CAULIFLOWER.get(),
                ModItems.CAULIFLOWER_FLORET.get(),
                ModItems.SWEET_POTATO.get(),
                ModItems.TURNIP.get(),
                ModItems.ZUCCHINI.get(),
                ModItems.ZUCCHINI_SLICE.get()
        );

        tag(Tags.Items.CROPS_POTATO).add(ModItems.SWEET_POTATO.get());

        tag(Tags.Items.DRINKS_JUICE).add(
                ModItems.CARROT_JUICE.get(),
                ModItems.DANDELION_JUICE.get(),
                ModItems.TURNIP_WATER.get()
        );

        tag(Tags.Items.FOODS_BREAD).add(ModItems.CAULIFLOWER_BREAD.get());

        tag(Tags.Items.FOODS_VEGETABLE).add(ModItems.BELLPEPPER.get());
        tag(Tags.Items.FOODS_VEGETABLE).add(ModItems.BROCCOLI.get());
        tag(Tags.Items.FOODS_VEGETABLE).add(ModItems.CAULIFLOWER.get());
        tag(Tags.Items.FOODS_VEGETABLE).add(ModItems.CAULIFLOWER_FLORET.get());
        tag(Tags.Items.FOODS_VEGETABLE).add(ModItems.GARLIC.get());
        tag(Tags.Items.FOODS_VEGETABLE).add(ModItems.GARLIC_CLOVE.get());
        tag(Tags.Items.FOODS_VEGETABLE).add(ModItems.SWEET_POTATO.get());
        tag(Tags.Items.FOODS_VEGETABLE).add(ModItems.TURNIP.get());
        tag(Tags.Items.FOODS_VEGETABLE).add(ModItems.ZUCCHINI.get());
        tag(Tags.Items.FOODS_VEGETABLE).add(ModItems.ZUCCHINI_SLICE.get());

        tag(Tags.Items.FOODS_EDIBLE_WHEN_PLACED).add(ModItems.BEETROOT_BROWNIE_TRAY.get());
        tag(Tags.Items.FOODS_EDIBLE_WHEN_PLACED).add(ModItems.CARROT_CAKE.get());
        tag(Tags.Items.FOODS_EDIBLE_WHEN_PLACED).add(ModItems.SWEET_POTATO_PIE.get());
        tag(Tags.Items.FOODS_EDIBLE_WHEN_PLACED).add(ModItems.VEGAN_PIZZA.get());

        tag(Tags.Items.FOODS_PIE).add(ModItems.BEETROOT_BROWNIE_TRAY.get());
        tag(Tags.Items.FOODS_PIE).add(ModItems.SWEET_POTATO_PIE.get());

        tag(Tags.Items.SEEDS).add(
                ModItems.BELLPEPPER_SEEDS.get(),
                ModItems.BROCCOLI_SEEDS.get(),
                ModItems.CAULIFLOWER_SEEDS.get(),
                ModItems.TURNIP_SEEDS.get(),
                ModItems.ZUCCHINI_SEEDS.get()
        );
        tag(Tags.Items.STORAGE_BLOCKS).add(
                ModItems.BELLPEPPER_CRATE.get(),
                ModItems.BROCCOLI_CRATE.get(),
                ModItems.CAULIFLOWER_CRATE.get(),
                ModItems.GARLIC_CRATE.get(),
                ModItems.SWEET_POTATO_CRATE.get(),
                ModItems.TURNIP_CRATE.get(),
                ModItems.ZUCCHINI_CRATE.get()
        );
    }
}