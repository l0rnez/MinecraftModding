package com.lornez.testMod.init;

import java.util.ArrayList;
import java.util.List;

import com.lornez.testMod.items.ItemBase;
import com.lornez.testMod.items.armor.ArmorBase;
import com.lornez.testMod.items.food.FoodBase;
import com.lornez.testMod.items.food.FoodEffectBase;
import com.lornez.testMod.items.tools.ToolCloudSword;
import com.lornez.testMod.items.tools.ToolSword;
import com.lornez.testMod.items.tools.ToolVisionSword;
import com.lornez.testMod.util.Reference;

import akka.japi.Effect;
import net.minecraft.block.material.Material;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Items
	public static final Item PURPLE_DUST = new ItemBase("purple_dust");
	public static final Item EMERALD_INGOT = new ItemBase("emerald_ingot");
	
	//Materials
	public static final ToolMaterial MATERIAL_PURPLE = EnumHelper.addToolMaterial("material_purple", 4, 10000, 9.0F, 4.0F, 10);
	public static final ArmorMaterial ARMOR_MATERIAL_PURPLE = EnumHelper.addArmorMaterial("armor_material_purple", Reference.MOD_ID + ":purple_dust", 14, 
			new int[] {2, 5, 7, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	
	//Food
//	public static final Item PURPLE_APPLE = new FoodBase("purple_apple", 4, 2.4f, false);
//	public static final Item PURPLE_APPLE = new FoodEffectBase("purple_apple", 4, 2.4f, false, new PotionEffect(MobEffects.LEVITATION, 10, 25, false, true));
	public static final Item PURPLE_APPLE = new FoodEffectBase("purple_apple", 4, 2.4f, false, new PotionEffect(MobEffects.HEALTH_BOOST, (60*60), 4, false, true), new PotionEffect(MobEffects.REGENERATION, 22, 25, false, true), new PotionEffect(MobEffects.NAUSEA, (60*5), 5, false, true));
	
	//Tools
	public static final ItemSword PURPLE_SWORD = new ToolVisionSword("purple_sword", MATERIAL_PURPLE);
	
	//Armor
	public static final Item PURPLE_BOOTS = new ArmorBase("purple_boots", ARMOR_MATERIAL_PURPLE, 1, EntityEquipmentSlot.FEET, new PotionEffect(MobEffects.SPEED, 5, 1,false, false));
}
