package com.connorwojtak.common;

import com.connorwojtak.block.MBlockRenderRegister;
import com.connorwojtak.init.MBiomes;
import com.connorwojtak.init.MBlocks;
import com.connorwojtak.init.MCrafting;
import com.connorwojtak.init.MEntities;
import com.connorwojtak.init.MItems;
import com.connorwojtak.init.MTileEntity;
import com.connorwojtak.init.MWorldGen;
import com.connorwojtak.item.MItemRenderRegister;

import net.minecraft.command.CommandHandler;
import net.minecraft.crash.CrashReport;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ReportedException;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.BiomeProperties;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.world.storage.loot.conditions.LootCondition.Serializer;
import net.minecraft.world.storage.loot.conditions.LootConditionManager;
import net.minecraft.world.storage.loot.functions.LootFunctionManager;
import net.minecraftforge.client.model.ICustomModelLoader;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
	
	public static boolean ItemSuccess;
	public static boolean BlockSuccess;
	public static boolean EntitySuccess;
	public static boolean BiomeSuccess;
	public static boolean TileEntitySuccess;
	public static boolean CraftingSuccess;
	
    public void preInit(FMLPreInitializationEvent e){
    	ItemSuccess = MItems.registerItems();
    	if(ItemSuccess) OreGalore.OG_LOGGER.info("Items loaded sucessfully!");
    	BlockSuccess = MBlocks.registerBlocks();
    	if(BlockSuccess) OreGalore.OG_LOGGER.info("Blocks loaded sucessfully!");
    	EntitySuccess = MEntities.registerEntities();
    	if(EntitySuccess) OreGalore.OG_LOGGER.info("Entities loaded sucessfully!");
    	BiomeSuccess = MBiomes.registerBiomes();
    	if(BiomeSuccess) OreGalore.OG_LOGGER.info("Biomes loaded successfully!");
    }

    public void init(FMLInitializationEvent e) {
    	TileEntitySuccess = MTileEntity.registerTileEntities();
    	if(TileEntitySuccess) OreGalore.OG_LOGGER.info("Tile Entities loaded sucessfully!");
    	
    	CraftingSuccess = MCrafting.registerCrafting();
    	if(CraftingSuccess) OreGalore.OG_LOGGER.info("Crafting loaded sucessfully!");
    	
    	GameRegistry.registerWorldGenerator(new MWorldGen(), 0);
    	LootTableList.register(new ResourceLocation("og", "human_stronghold_treasure"));
    	
    	if(ItemSuccess == false && BlockSuccess == false && EntitySuccess == false && TileEntitySuccess == false && CraftingSuccess == false){
    		CrashReport report = new CrashReport("Critical Error, Ore Galore did not load properly!", new NullPointerException());
    		throw new ReportedException(report);
    	}
    }

    public void postInit(FMLPostInitializationEvent e) {
    }
}
