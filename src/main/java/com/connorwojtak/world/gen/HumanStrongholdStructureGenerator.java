package com.connorwojtak.world.gen;

import com.connorwojtak.common.OreGalore;
import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;

import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityWitherSkeleton;
import net.minecraft.init.Biomes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces;
import net.minecraft.world.gen.structure.MapGenStructure;
import net.minecraft.world.gen.structure.StructureBoundingBox;
import net.minecraft.world.gen.structure.StructureComponent;
import net.minecraft.world.gen.structure.StructureStart;

public class HumanStrongholdStructureGenerator extends MapGenStructure
{
    private static final List<Biome> BIOMELIST = Arrays.<Biome>asList(new Biome[] {Biomes.DESERT, Biomes.DESERT_HILLS, Biomes.JUNGLE, Biomes.JUNGLE_HILLS, Biomes.SWAMPLAND, Biomes.ICE_PLAINS, Biomes.COLD_TAIGA});
    /** contains possible spawns for scattered features */
    private final List<Biome.SpawnListEntry> spawnList;
    /** the maximum distance between scattered features */
    private int maxDistanceBetweenScatteredFeatures;
    /** the minimum distance between scattered features */
    private final int minDistanceBetweenScatteredFeatures;

    private boolean shouldSpawn = true;
    
    public HumanStrongholdStructureGenerator()
    {
        this.spawnList = Lists.<Biome.SpawnListEntry>newArrayList();
        this.maxDistanceBetweenScatteredFeatures = 512;
        this.minDistanceBetweenScatteredFeatures = 256;
        //TODO: Add Humans
        //this.spawnList.add(new Biome.SpawnListEntry(EntityBlaze.class, 10, 2, 3));
        //this.spawnList.add(new Biome.SpawnListEntry(EntityPigZombie.class, 5, 4, 4));
        //this.spawnList.add(new Biome.SpawnListEntry(EntityWitherSkeleton.class, 8, 5, 5));
        //this.spawnList.add(new Biome.SpawnListEntry(EntitySkeleton.class, 2, 5, 5));
        //this.spawnList.add(new Biome.SpawnListEntry(EntityMagmaCube.class, 3, 4, 4));
    }

    public HumanStrongholdStructureGenerator(Map<String, String> p_i2061_1_)
    {
        this();

        for (Entry<String, String> entry : p_i2061_1_.entrySet())
        {
            if (((String)entry.getKey()).equals("distance"))
            {
                this.maxDistanceBetweenScatteredFeatures = MathHelper.parseIntWithDefaultAndMax((String)entry.getValue(), this.maxDistanceBetweenScatteredFeatures, 9);
            }
        }
    }

    public String getStructureName()
    {
        return "HumanStronghold";
    }

    protected boolean canSpawnStructureAtCoords(int chunkX, int chunkZ)
    {
        int i = chunkX;
        int j = chunkZ;

        if (chunkX < 0)
        {
            chunkX -= this.maxDistanceBetweenScatteredFeatures - 1;
        }

        if (chunkZ < 0)
        {
            chunkZ -= this.maxDistanceBetweenScatteredFeatures - 1;
        }

        int k = chunkX / this.maxDistanceBetweenScatteredFeatures;
        int l = chunkZ / this.maxDistanceBetweenScatteredFeatures;
        Random random = this.worldObj.setRandomSeed(k, l, 14357617);
        k = k * this.maxDistanceBetweenScatteredFeatures;
        l = l * this.maxDistanceBetweenScatteredFeatures;
        k = k + random.nextInt(this.maxDistanceBetweenScatteredFeatures - 8);
        l = l + random.nextInt(this.maxDistanceBetweenScatteredFeatures - 8);

        if (i == k && j == l)
        {
            Biome biome = this.worldObj.getBiomeProvider().getBiome(new BlockPos(i * 16 + 8, 0, j * 16 + 8));

            if (biome == null)
            {
                return false;
            }

            for (Biome biome1 : BIOMELIST)
            {
                if (biome == biome1)
                {
                	int num1 = i;
                	int num2 = j;
                    return true;
                }
            }
        }
        return false;
    }

	public BlockPos getClosestStrongholdPos(World worldIn, BlockPos pos, boolean p_180706_3_)
    {
        this.worldObj = worldIn;
        return func_191069_a(worldIn, this, pos, this.maxDistanceBetweenScatteredFeatures, 8, 14357617, false, 100, p_180706_3_);
    }

    protected StructureStart getStructureStart(int chunkX, int chunkZ)
    {
        return new HumanStrongholdStructureGenerator.Start(this.worldObj, this.rand, chunkX, chunkZ);
    }

    /**
     * returns possible spawns for scattered features
     */
    public List<Biome.SpawnListEntry> getScatteredFeatureSpawnList()
    {
        return this.spawnList;
    }

    public static class Start extends StructureStart
        {
            public Start()
            {
            }

            public Start(World worldIn, Random random, int chunkX, int chunkZ)
            {
                this(worldIn, random, chunkX, chunkZ, worldIn.getBiome(new BlockPos(chunkX * 16 + 8, 0, chunkZ * 16 + 8)));
            }

            public Start(World worldIn, Random random, int chunkX, int chunkZ, Biome biomeIn)
            {
                super(chunkX, chunkZ);
                ComponentHumanStrongholdStructure.Stronghold componenthumanstrongholdstructure$stronghold = new ComponentHumanStrongholdStructure.Stronghold(random, chunkX, 64, chunkZ, 16, 19, 17);
                componenthumanstrongholdstructure$stronghold.addComponentParts(worldIn, random, componenthumanstrongholdstructure$stronghold.getBoundingBox());
                this.components.add(componenthumanstrongholdstructure$stronghold);
                this.updateBoundingBox();
            }
        }
}