package com.BoomCow.methanecow.effect;

import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class EffectMapping {
    private static final Map<ModEffect, EffectConverter> effectsMap = new HashMap<>();

    static {
        effectsMap.put((ModEffect) ModEffects.SPEED_COW.get(), new EffectConverter(Arrays.asList(new EffectInstance(Effects.SPEED, 200, 0)), "effect.speed_cow", 8171462));
        effectsMap.put((ModEffect) ModEffects.SLOWNESS_COW.get(), new EffectConverter(Arrays.asList(new EffectInstance(Effects.SLOWNESS, 200, 0)), "effect.slowness_cow", 5926017));
        effectsMap.put((ModEffect) ModEffects.HASTE_COW.get(), new EffectConverter(Arrays.asList(new EffectInstance(Effects.HASTE, 200, 0)), "effect.haste_cow", 14270531));
        effectsMap.put((ModEffect) ModEffects.MINING_FATIGUE_COW.get(), new EffectConverter(Arrays.asList(new EffectInstance(Effects.MINING_FATIGUE, 200, 0)), "effect.mining_fatigue_cow", 4866583));
        effectsMap.put((ModEffect) ModEffects.STRENGTH_COW.get(), new EffectConverter(Arrays.asList(new EffectInstance(Effects.STRENGTH, 200, 0)), "effect.strength_cow", 9643043));
        effectsMap.put((ModEffect) ModEffects.INSTANT_HEALTH_COW.get(), new EffectConverter(Arrays.asList(new EffectInstance(Effects.INSTANT_HEALTH, 1, 0)), "effect.instant_health_cow", 16262179));
        effectsMap.put((ModEffect) ModEffects.INSTANT_DAMAGE_COW.get(), new EffectConverter(Arrays.asList(new EffectInstance(Effects.INSTANT_DAMAGE, 1, 0)), "effect.instant_damage_cow", 4393481));
        effectsMap.put((ModEffect) ModEffects.JUMP_BOOST_COW.get(), new EffectConverter(Arrays.asList(new EffectInstance(Effects.JUMP_BOOST, 200, 0)), "effect.jump_boost_cow", 2293580));
        effectsMap.put((ModEffect) ModEffects.NAUSEA_COW.get(), new EffectConverter(Arrays.asList(new EffectInstance(Effects.NAUSEA, 200, 0)), "effect.nausea_cow", 5578058));
        effectsMap.put((ModEffect) ModEffects.REGENERATION_COW.get(), new EffectConverter(Arrays.asList(new EffectInstance(Effects.REGENERATION, 200, 0)), "effect.regeneration_cow", 13458603));
        effectsMap.put((ModEffect) ModEffects.RESISTANCE_COW.get(), new EffectConverter(Arrays.asList(new EffectInstance(Effects.RESISTANCE, 200, 0)), "effect.resistance_cow", 10044730));
        effectsMap.put((ModEffect) ModEffects.FIRE_RESISTANCE_COW.get(), new EffectConverter(Arrays.asList(new EffectInstance(Effects.FIRE_RESISTANCE, 200, 0)), "effect.fire_resistance_cow", 14981690));
        effectsMap.put((ModEffect) ModEffects.WATER_BREATHING_COW.get(), new EffectConverter(Arrays.asList(new EffectInstance(Effects.WATER_BREATHING, 200, 0)), "effect.water_breathing_cow", 3035801));
        effectsMap.put((ModEffect) ModEffects.INVISIBILITY_COW.get(), new EffectConverter(Arrays.asList(new EffectInstance(Effects.INVISIBILITY, 200, 0)), "effect.invisibility_cow", 8356754));
        effectsMap.put((ModEffect) ModEffects.BLINDNESS_COW.get(), new EffectConverter(Arrays.asList(new EffectInstance(Effects.BLINDNESS, 200, 0)), "effect.blindness_cow", 2039587));
        effectsMap.put((ModEffect) ModEffects.NIGHT_VISION_COW.get(), new EffectConverter(Arrays.asList(new EffectInstance(Effects.NIGHT_VISION, 200, 0)), "effect.night_vision_cow", 2039713));
        effectsMap.put((ModEffect) ModEffects.HUNGER_COW.get(), new EffectConverter(Arrays.asList(new EffectInstance(Effects.HUNGER, 200, 0)), "effect.hunger_cow", 5797459));
        effectsMap.put((ModEffect) ModEffects.WEAKNESS_COW.get(), new EffectConverter(Arrays.asList(new EffectInstance(Effects.WEAKNESS, 200, 0)), "effect.weakness_cow", 4738376));
        effectsMap.put((ModEffect) ModEffects.POISON_COW.get(), new EffectConverter(Arrays.asList(new EffectInstance(Effects.POISON, 200, 0)), "effect.poison_cow", 5149489));
        effectsMap.put((ModEffect) ModEffects.WITHER_COW.get(), new EffectConverter(Arrays.asList(new EffectInstance(Effects.WITHER, 200, 0)), "effect.wither_cow", 3484199));
        effectsMap.put((ModEffect) ModEffects.SATURATION_COW.get(), new EffectConverter(Arrays.asList(new EffectInstance(Effects.SATURATION, 200, 0)), "effect.saturation_cow", 16262179));
        effectsMap.put((ModEffect) ModEffects.GLOWING_COW.get(), new EffectConverter(Arrays.asList(new EffectInstance(Effects.GLOWING, 200, 0)), "effect.glowing_cow", 9740385));
        effectsMap.put((ModEffect) ModEffects.LEVITATION_COW.get(), new EffectConverter(Arrays.asList(new EffectInstance(Effects.LEVITATION, 200, 0)), "effect.levitation_cow", 13565951));
        effectsMap.put((ModEffect) ModEffects.LUCK_COW.get(), new EffectConverter(Arrays.asList(new EffectInstance(Effects.LUCK, 200, 0)), "effect.luck_cow", 3381504));
        effectsMap.put((ModEffect) ModEffects.UNLUCK_COW.get(), new EffectConverter(Arrays.asList(new EffectInstance(Effects.UNLUCK, 200, 0)), "effect.unluck_cow", 12624973));
        effectsMap.put((ModEffect) ModEffects.SLOW_FALLING_COW.get(), new EffectConverter(Arrays.asList(new EffectInstance(Effects.SLOW_FALLING, 200, 0)), "effect.slow_falling_cow", 16773073));
    }

    public static EffectConverter getEffect(ModEffect effect) {
        return effectsMap.get(effect);
    }
}

