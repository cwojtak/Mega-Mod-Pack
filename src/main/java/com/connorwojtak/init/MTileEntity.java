package com.connorwojtak.init;

import com.connorwojtak.common.OreGalore;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class MTileEntity {
	public static boolean registerTileEntities(){
		try {
			return true;
		}
		catch(Exception e) {
			OreGalore.OG_LOGGER.error("Error loading tile entities: " + e);
			return false;
		}
	}
}
