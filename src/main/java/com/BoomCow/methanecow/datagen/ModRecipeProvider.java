package com.BoomCow.methanecow.datagen;

import com.BoomCow.methanecow.MethaneCow;
import com.BoomCow.methanecow.datagen.custom.CheeseBasinRecipeBuilder;
import com.BoomCow.methanecow.item.ModItems;
import net.minecraft.data.CookingRecipeBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        smeltingRecipe(Items.MILK_BUCKET, ModItems.PASTEURIZED_MILK_BUCKET.get(), 0.1F, 200, consumer);
        smeltingRecipe(ModItems.SPEED_MILK_BUCKET.get(), ModItems.PASTEURIZED_SPEED_MILK_BUCKET.get(), 0.1F, 200, consumer);
        smeltingRecipe(ModItems.SLOWNESS_MILK_BUCKET.get(), ModItems.PASTEURIZED_SLOWNESS_MILK_BUCKET.get(), 0.1F, 200, consumer);
        smeltingRecipe(ModItems.HASTE_MILK_BUCKET.get(), ModItems.PASTEURIZED_HASTE_MILK_BUCKET.get(), 0.1F, 200, consumer);
        smeltingRecipe(ModItems.MINING_FATIGUE_MILK_BUCKET.get(), ModItems.PASTEURIZED_MINING_FATIGUE_MILK_BUCKET.get(), 0.1F, 200, consumer);
        smeltingRecipe(ModItems.STRENGTH_MILK_BUCKET.get(), ModItems.PASTEURIZED_STRENGTH_MILK_BUCKET.get(), 0.1F, 200, consumer);
        smeltingRecipe(ModItems.INSTANT_HEALTH_MILK_BUCKET.get(), ModItems.PASTEURIZED_INSTANT_HEALTH_MILK_BUCKET.get(), 0.1F, 200, consumer);
        smeltingRecipe(ModItems.INSTANT_DAMAGE_MILK_BUCKET.get(), ModItems.PASTEURIZED_INSTANT_DAMAGE_MILK_BUCKET.get(), 0.1F, 200, consumer);
        smeltingRecipe(ModItems.JUMP_BOOST_MILK_BUCKET.get(), ModItems.PASTEURIZED_JUMP_BOOST_MILK_BUCKET.get(), 0.1F, 200, consumer);
        smeltingRecipe(ModItems.NAUSEA_MILK_BUCKET.get(), ModItems.PASTEURIZED_NAUSEA_MILK_BUCKET.get(), 0.1F, 200, consumer);
        smeltingRecipe(ModItems.REGENERATION_MILK_BUCKET.get(), ModItems.PASTEURIZED_REGENERATION_MILK_BUCKET.get(), 0.1F, 200, consumer);
        smeltingRecipe(ModItems.RESISTANCE_MILK_BUCKET.get(), ModItems.PASTEURIZED_RESISTANCE_MILK_BUCKET.get(), 0.1F, 200, consumer);
        smeltingRecipe(ModItems.FIRE_RESISTANCE_MILK_BUCKET.get(), ModItems.PASTEURIZED_FIRE_RESISTANCE_MILK_BUCKET.get(), 0.1F, 200, consumer);
        smeltingRecipe(ModItems.WATER_BREATHING_MILK_BUCKET.get(), ModItems.PASTEURIZED_WATER_BREATHING_MILK_BUCKET.get(), 0.1F, 200, consumer);
        smeltingRecipe(ModItems.INVISIBILITY_MILK_BUCKET.get(), ModItems.PASTEURIZED_INVISIBILITY_MILK_BUCKET.get(), 0.1F, 200, consumer);
        smeltingRecipe(ModItems.BLINDNESS_MILK_BUCKET.get(), ModItems.PASTEURIZED_BLINDNESS_MILK_BUCKET.get(), 0.1F, 200, consumer);
        smeltingRecipe(ModItems.NIGHT_VISION_MILK_BUCKET.get(), ModItems.PASTEURIZED_NIGHT_VISION_MILK_BUCKET.get(), 0.1F, 200, consumer);
        smeltingRecipe(ModItems.HUNGER_MILK_BUCKET.get(), ModItems.PASTEURIZED_HUNGER_MILK_BUCKET.get(), 0.1F, 200, consumer);
        smeltingRecipe(ModItems.WEAKNESS_MILK_BUCKET.get(), ModItems.PASTEURIZED_WEAKNESS_MILK_BUCKET.get(), 0.1F, 200, consumer);
        smeltingRecipe(ModItems.POISON_MILK_BUCKET.get(), ModItems.PASTEURIZED_POISON_MILK_BUCKET.get(), 0.1F, 200, consumer);
        smeltingRecipe(ModItems.WITHER_MILK_BUCKET.get(), ModItems.PASTEURIZED_WITHER_MILK_BUCKET.get(), 0.1F, 200, consumer);
        smeltingRecipe(ModItems.SATURATION_MILK_BUCKET.get(), ModItems.PASTEURIZED_SATURATION_MILK_BUCKET.get(), 0.1F, 200, consumer);
        smeltingRecipe(ModItems.GLOWING_MILK_BUCKET.get(), ModItems.PASTEURIZED_GLOWING_MILK_BUCKET.get(), 0.1F, 200, consumer);
        smeltingRecipe(ModItems.LEVITATION_MILK_BUCKET.get(), ModItems.PASTEURIZED_LEVITATION_MILK_BUCKET.get(), 0.1F, 200, consumer);
        smeltingRecipe(ModItems.LUCK_MILK_BUCKET.get(), ModItems.PASTEURIZED_LUCK_MILK_BUCKET.get(), 0.1F, 200, consumer);
        smeltingRecipe(ModItems.UNLUCK_MILK_BUCKET.get(), ModItems.PASTEURIZED_UNLUCK_MILK_BUCKET.get(), 0.1F, 200, consumer);
        smeltingRecipe(ModItems.SLOW_FALLING_MILK_BUCKET.get(), ModItems.PASTEURIZED_SLOW_FALLING_MILK_BUCKET.get(), 0.1F, 200, consumer);

        cheeseBasinRecipe(ModItems.PASTEURIZED_MILK_BUCKET.get(), ModItems.CHEESE.get(), 4, 400, consumer);
        cheeseBasinRecipe(ModItems.PASTEURIZED_SPEED_MILK_BUCKET.get(), ModItems.SPEED_CHEESE.get(), 4, 400, consumer);
        cheeseBasinRecipe(ModItems.PASTEURIZED_SLOWNESS_MILK_BUCKET.get(), ModItems.SLOWNESS_CHEESE.get(), 4, 400, consumer);
        cheeseBasinRecipe(ModItems.PASTEURIZED_HASTE_MILK_BUCKET.get(), ModItems.HASTE_CHEESE.get(), 4, 400, consumer);
        cheeseBasinRecipe(ModItems.PASTEURIZED_MINING_FATIGUE_MILK_BUCKET.get(), ModItems.MINING_FATIGUE_CHEESE.get(), 4, 400, consumer);
        cheeseBasinRecipe(ModItems.PASTEURIZED_STRENGTH_MILK_BUCKET.get(), ModItems.STRENGTH_CHEESE.get(), 4, 400, consumer);
        cheeseBasinRecipe(ModItems.PASTEURIZED_INSTANT_HEALTH_MILK_BUCKET.get(), ModItems.INSTANT_HEALTH_CHEESE.get(), 4, 400, consumer);
        cheeseBasinRecipe(ModItems.PASTEURIZED_INSTANT_DAMAGE_MILK_BUCKET.get(), ModItems.INSTANT_DAMAGE_CHEESE.get(), 4, 400, consumer);
        cheeseBasinRecipe(ModItems.PASTEURIZED_JUMP_BOOST_MILK_BUCKET.get(), ModItems.JUMP_BOOST_CHEESE.get(), 4, 400, consumer);
        cheeseBasinRecipe(ModItems.PASTEURIZED_NAUSEA_MILK_BUCKET.get(), ModItems.NAUSEA_CHEESE.get(), 4, 400, consumer);
        cheeseBasinRecipe(ModItems.PASTEURIZED_REGENERATION_MILK_BUCKET.get(), ModItems.REGENERATION_CHEESE.get(), 4, 400, consumer);
        cheeseBasinRecipe(ModItems.PASTEURIZED_RESISTANCE_MILK_BUCKET.get(), ModItems.RESISTANCE_CHEESE.get(), 4, 400, consumer);
        cheeseBasinRecipe(ModItems.PASTEURIZED_FIRE_RESISTANCE_MILK_BUCKET.get(), ModItems.FIRE_RESISTANCE_CHEESE.get(), 4, 400, consumer);
        cheeseBasinRecipe(ModItems.PASTEURIZED_WATER_BREATHING_MILK_BUCKET.get(), ModItems.WATER_BREATHING_CHEESE.get(), 4, 400, consumer);
        cheeseBasinRecipe(ModItems.PASTEURIZED_INVISIBILITY_MILK_BUCKET.get(), ModItems.INVISIBILITY_CHEESE.get(), 4, 400, consumer);
        cheeseBasinRecipe(ModItems.PASTEURIZED_BLINDNESS_MILK_BUCKET.get(), ModItems.BLINDNESS_CHEESE.get(), 4, 400, consumer);
        cheeseBasinRecipe(ModItems.PASTEURIZED_NIGHT_VISION_MILK_BUCKET.get(), ModItems.NIGHT_VISION_CHEESE.get(), 4, 400, consumer);
        cheeseBasinRecipe(ModItems.PASTEURIZED_HUNGER_MILK_BUCKET.get(), ModItems.HUNGER_CHEESE.get(), 4, 400, consumer);
        cheeseBasinRecipe(ModItems.PASTEURIZED_WEAKNESS_MILK_BUCKET.get(), ModItems.WEAKNESS_CHEESE.get(), 4, 400, consumer);
        cheeseBasinRecipe(ModItems.PASTEURIZED_POISON_MILK_BUCKET.get(), ModItems.POISON_CHEESE.get(), 4, 400, consumer);
        cheeseBasinRecipe(ModItems.PASTEURIZED_WITHER_MILK_BUCKET.get(), ModItems.WITHER_CHEESE.get(), 4, 400, consumer);
        cheeseBasinRecipe(ModItems.PASTEURIZED_SATURATION_MILK_BUCKET.get(), ModItems.SATURATION_CHEESE.get(), 4, 400, consumer);
        cheeseBasinRecipe(ModItems.PASTEURIZED_GLOWING_MILK_BUCKET.get(), ModItems.GLOWING_CHEESE.get(), 4, 400, consumer);
        cheeseBasinRecipe(ModItems.PASTEURIZED_LEVITATION_MILK_BUCKET.get(), ModItems.LEVITATION_CHEESE.get(), 4, 400, consumer);
        cheeseBasinRecipe(ModItems.PASTEURIZED_LUCK_MILK_BUCKET.get(), ModItems.LUCK_CHEESE.get(), 4, 400, consumer);
        cheeseBasinRecipe(ModItems.PASTEURIZED_UNLUCK_MILK_BUCKET.get(), ModItems.UNLUCK_CHEESE.get(), 4, 400, consumer);
        cheeseBasinRecipe(ModItems.PASTEURIZED_SLOW_FALLING_MILK_BUCKET.get(), ModItems.SLOW_FALLING_CHEESE.get(), 4, 400, consumer);
    }

    private void smeltingRecipe(IItemProvider input, IItemProvider output, float xp, int cookTime, Consumer<IFinishedRecipe> consumer) {
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(input), output, xp, cookTime).addCriterion("has_item", hasItem(input)).build(consumer);
    }

    private void cheeseBasinRecipe(IItemProvider input, IItemProvider output, int outputCount, int processTime, Consumer<IFinishedRecipe> consumer) {
        CheeseBasinRecipeBuilder.create(new ResourceLocation(MethaneCow.MOD_ID, output.asItem().getRegistryName().getPath()))
                .input(Ingredient.fromItems(input))
                .output(output.asItem(), outputCount)
                .processTime(processTime)
                .build(consumer);
    }
}
