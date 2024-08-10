package com.create_automative.fabric;

import org.quiltmc.loader.api.QuiltLoader;

import com.thepandaparade.create_automative.TPPCAExpectPlatform;

import java.nio.file.Path;

public class TPPCAQuiltPlatformImpl {
    /**
     * This is our actual method to {@link ExampleExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return QuiltLoader.getConfigDir();
    }
}
