package net.luax7.adventureplus.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.luax7.adventureplus.AdventurePlus;
import net.luax7.adventureplus.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(AdventurePlus.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.aventureplus"))
                    .icon(() -> new ItemStack(ModItems.CARNELIAN)).entries((displayContext, entries) -> {
                        entries.add(ModItems.CARNELIAN);
                        entries.add(ModItems.TOPAZ);

                        entries.add(ModBlocks.LapidationTable);



                    }).build());


    public static void registerItemGroups() {
        AdventurePlus.LOGGER.info("Registering Item Groups for " + AdventurePlus.MOD_ID);
    }
}