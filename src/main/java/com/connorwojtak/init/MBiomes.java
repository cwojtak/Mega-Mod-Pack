package com.connorwojtak.init;

import com.connorwojtak.common.OreGalore;
import com.connorwojtak.world.BiomeFireLand;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.BiomeProperties;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;

public class MBiomes {
	public static boolean registerBiomes(){
		try {
			BiomeManager.addBiome(BiomeType.WARM, new BiomeEntry(new BiomeFireLand(new BiomeProperties("fire_lands")), 1000000000));
			BiomeManager.addSpawnBiome(new BiomeFireLand(new BiomeProperties("fire_lands")));
			BiomeManager.addStrongholdBiome(new BiomeFireLand(new BiomeProperties("fire_lands")));
			return true;
		}
		catch(Exception e){
			return false;
		}
	}
}
