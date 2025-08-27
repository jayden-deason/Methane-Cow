package com.BoomCow.methanecow.recipe;

import com.BoomCow.methanecow.MethaneCow;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModRecipes {
    public static final DeferredRegister<IRecipeSerializer<?>> RECIPE_SERIALIZER =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, MethaneCow.MOD_ID);

    public static final RegistryObject<CheeseBasinRecipe.Serializer> CHEESE_BASIN_SERIALIZER =
            RECIPE_SERIALIZER.register("cheese_basin", CheeseBasinRecipe.Serializer::new);

    public static IRecipeType<CheeseBasinRecipe> CHEESE_BASIN_TYPE =
            new CheeseBasinRecipe.Type();

    public static void register(IEventBus eventBus) {
        RECIPE_SERIALIZER.register(eventBus);

        Registry.register(Registry.RECIPE_TYPE, CheeseBasinRecipe.TYPE_ID, CHEESE_BASIN_TYPE);
    }
}
