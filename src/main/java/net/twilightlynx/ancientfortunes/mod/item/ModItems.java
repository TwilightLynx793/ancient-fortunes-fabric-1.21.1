package net.twilightlynx.ancientfortunes.mod.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.twilightlynx.ancientfortunes.AncientFortunes;
import net.twilightlynx.ancientfortunes.events.ModRegisterEvents;

public class ModItems {

    public static final Item SAPPHIRE = registerItem("sapphire", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(AncientFortunes.MOD_ID, name), item);
    }

    public static void registerModItems(){
        ModRegisterEvents.OnItemLoad();
    }
}
