package com.connorwojtak.common;

import com.connorwojtak.block.MBlockRenderRegister;
import com.connorwojtak.block.MBlocks;
import com.connorwojtak.item.MItemRenderRegister;
import com.connorwojtak.item.MItems;
import com.connorwojtak.world.MWorldGen;
import com.connorwojtak.world.MWorlds;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.BiomeProperties;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e){
    	MItems.registerItems();
    	MegaModPack.MMP_GLOBAL_LOGGER.info("Items loaded sucessfully!");
    	MBlocks.registerBlocks();
    	MegaModPack.MMP_GLOBAL_LOGGER.info("Blocks loaded sucessfully!");
    }

    public void init(FMLInitializationEvent e) {
    	MCrafting.registerCrafting();
    	MegaModPack.MMP_GLOBAL_LOGGER.info("Crafting loaded sucessfully!");
    	
    	GameRegistry.registerWorldGenerator(new MWorldGen(), 0);
    	MegaModPack.MMP_GLOBAL_LOGGER.info("World Generator loaded sucessfully!");
    	MWorlds.registerDimensions();
    	MegaModPack.MMP_GLOBAL_LOGGER.info("Dimensions loaded sucessfully!");
    }

    public void postInit(FMLPostInitializationEvent e) {
    }
}
