package com.lornez.testMod.items.tools;

import com.lornez.testMod.util.IHasModel;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;

public class ToolVisionSword extends ToolSword implements IHasModel {

	public ToolVisionSword(String name, ToolMaterial material) {
		super(name, material);
	}

	public boolean hitEntity(ItemStack itemStack, EntityLivingBase entityLivingBase1, EntityLivingBase entityLivingBase2) {
		entityLivingBase1.addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, (15*5), 0, false, true));
		entityLivingBase1.addPotionEffect(new PotionEffect(MobEffects.GLOWING, (600), 0, false, true));
		return true;
		
	}
}
