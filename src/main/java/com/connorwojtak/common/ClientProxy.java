package com.connorwojtak.common;

import com.connorwojtak.block.MBlockRenderRegister;
import com.connorwojtak.item.MItemRenderRegister;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
        MItemRenderRegister.preInit();
    }

    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);
    	MBlockRenderRegister.registerBlockRenderer();
    	MItemRenderRegister.registerItemRenderer(); 
    	
    	if (MItemRenderRegister.noErrors == true && MBlockRenderRegister.noErrors == true){
    		MegaModPack.MMP_GLOBAL_LOGGER.info("Renderers loaded sucessfully!");
    	}
    	else {
    		MegaModPack.MMP_GLOBAL_LOGGER.severe("Renderers failed to load sucessfully!");
    	}
    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
    }
}
