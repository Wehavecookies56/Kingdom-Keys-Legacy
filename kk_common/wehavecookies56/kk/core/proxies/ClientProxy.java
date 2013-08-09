package wehavecookies56.kk.core.proxies;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import wehavecookies56.kk.item.AddedItems;
import wehavecookies56.kk.item.ItemRenderKingdomKey;
import wehavecookies56.kk.item.ItemRenderKingdomKeyD;
import wehavecookies56.kk.item.ItemRenderOathKeeper;
import wehavecookies56.kk.item.ItemRenderOblivion;
//import wehavecookies56.kk.item.ItemRenderKingdomKey;
//import wehavecookies56.kk.item.ItemRenderKingdomKeyD;
//import wehavecookies56.kk.item.ItemRenderOathKeeper;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;


public class ClientProxy extends CommonProxy {
	
	@Override
    public void registerRenderers() {
    	 MinecraftForgeClient.registerItemRenderer(AddedItems.KingdomKey.itemID, new ItemRenderKingdomKey());
         MinecraftForgeClient.registerItemRenderer(AddedItems.OathKeeper.itemID, new ItemRenderOathKeeper());
         MinecraftForgeClient.registerItemRenderer(AddedItems.KingdomKeyD.itemID, new ItemRenderKingdomKeyD());
         MinecraftForgeClient.registerItemRenderer(AddedItems.Oblivion.itemID, new ItemRenderOblivion());
         //MinecraftForgeClient.registerItemRenderer(AddedItems.KingdomKey.itemID, (IItemRenderer) new ItemRenderKingdomKeyV2());
    }
    
    @Override
    public int addArmor(String armor) {
      return RenderingRegistry.addNewArmourRendererPrefix(armor);
}
}
