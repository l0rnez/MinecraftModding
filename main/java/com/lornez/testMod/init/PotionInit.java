/**package com.lornez.testMod.init;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.Items;
import net.minecraft.init.PotionTypes;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionHelper;
import net.minecraft.potion.PotionType;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import potions.CustomPotion;

public class PotionInit {

	public static final Potion TEST_POTION_EFFECT = new CustomPotion("test_potion", false, 11879586, 0, 0).registerPotionAttributeModifier(SharedMonsterAttributes.ARMOR, MathHelper.getRandomUUID().toString(), 3.0D, 2);
	public static final PotionType TEST_POTION = new PotionType("test_potion", new PotionEffect[] {new PotionEffect(TEST_POTION_EFFECT, 2400)}).setRegistryName("test_potion");
	public static final PotionType LONG_TEST_POTION = new PotionType("test_potion", new PotionEffect[] {new PotionEffect(TEST_POTION_EFFECT, 4800)}).setRegistryName("long_test_potion");
	
	public static void registerPotions() {
		registerPotion(TEST_POTION, LONG_TEST_POTION, TEST_POTION_EFFECT);
		registerPotionMixes();
	}
	
	private static void registerPotion(PotionType defaultPotion, PotionType longPotion, Potion effect) {
		ForgeRegistries.POTIONS.register(effect);
		ForgeRegistries.POTION_TYPES.register(defaultPotion);
		ForgeRegistries.POTION_TYPES.register(longPotion);
	}
	
	private static void registerPotionMixes() {
		PotionHelper.addMix(TEST_POTION, Items.REDSTONE, LONG_TEST_POTION);
		PotionHelper.addMix(PotionTypes.AWKWARD, ModItems.PURPLE_DUST, TEST_POTION);
	}
}
*/