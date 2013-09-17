package wehavecookies56.kk.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemRecord;
import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemDisc5 extends ItemRecord {

	protected ItemDisc5(int par1, String par2Str) {
		super(par1, par2Str);
		this.setCreativeTab(KingdomKeys.KKTAB);
		this.maxStackSize = 1;
	}

	@SideOnly(Side.CLIENT)

    public String getRecordTitle()
    {
        return "Square Enix KH3D DDD - " + Strings.Disc5;
    }
	
    public void registerIcons(IconRegister par1IconRegister) {
        itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
        }
}
