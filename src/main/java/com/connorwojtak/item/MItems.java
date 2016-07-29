package com.connorwojtak.item;

import com.connorwojtak.creativetab.MTabBlock;
import com.connorwojtak.creativetab.MTabItem;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MItems{
	public static CreativeTabs tabItem = new MTabItem("mmpItems");
	
	//Copper Material
	public static final ToolMaterial Copper = EnumHelper.addToolMaterial("Copper", 5, 181, 1.5F, 3.0F, 15);
	
	//Copper Ingot
	public static final Item CopperIngot = new StandardItem().setMaxStackSize(16)
	.setCreativeTab(tabItem).setRegistryName("copper_ingot")
	.setUnlocalizedName("copper_ingot");
	
	//Copper Pickaxe
	public static final Item CopperPickaxe = new StandardPickaxe(Copper)
	.setCreativeTab(tabItem).setRegistryName("copper_pickaxe")
	.setUnlocalizedName("copper_pickaxe");
	
	//Copper Axe
	public static final Item CopperAxe = new StandardAxe(Copper)
	.setCreativeTab(tabItem).setRegistryName("copper_axe")
	.setUnlocalizedName("copper_axe");
	
	//Copper Hoe
	public static final Item CopperHoe = new StandardHoe(Copper)
	.setCreativeTab(tabItem).setRegistryName("copper_hoe")
	.setUnlocalizedName("copper_hoe");
	
	//Copper Shovel
	public static final Item CopperShovel = new StandardShovel(Copper)
	.setCreativeTab(tabItem).setRegistryName("copper_shovel")
	.setUnlocalizedName("copper_shovel");
	
	//Copper Sword
	public static final Item CopperSword = new StandardSword(Copper)
	.setCreativeTab(tabItem).setRegistryName("copper_sword")
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
