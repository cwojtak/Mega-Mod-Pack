package com.connorwojtak.block;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

import com.connorwojtak.common.MegaModPack;
public final class MBlockRenderRegister {
	public static final String MODID = MegaModPack.MODID;
	
	public static void registerBlockRenderer() {
		reg(MBlocks.CopperBlock);
	}

	public static void reg(Block block) {
		 Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		    .register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(MODID + ":" + block.getUnlocalizedName().substring(5), "inventory"));
	}

}
