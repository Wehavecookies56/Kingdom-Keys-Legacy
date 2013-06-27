package wehavecookies56.kk.block;

import java.util.Random;

import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockMetalBlox extends BlockBlox {

    public BlockMetalBlox(int id, Material par2Material) {
        super(id, par2Material);
        this.setUnlocalizedName(Strings.MBlox);
        this.setStepSound(soundMetalFootstep);
        this.setHardness(50.0F);
        this.setResistance(2000.0F);
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister) {

        blockIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + (this.getUnlocalizedName().substring(5)));
    }
    protected boolean canSilkHarvest()
    {
            return true;
    }

}
