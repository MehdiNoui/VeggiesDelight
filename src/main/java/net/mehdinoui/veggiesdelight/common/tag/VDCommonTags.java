package net.mehdinoui.veggiesdelight.common.tag;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class VDCommonTags {
    private static TagKey<Block> commonBlockTag(String path) {
        return BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", path));
    }

    private static TagKey<Item> commonItemTag(String path) {
        return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", path));
    }
    // BLOCKS
    // Storage Blocks
    public static final TagKey<Block> STORAGE_BLOCKS_BELLPEPPER = commonBlockTag("storage_blocks/bellpepper");
    public static final TagKey<Block> STORAGE_BLOCKS_BROCCOLI = commonBlockTag("storage_blocks/broccoli");
    public static final TagKey<Block> STORAGE_BLOCKS_CAULIFLOWER = commonBlockTag("storage_blocks/cauliflower");
    public static final TagKey<Block> STORAGE_BLOCKS_GARLIC = commonBlockTag("storage_blocks/garlic");
    public static final TagKey<Block> STORAGE_BLOCKS_SWEET_POTATO = commonBlockTag("storage_blocks/sweet_potato");
    public static final TagKey<Block> STORAGE_BLOCKS_TURNIP = commonBlockTag("storage_blocks/turnip");
    public static final TagKey<Block> STORAGE_BLOCKS_ZUCCHINI = commonBlockTag("storage_blocks/zucchini");
    // ITEMS
    // Crops SubGroup
    public static final TagKey<Item> CROPS_BELLPEPPER = commonItemTag("crops/bellpepper");
    public static final TagKey<Item> CROPS_BROCCOLI = commonItemTag("crops/broccoli");
    public static final TagKey<Item> CROPS_CAULIFLOWER = commonItemTag("crops/cauliflower");
    public static final TagKey<Item> CROPS_GARLIC = commonItemTag("crops/garlic");
    public static final TagKey<Item> CROPS_SWEET_POTATO = commonItemTag("crops/sweet_potato");
    public static final TagKey<Item> CROPS_TURNIP = commonItemTag("crops/turnip");
    public static final TagKey<Item> CROPS_ZUCCHINI = commonItemTag("crops/zucchini");
    // Foods SubGroup
    public static final TagKey<Item> FOODS_BELLPEPPER = commonItemTag("foods/bellpepper");
    public static final TagKey<Item> FOODS_BROCCOLI = commonItemTag("foods/broccoli");
    public static final TagKey<Item> FOODS_CAULIFLOWER = commonItemTag("foods/cauliflower");
    public static final TagKey<Item> FOODS_GARLIC = commonItemTag("foods/garlic");
    public static final TagKey<Item> FOODS_SWEET_POTATO = commonItemTag("foods/sweet_potato");
    public static final TagKey<Item> FOODS_TURNIP = commonItemTag("foods/turnip");
    public static final TagKey<Item> FOODS_ZUCCHINI = commonItemTag("foods/zucchini");

    // Storage Item Blocks
    // Storage Blocks
    public static final TagKey<Item> STORAGE_ITEM_BLOCKS_BELLPEPPER = commonItemTag("storage_blocks/bellpepper");
    public static final TagKey<Item> STORAGE_ITEM_BLOCKS_BROCCOLI = commonItemTag("storage_blocks/broccoli");
    public static final TagKey<Item> STORAGE_ITEM_BLOCKS_CAULIFLOWER = commonItemTag("storage_blocks/cauliflower");
    public static final TagKey<Item> STORAGE_ITEM_BLOCKS_GARLIC = commonItemTag("storage_blocks/garlic");
    public static final TagKey<Item> STORAGE_ITEM_BLOCKS_SWEET_POTATO = commonItemTag("storage_blocks/sweet_potato");
    public static final TagKey<Item> STORAGE_ITEM_BLOCKS_TURNIP = commonItemTag("storage_blocks/turnip");
    public static final TagKey<Item> STORAGE_ITEM_BLOCKS_ZUCCHINI = commonItemTag("storage_blocks/zucchini");


    ////////////////////////////////////////////////////////////////////////////////////////////////
    /* Legacy tags
    // Bread
    public static final TagKey<Item> BREAD_CAULIFLOWER = commonItemTag("bread/cauliflower");
    // Dough
    public static final TagKey<Item> FOODS_DOUGH_SWEET_POTATO = commonItemTag("foods/dough/sweet_potato");
    // Salad Ingredients
    public static final TagKey<Item> FOODS_SALAD_INGREDIENTS_DANDELION = commonItemTag("salad_ingredients/dandelion");
    /*
    // Seeds
    public static final TagKey<Item> SEEDS_BELLPEPPER = commonItemTag("seeds/bellpepper");
    public static final TagKey<Item> SEEDS_BROCCOLI = commonItemTag("seeds/broccoli");
    public static final TagKey<Item> SEEDS_CAULIFLOWER = commonItemTag("seeds/cauliflower");
    public static final TagKey<Item> SEEDS_TURNIP = commonItemTag("seeds/turnip");
    public static final TagKey<Item> SEEDS_ZUCCHINI = commonItemTag("seeds/zucchini");
    // Vegetables
    public static final TagKey<Item> VEGETABLES_BELLPEPPER = commonItemTag("vegetables/bellpepper");
    public static final TagKey<Item> VEGETABLES_BROCCOLI = commonItemTag("vegetables/broccoli");
    public static final TagKey<Item> VEGETABLES_CAULIFLOWER = commonItemTag("vegetables/cauliflower");
    public static final TagKey<Item> VEGETABLES_GARLIC = commonItemTag("vegetables/garlic");
    public static final TagKey<Item> VEGETABLES_SWEET_POTATO = commonItemTag("vegetables/sweet_potato");
    public static final TagKey<Item> VEGETABLES_TURNIP = commonItemTag("vegetables/turnip");
    public static final TagKey<Item> VEGETABLES_ZUCCHINI = commonItemTag("vegetables/zucchini");
    */
}