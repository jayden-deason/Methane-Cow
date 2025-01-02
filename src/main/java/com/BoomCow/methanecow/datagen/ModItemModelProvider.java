package com.BoomCow.methanecow.datagen;

import com.BoomCow.methanecow.MethaneCow;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, MethaneCow.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem("speed_milk_bucket");
        simpleItem("slowness_milk_bucket");
        simpleItem("haste_milk_bucket");
        simpleItem("mining_fatigue_milk_bucket");
        simpleItem("strength_milk_bucket");
        simpleItem("instant_health_milk_bucket");
        simpleItem("instant_damage_milk_bucket");
        simpleItem("jump_boost_milk_bucket");
        simpleItem("nausea_milk_bucket");
        simpleItem("regeneration_milk_bucket");
        simpleItem("resistance_milk_bucket");
        simpleItem("fire_resistance_milk_bucket");
        simpleItem("water_breathing_milk_bucket");
        simpleItem("invisibility_milk_bucket");
        simpleItem("blindness_milk_bucket");
        simpleItem("night_vision_milk_bucket");
        simpleItem("hunger_milk_bucket");
        simpleItem("weakness_milk_bucket");
        simpleItem("poison_milk_bucket");
        simpleItem("wither_milk_bucket");
        simpleItem("saturation_milk_bucket");
        simpleItem("glowing_milk_bucket");
        simpleItem("levitation_milk_bucket");
        simpleItem("luck_milk_bucket");
        simpleItem("unluck_milk_bucket");
        simpleItem("slow_falling_milk_bucket");

        simpleItem("pasteurised_speed_milk_bucket");
        simpleItem("pasteurised_slowness_milk_bucket");
        simpleItem("pasteurised_haste_milk_bucket");
        simpleItem("pasteurised_mining_fatigue_milk_bucket");
        simpleItem("pasteurised_strength_milk_bucket");
        simpleItem("pasteurised_instant_health_milk_bucket");
        simpleItem("pasteurised_instant_damage_milk_bucket");
        simpleItem("pasteurised_jump_boost_milk_bucket");
        simpleItem("pasteurised_nausea_milk_bucket");
        simpleItem("pasteurised_regeneration_milk_bucket");
        simpleItem("pasteurised_resistance_milk_bucket");
        simpleItem("pasteurised_fire_resistance_milk_bucket");
        simpleItem("pasteurised_water_breathing_milk_bucket");
        simpleItem("pasteurised_invisibility_milk_bucket");
        simpleItem("pasteurised_blindness_milk_bucket");
        simpleItem("pasteurised_night_vision_milk_bucket");
        simpleItem("pasteurised_hunger_milk_bucket");
        simpleItem("pasteurised_weakness_milk_bucket");
        simpleItem("pasteurised_poison_milk_bucket");
        simpleItem("pasteurised_wither_milk_bucket");
        simpleItem("pasteurised_saturation_milk_bucket");
        simpleItem("pasteurised_glowing_milk_bucket");
        simpleItem("pasteurised_levitation_milk_bucket");
        simpleItem("pasteurised_luck_milk_bucket");
        simpleItem("pasteurised_unluck_milk_bucket");
        simpleItem("pasteurised_slow_falling_milk_bucket");

        simpleItem("cheese");
        simpleItem("speed_cheese");
        simpleItem("slowness_cheese");
        simpleItem("haste_cheese");
        simpleItem("mining_fatigue_cheese");
        simpleItem("strength_cheese");
        simpleItem("instant_health_cheese");
        simpleItem("instant_damage_cheese");
        simpleItem("jump_boost_cheese");
        simpleItem("nausea_cheese");
        simpleItem("regeneration_cheese");
        simpleItem("resistance_cheese");
        simpleItem("fire_resistance_cheese");
        simpleItem("water_breathing_cheese");
        simpleItem("invisibility_cheese");
        simpleItem("blindness_cheese");
        simpleItem("night_vision_cheese");
        simpleItem("hunger_cheese");
        simpleItem("weakness_cheese");
        simpleItem("poison_cheese");
        simpleItem("wither_cheese");
        simpleItem("saturation_cheese");
        simpleItem("glowing_cheese");
        simpleItem("levitation_cheese");
        simpleItem("luck_cheese");
        simpleItem("unluck_cheese");
        simpleItem("slow_falling_cheese");

        simpleItem("cheese_cloth");
    }

    private ItemModelBuilder simpleItem(String name) {
        if (name.contains("pasteurised")) {
            return getBuilder(name).parent(getExistingFile(mcLoc("item/generated"))).texture("layer0",
                    "item/" + name.substring(12));
        }
        return getBuilder(name).parent(getExistingFile(mcLoc("item/generated"))).texture("layer0",
                "item/" + name);
    }
}
