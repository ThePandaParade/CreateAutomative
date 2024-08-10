package com.create_automative.forge;

import com.thepandaparade.create_automative.CreateAutomative;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CreateAutomative.MOD_ID)
public class CreateAutomativeForge {
    public CreateAutomativeForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(CreateAutomative.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        CreateAutomative.init();
    }
}
