package wehavecookies56.kk.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.entities.tileentities.TileEntitySynthesis;
import wehavecookies56.kk.lib.Strings;
import cpw.mods.fml.common.network.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockSynthesis extends BlockContainer{

	@SideOnly(Side.CLIENT)
	private Icon workbenchIconTop;
	@SideOnly(Side.CLIENT)
	private Icon workbenchIconFront;

	public BlockSynthesis(int i)
	{
		super(i, Material.iron);
		this.setCreativeTab(KingdomKeys.KKTAB);
		this.setUnlocalizedName(Strings.Synthesiser);
		this.setResistance(0.5F);
		this.setHardness(1.5F);
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


	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float a, float b, float c)
	{
		if (!world.isRemote){
			FMLNetworkHandler.openGui(player, KingdomKeys.instance, 0, world, x, y, z);
		}
		return true;
	}

	public int quantityDropped(Random par1Random)
	{
		return 1;
	}

	public int idDropped(int par1, Random par2Random, int par3)
	{
		return this.blockID;
	}

	@Override
	public TileEntity createNewTileEntity(World world) {
		return new TileEntitySynthesis();
	}
	
	@Override
	public void breakBlock(World world, int x, int y, int z, int id, int meta){
		TileEntity te = world.getBlockTileEntity(x, y, z);
		if(te != null && te instanceof IInventory){
			IInventory inventory = (IInventory)te;
			for(int i = 0; i < inventory.getSizeInventory(); i++){
				ItemStack stack = inventory.getStackInSlotOnClosing(i);
				if(stack != null){
					float spawnX = x + world.rand.nextFloat();
					float spawnY = y + world.rand.nextFloat();
					float spawnZ = z + world.rand.nextFloat();
					EntityItem droppedItem = new EntityItem(world, spawnX, spawnY, spawnZ, stack);
					float mult = 0.05F;
					droppedItem.motionX = -0.5F + world.rand.nextFloat() * mult;
					droppedItem.motionY = 4 + world.rand.nextFloat() * mult;
					droppedItem.motionZ = -0.5F + world.rand.nextFloat() * mult;
				}
			}
		}
		super.breakBlock(world, x, y, z, id, meta);
	}

}