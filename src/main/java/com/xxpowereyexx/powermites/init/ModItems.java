package com.xxpowereyexx.powermites.init;

import java.util.ArrayList;
import java.util.List;

import com.xxpowereyexx.powermites.items.ItemBase;
import com.xxpowereyexx.powermites.items.tools.ToolAxe;
import com.xxpowereyexx.powermites.items.tools.ToolHoe;
import com.xxpowereyexx.powermites.items.tools.ToolPickaxe;
import com.xxpowereyexx.powermites.items.tools.ToolSpade;
import com.xxpowereyexx.powermites.items.tools.ToolSword;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	//Materials
	public static final ToolMaterial MATERIAL_POWER= EnumHelper.addToolMaterial("material_power", 3, 1000, 10.0F, 2.0F, 20);
	public static final ToolMaterial MATERIAL_POWER_SWORD= EnumHelper.addToolMaterial("material_power_sword", 0, 1000, 2.0F, 10.0F, 20);
	//mining level, duribilaty, stregnth, dmg, enchantablilty 
	
	
	public static final Item POWER_GEM = new ItemBase("power_gem");
	public static final Item POWER_INGOT = new ItemBase("power_ingot");
	public static final Item POWER_DUST= new ItemBase("power_dust"); 
	
	//Tools
	public static final ItemSword POWER_SWORD = new ToolSword("power_sword", MATERIAL_POWER_SWORD);	
	public static final ItemSpade POWER_SHOVEL = new ToolSpade("power_shovel", MATERIAL_POWER);
	public static final ItemPickaxe POWER_PICKAXE = new ToolPickaxe("power_pickaxe", MATERIAL_POWER);
	public static final ItemAxe POWER_AXE = new ToolAxe("power_axe", MATERIAL_POWER);
	public static final ItemHoe POWER_HOE = new ToolHoe("power_hoe", MATERIAL_POWER);

	
	
}
