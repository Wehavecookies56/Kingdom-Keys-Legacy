package wehavecookies56.kk.configuration;

import java.io.File;
import java.util.logging.Level;

import net.minecraftforge.common.Configuration;
import wehavecookies56.kk.lib.IDs;
import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.lib.Strings;
import cpw.mods.fml.common.FMLLog;

public class ConfigurationHandler {
    public static Configuration config;

    public static void preConfig(File file){
        config = new Configuration(file);
        
        try{
            config.load();
            
            //ITEMS
            IDs.KingdomKey = config.getItem(Strings.KingdomKey  + " ID", IDs.KINGDOMKEY_DEFAULT).getInt(IDs.KINGDOMKEY_DEFAULT);
            IDs.Disc1 = config.getItem(Strings.Disc1  + " ID", IDs.DISC1_DEFAULT).getInt(IDs.DISC1_DEFAULT);
            IDs.Disc2 = config.getItem(Strings.Disc2  + " ID", IDs.DISC2_DEFAULT).getInt(IDs.DISC2_DEFAULT);
            
            //BLOCKS
            IDs.NBlox = config.getBlock(Strings.NBlox  + " ID", IDs.NORMALBLOX_DEFAULT).getInt(IDs.NORMALBLOX_DEFAULT);
            IDs.HBlox = config.getBlock(Strings.HBlox  + " ID", IDs.HARDBLOX_DEFAULT).getInt(IDs.HARDBLOX_DEFAULT);
            IDs.MBlox = config.getBlock(Strings.MBlox  + " ID", IDs.METALBLOX_DEFAULT).getInt(IDs.METALBLOX_DEFAULT);
            IDs.PBlox = config.getBlock(Strings.PBlox  + " ID", IDs.PRIZEBLOX_DEFAULT).getInt(IDs.PRIZEBLOX_DEFAULT);
            IDs.RPBlox = config.getBlock(Strings.RPBlox  + " ID", IDs.RAREPRIZEBLOX_DEFAULT).getInt(IDs.RAREPRIZEBLOX_DEFAULT);
            IDs.BBlox = config.getBlock(Strings.BBlox  + " ID", IDs.BOUNCEBLOX_DEFAULT).getInt(IDs.BOUNCEBLOX_DEFAULT);
            IDs.DBlox = config.getBlock(Strings.DBlox  + " ID", IDs.DANGERBLOX_DEFAULT).getInt(IDs.DANGERBLOX_DEFAULT);
        }
        catch(Exception e){
            FMLLog.log(Level.SEVERE, e, Reference.MOD_ID + "Has a problem loading the config file");
        }
        finally{
            config.save();
        }
    }
}
