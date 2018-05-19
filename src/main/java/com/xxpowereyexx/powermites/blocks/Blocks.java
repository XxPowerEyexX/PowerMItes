package com.xxpowereyexx.powermites.blocks;

import net.minecraft.block.material.Material;

public class Blocks extends BlockBase
{

	public Blocks(String name, Material material) {
		super(name, material);
		setHarvestLevel("pickaxe", 1);
		setHardness(5.0F);
		setResistance(1000.0F);
		
	}
	
}
