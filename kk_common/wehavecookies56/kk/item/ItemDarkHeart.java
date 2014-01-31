package wehavecookies56.kk.item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemStack;
import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.lib.Strings;

public class ItemDarkHeart extends ItemKingdomKeys{
    public ItemDarkHeart(int id) {
        super(id);       
        this.setUnlocalizedName(Strings.DHeart);
        
    }
    public void registerIcons(IconRegister par1IconRegister) {
        itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
        }
}