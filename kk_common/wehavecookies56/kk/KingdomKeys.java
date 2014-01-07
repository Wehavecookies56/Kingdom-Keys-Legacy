package wehavecookies56.kk;

import java.io.File;
import java.util.logging.Level;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.MinecraftForge;
import wehavecookies56.kk.block.AddedBlocks;
import wehavecookies56.kk.core.handlers.ConfigurationHandler;
import wehavecookies56.kk.core.handlers.GuiHandler;
import wehavecookies56.kk.core.handlers.KeyTickHandler;
import wehavecookies56.kk.core.handlers.LocalizationHandler;
import wehavecookies56.kk.core.handlers.SummonPacketHandler;
import wehavecookies56.kk.core.helper.LogHelper;
import wehavecookies56.kk.core.proxies.ClientProxy;
import wehavecookies56.kk.core.proxies.CommonProxy;
import wehavecookies56.kk.creativetab.KHBBSTAB;
import wehavecookies56.kk.creativetab.KHCHITAB;
import wehavecookies56.kk.creativetab.KHDAYSTAB;
import wehavecookies56.kk.creativetab.KHDDDTAB;
import wehavecookies56.kk.creativetab.KHIITAB;
import wehavecookies56.kk.creativetab.KHRECODEDTAB;
import wehavecookies56.kk.creativetab.KHTAB;
import wehavecookies56.kk.creativetab.KKSMTAB;
import wehavecookies56.kk.creativetab.KKTAB;
import wehavecookies56.kk.enchantments.EnchantHeartHarvest;
import wehavecookies56.kk.entities.EntityBlastBlox;
import wehavecookies56.kk.entities.mob.EntityRedNocturne;
import wehavecookies56.kk.item.AddedItems;
import wehavecookies56.kk.lib.ConfigBooleans;
import wehavecookies56.kk.lib.Recipes;
import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.mob.DarkHeartDrops;
import wehavecookies56.kk.mob.HeartDrops;
import wehavecookies56.kk.mob.KingdomHeartsDrops;
import wehavecookies56.kk.mob.Munny1000Drops;
import wehavecookies56.kk.mob.Munny10Drops;
import wehavecookies56.kk.mob.Munny1Drops;
import wehavecookies56.kk.mob.Munny20Drops;
import wehavecookies56.kk.mob.Munny50Drops;
import wehavecookies56.kk.mob.Munny5Drops;
import wehavecookies56.kk.mob.PureHeartDrops;
import wehavecookies56.kk.updater.Update;
import wehavecookies56.kk.world.gen.WorldGenBlox;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;
//import wehavecookies56.kk.core.handlers.MPTickHandler;

@Mod(name = Reference.MOD_NAME, modid = Reference.MOD_ID, version = Reference.MOD_VER) 

@NetworkMod(clientSideRequired=true, serverSideRequired=false, channels = ("summon"), packetHandler = SummonPacketHandler.class)



public class KingdomKeys {

	//World gen
	WorldGenBlox worldGen = new WorldGenBlox();
	
	public static boolean battlegearInstalled = false;
	
    @Instance(Reference.MOD_ID)
    public static KingdomKeys instance;
    
    //Proxies
    @SidedProxy(clientSide="wehavecookies56.kk.core.proxies.ClientProxy", serverSide="wehavecookies56.kk.core.proxies.CommonProxy")
    public static CommonProxy proxy;
    public static ClientProxy cproxy;
    
    //Creative tabs
    public static CreativeTabs KKTAB = new KKTAB(CreativeTabs.getNextID(), "KKTAB");
    public static CreativeTabs KKSMTAB = new KKSMTAB(CreativeTabs.getNextID(), "KKSMTAB");
    public static CreativeTabs KHTAB = new KHTAB(CreativeTabs.getNextID(), "KHTAB");
    public static CreativeTabs KHIITAB = new KHIITAB(CreativeTabs.getNextID(), "KHIITAB");
    public static CreativeTabs KHBBSTAB = new KHBBSTAB(CreativeTabs.getNextID(), "KHBBSTAB");
    public static CreativeTabs KHCHITAB = new KHCHITAB(CreativeTabs.getNextID(), "KHCHITAB");
    public static CreativeTabs KHDAYSTAB = new KHDAYSTAB(CreativeTabs.getNextID(), "KHDAYSTAB");
    public static CreativeTabs KHRECODEDTAB = new KHRECODEDTAB(CreativeTabs.getNextID(), "KHRECODEDTAB");
    public static CreativeTabs KHDDDTAB = new KHDDDTAB(CreativeTabs.getNextID(), "KHDDDTAB");
    
    //Enchanment
    public static final Enchantment HarvestHearts = new EnchantHeartHarvest(52, 1);
    
    //Mob
    //public static int getUniqueEntityID
    
    //private GuiHandlerSynth guiHandlerSynth = new GuiHandlerSynth();
    
