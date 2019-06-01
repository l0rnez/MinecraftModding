package com.lornez.testMod.init;

import com.lornez.testMod.world.dimension.levitate.DimensionLevitate;

import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;

public class DimensionInit 
{
	public static final DimensionType LEVITATE = DimensionType.register("Levitate", "_levitate", 2, DimensionLevitate.class, false);
	
	public static void registerDimensions()
	{
		DimensionManager.registerDimension(2, LEVITATE);
	}
}
