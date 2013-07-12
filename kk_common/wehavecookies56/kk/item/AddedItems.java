package wehavecookies56.kk.item;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.lib.IDs;
import wehavecookies56.kk.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.EnumHelper;

public class AddedItems {

    public static Item KingdomKey;
    public static Item OathKeeper;
    public static Item Oblivion;
    public static Item KingdomKeyD;
    public static Item SimpleAndClean;
    public static Item Sanctuary;
    public static Item PureHeart;
    public static Item DarkHeart;
    public static Item Heart;
    public static Item KingdomHearts;
    public static Item OrganizationHood;
    public static Item OrganizationCoat;
    public static Item OrganizationLegs;
    public static Item OrganizationBoots;
    public static Item DarkLeather;
    public static Item HP;
    public static Item Munny;
    public static Item Potion;
    
    public static EnumToolMaterial KingdomKeyMaterial;
    public static EnumToolMaterial KingdomKeyDMaterial;
    public static EnumToolMaterial OathKeeperMaterial;
    public static EnumArmorMaterial OrganizationArmourMaterial;
    
    public static void initKeyBlades(){

        KingdomKeyMaterial = EnumHelper.addToolMaterial(Strings.KingdomKey, 3, 1313, 6.0F, 10, 30);
        KingdomKey = new ItemKingdomKey(IDs.KingdomKey, KingdomKeyMaterial).setFull3D().setUnlocalizedName(Strings.KingdomKey);
        LanguageRegistry.addName(KingdomKey, Strings.KingdomKey);
        
        KingdomKeyDMaterial = EnumHelper.addToolMaterial(Strings.KingdomKeyD, 3, 1313, 6.0F, 10, 30);
        KingdomKeyD = new ItemKingdomKeyD(IDs.KingdomKeyD, KingdomKeyDMaterial).setFull3D().setUnlocalizedName(Strings.KingdomKeyD);
        LanguageRegistry.addName(KingdomKeyD, Strings.KingdomKeyD);
        
        OathKeeperMaterial = EnumHelper.addToolMaterial(Strings.OathKeeper, 3, 1313, 6.0F, 16, 30);
        OathKeeper = new ItemOathKeeper(IDs.OathKeeper, OathKeeperMaterial).setFull3D().setUnlocalizedName(Strings.OathKeeper);
        LanguageRegistry.addName(OathKeeper, Strings.OathKeeper);

    }
    
    public static void intiArmour(){
        
        OrganizationArmourMaterial = EnumHelper.addArmorMaterial("ORGANIZATION", 20, new int[] { 4, 8, 6, 3 }, 30);
        OrganizationHood = new OrganizationArmor(IDs.OHelm, OrganizationArmourMaterial , KingdomKeys.proxy.addArmor(OrganizationArmourMaterial.name()), 0, "ORGANIZATION_1", "Organization Hood");
        OrganizationCoat = new OrganizationArmor(IDs.OChest, OrganizationArmourMaterial, KingdomKeys.proxy.addArmor(OrganizationArmourMaterial.name()), 1, "ORGANIZATION_1", "Organization Coat");
        OrganizationLegs = new OrganizationArmor(IDs.OLegs, OrganizationArmourMaterial, KingdomKeys.proxy.addArmor(OrganizationArmourMaterial.name()), 2, "ORGANIZATION_2", "Organization Legs");
        OrganizationBoots = new OrganizationArmor(IDs.OBoots, OrganizationArmourMaterial, KingdomKeys.proxy.addArmor(OrganizationArmourMaterial.name()), 3, "ORGANIZATION_1", "Organization Boots");
        LanguageRegistry.addName(OrganizationHood, Strings.OHood);
        LanguageRegistry.addName(OrganizationCoat, Strings.OCoat);
        LanguageRegistry.addName(OrganizationLegs, Strings.OLegs);
        LanguageRegistry.addName(OrganizationBoots, Strings.OBoots);
    }
    
   
    public static void initHearts(){
        
        PureHeart = new ItemPureHeart(IDs.PureHeart);
        LanguageRegistry.addName(PureHeart, Strings.PHeart);
        
        DarkHeart = new ItemDarkHeart(IDs.DarkHeart);
        LanguageRegistry.addName(DarkHeart, Strings.DHeart);
        
        Heart = new ItemHeart(IDs.Heart);
        LanguageRegistry.addName(Heart, Strings.Heart);
        
        KingdomHearts = new ItemKingdomHearts(IDs.KingdomHearts);
        LanguageRegistry.addName(KingdomHearts, Strings.KHearts);
        

    }
    
