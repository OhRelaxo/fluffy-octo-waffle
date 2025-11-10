package com.nohunger;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoHungerMod implements ModInitializer {
    public static final String MOD_ID = "nohunger";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("No Hunger Mod initialized - Hunger mechanics disabled!");
    }
}
