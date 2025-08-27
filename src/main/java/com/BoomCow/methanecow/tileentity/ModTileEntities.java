package com.BoomCow.methanecow.tileentity;

import com.BoomCow.methanecow.MethaneCow;
import com.BoomCow.methanecow.block.ModBlocks;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTileEntities {
    public static DeferredRegister<TileEntityType<?>> TILE_ENTITIES =
            DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, MethaneCow.MOD_ID);

    public static RegistryObject<TileEntityType<CheeseBasinTile>> CHEESE_BASIN_TILE =
            TILE_ENTITIES.register("cheese_basin_tile", () -> TileEntityType.Builder.create(CheeseBasinTile::new,
                    ModBlocks.CHEESE_BASIN.get()).build(null));

    public static void register(IEventBus eventBus) {
        TILE_ENTITIES.register(eventBus);
    }
}
