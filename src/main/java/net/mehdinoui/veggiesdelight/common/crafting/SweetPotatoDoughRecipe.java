package net.mehdinoui.veggiesdelight.common.crafting;

import net.mehdinoui.veggiesdelight.common.registry.ModItems;
import net.mehdinoui.veggiesdelight.common.registry.ModRecipeSerializers;
import net.mehdinoui.veggiesdelight.common.tag.VDCommonTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CraftingBookCategory;
import net.minecraft.world.item.crafting.CraftingInput;
import net.minecraft.world.item.crafting.CustomRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.Level;
import net.neoforged.neoforge.common.Tags;

public class SweetPotatoDoughRecipe extends CustomRecipe {

    public SweetPotatoDoughRecipe(CraftingBookCategory category) {
        super(category);
    }

    @Override
    public boolean matches(CraftingInput input, Level level) {
        int sweetPotatoCount = 0;
        int wheatCount = 0;
        ItemStack waterStack = ItemStack.EMPTY;

        for (int index = 0; index < input.size(); ++index) {
            ItemStack selectedStack = input.getItem(index);
            if (!selectedStack.isEmpty()) {
                if (selectedStack.is(VDCommonTags.CROPS_SWEET_POTATO)) {
                    sweetPotatoCount++;
                } else if (selectedStack.is(Items.WHEAT)) {
                    wheatCount++;
                } else if (selectedStack.is(Tags.Items.BUCKETS_WATER)) {
                    if (!waterStack.isEmpty()) return false;
                    waterStack = selectedStack;
                } else {
                    return false;
                }
            }
        }

        return sweetPotatoCount == 2 && wheatCount == 1 && !waterStack.isEmpty();
    }

    @Override
    public ItemStack assemble(CraftingInput input, HolderLookup.Provider registries) {
        return new ItemStack(ModItems.SWEET_POTATO_DOUGH.get(), 3);
    }

    @Override
    public NonNullList<ItemStack> getRemainingItems(CraftingInput input) {
        NonNullList<ItemStack> remainders = NonNullList.withSize(input.size(), ItemStack.EMPTY);

        for (int index = 0; index < remainders.size(); ++index) {
            ItemStack selectedStack = input.getItem(index);
            if (selectedStack.is(Tags.Items.BUCKETS_WATER)) {
                remainders.set(index, selectedStack.copy());
            }
        }

        return remainders;
    }

    @Override
    public boolean canCraftInDimensions(int width, int height) {
        return width >= 2 && height >= 2;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return ModRecipeSerializers.SWEET_POTATO_DOUGH.get();
    }
}