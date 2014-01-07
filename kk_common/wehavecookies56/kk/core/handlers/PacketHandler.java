package wehavecookies56.kk.core.handlers;

import java.util.ArrayList;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet250CustomPayload;
import wehavecookies56.kk.client.KeyBind;
import wehavecookies56.kk.client.gui.GuiSynthesis;
import wehavecookies56.kk.item.AddedItems;
import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.Player;

public class PacketHandler implements IPacketHandler
{
	@Override
	public void onPacketData(INetworkManager manager, Packet250CustomPayload packet, Player player) 
	{
		boolean keyPressed = false;
		boolean keyHasBeenPressed = false;
		if(packet.data != null && packet.data.length == 1 && packet.data[0] == 1)
		{
			keyPressed = true;
			keyHasBeenPressed = true;
			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			if (keyPressed)
			{
				keyPressed = false;
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
						keyPressed = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K62c.itemID)
					{
						//Sounds.KEYBLADE_SUMMON.play(thePlayer.posX, thePlayer.posY, thePlayer.posZ, 1, 0);
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K62, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
							keyPressed = false;
					}
					if (keyHasBeenPressed) {
						keyHasBeenPressed = false;
						keyPressed = true;
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
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K4c, 1));
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
			
			if(KeyBind.keyPressedK6)
			{
				KeyBind.keyPressedK6 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K6.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K6c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK6 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K6c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K6, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK6 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK7)
			{
				KeyBind.keyPressedK7 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K7.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K7c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK7 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K7c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K7, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK7 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK8)
			{
				KeyBind.keyPressedK8 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K8.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K8c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK8 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K8c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K8, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK8 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK9)
			{
				KeyBind.keyPressedK9 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K9.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K9c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK9 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K9c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K9, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK9 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK10)
			{
				KeyBind.keyPressedK10 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K10.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K10c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK10 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K10c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K10, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK10 = false;
					}
				}
			}

			if(KeyBind.keyPressedK11)
			{
				KeyBind.keyPressedK11 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K11.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K11c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK11 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K11c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K11, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK11 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK12)
			{
				KeyBind.keyPressedK12 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K12.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K12c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK12 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K12c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K12, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK12 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK13)
			{
				KeyBind.keyPressedK13 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K13.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K13c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK13 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K13c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K13, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK13 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK14)
			{
				KeyBind.keyPressedK14 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K14.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K14c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK14 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K14c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K14, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK14 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK15)
			{
				KeyBind.keyPressedK15 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K15.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K15c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK15 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K15c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K15, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK15 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK16)
			{
				KeyBind.keyPressedK16 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K16.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K16c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK16 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K16c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K16, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK16 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK17)
			{
				KeyBind.keyPressedK17 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K17.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K17c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK17 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K17c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K17, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK17 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK18)
			{
				KeyBind.keyPressedK18 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K18.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K18c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK18 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K18c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K18, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK18 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK19)
			{
				KeyBind.keyPressedK19 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K19.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K19c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK19 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K19c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K19, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK19 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK20)
			{
				KeyBind.keyPressedK20 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K20.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K20c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK20 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K20c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K20, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK20 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK21)
			{
				KeyBind.keyPressedK21 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K21.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K21c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK21 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K21c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K21, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK21 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK22)
			{
				KeyBind.keyPressedK22 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K22.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K22c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK22 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K22c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K22, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK22 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK23)
			{
				KeyBind.keyPressedK23 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K23.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K23c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK23 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K23c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K23, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK23 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK24)
			{
				KeyBind.keyPressedK24 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K24.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K24c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK24 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K24c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K24, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK24 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK25)
			{
				KeyBind.keyPressedK25 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K25.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K25c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK25 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K25c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K25, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK25 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK26)
			{
				KeyBind.keyPressedK26 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K26.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K26c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK26 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K26c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K26, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK26 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK27)
			{
				KeyBind.keyPressedK27 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K27.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K27c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK27 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K27c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K27, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK27 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK28)
			{
				KeyBind.keyPressedK28 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K28.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K28c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK28 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K28c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K28, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK28 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK29)
			{
				KeyBind.keyPressedK29 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K29.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K29c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK29 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K29c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K29, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK29 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK30)
			{
				KeyBind.keyPressedK30 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K30.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K30c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK30 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K30c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K30, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK30 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK31)
			{
				KeyBind.keyPressedK31 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K31.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K31c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK31 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K31c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K31, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK31 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK32)
			{
				KeyBind.keyPressedK32 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K32.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K32c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK32 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K32c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K32, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK32 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK33)
			{
				KeyBind.keyPressedK33 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K33.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K33c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK33 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K33c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K33, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK33 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK34)
			{
				KeyBind.keyPressedK34 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K34.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K34c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK34 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K34c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K34, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK34 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK35)
			{
				KeyBind.keyPressedK35 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K35.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K35c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK35 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K35c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K35, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK35 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK36)
			{
				KeyBind.keyPressedK36 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K36.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K36c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK36 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K36c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K36, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK36 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK37)
			{
				KeyBind.keyPressedK37 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K37.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K37c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK37 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K37c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K37, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK37 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK38)
			{
				KeyBind.keyPressedK38 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K38.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K38c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK38 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K38c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K38, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK18 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK39)
			{
				KeyBind.keyPressedK39 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K39.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K39c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK39 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K39c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K39, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK39 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK40)
			{
				KeyBind.keyPressedK40 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K40.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K40c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK40 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K40c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K40, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK40 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK41)
			{
				KeyBind.keyPressedK41 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K41.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K41c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK41 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K41c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K41, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK41 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK42)
			{
				KeyBind.keyPressedK42 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K42.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K42c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK42 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K42c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K42, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK42 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK43)
			{
				KeyBind.keyPressedK43 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K43.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K43c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK43 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K43c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K43, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK43 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK44)
			{
				KeyBind.keyPressedK44 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K44.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K44c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK44 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K44c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K44, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK44 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK45)
			{
				KeyBind.keyPressedK45 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K14.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K45c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK45 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K45c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K45, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK45 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK46)
			{
				KeyBind.keyPressedK46 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K46.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K46c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK46 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K46c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K46, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK46 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK47)
			{
				KeyBind.keyPressedK47 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K47.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K47c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK47 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K47c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K47, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK47 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK48)
			{
				KeyBind.keyPressedK48 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K48.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K48c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK48 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K48c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K48, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK48 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK49)
			{
				KeyBind.keyPressedK19 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K49.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K49c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK49 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K49c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K49, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK49 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK50)
			{
				KeyBind.keyPressedK50 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K50.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K50c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK50 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K50c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K50, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK50 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK51)
			{
				KeyBind.keyPressedK51 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K51.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K51c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK51 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K51c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K51, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK51 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK52)
			{
				KeyBind.keyPressedK52 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K52.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K52c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK52 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K52c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K52, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK52 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK53)
			{
				KeyBind.keyPressedK53 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K53.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K53c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK53 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K53c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K53, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK53 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK54)
			{
				KeyBind.keyPressedK54 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K54.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K54c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK54 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K54c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K54, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK54 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK55)
			{
				KeyBind.keyPressedK55 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K55.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K55c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK55 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K55c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K55, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK55 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK56)
			{
				KeyBind.keyPressedK16 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K56.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K56c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK56 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K56c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K56, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK56 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK57)
			{
				KeyBind.keyPressedK57 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K57.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K57c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK57 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K57c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K57, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK57 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK58)
			{
				KeyBind.keyPressedK58 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K58.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K58c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK58 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K58c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K58, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK58 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK59)
			{
				KeyBind.keyPressedK59 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K59.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K59c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK59 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K59c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K59, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK59 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK60)
			{
				KeyBind.keyPressedK60 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K60.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K60c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK60 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K60c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K60, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK60 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK61)
			{
				KeyBind.keyPressedK61 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K61.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K61c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK61 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K61c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K61, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK61 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK63)
			{
				KeyBind.keyPressedK63 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K63.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K63c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK63 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K63c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K63, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK63 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK64)
			{
				KeyBind.keyPressedK64 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K64.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K64c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK64 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K64c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K64, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK64 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK65)
			{
				KeyBind.keyPressedK65 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K65.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K65c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK65 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K65c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K65, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK65 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK66)
			{
				KeyBind.keyPressedK16 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K66.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K66c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK66 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K66c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K66, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK66 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK67)
			{
				KeyBind.keyPressedK67 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K67.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K67c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK67 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K67c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K67, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK67 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK68)
			{
				KeyBind.keyPressedK68 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K68.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K68c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK68 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K68c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K68, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK68 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK69)
			{
				KeyBind.keyPressedK69 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K69.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K69c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK69 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K69c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K69, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK69 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK70)
			{
				KeyBind.keyPressedK70 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K70.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K70c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK70 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K70c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K70, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK70 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK71)
			{
				KeyBind.keyPressedK71 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K71.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K71c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK71 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K71c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K71, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK71 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK72)
			{
				KeyBind.keyPressedK72 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K72.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K72c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK72 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K72c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K72, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK72 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK73)
			{
				KeyBind.keyPressedK73 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K73.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K73c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK73 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K73c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K73, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK73 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK74)
			{
				KeyBind.keyPressedK74 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K74.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K74c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK74 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K74c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K74, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK74 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK75)
			{
				KeyBind.keyPressedK75 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K75.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K75c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK75 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K75c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K75, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK75 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK76)
			{
				KeyBind.keyPressedK76 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K76.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K76c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK76 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K76c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K76, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK76 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK77)
			{
				KeyBind.keyPressedK77 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K77.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K77c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK77 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K77c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K77, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK77 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK78)
			{
				KeyBind.keyPressedK78 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K78.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K78c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK78 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K78c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K78, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK78 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK79)
			{
				KeyBind.keyPressedK19 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K79.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K79c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK79 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K79c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K79, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK79 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK80)
			{
				KeyBind.keyPressedK80 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K80.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K80c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK80 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K80c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K80, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK80 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK81)
			{
				KeyBind.keyPressedK81 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K81.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K81c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK81 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K81c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K81, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK81 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK82)
			{
				KeyBind.keyPressedK82 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K82.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K82c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK82 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K82c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K82, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK82 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK83)
			{
				KeyBind.keyPressedK13 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K83.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K83c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK83 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K83c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K83, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK83 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK84)
			{
				KeyBind.keyPressedK84 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K84.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K84c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK84 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K84c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K84, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK84 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK85)
			{
				KeyBind.keyPressedK85 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K85.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K85c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK85 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K85c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K85, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK85 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK86)
			{
				KeyBind.keyPressedK86 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K86.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K86c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK86 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K86c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K86, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK86 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK87)
			{
				KeyBind.keyPressedK87 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K87.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K87c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK87 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K87c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K87, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK87 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK88)
			{
				KeyBind.keyPressedK88 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K88.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K88c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK88 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K88c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K88, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK88 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK89)
			{
				KeyBind.keyPressedK19 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K89.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K89c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK89 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K89c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K89, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK89 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK90)
			{
				KeyBind.keyPressedK90 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K90.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K90c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK90 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K90c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K90, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK90 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK91)
			{
				KeyBind.keyPressedK91 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K91.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K91c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK91 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K91c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K91, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK91 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK92)
			{
				KeyBind.keyPressedK92 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K92.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K92c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK92 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K92c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K92, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK92 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK93)
			{
				KeyBind.keyPressedK93 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K93.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K93c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK93 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K93c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K93, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK93 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK94)
			{
				KeyBind.keyPressedK14 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K94.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K94c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK94 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K94c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K94, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK94 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK95)
			{
				KeyBind.keyPressedK95 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K95.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K95c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK95 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K95c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K95, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK95 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK96)
			{
				KeyBind.keyPressedK96 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K96.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K96c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK96 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K96c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K96, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK96 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK97)
			{
				KeyBind.keyPressedK97 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K97.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K97c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK97 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K97c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K97, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK97 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK98)
			{
				KeyBind.keyPressedK98 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K98.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K98c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK98 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K98c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K98, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK98 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK99)
			{
				KeyBind.keyPressedK99 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K99.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K99c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK99 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K99c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K99, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK99 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK100)
			{
				KeyBind.keyPressedK100 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K100.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K100c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK100 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K100c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K100, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK100 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK101)
			{
				KeyBind.keyPressedK101 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K101.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K101c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK101 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K101c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K101, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK101 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK102)
			{
				KeyBind.keyPressedK102 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K102.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K102c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK102 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K102c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K102, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK102 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK103)
			{
				KeyBind.keyPressedK103 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K103.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K103c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK103 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K103c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K103, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK103 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK104)
			{
				KeyBind.keyPressedK104 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K104.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K104c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK104 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K104c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K104, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK104 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK105)
			{
				KeyBind.keyPressedK105 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K105.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K105c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK105 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K105c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K105, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK105 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK106)
			{
				KeyBind.keyPressedK106 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K106.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K106c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK106 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K106c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K106, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK106 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK107)
			{
				KeyBind.keyPressedK107 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K107.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K107c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK107 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K107c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K107, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK107 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK108)
			{
				KeyBind.keyPressedK108 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K108.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K108c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK108 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K108c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K108, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK108 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK109)
			{
				KeyBind.keyPressedK109 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K109.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K109c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK109 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K109c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K109, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK109 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK110)
			{
				KeyBind.keyPressedK110 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K110.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K110c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK110 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K110c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K110, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK110 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK111)
			{
				KeyBind.keyPressedK111 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K111.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K111c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK111 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K111c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K111, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK111 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK112)
			{
				KeyBind.keyPressedK112 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K112.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K112c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK112 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K112c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K112, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK112 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK113)
			{
				KeyBind.keyPressedK113 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K113.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K113c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK113 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K113c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K113, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK113 = false;
					}
				}
			}
			
			if(KeyBind.keyPressedK114)
			{
				KeyBind.keyPressedK114 = false;
				if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K114.itemID)
				{
					thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K114c, 1));
					thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
				}
				else
				{
					for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) 
					{
						KeyBind.keyPressedK114 = false;
					}

					if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == AddedItems.K114c.itemID)
					{
						thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(AddedItems.K114, 1));
						thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
					}
					else
					{
						KeyBind.keyPressedK114 = false;
					}
				}
			}
			if(GuiSynthesis.ButtonPressed == true && KeyTickHandler.HasKingdomKeyMats == true){
				System.out.println("SYNTHESIZED");
				GuiSynthesis.ButtonPressed = false;
				thePlayer.inventory.addItemStackToInventory(new ItemStack(AddedItems.K111c));
				thePlayer.inventory.consumeInventoryItem(AddedItems.BlazingCrystal.itemID);
			}
			
		}
	}
}
}

