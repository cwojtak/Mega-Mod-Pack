package com.connorwojtak.init;

import java.util.ArrayList;
import java.util.List;

import com.connorwojtak.block.ExplosionBlock;
import com.connorwojtak.block.StandardBlock;
import com.connorwojtak.block.StandardOre;
import com.connorwojtak.common.OreGalore;
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
	private static ArrayList<Block> blockList = new ArrayList<Block>();
	public static CreativeTabs tabBlock = new MTabBlock("ogBlocks");
	
	//Blocks
	//Copper Block
	public static final Block CopperBlock = new StandardBlock(Material.ROCK, "copper_block", 3.0F, 3.0F)
	.setCreativeTab(tabBlock);
	
	//Copper Ore
	public static final Block CopperOre = new StandardOre(Material.ROCK, "copper_ore", 2.5F, 2.5F)
	.setCreativeTab(tabBlock);
	
	//Titanium Block
	public static final Block TitaniumBlock = new StandardOre(Material.ROCK, "titanium_block", 5.0F, 5.0F)
	.setCreativeTab(tabBlock);
	
	//Titanium Ore
	public static final Block TitaniumOre = new StandardOre(Material.ROCK, "titanium_ore", 3.5F, 3.5F)
	.setCreativeTab(tabBlock);
	
	//Explosion Stone
	public static final Block ExplosionStone = new ExplosionBlock(Material.ROCK, "explosion_stone", 1.5F, 1.5F)
	.setCreativeTab(tabBlock);
	
	//ItemBlocks
	//Copper Block
	public static final ItemBlock CopperBlock_IB = (ItemBlock) new ItemBlock(CopperBlock)
	.setRegistryName(CopperBlock.getRegistryName());
	
    //Copper Ore
	public static final ItemBlock CopperOre_IB = (ItemBlock) new ItemBlock(CopperOre)
	.setRegistryName(CopperOre.getRegistryName());
	
	//Copper Block
	public static final ItemBlock TitaniumBlock_IB = (ItemBlock) new ItemBlock(TitaniumBlock)
	.setRegistryName(TitaniumBlock.getRegistryName());
		
	//Copper Ore
	public static final ItemBlock TitaniumOre_IB = (ItemBlock) new ItemBlock(TitaniumOre)
	.setRegistryName(TitaniumOre.getRegistryName());
	
	//Explosion Stone
	public static final ItemBlock ExplosionStone_IB = (ItemBlock) new ItemBlock(ExplosionStone)
	.setRegistryName(ExplosionStone.getRegistryName());
	
	public static boolean registerBlocks(){
		try {
			getBlockList().add(CopperBlock);
			getBlockList().add(CopperOre);
			getBlockList().add(TitaniumBlock);
			getBlockList().add(TitaniumOre);
			getBlockList().add(ExplosionStone);
		
			GameRegistry.register(CopperBlock);
			GameRegistry.register(CopperOre);
			GameRegistry.register(TitaniumBlock);
			GameRegistry.register(TitaniumOre);
			GameRegistry.register(ExplosionStone);
		
			GameRegistry.register(CopperBlock_IB);
			GameRegistry.register(CopperOre_IB);
			GameRegistry.register(TitaniumBlock_IB);
			GameRegistry.register(TitaniumOre_IB);
			GameRegistry.register(ExplosionStone_IB);
			
			return true;
		}
		catch(Exception e) {
			OreGalore.OG_LOGGER.error("Error loading blocks: " + e);
			return false;
		}
	}

	public static ArrayList<Block> getBlockList() {
		return blockList;
	}

	public static void setBlockList(ArrayList<Block> blockList) {
		MBlocks.blockList = blockList;
	}
}