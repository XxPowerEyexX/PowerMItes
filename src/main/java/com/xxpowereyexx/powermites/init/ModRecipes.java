package com.xxpowereyexx.powermites.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes 
{
	public static void init()
	{
		GameRegistry.addSmelting(ModItems.POWER_INGOT, new ItemStack(ModItems.POWER_GEM, 1), 2.0F);
		GameRegistry.addSmelting(ModBlocks.POWER_BLOCK, new ItemStack(ModItems.POWER_GEM, 9), 2.0F);
		GameRegistry.addSmelting(ModItems.POWER_DUST, new ItemStack(ModItems.POWER_INGOT, 1), 2.0F);
	}
}
