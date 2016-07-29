package com.connorwojtak.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.client.event.GuiScreenEvent.PotionShiftEvent;

public class PotionArmor extends ItemArmor{

	public PotionArmor(ArmorMaterial material, int renderIndex, EntityEquipmentSlot equipmentSlot, String name) {
		super(material, renderIndex, equipmentSlot);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(MItems.tabArmor);
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
	    if (itemStack.getItem() == MItems.CopperHelmet) {
	        effectPlayer(player, Potion.getPotionById(13), 1, 13);
	    }
	    if (itemStack.getItem() == MItems.CopperChestplate) {
	        effectPlayer(player, Potion.getPotionById(5), 1, 5);
	    }
	    if (itemStack.getItem() == MItems.CopperLeggings) {
	        effectPlayer(player, Potion.getPotionById(16), 1, 16);
	    }
	    if (itemStack.getItem() == MItems.CopperBoots) {
	        effectPlayer(player, Potion.getPotionById(1), 1, 1);
	    }
	} 

	private void effectPlayer(EntityPlayer player, Potion potion, int amplifier, int id) {
	    if (player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration() <= 1)
	        player.addPotionEffect(new PotionEffect(Potion.getPotionById(id), 159, amplifier, true, true));
	}
	
}
