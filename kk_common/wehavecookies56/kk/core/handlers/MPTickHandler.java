/*package wehavecookies56.kk.core.handlers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;

public class MPTickHandler
{
	@ForgeSubscribe
	public void onLivingUpdateEvent(LivingUpdateEvent event)
	{
	if (event.entity instanceof EntityPlayer)
	{
	EntityPlayer player = (EntityPlayer) event.entity;
	ItemStack heldItem = player.getHeldItem();
	if (heldItem != null && heldItem.itemID == Item.arrow.itemID) {
	player.capabilities.allowFlying = true;
	}
	else {
	player.capabilities.allowFlying = player.capabilities.isCreativeMode ? true : false;
	}
	}
	}
	
}
*/