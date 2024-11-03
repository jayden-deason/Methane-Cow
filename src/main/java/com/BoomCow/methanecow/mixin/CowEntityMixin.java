package com.BoomCow.methanecow.mixin;

import com.BoomCow.methanecow.util.ModSoundEvents;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.AreaEffectCloudEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(CowEntity.class)
public abstract class CowEntityMixin extends AnimalEntity {
    private int lastActiveTime;
    private int timeSinceIgnited;
    private boolean ignited = false;
    private boolean charged = false;
    private int cowState = -1;
    private int fuseTime = 30;
    private int explosionRadius = 3;

    public CowEntityMixin(EntityType<? extends AnimalEntity> type, World world) {
        super(type, world);
    }

    public void playAmbientSound() {
        int i = (int) (Math.random() * 100) + 1;
        int fartChance = 1;
        if(i < (100 - fartChance)){
            if (this.isChild()) {
                this.playSound(SoundEvents.ENTITY_COW_AMBIENT, 1.0F, 1.2F);
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
                this.playSound(ModSoundEvents.FART.get(), 5.0F, 0.2F);
            }
            int j = (int) (Math.random() * 1000) + 1;
            if(j <= 1)
                this.ignite();
        }
    }

    @Inject(method = "getEntityInteractionResult", at = @At("HEAD"), cancellable = true)
    public void getEntityInteractionResult(PlayerEntity playerIn, Hand hand, CallbackInfoReturnable<ActionResultType> cir) {
        ItemStack itemStack = playerIn.getHeldItem(hand);
        if (itemStack.getItem() == Items.FLINT_AND_STEEL) {
            this.world.playSound(playerIn, this.getPosX(), this.getPosY(), this.getPosZ(), SoundEvents.ITEM_FLINTANDSTEEL_USE, this.getSoundCategory(), 1.0F, this.rand.nextFloat() * 0.4F + 0.8F);
            this.ignite();
            itemStack.damageItem(1, playerIn, (player) -> {
                player.sendBreakAnimation(hand);
            });
            cir.setReturnValue(ActionResultType.func_233537_a_(this.world.isRemote));
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
                this.playSound(ModSoundEvents.BOOM_FART.get(), 10.0F, 1.0F);

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

    private void ignite() {
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
        areaeffectcloudentity.setRadius(5F);
        areaeffectcloudentity.setRadiusOnUse(-0.5F);
        areaeffectcloudentity.setWaitTime(10);
        areaeffectcloudentity.setDuration(areaeffectcloudentity.getDuration() / 2);
        areaeffectcloudentity.setRadiusPerTick(-areaeffectcloudentity.getRadius() / (float)areaeffectcloudentity.getDuration());
        areaeffectcloudentity.addEffect(new EffectInstance(collection));
        this.getEntityWorld().addEntity(areaeffectcloudentity);
    }

    public void onDeath(DamageSource source){
        if(!this.world.isRemote)
            if(source.isExplosion()){
                this.setHealth(1.0F);
                this.ignite();
            }
        super.onDeath(source);
    }

    public boolean addPotionEffect(EffectInstance effectInstanceIn) {
        if (effectInstanceIn.getPotion() == Effects.POISON) {
            return false;
        }
        return super.addPotionEffect(effectInstanceIn);
    }
}
