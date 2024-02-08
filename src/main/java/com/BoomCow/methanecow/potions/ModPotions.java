package com.BoomCow.methanecow.potions;

import com.BoomCow.methanecow.MethaneCow;
import com.BoomCow.methanecow.effect.ModEffects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.potion.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModPotions {
    public static final DeferredRegister<Potion> POTIONS =
            DeferredRegister.create(ForgeRegistries.POTION_TYPES, MethaneCow.MOD_ID);

    // Registering Custom Potions
    public static final RegistryObject<Potion> SPEED_COW_POTION = POTIONS.register("speed_cow",
            () -> new Potion(new EffectInstance(ModEffects.SPEED_COW.get(), 200, 0)));
    public static final RegistryObject<Potion> SLOWNESS_COW_POTION = POTIONS.register("slowness_cow",
            () -> new Potion(new EffectInstance(ModEffects.SLOWNESS_COW.get(), 200, 0)));
    public static final RegistryObject<Potion> HASTE_COW_POTION = POTIONS.register("haste_cow",
            () -> new Potion(new EffectInstance(ModEffects.HASTE_COW.get(), 200, 0)));
    public static final RegistryObject<Potion> MINING_FATIGUE_COW_POTION = POTIONS.register("mining_fatigue_cow",
            () -> new Potion(new EffectInstance(ModEffects.MINING_FATIGUE_COW.get(), 200, 0)));
    public static final RegistryObject<Potion> STRENGTH_COW_POTION = POTIONS.register("strength_cow",
            () -> new Potion(new EffectInstance(ModEffects.STRENGTH_COW.get(), 200, 0)));
    public static final RegistryObject<Potion> INSTANT_HEALTH_COW_POTION = POTIONS.register("instant_health_cow",
            () -> new Potion(new EffectInstance(ModEffects.INSTANT_HEALTH_COW.get(), 200, 0)));
    public static final RegistryObject<Potion> INSTANT_DAMAGE_COW_POTION = POTIONS.register("instant_damage_cow",
            () -> new Potion(new EffectInstance(ModEffects.INSTANT_DAMAGE_COW.get(), 200, 0)));
    public static final RegistryObject<Potion> JUMP_BOOST_COW_POTION = POTIONS.register("jump_boost_cow",
            () -> new Potion(new EffectInstance(ModEffects.JUMP_BOOST_COW.get(), 200, 0)));
    public static final RegistryObject<Potion> NAUSEA_COW_POTION = POTIONS.register("nausea_cow",
            () -> new Potion(new EffectInstance(ModEffects.NAUSEA_COW.get(), 200, 0)));
    public static final RegistryObject<Potion> REGENERATION_COW_POTION = POTIONS.register("regeneration_cow",
            () -> new Potion(new EffectInstance(ModEffects.REGENERATION_COW.get(), 200, 0)));
    public static final RegistryObject<Potion> RESISTANCE_COW_POTION = POTIONS.register("resistance_cow",
            () -> new Potion(new EffectInstance(ModEffects.RESISTANCE_COW.get(), 200, 0)));
    public static final RegistryObject<Potion> FIRE_RESISTANCE_COW_POTION = POTIONS.register("fire_resistance_cow",
            () -> new Potion(new EffectInstance(ModEffects.FIRE_RESISTANCE_COW.get(), 200, 0)));
    public static final RegistryObject<Potion> WATER_BREATHING_COW_POTION = POTIONS.register("water_breathing_cow",
            () -> new Potion(new EffectInstance(ModEffects.WATER_BREATHING_COW.get(), 200, 0)));
    public static final RegistryObject<Potion> INVISIBILITY_COW_POTION = POTIONS.register("invisibility_cow",
            () -> new Potion(new EffectInstance(ModEffects.INVISIBILITY_COW.get(), 200, 0)));
    public static final RegistryObject<Potion> BLINDNESS_COW_POTION = POTIONS.register("blindness_cow",
            () -> new Potion(new EffectInstance(ModEffects.BLINDNESS_COW.get(), 200, 0)));
    public static final RegistryObject<Potion> NIGHT_VISION_COW_POTION = POTIONS.register("night_vision_cow",
            () -> new Potion(new EffectInstance(ModEffects.NIGHT_VISION_COW.get(), 200, 0)));
    public static final RegistryObject<Potion> HUNGER_COW_POTION = POTIONS.register("hunger_cow",
            () -> new Potion(new EffectInstance(ModEffects.HUNGER_COW.get(), 200, 0)));
    public static final RegistryObject<Potion> WEAKNESS_COW_POTION = POTIONS.register("weakness_cow",
            () -> new Potion(new EffectInstance(ModEffects.WEAKNESS_COW.get(), 200, 0)));
    public static final RegistryObject<Potion> POISON_COW_POTION = POTIONS.register("poison_cow",
            () -> new Potion(new EffectInstance(ModEffects.POISON_COW.get(), 200, 0)));
    public static final RegistryObject<Potion> WITHER_COW_POTION = POTIONS.register("wither_cow",
            () -> new Potion(new EffectInstance(ModEffects.WITHER_COW.get(), 200, 0)));
    public static final RegistryObject<Potion> SATURATION_COW_POTION = POTIONS.register("saturation_cow",
            () -> new Potion(new EffectInstance(ModEffects.SATURATION_COW.get(), 200, 0)));
    public static final RegistryObject<Potion> GLOWING_COW_POTION = POTIONS.register("glowing_cow",
            () -> new Potion(new EffectInstance(ModEffects.GLOWING_COW.get(), 200, 0)));
    public static final RegistryObject<Potion> LEVITATION_COW_POTION = POTIONS.register("levitation_cow",
            () -> new Potion(new EffectInstance(ModEffects.LEVITATION_COW.get(), 200, 0)));
    public static final RegistryObject<Potion> LUCK_COW_POTION = POTIONS.register("luck_cow",
            () -> new Potion(new EffectInstance(ModEffects.LUCK_COW.get(), 200, 0)));
    public static final RegistryObject<Potion> UNLUCK_COW_POTION = POTIONS.register("unluck_cow",
            () -> new Potion(new EffectInstance(ModEffects.UNLUCK_COW.get(), 200, 0)));
    public static final RegistryObject<Potion> SLOW_FALLING_COW_POTION = POTIONS.register("slow_falling_cow",
            () -> new Potion(new EffectInstance(ModEffects.SLOW_FALLING_COW.get(), 200, 0)));

    // Registering Potions for Vanilla Effects
    public static final RegistryObject<Potion> HASTE = POTIONS.register("haste",
            () -> new Potion(new EffectInstance(Effects.HASTE, 200, 0)));
    public static final RegistryObject<Potion> MINING_FATIGUE = POTIONS.register("mining_fatigue",
            () -> new Potion(new EffectInstance(Effects.MINING_FATIGUE, 200, 0)));
    public static final RegistryObject<Potion> INSTANT_HEALTH = POTIONS.register("instant_health",
            () -> new Potion(new EffectInstance(Effects.INSTANT_HEALTH, 1, 0)));
    public static final RegistryObject<Potion> INSTANT_DAMAGE = POTIONS.register("instant_damage",
            () -> new Potion(new EffectInstance(Effects.INSTANT_DAMAGE, 1, 0)));
    public static final RegistryObject<Potion> JUMP_BOOST = POTIONS.register("jump_boost",
            () -> new Potion(new EffectInstance(Effects.JUMP_BOOST, 200, 0)));
    public static final RegistryObject<Potion> NAUSEA = POTIONS.register("nausea",
            () -> new Potion(new EffectInstance(Effects.NAUSEA, 200, 0)));
    public static final RegistryObject<Potion> RESISTANCE = POTIONS.register("resistance",
            () -> new Potion(new EffectInstance(Effects.RESISTANCE, 200, 0)));
    public static final RegistryObject<Potion> BLINDNESS = POTIONS.register("blindness",
            () -> new Potion(new EffectInstance(Effects.BLINDNESS, 200, 0)));
    public static final RegistryObject<Potion> HUNGER = POTIONS.register("hunger",
            () -> new Potion(new EffectInstance(Effects.HUNGER, 200, 0)));
    public static final RegistryObject<Potion> WITHER = POTIONS.register("wither",
            () -> new Potion(new EffectInstance(Effects.WITHER, 200, 0)));
    public static final RegistryObject<Potion> SATURATION = POTIONS.register("saturation",
            () -> new Potion(new EffectInstance(Effects.SATURATION, 200, 0)));
    public static final RegistryObject<Potion> GLOWING = POTIONS.register("glowing",
            () -> new Potion(new EffectInstance(Effects.GLOWING, 200, 0)));
    public static final RegistryObject<Potion> LEVITATION = POTIONS.register("levitation",
            () -> new Potion(new EffectInstance(Effects.LEVITATION, 200, 0)));
    public static final RegistryObject<Potion> UNLUCK = POTIONS.register("unluck",
            () -> new Potion(new EffectInstance(Effects.UNLUCK, 200, 0)));

    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }
}
