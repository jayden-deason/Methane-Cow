package com.BoomCow.methanecow.datagen;

import com.BoomCow.methanecow.datagen.loot.ModBlockLootTables;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.LootTableProvider;
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import net.minecraft.loot.*;
import net.minecraft.util.ResourceLocation;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ModLootTableProvider extends LootTableProvider {
    public ModLootTableProvider(DataGenerator generator) {
        super(generator);
    }

    private final List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootParameterSet>>
            loot_tables = ImmutableList.of(Pair.of(ModBlockLootTables::new, LootParameterSets.BLOCK));

    @Override
    protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootParameterSet>> getTables() {
        return loot_tables;
    }

    @Override
    protected void validate(Map<ResourceLocation, LootTable> map, ValidationTracker validationtracker) {
        map.forEach((id, table) -> LootTableManager.validateLootTable(validationtracker, id, table));
    }
}
