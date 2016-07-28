package com.connorwojtak.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MItems{
	public static ToolMaterial Copper = EnumHelper.addToolMaterial("Copper", 5, 181, 1.5F, 3.0F, 15);
	
	public static Item CopperIngot = new StandardItem().setMaxStackSize(16)
	.setCreativeTab(CreativeTabs.MISC).setRegistryName("copper_ingot")
	.setUnlocalizedName("copper_ingot");
	
	public static Item CopperPickaxe = new StandardPickaxe(Copper)
	.setCreativeTab(CreativeTabs.TOOLS).setRegistryName("copper_pickaxe")
	.setUnlocalizedName("copper_pickaxe");
	
	public static Item CopperAxe = new StandardAxe(Copper)
	.setCreativeTab(CreativeTabs.TOOLS).setRegistryName("copper_axe")
	.setUnlocalizedName("copper_axe");
	
	public static Item CopperHoe = new StandardHoe(Copper)
	.setCreativeTab(CreativeTabs.TOOLS).setRegistryName("copper_hoe")
	.setUnlocalizedName("copper_hoe");
	
	public static Item CopperShovel = new StandardShovel(Copper)
	.setCreativeTab(CreativeTabs.TOOLS).setRegistryName("copper_shovel")
	.setUnlocalizedName("copper_shovel");
	
	public static Item CopperSword = new StandardSword(Copper)
	.setCreativeTab(CreativeTabs.TOOLS).setRegistryName("copper_sword")
	.setUnlocalizedName("copper_sword");
	
	public static void registerItems(){
		GameRegistry.register(CopperIngot);
		GameRegistry.register(CopperPickaxe);
		GameRegistry.register(CopperAxe);
		GameRegistry.register(CopperHoe);
		GameRegistry.register(CopperShovel);
		GameRegistry.register(CopperSword);
	}
	
}
