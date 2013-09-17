package wehavecookies56.kk.item.keychains;

import net.minecraft.client.renderer.texture.IconRegister;
import wehavecookies56.kk.item.ItemKingdomKeys;
import wehavecookies56.kk.lib.Reference;

public class ItemKnockoutPunchChain extends ItemKingdomKeys{
	
    public ItemKnockoutPunchChain(int id) {
        super(id);       
    }
    public void registerIcons(IconRegister par1IconRegister) {
        itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
        }
}