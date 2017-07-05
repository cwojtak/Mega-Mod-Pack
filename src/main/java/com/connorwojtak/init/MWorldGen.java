package com.connorwojtak.init;

import java.util.Random;

import com.connorwojtak.common.CommonProxy;
import com.connorwojtak.common.OreGalore;
import com.connorwojtak.world.BiomeFireLand;
import com.connorwojtak.world.gen.ComponentHumanStrongholdStructure;
import com.connorwojtak.world.gen.HumanStrongholdStructureGenerator;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DimensionType;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.BiomeProperties;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.world.gen.structure.MapGenStructure;
import net.minecraft.world.gen.structure.MapGenStructureIO;
import net.minecraft.world.gen.structure.StructureStart;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.fml.common.IWorldGenerator;

public class MWorldGen implements IWorldGenerator {
	
	private WorldGenerator gen_copper_ore;
	private WorldGenerator gen_titanium_ore;
	private WorldGenerator gen_explosion_stone;
	private MapGenStructure gen_human_stronghold;
	private BiomeFireLand gen_fire_lands;
	
	@Override
	//Ore Generator
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
	    switch (world.provider.getDimension()) {
	    case 0: 
	    	this.runGenerator(this.gen_copper_ore, world, random, chunkX, chunkZ, 1, 0, 64);
	    	this.runGenerator(this.gen_titanium_ore, world, random, chunkX, chunkZ, 1, 0, 32);
	    	this.runGenerator(this.gen_explosion_stone, world, random, chunkX, chunkZ, 1, 0, 200);
	    	this.runGenerator(this.gen_human_stronghold, world, random, chunkX, chunkZ, 1, 0, 200);
	    	this.gen_fire_lands.generateBiomeTerrain(world, random, new ChunkPrimer(), chunkX, chunkZ, 2.0D);
	        break;
	    case -1:
	    	this.runGenerator(this.gen_copper_ore, world, random, chunkX, chunkZ, 1, 0, 64);
	    	this.runGenerator(this.gen_titanium_ore, world, random, chunkX, chunkZ, 1, 0, 32);
	    	this.runGenerator(this.gen_explosion_stone, world, random, chunkX, chunkZ, 1, 0, 200);
	        break;
	    case 1:
	    	this.runGenerator(this.gen_copper_ore, world, random, chunkX, chunkZ, 0, 0, 64);
	    	this.runGenerator(this.gen_titanium_ore, world, random, chunkX, chunkZ, 0, 0, 32);
	    	this.runGenerator(this.gen_explosion_stone, world, random, chunkX, chunkZ, 1, 0, 200);
	        break;
	    }
	}
	
	public MWorldGen(){
		try {
			this.gen_copper_ore = new WorldGenMinable(MBlocks.CopperOre.getDefaultState(), 6);
			this.gen_titanium_ore = new WorldGenMinable(MBlocks.TitaniumOre.getDefaultState(), 8);
			this.gen_explosion_stone = new WorldGenMinable(MBlocks.ExplosionStone.getDefaultState(), 8);
			
			this.gen_fire_lands = new BiomeFireLand(new BiomeProperties("fire_lands"));
			
			MapGenStructureIO.registerStructure(HumanStrongholdStructureGenerator.Start.class, "HumanStronghold");
			ComponentHumanStrongholdStructure.registerScatteredFeaturePieces();
			this.gen_human_stronghold = new HumanStrongholdStructureGenerator();
			
			OreGalore.OG_LOGGER.info("World Generator loaded sucessfully!");
		}
		catch(Exception e){
			OreGalore.OG_LOGGER.error("Error loading world generator: " + e);
		}
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
	
	private void runGenerator(MapGenStructure generator, World world, Random rand, int chunkX, int chunkZ, int chancesToSpawn, int minHeight, int maxHeight){
		if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
	        throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

	    int heightDiff = maxHeight - minHeight + 1;
	    for (int i = 0; i < chancesToSpawn; i ++) {
	        int x = chunkX * 16 + rand.nextInt(16);
	        int z = chunkZ * 16 + rand.nextInt(16);
	        generator.generate(world, x, z, new ChunkPrimer());
	    }
	}
}
