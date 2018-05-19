package com.xxpowereyexx.powermites.init;

import java.util.ArrayList;
import java.util.List;


import com.xxpowereyexx.powermites.blocks.BlockBase;
import com.xxpowereyexx.powermites.blocks.Blocks;
import com.xxpowereyexx.powermites.blocks.PowerOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	
	public static final Block POWER_BLOCK= new Blocks("power_block", Material.ANVIL);
	public static final Block POWER_ORE= new PowerOre("power_ore", Material.IRON);
	public static final Block POWER_GEM_BLOCK = new Blocks("power_gem_block", Material.GROUND);
	
	
	
	
}
