package com.BoomCow.methanecow.events;

import com.BoomCow.methanecow.MethaneCow;
import com.BoomCow.methanecow.effect.EffectConverter;
import com.BoomCow.methanecow.effect.EffectMapping;
import com.BoomCow.methanecow.effect.ModEffect;
import net.minecraft.entity.AreaEffectCloudEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.PotionUtils;
import net.minecraft.util.*;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Collection;
import java.util.List;

@Mod.EventBusSubscriber(modid = MethaneCow.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ForgeEventBusEvents {
    @SubscribeEvent
    public static void onRightClickBottle(PlayerInteractEvent.RightClickItem event) {
        World worldIn = event.getWorld();
        PlayerEntity playerIn = event.getPlayer();
        Hand handIn = event.getHand();

        if (playerIn.world.isRemote) return;

        ItemStack itemstack = playerIn.getHeldItem(handIn);

        if (itemstack.getItem() != Items.GLASS_BOTTLE) return;

        List<AreaEffectCloudEntity> list = worldIn.getEntitiesWithinAABB(AreaEffectCloudEntity.class, playerIn.getBoundingBox().grow(2.0D), (cloud) -> {
            return cloud != null && cloud.isAlive();
        });


        if (!list.isEmpty()) {
            AreaEffectCloudEntity areaeffectcloudentity = list.get(0);
            Collection<EffectInstance> collection = playerIn.getActivePotionEffects();

            for (EffectInstance effectinstance : collection) {
                if (effectinstance.getPotion() instanceof ModEffect) {
                    areaeffectcloudentity.setRadius(areaeffectcloudentity.getRadius() - 2F);
                    worldIn.playSound((PlayerEntity)null, playerIn.getPosX(), playerIn.getPosY(), playerIn.getPosZ(), SoundEvents.ITEM_BOTTLE_FILL_DRAGONBREATH, SoundCategory.NEUTRAL, 1.0F, 1.0F);

                    ItemStack potion = new ItemStack(Items.POTION);

                    EffectConverter effectConverter = EffectMapping.getEffect((ModEffect) effectinstance.getPotion());
                    PotionUtils.appendEffects(potion, effectConverter.getEffects());

                    CompoundNBT tag = potion.getOrCreateTag();
                    tag.putInt("CustomPotionColor", effectConverter.getColor());
                    potion.setTag(tag);
                    potion.setDisplayName(effectConverter.getName());

                    if (!playerIn.isCreative()) {
                        itemstack.shrink(1);
                        if (itemstack.isEmpty()) {
                            playerIn.setHeldItem(handIn, potion);
                        } else if (!playerIn.inventory.addItemStackToInventory(potion)) {
                            playerIn.dropItem(potion, false);
                        }
                        event.setCancellationResult(ActionResultType.SUCCESS);
                        event.setCanceled(true);
                    } else {
                        playerIn.inventory.addItemStackToInventory(potion);
                    }
                }
                break;
            }
        }
    }
}
