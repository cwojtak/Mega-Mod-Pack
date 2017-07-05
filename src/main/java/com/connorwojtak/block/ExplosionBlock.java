package com.connorwojtak.block;

import java.util.Collection;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityAreaEffectCloud;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
 
public class ExplosionBlock extends Block {
	
	public ExplosionBlock(Material blockMaterialIn, String name, float hardness, float resistance) {
		super(blockMaterialIn);
		this.setHardness(hardness);
		this.setUnlocalizedName(name);
		this.setResistance(resistance);
		this.setRegistryName(name);
	}
	
	@Deprecated
	public ExplosionBlock(Material blockMaterialIn){
		super(blockMaterialIn);
	}
	
	@Override
	public void onBlockDestroyedByPlayer(World worldObj, BlockPos pos, IBlockState state){
		explode(worldObj, pos);
	}

	private void explode(World worldObj, BlockPos pos) {
		EntityExplosionPrimed a = new EntityExplosionPrimed(worldObj, (double)((float)pos.getX() + 0.5F), (double)pos.getY(), (double)((float)pos.getZ() + 0.5F), (EntityLivingBase)null);
		worldObj.spawnEntityInWorld(a);
    }
    
    @Override
    public List<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune){
		return null;
    }
    
    @Override
    public void onBlockDestroyedByExplosion(World worldIn, BlockPos pos, Explosion explosionIn)
    {
    }
    
    @Override
    public void dropBlockAsItemWithChance(World worldIn, BlockPos pos, IBlockState state, float chance, int fortune){
    }
}
