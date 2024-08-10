package com.create_automative.forge;

import net.minecraftforge.fml.loading.FMLPaths;

import java.nio.file.Path;

import com.thepandaparade.create_automative.TPPCAExpectPlatform;

public class TPPCAForgePlatformImpl {
    /**
     * This is our actual method to {@link ExampleExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get();
    }
}
