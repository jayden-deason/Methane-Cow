package com.BoomCow.methanecow.item.custom;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.StringUtils;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;

public class ModFoods extends Item {
    public ModFoods(Properties properties) {
        super(properties);
    }
    public static final Food CHEESE = new Food.Builder().hunger(5).saturation(0.6F).build();

    public static final Food SPEED_CHEESE = new Food.Builder().hunger(5).saturation(0.6F).effect(()
            -> new EffectInstance(Effects.SPEED, 600, 0), 1.0F).build();

    public static final Food SLOWNESS_CHEESE = new Food.Builder().hunger(5).saturation(0.6F).effect(()
            -> new EffectInstance(Effects.SLOWNESS, 600, 0), 1.0F).build();

    public static final Food HASTE_CHEESE = new Food.Builder().hunger(5).saturation(0.6F).effect(()
            -> new EffectInstance(Effects.HASTE, 600, 0), 1.0F).build();

    public static final Food MINING_FATIGUE_CHEESE = new Food.Builder().hunger(5).saturation(0.6F).effect(()
            -> new EffectInstance(Effects.MINING_FATIGUE, 600, 0), 1.0F).build();

    public static final Food STRENGTH_CHEESE = new Food.Builder().hunger(5).saturation(0.6F).effect(()
            -> new EffectInstance(Effects.STRENGTH, 600, 0), 1.0F).build();

    public static final Food INSTANT_HEALTH_CHEESE = new Food.Builder().hunger(5).saturation(0.6F).effect(()
            -> new EffectInstance(Effects.INSTANT_HEALTH, 1, 0), 1.0F).build();

    public static final Food INSTANT_DAMAGE_CHEESE = new Food.Builder().hunger(5).saturation(0.6F).effect(()
            -> new EffectInstance(Effects.INSTANT_DAMAGE, 1, 0), 1.0F).build();

    public static final Food JUMP_BOOST_CHEESE = new Food.Builder().hunger(5).saturation(0.6F).effect(()
            -> new EffectInstance(Effects.JUMP_BOOST, 600, 0), 1.0F).build();

    public static final Food NAUSEA_CHEESE = new Food.Builder().hunger(5).saturation(0.6F).effect(()
            -> new EffectInstance(Effects.NAUSEA, 600, 0), 1.0F).build();

    public static final Food REGENERATION_CHEESE = new Food.Builder().hunger(5).saturation(0.6F).effect(()
            -> new EffectInstance(Effects.REGENERATION, 600, 0), 1.0F).build();

    public static final Food RESISTANCE_CHEESE = new Food.Builder().hunger(5).saturation(0.6F).effect(()
            -> new EffectInstance(Effects.RESISTANCE, 600, 0), 1.0F).build();

    public static final Food FIRE_RESISTANCE_CHEESE = new Food.Builder().hunger(5).saturation(0.6F).effect(()
            -> new EffectInstance(Effects.FIRE_RESISTANCE, 600, 0), 1.0F).build();

    public static final Food WATER_BREATHING_CHEESE = new Food.Builder().hunger(5).saturation(0.6F).effect(()
            -> new EffectInstance(Effects.WATER_BREATHING, 600, 0), 1.0F).build();

    public static final Food INVISIBILITY_CHEESE = new Food.Builder().hunger(5).saturation(0.6F).effect(()
            -> new EffectInstance(Effects.INVISIBILITY, 600, 0), 1.0F).build();

    public static final Food BLINDNESS_CHEESE = new Food.Builder().hunger(5).saturation(0.6F).effect(()
            -> new EffectInstance(Effects.BLINDNESS, 600, 0), 1.0F).build();

    public static final Food NIGHT_VISION_CHEESE = new Food.Builder().hunger(5).saturation(0.6F).effect(()
            -> new EffectInstance(Effects.NIGHT_VISION, 600, 0), 1.0F).build();

    public static final Food HUNGER_CHEESE = new Food.Builder().hunger(5).saturation(0.6F).effect(()
            -> new EffectInstance(Effects.HUNGER, 600, 0), 1.0F).build();

    public static final Food WEAKNESS_CHEESE = new Food.Builder().hunger(5).saturation(0.6F).effect(()
            -> new EffectInstance(Effects.WEAKNESS, 600, 0), 1.0F).build();

    public static final Food POISON_CHEESE = new Food.Builder().hunger(5).saturation(0.6F).effect(()
            -> new EffectInstance(Effects.POISON, 600, 0), 1.0F).build();

    public static final Food WITHER_CHEESE = new Food.Builder().hunger(5).saturation(0.6F).effect(()
            -> new EffectInstance(Effects.WITHER, 600, 0), 1.0F).build();

    public static final Food SATURATION_CHEESE = new Food.Builder().hunger(5).saturation(0.6F).effect(()
            -> new EffectInstance(Effects.SATURATION, 600, 0), 1.0F).build();

