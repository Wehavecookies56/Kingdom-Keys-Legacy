package wehavecookies56.kk;

import java.io.File;

import com.jadarstudios.developercapes.DevCapesUtil;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;

import cpw.mods.fml.common.FMLCommonHandler;
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
import wehavecookies56.kk.block.AddedBlocks;
import wehavecookies56.kk.block.BlockSynthesis;
import wehavecookies56.kk.client.render.ItemRenderEarthShaker;
import wehavecookies56.kk.client.sound.SoundManager;
import wehavecookies56.kk.core.handlers.ConfigurationHandler;
import wehavecookies56.kk.core.handlers.GuiHandler;
import wehavecookies56.kk.core.handlers.LocalizationHandler;
import wehavecookies56.kk.core.proxies.ClientProxy;
import wehavecookies56.kk.core.proxies.CommonProxy;
import wehavecookies56.kk.creativetab.KKTAB;
import wehavecookies56.kk.entities.EntityBlastBlox;
import wehavecookies56.kk.item.AddedItems;
import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.mob.BatDrops;
import wehavecookies56.kk.mob.BlazeDrops;
import wehavecookies56.kk.mob.CaveSpiderDrops;
import wehavecookies56.kk.mob.ChickenDrops;
import wehavecookies56.kk.mob.CowDrops;
import wehavecookies56.kk.mob.CreeperDrops;
import wehavecookies56.kk.mob.EndermanDrops;
import wehavecookies56.kk.mob.GhastDrops;
import wehavecookies56.kk.mob.IronGolemDrops;
import wehavecookies56.kk.mob.MagmaCubeDrops;
import wehavecookies56.kk.mob.MooshroomDrops;
import wehavecookies56.kk.mob.OcelotDrops;
import wehavecookies56.kk.mob.PigDrops;
import wehavecookies56.kk.mob.PigZombieDrops;
import wehavecookies56.kk.mob.SheepDrops;
import wehavecookies56.kk.mob.SilverfishDrops;
import wehavecookies56.kk.mob.SkeletonDrops;
import wehavecookies56.kk.mob.SlimeDrops;
import wehavecookies56.kk.mob.SnowmanDrops;
import wehavecookies56.kk.mob.SpiderDrops;
import wehavecookies56.kk.mob.SquidDrops;
import wehavecookies56.kk.mob.VillagerDrops;
import wehavecookies56.kk.mob.WitchDrops;
import wehavecookies56.kk.mob.WolfDrops;
import wehavecookies56.kk.mob.ZombieDrops;
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
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	
    	
        ConfigurationHandler.preConfig(new File(event.getModConfigurationDirectory().getAbsolutePath() + File.separator + Reference.CHANNEL_NAME + File.separator + Reference.MOD_ID + ".cfg"));
        AddedItems.initHearts();
        AddedItems.initKeyBlades();
        AddedItems.initOthers();
        AddedItems.intiArmour();
        AddedBlocks.preinit();
        AddedItems.initLoot();
        LocalizationHandler.loadLanguages();
        MinecraftForge.EVENT_BUS.register(new SoundManager());
        AddedItems.initItemrecipes();
        AddedBlocks.initBlockRecipes();
        LanguageRegistry.instance().addStringLocalization("itemGroup.Kingdom Keys", "en_US", "Kingdom Keys");
        MinecraftForge.EVENT_BUS.register(new BatDrops());
        MinecraftForge.EVENT_BUS.register(new CowDrops());        
        MinecraftForge.EVENT_BUS.register(new ChickenDrops());
        MinecraftForge.EVENT_BUS.register(new BlazeDrops());
        MinecraftForge.EVENT_BUS.register(new SheepDrops());
        MinecraftForge.EVENT_BUS.register(new SilverfishDrops());
        MinecraftForge.EVENT_BUS.register(new EndermanDrops());
        MinecraftForge.EVENT_BUS.register(new SpiderDrops());
        MinecraftForge.EVENT_BUS.register(new VillagerDrops());
        MinecraftForge.EVENT_BUS.register(new WitchDrops());
        MinecraftForge.EVENT_BUS.register(new GhastDrops());
        MinecraftForge.EVENT_BUS.register(new PigZombieDrops());
        MinecraftForge.EVENT_BUS.register(new MagmaCubeDrops());
        MinecraftForge.EVENT_BUS.register(new SkeletonDrops());
        MinecraftForge.EVENT_BUS.register(new WolfDrops());
        MinecraftForge.EVENT_BUS.register(new SquidDrops());
        MinecraftForge.EVENT_BUS.register(new OcelotDrops());
        MinecraftForge.EVENT_BUS.register(new CreeperDrops());
        MinecraftForge.EVENT_BUS.register(new SlimeDrops());
        MinecraftForge.EVENT_BUS.register(new ZombieDrops());
        MinecraftForge.EVENT_BUS.register(new SnowmanDrops());
        MinecraftForge.EVENT_BUS.register(new IronGolemDrops());
        MinecraftForge.EVENT_BUS.register(new MooshroomDrops());
        MinecraftForge.EVENT_BUS.register(new CaveSpiderDrops());
        MinecraftForge.EVENT_BUS.register(new PigDrops());
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
        GameRegistry.registerWorldGenerator(worldGen);
        proxy.registerRenderers();
        EntityRegistry.registerModEntity(EntityBlastBlox.class, "BlastBlox", EntityRegistry.findGlobalUniqueEntityId(), this, 128, 1, true);
        new GuiHandler();
        BlockSynthesis.registerTileEntities();
        NetworkRegistry.instance().registerConnectionHandler(new Update("Kingdom Keys", Reference.MOD_VER, "https://raw.github.com/Wehavecookies56/Kingdom-Keys/master/Version.txt"));
    	DevCapesUtil.getInstance().addFileUrl("https://raw.github.com/Wehavecookies56/Kingdom-Keys/master/Capes.txt");
        
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        ThaumcraftAddon.modsLoaded();
    }
}
