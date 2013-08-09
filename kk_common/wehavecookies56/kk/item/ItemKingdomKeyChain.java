package wehavecookies56.kk.item;

import net.minecraft.client.renderer.texture.IconRegister;
import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.lib.Strings;

public class ItemKingdomKeyChain extends ItemKingdomKeys{
    public ItemKingdomKeyChain(int id) {
        super(id);       
        this.setUnlocalizedName(Strings.KingdomKeyChain);
        
    }
    public void registerIcons(IconRegister par1IconRegister) {
        itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
        }

}
