package wehavecookies56.kk.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;
import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.lib.Strings;

public class ItemPotion extends ItemFood{

    public ItemPotion(int id, int food, float set, boolean wolf) {
        super(id, food, wolf);       
        this.setUnlocalizedName(Strings.Potion);
        this.setCreativeTab(KingdomKeys.KKTAB);
        this.setAlwaysEdible();
        this.setPotionEffect(Potion.heal.id, 1, 1, 1.0F);
    }
    public void registerIcons(IconRegister par1IconRegister) {
        itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
        }
}