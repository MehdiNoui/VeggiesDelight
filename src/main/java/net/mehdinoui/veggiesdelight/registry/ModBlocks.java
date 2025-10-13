package net.mehdinoui.veggiesdelight.registry;

import com.mojang.serialization.MapCodec;
import net.mehdinoui.veggiesdelight.VeggiesDelight;
import net.mehdinoui.veggiesdelight.block.custom.*;
import net.mehdinoui.veggiesdelight.block.custom.crops.*;
import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import vectorwing.farmersdelight.common.block.PieBlock;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(VeggiesDelight.MOD_ID);
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    // Crates
    public static final DeferredBlock<Block> BELLPEPPER_CRATE = BLOCKS.register("bellpepper_crate",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> BROCCOLI_CRATE = BLOCKS.register("broccoli_crate",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> CAULIFLOWER_CRATE = BLOCKS.register("cauliflower_crate",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> GARLIC_CRATE = BLOCKS.register("garlic_crate",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> SWEET_POTATO_CRATE = BLOCKS.register("sweet_potato_crate",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> TURNIP_CRATE = BLOCKS.register("turnip_crate",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> ZUCCHINI_CRATE = BLOCKS.register("zucchini_crate",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    // Crops
    public static final DeferredBlock<Block> BELLPEPPER_CROP = BLOCKS.register("bellpepper_crop",
            () -> new BellpepperCropBlock(Block.Properties.ofFullCopy(Blocks.WHEAT).noOcclusion().noCollission()));
    public static final DeferredBlock<Block> BROCCOLI_CROP = BLOCKS.register("broccoli_crop",
            () -> new BroccoliCropBlock(Block.Properties.ofFullCopy(Blocks.WHEAT).noOcclusion().noCollission()));
    public static final DeferredBlock<Block> CAULIFLOWER_CROP = BLOCKS.register("cauliflower_crop",
            () -> new CauliflowerCropBlock(Block.Properties.ofFullCopy(Blocks.WHEAT).noOcclusion().noCollission()));
    public static final DeferredBlock<Block> GARLIC_CROP = BLOCKS.register("garlic_crop",
            () -> new GarlicCropBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT).noOcclusion().noCollission()));
    public static final DeferredBlock<Block> SWEET_POTATO_CROP = BLOCKS.register("sweet_potato_crop",
            () -> new SweetPotatoCropBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT).noOcclusion().noCollission()));
     public static final DeferredBlock<Block> TURNIP_CROP = BLOCKS.register("turnip_crop",
            () -> new TurnipCropBlock(Block.Properties.ofFullCopy(Blocks.WHEAT).noOcclusion().noCollission()));
    public static final DeferredBlock<Block> ZUCCHINI_CROP = BLOCKS.register("zucchini_crop",
            () -> new ZucchiniCropBlock(Block.Properties.ofFullCopy(Blocks.WHEAT).noOcclusion().noCollission()));

    // Misc Blocks
    public static final DeferredBlock<Block> VEGAN_PIZZA = BLOCKS.register("vegan_pizza",
            () -> new PizzaBlock(Block.Properties.ofFullCopy(Blocks.CAKE), ModItems.VEGAN_PIZZA_SLICE));
    public static final DeferredBlock<Block> SWEET_POTATO_PIE = BLOCKS.register("sweet_potato_pie",
            () -> new PieBlock(Block.Properties.ofFullCopy(Blocks.CAKE), ModItems.SWEET_POTATO_PIE_SLICE));
    public static final DeferredBlock<Block> BEETROOT_BROWNIE_TRAY = BLOCKS.register("beetroot_brownie_tray",
            () -> new PieBlock(Block.Properties.ofFullCopy(Blocks.CAKE), ModItems.BEETROOT_BROWNIE));
    public static final DeferredBlock<Block> CARROT_CAKE = BLOCKS.register("carrot_cake",
            () -> new CarrotCakeBlock(Block.Properties.ofFullCopy(Blocks.CAKE)));
    public static final DeferredBlock<Block> STUFFED_BELLPEPPERS_BLOCK = BLOCKS.register("stuffed_bellpeppers_block",
            () -> new StuffedBellpeppersBlock(Block.Properties.ofFullCopy(Blocks.CAKE), ModItems.STUFFED_BELLPEPPER,true));
    public static final DeferredBlock<Block> ZUCCHINI_QUICHE = BLOCKS.register("zucchini_quiche",
            () -> new PieBlock(Block.Properties.ofFullCopy(Blocks.CAKE), ModItems.ZUCCHINI_QUICHE_SLICE));
    public static final DeferredBlock<Block> LASAGNA_PAN = BLOCKS.register("lasagna_pan",
            () -> new LasagnaPanBlock(Block.Properties.ofFullCopy(Blocks.CAKE), ModItems.LASAGNA_SLICE, true));

    // Wild Crops
    public static final DeferredBlock<Block> WILD_BELLPEPPERS = BLOCKS.register("wild_bellpeppers",
            () -> new FlowerBlock(MobEffects.LUCK, 5, BlockBehaviour.Properties.ofFullCopy(Blocks.ALLIUM).noCollission().noOcclusion()) {
                @Override
                protected boolean mayPlaceOn(BlockState state, BlockGetter worldIn, BlockPos pos) {
                    return super.mayPlaceOn(state, worldIn, pos)
                            || state.is(Blocks.SAND)
                            || state.is(Blocks.RED_SAND);
                }
            });
    public static final DeferredBlock<Block> MATURE_DANDELION = BLOCKS.register("mature_dandelion",
            () -> new DandelionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)
                    .noCollission().noOcclusion()));
    public static final DeferredBlock<Block> WILD_BROCCOLI = BLOCKS.register("wild_broccoli",
            () -> new FlowerBlock(MobEffects.LUCK, 5,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.ALLIUM).noCollission().noOcclusion()));
    public static final DeferredBlock<Block> WILD_CAULIFLOWERS = BLOCKS.register("wild_cauliflowers",
            () -> new FlowerBlock(MobEffects.LUCK, 5,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.ALLIUM).noCollission().noOcclusion()));
    public static final DeferredBlock<Block> WILD_GARLIC = BLOCKS.register("wild_garlic",
            () -> new FlowerBlock(MobEffects.LUCK, 5,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.ALLIUM).noCollission().noOcclusion()));
    public static final DeferredBlock<Block> WILD_SWEET_POTATOES = BLOCKS.register("wild_sweet_potatoes",
            () -> new FlowerBlock(MobEffects.LUCK, 5,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.ALLIUM).noCollission().noOcclusion()));
    public static final DeferredBlock<Block> WILD_TURNIPS = BLOCKS.register("wild_turnips",
            () -> new FlowerBlock(MobEffects.LUCK, 5, BlockBehaviour.Properties.ofFullCopy(Blocks.ALLIUM).noCollission().noOcclusion()) {
                @Override
                protected boolean mayPlaceOn(BlockState state, BlockGetter worldIn, BlockPos pos) {
                    return super.mayPlaceOn(state, worldIn, pos)
                            || state.is(Blocks.SAND)
                            || state.is(Blocks.RED_SAND);
                }
            });    public static final DeferredBlock<Block> WILD_ZUCCHINIS = BLOCKS.register("wild_zucchinis",
            () -> new FlowerBlock(MobEffects.LUCK, 5,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.ALLIUM).noCollission().noOcclusion()));
}
