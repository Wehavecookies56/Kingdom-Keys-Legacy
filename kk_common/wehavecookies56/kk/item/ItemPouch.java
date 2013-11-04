package wehavecookies56.kk.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.lib.Reference;

public class ItemPouch extends ItemKingdomKeys{
	 public ItemPouch(int id) {
	        super(id);       
	 }

	 public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
		 player.openGui(KingdomKeys.instance, 1, world, (int)player.posX, (int)player.posY, (int)player.posZ);
		 return itemstack;
	 }
	 
	 public void registerIcons(IconRegister par1IconRegister) {
		 itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
	 }
}
