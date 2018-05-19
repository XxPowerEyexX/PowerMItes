package com.xxpowereyexx.powermites.items.tools;

import com.xxpowereyexx.powermites.Main;
import com.xxpowereyexx.powermites.init.ModItems;
import com.xxpowereyexx.powermites.util.IHasModel;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class ToolAxe extends ItemAxe implements IHasModel
{

	public ToolAxe(String name, ToolMaterial material)
	{
		super(material,6.0F,-3.0F);
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
