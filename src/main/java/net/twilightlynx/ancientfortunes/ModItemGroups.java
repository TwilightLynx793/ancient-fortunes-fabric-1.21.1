package net.twilightlynx.ancientfortunes;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.twilightlynx.ancientfortunes.events.ModRegisterEvents;
import net.twilightlynx.ancientfortunes.mod.block.ModBlocks;
import net.twilightlynx.ancientfortunes.mod.item.ModItems;

public class ModItemGroups {

    public static final ItemGroup ANCIENT_FORTUNES = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(AncientFortunes.MOD_ID, "ancient_fortunes"), FabricItemGroup.builder()
                            .icon(() -> new ItemStack(ModItems.SAPPHIRE))
                            .displayName(Text.literal("Ancient Fortunes"))
                            .entries(((displayContext, entries) -> {
                                entries.add(ModItems.SAPPHIRE);
                                entries.add(ModBlocks.SAPPHIRE_BLOCK);
                            }))
                    .build());

    public static void RegisterModItemGroups(){
        ModRegisterEvents.OnItemGroupLoad();
    }
}
