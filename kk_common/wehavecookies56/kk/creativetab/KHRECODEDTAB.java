package wehavecookies56.kk.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import wehavecookies56.kk.item.AddedItems;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class KHRECODEDTAB extends CreativeTabs {

    public KHRECODEDTAB(int par1, String par2Str) {
        super(par1, par2Str);
    }
    
    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex()
    {
        return AddedItems.K41.itemID;
    }
}