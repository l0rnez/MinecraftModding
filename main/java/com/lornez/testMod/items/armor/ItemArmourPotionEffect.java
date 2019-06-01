package com.lornez.testMod.items.armor;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemArmourPotionEffect extends ItemArmor {

	private final PotionEffect potionEffect;

	public ItemArmourPotionEffect(final ArmorMaterial material, final EntityEquipmentSlot equipmentSlot, final PotionEffect potionEffect) {
		super(material, -1, equipmentSlot);
		this.potionEffect = potionEffect;
	}

	@Override
	public void onArmorTick(final World world, final EntityPlayer player, final ItemStack itemStack) {
		if (!player.isPotionActive(potionEffect.getPotion())) { // If the Potion isn't currently active,
			player.addPotionEffect(new PotionEffect(potionEffect)); // Apply a copy of the PotionEffect to the player
		}
	}
}
