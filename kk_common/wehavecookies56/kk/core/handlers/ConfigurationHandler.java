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
            IDs.WaywardWind = config.getItem(Strings.WaywardWind  + " ID", IDs.WAYWARDWIND_DEFAULT).getInt(IDs.WAYWARDWIND_DEFAULT);
            IDs.WaywardWindChain = config.getItem(Strings.WaywardWindChain  + " ID", IDs.WAYWARDWINDCHAIN_DEFAULT).getInt(IDs.WAYWARDWINDCHAIN_DEFAULT);
            IDs.Disc3 = config.getItem(Strings.Disc3  + " ID", IDs.DISC3_DEFAULT).getInt(IDs.DISC3_DEFAULT);
            IDs.Disc4 = config.getItem(Strings.Disc4  + " ID", IDs.DISC4_DEFAULT).getInt(IDs.DISC4_DEFAULT);
            IDs.Disc5 = config.getItem(Strings.Disc5  + " ID", IDs.DISC5_DEFAULT).getInt(IDs.DISC5_DEFAULT);
            IDs.Disc6 = config.getItem(Strings.Disc6  + " ID", IDs.DISC6_DEFAULT).getInt(IDs.DISC6_DEFAULT);
            IDs.Disc7 = config.getItem(Strings.Disc7  + " ID", IDs.DISC7_DEFAULT).getInt(IDs.DISC7_DEFAULT);
            IDs.Disc8 = config.getItem(Strings.Disc8  + " ID", IDs.DISC8_DEFAULT).getInt(IDs.DISC8_DEFAULT);
            IDs.Disc9 = config.getItem(Strings.Disc9  + " ID", IDs.DISC9_DEFAULT).getInt(IDs.DISC9_DEFAULT);
            IDs.KABoots = config.getItem(Strings.KABoots  + " ID", IDs.KABOOTS_DEFAULT).getInt(IDs.KABOOTS_DEFAULT);
            IDs.KAHelm = config.getItem(Strings.KAHelm  + " ID", IDs.KAHELM_DEFAULT).getInt(IDs.KAHELM_DEFAULT);
            IDs.KAChest = config.getItem(Strings.KAChest  + " ID", IDs.KACHEST_DEFAULT).getInt(IDs.KACHEST_DEFAULT);
            IDs.KALegs = config.getItem(Strings.KALegs  + " ID", IDs.KALEGS_DEFAULT).getInt(IDs.KALEGS_DEFAULT);
            IDs.KTBoots = config.getItem(Strings.KTBoots  + " ID", IDs.KTBOOTS_DEFAULT).getInt(IDs.KTBOOTS_DEFAULT);
            IDs.KTHelm = config.getItem(Strings.KTHelm  + " ID", IDs.KTHELM_DEFAULT).getInt(IDs.KTHELM_DEFAULT);
            IDs.KTChest = config.getItem(Strings.KTChest  + " ID", IDs.KTCHEST_DEFAULT).getInt(IDs.KTCHEST_DEFAULT);
            IDs.KTLegs = config.getItem(Strings.KTLegs  + " ID", IDs.KTLEGS_DEFAULT).getInt(IDs.KTLEGS_DEFAULT);
            IDs.KVBoots = config.getItem(Strings.KVBoots  + " ID", IDs.KVBOOTS_DEFAULT).getInt(IDs.KVBOOTS_DEFAULT);
            IDs.KVHelm = config.getItem(Strings.KVHelm  + " ID", IDs.KVHELM_DEFAULT).getInt(IDs.KVHELM_DEFAULT);
            IDs.KVChest = config.getItem(Strings.KVChest  + " ID", IDs.KVCHEST_DEFAULT).getInt(IDs.KVCHEST_DEFAULT);
            IDs.KVLegs = config.getItem(Strings.KVLegs  + " ID", IDs.KVLEGS_DEFAULT).getInt(IDs.KVLEGS_DEFAULT);
            IDs.EarthShaker = config.getItem(Strings.EarthShaker  + " ID", IDs.EARTHSHAKER_DEFAULT).getInt(IDs.EARTHSHAKER_DEFAULT);
            IDs.EarthShakerChain = config.getItem(Strings.EarthShakerChain  + " ID", IDs.EARTHSHAKERCHAIN_DEFAULT).getInt(IDs.EARTHSHAKERCHAIN_DEFAULT);
            IDs.RainFell = config.getItem(Strings.RainFell  + " ID", IDs.RAINFELL_DEFAULT).getInt(IDs.RAINFELL_DEFAULT);
            IDs.RainFellChain = config.getItem(Strings.RainFellChain  + " ID", IDs.RAINFELLCHAIN_DEFAULT).getInt(IDs.RAINFELLCHAIN_DEFAULT);
            IDs.StarLight = config.getItem(Strings.StarLight  + " ID", IDs.STARLIGHT_DEFAULT).getInt(IDs.STARLIGHT_DEFAULT);
            IDs.SoulEater = config.getItem(Strings.SoulEater  + " ID", IDs.SOULEATER_DEFAULT).getInt(IDs.SOULEATER_DEFAULT);
            
            //BLOCKS
            IDs.NBlox = config.getBlock(Strings.NBlox  + " ID", IDs.NORMALBLOX_DEFAULT).getInt(IDs.NORMALBLOX_DEFAULT);
            IDs.HBlox = config.getBlock(Strings.HBlox  + " ID", IDs.HARDBLOX_DEFAULT).getInt(IDs.HARDBLOX_DEFAULT);
            IDs.MBlox = config.getBlock(Strings.MBlox  + " ID", IDs.METALBLOX_DEFAULT).getInt(IDs.METALBLOX_DEFAULT);
            IDs.PBlox = config.getBlock(Strings.PBlox  + " ID", IDs.PRIZEBLOX_DEFAULT).getInt(IDs.PRIZEBLOX_DEFAULT);
            IDs.RPBlox = config.getBlock(Strings.RPBlox  + " ID", IDs.RAREPRIZEBLOX_DEFAULT).getInt(IDs.RAREPRIZEBLOX_DEFAULT);
            IDs.BBlox = config.getBlock(Strings.BBlox  + " ID", IDs.BOUNCEBLOX_DEFAULT).getInt(IDs.BOUNCEBLOX_DEFAULT);
            IDs.DBlox = config.getBlock(Strings.DBlox  + " ID", IDs.DANGERBLOX_DEFAULT).getInt(IDs.DANGERBLOX_DEFAULT);
            IDs.BLBlox = config.getBlock(Strings.BLBlox  + " ID", IDs.BLBLOX_DEFAULT).getInt(IDs.BLBLOX_DEFAULT);
            IDs.Synthesis = config.getBlock(Strings.Synthesiser  + " ID", IDs.SYNTHESIS_DEFAULT).getInt(IDs.SYNTHESIS_DEFAULT);
        }
        catch(Exception e){
            FMLLog.log(Level.SEVERE, e, Reference.MOD_ID + "Has a problem loading the config file");
        }
        finally{
            config.save();
        }
    }
}