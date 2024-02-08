package com.BoomCow.methanecow.effect;

import net.minecraft.potion.EffectInstance;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import java.util.List;

public class EffectConverter {
    private List<EffectInstance> effects;
    private ITextComponent name;
    private int Color;

    public EffectConverter(List<EffectInstance> effects, String name, int Color) {
        this.effects = effects;
        this.name = new TranslationTextComponent(name);
        this.Color = Color;
    }

    public List<EffectInstance> getEffects() {
        return effects;
    }

    public ITextComponent getName() {
        return name;
    }

    public int getColor() {
        return Color;
    }
}
