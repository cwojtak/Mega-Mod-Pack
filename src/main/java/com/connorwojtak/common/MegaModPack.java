package com.connorwojtak.common;

import com.connorwojtak.block.MBlockRenderRegister;
import com.connorwojtak.block.MBlocks;
import com.connorwojtak.item.MItemRenderRegister;
import com.connorwojtak.item.MItems;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MegaModPack.MODID, version = MegaModPack.VERSION, name=MegaModPack.NAME)
public class MegaModPack
{
    public static final String MODID = "mmp";
    public static final String VERSION = "1.0";
    public static final String NAME = "MegaModPack";
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	MItems.registerItems();
    	MBlocks.registerBlocks();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	MBlockRenderRegister.registerBlockRenderer();
    	MItemRenderRegister.registerItemRenderer(); 
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    }
}
