package wehavecookies56.kk.core.handlers;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet250CustomPayload;
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

	@Override
	public void onPacketData(INetworkManager manager,
			Packet250CustomPayload packet, Player player) {
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
