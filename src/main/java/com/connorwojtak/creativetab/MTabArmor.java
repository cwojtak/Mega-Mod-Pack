package com.connorwojtak.creativetab;

import com.connorwojtak.init.MItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MTabArmor extends CreativeTabs{

	public MTabArmor(String label) {
		super(label);
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(MItems.CopperHelmet);
	}

}
