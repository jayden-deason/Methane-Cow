package com.BoomCow.methanecow.recipe;

import com.BoomCow.methanecow.MethaneCow;
import com.BoomCow.methanecow.block.ModBlocks;
import com.google.gson.JsonObject;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.registries.ForgeRegistryEntry;

public class CheeseBasinRecipe implements IRecipe<IInventory> {
    public static ResourceLocation TYPE_ID = new ResourceLocation(MethaneCow.MOD_ID, "cheese_basin");

    private final ResourceLocation id;
    private final Ingredient input;
    private final ItemStack output;
    private final int processTime;

    public CheeseBasinRecipe(ResourceLocation id, Ingredient input, ItemStack output, int processTime) {
        this.id = id;
        this.input = input;
        this.output = output;
        this.processTime = processTime;
    }

    @Override
    public boolean matches(IInventory inv, World worldIn) {
        return input.test(inv.getStackInSlot(0));
    }

    @Override
    public ItemStack getCraftingResult(IInventory inv) {
        return output.copy();
    }

    @Override
    public boolean canFit(int width, int height) {
        return true;
    }

    public Ingredient getInput() {
        return input;
    }

    @Override
    public ItemStack getRecipeOutput() {
        return output;
    }

    @Override
    public ResourceLocation getId() {
        return id;
    }

    @Override
    public ItemStack getIcon() {
        return new ItemStack(ModBlocks.CHEESE_BASIN.get());
    }

    @Override
    public IRecipeSerializer<?> getSerializer() {
        return ModRecipes.CHEESE_BASIN_SERIALIZER.get();
    }

    @Override
    public IRecipeType<?> getType() {
        return Registry.RECIPE_TYPE.getOptional(TYPE_ID).get();
    }

    public int getProcessTime() {
        return processTime;
    }

    public static class Type implements IRecipeType<CheeseBasinRecipe> {
        @Override
        public String toString() {
            return CheeseBasinRecipe.TYPE_ID.toString();
        }
    }

    public static class Serializer extends ForgeRegistryEntry<IRecipeSerializer<?>>
            implements IRecipeSerializer<CheeseBasinRecipe> {
        @Override
        public CheeseBasinRecipe read(ResourceLocation recipeId, JsonObject json) {
            Ingredient input = Ingredient.deserialize(json.getAsJsonObject("input").get("ingredient"));
            ItemStack output = CraftingHelper.getItemStack(json.getAsJsonObject("output"), true);
            int processTime = json.get("processTime").getAsInt();
            return new CheeseBasinRecipe(recipeId, input, output, processTime);
        }

        @Override
        public CheeseBasinRecipe read(ResourceLocation recipeId, PacketBuffer buffer) {
            Ingredient input = Ingredient.read(buffer);
            ItemStack output = buffer.readItemStack();
            int processTime = buffer.readInt();
            return new CheeseBasinRecipe(recipeId, input, output, processTime);
        }

        @Override
        public void write(PacketBuffer buffer, CheeseBasinRecipe recipe) {
            recipe.getInput().write(buffer);
            buffer.writeItemStack(recipe.getRecipeOutput());
            buffer.writeInt(recipe.getProcessTime());
        }
    }

}
