package com.BoomCow.methanecow.item;


import com.BoomCow.methanecow.MethaneCow;
import com.BoomCow.methanecow.entity.ModEntityTypes;
import com.BoomCow.methanecow.item.custom.FlavoredMilkItem;
import com.BoomCow.methanecow.item.custom.ModSpawnEggItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.MilkBucketItem;
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


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
