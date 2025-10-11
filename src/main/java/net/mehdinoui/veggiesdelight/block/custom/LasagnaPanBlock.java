package net.mehdinoui.veggiesdelight.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import vectorwing.farmersdelight.common.block.FeastBlock;

import java.util.function.Supplier;

public class LasagnaPanBlock extends FeastBlock {
    private static final VoxelShape EMPTY_PAN = Shapes.or(
            box(1, 0, 3, 3, 5, 15),
            box(1, 0, 1, 13, 5, 3),
            box(3, 0, 13, 13, 5, 15),
            box(13, 0, 1, 15, 5, 15),
            box(1, 0, 1, 15, 1, 15)
    );
    private static final VoxelShape FULL_PAN = Shapes.or(
            EMPTY_PAN,
            box(3, 1, 3, 13, 5, 13)
    );
    protected static final VoxelShape[] SHAPES = new VoxelShape[] {
            EMPTY_PAN,
            FULL_PAN,
            FULL_PAN,
            FULL_PAN,
            FULL_PAN
    };

    public LasagnaPanBlock(Properties properties, Supplier<Item> servingItem, boolean hasLeftovers) {
        super(properties, servingItem, hasLeftovers);
    }
    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        int servings = state.getValue(getServingsProperty());
        if (servings < 0 || servings >= SHAPES.length) {
            return FULL_PAN;
        }
        return SHAPES[servings];
    }
}
