package net.jayl.legendarycalls;

import net.fabricmc.api.ModInitializer;

import net.jayl.legendarycalls.block.ModBlocks;
import net.jayl.legendarycalls.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LegendaryCalls implements ModInitializer {
	public static final String MOD_ID = "legendarycalls";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}