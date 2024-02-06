package com.BoomCow.methanecow.effect;

import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.potion.EffectType;

public class ModAttackDamageEffect extends ModEffect {
    protected final double bonusPerLevel;
    public ModAttackDamageEffect(EffectType typeIn, int liquidColorIn, double bonusPerLevel) {
        super(typeIn, liquidColorIn);
        this.bonusPerLevel = bonusPerLevel;
    }

    public double getAttributeModifierAmount(int amplifier, AttributeModifier modifier) {
        return this.bonusPerLevel * (double)(amplifier + 1);
    }
}
