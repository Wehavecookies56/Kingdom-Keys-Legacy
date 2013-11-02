package wehavecookies56.kk.updater;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

import net.minecraft.network.INetworkManager;
import net.minecraft.network.NetLoginHandler;
import net.minecraft.network.packet.NetHandler;
import net.minecraft.network.packet.Packet1Login;
import net.minecraft.server.MinecraftServer;
import wehavecookies56.kk.lib.PrintToPlayer;
import wehavecookies56.kk.lib.Reference;
import cpw.mods.fml.common.network.IConnectionHandler;
import cpw.mods.fml.common.network.Player;

public class Update implements IConnectionHandler
{
	public static String modName;
	public static String currentVersion;
	public static String url;
	
	public Update(String modName, String currentVersion, String url)
	{
		this.modName = modName;
		this.currentVersion = Reference.MOD_VER;
		this.url = url;
	}
	
	public static void getUpdate(String modName, String currentVersion, String url)
	{
		String newVersion = getNewVersion(url);
		int currentTick = 1;
		
		if(currentTick == 1)
		{
			currentTick++;
			
			if(currentVersion.equals(newVersion))
			{
				System.out.println(modName + " " + currentVersion + " is up to date");
				PrintToPlayer.printText((modName + " " + currentVersion + " is up to date"));
			}
			else if(newVersion == null)
			{
				System.out.println(modName + " could not check for updates");
				PrintToPlayer.printText((modName + " could not check for updates"));
			}
			else
			{
				System.out.println("A new version " + newVersion + " is available for " + modName + "." + " You are running version " + currentVersion);
				PrintToPlayer.printText(("A new version " + newVersion + " is available for " + modName + "." + " You are running version " + currentVersion));
			}	
		}
	}
	
	public static String getNewVersion(String address)
    {
		String newVersion = null;
    	try 
    	{
	    	URL url = new URL(address);
			Scanner scanner = new Scanner(url.openStream());
			while (scanner.hasNextLine())
			{
                newVersion = scanner.nextLine(); 
            }
			scanner.close();
		} 
    	catch (IOException ex)
    	{
			ex.printStackTrace();
		}
    	return newVersion;
    }
	
	@Override
	public void playerLoggedIn(Player player, NetHandler netHandler, INetworkManager manager)
	{
	}

	@Override
	public String connectionReceived(NetLoginHandler netHandler, INetworkManager manager)
	{
	return "";
	}

	@Override
	public void connectionOpened(NetHandler netClientHandler, String server, int port, INetworkManager manager)
	{
	}

	@Override
	public void connectionOpened(NetHandler netClientHandler, MinecraftServer server, INetworkManager manager)
	{
	}

	@Override
	public void connectionClosed(INetworkManager manager)
	{
	}

	@Override
	public void clientLoggedIn(NetHandler clientHandler, INetworkManager manager, Packet1Login login)
	{
		getUpdate(modName, currentVersion, url);
	}
}