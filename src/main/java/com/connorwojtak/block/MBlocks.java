package com.connorwojtak.block;

import java.util.ArrayList;
import java.util.List;

import com.connorwojtak.creativetab.MTabBlock;

import net.minecraft.block.Block;
import net.minecraft.block.BlockGlowstone;
import net.minecraft.block.BlockPortal;
import net.minecraft.block.SoundType;
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
	static ArrayList<Block> blockList = new ArrayList<Block>();
	public static CreativeTabs tabBlock = new MTabBlock("mmpBlocks");
	
	//Blocks
	//Copper Block
	public static final Block CopperBlock = new StandardBlock(Material.ROCK, "copper_block", 3.0F, 3.0F)
	.setCreativeTab(tabBlock);
	
	//Copper Ore
	public static final Block CopperOre = new CopperOre(Material.ROCK, "copper_ore", 2.5F, 2.5F)
	.setCreativeTab(tabBlock);
	
	//Mars Portal
	public static final BlockMarsPortal MarsPortal = (BlockMarsPortal) new BlockMarsPortal().setHardness(-1.0F).setLightLevel(0.75F)
	.setUnlocalizedName("mars_portal").setRegistryName("mars_portal");
	
	//TODO: Add uranium and led ores and ingots
	
	//ItemBlocks
	//Copper Block
	public static final ItemBlock CopperBlock_IB = (ItemBlock) new ItemBlock(CopperBlock)
	.setRegistryName(CopperBlock.getRegistryName());
	
    //Copper Ore
	public static final ItemBlock CopperOre_IB = (ItemBlock) new ItemBlock(CopperOre)
	.setRegistryName(CopperOre.getRegistryName());
	
	public static void registerBlocks(){
		blockList.add(CopperBlock);
		blockList.add(CopperOre);
		
		GameRegistry.register(CopperBlock);
		GameRegistry.register(CopperOre);
		
		GameRegistry.register(MarsPortal);
		
		GameRegistry.register(CopperBlock_IB);
		GameRegistry.register(CopperOre_IB);
	}
}