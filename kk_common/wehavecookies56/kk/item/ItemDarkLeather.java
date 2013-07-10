package wehavecookies56.kk.item;

import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.lib.Strings;
import net.minecraft.client.renderer.texture.IconRegister;

public class ItemDarkLeather extends ItemKingdomKeys{

    public ItemDarkLeather(int id) {
        super(id);       
        this.setUnlocalizedName(Strings.DLeather);
        
    }
    public void registerIcons(IconRegister par1IconRegister) {
        itemIcon = par1IconRegister.registerIcon("kk" + ":" + Strings.DLeather);
        }

}
