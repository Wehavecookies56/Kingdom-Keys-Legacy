package wehavecookies56.kk.core.proxies;

import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.client.MinecraftForgeClient;

import org.lwjgl.input.Keyboard;

import wehavecookies56.kk.client.KeyBind;
import wehavecookies56.kk.client.TickerClient;
import wehavecookies56.kk.client.audio.SoundManager;
import wehavecookies56.kk.client.model.ModelRedNocturne;
import wehavecookies56.kk.client.render.BlockRenderBlastBlox;
import wehavecookies56.kk.client.render.EntityRenderEternalFlames;
import wehavecookies56.kk.client.render.EntityRenderRedNocturne;
import wehavecookies56.kk.client.render.ItemRenderBookOfRetribution;
import wehavecookies56.kk.client.render.ItemRenderEarthShaker;
import wehavecookies56.kk.client.render.ItemRenderEternalFlames;
import wehavecookies56.kk.client.render.ItemRenderFenrir;
import wehavecookies56.kk.client.render.ItemRenderInterdiction;
import wehavecookies56.kk.client.render.ItemRenderKingdomKey;
import wehavecookies56.kk.client.render.ItemRenderKingdomKeyD;
import wehavecookies56.kk.client.render.ItemRenderLunarEclipse;
import wehavecookies56.kk.client.render.ItemRenderOathKeeper;
import wehavecookies56.kk.client.render.ItemRenderOblivion;
import wehavecookies56.kk.client.render.ItemRenderRainFell;
import wehavecookies56.kk.client.render.ItemRenderSoulEater;
import wehavecookies56.kk.client.render.ItemRenderStarLight;
import wehavecookies56.kk.client.render.ItemRenderTotalEclipse;
import wehavecookies56.kk.client.render.ItemRenderUltimaWeapon;
import wehavecookies56.kk.client.render.ItemRenderWaywardWind;
import wehavecookies56.kk.client.render.ItemRenderZeroOne;
import wehavecookies56.kk.client.render.RenderSharpshooterShot;
import wehavecookies56.kk.client.render.RenderSharpshooterShot2;
import wehavecookies56.kk.entities.EntityBlastBlox;
import wehavecookies56.kk.entities.EntityEternalFlames;
import wehavecookies56.kk.entities.EntitySharpshooterShot;
import wehavecookies56.kk.entities.mob.EntityRedNocturne;
import wehavecookies56.kk.item.AddedItems;
import cpw.mods.fml.client.registry.KeyBindingRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
//import com.jadarstudios.developercapes.DevCapesUtil;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;


public class ClientProxy extends CommonProxy {
	
	@Override
    public void registerRenderers() {
		//3D Model renders
    	 MinecraftForgeClient.registerItemRenderer(AddedItems.K111.itemID, new ItemRenderKingdomKey());
         MinecraftForgeClient.registerItemRenderer(AddedItems.K112.itemID, new ItemRenderOathKeeper());
         MinecraftForgeClient.registerItemRenderer(AddedItems.K113.itemID, new ItemRenderKingdomKeyD());
         MinecraftForgeClient.registerItemRenderer(AddedItems.K114.itemID, new ItemRenderOblivion());
         MinecraftForgeClient.registerItemRenderer(AddedItems.K110.itemID, new ItemRenderWaywardWind());
         MinecraftForgeClient.registerItemRenderer(AddedItems.K109.itemID, new ItemRenderEarthShaker());
         MinecraftForgeClient.registerItemRenderer(AddedItems.K108.itemID, new ItemRenderRainFell());
         MinecraftForgeClient.registerItemRenderer(AddedItems.K107.itemID, new ItemRenderStarLight());
         MinecraftForgeClient.registerItemRenderer(AddedItems.K106.itemID, new ItemRenderSoulEater());
         MinecraftForgeClient.registerItemRenderer(AddedItems.K50.itemID, new ItemRenderLunarEclipse());
         MinecraftForgeClient.registerItemRenderer(AddedItems.K52.itemID, new ItemRenderTotalEclipse());
         MinecraftForgeClient.registerItemRenderer(AddedItems.K69.itemID, new ItemRenderFenrir());
         MinecraftForgeClient.registerItemRenderer(AddedItems.K41.itemID, new ItemRenderZeroOne());
         MinecraftForgeClient.registerItemRenderer(AddedItems.BookOfRetribution.itemID, new ItemRenderBookOfRetribution());
         MinecraftForgeClient.registerItemRenderer(AddedItems.Interdiction.itemID, new ItemRenderInterdiction());
         MinecraftForgeClient.registerItemRenderer(AddedItems.K103.itemID, new ItemRenderUltimaWeapon());
         MinecraftForgeClient.registerItemRenderer(AddedItems.EternalFlames.itemID, new ItemRenderEternalFlames());
         
         TickRegistry.registerTickHandler(new TickerClient(), Side.CLIENT);
         
         //Entities
         RenderingRegistry.registerEntityRenderingHandler(EntityEternalFlames.class, new EntityRenderEternalFlames());
         
         RenderingRegistry.registerEntityRenderingHandler(EntityBlastBlox.class, new BlockRenderBlastBlox());
         RenderingRegistry.registerEntityRenderingHandler(EntitySharpshooterShot.class, new RenderSharpshooterShot2(AddedItems.EternalFlames));
         RenderingRegistry.registerEntityRenderingHandler(EntityRedNocturne.class, new EntityRenderRedNocturne(new ModelRedNocturne(), 0.5F));
        // EntityRegistry.registerGlobalEntityID(EntityRedNocturne.class, "Red Nocturne", EntityRegistry.findGlobalUniqueEntityId(), 3515848, 12102);
         
         new SoundManager();
         
         //Capes
         //DevCapesUtil.addFileUrl("https://raw.github.com/Wehavecookies56/Kingdom-Keys/master/Capes.txt");
    
         KeyBinding[] key = {new KeyBinding("Summon Keyblade", Keyboard.KEY_G)};
         boolean[] repeat = {false};
         KeyBindingRegistry.registerKeyBinding(new KeyBind(key, repeat));



	}
    
    @Override
    public int addArmor(String armor) {
      return RenderingRegistry.addNewArmourRendererPrefix(armor);
      }
}