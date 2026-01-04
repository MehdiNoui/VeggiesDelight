package net.mehdinoui.veggiesdelight.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import vectorwing.farmersdelight.common.block.PieBlock;
import java.util.function.Supplier;

public class PizzaBlock extends PieBlock {
    protected static final VoxelShape PIZZA_SHAPE = Block.box(0.0, 0.0, 0.0, 15.95, 2.0, 15.95);

    public PizzaBlock(Properties properties, Supplier<Item> pieSlice) {
        super(properties, pieSlice);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return PIZZA_SHAPE;
    }
}
