package wehavecookies56.kk.item;

import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.lib.Strings;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemKingdomHearts extends ItemKingdomKeys {

    public ItemKingdomHearts(int id) {
        super(id);
        this.setUnlocalizedName(Strings.KHearts);
    }
    public void registerIcons(IconRegister par1IconRegister) {
        itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
        }

}
