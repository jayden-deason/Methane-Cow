package com.BoomCow.methanecow.datagen.custom;

import com.BoomCow.methanecow.recipe.ModRecipes;
import com.google.gson.JsonObject;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;

import java.util.function.Consumer;

public class CheeseBasinRecipeBuilder {
    private final ResourceLocation id;
    private Ingredient input;
    private Item output;
    private int outputCount;
    private int processTime;

    private CheeseBasinRecipeBuilder(ResourceLocation id) {
        this.id = id;
    }

    public static CheeseBasinRecipeBuilder create(ResourceLocation id) {
        return new CheeseBasinRecipeBuilder(id);
    }

    public CheeseBasinRecipeBuilder input(Ingredient input) {
        this.input = input;
        return this;
    }

    public CheeseBasinRecipeBuilder output(Item output, int count) {
        this.output = output;
        this.outputCount = count;
        return this;
    }

    public CheeseBasinRecipeBuilder processTime(int processTime) {
        this.processTime = processTime;
        return this;
    }

    public void build(Consumer<IFinishedRecipe> consumer) {
        consumer.accept(new Result(id, input, output, outputCount, processTime));
    }

    public static class Result implements IFinishedRecipe {
        private final ResourceLocation id;
        private final Ingredient input;
        private final Item output;
        private final int outputCount;
        private final int processTime;

        public Result(ResourceLocation id, Ingredient input, Item output, int outputCount, int processTime) {
            this.id = id;
            this.input = input;
            this.output = output;
            this.outputCount = outputCount;
            this.processTime = processTime;
        }

        @Override
        public void serialize(JsonObject json) {
            JsonObject inputJson = new JsonObject();
            inputJson.add("ingredient", input.serialize());

            JsonObject outputJson = new JsonObject();
            outputJson.addProperty("item", output.getRegistryName().toString());
            outputJson.addProperty("count", outputCount);

            json.addProperty("type", "methanecow:cheese_basin");
            json.add("input", inputJson);
            json.add("output", outputJson);
            json.addProperty("processTime", processTime);
        }

        @Override
        public IRecipeSerializer<?> getSerializer() {
            return ModRecipes.CHEESE_BASIN_SERIALIZER.get();
        }

        @Override
        public ResourceLocation getID() {
            return id;
        }

        @Override
        public JsonObject getAdvancementJson() {
            return null;
        }

        @Override
        public ResourceLocation getAdvancementID() {
            return null;
        }
    }
}