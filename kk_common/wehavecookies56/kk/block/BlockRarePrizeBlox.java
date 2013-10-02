package wehavecookies56.kk.block;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import wehavecookies56.kk.item.AddedItems;
import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockRarePrizeBlox extends BlockBlox {

    public BlockRarePrizeBlox(int id, Material par2Material) {
        super(id, par2Material);
        this.setUnlocalizedName(Strings.RPBlox);
        this.setStepSound(soundMetalFootstep);
        this.setHardness(0.5F);
        this.setResistance(0.0F);
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister) {
        blockIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + (this.getUnlocalizedName().substring(5)));
    }
    protected boolean canSilkHarvest()
    {
            return true;
    }

    @Override
    public int idDropped(int par1, Random par2Random, int par3)
    {
    	// Makes the block drop nothing at first
        return 0;
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
	@Override
    public int quantityDropped(Random par1Random)
    {
		// Random amount of stuff
		return 1 + par1Random.nextInt(1);
    }

	 /**
     * This returns a complete list of items dropped from this block.
     *
     * @param world The current world
     * @param x X Position
     * @param y Y Position
     * @param z Z Position
     * @param metadata Current metadata
     * @param fortune Breakers fortune level
     * @return A ArrayList containing all items this block drops
     */
    public ArrayList<ItemStack> getBlockDropped(World world, int x, int y, int z, int metadata, int fortune)
    {
        ArrayList<ItemStack> ret = new ArrayList<ItemStack>();

        // Gets how much items this block will drop
        int count = quantityDropped(metadata, fortune, world.rand);
        
        /*
         * Below is the default vanilla code
        for(int i = 0; i < count; i++)
        {
            int id = idDropped(metadata, world.rand, fortune);
            if (id > 0)
            {
                ret.add(new ItemStack(id, 1, damageDropped(metadata)));
            }
        }
        */
        int luckDraw = 0;
        int idDropped = 0;
        int metaDropped = 0;
        
        for(int i = 0; i < count; i++)
        {
        	// Gets a number between 0 and 4
        	luckDraw = world.rand.nextInt(60);
        	idDropped = 0;
        	metaDropped = 0;
        	
        	
        	// Choose what will be on the list
        	if (luckDraw == 0) { 
        		idDropped = AddedItems.Orichalcum.itemID;
        		metaDropped = 1;
        		
        	}
        	if (luckDraw == 1) { 
        		idDropped = AddedItems.Orichalcum.itemID;
        		metaDropped = 3;
        		
        	}
        	if (luckDraw == 2) { 
        		idDropped = AddedItems.OrichalcumPlus.itemID;
        		metaDropped = 2;
        		
        	}
        	if (luckDraw == 3) { 
        		idDropped = AddedItems.DenseGem.itemID;
        		metaDropped = 0;
        		
        	}
        	if (luckDraw == 4) { 
        		idDropped = AddedItems.DenseGem.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 5) { 
        		idDropped = AddedItems.DenseGem.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 6) { 
        		idDropped = AddedItems.TwilightGem.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 7) { 
        		idDropped = AddedItems.TwilightGem.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 8) { 
        		idDropped = AddedItems.BrightGem.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 9) { 
        		idDropped = AddedItems.RemembranceStone.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 10) { 
        		idDropped = AddedItems.RemembranceStone.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 11) { 
        		idDropped = AddedItems.RemembranceGem.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 12) { 
        		idDropped = AddedItems.DenseShard.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 13) { 
        		idDropped = AddedItems.DenseShard.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 14) { 
        		idDropped = AddedItems.DenseShard.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 15) { 
        		idDropped = AddedItems.BrightShard.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 16) { 
        		idDropped = AddedItems.BrightShard.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 17) { 
        		idDropped = AddedItems.MythrilShard.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 18) { 
        		idDropped = AddedItems.BlazingGem.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 19) { 
        		idDropped = AddedItems.FrostGem.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 20) { 
        		idDropped = AddedItems.LightningGem.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 21) { 
        		idDropped = AddedItems.EnergyShard.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 22) { 
        		idDropped = AddedItems.EnergyShard.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 23) { 
        		idDropped = AddedItems.PowerShard.itemID;
        		metaDropped = 0;
        		
        	}
        	if (luckDraw == 24) { 
        		idDropped = AddedItems.SerenityShard.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 25) { 
        		idDropped = AddedItems.SerenityShard.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 26) { 
        		idDropped = AddedItems.TranquilShard.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 27) { 
        		idDropped = AddedItems.TranquilShard.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 28) { 
        		idDropped = AddedItems.DarkMatter.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 29) { 
        		idDropped = AddedItems.ShinyCrystal.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 30) { 
        		idDropped = AddedItems.SerenityStone.itemID;
        		metaDropped = 3;
        		
        	}
        	if (luckDraw == 31) { 
        		idDropped = AddedItems.LightningShard.itemID;
        		metaDropped = 2;
        		
        	}
        	if (luckDraw == 32) { 
        		idDropped = AddedItems.FrostShard.itemID;
        		metaDropped = 0;
        		
        	}
        	if (luckDraw == 33) { 
        		idDropped = AddedItems.BlazingShard.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 34) { 
        		idDropped = AddedItems.LucidShard.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 35) { 
        		idDropped = AddedItems.DarkShard.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 36) { 
        		idDropped = AddedItems.BlazingGem.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 37) { 
        		idDropped = AddedItems.Orichalcum.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 38) { 
        		idDropped = AddedItems.DarkGem.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 39) { 
        		idDropped = AddedItems.DarkShard.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 40) { 
        		idDropped = AddedItems.LucidGem.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 41) { 
        		idDropped = AddedItems.LucidShard.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 42) { 
        		idDropped = AddedItems.LightningCrystal.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 43) { 
        		idDropped = AddedItems.LightningStone.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 44) { 
        		idDropped = AddedItems.BlazingCrystal.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 45) { 
        		idDropped = AddedItems.BlazingStone.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 46) { 
        		idDropped = AddedItems.FrostCrystal.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 47) { 
        		idDropped = AddedItems.FrostStone.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 48) { 
        		idDropped = AddedItems.TwilightShard.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 49) { 
        		idDropped = AddedItems.BrightShard.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 50) { 
        		idDropped = AddedItems.EnergyShard.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 51) { 
        		idDropped = AddedItems.PowerGem.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 52) { 
        		idDropped = AddedItems.DarkCrystal.itemID;
        		metaDropped = 0;
        		
        	}
        	if (luckDraw == 53) { 
        		idDropped = AddedItems.TwilightGem.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 54) { 
        		idDropped = AddedItems.DenseStone.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 55) { 
        		idDropped = AddedItems.MythrilGem.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 56) { 
        		idDropped = AddedItems.MythrilStone.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 57) { 
        		idDropped = AddedItems.BlazingShard.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 58) { 
        		idDropped = AddedItems.FrostShard.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 59) { 
        		idDropped = AddedItems.LucidShard.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	// Adds the block to the return list
        	if (idDropped > 0) {
        		ret.add(new ItemStack(idDropped, 1, metaDropped));
        	}
        }
        return ret;
}
}