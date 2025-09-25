package net.mehdinoui.veggiesdelight.tag;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class VDForgeTags {
    private static TagKey<Block> forgeBlockTag(String path) {
        return BlockTags.create(new ResourceLocation("forge", path));
    }

    private static TagKey<Item> forgeItemTag(String path) {
        return ItemTags.create(new ResourceLocation("forge", path));
    }

    // BLOCKS
    // Storage Blocks
    public static final TagKey<Block> STORAGE_BLOCKS_BELLPEPPER = forgeBlockTag("storage_blocks/bellpepper");
    public static final TagKey<Block> STORAGE_BLOCKS_BROCCOLI = forgeBlockTag("storage_blocks/broccoli");
    public static final TagKey<Block> STORAGE_BLOCKS_CAULIFLOWER = forgeBlockTag("storage_blocks/cauliflower");
    public static final TagKey<Block> STORAGE_BLOCKS_GARLIC = forgeBlockTag("storage_blocks/garlic");
    public static final TagKey<Block> STORAGE_BLOCKS_SWEET_POTATO = forgeBlockTag("storage_blocks/sweet_potato");
    public static final TagKey<Block> STORAGE_BLOCKS_TURNIP = forgeBlockTag("storage_blocks/turnip");
    public static final TagKey<Block> STORAGE_BLOCKS_ZUCCHINI = forgeBlockTag("storage_blocks/zucchini");

    // ITEMS
    // Bread
    public static final TagKey<Item> BREAD_CAULIFLOWER = forgeItemTag("bread/cauliflower");
    // Crops
    public static final TagKey<Item> CROPS_BELLPEPPER = forgeItemTag("crops/bellpepper");
    public static final TagKey<Item> CROPS_BROCCOLI = forgeItemTag("crops/broccoli");
    public static final TagKey<Item> CROPS_CAULIFLOWER = forgeItemTag("crops/cauliflower");
    public static final TagKey<Item> CROPS_GARLIC = forgeItemTag("crops/garlic");
    public static final TagKey<Item> CROPS_SWEET_POTATO = forgeItemTag("crops/sweet_potato");
    public static final TagKey<Item> CROPS_TURNIP = forgeItemTag("crops/turnip");
    public static final TagKey<Item> CROPS_ZUCCHINI = forgeItemTag("crops/zucchini");
    // Dough
    public static final TagKey<Item> DOUGH_SWEET_POTATO = forgeItemTag("dough/sweet_potato");
    // Potatoes
    public static final TagKey<Item> POTATOES = forgeItemTag("potatoes");
    // Salad Ingredients
    public static final TagKey<Item> SALAD_INGREDIENTS_DANDELION = forgeItemTag("salad_ingredients/dandelion");
    // Seeds
     public static final TagKey<Item> SEEDS_BELLPEPPER = forgeItemTag("seeds/bellpepper");
    public static final TagKey<Item> SEEDS_BROCCOLI = forgeItemTag("seeds/broccoli");
    public static final TagKey<Item> SEEDS_CAULIFLOWER = forgeItemTag("seeds/cauliflower");
    public static final TagKey<Item> SEEDS_TURNIP = forgeItemTag("seeds/turnip");
    public static final TagKey<Item> SEEDS_ZUCCHINI = forgeItemTag("seeds/zucchini");
    // Vegetables
    public static final TagKey<Item> VEGETABLES_BELLPEPPER = forgeItemTag("vegetables/bellpepper");
    public static final TagKey<Item> VEGETABLES_BROCCOLI = forgeItemTag("vegetables/broccoli");
    public static final TagKey<Item> VEGETABLES_CAULIFLOWER = forgeItemTag("vegetables/cauliflower");
    public static final TagKey<Item> VEGETABLES_GARLIC = forgeItemTag("vegetables/garlic");
    public static final TagKey<Item> VEGETABLES_SWEET_POTATO = forgeItemTag("vegetables/sweet_potato");
    public static final TagKey<Item> VEGETABLES_TURNIP = forgeItemTag("vegetables/turnip");
    public static final TagKey<Item> VEGETABLES_ZUCCHINI = forgeItemTag("vegetables/zucchini");
}

