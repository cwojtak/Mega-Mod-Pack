package com.connorwojtak.item;

import java.util.List;

import com.connorwojtak.init.MItems;

import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;

public class CottonCandy extends MItemFood {
	
	public CottonCandy(int amount, float saturation, boolean isWolfFood, String name) {
		super(amount, saturation, isWolfFood);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(MItems.tabItem);
		this.setAlwaysEdible();
		this.setPotionEffect(new PotionEffect(Potion.getPotionById(1), 159, 1, true, true), saturation);
		this.setMaxStackSize(1);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		switch(stack.getItemDamage()){
			case 0: return super.getUnlocalizedName() + "." + "red";
			case 1: return super.getUnlocalizedName() + "." + "blue";
			case 2: return super.getUnlocalizedName() + "." + "green";
			case 3: return super.getUnlocalizedName() + "." + "yellow";
			case 4: return super.getUnlocalizedName() + "." + "white";
			case 5: return super.getUnlocalizedName() + "." + "black";
			case 6: return super.getUnlocalizedName() + "." + "purple";
			case 7: return super.getUnlocalizedName() + "." + "orange";
			case 8: return super.getUnlocalizedName() + "." + "brown";
			case 9: return super.getUnlocalizedName() + "." + "pink";
			default: return super.getUnlocalizedName() + "." + "red";
		}
	}
	
	@Override
	public void getSubItems(Item itemIn, CreativeTabs tab, NonNullList<ItemStack> subItems) {
	    subItems.add(new ItemStack(itemIn, 1, 0));
	    subItems.add(new ItemStack(itemIn, 1, 1));
	    subItems.add(new ItemStack(itemIn, 1, 2));
	    subItems.add(new ItemStack(itemIn, 1, 3));
	    subItems.add(new ItemStack(itemIn, 1, 4));
	    subItems.add(new ItemStack(itemIn, 1, 5));
	    subItems.add(new ItemStack(itemIn, 1, 6));
	    subItems.add(new ItemStack(itemIn, 1, 7));
	    subItems.add(new ItemStack(itemIn, 1, 8));
	    subItems.add(new ItemStack(itemIn, 1, 9));
	}
	
	@Override 
	public ItemStack getSubItemMetaByID(int ID, MItemFood cls){
		return super.getSubItemMetaByID(ID, cls);
	}
}
