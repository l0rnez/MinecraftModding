package com.lornez.testMod.init;

import java.util.ArrayList;
import java.util.List;

import com.lornez.testMod.blocks.BlockBase;
import com.lornez.testMod.blocks.BlockTeleporter;
import com.lornez.testMod.blocks.PurpleOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	//Blocks
	public static final Block PURPLE_ORE = new PurpleOre("purple_ore", Material.ROCK);
	public static final Block TELEPORTER = new BlockTeleporter("teleporter");
}
