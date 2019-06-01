package com.lornez.testMod.items.tools;

import com.lornez.testMod.Main;
import com.lornez.testMod.init.ModItems;
import com.lornez.testMod.util.IHasModel;

import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;

public class ToolCloudSword extends ToolSword implements IHasModel {

	public ToolCloudSword(String name, ToolMaterial material) {
		super(name, material);
	}

	public boolean hitEntity(ItemStack itemStack, EntityLivingBase entityLivingBase1, EntityLivingBase entityLivingBase2) {
		entityLivingBase1.addPotionEffect(new PotionEffect(MobEffects.LEVITATION, 5, 30, false, true));
//		entityLivingBase1.world.spawnParticle(EnumParticleTypes.CLOUD, entityLivingBase1.posX, entityLivingBase1.posY, entityLivingBase1.posZ, 1.0D, 1.0D, 1.0D);
//		entityLivingBase1.world.spawnParticle(EnumParticleTypes.CLOUD, entityLivingBase1.posX + 1, entityLivingBase1.posY, entityLivingBase1.posZ, 5.0D, 5.0D, 5.0D);
//		entityLivingBase1.world.spawnParticle(EnumParticleTypes.FLAME, entityLivingBase1.posX + 1, entityLivingBase1.posY, entityLivingBase1.posZ, 5.0D, 5.0D, 5.0D);
		return true;
	}
}
