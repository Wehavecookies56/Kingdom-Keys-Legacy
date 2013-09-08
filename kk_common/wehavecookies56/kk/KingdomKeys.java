package wehavecookies56.kk;

import java.io.File;
import java.util.logging.Level;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.settings.KeyBinding;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;

import cpw.mods.fml.client.registry.KeyBindingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
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
import wehavecookies56.kk.block.AddedBlocks;
import wehavecookies56.kk.block.BlockSynthesis;
import wehavecookies56.kk.client.KeyBind;
import wehavecookies56.kk.client.audio.SoundManager;
import wehavecookies56.kk.client.render.ItemRenderEarthShaker;
import wehavecookies56.kk.core.handlers.ConfigurationHandler;
import wehavecookies56.kk.core.handlers.GuiHandler;
import wehavecookies56.kk.core.handlers.LocalizationHandler;
import wehavecookies56.kk.core.helper.LogHelper;
import wehavecookies56.kk.core.proxies.ClientProxy;
import wehavecookies56.kk.core.proxies.CommonProxy;
import wehavecookies56.kk.creativetab.KKTAB;
import wehavecookies56.kk.enchantments.EnchantHeartHarvest;
import wehavecookies56.kk.entities.EntityBlastBlox;
import wehavecookies56.kk.item.AddedItems;
import wehavecookies56.kk.lib.ConfigBooleans;
import wehavecookies56.kk.lib.IDs;
import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.mob.DarkHeartDrops;
import wehavecookies56.kk.mob.HeartDrops;
import wehavecookies56.kk.mob.KingdomHeartsDrops;
import wehavecookies56.kk.mob.PureHeartDrops;
import wehavecookies56.kk.thaumcraft.ThaumcraftAddon;
import wehavecookies56.kk.updater.Update;
import wehavecookies56.kk.world.gen.WorldGenBlox;

@Mod(name = Reference.MOD_NAME, modid = Reference.MOD_ID, version = Reference.MOD_VER) 

@NetworkMod(clientSideRequired=true, serverSideRequired=false, channels = Reference.CHANNEL_NAME)



public class KingdomKeys {

	WorldGenBlox worldGen = new WorldGenBlox();
	
    @Instance(Reference.MOD_ID)
    public static KingdomKeys instance;
    
    @SidedProxy(clientSide="wehavecookies56.kk.core.proxies.ClientProxy", serverSide="wehavecookies56.kk.core.proxies.CommonProxy")
    public static CommonProxy proxy;
    public static ClientProxy cproxy;
    
    public static CreativeTabs KKTAB = new KKTAB(CreativeTabs.getNextID(), "KKTAB");
    public static final Enchantment HarvestHearts = new EnchantHeartHarvest(52, 1);
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	LogHelper.init();
        LogHelper.log(Level.INFO, "Preparing configuration file");
        ConfigurationHandler.preConfig(new File(event.getModConfigurationDirectory().getAbsolutePath() + File.separator + Reference.CHANNEL_NAME + File.separator + Reference.MOD_ID + ".cfg"));
        LogHelper.log(Level.INFO, "Preparing keyblades");
        AddedItems.initKeyBlades();
        LogHelper.log(Level.INFO, "Preparing items");
        AddedItems.initHearts();
        AddedItems.initOthers();
        AddedItems.intiArmour();
        LogHelper.log(Level.INFO, "Preparing dungeon loot");
        AddedItems.initLoot();
        LogHelper.log(Level.INFO, "Preparing blocks");
        AddedBlocks.preinit();
        LogHelper.log(Level.INFO, "Preparing language files");
        LocalizationHandler.loadLanguages();
        LogHelper.log(Level.INFO, "Preparing sounds");
        MinecraftForge.EVENT_BUS.register(new SoundManager());
        LogHelper.log(Level.INFO, "Preparing recipes");
        AddedItems.initItemrecipes();
        AddedBlocks.initBlockRecipes();
        LanguageRegistry.instance().addStringLocalization("itemGroup.KKTAB", "en_US", "Kingdom Keys");
        LogHelper.log(Level.INFO, "Preparing mob drop events");   
        MinecraftForge.EVENT_BUS.register(new HeartDrops());
        MinecraftForge.EVENT_BUS.register(new PureHeartDrops());
        MinecraftForge.EVENT_BUS.register(new DarkHeartDrops());
        MinecraftForge.EVENT_BUS.register(new KingdomHeartsDrops());

    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
        LogHelper.log(Level.INFO, "Preparing world generation");
        GameRegistry.registerWorldGenerator(worldGen);
        LogHelper.log(Level.INFO, "Preparing renders");
        proxy.registerRenderers();
        LogHelper.log(Level.INFO, "Preparing entities");
        EntityRegistry.registerModEntity(EntityBlastBlox.class, "BlastBlox", EntityRegistry.findGlobalUniqueEntityId(), this, 128, 1, true);
        new GuiHandler();
        BlockSynthesis.registerTileEntities();
        if(ConfigBooleans.enableUpdateCheck){
        LogHelper.log(Level.INFO, "Checking for new version");
        NetworkRegistry.instance().registerConnectionHandler(new Update("Kingdom Keys", Reference.MOD_VER, "https://raw.github.com/Wehavecookies56/Kingdom-Keys/master/Version.txt"));
        }
        
        
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        LogHelper.log(Level.INFO, "Loading thaumcraft 3 addon");
        ThaumcraftAddon.modsLoaded();
    }
}
