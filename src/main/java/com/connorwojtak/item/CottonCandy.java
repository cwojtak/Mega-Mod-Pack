package com.connorwojtak.item;

import java.util.List;

import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class CottonCandy extends ItemFood{
	
	public CottonCandy(int amount, float saturation, boolean isWolfFood, String name) {
		super(amount, saturation, isWolfFood);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(MItems.tabItem);
		this.setAlwaysEdible();
		this.setPotionEffect(new PotionEffect(Potion.getPotionById(1), 159, 1, true, true), saturation);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
	    return super.getUnlocalizedName() + "." + (stack.getItemDamage() == 0 ? "red" : "blue");
	}

	@Override
	public void getSubItems(Item itemIn, CreativeTabs tab, List subItems) {
	    subItems.add(new ItemStack(itemIn, 1, 0));
	    subItems.add(new ItemStack(itemIn, 1, 1));
	}
}
