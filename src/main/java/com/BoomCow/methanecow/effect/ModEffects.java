package com.BoomCow.methanecow.effect;

import com.BoomCow.methanecow.MethaneCow;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;



public class ModEffects {
    public static final DeferredRegister<Effect> Effects
            = DeferredRegister.create(ForgeRegistries.POTIONS, MethaneCow.MOD_ID);

    public static final RegistryObject<Effect> FED = Effects.register("fed",
            () -> new FedEffect(EffectType.BENEFICIAL, 0x00FF00));

    public static void register(IEventBus eventBus) {
        Effects.register(eventBus);
    }
}
