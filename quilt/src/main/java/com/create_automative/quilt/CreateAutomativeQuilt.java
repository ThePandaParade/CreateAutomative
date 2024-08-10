package com.create_automative.quilt;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

import com.thepandaparade.create_automative.CreateAutomative;

public class CreateAutomativeQuilt implements ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
        CreateAutomative.init();
    }
}
