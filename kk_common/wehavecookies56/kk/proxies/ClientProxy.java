package wehavecookies56.kk.proxies;

import cpw.mods.fml.client.registry.RenderingRegistry;
import wehavecookies56.kk.item.AddedItems;
import wehavecookies56.kk.item.ItemRenderKingdomKey;
import wehavecookies56.kk.item.ItemRenderKingdomKeyD;
import wehavecookies56.kk.item.ItemRenderOathKeeper;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy {

    public static void initrenders(){
        MinecraftForgeClient.registerItemRenderer(AddedItems.KingdomKey.itemID, (IItemRenderer) new ItemRenderKingdomKey());
        MinecraftForgeClient.registerItemRenderer(AddedItems.OathKeeper.itemID, (IItemRenderer) new ItemRenderOathKeeper());
        MinecraftForgeClient.registerItemRenderer(AddedItems.KingdomKeyD.itemID, (IItemRenderer) new ItemRenderKingdomKeyD());
    }
    @Override
    public void registerRenderers() {
        
    }
    
    @Override
    public int addArmor(String armor) {
      return RenderingRegistry.addNewArmourRendererPrefix(armor);
}
}
