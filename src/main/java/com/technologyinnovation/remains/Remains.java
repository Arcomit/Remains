package com.technologyinnovation.remains;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Remains implements ModInitializer {
    public static final Logger LOGGER = LogManager.getLogger("firstmod");
    @Override
    public void onInitialize() {
        LOGGER.info("Hello Fabric world!1");

    }
}