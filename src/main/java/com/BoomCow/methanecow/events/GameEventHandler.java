package com.BoomCow.methanecow.events;

import com.BoomCow.methanecow.MethaneCow;
import com.BoomCow.methanecow.entity.custom.MethaneCowEntity;
import net.minecraft.entity.AreaEffectCloudEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.PotionUtils;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Mod.EventBusSubscriber(modid = MethaneCow.MOD_ID)
public class GameEventHandler {

    @SubscribeEvent
    public static void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
        World world = event.getWorld();
        PlayerEntity player = event.getPlayer();
        Hand hand = event.getHand();
        ItemStack heldItem = player.getHeldItem(hand);

        // Check if the player is holding a glass bottle
        if (heldItem.getItem() == Items.GLASS_BOTTLE) {
//            List<AreaEffectCloudEntity> list = world.getEntitiesWithinAABB(AreaEffectCloudEntity.class, player.getBoundingBox().grow(2.0D), (cloud) -> {
//                // Change this condition to match your lingering cloud entity
//                return cloud != null && cloud.isAlive();
//            });
            List<AreaEffectCloudEntity> list = world.getEntitiesWithinAABB(AreaEffectCloudEntity.class, player.getBoundingBox().grow(2.0D), (cloud) -> {
                return cloud != null && cloud.isAlive() && cloud.getOwner() instanceof MethaneCowEntity;
            });

            if (!list.isEmpty()) {
                AreaEffectCloudEntity areaEffectCloudEntity = list.get(0);
                MethaneCowEntity cow = (MethaneCowEntity) areaEffectCloudEntity.getOwner();
                Collection<EffectInstance> effects = cow.getActivePotionEffects();
                if (!effects.isEmpty()) {
                    // Assume the first effect is the one we want, adjust as necessary
                    EffectInstance effectInstance = effects.iterator().next();

                    // Create a new potion item stack with the matching effect
                    ItemStack potionStack = new ItemStack(Items.POTION);
                    PotionUtils.appendEffects(potionStack, Collections.singleton(effectInstance));

                    // Reduce the size of the lingering cloud
                    areaEffectCloudEntity.setRadius(areaEffectCloudEntity.getRadius() - 0.5F);

                    // Replace the glass bottle with the new potion item stack
                    heldItem.shrink(1);  // Decrease the glass bottle count by 1
                    if (!player.addItemStackToInventory(potionStack)) {  // Try to add the potion to the player's inventory
                        // If the player's inventory is full, drop the potion into the world
                        player.dropItem(potionStack, false);
                    }

                    // You might want to play a sound or spawn particles for feedback
                    world.playSound(null, player.getPosX(), player.getPosY(), player.getPosZ(), SoundEvents.ITEM_BOTTLE_FILL, SoundCategory.NEUTRAL, 1.0F, 1.0F);

                    // Cancel the event so the vanilla GlassBottleItem logic does not run
//                event.setCanceled(true);
//                event.setCancellationResult(ActionResult.resultSuccess(heldItem));
                }
            }
        }
    }
}