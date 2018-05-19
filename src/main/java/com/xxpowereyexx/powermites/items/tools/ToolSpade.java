package com.xxpowereyexx.powermites.items.tools;

import com.xxpowereyexx.powermites.Main;
import com.xxpowereyexx.powermites.init.ModItems;
import com.xxpowereyexx.powermites.util.IHasModel;

import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class ToolSpade extends ItemSpade implements IHasModel 
{
	public ToolSpade(String name, ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.PowerMites);
		
		ModItems.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this,0,"invnetory");
	}
	

}
