package net.mehdinoui.veggiesdelight.event;

import net.mehdinoui.veggiesdelight.registry.ModBlocks;
import net.mehdinoui.veggiesdelight.registry.ModItems;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

import static net.mehdinoui.veggiesdelight.VeggiesDelight.MOD_ID;

@Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModComposterEvents {
    @SubscribeEvent
    public static void onCommonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            //10%
            ComposterBlock.COMPOSTABLES.put(ModItems.GARLIC_CLOVE.get(),0.1F);
            //30%
            ComposterBlock.COMPOSTABLES.put(ModItems.BELLPEPPER_SEEDS.get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModItems.BROCCOLI_SEEDS.get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModItems.CAULIFLOWER_SEEDS.get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModItems.CAULIFLOWER_FLORET.get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModItems.DANDELION_LEAF.get(),0.3F);
            ComposterBlock.COMPOSTABLES.put(ModItems.TURNIP_SEEDS.get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(ModItems.ZUCCHINI_SEEDS.get(), 0.3F);
            //65%
            ComposterBlock.COMPOSTABLES.put(ModItems.BELLPEPPER.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModItems.BROCCOLI.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModItems.CAULIFLOWER.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModItems.GARLIC.get(),0.65F);
            ComposterBlock.COMPOSTABLES.put(ModItems.SWEET_POTATO.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModItems.TURNIP.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModItems.ZUCCHINI.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.WILD_BELLPEPPERS.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.WILD_BROCCOLI.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.WILD_CAULIFLOWERS.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.WILD_GARLIC.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.WILD_SWEET_POTATOES.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.WILD_TURNIPS.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.WILD_ZUCCHINIS.get().asItem(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(ModBlocks.MATURE_DANDELION.get().asItem(), 0.65F);
            //85%
            ComposterBlock.COMPOSTABLES.put(ModItems.BEETROOT_BROWNIE.get(), 0.85F);
            ComposterBlock.COMPOSTABLES.put(ModItems.VEGAN_PIZZA_SLICE.get(), 0.85F);
            ComposterBlock.COMPOSTABLES.put(ModItems.SWEET_POTATO_PIE_SLICE.get(), 0.85F);
            ComposterBlock.COMPOSTABLES.put(ModItems.CARROT_CAKE_SLICE.get(), 0.85F);
            ComposterBlock.COMPOSTABLES.put(ModItems.POTATO_NOODLE.get(), 0.85F);
            ComposterBlock.COMPOSTABLES.put(ModItems.RAW_VEGETARIAN_PATTY.get(), 0.85F);
            ComposterBlock.COMPOSTABLES.put(ModItems.UNCOOKED_MHADJEB.get(), 0.85F);
            ComposterBlock.COMPOSTABLES.put(ModItems.SWEET_POTATO_DOUGH.get(), 0.85F);
            ComposterBlock.COMPOSTABLES.put(ModItems.SWEET_POTATO_CUPCAKE.get(), 0.85F);
            //100%
            ComposterBlock.COMPOSTABLES.put(ModItems.VEGAN_PIZZA.get(), 1F);
            ComposterBlock.COMPOSTABLES.put(ModItems.SWEET_POTATO_PIE.get(), 1F);
            ComposterBlock.COMPOSTABLES.put(ModItems.BEETROOT_BROWNIE_TRAY.get(), 1F);
            ComposterBlock.COMPOSTABLES.put(ModItems.CARROT_CAKE.get(), 1F);
        });
    }
}
