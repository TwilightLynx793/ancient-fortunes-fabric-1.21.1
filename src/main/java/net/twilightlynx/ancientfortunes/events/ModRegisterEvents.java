package net.twilightlynx.ancientfortunes.events;

import net.twilightlynx.ancientfortunes.AncientFortunes;

public class ModRegisterEvents {
    public static void OnModLoad(){
        AncientFortunes.LOGGER.info("Loading Mod " + AncientFortunes.MOD_ID);
    }
    public static void OnItemLoad(){
        AncientFortunes.LOGGER.info("Loading Items for " + AncientFortunes.MOD_ID);
    }
    public static void OnBlockLoad(){
        AncientFortunes.LOGGER.info("Loading Blocks for " + AncientFortunes.MOD_ID);
    }
    public static void OnItemGroupLoad(){
        AncientFortunes.LOGGER.info("Loading Item Groups for " + AncientFortunes.MOD_ID);
    }
}
