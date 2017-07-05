package com.connorwojtak.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class StandardOre extends Block {
	
	public StandardOre(Material material, String name, float hardness, float resistance){
		super(material);
		this.setHardness(hardness);
		this.setUnlocalizedName(name);
		this.setResistance(resistance);
		this.setRegistryName(name);
	}
	
	@Deprecated
	public StandardOre(Material material) {
		super(material);
	}

}
