package wehavecookies56.kk.core.proxies;

import net.minecraftforge.client.MinecraftForgeClient;
import wehavecookies56.kk.client.render.ItemRenderEarthShaker;
import wehavecookies56.kk.client.render.ItemRenderKingdomKey;
import wehavecookies56.kk.client.render.ItemRenderKingdomKeyD;
import wehavecookies56.kk.client.render.ItemRenderOathKeeper;
import wehavecookies56.kk.client.render.ItemRenderOblivion;
import wehavecookies56.kk.client.render.ItemRenderRainFell;
import wehavecookies56.kk.client.render.ItemRenderSoulEater;
import wehavecookies56.kk.client.render.ItemRenderStarLight;
import wehavecookies56.kk.client.render.ItemRenderWaywardWind;
import wehavecookies56.kk.client.render.RenderBlastBlox;
import wehavecookies56.kk.entities.EntityBlastBlox;
import wehavecookies56.kk.item.AddedItems;
import com.jadarstudios.developercapes.DevCapesUtil;
import cpw.mods.fml.client.registry.RenderingRegistry;

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
         MinecraftForgeClient.registerItemRenderer(AddedItems.StarLight.itemID, new ItemRenderStarLight());
         MinecraftForgeClient.registerItemRenderer(AddedItems.SoulEater.itemID, new ItemRenderSoulEater());
         
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