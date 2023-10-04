package com.BoomCow.methanecow.events;

import com.BoomCow.methanecow.MethaneCow;
import com.BoomCow.methanecow.entity.custom.BabyMethaneCowEntity;
import com.BoomCow.methanecow.entity.custom.MethaneCowEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;

@Mod.EventBusSubscriber(modid = MethaneCow.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ForgeEventBusEvents {
    public static ArrayList<CowEntity> cowList = new ArrayList<>();
    private static boolean worldLoaded = false;
//    @SubscribeEvent
//    public static void onWorldLoad(WorldEvent.Load event) {
//        World world = (World) event.getWorld();
//
//        world.getServer().enqueue(new TickDelayedTask(1, new CowReplacement(world)));
//        for (CowEntity entity : cowList) {
//            if (!entity.isChild()) {
//                if (!world.isRemote) {
//                    MethaneCowEntity methaneCow = new MethaneCowEntity(EntityType.COW, world);
//
//                    methaneCow.setLocationAndAngles(entity.getPosX(), entity.getPosY(), entity.getPosZ(), 0, 0);
//                    world.addEntity(methaneCow);
//                    entity.remove();
//                }
//            } else {
//                if (!world.isRemote) {
//                    BabyMethaneCowEntity babyMethaneCow = new BabyMethaneCowEntity(EntityType.COW, world);
//
//                    babyMethaneCow.setLocationAndAngles(entity.getPosX(), entity.getPosY(), entity.getPosZ(), 0, 0);
//                    babyMethaneCow.copyDataFromOld(entity);
//                    babyMethaneCow.setGrowingAge(entity.getGrowingAge());
//                    world.addEntity(babyMethaneCow);
//                    entity.remove();
//                }
//            }
//        }
//    }
//    @SubscribeEvent
//    public static void onEntityJoinWorld(EntityJoinWorldEvent event) {



//        if (event.getEntity() instanceof CowEntity && !(event.getEntity() instanceof MethaneCowEntity) &&
//            !(event.getEntity() instanceof BabyMethaneCowEntity)) {
//            CowEntity entity = (CowEntity) event.getEntity();
//            World world = event.getWorld();
//            //if (worldLoaded) {
//                if (!entity.isChild()) {
//                    if (!event.getWorld().isRemote) {
//                        MethaneCowEntity methaneCow = new MethaneCowEntity(EntityType.COW, world);
//
//                        methaneCow.setLocationAndAngles(entity.getPosX(), entity.getPosY(), entity.getPosZ(), 0, 0);
//
//                        world.addEntity(methaneCow);
//                        //event.setCanceled(true);
//                        entity.remove();
//                    }
//                } //else {
////                    if (!event.getWorld().isRemote) {
////                        BabyMethaneCowEntity babyMethaneCow = new BabyMethaneCowEntity(EntityType.COW, world);
////
////                        babyMethaneCow.setLocationAndAngles(entity.getPosX(), entity.getPosY(), entity.getPosZ(), 0, 0);
////                        babyMethaneCow.copyDataFromOld(entity);
////                        babyMethaneCow.setGrowingAge(entity.getGrowingAge());
////                        world.addEntity(babyMethaneCow);
////                        event.setCanceled(true);
////                    }
////                }
////            } else {
////                cowList.add(entity);
////            }
//        }
//    }

    @SubscribeEvent
    public static void onLivingUpdate(LivingEvent.LivingUpdateEvent event) {
        if (event.getEntity() instanceof CowEntity && !(event.getEntity() instanceof MethaneCowEntity) &&
                !(event.getEntity() instanceof BabyMethaneCowEntity)) {
            CowEntity entity = (CowEntity) event.getEntity();

            if (entity.isChild()) {
                if (entity.getGrowingAge() >= 0) {
                    World world = entity.getEntityWorld();

                    if (!world.isRemote) {
                        MethaneCowEntity methaneCow = new MethaneCowEntity(EntityType.COW, world);

                        methaneCow.copyDataFromOld(entity);
                        methaneCow.setLocationAndAngles(entity.getPosX(), entity.getPosY(), entity.getPosZ(), 0, 0);
                        world.addEntity(methaneCow);
                        entity.remove();
                    }
                }
            }
        }
    }

    public static ArrayList<CowEntity> getCowList() {
        return cowList;
    }

    public static void setLoaded(boolean loaded) {
        worldLoaded = loaded;
    }
}
