package com.lornez.testMod.world.biomes;

import com.lornez.testMod.init.ModBlocks;
import com.lornez.testMod.init.ModItems;

import net.minecraft.block.BlockDirt;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.util.EnumHand;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.BiomeProperties;

public class BiomeLevitate extends Biome {

	public BiomeLevitate() {
		super(new BiomeProperties("Levitate").setBaseHeight(1.2F).setHeightVariation(1.2F).setTemperature(0.6F).setRainDisabled().setWaterColor(14177255));
//		topBlock = ModBlocks.PURPLE_ORE.getDefaultState().withProperty(BlockDirt.VARIANT, EnumBl)
		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		
		this.spawnableCreatureList.add(new SpawnListEntry(EntityVillager.class, 10, 1, 5));
	}
}
