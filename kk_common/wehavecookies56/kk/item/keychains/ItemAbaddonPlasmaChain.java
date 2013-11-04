package wehavecookies56.kk.item.keychains;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import wehavecookies56.kk.item.AddedItems;
import wehavecookies56.kk.item.ItemKingdomKeys;
import wehavecookies56.kk.item.keyblades.ItemAbaddonplasma;
import wehavecookies56.kk.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemAbaddonPlasmaChain extends ItemKingdomKeys{
	public ItemAbaddonPlasmaChain(int id) {
		super(id);
	}
	public void registerIcons(IconRegister par1IconRegister) {
		itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
	}
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack itemStack, EntityPlayer player, List dataList, boolean bool){
    	dataList.add("Kingdom Hearts 358/2 Days");
    }
	public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5)
	{
		EntityPlayer player = (EntityPlayer)par3Entity;
		if (ItemAbaddonplasma.keyPressed)
		{
			ItemAbaddonplasma.keyPressed = false;
			if (player.getHeldItem() != null && player.getHeldItem().itemID == AddedItems.K62c.itemID)
			{
				//par2World.playSoundAtEntity(player, "kk:keybladesummon", 1.0F, 1.0F);
				//par2World.spawnParticle("largesmoke", player.posX, player.posY, player.posZ, 0.0D, 0.0D, 0.0D);
			}
		}
	}
}