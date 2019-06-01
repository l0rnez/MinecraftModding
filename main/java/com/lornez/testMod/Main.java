package com.lornez.testMod;

import com.lornez.testMod.commands.CommandTeleportDimension;
import com.lornez.testMod.init.BiomeInit;
import com.lornez.testMod.init.DimensionInit;
import com.lornez.testMod.proxy.CommonProxy;
import com.lornez.testMod.util.Reference;
import com.lornez.testMod.world.ModWorldGen;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {

	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
		DimensionInit.registerDimensions();
		BiomeInit.registerBiomes();
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		
	}
	//hier noch dimension init einfügen
	@EventHandler
	public static void serverInit(FMLServerStartingEvent event) {
		event.registerServerCommand(new CommandTeleportDimension());
	}
}
