package wehavecookies56.kk.world.gen;

import java.util.Random;

import wehavecookies56.kk.block.AddedBlocks;

import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenFlowers;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenPrizeBlox extends WorldGenerator
{


    public WorldGenPrizeBlox(int par1)
    {

    }

    public boolean generate(World par1World, Random par2Random, int par3, int par4, int par5)
    {
        for (int var6 = 0; var6 < 64; ++var6)
        {
            int var7 = par3 + par2Random.nextInt(8) - par2Random.nextInt(8);
            int var8 = par4 + par2Random.nextInt(4) - par2Random.nextInt(4);
            int var9 = par5 + par2Random.nextInt(8) - par2Random.nextInt(8);

           
    }
		return true;
    }
    public void generateSurface(World world, Random rand, int chunkX, int chunkZ){

    	for(int i = 0; i < 30; i++)
    	  {
    	   int randPosX = chunkX + rand.nextInt(16) + 8;
    	   int randPosY = rand.nextInt(256);
    	   int randPosZ = chunkZ + rand.nextInt(16) + 8;
    	   (new WorldGenFlowers(AddedBlocks.PrizeBlox.blockID)).generate(world, rand, randPosX, randPosY, randPosZ);
    	  }

    	}
}
