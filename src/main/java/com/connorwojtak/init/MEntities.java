package com.connorwojtak.init;

import scala.tools.nsc.doc.model.ModelFactory;

import com.connorwojtak.common.OreGalore;
import com.connorwojtak.entity.EntityFireCreeper;
import com.connorwojtak.entity.EntityTameableCreeper;
import com.connorwojtak.entity.render.FireCreeperRenderer;
import com.connorwojtak.entity.render.TameableCreeperRenderer;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class MEntities {
	private static int entityID = -1;
	private static boolean error = false;
	
	public static boolean registerEntities(){
		if(registerEntity("fire_creeper", EntityFireCreeper.class, entityID++, new FireCreeperRenderer<EntityFireCreeper>(Minecraft.getMinecraft().getRenderManager()), 16711680, 65536) == false) error = true;
		//if(registerEntity("tameable_creeper", EntityTameableCreeper.class, entityID++, new TameableCreeperRenderer<EntityTameableCreeper>(Minecraft.getMinecraft().getRenderManager()), 65536, 255) == false) error = true;
		addEntitiesToBiomes();
		return true;
	}
	
	private static <T extends Entity> boolean registerEntity(String name, Class<T> cls, int id, IRenderFactory<? super T> renderer, int egg1, int egg2){
		try {
			ResourceLocation registry = new ResourceLocation(OreGalore.MODID + ":" + name);
			EntityRegistry.registerModEntity(registry, cls, name, id, OreGalore.instance, 64, 1, true, egg1, egg2);
			RenderingRegistry.registerEntityRenderingHandler(cls, renderer);
			return true;
		}
		catch(Exception e){
			OreGalore.OG_LOGGER.error("Failed to load entity: " + name + ", " + e);
			return false;
		}
	}
	
	private static <T extends Entity> boolean registerEntity(String name, Class<T> cls, int id, IRenderFactory<? super T> renderer){
		try {
			ResourceLocation registry = new ResourceLocation(OreGalore.MODID + ":" + name);
			EntityRegistry.registerModEntity(registry, cls, name, id, OreGalore.instance, 64, 1, true);
			RenderingRegistry.registerEntityRenderingHandler(cls, renderer);
			return true;
		}
		catch(Exception e){
			OreGalore.OG_LOGGER.error("Failed to load entity: " + name + ", " + e);
			return false;
		}
	}
	
	private static void addEntitiesToBiomes(){
		EntityRegistry.addSpawn(EntityFireCreeper.class, 100, 1, 3, EnumCreatureType.MONSTER, Biomes.BEACH, Biomes.BIRCH_FOREST, Biomes.BIRCH_FOREST_HILLS,
		Biomes.DESERT, Biomes.DESERT_HILLS, Biomes.EXTREME_HILLS, Biomes.EXTREME_HILLS_EDGE, Biomes.EXTREME_HILLS_WITH_TREES, Biomes.FOREST, Biomes.FOREST_HILLS,
		Biomes.JUNGLE, Biomes.JUNGLE_EDGE, Biomes.JUNGLE_HILLS, Biomes.MUTATED_DESERT, Biomes.MESA, Biomes.MESA_CLEAR_ROCK, Biomes.MUTATED_EXTREME_HILLS,
		Biomes.MESA_ROCK, Biomes.MUTATED_BIRCH_FOREST, Biomes.MUTATED_BIRCH_FOREST_HILLS, Biomes.MUTATED_EXTREME_HILLS_WITH_TREES, Biomes.MUTATED_FOREST,
		Biomes.MUTATED_JUNGLE, Biomes.MUTATED_JUNGLE_EDGE, Biomes.MUTATED_MESA, Biomes.MUTATED_MESA_CLEAR_ROCK, Biomes.MUTATED_MESA_ROCK, Biomes.MUTATED_PLAINS,
		Biomes.MUTATED_REDWOOD_TAIGA, Biomes.MUTATED_REDWOOD_TAIGA_HILLS, Biomes.MUTATED_ROOFED_FOREST, Biomes.MUTATED_SAVANNA, Biomes.MUTATED_SAVANNA,
		Biomes.MUTATED_SAVANNA_ROCK, Biomes.MUTATED_SWAMPLAND, Biomes.MUTATED_TAIGA, Biomes.PLAINS, Biomes.REDWOOD_TAIGA, Biomes.REDWOOD_TAIGA_HILLS,
		Biomes.ROOFED_FOREST, Biomes.SAVANNA, Biomes.SAVANNA_PLATEAU, Biomes.STONE_BEACH, Biomes.SWAMPLAND, Biomes.TAIGA, Biomes.TAIGA_HILLS);
		
		//EntityRegistry.addSpawn(EntityTameableCreeper.class, 100, 1, 3, EnumCreatureType.CREATURE, Biomes.BEACH, Biomes.BIRCH_FOREST, Biomes.BIRCH_FOREST_HILLS,
		//Biomes.FOREST, Biomes.FOREST_HILLS, Biomes.JUNGLE, Biomes.JUNGLE_EDGE, Biomes.JUNGLE_HILLS, Biomes.MUTATED_DESERT, Biomes.MESA, Biomes.MESA_CLEAR_ROCK,
		//Biomes.MESA_ROCK, Biomes.PLAINS, Biomes.REDWOOD_TAIGA, Biomes.REDWOOD_TAIGA_HILLS, Biomes.ROOFED_FOREST, Biomes.SAVANNA, Biomes.SAVANNA_PLATEAU, 
		//Biomes.STONE_BEACH, Biomes.TAIGA, Biomes.TAIGA_HILLS);
	}
}
