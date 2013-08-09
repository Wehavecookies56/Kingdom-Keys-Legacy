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
    public static Item KingdomKeyChain;
    public static Item KingdomKeyDChain;
    public static Item OathkeeperChain;
    public static Item OblivionChain;
    
    public static EnumToolMaterial KingdomKeyMaterial;
    public static EnumToolMaterial KingdomKeyDMaterial;
    public static EnumToolMaterial OathKeeperMaterial;
    public static EnumToolMaterial OblivionMaterial;
    public static EnumArmorMaterial OrganizationArmourMaterial;
    
    public static void initKeyBlades(){

        KingdomKeyMaterial = EnumHelper.addToolMaterial(Strings.KingdomKey, 3, 1313, 6.0F, 5, 30);
        KingdomKey = new ItemKingdomKey(IDs.KingdomKey, KingdomKeyMaterial).setFull3D().setUnlocalizedName(Strings.KingdomKey);
        
        KingdomKeyDMaterial = EnumHelper.addToolMaterial(Strings.KingdomKeyD, 3, 1313, 6.0F, 10, 30);
        KingdomKeyD = new ItemKingdomKeyD(IDs.KingdomKeyD, KingdomKeyDMaterial).setFull3D().setUnlocalizedName(Strings.KingdomKeyD);
        
        OathKeeperMaterial = EnumHelper.addToolMaterial(Strings.OathKeeper, 3, 1313, 6.0F, 13, 30);
        OathKeeper = new ItemOathKeeper(IDs.OathKeeper, OathKeeperMaterial).setFull3D().setUnlocalizedName(Strings.OathKeeper);
        
        OblivionMaterial = EnumHelper.addToolMaterial(Strings.Oblivion, 3, 1313, 6.0F, 15, 30);
        Oblivion = new ItemOblivion(IDs.Oblivion, OblivionMaterial).setFull3D().setUnlocalizedName(Strings.Oblivion);
        
        KingdomKeyChain = new ItemKingdomKeyChain(IDs.KingdomKeyChain);
        
        KingdomKeyDChain = new ItemKingdomKeyDChain(IDs.KingdomKeyDChain);
        
        OathkeeperChain = new ItemOathkeeperChain(IDs.OathkeeperChain);
        
        OblivionChain = new ItemOblivionChain(IDs.OblivionChain);

    }
    
    public static void intiArmour(){
        
        OrganizationArmourMaterial = EnumHelper.addArmorMaterial("ORGANIZATION", 20, new int[] { 4, 8, 6, 3 }, 30);
        OrganizationHood = new OrganizationArmor(IDs.OHelm, OrganizationArmourMaterial , KingdomKeys.proxy.addArmor(OrganizationArmourMaterial.name()), 0, "ORGANIZATION_1", "Organization Hood");
        OrganizationCoat = new OrganizationArmor(IDs.OChest, OrganizationArmourMaterial, KingdomKeys.proxy.addArmor(OrganizationArmourMaterial.name()), 1, "ORGANIZATION_1", "Organization Coat");
        OrganizationLegs = new OrganizationArmor(IDs.OLegs, OrganizationArmourMaterial, KingdomKeys.proxy.addArmor(OrganizationArmourMaterial.name()), 2, "ORGANIZATION_2", "Organization Legs");
        OrganizationBoots = new OrganizationArmor(IDs.OBoots, OrganizationArmourMaterial, KingdomKeys.proxy.addArmor(OrganizationArmourMaterial.name()), 3, "ORGANIZATION_1", "Organization Boots");
    }
    
   
    public static void initHearts(){
        
        PureHeart = new ItemPureHeart(IDs.PureHeart);
        
        DarkHeart = new ItemDarkHeart(IDs.DarkHeart);
        
        Heart = new ItemHeart(IDs.Heart);
        
        KingdomHearts = new ItemKingdomHearts(IDs.KingdomHearts);
        

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
        
        Sanctuary = new ItemKingdomRecords(IDs.Disc2, Strings.Disc2).setUnlocalizedName(Strings.Disc2);
        
        DarkLeather = new ItemDarkLeather(IDs.DarkLeather);
        
        HP = new ItemHP(IDs.HP);
        
        Munny = new ItemMunny(IDs.Munny);
        
        Potion = new ItemPotion(IDs.Potion, 0, 0, true);
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
        GameRegistry.addRecipe(new ItemStack(KingdomKeyChain), new Object[]{
        	"IPI",
            "IPI",
            "IPI",
            'P', PureHeart, 'I', Item.ingotIron
    });
        GameRegistry.addRecipe(new ItemStack(KingdomKeyDChain), new Object[]{
        	"GPG",
            "GPG",
            "GPG",
            'P', PureHeart, 'G', Item.ingotGold
    });
        GameRegistry.addRecipe(new ItemStack(OathkeeperChain), new Object[]{
        	"GPG",
            "GKG",
            "GPG",
            'P', PureHeart, 'G', Item.ingotIron, 'K', KingdomHearts
    });
        GameRegistry.addRecipe(new ItemStack(OblivionChain), new Object[]{
        	"OPO",
            "OKO",
            "OPO",
            'P', PureHeart, 'O', Block.obsidian, 'K', KingdomHearts
    });
        
        GameRegistry.addShapelessRecipe(new ItemStack(KingdomKey), new ItemStack(KingdomKeyChain, 1), new ItemStack(Item.swordWood, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(KingdomKeyD), new ItemStack(KingdomKeyDChain, 1), new ItemStack(Item.swordGold, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(OathKeeper), new ItemStack(OathkeeperChain, 1), new ItemStack(Item.swordIron, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(Oblivion), new ItemStack(OblivionChain, 1), new ItemStack(Item.swordIron, 1));
        
    }
    
}
