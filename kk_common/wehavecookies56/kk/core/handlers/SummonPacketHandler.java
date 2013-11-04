package wehavecookies56.kk.core.handlers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet250CustomPayload;
import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.Player;

public class SummonPacketHandler implements IPacketHandler {

	public static String[] Chanels;

	public static final String summon = "summon";

	// Before adding it remember to add it also in chanels, in network mod
	// attribute

	@Override
	public void onPacketData(INetworkManager manager,
			Packet250CustomPayload packet, Player player) {

		if (packet.channel.equals(summon)) {
			SummonEventHandler.handlePacket(packet, (EntityPlayer) player);

		}

	}


}
