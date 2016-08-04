package com.connorwojtak.item;

import java.util.ArrayList;

import com.connorwojtak.creativetab.MTabArmor;
import com.connorwojtak.creativetab.MTabBlock;
import com.connorwojtak.creativetab.MTabItem;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MItems{
	public static CreativeTabs tabItem = new MTabItem("mmpItems");
	public static CreativeTabs tabArmor = new MTabArmor("mmpArmor");
	static ArrayList<Item> itemList = new ArrayList<Item>();
	
	//Copper Material
	public static final ToolMaterial Copper = EnumHelper.addToolMaterial("Copper", 5, 181, 1.5F, 3.0F, 15);
	public static final ArmorMaterial CopperArmor = EnumHelper.addArmorMaterial("CopperArmor", "mmp:copper_armor", 2, new int[]{2, 5, 4, 2}, 30, null, 2F);
	
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
	
	public static final ItemFood CottonCandy = new CottonCandy(10, 0.2F, true, "cotton_candy");
	
	public static final ItemArmor CopperHelmet = new PotionArmor(CopperArmor, 1, EntityEquipmentSlot.HEAD, "copper_helmet");
	public static final ItemArmor CopperChestplate = new PotionArmor(CopperArmor, 1, EntityEquipmentSlot.CHEST, "copper_chestplate");
	public static final ItemArmor CopperLeggings = new PotionArmor(CopperArmor, 2, EntityEquipmentSlot.LEGS, "copper_leggings");
	public static final ItemArmor CopperBoots  = new PotionArmor(CopperArmor, 1, EntityEquipmentSlot.FEET, "copper_boots");
	
	public static void registerItems(){
		itemList.add(CopperIngot);
		itemList.add(CopperPickaxe);
		itemList.add(CopperAxe);
		itemList.add(CopperHoe);
		itemList.add(CopperShovel);
		itemList.add(CopperSword);
		
		itemList.add(CopperHelmet);
		itemList.add(CopperChestplate);
		itemList.add(CopperLeggings);
		itemList.add(CopperBoots);
		
		//itemList.add(CottonCandy); //Cotton Candy is removed due to metadata.
		
		GameRegistry.register(CopperIngot);
		GameRegistry.register(CopperPickaxe);
		GameRegistry.register(CopperAxe);
		GameRegistry.register(CopperHoe);
		GameRegistry.register(CopperShovel);
		GameRegistry.register(CopperSword);
		
		GameRegistry.register(CopperHelmet);
		GameRegistry.register(CopperChestplate);
		GameRegistry.register(CopperLeggings);
		GameRegistry.register(CopperBoots);  
		
		GameRegistry.register(CottonCandy);     
	}
	
}
