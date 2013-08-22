package wehavecookies56.kk.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.api.EnumKeyBladeMaterial;
import wehavecookies56.kk.api.KeyBlade;
import wehavecookies56.kk.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemEarthShaker extends KeyBlade {
    public ItemEarthShaker(int id, EnumKeyBladeMaterial enumEarthShakerMaterial) {
        super(id, enumEarthShakerMaterial);
        this.setCreativeTab(KingdomKeys.KKTAB);
        this.setContainerItem(AddedItems.EarthShaker);
    }
    public void registerIcons(IconRegister par1IconRegister) {
        itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
        }
    @Override
    public boolean hasEffect(ItemStack par1ItemStack){
        return true;
    }
    @Override
    @SideOnly(Side.CLIENT)
    public EnumRarity getRarity(ItemStack par1ItemStack){
        return EnumRarity.epic;
    }
}