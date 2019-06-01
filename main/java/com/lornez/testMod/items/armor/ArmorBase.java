package com.lornez.testMod.items.armor;

import com.lornez.testMod.Main;
import com.lornez.testMod.commands.util.CustomTeleporter;
import com.lornez.testMod.init.ModItems;
import com.lornez.testMod.util.IHasModel;

import net.java.games.input.Keyboard;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ArmorBase extends ItemArmor implements IHasModel {
	
	private final PotionEffect potionEffect;
	int coolDown = 0;
	
	public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn, PotionEffect potionEffect) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		this.potionEffect = potionEffect;
		ModItems.ITEMS.add(this);
	}
	
	
	//Effekt wenn man die armor trägt
	@Override
	public void onArmorTick(final World world, final EntityPlayer player, final ItemStack itemStack) {
		if (!player.isPotionActive(potionEffect.getPotion())) {
//			player.addPotionEffect(new PotionEffect(potionEffect));
		}
		if(player.isSneaking() && coolDown >= 0) {
			player.addPotionEffect(new PotionEffect(MobEffects.LEVITATION, 5, 30, false, true));
			float yaw = player.rotationYaw;
			float pitch = player.rotationPitch;
			float f = 1.0F;
			double motionX = (double)(-MathHelper.sin(yaw / 180.0F * (float)Math.PI) * MathHelper.cos(pitch / 180.0F * (float)Math.PI) * f);
			double motionZ = (double)(MathHelper.cos(yaw / 180.0F * (float)Math.PI) * MathHelper.cos(pitch / 180.0F * (float)Math.PI) * f);
			double motionY = (double)(-MathHelper.sin((pitch) / 180.0F * (float)Math.PI) * f);
			player.setVelocity(motionX, motionY+1.3, motionZ);
			player.setVelocity(motionX, -0.1, motionZ);
		}
		player.fallDistance = 0.0F;
	}
	
	@Override
	public void onUpdate(ItemStack itemstack, World world, Entity entity, int i, boolean B) {
		if(coolDown > 0) coolDown--;
	}
	
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {
		return itemStack;
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}