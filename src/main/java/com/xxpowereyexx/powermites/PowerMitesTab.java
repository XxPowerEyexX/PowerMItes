package com.xxpowereyexx.powermites;

import java.util.Random;

import com.xxpowereyexx.powermites.init.ModBlocks;
import com.xxpowereyexx.powermites.init.ModItems;
import com.xxpowereyexx.powermites.util.Refs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import scala.Console;

public class PowerMitesTab extends CreativeTabs
{
	public PowerMitesTab()
	{
		super(Refs.MOD_ID);
	}
	@Override
	public ItemStack getTabIconItem()
	{
		Random rand= new Random();
		int rn =rand.nextInt(10 - 0+ 1) + 0;
		if(rn>5)
		{
			return new ItemStack(ModBlocks.POWER_ORE);
			
		}
		else if (rn<5)
		{
			return new ItemStack(ModItems.POWER_DUST);
			
		}
		return null;
	}
}
