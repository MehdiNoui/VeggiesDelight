package net.mehdinoui.veggiesdelight.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.common.util.FakePlayer;

public class DandelionBlock extends FlowerBlock {

    public DandelionBlock(Properties properties) {
        super(() -> MobEffects.LUCK, 5, properties);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos,
                                 net.minecraft.world.entity.player.Player player,
                                 InteractionHand hand, BlockHitResult hit) {
        if (!level.isClientSide && player.getItemInHand(hand).getItem() == Items.BONE_MEAL) {
            if (level.getRandom().nextFloat() < 0.5f) {
                popResource(level, pos, new ItemStack(this));
            }
            if (!(player instanceof FakePlayer) && !player.isCreative()) {
                player.getItemInHand(hand).shrink(1);
            }

            return InteractionResult.SUCCESS;
        }

        return InteractionResult.PASS;
    }
}
