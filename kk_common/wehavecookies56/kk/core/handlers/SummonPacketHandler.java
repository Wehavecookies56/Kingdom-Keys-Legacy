package wehavecookies56.kk.core.handlers;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet250CustomPayload;
import wehavecookies56.kk.client.gui.GuiSynthesis;
import wehavecookies56.kk.container.ContainerSynthesis;
import wehavecookies56.kk.entities.tileentities.TileEntitySynthesis;

import com.google.common.io.ByteArrayDataInput;
import com.google.common.io.ByteStreams;

import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.common.network.Player;

public class SummonPacketHandler implements IPacketHandler {

	public static String[] Channels;

	public static final String summon = "summon";

	// Before adding it remember to add it also in chanels, in network mod
	// attribute

	public static ItemStack result;
	public static int item1;
	public static int item2;
	public static int item3;
	public static int item4;
	public static int item5;
	public static int item6;
	public static int item7;
	public static int item8;
	public static int item9;
	public static int item10;
	public static int item11;

	@Override
	public void onPacketData(INetworkManager manager, Packet250CustomPayload packet, Player player) {
		EntityPlayer entityPlayer = (EntityPlayer)player;
		ByteArrayDataInput reader = ByteStreams.newDataInput(packet.data);
		byte packetId = reader.readByte();

		switch (packetId) {
		case 0:
			byte buttonId = reader.readByte();
			Container container = entityPlayer.openContainer;
			if (container != null && container instanceof ContainerSynthesis) {
				TileEntitySynthesis synthesis = ((ContainerSynthesis)container).getSynthesis();
				synthesis.receiveButtonEvent(buttonId);
			}
			break;
		}
		if (packet.channel.equals(summon)) {
			SummonEventHandler.handlePacket(packet, (EntityPlayer) player);

		}
		if(packet.data != null && packet.data.length == 1 && packet.data[0] == 1){
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			thePlayer.inventory.addItemStackToInventory(result);
			for (int i = 0; i < thePlayer.openContainer.inventorySlots.size(); ++i) {
				itemListToSend.add(((Slot) thePlayer.openContainer.inventorySlots.get(i)).getStack());
			}
			thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			if(item1 != 0){
				thePlayer.inventory.consumeInventoryItem(item1);
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			if(item2 != 0){
				thePlayer.inventory.consumeInventoryItem(item2);
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			if(item3 != 0){
				thePlayer.inventory.consumeInventoryItem(item3);
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			if(item4 != 0){
				thePlayer.inventory.consumeInventoryItem(item4);
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			if(item5 != 0){
				thePlayer.inventory.consumeInventoryItem(item5);
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			if(item6 != 0){
				thePlayer.inventory.consumeInventoryItem(item6);
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			if(item7 != 0){
				thePlayer.inventory.consumeInventoryItem(item7);
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			if(item8 != 0){
				thePlayer.inventory.consumeInventoryItem(item8);
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			if(item9 != 0){
				thePlayer.inventory.consumeInventoryItem(item9);
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			if(item10 != 0){
				thePlayer.inventory.consumeInventoryItem(item10);
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			if(item11 != 0){
				thePlayer.inventory.consumeInventoryItem(item11);
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
		}
	}
	public static void sendButtonPacket(byte id) {
		ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
		DataOutputStream dataStream = new DataOutputStream(byteStream);

		try {
			dataStream.writeByte((byte)1);
			dataStream.writeByte(id);			

			PacketDispatcher.sendPacketToServer(PacketDispatcher.getPacket(summon, byteStream.toByteArray()));
		}catch(IOException ex) {
			System.err.append("Failed to send button click packet");
		}	
	}	
}
