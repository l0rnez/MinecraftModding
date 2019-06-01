package com.lornez.testMod.blocks;

import java.util.Random;

import com.lornez.testMod.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class PurpleOre extends BlockBase {

	public PurpleOre(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(4.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 3);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.PURPLE_DUST;
	}
	
	@Override
	public int quantityDropped(Random rand) {
		return rand.nextInt(3) + 1;
	}
}
