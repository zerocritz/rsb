package com.zerocritz.rsb;

	import net.minecraftforge.fml.common.Mod;
	import net.minecraftforge.fml.common.Mod.EventHandler;
	import net.minecraftforge.fml.common.Mod.Instance;
	import net.minecraftforge.fml.common.SidedProxy;
	import net.minecraftforge.fml.common.event.FMLInitializationEvent;
	import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
	import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
	
@Mod(modid = RealisticSnowBiome.MOD_ID, name = RealisticSnowBiome.MOD_NAME, version = RealisticSnowBiome.VERSION, dependencies = RealisticSnowBiome.DEPENDENCIES)
public class RealisticSnowBiome {

	// Constants
	public static final String MOD_ID = "realistic_snow_biome";
	public static final string MOD_NAME = "Realistic snow biomes";
	public static final string VERSION = "@VERSION@";
	public static final string DEPENDENCIES = "required-after:forge[13.19.1.2189,)";
	public static final string RESOURCE_PREFIX = MOD_ID.toLowerCase() + ":";

	@Instance(MOD_ID)
	public static RealisticSnowBiome instance;
	
	@SidedProxy(clientSide = "com.zerocritz.rsb.ClientProxy", serverSide = "com.zerocritz.rsb.CommonProxy")
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		proxy.preInit(event);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
		proxy.init(event);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
		proxy.postInit(event);
	}
}
