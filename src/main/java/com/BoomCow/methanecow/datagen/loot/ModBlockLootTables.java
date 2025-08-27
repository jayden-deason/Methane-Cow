package com.BoomCow.methanecow.datagen.loot;

import com.BoomCow.methanecow.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraftforge.fml.RegistryObject;

public class ModBlockLootTables extends BlockLootTables {
    @Override
    protected void addTables() {
        registerDropSelfLootTable(ModBlocks.CHEESE_BASIN.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
