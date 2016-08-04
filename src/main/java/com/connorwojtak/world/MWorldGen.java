package com.connorwojtak.world;

import java.util.Random;

import com.connorwojtak.block.MBlocks;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DimensionType;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.BiomeProperties;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.fml.common.IWorldGenerator;

public class MWorldGen implements IWorldGenerator{
	
	private WorldGenerator gen_copper_ore;
	
	@Override
	//Ore Generator
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
	    switch (world.provider.getDimension()) {
	    case 0: 
	    	this.runGenerator(this.gen_copper_ore, world, random, chunkX, chunkZ, 20, 0, 80);
	        break;
	    case -1:
	    	this.runGenerator(this.gen_copper_ore, world, random, chunkX, chunkZ, 1, 0, 64);
	        break;
	    case 1:
	    	this.runGenerator(this.gen_copper_ore, world, random, chunkX, chunkZ, 0, 0, 64);
	        break;
	    }
	}
	
	public MWorldGen(){
		this.gen_copper_ore = new WorldGenMinable(MBlocks.CopperOre.getDefaultState(), 6);
	}
	
	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
	    if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
	        throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

	    int heightDiff = maxHeight - minHeight + 1;
	    for (int i = 0; i < chancesToSpawn; i ++) {
	        int x = chunk_X * 16 + rand.nextInt(16);
	        int y = minHeight + rand.nextInt(heightDiff);
	        int z = chunk_Z * 16 + rand.nextInt(16);
	        generator.generate(world, rand, new BlockPos(x, y, z));
	    }
	}
}
