package net.twilightlynx.ancientfortunes;

import net.fabricmc.api.ModInitializer;

import net.twilightlynx.ancientfortunes.events.ModRegisterEvents;
import net.twilightlynx.ancientfortunes.mod.block.ModBlocks;
import net.twilightlynx.ancientfortunes.mod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AncientFortunes implements ModInitializer {
	public static final String MOD_ID = "ancient-fortunes";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModRegisterEvents.OnModLoad();

		ModItemGroups.RegisterModItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}