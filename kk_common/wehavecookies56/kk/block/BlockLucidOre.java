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

public class BlockLucidOre extends BlockBlox {

    public BlockLucidOre(int id, Material par2Material) {
        super(id, par2Material);
        this.setUnlocalizedName(Strings.LucidOre);
        this.setStepSound(soundStoneFootstep);
        this.setHardness(3.0F);
        this.setResistance(5.0F);
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
		return 2 + par1Random.nextInt(1);
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
        	luckDraw = world.rand.nextInt(4);
        	idDropped = 0;
        	metaDropped = 0;
        	
        	
        	// Choose what will be on the list
        	if (luckDraw == 0) { 
        		idDropped = AddedItems.LucidShard.itemID;
        		metaDropped = 0;
        		
        	}
        	if (luckDraw == 1) { 
        		idDropped = AddedItems.LucidStone.itemID;
        		metaDropped = 0;
        		
        	}
        	if (luckDraw == 2) { 
        		idDropped = AddedItems.LucidGem.itemID;
        		metaDropped = 0;
        		
        	}
        	if (luckDraw == 3) { 
        		idDropped = AddedItems.LucidCrystal.itemID;
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