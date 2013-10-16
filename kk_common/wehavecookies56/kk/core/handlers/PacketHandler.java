package wehavecookies56.kk.core.handlers;

import java.util.ArrayList;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet250CustomPayload;
import wehavecookies56.kk.client.KeyBind;
import wehavecookies56.kk.item.AddedItems;
import wehavecookies56.kk.item.keyblades.*;
import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.Player;

public class PacketHandler implements IPacketHandler
{
	@Override
	public void onPacketData(INetworkManager manager, Packet250CustomPayload packet, Player player) 
	{
		if(packet.data != null && packet.data.length == 1 && packet.data[0] == 1)
		{
			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			if (KeyBind.keyPressed)
			{
				KeyBind.keyPressed = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K62.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K62c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						itemListToSend.add(((Slot) thePlayer.openContainer.inventorySlots.get(i)).getStack());
						KeyBind.keyPressed = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K62c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K62, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
							KeyBind.keyPressed = false;
					}
				}

			}
			
			if(KeyBind.keyPressedK1)
			{
				KeyBind.keyPressedK1 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.Vulpeus.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K1c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK1 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K1c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.Vulpeus, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK1 = false;
					}
				}
			}

			if(KeyBind.keyPressedK2)
			{
				KeyBind.keyPressedK2 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.Ursus.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K2c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK2 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K2c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.Ursus, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK2 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK3)
			{
				KeyBind.keyPressedK3 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.Unicornis.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K3c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK3 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K3c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.Unicornis, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK3 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK4)
			{
				KeyBind.keyPressedK4 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K4.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K3c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK4 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K4c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K4, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK4 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK5)
			{
				KeyBind.keyPressedK5 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K5.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K5c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK5 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K5c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K5, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK5 = false;
					}
				}
			}
			
		}
	}
}
