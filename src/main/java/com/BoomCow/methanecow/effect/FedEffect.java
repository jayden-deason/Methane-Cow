package com.BoomCow.methanecow.effect;

import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;

public class FedEffect extends Effect {

    public FedEffect(EffectType type, int color) {
        super(type, color);
    }

    //@Override
    public void applyEffectTick(net.minecraft.entity.LivingEntity entity, int amplifier) {
        super.performEffect(entity, amplifier);

    }

    //@Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }

}
