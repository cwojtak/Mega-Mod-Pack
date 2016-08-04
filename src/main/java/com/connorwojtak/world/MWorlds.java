package com.connorwojtak.world;

import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraftforge.common.DimensionManager;

public class MWorlds {
	public static DimensionType DimensionTypeMars = DimensionType.register("Mars", "_mars", 2, WorldProviderMars.class, false);
	public static void registerBiomes(){
	}
	
	public static void registerDimensions(){
		DimensionManager.registerDimension(2, DimensionTypeMars);
	}
}
