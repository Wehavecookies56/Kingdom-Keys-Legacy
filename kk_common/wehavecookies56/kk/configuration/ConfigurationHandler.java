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
            IDs.OBoots = config.getItem(Strings.OBoots  + " ID", IDs.OBOOTS_DEFAULT).getInt(IDs.OBOOTS_DEFAULT);
            IDs.OHelm = config.getItem(Strings.OHood  + " ID", IDs.OHELM_DEFAULT).getInt(IDs.OHELM_DEFAULT);
            IDs.OChest = config.getItem(Strings.OCoat  + " ID", IDs.OCHEST_DEFAULT).getInt(IDs.OCHEST_DEFAULT);
            IDs.OLegs = config.getItem(Strings.OLegs  + " ID", IDs.OLEGS_DEFAULT).getInt(IDs.OLEGS_DEFAULT);
            IDs.Disc1 = config.getItem(Strings.Disc1  + " ID", IDs.DISC1_DEFAULT).getInt(IDs.DISC1_DEFAULT);
            IDs.Disc2 = config.getItem(Strings.Disc2  + " ID", IDs.DISC2_DEFAULT).getInt(IDs.DISC2_DEFAULT);
            IDs.PureHeart = config.getItem(Strings.PHeart  + " ID", IDs.PUREHEART_DEFAULT).getInt(IDs.PUREHEART_DEFAULT);
            IDs.DarkHeart = config.getItem(Strings.DHeart  + " ID", IDs.DARKHEART_DEFAULT).getInt(IDs.DARKHEART_DEFAULT);
            IDs.Heart = config.getItem(Strings.Heart  + " ID", IDs.HEART_DEFAULT).getInt(IDs.HEART_DEFAULT);
            IDs.KingdomHearts = config.getItem(Strings.KHearts  + " ID", IDs.KINGDOMHEARTS_DEFAULT).getInt(IDs.KINGDOMHEARTS_DEFAULT);
            IDs.OathKeeper = config.getItem(Strings.OathKeeper  + " ID", IDs.OATHKEEPER_DEFAULT).getInt(IDs.OATHKEEPER_DEFAULT);
            IDs.KingdomKeyD = config.getItem(Strings.KingdomKeyD  + " ID", IDs.KINGDOMKEYD_DEFAULT).getInt(IDs.OATHKEEPER_DEFAULT);
            
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
