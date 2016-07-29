package com.connorwojtak.common;

import com.connorwojtak.block.MBlockRenderRegister;
import com.connorwojtak.block.MBlocks;
import com.connorwojtak.item.MItemRenderRegister;
import com.connorwojtak.item.MItems;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {
    	MItems.registerItems();
    	MBlocks.registerBlocks();
    }

    public void init(FMLInitializationEvent e) {
    	MCrafting.registerCrafting();
    }

    public void postInit(FMLPostInitializationEvent e) {
    }
}
