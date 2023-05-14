package com.BoomCow.methanecow.item;


import com.BoomCow.methanecow.MethaneCow;
import com.BoomCow.methanecow.entity.ModEntityTypes;
import com.BoomCow.methanecow.item.custom.ModSpawnEggItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MethaneCow.MOD_ID);

    public static final RegistryObject<ModSpawnEggItem> METHANE_COW_SPAWN_EGG = ITEMS.register("methane_cow_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.METHANE_COW, 4470310, 10592673,
                    new Item.Properties().group(ItemGroup.MISC)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
