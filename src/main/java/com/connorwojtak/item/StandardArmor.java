package com.connorwojtak.item;

import com.connorwojtak.init.MItems;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class StandardArmor extends ItemArmor {

	public StandardArmor(ArmorMaterial material, int renderIndex, EntityEquipmentSlot equipmentSlot, String name) {
		super(material, renderIndex, equipmentSlot);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(MItems.tabArmor);
	}
}
