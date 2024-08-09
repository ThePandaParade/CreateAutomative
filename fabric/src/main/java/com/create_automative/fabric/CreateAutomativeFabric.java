package com.create_automative.fabric;

import com.thepandaparade.create_automative.CreateAutomative;
import net.fabricmc.api.ModInitializer;

public class CreateAutomativeFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        CreateAutomative.init();
    }
}
