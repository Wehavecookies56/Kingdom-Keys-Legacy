package wehavecookies56.kk.core.handlers;

import java.io.File;
import java.util.logging.Level;

import net.minecraftforge.common.Configuration;
import wehavecookies56.kk.lib.ConfigBooleans;
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
            IDs.K111 = config.getItem(Strings.KingdomKey  + " ID", IDs.KINGDOMKEY_DEFAULT).getInt(IDs.KINGDOMKEY_DEFAULT);
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
            IDs.K112 = config.getItem(Strings.Oathkeeper  + " ID", IDs.OATHKEEPER_DEFAULT).getInt(IDs.OATHKEEPER_DEFAULT);
            IDs.K113 = config.getItem(Strings.KingdomKeyD  + " ID", IDs.KINGDOMKEYD_DEFAULT).getInt(IDs.KINGDOMKEYD_DEFAULT);
            IDs.HP = config.getItem(Strings.HP  + " ID", IDs.HP_DEFAULT).getInt(IDs.HP_DEFAULT);
            IDs.Munny = config.getItem(Strings.Munny  + " ID", IDs.MUNNY_DEFAULT).getInt(IDs.MUNNY_DEFAULT);
            IDs.Potion = config.getItem(Strings.Potion  + " ID", IDs.POTION_DEFAULT).getInt(IDs.POTION_DEFAULT);
            IDs.K114 = config.getItem(Strings.Oblivion  + " ID", IDs.OBLIVION_DEFAULT).getInt(IDs.OBLIVION_DEFAULT);
            IDs.OblivionChain = config.getItem(Strings.OblivionChain  + " ID", IDs.OBLIVIONCHAIN_DEFAULT).getInt(IDs.OBLIVIONCHAIN_DEFAULT);
            IDs.OathkeeperChain = config.getItem(Strings.OathkeeperChain  + " ID", IDs.OATHKEEPERCHAIN_DEFAULT).getInt(IDs.OATHKEEPERCHAIN_DEFAULT);
            IDs.KingdomKeyChain = config.getItem(Strings.KingdomKeyChain  + " ID", IDs.KINGDOMKEYCHAIN_DEFAULT).getInt(IDs.KINGDOMKEYCHAIN_DEFAULT);
            IDs.KingdomKeyDChain = config.getItem(Strings.KingdomKeyDChain  + " ID", IDs.KINGDOMKEYDCHAIN_DEFAULT).getInt(IDs.KINGDOMKEYDCHAIN_DEFAULT);
            IDs.K110 = config.getItem(Strings.Waywardwind  + " ID", IDs.WAYWARDWIND_DEFAULT).getInt(IDs.WAYWARDWIND_DEFAULT);
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
            IDs.K109 = config.getItem(Strings.Earthshaker  + " ID", IDs.EARTHSHAKER_DEFAULT).getInt(IDs.EARTHSHAKER_DEFAULT);
            IDs.EarthShakerChain = config.getItem(Strings.EarthShakerChain  + " ID", IDs.EARTHSHAKERCHAIN_DEFAULT).getInt(IDs.EARTHSHAKERCHAIN_DEFAULT);
            IDs.K108 = config.getItem(Strings.Rainfell  + " ID", IDs.RAINFELL_DEFAULT).getInt(IDs.RAINFELL_DEFAULT);
            IDs.RainFellChain = config.getItem(Strings.RainFellChain  + " ID", IDs.RAINFELLCHAIN_DEFAULT).getInt(IDs.RAINFELLCHAIN_DEFAULT);
            IDs.K107 = config.getItem(Strings.Starlight  + " ID", IDs.STARLIGHT_DEFAULT).getInt(IDs.STARLIGHT_DEFAULT);
            IDs.K106 = config.getItem(Strings.Souleater  + " ID", IDs.SOULEATER_DEFAULT).getInt(IDs.SOULEATER_DEFAULT);
            IDs.Vulpeus = config.getItem(Strings.Vulpeus  + " ID", IDs.VULPEUS_DEFAULT).getInt(IDs.VULPEUS_DEFAULT);
            IDs.Ursus = config.getItem(Strings.Ursus  + " ID", IDs.URSUS_DEFAULT).getInt(IDs.URSUS_DEFAULT);
            IDs.Unicornis = config.getItem(Strings.Unicornis  + " ID", IDs.UNICORNIS_DEFAULT).getInt(IDs.UNICORNIS_DEFAULT);
            IDs.K4 = config.getItem(Strings.Leopardos  + " ID", IDs.LEOPARDOS_DEFAULT).getInt(IDs.LEOPARDOS_DEFAULT);
            IDs.K5 = config.getItem(Strings.Anguis  + " ID", IDs.ANGUIS_DEFAULT).getInt(IDs.ANGUIS_DEFAULT);
            IDs.K6 = config.getItem(Strings.Leaskeyblade  + " ID", IDs.LEASKEYBLADE_DEFAULT).getInt(IDs.LEASKEYBLADE_DEFAULT);
            IDs.K7 = config.getItem(Strings.Youngxehanortskeyblade  + " ID", IDs.YOUNGXEHANORTSKEYBLADE_DEFAULT).getInt(IDs.YOUNGXEHANORTSKEYBLADE_DEFAULT);
            IDs.K8 = config.getItem(Strings.Oceanrage  + " ID", IDs.OCEANRAGE_DEFAULT).getInt(IDs.OCEANRAGE_DEFAULT);
            IDs.K9 = config.getItem(Strings.Endofpain  + " ID", IDs.ENDOFPAIN_DEFAULT).getInt(IDs.ENDOFPAIN_DEFAULT);
            IDs.K10 = config.getItem(Strings.Unbound  + " ID", IDs.UNBOUND_DEFAULT).getInt(IDs.UNBOUND_DEFAULT);
            IDs.K11 = config.getItem(Strings.Sweetdreams  + " ID", IDs.SWEETDREAMS_DEFAULT).getInt(IDs.SWEETDREAMS_DEFAULT);
            IDs.K12 = config.getItem(Strings.Divewing  + " ID", IDs.DIVEWING_DEFAULT).getInt(IDs.DIVEWING_DEFAULT);
            IDs.K13 = config.getItem(Strings.Counterpoint  + " ID", IDs.COUNTERPOINT_DEFAULT).getInt(IDs.COUNTERPOINT_DEFAULT);
            IDs.K14 = config.getItem(Strings.Allforone  + " ID", IDs.ALLFORONE_DEFAULT).getInt(IDs.ALLFORONE_DEFAULT);
            IDs.K15 = config.getItem(Strings.Knockoutpunch  + " ID", IDs.KNOCKOUTPUNCH_DEFAULT).getInt(IDs.KNOCKOUTPUNCH_DEFAULT);
            IDs.K16 = config.getItem(Strings.Ferrisgear  + " ID", IDs.FERRISGEAR_DEFAULT).getInt(IDs.FERRISGEAR_DEFAULT);
            IDs.K17 = config.getItem(Strings.Dualdisc  + " ID", IDs.DUALDISC_DEFAULT).getInt(IDs.DUALDISC_DEFAULT);
            IDs.K18 = config.getItem(Strings.Guardianbell  + " ID", IDs.GUARDIANBELL_DEFAULT).getInt(IDs.GUARDIANBELL_DEFAULT);
            IDs.K19 = config.getItem(Strings.Skullnoise  + " ID", IDs.SKULLNOISE_DEFAULT).getInt(IDs.SKULLNOISE_DEFAULT);
            IDs.K20 = config.getItem(Strings.Woodenkeyblade  + " ID", IDs.WOODENKEYBLADE_DEFAULT).getInt(IDs.WOODENKEYBLADE_DEFAULT);
            IDs.K21 = config.getItem(Strings.Kyebladebroken  + " ID", IDs.KYEBLADEBROKEN_DEFAULT).getInt(IDs.KYEBLADEBROKEN_DEFAULT);
            IDs.K22 = config.getItem(Strings.Kyeblade  + " ID", IDs.COUNTERPOINT_DEFAULT).getInt(IDs.KYEBLADE_DEFAULT);
            IDs.K23 = config.getItem(Strings.Lightseeker  + " ID", IDs.COUNTERPOINT_DEFAULT).getInt(IDs.LIGHTSEEKER_DEFAULT);
            IDs.K24 = config.getItem(Strings.Lostmemory  + " ID", IDs.COUNTERPOINT_DEFAULT).getInt(IDs.LOSTMEMORY_DEFAULT);
            IDs.K25 = config.getItem(Strings.Frolicflame  + " ID", IDs.COUNTERPOINT_DEFAULT).getInt(IDs.FROLICFLAME_DEFAULT);
            IDs.K26 = config.getItem(Strings.Masterkeeper  + " ID", IDs.COUNTERPOINT_DEFAULT).getInt(IDs.MASTERKEEPER_DEFAULT);
            IDs.K27 = config.getItem(Strings.Brigthcrest  + " ID", IDs.BRIGTHCREST_DEFAULT).getInt(IDs.BRIGTHCREST_DEFAULT);
            IDs.K28 = config.getItem(Strings.Crownunlimit  + " ID", IDs.CROWNUNLIMIT_DEFAULT).getInt(IDs.CROWNUNLIMIT_DEFAULT);
            IDs.K29 = config.getItem(Strings.Noname  + " ID", IDs.NONAME_DEFAULT).getInt(IDs.NONAME_DEFAULT);
            IDs.K30 = config.getItem(Strings.Voidgear  + " ID", IDs.VOIDGEAR_DEFAULT).getInt(IDs.VOIDGEAR_DEFAULT);
            IDs.K31 = config.getItem(Strings.Sweetstack  + " ID", IDs.SWEETSTACK_DEFAULT).getInt(IDs.SWEETSTACK_DEFAULT);
            IDs.K32 = config.getItem(Strings.Pixiepetal  + " ID", IDs.PIXIEPETAL_DEFAULT).getInt(IDs.PIXIEPETAL_DEFAULT);
            IDs.K33 = config.getItem(Strings.Hyperdrive  + " ID", IDs.HYPERDRIVE_DEFAULT).getInt(IDs.HYPERDRIVE_DEFAULT);
            IDs.K34 = config.getItem(Strings.Markofahero  + " ID", IDs.MARKOFAHERO_DEFAULT).getInt(IDs.MARKOFAHERO_DEFAULT);
            IDs.K35 = config.getItem(Strings.Victoryline  + " ID", IDs.VICTORYLINE_DEFAULT).getInt(IDs.VICTORYLINE_DEFAULT);
            IDs.K36 = config.getItem(Strings.Fairystars  + " ID", IDs.FAIRYSTARS_DEFAULT).getInt(IDs.FAIRYSTARS_DEFAULT);
            IDs.K37 = config.getItem(Strings.Strokeofmidnight  + " ID", IDs.STROKEOFMIDNIGHT_DEFAULT).getInt(IDs.STROKEOFMIDNIGHT_DEFAULT);
            IDs.K38 = config.getItem(Strings.Chaosripper  + " ID", IDs.CHAOSRIPPER_DEFAULT).getInt(IDs.CHAOSRIPPER_DEFAULT);
            IDs.K39 = config.getItem(Strings.Xehanortskeyblade  + " ID", IDs.XEHANORTSKEYBLADE_DEFAULT).getInt(IDs.XEHANORTSKEYBLADE_DEFAULT);
            IDs.K40 = config.getItem(Strings.Darkgnaw  + " ID", IDs.DARKGNAW_DEFAULT).getInt(IDs.DARKGNAW_DEFAULT);
            IDs.K41 = config.getItem(Strings.Zeroone  + " ID", IDs.ZEROONE_DEFAULT).getInt(IDs.ZEROONE_DEFAULT);
            IDs.K42 = config.getItem(Strings.Dreamsword  + " ID", IDs.DREAMSWORD_DEFAULT).getInt(IDs.DREAMSWORD_DEFAULT);
            IDs.K43 = config.getItem(Strings.Aubade  + " ID", IDs.AUBLADE_DEFAULT).getInt(IDs.AUBLADE_DEFAULT);
            IDs.K44 = config.getItem(Strings.Umbrella  + " ID", IDs.UMBRELLA_DEFAULT).getInt(IDs.UMBRELLA_DEFAULT);
            IDs.K45 = config.getItem(Strings.Omegaweapon  + " ID", IDs.OMEGAWEAPON_DEFAULT).getInt(IDs.OMEGAWEAPON_DEFAULT);
            IDs.K46 = config.getItem(Strings.Twilightblaze  + " ID", IDs.TWILIGHTBLAZE_DEFAULT).getInt(IDs.TWILIGHTBLAZE_DEFAULT);
            IDs.K47 = config.getItem(Strings.Maverickflare  + " ID", IDs.MAVERICKFLARE_DEFAULT).getInt(IDs.MAVERICKFLARE_DEFAULT);
            IDs.K48 = config.getItem(Strings.Astralblast  + " ID", IDs.ASTRALBLAST_DEFAULT).getInt(IDs.ASTRALBLAST_DEFAULT);
            IDs.K49 = config.getItem(Strings.Darkerthandark  + " ID", IDs.DARKERTHANDARK_DEFAULT).getInt(IDs.DARKERTHANDARK_DEFAULT);
            IDs.K50 = config.getItem(Strings.Lunareclipse  + " ID", IDs.LUNARECLIPSE_DEFAULT).getInt(IDs.LUNARECLIPSE_DEFAULT);
            IDs.K51 = config.getItem(Strings.Silentdirge  + " ID", IDs.SILENTDIRGE_DEFAULT).getInt(IDs.SILENTDIRGE_DEFAULT);
            IDs.K52 = config.getItem(Strings.Totaleclipse  + " ID", IDs.TOTALECLIPSE_DEFAULT).getInt(IDs.TOTALECLIPSE_DEFAULT);
            IDs.K53 = config.getItem(Strings.Glimpseofdarkness  + " ID", IDs.GLIMPSEOFDARKNESS_DEFAULT).getInt(IDs.GLIMPSEOFDARKNESS_DEFAULT);
            IDs.K54 = config.getItem(Strings.Midnightroar  + " ID", IDs.MIDNIGHTROAR_DEFAULT).getInt(IDs.MIDNIGHTROAR_DEFAULT);
            IDs.K55 = config.getItem(Strings.Rejectionoffate  + " ID", IDs.REJECTIONOFFATE_DEFAULT).getInt(IDs.REJECTIONOFFATE_DEFAULT);
            IDs.K56 = config.getItem(Strings.Truelightsflight  + " ID", IDs.TRUELIGHTSFLIGHT_DEFAULT).getInt(IDs.TRUELIGHTSFLIGHT_DEFAULT);
            IDs.K57 = config.getItem(Strings.Leviathan  + " ID", IDs.LEVIATHAN_DEFAULT).getInt(IDs.LEVIATHAN_DEFAULT);
            IDs.K58 = config.getItem(Strings.Abyssaltide  + " ID", IDs.ABYSSALTIDE_DEFAULT).getInt(IDs.ABYSSALTIDE_DEFAULT);
            IDs.K59 = config.getItem(Strings.Crownofguilt  + " ID", IDs.CROWNOFGUILT_DEFAULT).getInt(IDs.CROWNOFGUILT_DEFAULT);
            IDs.K60 = config.getItem(Strings.Signofinnocence  + " ID", IDs.SIGNOFINNOCENCE_DEFAULT).getInt(IDs.SIGNOFINNOCENCE_DEFAULT);
            IDs.K61 = config.getItem(Strings.Painofsolitude  + " ID", IDs.PAINOFSOLITUDE_DEFAULT).getInt(IDs.PAINOFSOLITUDE_DEFAULT);
            IDs.K62 = config.getItem(Strings.Abbadonplasma  + " ID", IDs.ABBADONPLASMA_DEFAULT).getInt(IDs.ABBADONPLASMA_DEFAULT);
            IDs.K63 = config.getItem(Strings.Ominousblight  + " ID", IDs.OMINOUSBLIGHT_DEFAULT).getInt(IDs.OMINOUSBLIGHT_DEFAULT);
            IDs.K64 = config.getItem(Strings.Missingache  + " ID", IDs.MISSINGACHE_DEFAULT).getInt(IDs.MISSINGACHE_DEFAULT);
            IDs.K65 = config.getItem(Strings.Winnersproof  + " ID", IDs.WINNERSPROOF_DEFAULT).getInt(IDs.WINNERSPROOF_DEFAULT);
            IDs.K66 = config.getItem(Strings.Fatalcrest  + " ID", IDs.FATALCREST_DEFAULT).getInt(IDs.FATALCREST_DEFAULT);
            IDs.K67 = config.getItem(Strings.Twobecomesone  + " ID", IDs.TWOBECOMESONE_DEFAULT).getInt(IDs.TWOBECOMESONE_DEFAULT);
            IDs.K68 = config.getItem(Strings.Bondofflame  + " ID", IDs.BONDOFFLAME_DEFAULT).getInt(IDs.BONDOFFLAME_DEFAULT);
            IDs.K69 = config.getItem(Strings.Fenrir  + " ID", IDs.FENRIR_DEFAULT).getInt(IDs.FENRIR_DEFAULT);
            IDs.K70 = config.getItem(Strings.Sleepinglion  + " ID", IDs.SLEEPINGLION_DEFAULT).getInt(IDs.SLEEPINGLION_DEFAULT);
            IDs.K71 = config.getItem(Strings.Guardiansoul  + " ID", IDs.GUARDIANSOUL_DEFAULT).getInt(IDs.GUARDIANSOUL_DEFAULT);
            IDs.K72 = config.getItem(Strings.Gullwing  + " ID", IDs.GULLWING_DEFAULT).getInt(IDs.GULLWING_DEFAULT);
            IDs.K73 = config.getItem(Strings.Photondebugger  + " ID", IDs.PHOTONDEBUGGER_DEFAULT).getInt(IDs.PHOTONDEBUGGER_DEFAULT);
            IDs.K74 = config.getItem(Strings.Sweetmemories  + " ID", IDs.SWEETMEMORIES_DEFAULT).getInt(IDs.SWEETMEMORIES_DEFAULT);
            IDs.K75 = config.getItem(Strings.Circleoflife  + " ID", IDs.CIRCLEOFLIFE_DEFAULT).getInt(IDs.COUNTERPOINT_DEFAULT);
            IDs.K76 = config.getItem(Strings.Decisivepumpkin  + " ID", IDs.DECISIVEPUMPKIN_DEFAULT).getInt(IDs.DECISIVEPUMPKIN_DEFAULT);
            IDs.K77 = config.getItem(Strings.Wishinglamp  + " ID", IDs.WISHINGLAMP_DEFAULT).getInt(IDs.WISHINGLAMP_DEFAULT);
            IDs.K78 = config.getItem(Strings.Followthewind  + " ID", IDs.FOLLOWTHEWIND_DEFAULT).getInt(IDs.FOLLOWTHEWIND_DEFAULT);
            IDs.K79 = config.getItem(Strings.Mysteriousabyss  + " ID", IDs.MYSTERIOUSABYSS_DEFAULT).getInt(IDs.MYSTERIOUSABYSS_DEFAULT);
            IDs.K80 = config.getItem(Strings.Monochrome  + " ID", IDs.MONOCHROME_DEFAULT).getInt(IDs.MONOCHROME_DEFAULT);
            IDs.K81 = config.getItem(Strings.Heroscrest  + " ID", IDs.HEROSCREST_DEFAULT).getInt(IDs.HEROSCREST_DEFAULT);
            IDs.K82 = config.getItem(Strings.Rumblingrose  + " ID", IDs.RUMBLINGROSE_DEFAULT).getInt(IDs.RUMBLINGROSE_DEFAULT);
            IDs.K83 = config.getItem(Strings.Hiddendragon  + " ID", IDs.HIDDENDRAGON_DEFAULT).getInt(IDs.HIDDENDRAGON_DEFAULT);
            IDs.K84 = config.getItem(Strings.Endsofearth  + " ID", IDs.ENDSOFEARTH_DEFAULT).getInt(IDs.ENDSOFEARTH_DEFAULT);
            IDs.K85 = config.getItem(Strings.Stormfall  + " ID", IDs.STORMFALL_DEFAULT).getInt(IDs.STORMFALL_DEFAULT);
            IDs.K86 = config.getItem(Strings.Destinysembrace  + " ID", IDs.DESTINYSEMBRACE_DEFAULT).getInt(IDs.DESTINYSEMBRACE_DEFAULT);
            IDs.K87 = config.getItem(Strings.Waytodawn  + " ID", IDs.WAYTODAWN_DEFAULT).getInt(IDs.WAYTODAWN_DEFAULT);
            IDs.K88 = config.getItem(Strings.Onewingedangel  + " ID", IDs.ONEWINGEDANGEL_DEFAULT).getInt(IDs.ONEWINGEDANGEL_DEFAULT);
            IDs.K89 = config.getItem(Strings.Diamonddust  + " ID", IDs.DIAMONDDUST_DEFAULT).getInt(IDs.DIAMONDDUST_DEFAULT);
            IDs.K90 = config.getItem(Strings.Lionheart  + " ID", IDs.LIONHEART_DEFAULT).getInt(IDs.LIONHEART_DEFAULT);
            IDs.K91 = config.getItem(Strings.Metalchocobo  + " ID", IDs.METALCHOCOBO_DEFAULT).getInt(IDs.METALCHOCOBO_DEFAULT);
            IDs.K92 = config.getItem(Strings.Spellbinder  + " ID", IDs.SPELLBINDER_DEFAULT).getInt(IDs.SPELLBINDER_DEFAULT);
            IDs.K93 = config.getItem(Strings.Divinerose  + " ID", IDs.DIVINEROSE_DEFAULT).getInt(IDs.DIVINEROSE_DEFAULT);
            IDs.K94 = config.getItem(Strings.Fairyharp  + " ID", IDs.FAIRYHARP_DEFAULT).getInt(IDs.FAIRYHARP_DEFAULT);
            IDs.K95 = config.getItem(Strings.Crabclaw  + " ID", IDs.CRABCLAW_DEFAULT).getInt(IDs.CRABCLAW_DEFAULT);
            IDs.K96 = config.getItem(Strings.Wishingstar  + " ID", IDs.WISHINGSTAR_DEFAULT).getInt(IDs.WISHINGSTAR_DEFAULT);
            IDs.K97 = config.getItem(Strings.Pumpkinhead  + " ID", IDs.PUMPKINHEAD_DEFAULT).getInt(IDs.PUMPKINHEAD_DEFAULT);
            IDs.K98 = config.getItem(Strings.Threewishes  + " ID", IDs.THRREWISHES_DEFAULT).getInt(IDs.THRREWISHES_DEFAULT);
            IDs.K99 = config.getItem(Strings.Jungleking  + " ID", IDs.JUNGLEKING_DEFAULT).getInt(IDs.JUNGLEKING_DEFAULT);
            IDs.K100 = config.getItem(Strings.Olympia  + " ID", IDs.OLYMPIA_DEFAULT).getInt(IDs.OLYMPIA_DEFAULT);
            IDs.K101 = config.getItem(Strings.Ladyluck  + " ID", IDs.LADYLUCK_DEFAULT).getInt(IDs.LADYLUCK_DEFAULT);
            IDs.K102 = config.getItem(Strings.Peopleshearts  + " ID", IDs.PEOPLESHEARTS_DEFAULT).getInt(IDs.PEOPLESHEARTS_DEFAULT);
            IDs.K103 = config.getItem(Strings.Ultimaweapon  + " ID", IDs.ULTIMAWEAPON_DEFAULT).getInt(IDs.ULTIMAWEAPON_DEFAULT);
            IDs.K104 = config.getItem(Strings.Treasuretrove  + " ID", IDs.TREASURETROVE_DEFAULT).getInt(IDs.TREASURETROVE_DEFAULT);
            IDs.K105 = config.getItem(Strings.Starseeker  + " ID", IDs.STARSEEKER_DEFAULT).getInt(IDs.STARSEEKER_DEFAULT);
            
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
            
            //BOOLEANS
            final String GENERATE = config.CATEGORY_GENERAL + config.CATEGORY_SPLITTER + "World Generation";
            ConfigBooleans.enableGenerate = config.get(GENERATE, ConfigBooleans.enableGenerate_name, ConfigBooleans.enableGenerate_default).getBoolean(ConfigBooleans.enableGenerate_default);
            ConfigBooleans.enableOverworld = config.get(GENERATE, ConfigBooleans.enableOverworld_name, ConfigBooleans.enableOverworld_default).getBoolean(ConfigBooleans.enableOverworld_default);
            final String UPDATECHECK = config.CATEGORY_GENERAL + config.CATEGORY_SPLITTER + "Update Check";
            ConfigBooleans.enableUpdateCheck = config.get(UPDATECHECK, ConfigBooleans.enableUpdateCheck_name, ConfigBooleans.enableUpdateCheck_default).getBoolean(ConfigBooleans.enableUpdateCheck_default);
            final String KEYBLADE = config.CATEGORY_GENERAL + config.CATEGORY_SPLITTER + "Keyblade Config";
            ConfigBooleans.enable3D = config.get(KEYBLADE, ConfigBooleans.enable3D_name, ConfigBooleans.enable3D_default).getBoolean(ConfigBooleans.enable3D_default);
            ConfigBooleans.altWaywardWind = config.get(KEYBLADE, ConfigBooleans.altWaywardWind_name, ConfigBooleans.altWaywardWind_default).getBoolean(ConfigBooleans.altWaywardWind_default);
            final String RECIPE = config.CATEGORY_GENERAL + config.CATEGORY_SPLITTER + "Keyblade Config";
            ConfigBooleans.heartRecipe = config.get(RECIPE, ConfigBooleans.heartRecipe_name, ConfigBooleans.heartRecipe_default).getBoolean(ConfigBooleans.heartRecipe_default);
        }
        catch(Exception e){
            FMLLog.log(Level.SEVERE, e, Reference.MOD_ID + "Has a problem loading the config file");
        }
        finally{
            config.save();
        }
    }
}