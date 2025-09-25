package net.mehdinoui.veggiesdelight.datagen;

import net.mehdinoui.veggiesdelight.VeggiesDelight;
import net.mehdinoui.veggiesdelight.registry.ModBlocks;
import net.mehdinoui.veggiesdelight.registry.ModItems;
import net.mehdinoui.veggiesdelight.tag.VDForgeTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;
import vectorwing.farmersdelight.common.tag.ForgeTags;

import java.util.concurrent.CompletableFuture;

public class ItemTags extends ItemTagsProvider {
    public ItemTags(PackOutput output, CompletableFuture<HolderLookup.Provider> provider, CompletableFuture<TagsProvider.TagLookup<Block>> blockTagProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, provider, blockTagProvider, VeggiesDelight.MOD_ID, existingFileHelper);
    }
    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.registerForgeTags();
        this.registerMinecraftTags();
    }
    protected void registerForgeTags() {
        tag(ForgeTags.BREAD).addTag(VDForgeTags.BREAD_CAULIFLOWER);
        tag(VDForgeTags.BREAD_CAULIFLOWER).add(ModItems.CAULIFLOWER_BREAD.get());

        tag(ForgeTags.CROPS).addTag(VDForgeTags.CROPS_BELLPEPPER);
        tag(VDForgeTags.CROPS_BELLPEPPER).add(ModItems.BELLPEPPER.get());
        tag(ForgeTags.CROPS).addTag(VDForgeTags.CROPS_BROCCOLI);
        tag(VDForgeTags.CROPS_BROCCOLI).add(ModItems.BROCCOLI.get());
        tag(ForgeTags.CROPS).addTag(VDForgeTags.CROPS_CAULIFLOWER);
        tag(VDForgeTags.CROPS_CAULIFLOWER).add(ModItems.CAULIFLOWER.get());
        tag(ForgeTags.CROPS).addTag(VDForgeTags.CROPS_GARLIC);
        tag(VDForgeTags.CROPS_GARLIC).add(ModItems.GARLIC.get());
        tag(ForgeTags.CROPS).addTag(VDForgeTags.CROPS_SWEET_POTATO);
        tag(VDForgeTags.CROPS_SWEET_POTATO).add(ModItems.SWEET_POTATO.get());
        tag(ForgeTags.CROPS).addTag(VDForgeTags.CROPS_TURNIP);
        tag(VDForgeTags.CROPS_TURNIP).add(ModItems.TURNIP.get());
        tag(ForgeTags.CROPS).addTag(VDForgeTags.CROPS_ZUCCHINI);
        tag(VDForgeTags.CROPS_ZUCCHINI).add(ModItems.ZUCCHINI.get());

        tag(ForgeTags.DOUGH).addTag(VDForgeTags.DOUGH_SWEET_POTATO);
        tag(VDForgeTags.DOUGH_SWEET_POTATO).add(ModItems.SWEET_POTATO_DOUGH.get());

        tag(ForgeTags.SALAD_INGREDIENTS).addTag(VDForgeTags.SALAD_INGREDIENTS_DANDELION);
        tag(VDForgeTags.SALAD_INGREDIENTS_DANDELION).add(ModItems.DANDELION_LEAF.get());

        tag(VDForgeTags.POTATOES).add(
                Items.POTATO,
                ModItems.SWEET_POTATO.get()
        );

        tag(ForgeTags.SEEDS).addTag(VDForgeTags.SEEDS_BELLPEPPER);
        tag(VDForgeTags.SEEDS_BELLPEPPER).add(ModItems.BELLPEPPER_SEEDS.get());
        tag(ForgeTags.SEEDS).addTag(VDForgeTags.SEEDS_BROCCOLI);
        tag(VDForgeTags.SEEDS_BROCCOLI).add(ModItems.BROCCOLI_SEEDS.get());
        tag(ForgeTags.SEEDS).addTag(VDForgeTags.SEEDS_CAULIFLOWER);
        tag(VDForgeTags.SEEDS_CAULIFLOWER).add(ModItems.CAULIFLOWER_SEEDS.get());
        tag(ForgeTags.SEEDS).addTag(VDForgeTags.SEEDS_TURNIP);
        tag(VDForgeTags.SEEDS_TURNIP).add(ModItems.TURNIP_SEEDS.get());
        tag(ForgeTags.SEEDS).addTag(VDForgeTags.SEEDS_ZUCCHINI);
        tag(VDForgeTags.SEEDS_ZUCCHINI).add(ModItems.ZUCCHINI_SEEDS.get());

        tag(ForgeTags.VEGETABLES).addTag(VDForgeTags.VEGETABLES_BELLPEPPER);
        tag(VDForgeTags.VEGETABLES_BELLPEPPER).add(ModItems.BELLPEPPER.get());
        tag(ForgeTags.VEGETABLES).addTag(VDForgeTags.VEGETABLES_BROCCOLI);
        tag(VDForgeTags.VEGETABLES_BROCCOLI).add(ModItems.BROCCOLI.get());
        tag(ForgeTags.VEGETABLES).addTag(VDForgeTags.VEGETABLES_CAULIFLOWER);
        tag(VDForgeTags.VEGETABLES_CAULIFLOWER).add(ModItems.CAULIFLOWER.get());
        tag(VDForgeTags.VEGETABLES_CAULIFLOWER).add(ModItems.CAULIFLOWER_FLORET.get());
        tag(ForgeTags.VEGETABLES).addTag(VDForgeTags.VEGETABLES_GARLIC);
        tag(VDForgeTags.VEGETABLES_GARLIC).add(ModItems.GARLIC.get());
        tag(VDForgeTags.VEGETABLES_GARLIC).add(ModItems.GARLIC_CLOVE.get());
        tag(ForgeTags.VEGETABLES).addTag(VDForgeTags.VEGETABLES_SWEET_POTATO);
        tag(VDForgeTags.VEGETABLES_SWEET_POTATO).add(ModItems.SWEET_POTATO.get());
        tag(ForgeTags.VEGETABLES).addTag(VDForgeTags.VEGETABLES_TURNIP);
        tag(VDForgeTags.VEGETABLES_TURNIP).add(ModItems.TURNIP.get());
        tag(ForgeTags.VEGETABLES).addTag(VDForgeTags.VEGETABLES_ZUCCHINI);
        tag(VDForgeTags.VEGETABLES_ZUCCHINI).add(ModItems.ZUCCHINI.get());
        tag(VDForgeTags.VEGETABLES_ZUCCHINI).add(ModItems.ZUCCHINI_SLICE.get());

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
    }
}
