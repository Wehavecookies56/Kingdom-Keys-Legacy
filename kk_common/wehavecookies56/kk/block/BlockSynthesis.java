package wehavecookies56.kk.block;

import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockSynthesis extends Block{
	
	@SideOnly(Side.CLIENT)
	private Icon workbenchIconTop;
	@SideOnly(Side.CLIENT)
	private Icon workbenchIconFront;

	public BlockSynthesis(int i)
	{
	         super(i, Material.iron);
	         this.setCreativeTab(KingdomKeys.KKTAB);
	         this.setUnlocalizedName(Strings.Synthesiser);
	}

	@SideOnly(Side.CLIENT)
	public Icon getIcon(int par1, int par2)
	{
	         return par1 == 1 ? this.workbenchIconTop : (par1 == 0 ? Block.planks.getBlockTextureFromSide(par1) : (par1 != 2 && par1 != 4 ? this.blockIcon : this.workbenchIconFront));
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
	this.blockIcon = par1IconRegister.registerIcon("kk:synth_side");
	this.workbenchIconTop = par1IconRegister.registerIcon("kk:synth_top");
	this.workbenchIconFront = par1IconRegister.registerIcon("kk:synth_front");
	}

	
	public boolean onBlockActivated(World world, int var2, int var3, int var4, EntityPlayer player, int var6, float var7, float var8, float var9)
	{
	         if (!player.isSneaking())
	{
	player.openGui(KingdomKeys.instance, 0, world, var2, var3, var4);
	return true;
	}
	else
	{
	return false;
	}
	}
	
	
	
}