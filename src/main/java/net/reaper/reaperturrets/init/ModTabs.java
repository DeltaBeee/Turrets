package net.reaper.reaperturrets.init;

import net.reaper.reaperturrets.Turrets;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;

public class ModTabs {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Turrets.MOD_ID);

    /*
    public static final RegistryObject<CreativeModeTab> EXAMPLE_TAB = TABS.register("example_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(DItems.EXAMPLE_ITEM.get()))
                    .title(Component.translatable("tab.coursemod.example_tab"))
                    //.withTabsAfter(DTabs.EXAMPLE_TAB_2.getKey())
                    .displayItems((display, output) -> {
                        output.accept(DItems.EXAMPLE_ITEM.get());
                    })
                    .build());
    */
}
