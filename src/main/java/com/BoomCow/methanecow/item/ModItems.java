package com.BoomCow.methanecow.item;


import com.BoomCow.methanecow.MethaneCow;
import com.BoomCow.methanecow.entity.ModEntityTypes;
import com.BoomCow.methanecow.item.custom.FlavoredMilkItem;
import com.BoomCow.methanecow.item.custom.ModFoods;
import com.BoomCow.methanecow.item.custom.ModSpawnEggItem;
import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static net.minecraft.item.Items.BUCKET;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MethaneCow.MOD_ID);

    public static final RegistryObject<ModSpawnEggItem> METHANE_COW_SPAWN_EGG = ITEMS.register("methane_cow_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.METHANE_COW, 4470310, 10592673,
                    new Item.Properties().group(ItemGroup.MISC)));

    public static final RegistryObject<FlavoredMilkItem> SPEED_MILK_BUCKET = ITEMS.register("speed_milk_bucket", () ->
            new FlavoredMilkItem((new Item.Properties()).containerItem(BUCKET).maxStackSize(1).group(ItemGroup.MISC)));

    public static final RegistryObject<FlavoredMilkItem> SLOWNESS_MILK_BUCKET = ITEMS.register("slowness_milk_bucket", () ->
            new FlavoredMilkItem((new Item.Properties()).containerItem(BUCKET).maxStackSize(1).group(ItemGroup.MISC)));

    public static final RegistryObject<FlavoredMilkItem> HASTE_MILK_BUCKET = ITEMS.register("haste_milk_bucket", () ->
            new FlavoredMilkItem((new Item.Properties()).containerItem(BUCKET).maxStackSize(1).group(ItemGroup.MISC)));

    public static final RegistryObject<FlavoredMilkItem> MINING_FATIGUE_MILK_BUCKET = ITEMS.register("mining_fatigue_milk_bucket", () ->
            new FlavoredMilkItem((new Item.Properties()).containerItem(BUCKET).maxStackSize(1).group(ItemGroup.MISC)));

    public static final RegistryObject<FlavoredMilkItem> STRENGTH_MILK_BUCKET = ITEMS.register("strength_milk_bucket", () ->
            new FlavoredMilkItem((new Item.Properties()).containerItem(BUCKET).maxStackSize(1).group(ItemGroup.MISC)));

    public static final RegistryObject<FlavoredMilkItem> INSTANT_HEALTH_MILK_BUCKET = ITEMS.register("instant_health_milk_bucket", () ->
            new FlavoredMilkItem((new Item.Properties()).containerItem(BUCKET).maxStackSize(1).group(ItemGroup.MISC)));

    public static final RegistryObject<FlavoredMilkItem> INSTANT_DAMAGE_MILK_BUCKET = ITEMS.register("instant_damage_milk_bucket", () ->
            new FlavoredMilkItem((new Item.Properties()).containerItem(BUCKET).maxStackSize(1).group(ItemGroup.MISC)));

    public static final RegistryObject<FlavoredMilkItem> JUMP_BOOST_MILK_BUCKET = ITEMS.register("jump_boost_milk_bucket", () ->
            new FlavoredMilkItem((new Item.Properties()).containerItem(BUCKET).maxStackSize(1).group(ItemGroup.MISC)));

    public static final RegistryObject<FlavoredMilkItem> NAUSEA_MILK_BUCKET = ITEMS.register("nausea_milk_bucket", () ->
            new FlavoredMilkItem((new Item.Properties()).containerItem(BUCKET).maxStackSize(1).group(ItemGroup.MISC)));

    public static final RegistryObject<FlavoredMilkItem> REGENERATION_MILK_BUCKET = ITEMS.register("regeneration_milk_bucket", () ->
            new FlavoredMilkItem((new Item.Properties()).containerItem(BUCKET).maxStackSize(1).group(ItemGroup.MISC)));

    public static final RegistryObject<FlavoredMilkItem> RESISTANCE_MILK_BUCKET = ITEMS.register("resistance_milk_bucket", () ->
            new FlavoredMilkItem((new Item.Properties()).containerItem(BUCKET).maxStackSize(1).group(ItemGroup.MISC)));

    public static final RegistryObject<FlavoredMilkItem> FIRE_RESISTANCE_MILK_BUCKET = ITEMS.register("fire_resistance_milk_bucket", () ->
            new FlavoredMilkItem((new Item.Properties()).containerItem(BUCKET).maxStackSize(1).group(ItemGroup.MISC)));

    public static final RegistryObject<FlavoredMilkItem> WATER_BREATHING_MILK_BUCKET = ITEMS.register("water_breathing_milk_bucket", () ->
            new FlavoredMilkItem((new Item.Properties()).containerItem(BUCKET).maxStackSize(1).group(ItemGroup.MISC)));

    public static final RegistryObject<FlavoredMilkItem> INVISIBILITY_MILK_BUCKET = ITEMS.register("invisibility_milk_bucket", () ->
            new FlavoredMilkItem((new Item.Properties()).containerItem(BUCKET).maxStackSize(1).group(ItemGroup.MISC)));

    public static final RegistryObject<FlavoredMilkItem> BLINDNESS_MILK_BUCKET = ITEMS.register("blindness_milk_bucket", () ->
            new FlavoredMilkItem((new Item.Properties()).containerItem(BUCKET).maxStackSize(1).group(ItemGroup.MISC)));

    public static final RegistryObject<FlavoredMilkItem> NIGHT_VISION_MILK_BUCKET = ITEMS.register("night_vision_milk_bucket", () ->
            new FlavoredMilkItem((new Item.Properties()).containerItem(BUCKET).maxStackSize(1).group(ItemGroup.MISC)));

    public static final RegistryObject<FlavoredMilkItem> HUNGER_MILK_BUCKET = ITEMS.register("hunger_milk_bucket", () ->
            new FlavoredMilkItem((new Item.Properties()).containerItem(BUCKET).maxStackSize(1).group(ItemGroup.MISC)));

    public static final RegistryObject<FlavoredMilkItem> WEAKNESS_MILK_BUCKET = ITEMS.register("weakness_milk_bucket", () ->
            new FlavoredMilkItem((new Item.Properties()).containerItem(BUCKET).maxStackSize(1).group(ItemGroup.MISC)));

    public static final RegistryObject<FlavoredMilkItem> POISON_MILK_BUCKET = ITEMS.register("poison_milk_bucket", () ->
            new FlavoredMilkItem((new Item.Properties()).containerItem(BUCKET).maxStackSize(1).group(ItemGroup.MISC)));

    public static final RegistryObject<FlavoredMilkItem> WITHER_MILK_BUCKET = ITEMS.register("wither_milk_bucket", () ->
            new FlavoredMilkItem((new Item.Properties()).containerItem(BUCKET).maxStackSize(1).group(ItemGroup.MISC)));

    public static final RegistryObject<FlavoredMilkItem> SATURATION_MILK_BUCKET = ITEMS.register("saturation_milk_bucket", () ->
            new FlavoredMilkItem((new Item.Properties()).containerItem(BUCKET).maxStackSize(1).group(ItemGroup.MISC)));

    public static final RegistryObject<FlavoredMilkItem> GLOWING_MILK_BUCKET = ITEMS.register("glowing_milk_bucket", () ->
            new FlavoredMilkItem((new Item.Properties()).containerItem(BUCKET).maxStackSize(1).group(ItemGroup.MISC)));

    public static final RegistryObject<FlavoredMilkItem> LEVITATION_MILK_BUCKET = ITEMS.register("levitation_milk_bucket", () ->
            new FlavoredMilkItem((new Item.Properties()).containerItem(BUCKET).maxStackSize(1).group(ItemGroup.MISC)));

    public static final RegistryObject<FlavoredMilkItem> LUCK_MILK_BUCKET = ITEMS.register("luck_milk_bucket", () ->
            new FlavoredMilkItem((new Item.Properties()).containerItem(BUCKET).maxStackSize(1).group(ItemGroup.MISC)));

    public static final RegistryObject<FlavoredMilkItem> UNLUCK_MILK_BUCKET = ITEMS.register("unluck_milk_bucket", () ->
            new FlavoredMilkItem((new Item.Properties()).containerItem(BUCKET).maxStackSize(1).group(ItemGroup.MISC)));

    public static final RegistryObject<FlavoredMilkItem> SLOW_FALLING_MILK_BUCKET = ITEMS.register("slow_falling_milk_bucket", () ->
            new FlavoredMilkItem((new Item.Properties()).containerItem(BUCKET).maxStackSize(1).group(ItemGroup.MISC)));

    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese", () ->
            new Item((new Item.Properties()).food(ModFoods.CHEESE).group(ItemGroup.FOOD)));

    public static final RegistryObject<ModFoods> SPEED_CHEESE = ITEMS.register("speed_cheese", () ->
            new ModFoods((new Item.Properties()).food(ModFoods.SPEED_CHEESE).group(ItemGroup.FOOD)));

    public static final RegistryObject<ModFoods> SLOWNESS_CHEESE = ITEMS.register("slowness_cheese", () ->
            new ModFoods((new Item.Properties()).food(ModFoods.SLOWNESS_CHEESE).group(ItemGroup.FOOD)));

    public static final RegistryObject<ModFoods> HASTE_CHEESE = ITEMS.register("haste_cheese", () ->
            new ModFoods((new Item.Properties()).food(ModFoods.HASTE_CHEESE).group(ItemGroup.FOOD)));

    public static final RegistryObject<ModFoods> MINING_FATIGUE_CHEESE = ITEMS.register("mining_fatigue_cheese", () ->
            new ModFoods((new Item.Properties()).food(ModFoods.MINING_FATIGUE_CHEESE).group(ItemGroup.FOOD)));

    public static final RegistryObject<ModFoods> STRENGTH_CHEESE = ITEMS.register("strength_cheese", () ->
            new ModFoods((new Item.Properties()).food(ModFoods.STRENGTH_CHEESE).group(ItemGroup.FOOD)));

    public static final RegistryObject<ModFoods> INSTANT_HEALTH_CHEESE = ITEMS.register("instant_health_cheese", () ->
            new ModFoods((new Item.Properties()).food(ModFoods.INSTANT_HEALTH_CHEESE).group(ItemGroup.FOOD)));

    public static final RegistryObject<ModFoods> INSTANT_DAMAGE_CHEESE = ITEMS.register("instant_damage_cheese", () ->
            new ModFoods((new Item.Properties()).food(ModFoods.INSTANT_DAMAGE_CHEESE).group(ItemGroup.FOOD)));

    public static final RegistryObject<ModFoods> JUMP_BOOST_CHEESE = ITEMS.register("jump_boost_cheese", () ->
            new ModFoods((new Item.Properties()).food(ModFoods.JUMP_BOOST_CHEESE).group(ItemGroup.FOOD)));

    public static final RegistryObject<ModFoods> NAUSEA_CHEESE = ITEMS.register("nausea_cheese", () ->
            new ModFoods((new Item.Properties()).food(ModFoods.NAUSEA_CHEESE).group(ItemGroup.FOOD)));

    public static final RegistryObject<ModFoods> REGENERATION_CHEESE = ITEMS.register("regeneration_cheese", () ->
            new ModFoods((new Item.Properties()).food(ModFoods.REGENERATION_CHEESE).group(ItemGroup.FOOD)));

    public static final RegistryObject<ModFoods> RESISTANCE_CHEESE = ITEMS.register("resistance_cheese", () ->
            new ModFoods((new Item.Properties()).food(ModFoods.RESISTANCE_CHEESE).group(ItemGroup.FOOD)));

    public static final RegistryObject<ModFoods> FIRE_RESISTANCE_CHEESE = ITEMS.register("fire_resistance_cheese", () ->
            new ModFoods((new Item.Properties()).food(ModFoods.FIRE_RESISTANCE_CHEESE).group(ItemGroup.FOOD)));

    public static final RegistryObject<ModFoods> WATER_BREATHING_CHEESE = ITEMS.register("water_breathing_cheese", () ->
            new ModFoods((new Item.Properties()).food(ModFoods.WATER_BREATHING_CHEESE).group(ItemGroup.FOOD)));

    public static final RegistryObject<ModFoods> INVISIBILITY_CHEESE = ITEMS.register("invisibility_cheese", () ->
            new ModFoods((new Item.Properties()).food(ModFoods.INVISIBILITY_CHEESE).group(ItemGroup.FOOD)));

    public static final RegistryObject<ModFoods> BLINDNESS_CHEESE = ITEMS.register("blindness_cheese", () ->
            new ModFoods((new Item.Properties()).food(ModFoods.BLINDNESS_CHEESE).group(ItemGroup.FOOD)));

    public static final RegistryObject<ModFoods> NIGHT_VISION_CHEESE = ITEMS.register("night_vision_cheese", () ->
            new ModFoods((new Item.Properties()).food(ModFoods.NIGHT_VISION_CHEESE).group(ItemGroup.FOOD)));

    public static final RegistryObject<ModFoods> HUNGER_CHEESE = ITEMS.register("hunger_cheese", () ->
            new ModFoods((new Item.Properties()).food(ModFoods.HUNGER_CHEESE).group(ItemGroup.FOOD)));

    public static final RegistryObject<ModFoods> WEAKNESS_CHEESE = ITEMS.register("weakness_cheese", () ->
            new ModFoods((new Item.Properties()).food(ModFoods.WEAKNESS_CHEESE).group(ItemGroup.FOOD)));

    public static final RegistryObject<ModFoods> POISON_CHEESE = ITEMS.register("poison_cheese", () ->
            new ModFoods((new Item.Properties()).food(ModFoods.POISON_CHEESE).group(ItemGroup.FOOD)));

    public static final RegistryObject<ModFoods> WITHER_CHEESE = ITEMS.register("wither_cheese", () ->
            new ModFoods((new Item.Properties()).food(ModFoods.WITHER_CHEESE).group(ItemGroup.FOOD)));

    public static final RegistryObject<ModFoods> SATURATION_CHEESE = ITEMS.register("saturation_cheese", () ->
            new ModFoods((new Item.Properties()).food(ModFoods.SATURATION_CHEESE).group(ItemGroup.FOOD)));

    public static final RegistryObject<ModFoods> GLOWING_CHEESE = ITEMS.register("glowing_cheese", () ->
            new ModFoods((new Item.Properties()).food(ModFoods.GLOWING_CHEESE).group(ItemGroup.FOOD)));

    public static final RegistryObject<ModFoods> LEVITATION_CHEESE = ITEMS.register("levitation_cheese", () ->
            new ModFoods((new Item.Properties()).food(ModFoods.LEVITATION_CHEESE).group(ItemGroup.FOOD)));

    public static final RegistryObject<ModFoods> LUCK_CHEESE = ITEMS.register("luck_cheese", () ->
            new ModFoods((new Item.Properties()).food(ModFoods.LUCK_CHEESE).group(ItemGroup.FOOD)));

    public static final RegistryObject<ModFoods> UNLUCK_CHEESE = ITEMS.register("unluck_cheese", () ->
            new ModFoods((new Item.Properties()).food(ModFoods.UNLUCK_CHEESE).group(ItemGroup.FOOD)));

    public static final RegistryObject<ModFoods> SLOW_FALLING_CHEESE = ITEMS.register("slow_falling_cheese", () ->
            new ModFoods((new Item.Properties()).food(ModFoods.SLOW_FALLING_CHEESE).group(ItemGroup.FOOD)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
