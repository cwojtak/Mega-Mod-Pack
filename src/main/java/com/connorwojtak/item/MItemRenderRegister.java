package com.connorwojtak.item;

import com.connorwojtak.common.MegaModPack;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelManager;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.crash.CrashReport;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ReportedException;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.ModelLoaderRegistry.LoaderException;

public class MItemRenderRegister {

	public static final String MODID = MegaModPack.MODID; 
	public static boolean noErrors = true;
	
	public static void registerItemRenderer(){
		for(int i = 0; i < MItems.itemList.size(); i++){
			try {
				reg(MItems.itemList.get(i));
			}
			catch(NullPointerException e){
				MegaModPack.MMP_GLOBAL_LOGGER.error("FAILED TO REGISTER MODEL. TRACEBACK: \n");
				e.printStackTrace();
				noErrors = false;
			}
		}
	}
	
	public static void preInit(){
		final ModelResourceLocation CottonCandyBlue = new ModelResourceLocation(MODID + ":cotton_candy_blue", "inventory");
		final ModelResourceLocation CottonCandyRed = new ModelResourceLocation(MODID + ":cotton_candy_red", "inventory");
		
		ModelBakery.registerItemVariants(MItems.CottonCandy, CottonCandyBlue, CottonCandyRed);
        ModelLoader.setCustomMeshDefinition(MItems.CottonCandy, new ItemMeshDefinition() {
        	@Override
            public ModelResourceLocation getModelLocation(ItemStack stack) {
            	final int meta = stack.getItem().getMetadata(stack);
            	if (meta == 1){ return CottonCandyBlue; } if (meta == 0){ return CottonCandyRed; } return null; }});

}
    
	public static void reg(Item item) {
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
	    .register(item, 0, new ModelResourceLocation(MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}

