package wehavecookies56.kk.world.gen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import wehavecookies56.kk.block.AddedBlocks;
import wehavecookies56.kk.lib.ConfigBooleans;
import wehavecookies56.kk.lib.ints;
import cpw.mods.fml.common.IWorldGenerator;

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
	 * OVERWORLD GENERATION
	 */

		public void generateOverworld (World world, Random random, int chunkX, int chunkZ){
			if(ConfigBooleans.enableOverworld){
		    String s = world.getBiomeGenForCoords(chunkX + 8, chunkZ + 8).biomeName;
			this.spawnOres(AddedBlocks.LucidOre, Block.stone, world, random, chunkX, chunkZ, 16, 16, 6, ints.LucidOreChance, 0, 70);
			this.spawnOres(AddedBlocks.SerenityOre, Block.stone, world, random, chunkX, chunkZ, 16, 16, 5, ints.SerenityOreChance, 60, 128);
			this.spawnOres(AddedBlocks.TranquilOre, Block.stone, world, random, chunkX, chunkZ, 16, 16, 6, ints.TranquilOreChance, 70, 128);
			this.spawnOres(AddedBlocks.BrightOre, Block.stone, world, random, chunkX, chunkZ, 16, 16, 5, ints.BrightOreChance, 10, 128);
			this.spawnOres(AddedBlocks.DarkOre, Block.stone, world, random, chunkX, chunkZ, 16, 16, 4, ints.DarkOreChance, 0, 12);
			this.spawnOres(AddedBlocks.DenseOre, Block.stone, world, random, chunkX, chunkZ, 16, 16, 5, ints.DenseOreChance, 0, 15);
			this.spawnOres(AddedBlocks.LightningOre, Block.stone, world, random, chunkX, chunkZ, 16, 16, 5, ints.LightningOreChance, 40, 60);
			this.spawnOres(AddedBlocks.BlazingOre, Block.stone, world, random, chunkX, chunkZ, 16, 16, 5, ints.BlazingOreChance, 0, 20);
			this.spawnOres(AddedBlocks.PrizeBlox, Block.dirt, world, random, chunkX, chunkZ, 16, 16, 3, ints.PrizeBloxChance, 0, 80);
			this.spawnOres(AddedBlocks.RarePrizeBlox, Block.dirt, world, random, chunkX, chunkZ, 16, 16, 3, ints.RarePrizeBloxChance, 0, 80);
			if (s.startsWith("Taiga")){
				this.spawnOres(AddedBlocks.FrostOre, Block.stone, world, random, chunkX, chunkZ, 16, 16, 6, ints.FrostOreChance, 25, 40);
			}
			if (s.startsWith("Ice Plains")){
				this.spawnOres(AddedBlocks.FrostOre, Block.stone, world, random, chunkX, chunkZ, 16, 16, 6, ints.FrostOreChance, 25, 40);
			}
			if (s.startsWith("Ice Mountains")){
				this.spawnOres(AddedBlocks.FrostOre, Block.stone, world, random, chunkX, chunkZ, 16, 16, 6, ints.FrostOreChance, 25, 40);
			}
			if (s.startsWith("Frozen Ocean")){
				this.spawnOres(AddedBlocks.FrostOre, Block.stone, world, random, chunkX, chunkZ, 16, 16, 6, ints.FrostOreChance, 25, 40);
			}
			if (s.startsWith("Frozen River")){
				this.spawnOres(AddedBlocks.FrostOre, Block.stone, world, random, chunkX, chunkZ, 16, 16, 6, ints.FrostOreChance, 25, 40);
			}
			if (s.startsWith("TaigaHills")){
				this.spawnOres(AddedBlocks.FrostOre, Block.stone, world, random, chunkX, chunkZ, 16, 16, 6, ints.FrostOreChance, 25, 40);
			}
			this.spawnOres(AddedBlocks.EnergyOre, Block.stone, world, random, chunkX, chunkZ, 16, 16, 6, ints.EnergyOreChance, 0, 128);
			this.spawnOres(AddedBlocks.RemembranceOre, Block.stone, world, random, chunkX, chunkZ, 16, 16, 4, ints.RemembranceOreChance, 0, 128);
			this.spawnOres(AddedBlocks.TwilightOre, Block.stone, world, random, chunkX, chunkZ, 16, 16, 8, ints.TwilightOreChance, 0, 128);
			}
		}

	

	/**
	 * 
	 * END GENERATION
	 */
	public void generateEnd (World world, Random random, int chunkX, int chunkZ){
		if(ConfigBooleans.enableGenerate){
		this.spawnOres(AddedBlocks.DangerBlox, Block.whiteStone, world, random, chunkX, chunkZ, 16, 16, 6, 20, 0, 128);
		this.spawnOres(AddedBlocks.NormalBlox, Block.whiteStone, world, random, chunkX, chunkZ, 16, 16, 10, 60, 0, 128);
		this.spawnOres(AddedBlocks.HardBlox, Block.whiteStone, world, random, chunkX, chunkZ, 16, 16, 9, 40, 0, 128);
		this.spawnOres(AddedBlocks.MetalBlox, Block.whiteStone, world, random, chunkX, chunkZ, 16, 16, 8, 30, 0, 128);
		//this.spawnOres(AddedBlocks.MetalBlox, Block.obsidian, world, random, chunkX, chunkZ, 16, 16, 30, 89, 0, 128);
		//this.spawnOres(AddedBlocks.NormalBlox, Block.obsidian, world, random, chunkX, chunkZ, 16, 16, 15, 89, 0, 128);
		//this.spawnOres(AddedBlocks.HardBlox, Block.obsidian, world, random, chunkX, chunkZ, 16, 16, 30, 89, 0, 128);
		this.spawnOres(AddedBlocks.RarePrizeBlox, Block.whiteStone, world, random, chunkX, chunkZ, 16, 16, 3, 20, 0, 128);
		this.spawnOres(AddedBlocks.DarkOreE, Block.whiteStone, world, random, chunkX, chunkZ, 16, 16, 6, ints.DarkOreEChance, 0, 128);
		this.spawnOres(AddedBlocks.PowerOreE, Block.whiteStone, world, random, chunkX, chunkZ, 16, 16, 7, ints.PowerOreEChance, 0, 128);
		
		}
	}

	/**
	 * 
	 * NETHER GENERATION
	 */
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
	 * @param The vein size
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