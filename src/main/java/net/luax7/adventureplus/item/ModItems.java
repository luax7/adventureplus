package net.luax7.adventureplus.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.luax7.adventureplus.AdventurePlus;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {

    public static final Item CARNELIAN = RegisterItem("carnelian",new Item(new FabricItemSettings()));
    public static final Item TOPAZ = RegisterItem("topaz",new Item(new FabricItemSettings()));


    private static Item RegisterItem(String name, Item item){
        return Registry.register(Registries.ITEM,new Identifier(AdventurePlus.MOD_ID,name), item);
    }
    private static void AddItemsToIngredientItemGroup(FabricItemGroupEntries entry){
        entry.add(CARNELIAN);
        entry.add(TOPAZ);

        return;
    }
    public static void registerModItems (){
        AdventurePlus.LOGGER.info("Registering mod items for... Adventure plus" + AdventurePlus.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::AddItemsToIngredientItemGroup);
    }

}
