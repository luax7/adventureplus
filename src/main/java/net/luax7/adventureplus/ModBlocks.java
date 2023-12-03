package net.luax7.adventureplus;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static void registerBlocks() {
        AdventurePlus.LOGGER.info("Loading blocks for " + AdventurePlus.MOD_ID + " ...");

    }
        public static final Block LapidationTable = RegisterBlock("lapidation_table",
                new Block(FabricBlockSettings.copyOf(Blocks.ENCHANTING_TABLE)));


        private static Item registerBlockItem(String name, Block block){
            return Registry.register(Registries.ITEM,new Identifier(AdventurePlus.MOD_ID,name), new BlockItem(block, new FabricItemSettings()));
        }

        private static Block RegisterBlock(String name,Block block){
            registerBlockItem(name,block);
            return Registry.register(Registries.BLOCK,new Identifier(AdventurePlus.MOD_ID,name), block);
        }



}


