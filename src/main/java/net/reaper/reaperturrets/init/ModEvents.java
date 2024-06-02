package net.reaper.reaperturrets.init;

import com.mojang.logging.LogUtils;
import net.reaper.reaperturrets.Turrets;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import org.slf4j.Logger;

@Mod.EventBusSubscriber(modid = Turrets.MOD_ID)
public class ModEvents {
    // MAKE SURE TO CHECK THE CLASS OF THE EVENT YOU WISH TO MODIFY FOR THE FOLLOWING INFO:
    // Bus Type ("This event is fired on [INSERT BUS]") -- Mod Event Bus, Forge Event Bus.
    // Cancellability ("This event is cancellable") -- Yes or No.
    // Result ("This event does not have a result type") -- Yes or No.
    // Optional: Client (Check package of event class) -- Let's not clog the server with clientside events.
    private static final Logger LOGGER = LogUtils.getLogger();

    @Mod.EventBusSubscriber(modid = Turrets.MOD_ID)
    public class ForgeEventBusEvents {
        /* Add Forge Events below this line please */



        /* Add Forge Events above this line please */
    }

    @Mod.EventBusSubscriber(modid = Turrets.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public class ModEventBusEvents {
        /* Add Mod Events below this line please */



        /* Add Mod Events above this line please */
    }

    @Mod.EventBusSubscriber(modid = Turrets.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        /* Add Client Events below this line please */

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            LOGGER.info("Oh hey, how are you {}", Minecraft.getInstance().getUser().getName());
        }

        /* Add Client Events above this line please */
    }
}