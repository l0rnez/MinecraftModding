package com.lornez.testMod.items;

import com.lornez.testMod.Main;
import com.lornez.testMod.init.ModItems;
import com.lornez.testMod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		EntityLivingBase player = (EntityLivingBase) entityIn;
		EntityPlayer entityPlayer = (EntityPlayer) entityIn;
		/**
		 * 
		 * 
		 * doesn't work
		 * 
		 * 
		 * 
		 */
		if(entityPlayer.getHeldEquipment() == ModItems.PURPLE_DUST) {
//			player.addPotionEffect(new PotionEffect(MobEffects.LEVITATION, 5, 30, false, true));
		}
	}
}
