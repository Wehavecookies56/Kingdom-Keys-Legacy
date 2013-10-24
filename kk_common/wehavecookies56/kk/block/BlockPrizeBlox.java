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

public class BlockPrizeBlox extends BlockBlox {

    public BlockPrizeBlox(int id, Material par2Material) {
        super(id, par2Material);
        this.setUnlocalizedName(Strings.PBlox);
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
        	luckDraw = world.rand.nextInt(30);
        	idDropped = 0;
        	metaDropped = 0;
        	
        	
        	// Choose what will be on the list
        	if (luckDraw == 0) { 
        		idDropped = AddedItems.HP.itemID;
        		metaDropped = 0;
        		
        	}
        	if (luckDraw == 1) { 
        		idDropped = AddedItems.HP.itemID;
        		metaDropped = 0;
        		
        	}
        	if (luckDraw == 2) { 
        		idDropped = AddedItems.LightningShard.itemID;
        		metaDropped = 0;
        		
        	}
        	if (luckDraw == 3) { 
        		idDropped = AddedItems.FrostShard.itemID;
        		metaDropped = 0;
        		
        	}
        	if (luckDraw == 4) { 
        		idDropped = AddedItems.BlazingShard.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 5) { 
        		idDropped = AddedItems.LucidShard.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 6) { 
        		idDropped = AddedItems.DarkShard.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 7) { 
        		idDropped = AddedItems.HP.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 8) { 
        		idDropped = AddedItems.Munny.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 9) { 
        		idDropped = AddedItems.Munny.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 10) { 
        		idDropped = AddedItems.HP.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 11) { 
        		idDropped = AddedItems.Munny.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 12) { 
        		idDropped = AddedItems.HP.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 13) { 
        		idDropped = AddedItems.Munny.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 14) { 
        		idDropped = AddedItems.HP.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 15) { 
        		idDropped = AddedItems.Munny.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 16) { 
        		idDropped = AddedItems.HP.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 17) { 
        		idDropped = AddedItems.Munny.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 18) { 
        		idDropped = AddedItems.HP.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 19) { 
        		idDropped = AddedItems.Munny.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 20) { 
        		idDropped = AddedItems.HP.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 21) { 
        		idDropped = AddedItems.Munny.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 22) { 
        		idDropped = AddedItems.HP.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 23) { 
        		idDropped = AddedItems.Munny.itemID;
        		metaDropped = 0;
        		
        	}
        	if (luckDraw == 24) { 
        		idDropped = AddedItems.HP.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 25) { 
        		idDropped = AddedItems.Munny.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 26) { 
        		idDropped = AddedItems.HP.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 27) { 
        		idDropped = AddedItems.Munny.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 28) { 
        		idDropped = AddedItems.HP.itemID;
        		metaDropped = 0;
        		
        	}
        	
        	if (luckDraw == 29) { 
        		idDropped = AddedItems.Munny.itemID;
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