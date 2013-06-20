package wehavecookies56.kk.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.lib.Strings;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockNormalBlox extends BlockBlox {

    public BlockNormalBlox(int id, Material par2Material) {
        super(id, par2Material);
        this.setUnlocalizedName(Strings.NBlox);
        this.setStepSound(soundMetalFootstep);
        this.setHardness(2.5F);
        this.setResistance(2.0F);
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister) {
        
            blockIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + (this.getUnlocalizedName().substring(5)));
        }
}
