package wehavecookies56.kk.proxies;

import wehavecookies56.kk.item.AddedItems;
import wehavecookies56.kk.item.ItemRenderKingdomKey;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy {

    public static void initrenders(){
        MinecraftForgeClient.registerItemRenderer(AddedItems.KingdomKey.itemID, (IItemRenderer) new ItemRenderKingdomKey());
    }
    @Override
    public void registerRenderers() {
        
        
        
    }
    
}
