package wehavecookies56.kk.thaumcraft;

import java.util.logging.Level;

import thaumcraft.api.EnumTag;
import thaumcraft.api.ObjectTags;
import thaumcraft.api.ThaumcraftApi;
import wehavecookies56.kk.item.AddedItems;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;

public class ThaumcraftAddon {
    public static void modsLoaded() {
        if (Loader.isModLoaded("thaumcraft")) {
               try {
                   ObjectTags tags = new ObjectTags().add(EnumTag.LIFE, 1).add(EnumTag.LIFE, 1).add(EnumTag.DEATH, 4).add(EnumTag.EVIL, 1).add(EnumTag.DARK, 3);
                   ThaumcraftApi.registerObjectTag(AddedItems.DarkHeart.itemID, -1, tags);

                   tags = new ObjectTags().add(EnumTag.LIFE, 2).add(EnumTag.DEATH, 3).add(EnumTag.LIGHT, 1).add(EnumTag.PURE, 1);
                   ThaumcraftApi.registerObjectTag(AddedItems.Heart.itemID, -1, tags);
                   
                   tags = new ObjectTags().add(EnumTag.LIFE, 3).add(EnumTag.DEATH, 2).add(EnumTag.LIGHT, 2).add(EnumTag.PURE, 2);
                   ThaumcraftApi.registerObjectTag(AddedItems.PureHeart.itemID, -1, tags);
                   
                   tags = new ObjectTags().add(EnumTag.LIFE, 4).add(EnumTag.DEATH, 1).add(EnumTag.LIGHT, 3).add(EnumTag.PURE, 3);
                   ThaumcraftApi.registerObjectTag(AddedItems.KingdomHearts.itemID, -1, tags);
               

                   FMLLog.log(Level.INFO, "Loaded TC3 addon");
               }
               catch (Exception e) {
                   FMLLog.log(Level.SEVERE, "Could not load TC3 addon");
                   e.printStackTrace(System.err);
               }
               

           }
        else {
     	   FMLLog.log(Level.SEVERE, "Could not load TC3 addon, most likely because TC3 is not installed");
        }
    }
}

