package com.lornez.testMod.world.dimension.levitate;

import com.lornez.testMod.init.BiomeInit;
import com.lornez.testMod.init.DimensionInit;
import com.lornez.testMod.world.generations.chunks.ChunkGeneratorLevitateTemplate;
import com.lornez.testMod.world.generations.chunks.ChunkGeneratorLevitateOlderTemplate;

import ibxm.Player;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DimensionType;
import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.structure.StructureNetherBridgePieces.End;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder.Spawn;

public class DimensionLevitate extends WorldProvider
{
	public DimensionLevitate() 
	{
		this.biomeProvider = new BiomeProviderSingle(BiomeInit.LEVITATE_DIMENSION);
		this.hasSkyLight = false;
	}
	
	@Override
	public DimensionType getDimensionType() 
	{
		return DimensionInit.LEVITATE;
	}
	
	@Override
	public IChunkGenerator createChunkGenerator() 
	{
//		return new ChunkGeneratorEndTemplate(world, true, world.getSeed());
//		return new ChunkGeneratorEndTemplate(world, true, world.getSeed());
		return new ChunkGeneratorLevitateTemplate(world, true, world.getSeed());
		
	}
	
	@Override
	public boolean canRespawnHere() 
	{
		return false;
	}
	
	@Override
	public boolean isSurfaceWorld() 
	{
		return false;
	}
}
