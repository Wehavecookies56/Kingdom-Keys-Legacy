package wehavecookies56.kk.updater;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

import wehavecookies56.kk.lib.PrintToPlayer;

import net.minecraft.network.INetworkManager;
import net.minecraft.network.NetLoginHandler;
import net.minecraft.network.packet.NetHandler;
import net.minecraft.network.packet.Packet1Login;
import net.minecraft.server.MinecraftServer;
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
		this.currentVersion = currentVersion;
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
				System.out.println(modName + " is up to date");
			}
			else
			{
				System.out.println("Version " + newVersion + " is available for " + modName);
				PrintToPlayer.printText(("Version " + newVersion + " is available for " + modName));
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
	
	public static void downloadNewVersion()
	  {
		//TODO: Allow player to download file from web and have it parse it into the mods folder
	     /*try
	     {
	        long startTime = System.currentTimeMillis();
	 
	        System.out.println("Connecting to Mediafire...\n");
	 
	        URL url = new URL("http://www.mediafire.com/?d4wvcev647251kb");
	        url.openConnection();
	        InputStream reader = url.openStream();
	 
	        FileOutputStream writer = new FileOutputStream("mods/");
	        byte[] buffer = new byte[153600];
	        int totalBytesRead = 0;
	        int bytesRead = 0;
	 
	        System.out.println("Reading ZIP file 150KB blocks at a time.\n");
	 
	        while ((bytesRead = reader.read(buffer)) > 0)
	        {  
	           writer.write(buffer, 0, bytesRead);
	           buffer = new byte[153600];
	           totalBytesRead += bytesRead;
	        }
	 
	        long endTime = System.currentTimeMillis();
	 
	        System.out.println("Done. " + (new Integer(totalBytesRead).toString()) + " bytes read (" + (new Long(endTime - startTime).toString()) + " millseconds).\n");
	        writer.close();
	        reader.close();
	     }
	     catch (MalformedURLException e)
	     {
	        e.printStackTrace();
	     }
	     catch (IOException e)
	     {
	        e.printStackTrace();
	     }*/
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