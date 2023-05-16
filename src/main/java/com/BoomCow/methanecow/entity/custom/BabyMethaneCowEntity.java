package com.BoomCow.methanecow.entity.custom;

import com.BoomCow.methanecow.MethaneCow;
import com.BoomCow.methanecow.entity.ModEntityTypes;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class BabyMethaneCowEntity extends CowEntity {
    public BabyMethaneCowEntity(EntityType<? extends CowEntity> type, World world) {
        super(type, world);
    }

    @Override
    public CowEntity createChild(ServerWorld world, AgeableEntity ageableEntity) {
        return ModEntityTypes.BABY_METHANE_COW.get().create(world);
    }
}
