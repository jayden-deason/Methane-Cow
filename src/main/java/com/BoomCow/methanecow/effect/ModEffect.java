package com.BoomCow.methanecow.effect;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraft.util.DamageSource;

import javax.annotation.Nullable;

public class ModEffect extends Effect {
    public ModEffect(EffectType typeIn, int liquidColorIn) {
        super(typeIn, liquidColorIn);
    }

    /*@Override
    public void performEffect(LivingEntity entityLivingBaseIn, int amplifier) {
        if (this == ModEffects.REGENERATION_COW.get()) {
            if (entityLivingBaseIn.getHealth() < entityLivingBaseIn.getMaxHealth()) {
                entityLivingBaseIn.heal(1.0F);
            }
        } else if (this == ModEffects.POISON_COW.get()) {
            if (entityLivingBaseIn.getHealth() > 1.0F) {
                entityLivingBaseIn.attackEntityFrom(DamageSource.MAGIC, 1.0F);
            }
        } else if (this == ModEffects.WITHER_COW.get()) {
            entityLivingBaseIn.attackEntityFrom(DamageSource.WITHER, 1.0F);
        } else if (this == ModEffects.HUNGER_COW.get() && entityLivingBaseIn instanceof PlayerEntity) {
            ((PlayerEntity)entityLivingBaseIn).addExhaustion(0.005F * (float)(amplifier + 1));
        } else if (this == ModEffects.SATURATION_COW.get() && entityLivingBaseIn instanceof PlayerEntity) {
            if (!entityLivingBaseIn.world.isRemote) {
                ((PlayerEntity)entityLivingBaseIn).getFoodStats().addStats(amplifier + 1, 1.0F);
            }
        } else if ((this != ModEffects.INSTANT_HEALTH_COW.get() || entityLivingBaseIn.isEntityUndead()) && (this != ModEffects.INSTANT_DAMAGE_COW.get() || !entityLivingBaseIn.isEntityUndead())) {
            if (this == ModEffects.INSTANT_DAMAGE_COW.get() && !entityLivingBaseIn.isEntityUndead() || this == ModEffects.INSTANT_HEALTH_COW.get() && entityLivingBaseIn.isEntityUndead()) {
                entityLivingBaseIn.attackEntityFrom(DamageSource.MAGIC, (float)(6 << amplifier));
            }
        } else {
            entityLivingBaseIn.heal((float)Math.max(4 << amplifier, 0));
        }
    }

    @Override
    public void affectEntity(@Nullable Entity source, @Nullable Entity indirectSource, LivingEntity entityLivingBaseIn, int amplifier, double health) {
        if ((this != ModEffects.INSTANT_HEALTH_COW.get() || entityLivingBaseIn.isEntityUndead()) && (this != ModEffects.INSTANT_DAMAGE_COW.get() || !entityLivingBaseIn.isEntityUndead())) {
            if (this == ModEffects.INSTANT_DAMAGE_COW.get() && !entityLivingBaseIn.isEntityUndead() || this == ModEffects.INSTANT_HEALTH_COW.get() && entityLivingBaseIn.isEntityUndead()) {
                int j = (int)(health * (double)(6 << amplifier) + 0.5D);
                if (source == null) {
                    entityLivingBaseIn.attackEntityFrom(DamageSource.MAGIC, (float)j);
                } else {
                    entityLivingBaseIn.attackEntityFrom(DamageSource.causeIndirectMagicDamage(source, indirectSource), (float)j);
                }
            } else {
                this.performEffect(entityLivingBaseIn, amplifier);
            }
        } else {
            int i = (int)(health * (double)(4 << amplifier) + 0.5D);
            entityLivingBaseIn.heal((float)i);
        }
    }

    @Override
    public boolean isReady(int duration, int amplifier) {
        if (this == ModEffects.REGENERATION_COW.get()) {
            int i = 50 >> amplifier;
            if (i > 0) {
                return duration % i == 0;
            } else {
                return true;
            }
        } else if (this == ModEffects.POISON_COW.get()) {
            int j = 25 >> amplifier;
            if (j > 0) {
                return duration % j == 0;
            } else {
                return true;
            }
        } else if (this == ModEffects.WITHER_COW.get()) {
            int k = 40 >> amplifier;
            if (k > 0) {
                return duration % k == 0;
            } else {
                return true;
            }
        } else {
            return this == ModEffects.HUNGER_COW.get();
        }
    }*/
}
