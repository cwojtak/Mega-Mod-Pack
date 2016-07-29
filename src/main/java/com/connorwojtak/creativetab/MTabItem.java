package com.connorwojtak.creativetab;

import com.connorwojtak.item.MItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MTabItem extends CreativeTabs{

	public MTabItem(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return MItems.CopperIngot;
	}

}
