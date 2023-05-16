package com.BoomCow.methanecow.entity;

import com.BoomCow.methanecow.MethaneCow;
import com.BoomCow.methanecow.entity.custom.BabyMethaneCowEntity;
import com.BoomCow.methanecow.entity.custom.MethaneCowEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, MethaneCow.MOD_ID);

    public static final RegistryObject<EntityType<MethaneCowEntity>> METHANE_COW =
            ENTITY_TYPES.register("methane_cow", () -> EntityType.Builder.create(MethaneCowEntity::new,
                    EntityClassification.CREATURE).size(0.9f, 1.4f).build(new ResourceLocation(MethaneCow.MOD_ID,
                    "methane_cow").toString()));

    public static final RegistryObject<EntityType<BabyMethaneCowEntity>> BABY_METHANE_COW =
            ENTITY_TYPES.register("baby_methane_cow", () -> EntityType.Builder.create(BabyMethaneCowEntity::new,
                    EntityClassification.CREATURE).size(0.9f, 1.4f).build(new ResourceLocation(MethaneCow.MOD_ID,
                    "baby_methane_cow").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
