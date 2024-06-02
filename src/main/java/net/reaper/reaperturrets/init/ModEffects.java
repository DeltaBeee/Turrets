package net.reaper.reaperturrets.init;

import net.reaper.reaperturrets.Turrets;
import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, Turrets.MOD_ID);

    //public static final RegistryObject<MobEffect> NEW_EFFECT = MOB_EFFECTS.register("new_effect", NewEffect::new);
}
