package net.reaper.reaperturrets.init;

import net.reaper.reaperturrets.Turrets;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Turrets.MOD_ID);



    /*
    public static final RegistryObject<EntityType<Example>> EXAMPLE =
            ENTITIES.register("example", () -> EntityType.Builder.of(Example::new, MobCategory.MONSTER)
                    .sized(0.6f, 1.95f).clientTrackingRange(8).build("example"));
    */
}
