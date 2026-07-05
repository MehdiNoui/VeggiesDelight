package net.mehdinoui.veggiesdelight.common.crafting;

import net.mehdinoui.veggiesdelight.common.registry.ModItems;
import net.mehdinoui.veggiesdelight.common.registry.ModRecipeSerializers;
import net.mehdinoui.veggiesdelight.common.tag.VDCommonTags;
import net.minecraft.core.NonNullList;
import net.minecraft.core.RegistryAccess;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CraftingBookCategory;
import net.minecraft.world.item.crafting.CustomRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.Level;
import vectorwing.farmersdelight.common.tag.CommonTags;

public class SweetPotatoDoughRecipe extends CustomRecipe {
    public SweetPotatoDoughRecipe(ResourceLocation id, CraftingBookCategory category) {
        super(id, category);
    }

    @Override
    public boolean matches(CraftingContainer container, Level level) {
        int sweetPotatoCount = 0;
        int wheatCount = 0;
        ItemStack waterStack = ItemStack.EMPTY;

        for (int index = 0; index < container.getContainerSize(); ++index) {
            ItemStack selectedStack = container.getItem(index);
            if (!selectedStack.isEmpty()) {
                if (selectedStack.is(VDCommonTags.CROPS_SWEET_POTATO)) {
                    sweetPotatoCount++;
                } else if (selectedStack.is(Items.WHEAT)) {
                    wheatCount++;
                } else if (selectedStack.is(CommonTags.Items.BUCKETS_WATER)) {
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
    public ItemStack assemble(CraftingContainer container, RegistryAccess registryAccess) {
        return new ItemStack(ModItems.SWEET_POTATO_DOUGH.get(), 3);
    }

    @Override
    public NonNullList<ItemStack> getRemainingItems(CraftingContainer container) {
        NonNullList<ItemStack> remainders = NonNullList.withSize(container.getContainerSize(), ItemStack.EMPTY);

        for (int index = 0; index < remainders.size(); ++index) {
            ItemStack selectedStack = container.getItem(index);
            if (selectedStack.is(CommonTags.Items.BUCKETS_WATER)) {
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