package net.katte.yamm;

import net.fabricmc.api.ModInitializer;

import net.katte.yamm.block.ModBlocks;
import net.katte.yamm.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class YAMagicM implements ModInitializer {
	public static final String MOD_ID = "yamm-core";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}