package com.xxpowereyexx.powermites;



import com.xxpowereyexx.powermites.init.ModRecipes;
import com.xxpowereyexx.powermites.oregen.Oregen;
import com.xxpowereyexx.powermites.proxy.CommonProxy;
import com.xxpowereyexx.powermites.util.Refs;
import com.xxpowereyexx.powermites.util.Handlers.RegisrtyHandler;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid=Refs.MOD_ID, name=Refs.NAME, version=Refs.VERSION)


public class Main 
{
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide=Refs.CLIENT_PROXY_CLASS,serverSide=Refs.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	public static final PowerMitesTab PowerMites = new PowerMitesTab();
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event){RegisrtyHandler.otherRegistries();}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		ModRecipes.init();
		
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event)
	{
		
	}
	
	
}
