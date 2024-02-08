package com.BoomCow.methanecow.effect;

import com.BoomCow.methanecow.MethaneCow;
import net.minecraft.potion.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEffects extends Effects {

    public static final DeferredRegister<Effect> EFFECTS =
            DeferredRegister.create(ForgeRegistries.POTIONS, MethaneCow.MOD_ID);

    public static void register(IEventBus eventBus) {
        EFFECTS.register(eventBus);
    }

    public static final RegistryObject<Effect> SPEED_COW = EFFECTS.register("speed_cow", () -> new ModEffect(EffectType.BENEFICIAL, 8171462)/*.addAttributesModifier(Attributes.MOVEMENT_SPEED, "91AEAA56-376B-4498-935B-2F7F68070635", (double)0.2F, AttributeModifier.Operation.MULTIPLY_TOTAL)*/);
    public static final RegistryObject<Effect> SLOWNESS_COW = EFFECTS.register("slowness_cow", () -> new ModEffect(EffectType.HARMFUL, 5926017)/*.addAttributesModifier(Attributes.MOVEMENT_SPEED, "7107DE5E-7CE8-4030-940E-514C1F160890", (double)-0.15F, AttributeModifier.Operation.MULTIPLY_TOTAL)*/);
    public static final RegistryObject<Effect> HASTE_COW = EFFECTS.register("haste_cow", () -> new ModEffect(EffectType.BENEFICIAL, 14270531)/*.addAttributesModifier(Attributes.ATTACK_SPEED, "AF8B6E3F-3328-4C0A-AA36-5BA2BB9DBEF3", (double)0.1F, AttributeModifier.Operation.MULTIPLY_TOTAL)*/);
    public static final RegistryObject<Effect> MINING_FATIGUE_COW = EFFECTS.register("mining_fatigue_cow", () -> new ModEffect(EffectType.HARMFUL, 4866583)/*.addAttributesModifier(Attributes.ATTACK_SPEED, "55FCED67-E92A-486E-9800-B47F202C4386", (double)-0.1F, AttributeModifier.Operation.MULTIPLY_TOTAL)*/);
    public static final RegistryObject<Effect> STRENGTH_COW = EFFECTS.register("strength_cow", () -> new ModAttackDamageEffect(EffectType.BENEFICIAL, 9643043, 3.0D)/*.addAttributesModifier(Attributes.ATTACK_DAMAGE, "648D7064-6A60-4F59-8ABE-C2C23A6DD7A9", 0.0D, AttributeModifier.Operation.ADDITION)*/);
    public static final RegistryObject<Effect> INSTANT_HEALTH_COW = EFFECTS.register("instant_health_cow", () -> new ModInstantEffect(EffectType.BENEFICIAL, 16262179));
    public static final RegistryObject<Effect> INSTANT_DAMAGE_COW = EFFECTS.register("instant_damage_cow", () -> new ModInstantEffect(EffectType.HARMFUL, 4393481));
    public static final RegistryObject<Effect> JUMP_BOOST_COW = EFFECTS.register("jump_boost_cow", () -> new ModEffect(EffectType.BENEFICIAL, 2293580));
    public static final RegistryObject<Effect> NAUSEA_COW = EFFECTS.register("nausea_cow", () -> new ModEffect(EffectType.HARMFUL, 5578058));
    public static final RegistryObject<Effect> REGENERATION_COW = EFFECTS.register("regeneration_cow", () -> new ModEffect(EffectType.BENEFICIAL, 13458603));
    public static final RegistryObject<Effect> RESISTANCE_COW = EFFECTS.register("resistance_cow", () -> new ModEffect(EffectType.BENEFICIAL, 10044730));
    public static final RegistryObject<Effect> FIRE_RESISTANCE_COW = EFFECTS.register("fire_resistance_cow", () -> new ModEffect(EffectType.BENEFICIAL, 14981690));
    public static final RegistryObject<Effect> WATER_BREATHING_COW = EFFECTS.register("water_breathing_cow", () -> new ModEffect(EffectType.BENEFICIAL, 3035801));
    public static final RegistryObject<Effect> INVISIBILITY_COW = EFFECTS.register("invisibility_cow", () -> new ModEffect(EffectType.BENEFICIAL, 8356754));
    public static final RegistryObject<Effect> BLINDNESS_COW = EFFECTS.register("blindness_cow", () -> new ModEffect(EffectType.HARMFUL, 2039587));
    public static final RegistryObject<Effect> NIGHT_VISION_COW = EFFECTS.register("night_vision_cow", () -> new ModEffect(EffectType.BENEFICIAL, 2039713));
    public static final RegistryObject<Effect> HUNGER_COW = EFFECTS.register("hunger_cow", () -> new ModEffect(EffectType.HARMFUL, 5797459));
    public static final RegistryObject<Effect> WEAKNESS_COW = EFFECTS.register("weakness_cow", () -> new ModAttackDamageEffect(EffectType.HARMFUL, 4738376, -4.0D)/*.addAttributesModifier(Attributes.ATTACK_DAMAGE, "22653B89-116E-49DC-9B6B-9971489B5BE5", 0.0D, AttributeModifier.Operation.ADDITION)*/);
    public static final RegistryObject<Effect> POISON_COW = EFFECTS.register("poison_cow", () -> new ModEffect(EffectType.HARMFUL, 5149489));
    public static final RegistryObject<Effect> WITHER_COW = EFFECTS.register("wither_cow", () -> new ModEffect(EffectType.HARMFUL, 3484199));
    public static final RegistryObject<Effect> SATURATION_COW = EFFECTS.register("saturation_cow", () -> new ModInstantEffect(EffectType.BENEFICIAL, 16262179));
    public static final RegistryObject<Effect> GLOWING_COW = EFFECTS.register("glowing_cow", () -> new ModEffect(EffectType.NEUTRAL, 9740385));
    public static final RegistryObject<Effect> LEVITATION_COW = EFFECTS.register("levitation_cow", () -> new ModEffect(EffectType.HARMFUL, 13565951));
    public static final RegistryObject<Effect> LUCK_COW = EFFECTS.register("luck_cow", () -> new ModEffect(EffectType.BENEFICIAL, 3381504)/*.addAttributesModifier(Attributes.LUCK, "03C3C89D-7037-4B42-869F-B146BCB64D2E", 1.0D, AttributeModifier.Operation.ADDITION)*/);
    public static final RegistryObject<Effect> UNLUCK_COW = EFFECTS.register("unluck_cow", () -> new ModEffect(EffectType.HARMFUL, 12624973)/*.addAttributesModifier(Attributes.LUCK, "CC5AF142-2BD2-4215-B636-2605AED11727", -1.0D, AttributeModifier.Operation.ADDITION)*/);
    public static final RegistryObject<Effect> SLOW_FALLING_COW = EFFECTS.register("slow_falling_cow", () -> new ModEffect(EffectType.BENEFICIAL, 16773073));

}
