package com.connorwojtak.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class StandardBlock extends Block {
	
	public StandardBlock(Material material, String name, float hardness, float resistance){
		super(material);
		this.setHardness(hardness);
		this.setUnlocalizedName(name);
		this.setResistance(resistance);
		this.setRegistryName(name);
	}
	
	@Deprecated
	public StandardBlock(Material material) {
		super(material);
	}

}
