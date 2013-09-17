package wehavecookies56.kk.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBlox extends Block {
    
    public BlockBlox(int id, Material par2Material){
        super(id, par2Material);
        this.setCreativeTab(KingdomKeys.KKTAB);
    }
    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister par1IconRegister) {
        blockIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
        }   
}