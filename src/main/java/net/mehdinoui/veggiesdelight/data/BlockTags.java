package net.mehdinoui.veggiesdelight.data;

import net.mehdinoui.veggiesdelight.VeggiesDelight;
import net.mehdinoui.veggiesdelight.common.registry.ModBlocks;
import net.mehdinoui.veggiesdelight.common.tag.VDForgeTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import vectorwing.farmersdelight.common.tag.ForgeTags;
import vectorwing.farmersdelight.common.tag.ModTags;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class BlockTags extends BlockTagsProvider {
    public BlockTags(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, VeggiesDelight.MOD_ID, existingFileHelper);
    }
    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        this.registerForgeTags();
        this.registerMinecraftTags();
        this.registerFarmersDelightTags();
    }
    protected void registerForgeTags() {
        tag(ForgeTags.MINEABLE_WITH_KNIFE).add(
                ModBlocks.BEETROOT_BROWNIE_TRAY.get(),
                ModBlocks.CARROT_CAKE.get(),
                ModBlocks.SWEET_POTATO_PIE.get(),
                ModBlocks.VEGAN_PIZZA.get(),
                ModBlocks.ZUCCHINI_QUICHE.get()
        );
        tag(VDForgeTags.STORAGE_BLOCKS_BELLPEPPER).add(ModBlocks.BELLPEPPER_CRATE.get());
        tag(VDForgeTags.STORAGE_BLOCKS_BROCCOLI).add(ModBlocks.BROCCOLI_CRATE.get());
        tag(VDForgeTags.STORAGE_BLOCKS_CAULIFLOWER).add(ModBlocks.CAULIFLOWER_CRATE.get());
        tag(VDForgeTags.STORAGE_BLOCKS_GARLIC).add(ModBlocks.GARLIC_CRATE.get());
        tag(VDForgeTags.STORAGE_BLOCKS_SWEET_POTATO).add(ModBlocks.SWEET_POTATO_CRATE.get());
        tag(VDForgeTags.STORAGE_BLOCKS_TURNIP).add(ModBlocks.TURNIP_CRATE.get());
        tag(VDForgeTags.STORAGE_BLOCKS_ZUCCHINI).add(ModBlocks.ZUCCHINI_CRATE.get());
    }
    protected void registerMinecraftTags(){
        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_AXE).add(
                ModBlocks.BELLPEPPER_CRATE.get(),
                ModBlocks.BROCCOLI_CRATE.get(),
                ModBlocks.CAULIFLOWER_CRATE.get(),
                ModBlocks.GARLIC_CRATE.get(),
                ModBlocks.SWEET_POTATO_CRATE.get(),
                ModBlocks.TURNIP_CRATE.get(),
                ModBlocks.ZUCCHINI_CRATE.get()
        );
        tag(net.minecraft.tags.BlockTags.CROPS).add(
                ModBlocks.BELLPEPPER_CROP.get(),
                ModBlocks.BROCCOLI_CROP.get(),
                ModBlocks.CAULIFLOWER_CROP.get(),
                ModBlocks.GARLIC_CROP.get(),
                ModBlocks.SWEET_POTATO_CROP.get(),
                ModBlocks.TURNIP_CROP.get(),
                ModBlocks.ZUCCHINI_CROP.get()
        );
        tag(net.minecraft.tags.BlockTags.MAINTAINS_FARMLAND).add(
                ModBlocks.BELLPEPPER_CROP.get(),
                ModBlocks.BROCCOLI_CROP.get(),
                ModBlocks.CAULIFLOWER_CROP.get(),
                ModBlocks.GARLIC_CROP.get(),
                ModBlocks.SWEET_POTATO_CROP.get(),
                ModBlocks.TURNIP_CROP.get(),
                ModBlocks.ZUCCHINI_CROP.get()
        );
        tag(net.minecraft.tags.BlockTags.SMALL_FLOWERS).add(
                ModBlocks.MATURE_DANDELION.get(),
                ModBlocks.WILD_BELLPEPPERS.get(),
                ModBlocks.WILD_BROCCOLI.get(),
                ModBlocks.WILD_CAULIFLOWERS.get(),
                ModBlocks.WILD_GARLIC.get(),
                ModBlocks.WILD_SWEET_POTATOES.get(),
                ModBlocks.WILD_TURNIPS.get(),
                ModBlocks.WILD_ZUCCHINIS.get()
        );
    }
    protected void registerFarmersDelightTags(){
        tag(ModTags.MINEABLE_WITH_KNIFE).add(
                ModBlocks.BEETROOT_BROWNIE_TRAY.get(),
                ModBlocks.CARROT_CAKE.get(),
                ModBlocks.SWEET_POTATO_PIE.get(),
                ModBlocks.VEGAN_PIZZA.get()
        );
        tag(ModTags.WILD_CROPS).add(
                ModBlocks.WILD_BELLPEPPERS.get(),
                ModBlocks.WILD_BROCCOLI.get(),
                ModBlocks.WILD_CAULIFLOWERS.get(),
                ModBlocks.WILD_GARLIC.get(),
                ModBlocks.WILD_SWEET_POTATOES.get(),
                ModBlocks.WILD_TURNIPS.get(),
                ModBlocks.WILD_ZUCCHINIS.get()
        );
    }
}

