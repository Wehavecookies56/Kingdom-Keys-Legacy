package wehavecookies56.kk.block;

import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class BlockDangerBlox extends BlockBlox {

    public BlockDangerBlox(int id, Material par2Material) {
        super(id, par2Material);
        this.setUnlocalizedName(Strings.DBlox);
        this.setStepSound(soundMetalFootstep);
        this.setHardness(2.0F);
        this.setResistance(2.0F);
        
        
    }
    public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
    {
        par5Entity.attackEntityFrom(DamageSource.magic, 3);
    }


    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister) {

        blockIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + (this.getUnlocalizedName().substring(5)));
    }
}