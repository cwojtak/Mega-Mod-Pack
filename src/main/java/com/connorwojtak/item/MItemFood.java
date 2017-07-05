package com.connorwojtak.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
//For when minecraft screws you and doesn't include a subitems function when it exists in its superclass.
public class MItemFood extends Item
{	
	
	public static ItemFood theitem;
    /** Number of ticks to run while 'EnumAction'ing until result. */
    public final int itemUseDuration;
    /** The amount this food item heals the player. */
    private final int healAmount;
    private final float saturationModifier;
    /** Whether wolves like this food (true for raw and cooked porkchop). */
    private final boolean isWolfsFavoriteMeat;
    /** If this field is true, the food can be consumed even if the player don't need to eat. */
    private boolean alwaysEdible;
    /** represents the potion effect that will occurr upon eating this food. Set by setPotionEffect */
    private PotionEffect potionId;
    /** probably of the set potion effect occurring */
    private float potionEffectProbability;

    public MItemFood(int amount, float saturation, boolean isWolfFood)
    {
        this.itemUseDuration = 32;
        this.healAmount = amount;
        this.isWolfsFavoriteMeat = isWolfFood;
        this.saturationModifier = saturation;
        theitem = new ItemFood(amount, saturation, isWolfFood);
        theitem.setCreativeTab(CreativeTabs.FOOD);
    }

    public MItemFood(int amount, boolean isWolfFood)
    {
        this(amount, 0.6F, isWolfFood);
        theitem = new ItemFood(amount, isWolfFood);
    }

    /**
     * Called when the player finishes using this Item (E.g. finishes eating.). Not called when the player stops using
     * the Item before the action is complete.
     */
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving)
    {
        stack.func_190918_g(1);

        if (entityLiving instanceof EntityPlayer)
        {
            EntityPlayer entityplayer = (EntityPlayer)entityLiving;
            entityplayer.getFoodStats().addStats(theitem, stack);
            worldIn.playSound((EntityPlayer)null, entityplayer.posX, entityplayer.posY, entityplayer.posZ, SoundEvents.ENTITY_PLAYER_BURP, SoundCategory.PLAYERS, 0.5F, worldIn.rand.nextFloat() * 0.1F + 0.9F);
            this.onFoodEaten(stack, worldIn, entityplayer);
            entityplayer.addStat(StatList.getObjectUseStats(this));
        }

        return stack;
    }

    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
    {
        if (!worldIn.isRemote && this.potionId != null && worldIn.rand.nextFloat() < this.potionEffectProbability)
        {
            player.addPotionEffect(new PotionEffect(this.potionId));
        }
    }

    /**
     * How long it takes to use or consume an item
     */
    public int getMaxItemUseDuration(ItemStack stack)
    {
        return 32;
    }

    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    public EnumAction getItemUseAction(ItemStack stack)
    {
        return EnumAction.EAT;
    }

    /**
     * Called when the equipped item is right clicked.
     */
    public ActionResult<ItemStack> onItemRightClick(World itemStackIn, EntityPlayer worldIn, EnumHand playerIn)
    {
        ItemStack itemstack = worldIn.getHeldItem(playerIn);

        if (worldIn.canEat(this.alwaysEdible))
        {
            worldIn.setActiveHand(playerIn);
            return new ActionResult(EnumActionResult.SUCCESS, itemstack);
        }
        else
        {
            return new ActionResult(EnumActionResult.FAIL, itemstack);
        }
    }

    public int getHealAmount(ItemStack stack)
    {
        return this.healAmount;
    }

    public float getSaturationModifier(ItemStack stack)
    {
        return this.saturationModifier;
    }

    /**
     * Whether wolves like this food (true for raw and cooked porkchop).
     */
    public boolean isWolfsFavoriteMeat()
    {
        return this.isWolfsFavoriteMeat;
    }

    public MItemFood setPotionEffect(PotionEffect p_185070_1_, float p_185070_2_)
    {
        this.potionId = p_185070_1_;
        this.potionEffectProbability = p_185070_2_;
        return this;
    }

    /**
     * Set the field 'alwaysEdible' to true, and make the food edible even if the player don't need to eat.
     */
    public MItemFood setAlwaysEdible()
    {
        this.alwaysEdible = true;
        return this;
    }
    
    @Override
    public void getSubItems(Item itemIn, CreativeTabs tab, NonNullList<ItemStack> subItems)
    {
        subItems.add(new ItemStack(itemIn));
    }
    
	public ItemStack getSubItemMetaByID(int ID, MItemFood cls){
		if(ID > 9){ return null; }
		return new ItemStack(cls, 1, ID);
	}
}