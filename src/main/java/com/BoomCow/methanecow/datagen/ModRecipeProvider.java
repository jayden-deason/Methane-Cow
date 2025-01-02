package com.BoomCow.methanecow.datagen;

import com.BoomCow.methanecow.item.ModItems;
import net.minecraft.data.CookingRecipeBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.IItemProvider;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        smeltingRecipe(ModItems.SPEED_MILK_BUCKET.get(), ModItems.PASTEURISED_SPEED_MILK_BUCKET.get(), 0.1F, 200, consumer);
        smeltingRecipe(ModItems.SLOWNESS_MILK_BUCKET.get(), ModItems.PASTEURISED_SLOWNESS_MILK_BUCKET.get(), 0.1F, 200, consumer);
        smeltingRecipe(ModItems.HASTE_MILK_BUCKET.get(), ModItems.PASTEURISED_HASTE_MILK_BUCKET.get(), 0.1F, 200, consumer);
        smeltingRecipe(ModItems.MINING_FATIGUE_MILK_BUCKET.get(), ModItems.PASTEURISED_MINING_FATIGUE_MILK_BUCKET.get(), 0.1F, 200, consumer);
        smeltingRecipe(ModItems.STRENGTH_MILK_BUCKET.get(), ModItems.PASTEURISED_STRENGTH_MILK_BUCKET.get(), 0.1F, 200, consumer);
        smeltingRecipe(ModItems.INSTANT_HEALTH_MILK_BUCKET.get(), ModItems.PASTEURISED_INSTANT_HEALTH_MILK_BUCKET.get(), 0.1F, 200, consumer);
        smeltingRecipe(ModItems.INSTANT_DAMAGE_MILK_BUCKET.get(), ModItems.PASTEURISED_INSTANT_DAMAGE_MILK_BUCKET.get(), 0.1F, 200, consumer);
        smeltingRecipe(ModItems.JUMP_BOOST_MILK_BUCKET.get(), ModItems.PASTEURISED_JUMP_BOOST_MILK_BUCKET.get(), 0.1F, 200, consumer);
        smeltingRecipe(ModItems.NAUSEA_MILK_BUCKET.get(), ModItems.PASTEURISED_NAUSEA_MILK_BUCKET.get(), 0.1F, 200, consumer);
        smeltingRecipe(ModItems.REGENERATION_MILK_BUCKET.get(), ModItems.PASTEURISED_REGENERATION_MILK_BUCKET.get(), 0.1F, 200, consumer);
        smeltingRecipe(ModItems.RESISTANCE_MILK_BUCKET.get(), ModItems.PASTEURISED_RESISTANCE_MILK_BUCKET.get(), 0.1F, 200, consumer);
        smeltingRecipe(ModItems.FIRE_RESISTANCE_MILK_BUCKET.get(), ModItems.PASTEURISED_FIRE_RESISTANCE_MILK_BUCKET.get(), 0.1F, 200, consumer);
        smeltingRecipe(ModItems.WATER_BREATHING_MILK_BUCKET.get(), ModItems.PASTEURISED_WATER_BREATHING_MILK_BUCKET.get(), 0.1F, 200, consumer);
        smeltingRecipe(ModItems.INVISIBILITY_MILK_BUCKET.get(), ModItems.PASTEURISED_INVISIBILITY_MILK_BUCKET.get(), 0.1F, 200, consumer);
        smeltingRecipe(ModItems.BLINDNESS_MILK_BUCKET.get(), ModItems.PASTEURISED_BLINDNESS_MILK_BUCKET.get(), 0.1F, 200, consumer);
        smeltingRecipe(ModItems.NIGHT_VISION_MILK_BUCKET.get(), ModItems.PASTEURISED_NIGHT_VISION_MILK_BUCKET.get(), 0.1F, 200, consumer);
        smeltingRecipe(ModItems.HUNGER_MILK_BUCKET.get(), ModItems.PASTEURISED_HUNGER_MILK_BUCKET.get(), 0.1F, 200, consumer);
        smeltingRecipe(ModItems.WEAKNESS_MILK_BUCKET.get(), ModItems.PASTEURISED_WEAKNESS_MILK_BUCKET.get(), 0.1F, 200, consumer);
        smeltingRecipe(ModItems.POISON_MILK_BUCKET.get(), ModItems.PASTEURISED_POISON_MILK_BUCKET.get(), 0.1F, 200, consumer);
        smeltingRecipe(ModItems.WITHER_MILK_BUCKET.get(), ModItems.PASTEURISED_WITHER_MILK_BUCKET.get(), 0.1F, 200, consumer);
        smeltingRecipe(ModItems.SATURATION_MILK_BUCKET.get(), ModItems.PASTEURISED_SATURATION_MILK_BUCKET.get(), 0.1F, 200, consumer);
        smeltingRecipe(ModItems.GLOWING_MILK_BUCKET.get(), ModItems.PASTEURISED_GLOWING_MILK_BUCKET.get(), 0.1F, 200, consumer);
        smeltingRecipe(ModItems.LEVITATION_MILK_BUCKET.get(), ModItems.PASTEURISED_LEVITATION_MILK_BUCKET.get(), 0.1F, 200, consumer);
        smeltingRecipe(ModItems.LUCK_MILK_BUCKET.get(), ModItems.PASTEURISED_LUCK_MILK_BUCKET.get(), 0.1F, 200, consumer);
        smeltingRecipe(ModItems.UNLUCK_MILK_BUCKET.get(), ModItems.PASTEURISED_UNLUCK_MILK_BUCKET.get(), 0.1F, 200, consumer);
        smeltingRecipe(ModItems.SLOW_FALLING_MILK_BUCKET.get(), ModItems.PASTEURISED_SLOW_FALLING_MILK_BUCKET.get(), 0.1F, 200, consumer);
    }

    private void smeltingRecipe(IItemProvider input, IItemProvider output, float xp, int cookTime, Consumer<IFinishedRecipe> consumer) {
        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(input), output, xp, cookTime).addCriterion("has_item", hasItem(input)).build(consumer);
    }
}
