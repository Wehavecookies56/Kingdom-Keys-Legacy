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
import wehavecookies56.kk.item.AddedItems;
import wehavecookies56.kk.lib.ConfigBooleans;
import wehavecookies56.kk.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemOmegaWeapon extends ItemSword {
	public static boolean keyPressed = false;
	public static boolean keyHasBeenPressed = false;
    public ItemOmegaWeapon(int id, EnumToolMaterial kingdomkey7777) {
        super(id, kingdomkey7777);
        this.setCreativeTab(KingdomKeys.KHDAYSTAB);
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
    	dataList.add("Kingdom Hearts 358/2 Days");
    }
    
    public void onUpdate(ItemStack itemstack, World par2World, Entity par3Entity, int par4, boolean par5)
    {
    if(itemstack.isItemEnchanted() == false)
    {
    itemstack.addEnchantment(KingdomKeys.HarvestHearts, 6);
    }
	EntityPlayer player = (EntityPlayer)par3Entity;
	if (this.keyPressed)
	{
		this.keyPressed = false;
		if (player.getHeldItem() != null && player.getHeldItem().itemID == AddedItems.K45.itemID)
		{
			player.inventory.setInventorySlotContents(player.inventory.currentItem, new ItemStack(AddedItems.K45c));
		}
	}
    }
}