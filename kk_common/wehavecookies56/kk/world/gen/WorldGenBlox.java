package wehavecookies56.kk.world.gen;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;

import wehavecookies56.kk.block.AddedBlocks;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenFlowers;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenBlox implements IWorldGenerator
{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
		case 0:  generateOverworld   (world, random, chunkX * 16, chunkZ * 16);
		case 1:  generateEnd		 (world, random, chunkX * 16, chunkZ * 16);
		case -1: generateNether      (world, random, chunkX * 16, chunkZ * 16);
		}

	}

	/**
	 * 
	 * This is where you add blocks which you want to spawn in the overworld. See example
	 */

	public void generateOverworld (World world, Random random, int chunkX, int chunkZ){
		this.spawnOres(AddedBlocks.PrizeBlox, Block.dirt, world, random, chunkX, chunkZ, 16, 16, 2, 50, 0, 80);
	}

	public void generateEnd (World world, Random random, int chunkX, int chunkZ){
		this.spawnOres(AddedBlocks.DangerBlox, Block.whiteStone, world, random, chunkX, chunkZ, 16, 16, 6, 20, 0, 128);
		this.spawnOres(AddedBlocks.NormalBlox, Block.whiteStone, world, random, chunkX, chunkZ, 16, 16, 10, 60, 0, 128);
		this.spawnOres(AddedBlocks.HardBlox, Block.whiteStone, world, random, chunkX, chunkZ, 16, 16, 9, 40, 0, 128);
		this.spawnOres(AddedBlocks.MetalBlox, Block.whiteStone, world, random, chunkX, chunkZ, 16, 16, 8, 30, 0, 128);
		this.spawnOres(AddedBlocks.MetalBlox, Block.obsidian, world, random, chunkX, chunkZ, 16, 16, 30, 89, 0, 128);
		this.spawnOres(AddedBlocks.NormalBlox, Block.obsidian, world, random, chunkX, chunkZ, 16, 16, 15, 89, 0, 128);
		this.spawnOres(AddedBlocks.HardBlox, Block.obsidian, world, random, chunkX, chunkZ, 16, 16, 30, 89, 0, 128);
	}

	public void generateNether (World world, Random random, int chunkX, int chunkZ){

	}

	/**
	 * 
	 * This Method adds ore generation. See below what all params mean
	 * @param dirt 
	 * 
	 * @param Block which you want to spawn
	 * @param World where you want it to spawn
	 * @param Randomizer used for spawning
	 * @param Start of the Chunk in X-Direction
	 * @param Start of the Chunk in Z-Direction
	 * @param Max X-Size where the block can spawn, normal = 16
	 * @param Max Z-Size where the block can spawn, normal = 16
	 * @param The vain size
	 * @param The chance to spawn a block
	 * @param Minimum Y-level to spawn block
	 * @param Maximum Y-level to spawn block
	 * 
	 */

	public void spawnOres(Block block, Block blockReplaced, World world, Random random, int chunkX, int chunkZ, int XMax, int ZMax, int vainSize, int spawnChance, int YMin, int YMax){
		for(int i = 0; i < spawnChance; i ++){
			int posX = chunkX + random.nextInt(XMax);
			int posZ = chunkZ + random.nextInt(ZMax);
			int posY = YMin + random.nextInt(YMax-YMin);
			(new WorldGenMinable(block.blockID, vainSize, blockReplaced.blockID)).generate(world, random, posX, posY, posZ);
		}
	}


}