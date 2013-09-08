package wehavecookies56.kk.item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.world.World;
import wehavecookies56.kk.client.KeyBind;
import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.lib.Strings;

public class ItemKingdomKeyChain extends ItemKingdomKeys{
    Minecraft mc = ModLoader.getMinecraftInstance();
    public ItemKingdomKeyChain(int id) {
        super(id);       
        this.setUnlocalizedName(Strings.KingdomKeyChain); 
    }
    public void registerIcons(IconRegister par1IconRegister) {
        itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
        }
    public void onUpdate(ItemStack itemstack, World par2World, Entity par3Entity, int par4, boolean par5)
    {
    	if(KeyBind.keyPressed == true && mc.thePlayer.inventory.hasItem(AddedItems.K111c.itemID)){
    		KeyBind.keyPressed = false;
    		mc.thePlayer.inventory.consumeInventoryItem(AddedItems.K111c.itemID);
    		mc.thePlayer.inventory.addItemStackToInventory(new ItemStack(AddedItems.K111, 1));
        }
    }
}