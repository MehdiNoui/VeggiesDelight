package net.mehdinoui.veggiesdelight.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import vectorwing.farmersdelight.common.block.FeastBlock;

import java.util.function.Supplier;

public class StuffedBellpeppersBlock extends FeastBlock {
    public static final IntegerProperty SERVINGS = IntegerProperty.create("servings", 0, 3);
    protected static final VoxelShape[] SHAPES = new VoxelShape[]{
            box(1.0D, 0.0D, 1.0D, 15.0D, 2.0D, 15.0D),
            box(1.0D, 0.0D, 1.0D, 15.0D, 7.0D, 15.0D),
            box(1.0D, 0.0D, 1.0D, 15.0D, 7.0D, 15.0D),
            box(1.0D, 0.0D, 1.0D, 15.0D, 7.0D, 15.0D)
    };

    public StuffedBellpeppersBlock(Properties properties, Supplier<Item> servingItem, boolean hasLeftovers) {
        super(properties, servingItem, hasLeftovers);
    }

    @Override
    public IntegerProperty getServingsProperty() {
        return SERVINGS;
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        int servings = state.getValue(getServingsProperty());
        return SHAPES[servings];
    }

    @Override
    public int getMaxServings() {
        return 3;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
         builder.add(new Property[]{FACING, SERVINGS});
    }

    @Override
    public ItemStack getServingItem(BlockState state) {
        return new ItemStack(this.servingItem.get());
    }
}
