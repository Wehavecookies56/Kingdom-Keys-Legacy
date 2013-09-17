package wehavecookies56.kk.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;

public class ItemEternalFlames extends ItemSword {
	public ItemEternalFlames(int id, EnumToolMaterial toolMaterial)
    {
        super(id, toolMaterial);
        this.setCreativeTab(CreativeTabs.tabMisc);
    }
}
