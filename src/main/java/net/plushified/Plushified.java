package net.plushified;

import net.fabricmc.api.ModInitializer;
import net.plushified.registry.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Plushified implements ModInitializer {
	public static final String MOD_ID = "plushified";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("OMG! Initializing Plushified...");

		BlockRegistry.registering();
		BlockEntityRegistry.registering();
		ItemGroupRegistry.registering();
		SoundEventRegistry.registering();
	}
}