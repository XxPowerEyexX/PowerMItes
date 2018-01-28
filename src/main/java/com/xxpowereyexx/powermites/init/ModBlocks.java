package com.xxpowereyexx.powermites.init;

import java.util.ArrayList;
import java.util.List;


import com.xxpowereyexx.powermites.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	
	public static final Block POWER_BLOCK= new BlockBase("power_block", Material.ANVIL);
	public static final Block POWER_ORE= new BlockBase("power_ore", Material.IRON);
	public static final Block POWER_GEM_BLOCK = new BlockBase("power_gem_block", Material.WOOD);
	
	
	
	
}
