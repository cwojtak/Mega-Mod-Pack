package com.connorwojtak.creativetab;

import com.connorwojtak.item.MItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MTabArmor extends CreativeTabs{

	public MTabArmor(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return MItems.CopperHelmet;
	}

}
