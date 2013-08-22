package wehavecookies56.kk.core.proxies;

import com.jadarstudios.developercapes.DevCapesUtil;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import wehavecookies56.kk.client.render.ItemRenderEarthShaker;
import wehavecookies56.kk.client.render.ItemRenderKingdomKey;
import wehavecookies56.kk.client.render.ItemRenderKingdomKeyD;
import wehavecookies56.kk.client.render.ItemRenderOathKeeper;
import wehavecookies56.kk.client.render.ItemRenderOblivion;
import wehavecookies56.kk.client.render.ItemRenderRainFell;
import wehavecookies56.kk.client.render.ItemRenderWaywardWind;
import wehavecookies56.kk.client.render.RenderBlastBlox;
import wehavecookies56.kk.entities.EntityBlastBlox;
import wehavecookies56.kk.item.AddedItems;
//import wehavecookies56.kk.item.ItemRenderKingdomKey;
//import wehavecookies56.kk.item.ItemRenderKingdomKeyD;
//import wehavecookies56.kk.item.ItemRenderOathKeeper;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy {
	
	@Override
    public void registerRenderers() {
		//3D Model renders
    	 MinecraftForgeClient.registerItemRenderer(AddedItems.KingdomKey.itemID, new ItemRenderKingdomKey());
         MinecraftForgeClient.registerItemRenderer(AddedItems.OathKeeper.itemID, new ItemRenderOathKeeper());
         MinecraftForgeClient.registerItemRenderer(AddedItems.KingdomKeyD.itemID, new ItemRenderKingdomKeyD());
         MinecraftForgeClient.registerItemRenderer(AddedItems.Oblivion.itemID, new ItemRenderOblivion());
         MinecraftForgeClient.registerItemRenderer(AddedItems.WaywardWind.itemID, new ItemRenderWaywardWind());
         MinecraftForgeClient.registerItemRenderer(AddedItems.EarthShaker.itemID, new ItemRenderEarthShaker());
         MinecraftForgeClient.registerItemRenderer(AddedItems.RainFell.itemID, new ItemRenderRainFell());
         
         
         //Entities
         RenderingRegistry.registerEntityRenderingHandler(EntityBlastBlox.class, new RenderBlastBlox());
         
         //Capes
         DevCapesUtil.getInstance().addFileUrl("https://raw.github.com/Wehavecookies56/Kingdom-Keys/master/Capes.txt");
    }
    
    @Override
    public int addArmor(String armor) {
      return RenderingRegistry.addNewArmourRendererPrefix(armor);
      }
}