package wehavecookies56.kk.item;

import cpw.mods.fml.common.registry.LanguageRegistry;
import wehavecookies56.kk.lib.IDs;
import wehavecookies56.kk.lib.Strings;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemRecord;
import net.minecraftforge.common.EnumHelper;

public class AddedItems {

    public static Item KingdomKey;
    public static Item OathKeeper;
    public static Item Oblivion;
    public static Item SimpleAndClean;
    public static Item Sanctuary;
    
    public static EnumToolMaterial KeyBladeMaterial;
    
    public static void preinit(){
        
        KeyBladeMaterial = EnumHelper.addToolMaterial(Strings.KingdomKey, 3, -1, 6.0F, 10, 30);
        KingdomKey = new ItemKingdomKey(IDs.KingdomKey, KeyBladeMaterial).setFull3D().setUnlocalizedName(Strings.KingdomKey);
        LanguageRegistry.addName(KingdomKey, Strings.KingdomKey);
        
        SimpleAndClean = new ItemKingdomRecords(IDs.Disc1, Strings.Disc1).setUnlocalizedName(Strings.Disc1);
        LanguageRegistry.addName(SimpleAndClean, Strings.MusicDisc);
        
        Sanctuary = new ItemKingdomRecords(IDs.Disc2, Strings.Disc2).setUnlocalizedName(Strings.Disc2);
        LanguageRegistry.addName(Sanctuary, Strings.MusicDisc);
        
    }
    
}
