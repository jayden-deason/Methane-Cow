package com.BoomCow.methanecow.datagen;

import com.BoomCow.methanecow.MethaneCow;
import com.BoomCow.methanecow.block.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, MethaneCow.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
//        simpleBlock(ModBlocks.CHEESE_BASIN.get());
    }
}
