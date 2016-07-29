package com.connorwojtak.common;

import java.util.logging.Logger;

import com.connorwojtak.block.MBlockRenderRegister;
import com.connorwojtak.block.MBlocks;
import com.connorwojtak.item.MItemRenderRegister;
import com.connorwojtak.item.MItems;

import net.minecraft.client.Minecraft;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.init.Blocks;
import net.minecraft.util.ReportedException;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MegaModPack.MODID, version = MegaModPack.VERSION, name=MegaModPack.NAME)
public class MegaModPack
{
    public static final String MODID = "mmp";
    public static final String VERSION = "1.2.1";
    public static final String NAME = "MegaModPack";
    
    @SidedProxy(clientSide="com.connorwojtak.common.ClientProxy", serverSide="com.connorwojtak.common.ServerProxy")
    public static CommonProxy proxy;
    
    public static final MLogger MMP_GLOBAL_LOGGER = new MLogger(null, null);
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	if (MMP_GLOBAL_LOGGER == null || MMP_GLOBAL_LOGGER.loggerEnabled == false){
    		CrashReport report = new CrashReport("MMP Logger failed to load!!! ", new NullPointerException());
    		throw new ReportedException(report);
    	}
    	else{
        	MMP_GLOBAL_LOGGER.info("MMP Logger sucessfully loaded!");
    	}
    	this.proxy.preInit(event);
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	this.proxy.init(event);
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	this.proxy.postInit(event);
    }
}