    public static void initLoot(){
        
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(KingdomKey),0,1,5));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(KingdomKey),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(KingdomKey),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(KingdomKey),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(KingdomKey),0,1,5));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(KingdomKey),0,1,5));
        
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(KingdomKeyD),0,1,5));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(KingdomKeyD),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(KingdomKeyD),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(KingdomKeyD),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(KingdomKeyD),0,1,5));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(KingdomKeyD),0,1,5));
        
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(OathKeeper),0,1,5));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(OathKeeper),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(OathKeeper),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(OathKeeper),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(OathKeeper),0,1,5));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(OathKeeper),0,1,5));
    }
    
    public static void initOthers(){
        
        
        SimpleAndClean = new ItemKingdomRecords(IDs.Disc1, Strings.Disc1).setUnlocalizedName(Strings.Disc1);
        LanguageRegistry.addName(SimpleAndClean, Strings.MusicDisc);
        
        Sanctuary = new ItemKingdomRecords(IDs.Disc2, Strings.Disc2).setUnlocalizedName(Strings.Disc2);
        LanguageRegistry.addName(Sanctuary, Strings.MusicDisc);
        
        DarkLeather = new ItemDarkLeather(IDs.DarkLeather);
        LanguageRegistry.addName(DarkLeather, Strings.DLeather);
        
        HP = new ItemHP(IDs.HP);
        LanguageRegistry.addName(HP, Strings.HP);
        
        Munny = new ItemMunny(IDs.Munny);
        LanguageRegistry.addName(Munny, Strings.Munny);
        
        Potion = new ItemPotion(IDs.Potion, 0, 0, true);
        LanguageRegistry.addName(Potion, Strings.Potion);
    }
    
    public static void initItemrecipes(){
        
        GameRegistry.addRecipe(new ItemStack(Heart), new Object[]{
            "DDD",
            "DSD",
            "DDD",
            'S', Block.slowSand, 'D', DarkHeart
    });
        GameRegistry.addRecipe(new ItemStack(PureHeart), new Object[]{
            "DDD",
            "DSD",
            "DDD",
            'S', Block.slowSand, 'D', Heart
    });
        GameRegistry.addRecipe(new ItemStack(KingdomHearts), new Object[]{
            "DDD",
            "DSD",
            "DDD",
            'S', Block.slowSand, 'D', PureHeart
    });
        GameRegistry.addRecipe(new ItemStack(KingdomKey), new Object[]{
            "III",
            "IKI",
            "GSG",
            'I', Item.ingotIron, 'K', KingdomHearts, 'G', Item.ingotGold, 'S', Item.swordDiamond
    });
        
        GameRegistry.addRecipe(new ItemStack(KingdomKeyD), new Object[]{
            "GGG",
            "GKG",
            "ISI",
            'I', Item.ingotIron, 'K', KingdomHearts, 'G', Item.ingotGold, 'S', Item.swordDiamond
    });
        GameRegistry.addRecipe(new ItemStack(OathKeeper), new Object[]{
            "IRI",
            "IKI",
            "ISI",
            'I', Item.ingotIron, 'K', KingdomHearts, 'R', Item.netherStar, 'S', Item.swordDiamond
    });
        GameRegistry.addRecipe(new ItemStack(DarkLeather), new Object[]{
            "DDD",
            "DLD",
            "DDD",
            'D', DarkHeart, 'L', Item.leather
    });
        GameRegistry.addRecipe(new ItemStack(OrganizationHood), new Object[]{
            "LLL",
            "LOL",
            "SIS",
            'O', Block.obsidian, 'L', DarkLeather, 'S', Item.silk, 'I', new ItemStack(Item.dyePowder, 0)
    });
        GameRegistry.addRecipe(new ItemStack(OrganizationCoat), new Object[]{
            "LIL",
            "LOL",
            "LLL",
            'O', Block.obsidian, 'L', DarkLeather, 'I', new ItemStack(Item.dyePowder, 0)
    });
        GameRegistry.addRecipe(new ItemStack(OrganizationLegs), new Object[]{
            "LLL",
            "LOL",
            "LIL",
            'O', Block.obsidian, 'L', DarkLeather, 'I', new ItemStack(Item.dyePowder, 0)
    });
        GameRegistry.addRecipe(new ItemStack(OrganizationBoots), new Object[]{
            "LOL",
            "LIL",
            'O', Block.obsidian, 'L', DarkLeather, 'I', new ItemStack(Item.dyePowder, 0)
    });
        GameRegistry.addRecipe(new ItemStack(Potion), new Object[]{
        	"HHH",
            "HHH",
            "HPH",
            'P', Item.glassBottle, 'H', HP
    });
        
    }
    
}
