package com.connorwojtak.block;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

import com.connorwojtak.common.MegaModPack;
import com.connorwojtak.item.MItems;

public final class MBlockRenderRegister {
	
	public static final String MODID = MegaModPack.MODID;
	public static boolean noErrors = true;
	
	public static void registerBlockRenderer(){
		for(int i = 0; i < MBlocks.blockList.size(); i++){
			try {
				reg(MBlocks.blockList.get(i));
			}
			catch(NullPointerException e){
				MegaModPack.MMP_GLOBAL_LOGGER.error("FAILED TO REGISTER MODEL. TRACEBACK: \n" + e.getStackTrace());
				System.out.println(i);
				noErrors = false;
			}
		}
	}

	public static void reg(Block block) {
		 Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		    .register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(MODID + ":" + block.getUnlocalizedName().substring(5), "inventory"));
	}

}
