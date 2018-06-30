package com.xxpowereyexx.powermites.oregen;

import java.util.Random;

import com.xxpowereyexx.powermites.init.ModBlocks;

import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class Oregen implements IWorldGenerator {

	
	private WorldGenerator power_overworld;
	private WorldGenerator power_nether;
	private WorldGenerator power_end;
	
	public Oregen()
	{
		power_overworld = new WorldGenMinable(ModBlocks.POWER_ORE.getDefaultState(), 5);
		power_end= new WorldGenMinable(ModBlocks.POWER_ORE_END.getDefaultState(), 10,new  Endgenpredicate());
	
	}
	
	
	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight, BlockMatcher blockMatcher) {
		if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
			throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

		int heightDiff = maxHeight - minHeight + 1;
		for (int i = 0; i < chancesToSpawn; i ++) {
				int x = chunk_X * 16 + rand.nextInt(16);
		        int y = minHeight + rand.nextInt(heightDiff);
		        int z = chunk_Z * 16 + rand.nextInt(16);
		        generator.generate(world, rand, new BlockPos(x, y, z));
		}
	}
	
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,IChunkProvider chunkProvider) 
	{
		switch (world.provider.getDimension())
		{
		case 0:
			this.runGenerator(power_overworld, world, random, chunkX, chunkZ, 10, 5, 15, BlockMatcher.forBlock(Blocks.STONE));
			break;
			
		case 1:
			this.runGenerator(power_end, world, random, chunkX, chunkZ, 15, 0, 30, BlockMatcher.forBlock(Blocks.END_STONE));
			break;
		case -1:
			//this.runGenerator(power_overworld, world, random, chunkX, chunkZ, 10, 5, 15);
			break;
			
			//this.runGenerator(generator, world, random, chunk_X, chunk_Z, chancesToSpawn, minHeight, maxHeight, blockMatcher);
		
		}
	}

}