    public static final Food GLOWING_CHEESE = new Food.Builder().hunger(5).saturation(0.6F).effect(()
            -> new EffectInstance(Effects.GLOWING, 600, 0), 1.0F).build();

    public static final Food LEVITATION_CHEESE = new Food.Builder().hunger(5).saturation(0.6F).effect(()
            -> new EffectInstance(Effects.LEVITATION, 600, 0), 1.0F).build();

    public static final Food LUCK_CHEESE = new Food.Builder().hunger(5).saturation(0.6F).effect(()
            -> new EffectInstance(Effects.LUCK, 600, 0), 1.0F).build();

    public static final Food UNLUCK_CHEESE = new Food.Builder().hunger(5).saturation(0.6F).effect(()
            -> new EffectInstance(Effects.UNLUCK, 600, 0), 1.0F).build();

    public static final Food SLOW_FALLING_CHEESE = new Food.Builder().hunger(5).saturation(0.6F).effect(()
            -> new EffectInstance(Effects.SLOW_FALLING, 600, 0), 1.0F).build();

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        List<Pair<EffectInstance, Float>> effectsWithChance = stack.getItem().getFood().getEffects();

        List<Pair<Attribute, AttributeModifier>> modifiersList = Lists.newArrayList();
        TranslationTextComponent translationTextComponent;
        Effect effect;

        for (Pair<EffectInstance, Float> pair : effectsWithChance) {
            EffectInstance effectInstance = pair.getFirst();
            translationTextComponent = new TranslationTextComponent(effectInstance.getEffectName());
            effect = effectInstance.getPotion();
            Map<net.minecraft.entity.ai.attributes.Attribute, AttributeModifier> map = effect.getAttributeModifierMap();
            if (!map.isEmpty()) {
                for (Map.Entry<Attribute, AttributeModifier> entityAttributeEntityAttributeModifierEntry : map.entrySet()) {
                    AttributeModifier entityAttributeModifier = entityAttributeEntityAttributeModifierEntry.getValue();
                    AttributeModifier entityAttributeModifier2 = new AttributeModifier(entityAttributeModifier.getName(), effect.getAttributeModifierAmount(effectInstance.getAmplifier(), entityAttributeModifier), entityAttributeModifier.getOperation());
                    modifiersList.add(new Pair<>(entityAttributeEntityAttributeModifierEntry.getKey(), entityAttributeModifier2));
                }
            }

            if (effectInstance.getAmplifier() > 0) {
                translationTextComponent = new TranslationTextComponent("potion.withAmplifier", translationTextComponent, new TranslationTextComponent("potion.potency." + effectInstance.getAmplifier()));
            }
            if (effectInstance.getDuration() > 20) {
                translationTextComponent = new TranslationTextComponent("potion.withDuration", translationTextComponent, StringUtils.ticksToElapsedTime(effectInstance.getDuration()));
            }
            tooltip.add(translationTextComponent.mergeStyle(TextFormatting.BLUE));
        }
        if (!modifiersList.isEmpty()) {
            tooltip.add(StringTextComponent.EMPTY);

            tooltip.add(new TranslationTextComponent("When Eaten:").mergeStyle(TextFormatting.DARK_PURPLE));
            for (Pair<Attribute, AttributeModifier> entityAttributeEntityAttributeModifierPair : modifiersList) {
                AttributeModifier entityAttributeModifier3 = entityAttributeEntityAttributeModifierPair.getSecond();
                double d = entityAttributeModifier3.getAmount();
                double e;
                if (entityAttributeModifier3.getOperation() != AttributeModifier.Operation.MULTIPLY_BASE && entityAttributeModifier3.getOperation() != AttributeModifier.Operation.MULTIPLY_TOTAL) {
                    e = entityAttributeModifier3.getAmount();
                } else {
                    e = entityAttributeModifier3.getAmount() * 100.0D;
                }

                if (d > 0.0D) {
                    tooltip.add((new TranslationTextComponent("attribute.modifier.plus." + entityAttributeModifier3.getOperation().getId(), ItemStack.DECIMALFORMAT.format(e), new TranslationTextComponent((entityAttributeEntityAttributeModifierPair.getFirst()).getAttributeName()))).mergeStyle(TextFormatting.BLUE));
                } else if (d < 0.0D) {
                    e *= -1.0D;
                    tooltip.add((new TranslationTextComponent("attribute.modifier.take." + entityAttributeModifier3.getOperation().getId(), ItemStack.DECIMALFORMAT.format(e), new TranslationTextComponent((entityAttributeEntityAttributeModifierPair.getFirst()).getAttributeName()))).mergeStyle(TextFormatting.RED));
                }
            }

        }
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }
}
