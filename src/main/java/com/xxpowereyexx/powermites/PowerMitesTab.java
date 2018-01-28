package com.xxpowereyexx.powermites;

import com.xxpowereyexx.powermites.init.ModBlocks;
import com.xxpowereyexx.powermites.init.ModItems;
import com.xxpowereyexx.powermites.util.Refs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class PowerMitesTab extends CreativeTabs
{
	public PowerMitesTab()
	{
		super(Refs.MOD_ID);
	}
	@Override
	public ItemStack getTabIconItem()
	{
		return new ItemStack(ModBlocks.POWER_BLOCK);
	}
}
