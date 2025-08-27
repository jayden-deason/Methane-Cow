package com.BoomCow.methanecow.block;

import com.BoomCow.methanecow.MethaneCow;
import com.BoomCow.methanecow.block.custom.CheeseBasin;
import com.BoomCow.methanecow.item.ModItemGroup;
import com.BoomCow.methanecow.item.ModItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MethaneCow.MOD_ID);

    public static final RegistryObject<Block> CHEESE_BASIN = registerBlock("cheese_basin",
            () -> new CheeseBasin(AbstractBlock.Properties.from(Blocks.STONE).notSolid()));

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, Supplier<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().group(ModItemGroup.METHANECOW)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
