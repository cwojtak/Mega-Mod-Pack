package com.connorwojtak.init;

import com.connorwojtak.common.OreGalore;
import com.connorwojtak.item.CottonCandy;

import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MCrafting {
	
	private static final CottonCandy CC = MItems.CottonCandy;
	
	public static boolean registerCrafting(){
		try {
		//COPPER	
		
		//Copper Pickaxe
		GameRegistry.addRecipe(new ItemStack(MItems.CopperPickaxe), new Object[]{
			"XXX", " Y ", " Y ", 'X', MItems.CopperIngot, 'Y', Items.STICK
		});
		
		//Copper Axe
		GameRegistry.addRecipe(new ItemStack(MItems.CopperAxe), new Object[]{
			"XX ", "XY ", " Y ", 'X', MItems.CopperIngot, 'Y', Items.STICK
		});
		
		//Copper Axe
		GameRegistry.addRecipe(new ItemStack(MItems.CopperAxe), new Object[]{
			" XX", " YX", " Y ", 'X', MItems.CopperIngot, 'Y', Items.STICK
		});
		
		//Copper Sword
		GameRegistry.addRecipe(new ItemStack(MItems.CopperSword), new Object[]{
			" X ", " X ", " Y ", 'X', MItems.CopperIngot, 'Y', Items.STICK
		});
		
		//Copper Hoe
		GameRegistry.addRecipe(new ItemStack(MItems.CopperHoe), new Object[]{
			"XX ", " Y ", " Y ", 'X', MItems.CopperIngot, 'Y', Items.STICK
		});
		
		//Copper Hoe
		GameRegistry.addRecipe(new ItemStack(MItems.CopperHoe), new Object[]{
			" XX", " Y ", " Y ", 'X', MItems.CopperIngot, 'Y', Items.STICK
		});
		
		//Copper Shovel
		GameRegistry.addRecipe(new ItemStack(MItems.CopperShovel), new Object[]{
			" X ", " Y ", " Y ", 'X', MItems.CopperIngot, 'Y', Items.STICK
		});
		
		//Copper Boots
		GameRegistry.addRecipe(new ItemStack(MItems.CopperBoots), new Object[]{
			"   ", "X X", "X X", 'X', MItems.CopperIngot
		});
		
		//Copper Leggings
		GameRegistry.addRecipe(new ItemStack(MItems.CopperLeggings), new Object[]{
			"XXX", "X X", "X X", 'X', MItems.CopperIngot
		});
		
		//Copper Chestplate
		GameRegistry.addRecipe(new ItemStack(MItems.CopperChestplate), new Object[]{
			"X X", "XXX", "XXX", 'X', MItems.CopperIngot
		});
		
		//Copper Helmet
		GameRegistry.addRecipe(new ItemStack(MItems.CopperHelmet), new Object[]{
			"XXX", "X X", "   ", 'X', MItems.CopperIngot
		});
		
		//Copper Block
		GameRegistry.addRecipe(new ItemStack(MBlocks.CopperBlock), new Object[]{
			"XXX", "XXX", "XXX", 'X', MItems.CopperIngot
		});
		
		
		//Copper Ingot
		GameRegistry.addSmelting(MBlocks.CopperOre, new ItemStack(MItems.CopperIngot), 2);
		
		//TITANIUM
		
		//Titanium Pickaxe
		GameRegistry.addRecipe(new ItemStack(MItems.TitaniumPickaxe), new Object[]{
			"XXX", " Y ", " Y ", 'X', MItems.TitaniumIngot, 'Y', Items.STICK
		});
				
		//Titanium Axe
		GameRegistry.addRecipe(new ItemStack(MItems.TitaniumAxe), new Object[]{
			"XX ", "XY ", " Y ", 'X', MItems.TitaniumIngot, 'Y', Items.STICK
		});
		
		//Titanium Axe
		GameRegistry.addRecipe(new ItemStack(MItems.TitaniumAxe), new Object[]{
			" XX", " YX", " Y ", 'X', MItems.TitaniumIngot, 'Y', Items.STICK
		});
				
		//Titanium Sword
		GameRegistry.addRecipe(new ItemStack(MItems.TitaniumSword), new Object[]{
			" X ", " X ", " Y ", 'X', MItems.TitaniumIngot, 'Y', Items.STICK
		});
				
		//Titanium Hoe
		GameRegistry.addRecipe(new ItemStack(MItems.TitaniumHoe), new Object[]{
			" XX", " Y ", " Y ", 'X', MItems.TitaniumIngot, 'Y', Items.STICK
		});
		
		//Titanium Hoe
		GameRegistry.addRecipe(new ItemStack(MItems.TitaniumHoe), new Object[]{
			"XX ", " Y ", " Y ", 'X', MItems.TitaniumIngot, 'Y', Items.STICK
		});
				
		//Titanium Shovel
		GameRegistry.addRecipe(new ItemStack(MItems.TitaniumShovel), new Object[]{
			" X ", " Y ", " Y ", 'X', MItems.TitaniumIngot, 'Y', Items.STICK
		});
		
		//Titanium Boots
		GameRegistry.addRecipe(new ItemStack(MItems.TitaniumBoots), new Object[]{
			"   ", "X X", "X X", 'X', MItems.TitaniumIngot
		});
				
		//Titanium Leggings
		GameRegistry.addRecipe(new ItemStack(MItems.TitaniumLeggings), new Object[]{
			"XXX", "X X", "X X", 'X', MItems.TitaniumIngot
		});
				
		//Titanium Chestplate
		GameRegistry.addRecipe(new ItemStack(MItems.TitaniumChestplate), new Object[]{
			"X X", "XXX", "XXX", 'X', MItems.TitaniumIngot
		});
				
		//Titanium Helmet
		GameRegistry.addRecipe(new ItemStack(MItems.TitaniumHelmet), new Object[]{
			"XXX", "X X", "   ", 'X', MItems.TitaniumIngot
		});
				
		//Titanium Block
		GameRegistry.addRecipe(new ItemStack(MBlocks.TitaniumBlock), new Object[]{
			"XXX", "XXX", "XXX", 'X', MItems.TitaniumIngot
		});
		
		//Titanium Ingot
		GameRegistry.addSmelting(MBlocks.TitaniumOre, new ItemStack(MItems.TitaniumIngot), 1);
		
		//COTTON CANDY
		
		//Red Cotton Candy
		GameRegistry.addShapelessRecipe(CC.getSubItemMetaByID(0, CC), 
			new Object[]{ new ItemStack(Items.DYE, 1, EnumDyeColor.RED.getDyeDamage()), new ItemStack(Items.SUGAR, 1) 
		});
				
		//Blue Cotton Candy
		GameRegistry.addShapelessRecipe(CC.getSubItemMetaByID(1, CC), 
			new Object[]{ new ItemStack(Items.DYE, 1, EnumDyeColor.BLUE.getDyeDamage()), new ItemStack(Items.SUGAR, 1) 
		});
		
		//Green Cotton Candy
		GameRegistry.addShapelessRecipe(CC.getSubItemMetaByID(2, CC), 
			new Object[]{ new ItemStack(Items.DYE, 1, EnumDyeColor.GREEN.getDyeDamage()), new ItemStack(Items.SUGAR, 1) 
		});
		
		//Yellow Cotton Candy
		GameRegistry.addShapelessRecipe(CC.getSubItemMetaByID(3, CC), 
			new Object[]{ new ItemStack(Items.DYE, 1, EnumDyeColor.YELLOW.getDyeDamage()), new ItemStack(Items.SUGAR, 1) 
		});
		
		//White Cotton Candy
		GameRegistry.addShapelessRecipe(CC.getSubItemMetaByID(4, CC), 
			new Object[]{ new ItemStack(Items.DYE, 1, EnumDyeColor.WHITE.getDyeDamage()), new ItemStack(Items.SUGAR, 1) 
		});
						
		//Black Cotton Candy
		GameRegistry.addShapelessRecipe(CC.getSubItemMetaByID(5, CC), 
			new Object[]{ new ItemStack(Items.DYE, 1, EnumDyeColor.BLACK.getDyeDamage()), new ItemStack(Items.SUGAR, 1) 
		});
					
		//Purple Cotton Candy
		GameRegistry.addShapelessRecipe(CC.getSubItemMetaByID(6, CC), 
			new Object[]{ new ItemStack(Items.DYE, 1, EnumDyeColor.PURPLE.getDyeDamage()), new ItemStack(Items.SUGAR, 1) 
		});
				
		//Orange Cotton Candy
		GameRegistry.addShapelessRecipe(CC.getSubItemMetaByID(7, CC), 
			new Object[]{ new ItemStack(Items.DYE, 1, EnumDyeColor.ORANGE.getDyeDamage()), new ItemStack(Items.SUGAR, 1) 
		});
		
		//Brown Cotton Candy
		GameRegistry.addShapelessRecipe(CC.getSubItemMetaByID(8, CC), 
			new Object[]{ new ItemStack(Items.DYE, 1, EnumDyeColor.BROWN.getDyeDamage()), new ItemStack(Items.SUGAR, 1) 
		});
		
		//Pink Cotton Candy
		GameRegistry.addShapelessRecipe(CC.getSubItemMetaByID(9, CC), 
			new Object[]{ new ItemStack(Items.DYE, 1, EnumDyeColor.PINK.getDyeDamage()), new ItemStack(Items.SUGAR, 1) 
		});
		
		return true;
		}
		catch(Exception e){
			OreGalore.OG_LOGGER.error("Error loading crafting: " + e);
			return false;
		}
	}
}
