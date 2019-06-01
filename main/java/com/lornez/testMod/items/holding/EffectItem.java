/**package com.lornez.testMod.items.holding;

import com.lornez.testMod.init.ModItems;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class EffectItem extends Item {

	public EffectItem(String unlocalizedName) {
		super();
		this.setUnlocalizedName(unlocalizedName);
		this.setMaxStackSize(1);
	}
	
	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		EntityLivingBase player = (EntityLivingBase) entityIn;
		if(stack.getItem() == ModItems.PURPLE_DUST) {
			player.addPotionEffect(new PotionEffect(MobEffects.LEVITATION, 5, 30, false, true));
		}
	}
}
*/