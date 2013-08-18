package wehavecookies56.kk.block;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.lib.Strings;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockHardBlox extends BlockBlox{

    public BlockHardBlox(int id, Material par2Material) {
        super(id, par2Material);
        this.setUnlocalizedName(Strings.HBlox);
        this.setStepSound(soundMetalFootstep);
        this.setHardness(5.0F);
        this.setResistance(10.0F);
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
