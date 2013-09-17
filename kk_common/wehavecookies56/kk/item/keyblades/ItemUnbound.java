package wehavecookies56.kk.item.keyblades;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;
import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.lib.ConfigBooleans;
import wehavecookies56.kk.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemUnbound extends ItemSword {
    public ItemUnbound(int id, EnumToolMaterial kingdomkeyqwer) {
        super(id, kingdomkeyqwer);
        this.setCreativeTab(KingdomKeys.KHDDDTAB);
    }
    public void registerIcons(IconRegister par1IconRegister) {
        itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
        }
    @Override
    public boolean hasEffect(ItemStack par1ItemStack){
    	if(ConfigBooleans.enableShine == true){
        return true;
    	}
    	return false;
    }
    @Override
    @SideOnly(Side.CLIENT)
    public EnumRarity getRarity(ItemStack par1ItemStack){
        return EnumRarity.epic;
    }
    
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack itemStack, EntityPlayer player, List dataList, boolean bool){
    	dataList.add("Kingdom Hearts Dream Drop Distance");
    }
    
    public void onUpdate(ItemStack itemstack, World par2World, Entity par3Entity, int par4, boolean par5)
    {
    if(itemstack.isItemEnchanted() == false)
    {
    itemstack.addEnchantment(KingdomKeys.HarvestHearts, 3);
    }
    }
}