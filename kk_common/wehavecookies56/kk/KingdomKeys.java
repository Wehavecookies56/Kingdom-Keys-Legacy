package wehavecookies56.kk;

import java.io.File;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;
import wehavecookies56.kk.block.AddedBlocks;
import wehavecookies56.kk.client.audio.Sounds;
import wehavecookies56.kk.configuration.ConfigurationHandler;
import wehavecookies56.kk.creativetab.KKTAB;
import wehavecookies56.kk.item.AddedItems;
import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.proxies.ClientProxy;
import wehavecookies56.kk.proxies.CommonProxy;

@Mod(name = Reference.MOD_NAME, modid = Reference.MOD_ID, version = Reference.MOD_VER) 

@NetworkMod(clientSideRequired = true, serverSideRequired = false, channels = {Reference.CHANNEL_NAME})


public class KingdomKeys {
    
    @SidedProxy(clientSide="wehavecookies56.kk.proxies.ClientProxy", serverSide="wehavecookies56.kk.proxies.CommonProxy")
    public static CommonProxy proxy;
    
    public static CreativeTabs KKTAB = new KKTAB(CreativeTabs.getNextID(), "KKTAB");
    
    @PreInit
    public void preInit(FMLPreInitializationEvent event) {
        ConfigurationHandler.preConfig(new File(event.getModConfigurationDirectory().getAbsolutePath() + File.separator + Reference.CHANNEL_NAME + File.separator + Reference.MOD_ID + ".cfg"));
        AddedItems.preinit();
        AddedBlocks.preinit();
        ClientProxy.initrenders();
        if(FMLCommonHandler.instance().getSide().isClient())
        {
        MinecraftForge.EVENT_BUS.register(new Sounds());
        }
        LanguageRegistry.instance().addStringLocalization("itemGroup.KKTAB", "en_US", Reference.MOD_NAME);
    }
    
    @Init
    public void init(FMLInitializationEvent event) {
        
    }

    @PostInit
    public void postInit(FMLPostInitializationEvent event) {
        
    }
}
