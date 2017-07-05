package com.connorwojtak.common;

import java.util.logging.Logger;

import com.connorwojtak.block.MBlockRenderRegister;
import com.connorwojtak.init.MBlocks;
import com.connorwojtak.init.MItems;
import com.connorwojtak.init.MLogger;
import com.connorwojtak.item.MItemRenderRegister;

import net.minecraft.client.Minecraft;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.init.Blocks;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ReportedException;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = OreGalore.MODID, version = OreGalore.VERSION, name=OreGalore.NAME)
public class OreGalore
{
    public static final String MODID = "og";
    public static final String VERSION = "1.5.6";
    public static final String NAME = "OreGalore";
    
    @Mod.Instance(MODID)
    public static OreGalore instance;
    
    @SidedProxy(clientSide="com.connorwojtak.common.ClientProxy", serverSide="com.connorwojtak.common.ServerProxy")
    
    public static CommonProxy proxy;
    
    public static final MLogger OG_LOGGER = new MLogger(null, null);
    
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	if (OG_LOGGER == null || OG_LOGGER.loggerEnabled == false){
    		CrashReport report = new CrashReport("OG Logger failed to load!", new NullPointerException());
    		throw new ReportedException(report);
    	}
    	else{
        	OG_LOGGER.info("OG Logger sucessfully loaded!");
    	}
    	this.proxy.preInit(event);
    }
    
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
    	this.proxy.init(event);
    }
    
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	this.proxy.postInit(event);
    }
}