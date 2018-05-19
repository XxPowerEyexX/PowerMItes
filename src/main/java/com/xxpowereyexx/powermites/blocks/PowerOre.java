package com.xxpowereyexx.powermites.blocks;

import java.util.Random;

import com.xxpowereyexx.powermites.init.ModBlocks;
import com.xxpowereyexx.powermites.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PowerOre extends BlockBase
{

	public PowerOre(String name, Material material)
	{
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(4000.0F);
		setHarvestLevel("pickaxe",3);
		setLightLevel(6.0F);
		//setLightOpacity(1);
		//setBlockUnbreakable();
		
		
	}
	
	@Override
	public void dropXpOnBlockBreak(World worldIn, BlockPos pos, int amount) {
		
		super.dropXpOnBlockBreak(worldIn, pos, 20);
		
	}
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return ModItems.POWER_DUST;
		
	}
	
	@Override 
	public int quantityDropped(IBlockState state, int fortune, Random rand)
	{
			//return quantityDroppedWithBonus(fortune, rand);
		return fortune+1;
	}
	
	
}
