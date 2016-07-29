package com.connorwojtak.creativetab;

import com.connorwojtak.block.MBlocks;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MTabBlock extends CreativeTabs{

	public MTabBlock(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(MBlocks.CopperOre);
	}

}
