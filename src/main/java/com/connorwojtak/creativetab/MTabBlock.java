package com.connorwojtak.creativetab;

import com.connorwojtak.init.MBlocks;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MTabBlock extends CreativeTabs{

	public MTabBlock(String label) {
		super(label);
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(Item.getItemFromBlock(MBlocks.CopperOre));
	}

}
