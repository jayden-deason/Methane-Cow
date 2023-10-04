//package com.BoomCow.methanecow.entity.custom;
//
//import com.BoomCow.methanecow.events.ForgeEventBusEvents;
//import net.minecraft.entity.Entity;
//import net.minecraft.entity.EntityType;
//import net.minecraft.entity.passive.CowEntity;
//import net.minecraft.world.World;
//
//public class CowReplacement implements Runnable {
//    private final World world;
//
//    public CowReplacement(World world) {
//        this.world = world;
//    }
//
//    public void run() {
//        for (CowEntity entity : ForgeEventBusEvents.getCowList()) {
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
//        ForgeEventBusEvents.setLoaded(true);
//    }
//}
