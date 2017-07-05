package com.connorwojtak.creativetab;

import com.connorwojtak.init.MItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MTabItem extends CreativeTabs{

	public MTabItem(String label) {
		super(label);
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(MItems.CopperIngot);
	}

}
