package com.connorwojtak.block;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MBlocks {
	
	//Blocks
	public static final Block CopperBlock = new StandardBlock(Material.ROCK, "copper_block", 3.0F, 3.0F)
	.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	
	//ItemBlocks
	public static final ItemBlock CopperBlock_IB = (ItemBlock) new ItemBlock(CopperBlock).setRegistryName(CopperBlock.getRegistryName());
    
	public static void registerBlocks(){
		GameRegistry.register(CopperBlock);
		GameRegistry.register(CopperBlock_IB);
	}
}
