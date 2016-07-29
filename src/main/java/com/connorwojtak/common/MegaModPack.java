package com.connorwojtak.common;

import com.connorwojtak.block.MBlockRenderRegister;
import com.connorwojtak.block.MBlocks;
import com.connorwojtak.item.MItemRenderRegister;
import com.connorwojtak.item.MItems;

import net.minecraft.init.Blocks;
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
    public static final String VERSION = "1.10.2";
    public static final String NAME = "MegaModPack";
    
    @SidedProxy(clientSide="com.connorwojtak.common.ClientProxy", serverSide="com.connorwojtak.common.ServerProxy")
    public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
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
