package com.BoomCow.methanecow.events;

import com.BoomCow.methanecow.MethaneCow;
import com.BoomCow.methanecow.entity.ModEntityTypes;
import com.BoomCow.methanecow.entity.custom.MethaneCowEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraftforge.common.world.MobSpawnInfoBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = MethaneCow.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModEntitySpawns {

    @SubscribeEvent
    public static void onBiomeLoad(BiomeLoadingEvent event) {
        EntityType<CowEntity> entityToFind = EntityType.COW;
        EntityType<MethaneCowEntity> entityToAdd = ModEntityTypes.METHANE_COW.get();

        MobSpawnInfoBuilder spawnInfo = event.getSpawns();
        List<MobSpawnInfo.Spawners> spawnersForFind = spawnInfo.getSpawner(entityToFind.getClassification());
        MobSpawnInfo.Spawners spawnerToAdd = null;
        MobSpawnInfo.Spawners spawnerToRemove = null;
        for (MobSpawnInfo.Spawners spawner : spawnersForFind) {
            if (spawner.type == entityToFind) {
                spawnerToAdd = new MobSpawnInfo.Spawners(entityToAdd, spawner.itemWeight, spawner.minCount, spawner.maxCount);
                spawnerToRemove = spawner;
            }
        }
        if (spawnerToAdd != null) {
            List<MobSpawnInfo.Spawners> spawnersForAdd = spawnInfo.getSpawner(entityToAdd.getClassification());
            spawnersForAdd.add(spawnerToAdd);
        }
        if (spawnerToRemove != null) {
            List<MobSpawnInfo.Spawners> spawnersForRemove = spawnInfo.getSpawner(entityToFind.getClassification());
            spawnersForRemove.remove(spawnerToRemove);
        }
    }

}
