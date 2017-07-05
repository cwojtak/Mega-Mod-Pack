package com.connorwojtak.init;

import java.util.ArrayList;

import com.connorwojtak.common.OreGalore;
import com.connorwojtak.creativetab.MTabArmor;
import com.connorwojtak.creativetab.MTabBlock;
import com.connorwojtak.creativetab.MTabItem;
import com.connorwojtak.item.CottonCandy;
import com.connorwojtak.item.MItemFood;
import com.connorwojtak.item.PotionArmor;
import com.connorwojtak.item.StandardArmor;
import com.connorwojtak.item.StandardAxe;
import com.connorwojtak.item.StandardHoe;
import com.connorwojtak.item.StandardItem;
import com.connorwojtak.item.StandardPickaxe;
import com.connorwojtak.item.StandardShovel;
import com.connorwojtak.item.StandardSword;

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
	public static CreativeTabs tabItem = new MTabItem("ogItems");
	public static CreativeTabs tabArmor = new MTabArmor("ogArmor");
	private static ArrayList<Item> itemList = new ArrayList<Item>();
	
	//Copper Material
	public static final ToolMaterial Copper = EnumHelper.addToolMaterial("Copper", 5, 181, 1.5F, 3.0F, 15);
	public static final ArmorMaterial CopperArmor = EnumHelper.addArmorMaterial("CopperArmor", "og:copper_armor", 2, new int[]{2, 5, 4, 2}, 30, null, 2F);
	
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
	
	//Titanium Material
	public static final ToolMaterial Titanium = EnumHelper.addToolMaterial("Titanium", 10, 2501, 5.0F, 6.0F, 45);
	public static final ArmorMaterial TitaniumArmor = EnumHelper.addArmorMaterial("TitaniumArmor", "og:titanium_armor", 5, new int[]{6, 9, 8, 6}, 45, null, 4F);
	
	//Titanium Ingot
	public static final Item TitaniumIngot = new StandardItem().setMaxStackSize(16)
	.setCreativeTab(tabItem).setRegistryName("titanium_ingot")
	.setUnlocalizedName("titanium_ingot");
		
	//Titanium Pickaxe
	public static final Item TitaniumPickaxe = new StandardPickaxe(Titanium)
	.setCreativeTab(tabItem).setRegistryName("titanium_pickaxe")
	.setUnlocalizedName("titanium_pickaxe");
		
	//Titanium Axe
	public static final Item TitaniumAxe = new StandardAxe(Titanium)
	.setCreativeTab(tabItem).setRegistryName("titanium_axe")
	.setUnlocalizedName("titanium_axe");
		
	//Titanium Hoe
	public static final Item TitaniumHoe = new StandardHoe(Titanium)
	.setCreativeTab(tabItem).setRegistryName("titanium_hoe")
	.setUnlocalizedName("titanium_hoe");
		
	//Titanium Shovel
	public static final Item TitaniumShovel = new StandardShovel(Titanium)
	.setCreativeTab(tabItem).setRegistryName("titanium_shovel")
	.setUnlocalizedName("titanium_shovel");
		
	//Titanium Sword
	public static final Item TitaniumSword = new StandardSword(Titanium)
	.setCreativeTab(tabItem).setRegistryName("titanium_sword")
	.setUnlocalizedName("titanium_sword");
	
	//Cotton Candy
	public static final CottonCandy CottonCandy = new CottonCandy(10, 1F, true, "cotton_candy");
	
	//Copper Armor
	public static final ItemArmor CopperHelmet = new PotionArmor(CopperArmor, 1, EntityEquipmentSlot.HEAD, "copper_helmet");
	public static final ItemArmor CopperChestplate = new PotionArmor(CopperArmor, 1, EntityEquipmentSlot.CHEST, "copper_chestplate");
	public static final ItemArmor CopperLeggings = new PotionArmor(CopperArmor, 2, EntityEquipmentSlot.LEGS, "copper_leggings");
	public static final ItemArmor CopperBoots  = new PotionArmor(CopperArmor, 1, EntityEquipmentSlot.FEET, "copper_boots");
	
	//Titanium Armor
	public static final ItemArmor TitaniumHelmet = new StandardArmor(TitaniumArmor, 1, EntityEquipmentSlot.HEAD, "titanium_helmet");
	public static final ItemArmor TitaniumChestplate = new StandardArmor(TitaniumArmor, 1, EntityEquipmentSlot.CHEST, "titanium_chestplate");
	public static final ItemArmor TitaniumLeggings = new StandardArmor(TitaniumArmor, 2, EntityEquipmentSlot.LEGS, "titanium_leggings");
	public static final ItemArmor TitaniumBoots  = new StandardArmor(TitaniumArmor, 1, EntityEquipmentSlot.FEET, "titanium_boots");
	
	public static boolean registerItems(){
		try {
			getItemList().add(CopperIngot);
			getItemList().add(CopperPickaxe);
			getItemList().add(CopperAxe);
			getItemList().add(CopperHoe);
			getItemList().add(CopperShovel);
			getItemList().add(CopperSword);
		
			getItemList().add(TitaniumIngot);
			getItemList().add(TitaniumPickaxe);
			getItemList().add(TitaniumAxe);
			getItemList().add(TitaniumHoe);
			getItemList().add(TitaniumShovel);
			getItemList().add(TitaniumSword);
		
			getItemList().add(CopperHelmet);
			getItemList().add(CopperChestplate);
			getItemList().add(CopperLeggings);
			getItemList().add(CopperBoots);
		
			getItemList().add(TitaniumHelmet);
			getItemList().add(TitaniumChestplate);
			getItemList().add(TitaniumLeggings);
			getItemList().add(TitaniumBoots);
		
			GameRegistry.register(CopperIngot);
			GameRegistry.register(CopperPickaxe);
			GameRegistry.register(CopperAxe);
			GameRegistry.register(CopperHoe);
			GameRegistry.register(CopperShovel);
			GameRegistry.register(CopperSword);
		
			GameRegistry.register(TitaniumIngot);
			GameRegistry.register(TitaniumPickaxe);
			GameRegistry.register(TitaniumAxe);
			GameRegistry.register(TitaniumHoe);
			GameRegistry.register(TitaniumShovel);
			GameRegistry.register(TitaniumSword);
		
			GameRegistry.register(CopperHelmet);
			GameRegistry.register(CopperChestplate);
			GameRegistry.register(CopperLeggings);
			GameRegistry.register(CopperBoots);
		
			GameRegistry.register(TitaniumHelmet);
			GameRegistry.register(TitaniumChestplate);
			GameRegistry.register(TitaniumLeggings);
			GameRegistry.register(TitaniumBoots);
		
			GameRegistry.register(CottonCandy);
			
			return true;
		}
		catch(Exception e){
			OreGalore.OG_LOGGER.error("Error loading items: " + e);
			return false;
		}
	}

	public static ArrayList<Item> getItemList() {
		return itemList;
	}

	public static void setItemList(ArrayList<Item> itemList) {
		MItems.itemList = itemList;
	}
	
}
