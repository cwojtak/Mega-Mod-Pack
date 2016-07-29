package com.connorwojtak.item;

import com.connorwojtak.common.MegaModPack;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelManager;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class MItemRenderRegister {

	public static final String MODID = MegaModPack.MODID; 
	public static void registerItemRenderer(){
		reg(MItems.CopperIngot);
		reg(MItems.CopperAxe);
		reg(MItems.CopperHoe);
		reg(MItems.CopperPickaxe);
		reg(MItems.CopperShovel);
		reg(MItems.CopperSword);
	}

	public static void reg(Item item) {
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
	    .register(item, 0, new ModelResourceLocation(MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}

