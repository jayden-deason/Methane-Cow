package com.BoomCow.methanecow.effect;

import net.minecraft.potion.EffectType;

public class ModInstantEffect extends ModEffect {
    public ModInstantEffect(EffectType typeIn, int liquidColorIn) {
        super(typeIn, liquidColorIn);
    }

    /**
     * Returns true if the potion has an instant effect instead of a continuous one (eg Harming)
     */
    public boolean isInstant() {
        return true;
    }

    /**
     * checks if Potion effect is ready to be applied this tick.
     */
    public boolean isReady(int duration, int amplifier) {
        return duration >= 1;
    }
}