    //Pre initialisation
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	LogHelper.init();
        LogHelper.log(Level.INFO, "Preparing configuration file");
        ConfigurationHandler.preConfig(new File(event.getModConfigurationDirectory().getAbsolutePath() + File.separator + Reference.CHANNEL_NAME + File.separator + Reference.MOD_NAME + ".cfg"));
        LogHelper.log(Level.INFO, "Preparing keyblades");
        AddedItems.initKeyBlades();
        LogHelper.log(Level.INFO, "Preparing items");
        AddedItems.initHearts();
        AddedItems.initOthers();
        AddedItems.initBooks();
        AddedItems.intiArmour();
        LogHelper.log(Level.INFO, "Preparing dungeon loot");
        AddedItems.initLoot();
        LogHelper.log(Level.INFO, "Preparing blocks");
        AddedBlocks.preinit();
        LogHelper.log(Level.INFO, "Preparing language files");
        LocalizationHandler.loadLanguages();
        LanguageRegistry.instance().addStringLocalization("itemGroup.KKTAB", "en_US", "Kingdom Keys");
        LanguageRegistry.instance().addStringLocalization("itemGroup.KHTAB", "en_US", "Kingdom Keys: Kingdom Hearts");
        LanguageRegistry.instance().addStringLocalization("itemGroup.KHIITAB", "en_US", "Kingdom Keys: Kingdom Hearts II");
        LanguageRegistry.instance().addStringLocalization("itemGroup.KHCHITAB", "en_US", "Kingdom Keys: Kingdom Hearts Chi");
        LanguageRegistry.instance().addStringLocalization("itemGroup.KHRECODEDTAB", "en_US", "Kingdom Keys: Kingdom Hearts Re:Coded");
        LanguageRegistry.instance().addStringLocalization("itemGroup.KHDAYSTAB", "en_US", "Kingdom Keys: Kingdom Hearts 358/2 Days");
        LanguageRegistry.instance().addStringLocalization("itemGroup.KHDDDTAB", "en_US", "Kingdom Keys: Kingdom Hearts Dream Drop Distance");
        LanguageRegistry.instance().addStringLocalization("itemGroup.KHBBSTAB", "en_US", "Kingdom Keys: Kingdom Hearts Birth By Sleep");
        LanguageRegistry.instance().addStringLocalization("itemGroup.KKSMTAB", "en_US", "Kingdom Keys: Synthesis Materials");
        LogHelper.log(Level.INFO, "Preparing mob drop events");   
        MinecraftForge.EVENT_BUS.register(new HeartDrops());
        MinecraftForge.EVENT_BUS.register(new PureHeartDrops());
        MinecraftForge.EVENT_BUS.register(new DarkHeartDrops());
        MinecraftForge.EVENT_BUS.register(new KingdomHeartsDrops());
        MinecraftForge.EVENT_BUS.register(new Munny1Drops());
        MinecraftForge.EVENT_BUS.register(new Munny5Drops());
        MinecraftForge.EVENT_BUS.register(new Munny10Drops());
        MinecraftForge.EVENT_BUS.register(new Munny20Drops());
        MinecraftForge.EVENT_BUS.register(new Munny50Drops());
        MinecraftForge.EVENT_BUS.register(new Munny1000Drops());
        //MinecraftForge.EVENT_BUS.register(new SoundManager());
    }
    
    //Initialisation
    @EventHandler
    public void init(FMLInitializationEvent event) {
    	new GuiHandler();
    	 TickRegistry.registerTickHandler(new KeyTickHandler(), Side.SERVER);
    	//MinecraftForge.EVENT_BUS.register(new MPTickHandler());
        LogHelper.log(Level.INFO, "Preparing recipes");
        Recipes.initShapedRecipes();
        Recipes.initShapelessRecipes();
    	//NetworkRegistry.instance().registerGuiHandler(this, guiHandlerSynth);
        LogHelper.log(Level.INFO, "Preparing world generation");
        GameRegistry.registerWorldGenerator(worldGen);
        LogHelper.log(Level.INFO, "Preparing renders");
        proxy.registerRenderers();
        LogHelper.log(Level.INFO, "Preparing entities");
        EntityRegistry.registerModEntity(EntityBlastBlox.class, "BlastBlox", EntityRegistry.findGlobalUniqueEntityId(), this, 128, 1, true);
        //EntityRegistry.registerModEntity(EntityEternalFlames.class, "EternalFlames", EntityRegistry.findGlobalUniqueEntityId(), this, 128, 1, true);
        if(ConfigBooleans.enableUpdateCheck){
        LogHelper.log(Level.INFO, "Checking for new version");
        NetworkRegistry.instance().registerConnectionHandler(new Update("Kingdom Keys", Reference.MOD_VER, "https://raw.github.com/Wehavecookies56/Kingdom-Keys/master/Version.txt"));
        EntityRegistry.registerModEntity(EntityRedNocturne.class, "Red Nocturne", 1, this, 80, 3, true);
        for (int i = 0; i < BiomeGenBase.biomeList.length; i++)
        {
        	if (BiomeGenBase.biomeList[i] != null)
        	{
        		EntityRegistry.addSpawn(EntityRedNocturne.class, 10, 1, 3, EnumCreatureType.monster, BiomeGenBase.biomeList[i]);
        	}
        }
        LanguageRegistry.instance().addStringLocalization("entity.KingdomKeys.RedNocturne.name", "Red Nocturne");
        final Side side = FMLCommonHandler.instance().getEffectiveSide();
        }
        
        
    }

    //Post Initialisation
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	battlegearInstalled = Loader.isModLoaded("battlegear2");
    	if(battlegearInstalled){
    		LogHelper.log(Level.INFO, "Battlegear 2 support loaded");
    	}
    	if(!battlegearInstalled){
    		LogHelper.log(Level.WARNING, "Battlegear 2 is not installed, this means keyblades cannot be dual wielded");
    	}
    }
}
