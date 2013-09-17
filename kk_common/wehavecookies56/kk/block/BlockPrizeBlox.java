package wehavecookies56.kk.block;

import java.util.ArrayList;

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
    public ArrayList<ItemStack> getBlockDropped(World world, int x, int y, int z, int metadata, int fortune)
    {
            ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
            for(int i = 0; 0 < world.rand.nextInt(3); i++)
               ret.add(new ItemStack(AddedItems.HP, 1, damageDropped(metadata)));
            for(int i = 0; i < world.rand.nextInt(3); i++)
               ret.add(new ItemStack(AddedItems.Munny, 1, damageDropped(metadata)));
            
            return ret;
    }
}