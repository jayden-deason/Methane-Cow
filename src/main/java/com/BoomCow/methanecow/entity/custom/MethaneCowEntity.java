package com.BoomCow.methanecow.entity.custom;

import com.BoomCow.methanecow.entity.ModEntityTypes;
import com.BoomCow.methanecow.util.ModSoundEvents;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.AreaEffectCloudEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.*;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;

public class MethaneCowEntity extends CowEntity {
    private int lastActiveTime;
    private int timeSinceIgnited;
    private boolean ignited = false;
    private boolean charged = false;
    private int cowState = -1;
    private int fuseTime = 30;
    private int explosionRadius = 3;

    public MethaneCowEntity(EntityType<? extends CowEntity> type, World world) {
        super(type, world);
    }


    @Override
    public void playAmbientSound() {
        int i = (int) (Math.random() * 100) + 1;
        if(i<80) {
            if (this.isChild()) {
                this.playSound(ModSoundEvents.FART.get(), 1.0F, 2.0F);
            }
            else{
                this.playSound(SoundEvents.ENTITY_COW_AMBIENT, 0.8F, 1.0F);
            }

        }
        else {
            if(this.isChild()){
                this.playSound(ModSoundEvents.FART.get(), 1.0F, 2.0F);
            }
            else{
                this.spawnLingeringCloud();
                this.playSound(ModSoundEvents.FART.get(), 10.0F, 0.2F);
            }
            int j = (int) (Math.random() * 100) + 1;
            if(j<=1)
                this.ignite();
        }
    }

    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        super.playSound(ModSoundEvents.FART.get(), 0.2F, 1.0F);
        return null;
    }

    @Override
    public ActionResultType getEntityInteractionResult(PlayerEntity playerIn, Hand hand) {
        ItemStack itemstack = playerIn.getHeldItem(hand);
        if (itemstack.getItem() == Items.BUCKET && !this.isChild()) {
            playerIn.playSound(SoundEvents.ENTITY_COW_MILK, 1.0F, 1.0F);
            ItemStack itemstack1 = DrinkHelper.fill(itemstack, playerIn, Items.MILK_BUCKET.getDefaultInstance());
            playerIn.setHeldItem(hand, itemstack1);
            return ActionResultType.func_233537_a_(this.world.isRemote);
        } else if (itemstack.getItem() == Items.FLINT_AND_STEEL) {
            this.world.playSound(playerIn, this.getPosX(), this.getPosY(), this.getPosZ(), SoundEvents.ITEM_FLINTANDSTEEL_USE, this.getSoundCategory(), 1.0F, this.rand.nextFloat() * 0.4F + 0.8F);
            if (!this.world.isRemote) {
                this.ignite();
                itemstack.damageItem(1, playerIn, (player) -> {
                    player.sendBreakAnimation(hand);
                });
            }

            return ActionResultType.func_233537_a_(this.world.isRemote);
        } else {
            return super.getEntityInteractionResult(playerIn, hand);
        }
    }



    public void tick() {
        if (this.isAlive()) {
            this.lastActiveTime = this.timeSinceIgnited;
            if (this.ignited) {
                this.cowState = 1;
            }

            int i = this.cowState;
            if (i > 0 && this.timeSinceIgnited == 0) {
                this.playSound(SoundEvents.ENTITY_CREEPER_PRIMED, 1.0F, 0.5F);
            }

            this.timeSinceIgnited += i;
            if (this.timeSinceIgnited < 0) {
                this.timeSinceIgnited = 0;
            }

            if (this.timeSinceIgnited >= this.fuseTime) {
                this.timeSinceIgnited = this.fuseTime;
                this.explode();
            }
        }

        super.tick();
    }

    public void ignite() {
        this.ignited = true;
    }

    private void explode() {
        if (!this.world.isRemote) {

            if(this.isChild()){
                explosionRadius = 1;
            }

            Explosion.Mode explosion$mode = net.minecraftforge.event.ForgeEventFactory.getMobGriefingEvent(this.world, this) ? Explosion.Mode.DESTROY : Explosion.Mode.NONE;
            float f = this.charged ? 2.0F : 1.0F;
            this.dead = true;
            this.world.createExplosion(this, this.getPosX(), this.getPosY(), this.getPosZ(), (float)this.explosionRadius * f, explosion$mode);
            this.remove();
            this.spawnLingeringCloud();
        }

    }

    private void spawnLingeringCloud() {
        EffectInstance collection = new EffectInstance(Effects.POISON, 100, 0, false, false);
            AreaEffectCloudEntity areaeffectcloudentity = new AreaEffectCloudEntity(this.world, this.getPosX(), this.getPosY(), this.getPosZ());
            areaeffectcloudentity.setRadius(10F);
            areaeffectcloudentity.setRadiusOnUse(-0.5F);
            areaeffectcloudentity.setWaitTime(10);
            areaeffectcloudentity.setDuration(areaeffectcloudentity.getDuration() / 2);
            areaeffectcloudentity.setRadiusPerTick(-areaeffectcloudentity.getRadius() / (float)areaeffectcloudentity.getDuration());
            areaeffectcloudentity.addEffect(new EffectInstance(collection));
            this.getEntityWorld().addEntity(areaeffectcloudentity);
        }


    @Override
    public MethaneCowEntity createChild(ServerWorld world, AgeableEntity mate) {
        return ModEntityTypes.METHANE_COW.get().create(world);
    }

}
