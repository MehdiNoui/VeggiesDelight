package net.mehdinoui.veggiesdelight.datagen;

import net.mehdinoui.veggiesdelight.VeggiesDelight;
import net.mehdinoui.veggiesdelight.registry.ModBlocks;
import net.mehdinoui.veggiesdelight.tag.VDForgeTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import vectorwing.farmersdelight.common.tag.ForgeTags;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class BlockTags extends BlockTagsProvider {
    public BlockTags(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, VeggiesDelight.MOD_ID, existingFileHelper);
    }
    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.registerForgeTags();
        this.registerMinecraftTags();
    }
    protected void registerForgeTags() {
        tag(ForgeTags.MINEABLE_WITH_KNIFE).add(
                ModBlocks.BEETROOT_BROWNIE_TRAY.get(),
                ModBlocks.CARROT_CAKE.get(),
                ModBlocks.SWEET_POTATO_PIE.get(),
                ModBlocks.VEGAN_PIZZA.get()
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

    }
}
