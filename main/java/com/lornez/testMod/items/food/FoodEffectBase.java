package com.lornez.testMod.items.food;

import com.lornez.testMod.commands.util.CustomTeleporter;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class FoodEffectBase extends FoodBase {

	PotionEffect effect;
	PotionEffect effect2;
	PotionEffect effect3;
	
	public FoodEffectBase(String name, int amount, float saturation, boolean isAnimalFood, PotionEffect effect, PotionEffect effect2, PotionEffect effect3) {
		super(name, amount, saturation, isAnimalFood);
		setAlwaysEdible();
		this.effect = effect;
		this.effect2 = effect2;
		this.effect3 = effect3;
	}
	
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		if(!worldIn.isRemote) {
			player.addPotionEffect(new PotionEffect(effect.getPotion(), effect.getDuration(), effect.getAmplifier(), effect.getIsAmbient(), effect.doesShowParticles()));
			if(effect2 != null) {
				player.addPotionEffect(new PotionEffect(effect2.getPotion(), effect2.getDuration(), effect2.getAmplifier(), effect2.getIsAmbient(), effect2.doesShowParticles()));
				CustomTeleporter.teleportToDimension(player, 2, player.getPosition().getX(), player.getPosition().getY()+ 5, player.getPosition().getZ());
			}
			if(effect3 != null) {
				player.addPotionEffect(new PotionEffect(effect3.getPotion(), effect3.getDuration(), effect3.getAmplifier(), effect3.getIsAmbient(), effect3.doesShowParticles()));
			}		
		}
	}
	
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack stack) {
		return true;
	}
}
