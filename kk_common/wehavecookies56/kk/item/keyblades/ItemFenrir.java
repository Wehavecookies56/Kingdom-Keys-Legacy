package wehavecookies56.kk.item.keyblades;

import java.util.List;

import mods.battlegear2.api.weapons.IBattlegearWeapon;
import mods.battlegear2.api.weapons.OffhandAttackEvent;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.item.AddedItems;
import wehavecookies56.kk.lib.ConfigBooleans;
import wehavecookies56.kk.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemFenrir extends ItemSword implements IBattlegearWeapon{
	public static boolean keyPressed = false;
	public static boolean keyHasBeenPressed = false;
    public ItemFenrir(int id, EnumToolMaterial kingdomkey19) {
        super(id, kingdomkey19);
        this.setCreativeTab(KingdomKeys.KHIITAB);
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
    	dataList.add("Kingdom Hearts II");
    }
    
    public void onUpdate(ItemStack itemstack, World par2World, Entity par3Entity, int par4, boolean par5)
    {
    if(itemstack.isItemEnchanted() == false)
    {
    itemstack.addEnchantment(KingdomKeys.HarvestHearts, 2);
    }
	EntityPlayer player = (EntityPlayer)par3Entity;
	if (this.keyPressed)
	{
		this.keyPressed = false;
		if (player.getHeldItem() != null && player.getHeldItem().itemID == AddedItems.K69.itemID)
		{
		}
	}
    }
	@Override
	public boolean sheatheOnBack(ItemStack item) {
		return true;
	}
	@Override
	public boolean isOffhandHandDual(ItemStack off) {
		return true;
	}
	@Override
	public boolean offhandAttackEntity(OffhandAttackEvent event,
			ItemStack mainhandItem, ItemStack offhandItem) {
		return false;
	}
	@Override
	public boolean offhandClickAir(PlayerInteractEvent event,
			ItemStack mainhandItem, ItemStack offhandItem) {
		return true;
	}
	@Override
	public boolean offhandClickBlock(PlayerInteractEvent event,
			ItemStack mainhandItem, ItemStack offhandItem) {
		return true;
	}
	@Override
	public void performPassiveEffects(Side effectiveSide,
			ItemStack mainhandItem, ItemStack offhandItem) {
	}
	@Override
	public boolean allowOffhand(ItemStack mainhand, ItemStack offhand) {
		return true;
	}
	
}