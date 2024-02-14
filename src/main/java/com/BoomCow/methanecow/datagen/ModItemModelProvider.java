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
    }

    private ItemModelBuilder simpleItem(String name) {
        return getBuilder(name).parent(getExistingFile(mcLoc("item/generated"))).texture("layer0",
                "item/" + name);
    }
}
