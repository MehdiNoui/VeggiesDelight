package net.mehdinoui.veggiesdelight.common.block;

import com.mojang.serialization.MapCodec;
import net.mehdinoui.veggiesdelight.VeggiesDelight;
import net.mehdinoui.veggiesdelight.common.block.custom.*;
import net.mehdinoui.veggiesdelight.common.block.custom.crops.*;
import net.mehdinoui.veggiesdelight.common.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import vectorwing.farmersdelight.common.block.PieBlock;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(VeggiesDelight.MOD_ID);

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> DeferredItem<BlockItem> registerBlockItem(String name, DeferredBlock<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    //CRATES
    public static final DeferredBlock<Block> BELLPEPPER_CRATE = registerBlock("bellpepper_crate",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> BROCCOLI_CRATE = registerBlock("broccoli_crate",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> CAULIFLOWER_CRATE = registerBlock("cauliflower_crate",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> GARLIC_CRATE = registerBlock("garlic_crate",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> SWEET_POTATO_CRATE = registerBlock("sweet_potato_crate",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> TURNIP_CRATE = registerBlock("turnip_crate",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> ZUCCHINI_CRATE = registerBlock("zucchini_crate",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    //CROPS
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

    //WILD CROPS
    public static final DeferredBlock<Block> WILD_BELLPEPPERS = registerBlock("wild_bellpeppers",
            () -> new BushBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ALLIUM).noCollission().noOcclusion()) {
                @Override
                protected MapCodec<? extends BushBlock> codec() {
                    return null;
                }

                @Override
                protected boolean mayPlaceOn(BlockState state, BlockGetter worldIn, BlockPos pos) {
                    return super.mayPlaceOn(state, worldIn, pos)
                            || state.is(Blocks.SAND)
                            || state.is(Blocks.RED_SAND);
                }
            });
    public static final DeferredBlock<Block> WILD_BROCCOLI = registerBlock("wild_broccoli",
            () -> new FlowerBlock(MobEffects.LUCK, 5,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.ALLIUM).noCollission().noOcclusion()));
    public static final DeferredBlock<Block> WILD_CAULIFLOWERS = registerBlock("wild_cauliflowers",
            () -> new FlowerBlock(MobEffects.LUCK, 5,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.ALLIUM).noCollission().noOcclusion()));
    public static final DeferredBlock<Block> WILD_GARLIC = registerBlock("wild_garlic",
            () -> new FlowerBlock(MobEffects.LUCK, 5,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.ALLIUM).noCollission().noOcclusion()));
    public static final DeferredBlock<Block> WILD_SWEET_POTATOES = registerBlock("wild_sweet_potatoes",
            () -> new FlowerBlock(MobEffects.LUCK, 5,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.ALLIUM).noCollission().noOcclusion()));
    public static final DeferredBlock<Block> WILD_TURNIPS = registerBlock("wild_turnips",
            () -> new BushBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ALLIUM).noCollission().noOcclusion()) {
                @Override
                protected MapCodec<? extends BushBlock> codec() {
                    return null;
                }
                @Override
                protected boolean mayPlaceOn(BlockState state, BlockGetter worldIn, BlockPos pos) {
                    return super.mayPlaceOn(state, worldIn, pos)
                            || state.is(Blocks.SAND)
                            || state.is(Blocks.RED_SAND);
                }
            });    public static final DeferredBlock<Block> WILD_ZUCCHINIS = registerBlock("wild_zucchinis",
            () -> new FlowerBlock(MobEffects.LUCK, 5,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.ALLIUM).noCollission().noOcclusion()));
    public static final DeferredBlock<Block> MATURE_DANDELION = registerBlock("mature_dandelion",
            () -> new DandelionBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION)
                    .noCollission().noOcclusion()));


    //MISC
    public static final DeferredBlock<Block> VEGAN_PIZZA = BLOCKS.register("vegan_pizza",
            () -> new PizzaBlock(Block.Properties.ofFullCopy(Blocks.CAKE), ModItems.VEGAN_PIZZA_SLICE));
    public static final DeferredBlock<Block> SWEET_POTATO_PIE = BLOCKS.register("sweet_potato_pie",
            () -> new PieBlock(Block.Properties.ofFullCopy(Blocks.CAKE), ModItems.SWEET_POTATO_PIE_SLICE));
    public static final DeferredBlock<Block> BEETROOT_BROWNIE_TRAY = BLOCKS.register("beetroot_brownie_tray",
            () -> new PieBlock(Block.Properties.ofFullCopy(Blocks.CAKE), ModItems.BEETROOT_BROWNIE));
    public static final DeferredBlock<Block> CARROT_CAKE = BLOCKS.register("carrot_cake",
            () -> new CarrotCakeBlock(Block.Properties.ofFullCopy(Blocks.CAKE)));
}
