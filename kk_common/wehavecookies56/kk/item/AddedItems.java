package wehavecookies56.kk.item;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.lib.IDs;
import wehavecookies56.kk.lib.Reference;
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

    public static Item KingdomKey, OathKeeper, Oblivion, KingdomKeyD, Disc1, Disc2, PureHeart, DarkHeart, Heart, KingdomHearts, OrganizationHood, OrganizationCoat, OrganizationLegs, OrganizationBoots, DarkLeather, HP, Munny, Potion, KingdomKeyChain, KingdomKeyDChain, OathkeeperChain, OblivionChain, WaywardWind, Disc3, Disc4, Disc5, Disc6, Disc7, Disc8, Disc9, WaywardWindChain, KeybladeAHelm, KeybladeAChest, KeybladeALegs, KeybladeABoots, KeybladeTHelm, KeybladeTChest, KeybladeTLegs, KeybladeTBoots, KeybladeVHelm, KeybladeVChest, KeybladeVLegs, KeybladeVBoots, EarthShaker, EarthShakerChain, RainFell, RainFellChain;
    public static EnumToolMaterial KingdomKeyMaterial, KingdomKeyDMaterial, OathKeeperMaterial, OblivionMaterial, WaywardWindMaterial, EarthShakerMaterial, RainFellMaterial;
    public static EnumArmorMaterial OrganizationArmourMaterial, KeybladeAArmourMaterial, KeybladeTArmourMaterial, KeybladeVArmourMaterial;
    
    public static void initKeyBlades(){
    	KingdomKeyMaterial = EnumHelper.addToolMaterial(Strings.KingdomKey, 3, -1, 6.0F, 5, 25); KingdomKey = new ItemKingdomKey(IDs.KingdomKey, KingdomKeyMaterial).setFull3D().setUnlocalizedName(Strings.KingdomKey); 
    	KingdomKeyDMaterial = EnumHelper.addToolMaterial(Strings.KingdomKeyD, 3, -1, 6.0F, 8, 30); KingdomKeyD = new ItemKingdomKeyD(IDs.KingdomKeyD, KingdomKeyDMaterial).setFull3D().setUnlocalizedName(Strings.KingdomKeyD); 
        OathKeeperMaterial = EnumHelper.addToolMaterial(Strings.OathKeeper, 3, -1, 6.0F, 10, 30); OathKeeper = new ItemOathKeeper(IDs.OathKeeper, OathKeeperMaterial).setFull3D().setUnlocalizedName(Strings.OathKeeper);
        OblivionMaterial = EnumHelper.addToolMaterial(Strings.Oblivion, 3, -1, 6.0F, 15, 12); Oblivion = new ItemOblivion(IDs.Oblivion, OblivionMaterial).setFull3D().setUnlocalizedName(Strings.Oblivion);
        WaywardWindMaterial = EnumHelper.addToolMaterial(Strings.WaywardWind, 3, -1, 6.0F, 8, 20); WaywardWind = new ItemWaywardWind(IDs.WaywardWind, WaywardWindMaterial).setFull3D().setUnlocalizedName(Strings.WaywardWind);
        EarthShakerMaterial = EnumHelper.addToolMaterial(Strings.EarthShaker, 3, -1, 6.0F, 10, 10); EarthShaker = new ItemEarthShaker(IDs.EarthShaker, EarthShakerMaterial).setFull3D().setUnlocalizedName(Strings.EarthShaker);
        RainFellMaterial = EnumHelper.addToolMaterial(Strings.RainFell, 3, -1, 6.0F, 6, 30); RainFell = new ItemRainFell(IDs.RainFell, RainFellMaterial).setFull3D().setUnlocalizedName(Strings.RainFell);
        KingdomKeyChain = new ItemKingdomKeyChain(IDs.KingdomKeyChain);
        KingdomKeyDChain = new ItemKingdomKeyDChain(IDs.KingdomKeyDChain);
        OathkeeperChain = new ItemOathkeeperChain(IDs.OathkeeperChain);
        OblivionChain = new ItemOblivionChain(IDs.OblivionChain);
        WaywardWindChain = new ItemWaywardWindChain(IDs.WaywardWindChain);
        EarthShakerChain = new ItemEarthShakerChain(IDs.EarthShakerChain);
        RainFellChain = new ItemRainFellChain(IDs.RainFellChain);
    }
    
    public static void intiArmour(){
    	//Organization
        OrganizationArmourMaterial = EnumHelper.addArmorMaterial("ORGANIZATION", 20, new int[] { 4, 8, 6, 3 }, 30);
        OrganizationHood = new OrganizationArmor(IDs.OHelm, OrganizationArmourMaterial , KingdomKeys.proxy.addArmor(OrganizationArmourMaterial.name()), 0, "ORGANIZATION_1", Strings.OHood);
        OrganizationCoat = new OrganizationArmor(IDs.OChest, OrganizationArmourMaterial, KingdomKeys.proxy.addArmor(OrganizationArmourMaterial.name()), 1, "ORGANIZATION_1", Strings.OCoat);
        OrganizationLegs = new OrganizationArmor(IDs.OLegs, OrganizationArmourMaterial, KingdomKeys.proxy.addArmor(OrganizationArmourMaterial.name()), 2, "ORGANIZATION_2", Strings.OLegs);
        OrganizationBoots = new OrganizationArmor(IDs.OBoots, OrganizationArmourMaterial, KingdomKeys.proxy.addArmor(OrganizationArmourMaterial.name()), 3, "ORGANIZATION_1", Strings.OBoots);
        //Keyblade
         //Aqua
        KeybladeAArmourMaterial = EnumHelper.addArmorMaterial("KEYBLADEA", 20, new int[] { 5, 8, 6, 4 }, 30);
        KeybladeAHelm = new KeybladeAArmor(IDs.KAHelm, KeybladeAArmourMaterial , KingdomKeys.proxy.addArmor(KeybladeAArmourMaterial.name()), 0, "KEYBLADEA_1", Strings.KAHelm);
        KeybladeAChest = new KeybladeAArmor(IDs.KAChest, KeybladeAArmourMaterial, KingdomKeys.proxy.addArmor(KeybladeAArmourMaterial.name()), 1, "KEYBLADEA_1", Strings.KAChest);
        KeybladeALegs = new KeybladeAArmor(IDs.KALegs, KeybladeAArmourMaterial, KingdomKeys.proxy.addArmor(KeybladeAArmourMaterial.name()), 2, "KEYBLADEA_2", Strings.KALegs);
        KeybladeABoots = new KeybladeAArmor(IDs.KABoots, KeybladeAArmourMaterial, KingdomKeys.proxy.addArmor(KeybladeAArmourMaterial.name()), 3, "KEYBLADEA_1", Strings.KABoots);
         //Terra
        KeybladeTArmourMaterial = EnumHelper.addArmorMaterial("KEYBLADET", 20, new int[] { 6, 8, 7, 4 }, 30);
        KeybladeTHelm = new KeybladeTArmor(IDs.KTHelm, KeybladeTArmourMaterial , KingdomKeys.proxy.addArmor(KeybladeTArmourMaterial.name()), 0, "KEYBLADET_1", Strings.KTHelm);
        KeybladeTChest = new KeybladeTArmor(IDs.KTChest, KeybladeTArmourMaterial, KingdomKeys.proxy.addArmor(KeybladeTArmourMaterial.name()), 1, "KEYBLADET_1", Strings.KTChest);
        KeybladeTLegs = new KeybladeTArmor(IDs.KTLegs, KeybladeTArmourMaterial, KingdomKeys.proxy.addArmor(KeybladeTArmourMaterial.name()), 2, "KEYBLADET_2", Strings.KTLegs);
        KeybladeTBoots = new KeybladeTArmor(IDs.KTBoots, KeybladeTArmourMaterial, KingdomKeys.proxy.addArmor(KeybladeTArmourMaterial.name()), 3, "KEYBLADET_1", Strings.KTBoots);
         //Ventus
        KeybladeVArmourMaterial = EnumHelper.addArmorMaterial("KEYBLADEV", 20, new int[] { 4, 8, 5, 4 }, 30);
        KeybladeVHelm = new KeybladeVArmor(IDs.KVHelm, KeybladeAArmourMaterial , KingdomKeys.proxy.addArmor(KeybladeVArmourMaterial.name()), 0, "KEYBLADEV_1", Strings.KVHelm);
        KeybladeVChest = new KeybladeVArmor(IDs.KVChest, KeybladeAArmourMaterial, KingdomKeys.proxy.addArmor(KeybladeVArmourMaterial.name()), 1, "KEYBLADEV_1", Strings.KVChest);
        KeybladeVLegs = new KeybladeVArmor(IDs.KVLegs, KeybladeAArmourMaterial, KingdomKeys.proxy.addArmor(KeybladeVArmourMaterial.name()), 2, "KEYBLADEV_2", Strings.KVLegs);
        KeybladeVBoots = new KeybladeVArmor(IDs.KVBoots, KeybladeAArmourMaterial, KingdomKeys.proxy.addArmor(KeybladeVArmourMaterial.name()), 3, "KEYBLADEV_1", Strings.KVBoots);
    }

    public static void initHearts(){
        PureHeart = new ItemPureHeart(IDs.PureHeart);
        DarkHeart = new ItemDarkHeart(IDs.DarkHeart);
        Heart = new ItemHeart(IDs.Heart);
        KingdomHearts = new ItemKingdomHearts(IDs.KingdomHearts);
        

    }
    
    public static void initLoot(){
        //DISC 1 CHEST GENERATION
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc1),0,1,5));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc1),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(Disc1),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(Disc1),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc1),0,1,5));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc1),0,1,5));
        //DISC 2 CHEST GENERATION
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc2),0,1,5));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc2),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(Disc2),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(Disc2),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc2),0,1,5));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc2),0,1,5));
        //DISC 3 CHEST GENERATION
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc3),0,1,5));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc3),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(Disc3),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(Disc3),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc3),0,1,5));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc3),0,1,5));
        //DISC 4 CHEST GENERATION
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc4),0,1,5));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc4),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(Disc4),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(Disc4),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc4),0,1,5));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc4),0,1,5));
        //DISC 5 CHEST GENERATION
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc5),0,1,5));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc5),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(Disc5),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(Disc5),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc5),0,1,5));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc5),0,1,5));
        //DISC 6 CHEST GENERATION
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc6),0,1,5));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc6),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(Disc6),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(Disc6),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc6),0,1,5));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc6),0,1,5));
        //DISC 7 CHEST GENERATION
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc7),0,1,5));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc7),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(Disc7),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(Disc7),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc7),0,1,5));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc7),0,1,5));
        //DISC 8 CHEST GENERATION
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc8),0,1,5));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc8),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(Disc8),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(Disc8),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc8),0,1,5));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc8),0,1,5));
        //DISC 9 CHEST GENERATION
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc9),0,1,5));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc9),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(Disc9),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(Disc9),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Disc9),0,1,5));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Disc9),0,1,5));
    	//KINGDOM KEY CHEST GENERATION
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(KingdomKey),0,1,5));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(KingdomKey),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(KingdomKey),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(KingdomKey),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(KingdomKey),0,1,5));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(KingdomKey),0,1,5));
    	//KINGDOM KEY D CHEST GENERATION
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(KingdomKeyD),0,1,5));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(KingdomKeyD),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(KingdomKeyD),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(KingdomKeyD),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(KingdomKeyD),0,1,5));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(KingdomKeyD),0,1,5));
    	//OATHKEEPER CHEST GENERATION
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(OathKeeper),0,1,5));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(OathKeeper),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(OathKeeper),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(OathKeeper),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(OathKeeper),0,1,5));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(OathKeeper),0,1,5));
        //OBLIVION CHEST GENERATION
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Oblivion),0,1,5));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Oblivion),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(Oblivion),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(Oblivion),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Oblivion),0,1,5));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Oblivion),0,1,5));
        //WAYWARD WIND CHEST GENERATION
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(WaywardWind),0,1,5));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(WaywardWind),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(WaywardWind),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(WaywardWind),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(WaywardWind),0,1,5));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(WaywardWind),0,1,5));
        //EARTHSHAKER CHEST GENERATION
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(EarthShaker),0,1,5));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(EarthShaker),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(EarthShaker),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(EarthShaker),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(EarthShaker),0,1,5));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(EarthShaker),0,1,5));
        //RAINFELL CHEST GENERATION
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(RainFell),0,1,5));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(RainFell),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(RainFell),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(RainFell),0,1,15));
        ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(RainFell),0,1,5));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(RainFell),0,1,5));
    }
    
    public static void initOthers(){
    	Disc1 = new ItemDisc1(IDs.Disc1, Reference.MOD_ID + ":" + Strings.Disc1).setUnlocalizedName(Strings.Disc1);
        Disc2 = new ItemDisc2(IDs.Disc2, Reference.MOD_ID + ":" + Strings.Disc2).setUnlocalizedName(Strings.Disc2);
    	Disc3 = new ItemDisc3(IDs.Disc3, Reference.MOD_ID + ":" + Strings.Disc3).setUnlocalizedName(Strings.Disc3);
        Disc4 = new ItemDisc4(IDs.Disc4, Reference.MOD_ID + ":" + Strings.Disc4).setUnlocalizedName(Strings.Disc4);
    	Disc5 = new ItemDisc5(IDs.Disc5, Reference.MOD_ID + ":" + Strings.Disc5).setUnlocalizedName(Strings.Disc5);
        Disc6 = new ItemDisc6(IDs.Disc6, Reference.MOD_ID + ":" + Strings.Disc6).setUnlocalizedName(Strings.Disc6);
    	Disc7 = new ItemDisc7(IDs.Disc7, Reference.MOD_ID + ":" + Strings.Disc7).setUnlocalizedName(Strings.Disc7);
        Disc8 = new ItemDisc8(IDs.Disc8, Reference.MOD_ID + ":" + Strings.Disc8).setUnlocalizedName(Strings.Disc8);
    	Disc9 = new ItemDisc9(IDs.Disc9, Reference.MOD_ID + ":" + Strings.Disc9).setUnlocalizedName(Strings.Disc9);
        DarkLeather = new ItemDarkLeather(IDs.DarkLeather);
        HP = new ItemHP(IDs.HP);
        Munny = new ItemMunny(IDs.Munny);
        Potion = new ItemPotion(IDs.Potion, 0, 0, true);
    }
    
    public static void initItemrecipes(){
        ItemStack greenDye = new ItemStack(Item.dyePowder, 1, 2);
        ItemStack blueDye = new ItemStack(Item.dyePowder, 1, 4);
        ItemStack blackDye = new ItemStack(Item.dyePowder, 1, 0);
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
            'O', Block.obsidian, 'L', DarkLeather, 'S', Item.silk, 'I', blackDye
    });
        GameRegistry.addRecipe(new ItemStack(OrganizationCoat), new Object[]{
            "LIL",
            "LOL",
            "LLL",
            'O', Block.obsidian, 'L', DarkLeather, 'I', blackDye
    });
        GameRegistry.addRecipe(new ItemStack(OrganizationLegs), new Object[]{
            "LLL",
            "LOL",
            "LIL",
            'O', Block.obsidian, 'L', DarkLeather, 'I', blackDye
    });
        GameRegistry.addRecipe(new ItemStack(OrganizationBoots), new Object[]{
            "LOL",
            "LIL",
            'O', Block.obsidian, 'L', DarkLeather, 'I', blackDye
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
        GameRegistry.addRecipe(new ItemStack(WaywardWindChain), new Object[]{
        	"IPI",
            "GKG",
            "IPI",
            'P', PureHeart, 'I', Item.ingotIron, 'K', KingdomHearts, 'G', greenDye 
    });
        GameRegistry.addRecipe(new ItemStack(EarthShakerChain), new Object[]{
        	"GPG",
            "IKI",
            "IPI",
            'P', PureHeart, 'I', Item.ingotIron, 'K', KingdomHearts, 'G', Item.ingotGold
    });
        GameRegistry.addRecipe(new ItemStack(RainFellChain), new Object[]{
        	"IPI",
            "LKW",
            "IPI",
            'P', PureHeart, 'I', Item.ingotIron, 'K', KingdomHearts, 'L', blueDye, 'W', Item.bucketWater 
    });
        GameRegistry.addRecipe(new ItemStack(KeybladeTHelm), new Object[]{
        	"DED",
            "PKP",
            'P', PureHeart, 'D', DarkHeart, 'K', KingdomHearts, 'E', EarthShaker
    });
        GameRegistry.addRecipe(new ItemStack(KeybladeAHelm), new Object[]{
        	"HRH",
            "PKP",
            'P', PureHeart, 'H', Heart, 'K', KingdomHearts, 'R', RainFell
    });
        GameRegistry.addRecipe(new ItemStack(KeybladeVHelm), new Object[]{
        	"PWP",
            "PKP",
            'P', PureHeart, 'K', KingdomHearts, 'W', WaywardWind
    });
        GameRegistry.addRecipe(new ItemStack(KeybladeTChest), new Object[]{
        	"DED",
            "PKP",
            "PKP",
            'P', PureHeart, 'D', DarkHeart, 'K', KingdomHearts, 'E', EarthShaker
    });
        GameRegistry.addRecipe(new ItemStack(KeybladeAChest), new Object[]{
        	"HRH",
            "PKP",
            "PKP",
            'P', PureHeart, 'H', Heart, 'K', KingdomHearts, 'R', RainFell
    });
        GameRegistry.addRecipe(new ItemStack(KeybladeVChest), new Object[]{
        	"PRP",
            "PKP",
            "PKP",
            'P', PureHeart, 'K', KingdomHearts, 'W', WaywardWind
    });
        GameRegistry.addRecipe(new ItemStack(KeybladeTLegs), new Object[]{
        	"DED",
            "PKP",
            "PKP",
            'P', PureHeart, 'D', DarkHeart, 'K', KingdomHearts, 'E', EarthShaker
    });
        GameRegistry.addRecipe(new ItemStack(KeybladeALegs), new Object[]{
        	"HRH",
            "PKP",
            "P P",
            'P', PureHeart, 'H', Heart, 'K', KingdomHearts, 'R', RainFell
    });
        GameRegistry.addRecipe(new ItemStack(KeybladeVLegs), new Object[]{
        	"PRP",
            "PKP",
            "P P",
            'P', PureHeart, 'K', KingdomHearts, 'W', WaywardWind
    });
        GameRegistry.addRecipe(new ItemStack(KeybladeTBoots), new Object[]{
        	"DED",
            "HKH",
            'P', PureHeart, 'D', DarkHeart, 'K', KingdomHearts, 'E', EarthShaker, 'H', Heart
    });
        GameRegistry.addRecipe(new ItemStack(KeybladeABoots), new Object[]{
        	"HRH",
            "HKH",
            'P', PureHeart, 'H', Heart, 'K', KingdomHearts, 'R', RainFell
    });
        GameRegistry.addRecipe(new ItemStack(KeybladeVBoots), new Object[]{
        	"PRP",
            "HKH",
            'P', PureHeart, 'K', KingdomHearts, 'W', WaywardWind, 'H', Heart
    });
        
        GameRegistry.addShapelessRecipe(new ItemStack(KingdomKey), new ItemStack(KingdomKeyChain, 1), new ItemStack(Item.swordWood, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(KingdomKeyD), new ItemStack(KingdomKeyDChain, 1), new ItemStack(Item.swordGold, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(OathKeeper), new ItemStack(OathkeeperChain, 1), new ItemStack(Item.swordIron, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(Oblivion), new ItemStack(OblivionChain, 1), new ItemStack(Item.swordIron, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(WaywardWind), new ItemStack(WaywardWindChain, 1), new ItemStack(Item.swordWood, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(EarthShaker), new ItemStack(EarthShakerChain, 1), new ItemStack(Item.swordIron, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(RainFell), new ItemStack(RainFellChain, 1), new ItemStack(Item.swordStone, 1));
        GameRegistry.addSmelting(KingdomKey.itemID, new ItemStack(Disc1), 0.1f);
        GameRegistry.addSmelting(OathKeeper.itemID, new ItemStack(Disc2), 0.1f);
        GameRegistry.addSmelting(Oblivion.itemID, new ItemStack(Disc3), 0.1f);
        GameRegistry.addSmelting(WaywardWind.itemID, new ItemStack(Disc4), 0.1f);
        GameRegistry.addSmelting(KingdomKeyD.itemID, new ItemStack(Disc5), 0.1f);
        GameRegistry.addSmelting(EarthShaker.itemID, new ItemStack(Disc6), 0.1f);
        GameRegistry.addSmelting(RainFell.itemID, new ItemStack(Disc7), 0.1f);
        
    }
}