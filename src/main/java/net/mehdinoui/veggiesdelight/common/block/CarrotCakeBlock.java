package net.mehdinoui.veggiesdelight.common.block;

import net.mehdinoui.veggiesdelight.common.item.ModFoods;
import net.mehdinoui.veggiesdelight.common.registry.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.CakeBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;
import vectorwing.farmersdelight.common.tag.ModTags;
import vectorwing.farmersdelight.common.utility.ItemUtils;

public class CarrotCakeBlock extends CakeBlock {

    public CarrotCakeBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected @NotNull ItemInteractionResult useItemOn(ItemStack stack, BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
        if (stack.is(ModTags.KNIVES)) {
            return this.cutSlice(level, pos, state, player);
        }

        return ItemInteractionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
    }

    @Override
    protected @NotNull InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
        if (level.isClientSide) {
            if (this.customEat(level, pos, state, player).consumesAction()) {
                return InteractionResult.SUCCESS;
            }

            if (player.getItemInHand(InteractionHand.MAIN_HAND).isEmpty()) {
                return InteractionResult.CONSUME;
            }
        }

        return this.customEat(level, pos, state, player);
    }

    private InteractionResult customEat(Level level, BlockPos pos, BlockState state, Player player) {
        if (!player.canEat(false)) {
            return InteractionResult.PASS;
        } else {
            player.getFoodData().eat(ModFoods.CARROT_CAKE_SLICE);

            int bites = state.getValue(BITES);
            if (bites < 6) {
                level.setBlock(pos, state.setValue(BITES, bites + 1), 3);
            } else {
                level.removeBlock(pos, false);
                level.gameEvent(player, GameEvent.BLOCK_DESTROY, pos);
            }
            return InteractionResult.SUCCESS;
        }
    }

    private ItemInteractionResult cutSlice(Level level, BlockPos pos,
                                       BlockState state, Player player) {
        int bites = (Integer)state.getValue(BITES);

        if (bites < 6) {
            level.setBlock(pos, (BlockState)state.setValue(BITES, bites + 1), 3);
        } else {
            level.removeBlock(pos, false);
        }

        Direction direction = Direction.WEST;
        double x = pos.getX() + 0.5D + (direction.getStepX() * 0.05D);
        double y = pos.getY() + 0.3D;
        double z = pos.getZ() + 0.5D + (direction.getStepZ() * 0.05D);
        double velocityX = direction.getStepX() * 0.05D;
        double velocityZ = direction.getStepZ() * 0.05D;
        double velocityY = 0.02D;

        ItemUtils.spawnItemEntity(level, new ItemStack(ModItems.CARROT_CAKE_SLICE.get()), x, y, z, velocityX, velocityY, velocityZ);
        level.playSound((Player)null, pos, SoundEvents.WOOL_BREAK, SoundSource.PLAYERS, 0.8F, 0.8F);
        return ItemInteractionResult.SUCCESS;
    }
}

