package wehavecookies56.kk.block;

import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockBounceBlox extends BlockBlox {

    public BlockBounceBlox(int id, Material par2Material) {
        super(id, par2Material);
        this.setUnlocalizedName(Strings.BBlox);
        this.setStepSound(soundMetalFootstep);
        this.setHardness(2.0F);
        this.setResistance(2.0F);
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister) {

        blockIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + (this.getUnlocalizedName().substring(5)));
    }
}