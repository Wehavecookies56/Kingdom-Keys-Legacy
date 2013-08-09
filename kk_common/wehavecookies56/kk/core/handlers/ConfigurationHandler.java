package wehavecookies56.kk.core.handlers;

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
            IDs.DarkLeather = config.getItem(Strings.DLeather  + " ID", IDs.DARKLEATHER_DEFAULT).getInt(IDs.DARKLEATHER_DEFAULT);
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
            IDs.KingdomKeyD = config.getItem(Strings.KingdomKeyD  + " ID", IDs.KINGDOMKEYD_DEFAULT).getInt(IDs.KINGDOMKEYD_DEFAULT);
            IDs.HP = config.getItem(Strings.HP  + " ID", IDs.HP_DEFAULT).getInt(IDs.HP_DEFAULT);
            IDs.Munny = config.getItem(Strings.Munny  + " ID", IDs.MUNNY_DEFAULT).getInt(IDs.MUNNY_DEFAULT);
            IDs.Potion = config.getItem(Strings.Potion  + " ID", IDs.POTION_DEFAULT).getInt(IDs.POTION_DEFAULT);
            IDs.Oblivion = config.getItem(Strings.Oblivion  + " ID", IDs.OBLIVION_DEFAULT).getInt(IDs.OBLIVION_DEFAULT);
            IDs.OblivionChain = config.getItem(Strings.OblivionChain  + " ID", IDs.OBLIVIONCHAIN_DEFAULT).getInt(IDs.OBLIVIONCHAIN_DEFAULT);
            IDs.OathkeeperChain = config.getItem(Strings.OathkeeperChain  + " ID", IDs.OATHKEEPERCHAIN_DEFAULT).getInt(IDs.OATHKEEPERCHAIN_DEFAULT);
            IDs.KingdomKeyChain = config.getItem(Strings.KingdomKeyChain  + " ID", IDs.KINGDOMKEYCHAIN_DEFAULT).getInt(IDs.KINGDOMKEYCHAIN_DEFAULT);
            IDs.KingdomKeyDChain = config.getItem(Strings.KingdomKeyDChain  + " ID", IDs.KINGDOMKEYDCHAIN_DEFAULT).getInt(IDs.KINGDOMKEYDCHAIN_DEFAULT);
            
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
