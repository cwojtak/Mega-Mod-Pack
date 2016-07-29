package com.connorwojtak.common;

import com.connorwojtak.block.MBlocks;
import com.connorwojtak.item.MItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MCrafting {
	public static void registerCrafting(){
		//Copper Pickaxe
		GameRegistry.addRecipe(new ItemStack(MItems.CopperPickaxe), new Object[]{
			"XXX", " Y ", " Y ", 'X', MItems.CopperIngot, 'Y', Items.STICK
		});
		
		//Copper Axe
		GameRegistry.addRecipe(new ItemStack(MItems.CopperAxe), new Object[]{
			"XX ", "XY ", " Y ", 'X', MItems.CopperIngot, 'Y', Items.STICK
		});
		
		//Copper Sword
		GameRegistry.addRecipe(new ItemStack(MItems.CopperSword), new Object[]{
			" X ", " X ", " Y ", 'X', MItems.CopperIngot, 'Y', Items.STICK
		});
		
		//Copper Hoe
		GameRegistry.addRecipe(new ItemStack(MItems.CopperHoe), new Object[]{
			"XX ", " Y ", " Y ", 'X', MItems.CopperIngot, 'Y', Items.STICK
		});
		
		//Copper Shovel
		GameRegistry.addRecipe(new ItemStack(MItems.CopperShovel), new Object[]{
			" X ", " Y ", " Y ", 'X', MItems.CopperIngot, 'Y', Items.STICK
		});
		
		//Copper Block
		GameRegistry.addRecipe(new ItemStack(MBlocks.CopperBlock), new Object[]{
			"XXX", "XXX", "XXX", 'X', MItems.CopperIngot
		});
		
		//Copper Ingot
		GameRegistry.addSmelting(MBlocks.CopperOre, new ItemStack(MItems.CopperIngot), 2);
	}
}
