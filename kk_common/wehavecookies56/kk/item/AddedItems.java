package wehavecookies56.kk.item;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.EnumHelper;
import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.item.keyblades.*;
import wehavecookies56.kk.item.keychains.*;
import wehavecookies56.kk.item.recipes.*;
import wehavecookies56.kk.item.synthesis.ItemBlazingCrystal;
import wehavecookies56.kk.item.synthesis.ItemBlazingGem;
import wehavecookies56.kk.item.synthesis.ItemBlazingShard;
import wehavecookies56.kk.item.synthesis.ItemBlazingStone;
import wehavecookies56.kk.item.synthesis.ItemBrightCrystal;
import wehavecookies56.kk.item.synthesis.ItemBrightGem;
import wehavecookies56.kk.item.synthesis.ItemBrightShard;
import wehavecookies56.kk.item.synthesis.ItemBrightStone;
import wehavecookies56.kk.item.synthesis.ItemDarkCrystal;
import wehavecookies56.kk.item.synthesis.ItemDarkGem;
import wehavecookies56.kk.item.synthesis.ItemDarkMatter;
import wehavecookies56.kk.item.synthesis.ItemDarkShard;
import wehavecookies56.kk.item.synthesis.ItemDarkStone;
import wehavecookies56.kk.item.synthesis.ItemDenseCrystal;
import wehavecookies56.kk.item.synthesis.ItemDenseGem;
import wehavecookies56.kk.item.synthesis.ItemDenseShard;
import wehavecookies56.kk.item.synthesis.ItemDenseStone;
import wehavecookies56.kk.item.synthesis.ItemEnergyCrystal;
import wehavecookies56.kk.item.synthesis.ItemEnergyGem;
import wehavecookies56.kk.item.synthesis.ItemEnergyShard;
import wehavecookies56.kk.item.synthesis.ItemEnergyStone;
import wehavecookies56.kk.item.synthesis.ItemFrostCrystal;
import wehavecookies56.kk.item.synthesis.ItemFrostGem;
import wehavecookies56.kk.item.synthesis.ItemFrostShard;
import wehavecookies56.kk.item.synthesis.ItemFrostStone;
import wehavecookies56.kk.item.synthesis.ItemLightningCrystal;
import wehavecookies56.kk.item.synthesis.ItemLightningGem;
import wehavecookies56.kk.item.synthesis.ItemLightningShard;
import wehavecookies56.kk.item.synthesis.ItemLightningStone;
import wehavecookies56.kk.item.synthesis.ItemLucidCrystal;
import wehavecookies56.kk.item.synthesis.ItemLucidGem;
import wehavecookies56.kk.item.synthesis.ItemLucidShard;
import wehavecookies56.kk.item.synthesis.ItemLucidStone;
import wehavecookies56.kk.item.synthesis.ItemMythrilCrystal;
import wehavecookies56.kk.item.synthesis.ItemMythrilGem;
import wehavecookies56.kk.item.synthesis.ItemMythrilShard;
import wehavecookies56.kk.item.synthesis.ItemMythrilStone;
import wehavecookies56.kk.item.synthesis.ItemOrichalcum;
import wehavecookies56.kk.item.synthesis.ItemOrichalcumPlus;
import wehavecookies56.kk.item.synthesis.ItemPowerCrystal;
import wehavecookies56.kk.item.synthesis.ItemPowerGem;
import wehavecookies56.kk.item.synthesis.ItemPowerShard;
import wehavecookies56.kk.item.synthesis.ItemPowerStone;
import wehavecookies56.kk.item.synthesis.ItemRemembranceCrystal;
import wehavecookies56.kk.item.synthesis.ItemRemembranceGem;
import wehavecookies56.kk.item.synthesis.ItemRemembranceShard;
import wehavecookies56.kk.item.synthesis.ItemRemembranceStone;
import wehavecookies56.kk.item.synthesis.ItemSerenityCrystal;
import wehavecookies56.kk.item.synthesis.ItemSerenityGem;
import wehavecookies56.kk.item.synthesis.ItemSerenityShard;
import wehavecookies56.kk.item.synthesis.ItemSerenityStone;
import wehavecookies56.kk.item.synthesis.ItemShinyCrystal;
import wehavecookies56.kk.item.synthesis.ItemTranquilCrystal;
import wehavecookies56.kk.item.synthesis.ItemTranquilGem;
import wehavecookies56.kk.item.synthesis.ItemTranquilShard;
import wehavecookies56.kk.item.synthesis.ItemTranquilStone;
import wehavecookies56.kk.item.synthesis.ItemTwilightCrystal;
import wehavecookies56.kk.item.synthesis.ItemTwilightGem;
import wehavecookies56.kk.item.synthesis.ItemTwilightShard;
import wehavecookies56.kk.item.synthesis.ItemTwilightStone;
import wehavecookies56.kk.lib.IDs;
import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.lib.Strings;
import cpw.mods.fml.common.registry.GameRegistry;

public class AddedItems {

	public static Item Guide, Interdiction, SharpShooter, LindWorm, FrozenPride, SkySplitter, BookOfRetribution, Lunatic, Appregio, FairGame, GracefulDahlia, Foudre, Pouch, Munny1, Munny5, Munny10, Munny20, Munny50, Munny100, Munny200, Munny500, Munny800, Munny1000, Munny1200, Munny1500, Munny1800, Munny2000, Munny3000, Munny4000, Munny5000, Munny6000, BlazingShard, BlazingStone, BlazingGem, BlazingCrystal, FrostShard, FrostStone, FrostGem, FrostCrystal, LightningShard, LightningStone, LightningGem, LightningCrystal, LucidShard, LucidStone, LucidGem, LucidCrystal, PowerShard, PowerStone, PowerGem, PowerCrystal, DarkShard, DarkStone, DarkGem, DarkCrystal, DarkMatter, DenseShard, DenseStone, DenseGem, DenseCrystal, TwilightShard, TwilightStone, TwilightGem, TwilightCrystal, MythrilShard, MythrilStone, MythrilGem, MythrilCrystal, BrightShard, BrightStone, BrightGem, BrightCrystal, EnergyShard, EnergyStone, EnergyGem, EnergyCrystal, SerenityShard, SerenityStone, SerenityGem, SerenityCrystal, Orichalcum, OrichalcumPlus, RemembranceShard, RemembranceStone, RemembranceGem, RemembranceCrystal, TranquilShard, TranquilStone, TranquilGem, TranquilCrystal, MysteryGoo, ShinyCrystal, Disc1, Disc2, PureHeart, DarkHeart, Heart, KingdomHearts, OrganizationHood, OrganizationCoat, OrganizationLegs, OrganizationBoots, DarkLeather, HP, Munny, Potion, Disc3, Disc4, Disc5, Disc6, Disc7, Disc8, Disc9, WaywardWindChain, KeybladeAHelm, KeybladeAChest, KeybladeALegs, KeybladeABoots, KeybladeTHelm, KeybladeTChest, KeybladeTLegs, KeybladeTBoots, KeybladeEHelm, KeybladeEChest, KeybladeELegs, KeybladeEBoots, KeybladeVHelm, KeybladeVChest, KeybladeVLegs, KeybladeVBoots, Vulpeus, Ursus, Unicornis, K4, K5, K6, K7, K8, K9, K10, K11, K12, K13, K14, K15, K16, K17, K18, K19, K20, K21, K22, K23, K24, K25, K26, K27, K28, K29, K30, K31, K32, K33, K34, K35, K36, K37, K38, K39, K40, K41, K42, K43, K44, K45, K46, K47, K48, K49, K50, K51, K52, K53, K54, K55, K56, K57, K58, K59, K60, K61, K62, K63, K64, K65, K66, K67, K68, K69, K70, K71, K72, K73, K74, K75, K76, K77, K78, K79, K80, K81, K82, K83, K84, K85, K86, K87, K88, K89, K90, K91, K92, K93, K94, K95, K96, K97, K98, K99, K100, K101, K102, K103, K104, K105, K106, K107, K108, K109, K110, K111, K112, K113, K114, K1c, K2c, K3c, K4c, K5c, K6c, K7c, K8c, K9c, K10c, K11c, K12c, K13c, K14c, K15c, K16c, K17c, K18c, K19c, K20c, K21c, K22c, K23c, K24c, K25c, K26c, K27c, K28c, K29c, K30c, K31c, K32c, K33c, K34c, K35c, K36c, K37c, K38c, K39c, K40c, K41c, K42c, K43c, K44c, K45c, K46c, K47c, K48c, K49c, K50c, K51c, K52c, K53c, K54c, K55c, K56c, K57c, K58c, K59c, K60c, K61c, K62c, K63c, K64c, K65c, K66c, K67c, K68c, K69c, K70c, K71c, K72c, K73c, K74c, K75c, K76c, K77c, K78c, K79c, K80c, K81c, K82c, K83c, K84c, K85c, K86c, K87c, K88c, K89c, K90c, K91c, K92c, K93c, K94c, K95c, K96c, K97c, K98c, K99c, K100c, K101c, K102c, K103c, K104c, K105c, K106c, K107c, K108c, K109c, K110c, K111c, K112c, K113c, K114c, EternalFlames, K1r, K2r, K3r, K4r, K5r, K6r, K7r, K8r, K9r, K10r, K11r, K12r, K13r, K14r, K15r, K16r, K17r, K18r, K19r, K20r, K21r, K22r, K23r, K24r, K25r, K26r, K27r, K28r, K29r, K30r, K31r, K32r, K33r, K34r, K35r, K36r, K37r, K38r, K39r, K40r, K41r, K42r, K43r, K44r, K45r, K46r, K47r, K48r, K49r, K50r, K51r, K52r, K53r, K54r, K55r, K56r, K57r, K58r, K59r, K60r, K61r, K62r, K63r, K64r, K65r, K66r, K67r, K68r, K69r, K70r, K71r, K72r, K73r, K74r, K75r, K76r, K77r, K78r, K79r, K80r, K81r, K82r, K83r, K84r, K85r, K86r, K87r, K88r, K89r, K90r, K91r, K92r, K93r, K94r, K95r, K96r, K97r, K98r, K99r, K100r, K101r, K102r, K103r, K104r, K105r, K106r, K107r, K108r, K109r, K110r, K111r, K112r, K113r, K114r;
	public static EnumArmorMaterial OrganizationArmourMaterial, KeybladeAArmourMaterial, KeybladeTArmourMaterial, KeybladeVArmourMaterial, KeybladeEArmourMaterial;
	public static EnumToolMaterial SharpShooterMaterial, LindWormMaterial, FrozenPrideMaterial, SkySplitterMaterial, LunaticMaterial, AppregioMaterial, FairGameMaterial, GracefulDahliaMaterial, FoudreMaterial, InterdictionMaterial, BookOfRetributionMaterial, VulpeusMaterial, UrsusMaterial, UnicornisMaterial, K4m, K5m, K6m, K7m, K8m, K9m, K10m, K11m, K12m, K13m, K14m, K15m, K16m, K17m, K18m, K19m, K20m, K21m, K22m, K23m, K24m, K25m, K26m, K27m, K28m, K29m, K30m, K31m, K32m, K33m, K34m, K35m, K36m, K37m, K38m, K39m, K40m, K41m, K42m, K43m, K44m, K45m, K46m, K47m, K48m, K49m, K50m, K51m, K52m, K53m, K54m, K55m, K56m, K57m, K58m, K59m, K60m, K61m, K62m, K63m, K64m, K65m, K66m, K67m, K68m, K69m, K70m, K71m, K72m, K73m, K74m, K75m, K76m, K77m, K78m, K79m, K80m, K81m, K82m, K83m, K84m, K85m, K86m, K87m, K88m, K89m, K90m, K91m, K92m, K93m, K94m, K95m, K96m, K97m, K98m, K99m, K100m, K101m, K102m, K103m, K104m, K105m, K106m, K107m, K108m, K109m, K110m, K111m, K112m, K113m, K114m, EternalFlamesMaterial;

	static int chainStackSize = 1;
	
	public static void initKeyBlades(){
		//EternalFlamesMaterial = EnumHelper.addToolMaterial(Strings.EternalFlames, 3, -1, 6.0F, 16, 30); EternalFlames = new ItemEternalFlames(IDs.EternalFlames, EternalFlamesMaterial).setFull3D().setUnlocalizedName(Strings.EternalFlames);
		VulpeusMaterial = EnumHelper.addToolMaterial(Strings.Vulpeus, 3, -1, 6.0F, 16, 30); Vulpeus = new ItemVulpeus(IDs.Vulpeus, VulpeusMaterial).setFull3D().setUnlocalizedName(Strings.Vulpeus); GameRegistry.registerItem(Vulpeus, Strings.Vulpeus);
		UrsusMaterial = EnumHelper.addToolMaterial(Strings.Ursus, 3, -1, 6.0F, 18, 30); Ursus = new ItemUrsus(IDs.Ursus, UrsusMaterial).setFull3D().setUnlocalizedName(Strings.Ursus); GameRegistry.registerItem(Ursus, Strings.Ursus);
		UnicornisMaterial = EnumHelper.addToolMaterial(Strings.Unicornis, 3, -1, 6.0F, 15, 30); Unicornis = new ItemUnicornis(IDs.Unicornis, UnicornisMaterial).setFull3D().setUnlocalizedName(Strings.Unicornis); GameRegistry.registerItem(Unicornis, Strings.Unicornis);
		K4m = EnumHelper.addToolMaterial(Strings.Leopardos, 3, -1, 6.0F, 17, 30); K4 = new ItemLeopardos(IDs.K4, K4m).setFull3D().setUnlocalizedName(Strings.Leopardos); GameRegistry.registerItem(K4, Strings.Leopardos);
		K5m = EnumHelper.addToolMaterial(Strings.Anguis, 3, -1, 6.0F, 9, 30); K5 = new ItemAnguis(IDs.K5, K5m).setFull3D().setUnlocalizedName(Strings.Anguis); GameRegistry.registerItem(K5, Strings.Anguis);
		K6m = EnumHelper.addToolMaterial(Strings.Leaskeyblade, 3, -1, 6.0F, 8, 30); K6 = new ItemLeasKeyblade(IDs.K6, K6m).setFull3D().setUnlocalizedName(Strings.Leaskeyblade); GameRegistry.registerItem(K6, Strings.Leaskeyblade);
		K7m = EnumHelper.addToolMaterial(Strings.Youngxehanortskeyblade, 3, -1, 6.0F, 15, 30); K7 = new ItemYoungXehanort(IDs.K7, K7m).setFull3D().setUnlocalizedName(Strings.Youngxehanortskeyblade); GameRegistry.registerItem(K7, Strings.Youngxehanortskeyblade);
		K8m = EnumHelper.addToolMaterial(Strings.Oceanrage, 3, -1, 6.0F, 8, 30); K8 = new ItemOceanRage(IDs.K8, K8m).setFull3D().setUnlocalizedName(Strings.Oceanrage); GameRegistry.registerItem(K8, Strings.Oceanrage);
		K9m = EnumHelper.addToolMaterial(Strings.Endofpain, 3, -1, 6.0F, 9, 30); K9 = new ItemEndOfPain(IDs.K9, K9m).setFull3D().setUnlocalizedName(Strings.Endofpain); GameRegistry.registerItem(K9, Strings.Endofpain);
		K10m = EnumHelper.addToolMaterial(Strings.Unbound, 3, -1, 6.0F, 13, 30); K10 = new ItemUnbound(IDs.K10, K10m).setFull3D().setUnlocalizedName(Strings.Unbound); GameRegistry.registerItem(K10, Strings.Unbound);
		K11m = EnumHelper.addToolMaterial(Strings.Sweetdreams, 3, -1, 6.0F, 9, 30); K11 = new ItemSweetDreams(IDs.K11, K11m).setFull3D().setUnlocalizedName(Strings.Sweetdreams); GameRegistry.registerItem(K11, Strings.Sweetdreams);
		K12m = EnumHelper.addToolMaterial(Strings.Divewing, 3, -1, 6.0F, 7, 30); K12 = new ItemDiveWing(IDs.K12, K12m).setFull3D().setUnlocalizedName(Strings.Divewing); GameRegistry.registerItem(K12, Strings.Divewing);
		K13m = EnumHelper.addToolMaterial(Strings.Counterpoint, 3, -1, 6.0F, 7, 30); K13 = new ItemCounterPoint(IDs.K13, K13m).setFull3D().setUnlocalizedName(Strings.Counterpoint); GameRegistry.registerItem(K13, Strings.Counterpoint);
		K14m = EnumHelper.addToolMaterial(Strings.Allforone, 3, -1, 6.0F, 5, 30); K14 = new ItemAllForOne(IDs.K14, K14m).setFull3D().setUnlocalizedName(Strings.Allforone); GameRegistry.registerItem(K14, Strings.Allforone);
		K15m = EnumHelper.addToolMaterial(Strings.Knockoutpunch, 3, -1, 6.0F, 5, 30); K15 = new ItemKnockoutPunch(IDs.K15, K15m).setFull3D().setUnlocalizedName(Strings.Knockoutpunch); GameRegistry.registerItem(K15, Strings.Knockoutpunch);
		K16m = EnumHelper.addToolMaterial(Strings.Ferrisgear, 3, -1, 6.0F, 6, 30); K16 = new ItemFerrisGear(IDs.K16, K16m).setFull3D().setUnlocalizedName(Strings.Ferrisgear); GameRegistry.registerItem(K16, Strings.Ferrisgear);
		K17m = EnumHelper.addToolMaterial(Strings.Dualdisc, 3, -1, 6.0F, 7, 30); K17 = new ItemDualDisc(IDs.K17, K17m).setFull3D().setUnlocalizedName(Strings.Dualdisc); GameRegistry.registerItem(K17, Strings.Dualdisc);
		K18m = EnumHelper.addToolMaterial(Strings.Guardianbell, 3, -1, 6.0F, 7, 30); K18 = new ItemGuardianBell(IDs.K18, K18m).setFull3D().setUnlocalizedName(Strings.Guardianbell); GameRegistry.registerItem(K18, Strings.Guardianbell);
		K19m = EnumHelper.addToolMaterial(Strings.Skullnoise, 3, -1, 6.0F, 6, 30); K19 = new ItemSkullNoise(IDs.K19, K19m).setFull3D().setUnlocalizedName(Strings.Skullnoise); GameRegistry.registerItem(K19, Strings.Skullnoise);
		K20m = EnumHelper.addToolMaterial(Strings.Woodenkeyblade, 3, -1, 6.0F, 2, 30); K20 = new ItemWoodenKeyBlade(IDs.K20, K20m).setFull3D().setUnlocalizedName(Strings.Woodenkeyblade); GameRegistry.registerItem(K20, Strings.Woodenkeyblade);
		K21m = EnumHelper.addToolMaterial(Strings.Kyebladebroken, 3, -1, 6.0F, 13, 30); K21 = new ItemkyeBladeBroken(IDs.K21, K21m).setFull3D().setUnlocalizedName(Strings.Kyebladebroken); GameRegistry.registerItem(K21, Strings.Kyebladebroken);
		K22m = EnumHelper.addToolMaterial(Strings.Kyeblade, 3, -1, 6.0F, 25, 30); K22 = new ItemkyeBlade(IDs.K22, K22m).setFull3D().setUnlocalizedName(Strings.Kyeblade); GameRegistry.registerItem(K22, Strings.Kyeblade);
		K23m = EnumHelper.addToolMaterial(Strings.Lightseeker, 3, -1, 6.0F, 9, 30); K23 = new ItemLightSeeker(IDs.K23, K23m).setFull3D().setUnlocalizedName(Strings.Lightseeker); GameRegistry.registerItem(K23, Strings.Lightseeker);
		K24m = EnumHelper.addToolMaterial(Strings.Lostmemory, 3, -1, 6.0F, 12, 30); K24 = new ItemLostMemory(IDs.K24, K24m).setFull3D().setUnlocalizedName(Strings.Lostmemory); GameRegistry.registerItem(K24, Strings.Lostmemory);
		K25m = EnumHelper.addToolMaterial(Strings.Frolicflame, 3, -1, 6.0F, 6, 30); K25 = new ItemFrolicFlame(IDs.K25, K25m).setFull3D().setUnlocalizedName(Strings.Frolicflame); GameRegistry.registerItem(K25, Strings.Frolicflame);
		K26m = EnumHelper.addToolMaterial(Strings.Masterkeeper, 3, -1, 6.0F, 13, 30); K26 = new ItemMasterKeeper(IDs.K26, K26m).setFull3D().setUnlocalizedName(Strings.Masterkeeper); GameRegistry.registerItem(K26, Strings.Masterkeeper);
		K27m = EnumHelper.addToolMaterial(Strings.Brigthcrest, 3, -1, 6.0F, 7, 30); K27 = new ItemBrightCrest(IDs.K27, K27m).setFull3D().setUnlocalizedName(Strings.Brigthcrest); GameRegistry.registerItem(K27, Strings.Brigthcrest);
		K28m = EnumHelper.addToolMaterial(Strings.Crownunlimit, 3, -1, 6.0F, 10, 30); K28 = new ItemCrownUnLimit(IDs.K28, K28m).setFull3D().setUnlocalizedName(Strings.Crownunlimit); GameRegistry.registerItem(K28, Strings.Crownunlimit);
		K29m = EnumHelper.addToolMaterial(Strings.Noname, 3, -1, 6.0F, 12, 30); K29 = new ItemNoName(IDs.K29, K29m).setFull3D().setUnlocalizedName(Strings.Noname); GameRegistry.registerItem(K29, Strings.Noname);
		K30m = EnumHelper.addToolMaterial(Strings.Voidgear, 3, -1, 6.0F, 11, 30); K30 = new ItemVoidGear(IDs.K30, K30m).setFull3D().setUnlocalizedName(Strings.Voidgear); GameRegistry.registerItem(K30, Strings.Voidgear);
		K31m = EnumHelper.addToolMaterial(Strings.Sweetstack, 3, -1, 6.0F, 8, 30); K31 = new ItemSweetStack(IDs.K31, K31m).setFull3D().setUnlocalizedName(Strings.Sweetstack); GameRegistry.registerItem(K31, Strings.Sweetstack);
		K32m = EnumHelper.addToolMaterial(Strings.Pixiepetal, 3, -1, 6.0F, 6, 30); K32 = new ItemPixiePetal(IDs.K32, K32m).setFull3D().setUnlocalizedName(Strings.Pixiepetal); GameRegistry.registerItem(K32, Strings.Pixiepetal);
		K33m = EnumHelper.addToolMaterial(Strings.Hyperdrive, 3, -1, 6.0F, 8, 30); K33 = new ItemHyperDrive(IDs.K33, K33m).setFull3D().setUnlocalizedName(Strings.Hyperdrive); GameRegistry.registerItem(K33, Strings.Hyperdrive);
		K34m = EnumHelper.addToolMaterial(Strings.Markofahero, 3, -1, 6.0F, 7, 30); K34 = new ItemMarkOfAHero(IDs.K34, K34m).setFull3D().setUnlocalizedName(Strings.Markofahero); GameRegistry.registerItem(K34, Strings.Markofahero);
		K35m = EnumHelper.addToolMaterial(Strings.Victoryline, 3, -1, 6.0F, 7, 30); K35 = new ItemVictoryLine(IDs.K35, K35m).setFull3D().setUnlocalizedName(Strings.Victoryline); GameRegistry.registerItem(K35, Strings.Victoryline);
		K36m = EnumHelper.addToolMaterial(Strings.Fairystars, 3, -1, 6.0F, 6, 30); K36 = new ItemFairyStars(IDs.K36, K36m).setFull3D().setUnlocalizedName(Strings.Fairystars); GameRegistry.registerItem(K36, Strings.Fairystars);
		K37m = EnumHelper.addToolMaterial(Strings.Strokeofmidnight, 3, -1, 6.0F, 6, 30); K37 = new ItemStrokeOfMidnight(IDs.K37, K37m).setFull3D().setUnlocalizedName(Strings.Strokeofmidnight); GameRegistry.registerItem(K37, Strings.Strokeofmidnight);
		K38m = EnumHelper.addToolMaterial(Strings.Chaosripper, 3, -1, 6.0F, 7, 30); K38 = new ItemChaosRipper(IDs.K38, K38m).setFull3D().setUnlocalizedName(Strings.Chaosripper); GameRegistry.registerItem(K38, Strings.Chaosripper);
		K39m = EnumHelper.addToolMaterial(Strings.Xehanortskeyblade, 3, -1, 6.0F, 18, 30); K39 = new ItemXehanortsKeyblade(IDs.K39, K39m).setFull3D().setUnlocalizedName(Strings.Xehanortskeyblade); GameRegistry.registerItem(K39, Strings.Xehanortskeyblade);
		K40m = EnumHelper.addToolMaterial(Strings.Darkgnaw, 3, -1, 6.0F, 10, 30); K40 = new ItemDarkGnaw(IDs.K40, K40m).setFull3D().setUnlocalizedName(Strings.Darkgnaw); GameRegistry.registerItem(K40, Strings.Darkgnaw);
		K41m = EnumHelper.addToolMaterial(Strings.Zeroone, 3, -1, 6.0F, 12, 30); K41 = new ItemZeroOne(IDs.K41, K41m).setFull3D().setUnlocalizedName(Strings.Zeroone); GameRegistry.registerItem(K41, Strings.Zeroone);
		K42m = EnumHelper.addToolMaterial(Strings.Dreamsword, 3, -1, 6.0F, 5, 30); K42 = new ItemDreamSword(IDs.K42, K42m).setFull3D().setUnlocalizedName(Strings.Dreamsword); GameRegistry.registerItem(K42, Strings.Dreamsword);
		K43m = EnumHelper.addToolMaterial(Strings.Aubade, 3, -1, 6.0F, 9, 30); K43 = new ItemAubade(IDs.K43, K43m).setFull3D().setUnlocalizedName(Strings.Aubade); GameRegistry.registerItem(K43, Strings.Aubade);
		K44m = EnumHelper.addToolMaterial(Strings.Umbrella, 3, -1, 6.0F, 4, 30); K44 = new ItemUmbrella(IDs.K44, K44m).setFull3D().setUnlocalizedName(Strings.Umbrella); GameRegistry.registerItem(K44, Strings.Umbrella);
		K45m = EnumHelper.addToolMaterial(Strings.Omegaweapon, 3, -1, 6.0F, 13, 30); K45 = new ItemOmegaWeapon(IDs.K45, K45m).setFull3D().setUnlocalizedName(Strings.Omegaweapon); GameRegistry.registerItem(K45, Strings.Omegaweapon);
		K46m = EnumHelper.addToolMaterial(Strings.Twilightblaze, 3, -1, 6.0F, 11, 30); K46 = new ItemTwilightBlaze(IDs.K46, K46m).setFull3D().setUnlocalizedName(Strings.Twilightblaze); GameRegistry.registerItem(K46, Strings.Twilightblaze);
		K47m = EnumHelper.addToolMaterial(Strings.Maverickflare, 3, -1, 6.0F, 9, 30); K47 = new ItemMaverickFlare(IDs.K47, K47m).setFull3D().setUnlocalizedName(Strings.Maverickflare); GameRegistry.registerItem(K47, Strings.Maverickflare);
		K48m = EnumHelper.addToolMaterial(Strings.Astralblast, 3, -1, 6.0F, 9, 30); K48 = new ItemAstralBlast(IDs.K48, K48m).setFull3D().setUnlocalizedName(Strings.Astralblast); GameRegistry.registerItem(K48, Strings.Astralblast);
		K49m = EnumHelper.addToolMaterial(Strings.Darkerthandark, 3, -1, 6.0F, 8, 30); K49 = new ItemDarkerThanDark(IDs.K49, K49m).setFull3D().setUnlocalizedName(Strings.Darkerthandark); GameRegistry.registerItem(K49, Strings.Darkerthandark);
		K50m = EnumHelper.addToolMaterial(Strings.Lunareclipse, 3, -1, 6.0F, 6, 30); K50 = new ItemLunarEclipse(IDs.K50, K50m).setFull3D().setUnlocalizedName(Strings.Lunareclipse); GameRegistry.registerItem(K50, Strings.Lunareclipse);
		K51m = EnumHelper.addToolMaterial(Strings.Silentdirge, 3, -1, 6.0F, 7, 30); K51 = new ItemSilentDirge(IDs.K51, K51m).setFull3D().setUnlocalizedName(Strings.Silentdirge); GameRegistry.registerItem(K51, Strings.Silentdirge);
		K52m = EnumHelper.addToolMaterial(Strings.Totaleclipse, 3, -1, 6.0F, 9, 30); K52 = new ItemTotalEclipse(IDs.K52, K52m).setFull3D().setUnlocalizedName(Strings.Totaleclipse);
		K53m = EnumHelper.addToolMaterial(Strings.Glimpseofdarkness, 3, -1, 6.0F, 6, 30); K53 = new ItemGlimpseOfDarkness(IDs.K53, K53m).setFull3D().setUnlocalizedName(Strings.Glimpseofdarkness);
		K54m = EnumHelper.addToolMaterial(Strings.Midnightroar, 3, -1, 6.0F, 6, 30); K54 = new ItemMidnightRoar(IDs.K54, K54m).setFull3D().setUnlocalizedName(Strings.Midnightroar);
		K55m = EnumHelper.addToolMaterial(Strings.Rejectionoffate, 3, -1, 6.0F, 8, 30); K55 = new ItemRejectionOfFate(IDs.K55, K55m).setFull3D().setUnlocalizedName(Strings.Rejectionoffate);
		K56m = EnumHelper.addToolMaterial(Strings.Truelightsflight, 3, -1, 6.0F, 8, 30); K56 = new ItemTrueLightsFlight(IDs.K56, K56m).setFull3D().setUnlocalizedName(Strings.Truelightsflight);
		K57m = EnumHelper.addToolMaterial(Strings.Leviathan, 3, -1, 6.0F, 9, 30); K57 = new ItemLeviathan(IDs.K57, K57m).setFull3D().setUnlocalizedName(Strings.Leviathan);
		K58m = EnumHelper.addToolMaterial(Strings.Abyssaltide, 3, -1, 6.0F, 7, 30); K58 = new ItemAbyssalTide(IDs.K58, K58m).setFull3D().setUnlocalizedName(Strings.Abyssaltide);
		K59m = EnumHelper.addToolMaterial(Strings.Crownofguilt, 3, -1, 6.0F, 9, 30); K59 = new ItemCrownOfGuilt(IDs.K59, K59m).setFull3D().setUnlocalizedName(Strings.Crownofguilt);
		K60m = EnumHelper.addToolMaterial(Strings.Signofinnocence, 3, -1, 6.0F, 6, 30); K60 = new ItemSignOfInnocence(IDs.K60, K60m).setFull3D().setUnlocalizedName(Strings.Signofinnocence);
		K61m = EnumHelper.addToolMaterial(Strings.Painofsolitude, 3, -1, 6.0F, 5, 30); K61 = new ItemPainOfSolitude(IDs.K61, K61m).setFull3D().setUnlocalizedName(Strings.Painofsolitude);
		K62m = EnumHelper.addToolMaterial(Strings.Abbadonplasma, 3, -1, 6.0F, 7, 30); K62 = new ItemAbaddonplasma(IDs.K62, K62m).setFull3D().setUnlocalizedName(Strings.Abbadonplasma);
		K63m = EnumHelper.addToolMaterial(Strings.Ominousblight, 3, -1, 6.0F, 10, 30); K63 = new ItemOminousBlight(IDs.K63, K63m).setFull3D().setUnlocalizedName(Strings.Ominousblight);
		K64m = EnumHelper.addToolMaterial(Strings.Missingache, 3, -1, 6.0F, 8, 30); K64 = new ItemMissingAche(IDs.K64, K64m).setFull3D().setUnlocalizedName(Strings.Missingache);
		K65m = EnumHelper.addToolMaterial(Strings.Winnersproof, 3, -1, 6.0F, 12, 30); K65 = new ItemWinnersProof(IDs.K65, K65m).setFull3D().setUnlocalizedName(Strings.Winnersproof);
		K66m = EnumHelper.addToolMaterial(Strings.Fatalcrest, 3, -1, 6.0F, 10, 30); K66 = new ItemFatalCrest(IDs.K66, K66m).setFull3D().setUnlocalizedName(Strings.Fatalcrest);
		K67m = EnumHelper.addToolMaterial(Strings.Twobecomesone, 3, -1, 6.0F, 10, 30); K67 = new ItemTwoBecomeOne(IDs.K67, K67m).setFull3D().setUnlocalizedName(Strings.Twobecomesone);
		K68m = EnumHelper.addToolMaterial(Strings.Bondofflame, 3, -1, 6.0F, 9, 30); K68 = new ItemBondOfFlame(IDs.K68, K68m).setFull3D().setUnlocalizedName(Strings.Bondofflame);
		K69m = EnumHelper.addToolMaterial(Strings.Fenrir, 3, -1, 6.0F, 7, 30); K69 = new ItemFenrir(IDs.K69, K69m).setFull3D().setUnlocalizedName(Strings.Fenrir);
		K70m = EnumHelper.addToolMaterial(Strings.Sleepinglion, 3, -1, 6.0F, 7, 30); K70 = new ItemSleepingLion(IDs.K70, K70m).setFull3D().setUnlocalizedName(Strings.Sleepinglion);
		K71m = EnumHelper.addToolMaterial(Strings.Guardiansoul, 3, -1, 6.0F, 8, 30); K71 = new ItemGuardianSoul(IDs.K71, K71m).setFull3D().setUnlocalizedName(Strings.Guardiansoul);
		K72m = EnumHelper.addToolMaterial(Strings.Gullwing, 3, -1, 6.0F, 5, 30); K72 = new ItemGullWing(IDs.K72, K72m).setFull3D().setUnlocalizedName(Strings.Gullwing);
		K73m = EnumHelper.addToolMaterial(Strings.Photondebugger, 3, -1, 6.0F, 6, 30); K73 = new ItemPhotonDebugger(IDs.K73, K73m).setFull3D().setUnlocalizedName(Strings.Photondebugger);
		K74m = EnumHelper.addToolMaterial(Strings.Sweetmemories, 3, -1, 6.0F, 7, 30); K74 = new ItemSweetMemories(IDs.K74, K74m).setFull3D().setUnlocalizedName(Strings.Sweetmemories);
		K75m = EnumHelper.addToolMaterial(Strings.Circleoflife, 3, -1, 6.0F, 9, 30); K75 = new ItemCircleOfLife(IDs.K75, K75m).setFull3D().setUnlocalizedName(Strings.Circleoflife);
		K76m = EnumHelper.addToolMaterial(Strings.Decisivepumpkin, 3, -1, 6.0F, 9, 30); K76 = new ItemDecisivePumpkin(IDs.K76, K76m).setFull3D().setUnlocalizedName(Strings.Decisivepumpkin);
		K77m = EnumHelper.addToolMaterial(Strings.Wishinglamp, 3, -1, 6.0F, 7, 30); K77 = new ItemWishingLamp(IDs.K77, K77m).setFull3D().setUnlocalizedName(Strings.Wishinglamp);
		K78m = EnumHelper.addToolMaterial(Strings.Followthewind, 3, -1, 6.0F, 8, 30); K78 = new ItemFollowTheWind(IDs.K78, K78m).setFull3D().setUnlocalizedName(Strings.Followthewind);
		K79m = EnumHelper.addToolMaterial(Strings.Mysteriousabyss, 3, -1, 6.0F, 6, 30); K79 = new ItemMysteriousAbyss(IDs.K79, K79m).setFull3D().setUnlocalizedName(Strings.Mysteriousabyss);
		K80m = EnumHelper.addToolMaterial(Strings.Monochrome, 3, -1, 6.0F, 6, 30); K80 = new ItemMonochrome(IDs.K80, K80m).setFull3D().setUnlocalizedName(Strings.Monochrome);
		K81m = EnumHelper.addToolMaterial(Strings.Heroscrest, 3, -1, 6.0F, 6, 30); K81 = new ItemHerosCrest(IDs.K81, K81m).setFull3D().setUnlocalizedName(Strings.Heroscrest);
		K82m = EnumHelper.addToolMaterial(Strings.Rumblingrose, 3, -1, 6.0F, 7, 30); K82 = new ItemRumblingRose(IDs.K82, K82m).setFull3D().setUnlocalizedName(Strings.Rumblingrose);
		K83m = EnumHelper.addToolMaterial(Strings.Hiddendragon, 3, -1, 6.0F, 7, 30); K83 = new ItemHiddenDragon(IDs.K83, K83m).setFull3D().setUnlocalizedName(Strings.Hiddendragon);
		K84m = EnumHelper.addToolMaterial(Strings.Endsofearth, 3, -1, 6.0F, 9, 30); K84 = new ItemEndsOfEarth(IDs.K84, K84m).setFull3D().setUnlocalizedName(Strings.Endsofearth);
		K85m = EnumHelper.addToolMaterial(Strings.Stormfall, 3, -1, 6.0F, 8, 30); K85 = new ItemStormFall(IDs.K85, K85m).setFull3D().setUnlocalizedName(Strings.Stormfall);
		K86m = EnumHelper.addToolMaterial(Strings.Destinysembrace, 3, -1, 6.0F, 7, 30); K86 = new ItemDestinysEmbrace(IDs.K86, K86m).setFull3D().setUnlocalizedName(Strings.Destinysembrace);
		K87m = EnumHelper.addToolMaterial(Strings.Waytodawn, 3, -1, 6.0F, 9, 30); K87 = new ItemWayToDawn(IDs.K87, K87m).setFull3D().setUnlocalizedName(Strings.Waytodawn);
		K88m = EnumHelper.addToolMaterial(Strings.Onewingedangel, 3, -1, 6.0F, 15, 30); K88 = new ItemOneWingedAngel(IDs.K88, K88m).setFull3D().setUnlocalizedName(Strings.Onewingedangel);
		K89m = EnumHelper.addToolMaterial(Strings.Diamonddust, 3, -1, 6.0F, 10, 30); K89 = new ItemDiamondDust(IDs.K89, K89m).setFull3D().setUnlocalizedName(Strings.Diamonddust);
		K90m = EnumHelper.addToolMaterial(Strings.Lionheart, 3, -1, 6.0F, 7, 30); K90 = new ItemLionHeart(IDs.K90, K90m).setFull3D().setUnlocalizedName(Strings.Lionheart);
		K91m = EnumHelper.addToolMaterial(Strings.Metalchocobo, 3, -1, 6.0F, 7, 30); K91 = new ItemMetalChocobo(IDs.K91, K91m).setFull3D().setUnlocalizedName(Strings.Metalchocobo);
		K92m = EnumHelper.addToolMaterial(Strings.Spellbinder, 3, -1, 6.0F, 6, 30); K92 = new ItemSpellbinder(IDs.K92, K92m).setFull3D().setUnlocalizedName(Strings.Spellbinder);
		K93m = EnumHelper.addToolMaterial(Strings.Divinerose, 3, -1, 6.0F, 6, 30); K93 = new ItemDivineRose(IDs.K93, K93m).setFull3D().setUnlocalizedName(Strings.Divinerose);
		K94m = EnumHelper.addToolMaterial(Strings.Fairyharp, 3, -1, 6.0F, 7, 30); K94 = new ItemFairyHarp(IDs.K94, K94m).setFull3D().setUnlocalizedName(Strings.Fairyharp);
		K95m = EnumHelper.addToolMaterial(Strings.Crabclaw, 3, -1, 6.0F, 5, 30); K95 = new ItemCrabClaw(IDs.K95, K95m).setFull3D().setUnlocalizedName(Strings.Crabclaw);
		K96m = EnumHelper.addToolMaterial(Strings.Wishingstar, 3, -1, 6.0F, 9, 30); K96 = new ItemWishingStar(IDs.K96, K96m).setFull3D().setUnlocalizedName(Strings.Wishingstar);
		K97m = EnumHelper.addToolMaterial(Strings.Pumpkinhead, 3, -1, 6.0F, 10, 30); K97 = new ItemPumpkinHead(IDs.K97, K97m).setFull3D().setUnlocalizedName(Strings.Pumpkinhead);
		K98m = EnumHelper.addToolMaterial(Strings.Threewishes, 3, -1, 6.0F, 8, 30); K98 = new ItemThreeWishes(IDs.K98, K98m).setFull3D().setUnlocalizedName(Strings.Threewishes);
		K99m = EnumHelper.addToolMaterial(Strings.Jungleking, 3, -1, 6.0F, 7, 30); K99 = new ItemJungleKing(IDs.K99, K99m).setFull3D().setUnlocalizedName(Strings.Jungleking);
		K100m = EnumHelper.addToolMaterial(Strings.Olympia, 3, -1, 6.0F, 9, 30); K100 = new ItemOlympia(IDs.K100, K100m).setFull3D().setUnlocalizedName(Strings.Olympia);
		K101m = EnumHelper.addToolMaterial(Strings.Ladyluck, 3, -1, 6.0F, 6, 30); K101 = new ItemLadyLuck(IDs.K101, K101m).setFull3D().setUnlocalizedName(Strings.Ladyluck);
		K102m = EnumHelper.addToolMaterial(Strings.Peopleshearts, 3, -1, 6.0F, 13, 30); K102 = new ItemKeybladeOfPeoplesHearts(IDs.K102, K102m).setFull3D().setUnlocalizedName(Strings.Peopleshearts);  
		K103m = EnumHelper.addToolMaterial(Strings.Ultimaweapon, 3, -1, 6.0F, 18, 30); K103 = new ItemUltimaWeapon(IDs.K103, K103m).setFull3D().setUnlocalizedName(Strings.Ultimaweapon);
		K104m = EnumHelper.addToolMaterial(Strings.Treasuretrove, 3, -1, 6.0F, 7, 30); K104 = new ItemTreasureTrove(IDs.K104, K104m).setFull3D().setUnlocalizedName(Strings.Treasuretrove);
		K105m = EnumHelper.addToolMaterial(Strings.Starseeker, 3, -1, 6.0F, 12, 30); K105 = new ItemStarseeker(IDs.K105, K105m).setFull3D().setUnlocalizedName(Strings.Starseeker);
		K111m = EnumHelper.addToolMaterial(Strings.KingdomKey, 3, -1, 6.0F, 5, 30); K111 = new ItemKingdomKey(IDs.K111, K111m).setFull3D().setUnlocalizedName(Strings.KingdomKey);
		K113m = EnumHelper.addToolMaterial(Strings.KingdomKeyD, 3, -1, 6.0F, 5, 30); K113 = new ItemKingdomKeyD(IDs.K113, K113m).setFull3D().setUnlocalizedName(Strings.KingdomKeyD); 
		K112m = EnumHelper.addToolMaterial(Strings.Oathkeeper, 3, -1, 6.0F, 11, 30); K112 = new ItemOathKeeper(IDs.K112, K112m).setFull3D().setUnlocalizedName(Strings.Oathkeeper);
		K114m = EnumHelper.addToolMaterial(Strings.Oblivion, 3, -1, 6.0F, 13, 30); K114 = new ItemOblivion(IDs.K114, K114m).setFull3D().setUnlocalizedName(Strings.Oblivion);
		K110m = EnumHelper.addToolMaterial(Strings.Waywardwind, 3, -1, 6.0F, 8, 30); K110 = new ItemWaywardWind(IDs.K110, K110m).setFull3D().setUnlocalizedName(Strings.Waywardwind);
		K109m = EnumHelper.addToolMaterial(Strings.Earthshaker, 3, -1, 6.0F, 10, 30); K109 = new ItemEarthShaker(IDs.K109, K109m).setFull3D().setUnlocalizedName(Strings.Earthshaker);
		K108m = EnumHelper.addToolMaterial(Strings.Rainfell, 3, -1, 6.0F, 6, 30); K108 = new ItemRainFell(IDs.K108, K108m).setFull3D().setUnlocalizedName(Strings.Rainfell);
		K107m = EnumHelper.addToolMaterial(Strings.Starlight, 3, -1, 6.0F, 6, 30); K107 = new ItemStarLight(IDs.K107, K107m).setFull3D().setUnlocalizedName(Strings.Starlight);
		K106m = EnumHelper.addToolMaterial(Strings.Souleater, 3, -1, 6.0F, 12, 30); K106 = new ItemSoulEater(IDs.K106, K106m).setFull3D().setUnlocalizedName(Strings.Souleater);
		K1c = new ItemVulpeusChain(IDs.K1c).setUnlocalizedName(Strings.VulpeusChain).setCreativeTab(KingdomKeys.KHCHITAB).setMaxStackSize(chainStackSize);
		K2c = new ItemUrsusChain(IDs.K2c).setUnlocalizedName(Strings.UrsusChain).setCreativeTab(KingdomKeys.KHCHITAB).setMaxStackSize(chainStackSize);
		K3c = new ItemUnicornisChain(IDs.K3c).setUnlocalizedName(Strings.UnicornisChain).setCreativeTab(KingdomKeys.KHCHITAB).setMaxStackSize(chainStackSize);
		K4c = new ItemLeopardosChain(IDs.K4c).setUnlocalizedName(Strings.LeopardosChain).setCreativeTab(KingdomKeys.KHCHITAB).setMaxStackSize(chainStackSize);
		K5c = new ItemAnguisChain(IDs.K5c).setUnlocalizedName(Strings.AnguisChain).setCreativeTab(KingdomKeys.KHCHITAB).setMaxStackSize(chainStackSize);
		K6c = new ItemLeasKeybladeChain(IDs.K6c).setUnlocalizedName(Strings.LeaskeybladeChain).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize);
		K7c = new ItemYoungXehanortChain(IDs.K7c).setUnlocalizedName(Strings.YoungxehanortskeybladeChain).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize);
		K8c = new ItemOceanRageChain(IDs.K8c).setUnlocalizedName(Strings.OceanrageChain).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize);
		K9c = new ItemEndOfPainChain(IDs.K9c).setUnlocalizedName(Strings.EndofpainChain).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize);
		K10c = new ItemUnboundChain(IDs.K10c).setUnlocalizedName(Strings.UnboundChain).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize);
		K11c = new ItemSweetDreamsChain(IDs.K11c).setUnlocalizedName(Strings.SweetdreamsChain).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize);
		K12c = new ItemDiveWingChain(IDs.K12c).setUnlocalizedName(Strings.DivewingChain).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize);
		K13c = new ItemCounterPointChain(IDs.K13c).setUnlocalizedName(Strings.CounterpointChain).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize);
		K14c = new ItemAllForOneChain(IDs.K14c).setUnlocalizedName(Strings.AllforoneChain).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize);
		K15c = new ItemKnockoutPunchChain(IDs.K15c).setUnlocalizedName(Strings.KnockoutpunchChain).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize);
		K16c = new ItemFerrisGearChain(IDs.K16c).setUnlocalizedName(Strings.FerrisgearChain).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize);
		K17c = new ItemDualDiscChain(IDs.K17c).setUnlocalizedName(Strings.DualdiscChain).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize);
		K18c = new ItemGuardianBellChain(IDs.K18c).setUnlocalizedName(Strings.GuardianbellChain).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize);
		K19c = new ItemSkullNoiseChain(IDs.K19c).setUnlocalizedName(Strings.SkullnoiseChain).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize);
		K20c = new ItemWoodenKeybladeChain(IDs.K20c).setUnlocalizedName(Strings.WoodenkeybladeChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize);
		K21c = new ItemKyeBladeBrokenChain(IDs.K21c).setUnlocalizedName(Strings.KyebladebrokenChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize);
		K22c = new ItemKyeBladeChain(IDs.K22c).setUnlocalizedName(Strings.KyebladeChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize);
		K23c = new ItemLightSeekerChain(IDs.K23c).setUnlocalizedName(Strings.LightseekerChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize);
		K24c = new ItemLostMemoryChain(IDs.K24c).setUnlocalizedName(Strings.LostmemoryChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize);
		K25c = new ItemFrolicFlameChain(IDs.K25c).setUnlocalizedName(Strings.FrolicflameChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize);
		K26c = new ItemMasterKeeperChain(IDs.K26c).setUnlocalizedName(Strings.MasterkeeperChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize);
		K27c = new ItemBrightCrestChain(IDs.K27c).setUnlocalizedName(Strings.BrigthcrestChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize);
		K28c = new ItemCrownUnlimitChain(IDs.K28c).setUnlocalizedName(Strings.CrownunlimitChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize);
		K29c = new ItemNoNameChain(IDs.K29c).setUnlocalizedName(Strings.NonameChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize);
		K30c = new ItemVoidGearChain(IDs.K30c).setUnlocalizedName(Strings.VoidgearChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize);
		K31c = new ItemSweetStackChain(IDs.K31c).setUnlocalizedName(Strings.SweetstackChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize);
		K32c = new ItemPixiePetalChain(IDs.K32c).setUnlocalizedName(Strings.PixiepetalChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize);
		K33c = new ItemHyperDriveChain(IDs.K33c).setUnlocalizedName(Strings.HyperdriveChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize);
		K34c = new ItemMarkOfAHeroChain(IDs.K34c).setUnlocalizedName(Strings.MarkofaheroChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize);
		K35c = new ItemVictoryLineChain(IDs.K35c).setUnlocalizedName(Strings.VictorylineChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize);
		K36c = new ItemFairyStarsChain(IDs.K36c).setUnlocalizedName(Strings.FairystarsChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize);
		K37c = new ItemStrokeOfMidnightChain(IDs.K37c).setUnlocalizedName(Strings.StrokeofmidnightChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize);
		K38c = new ItemChaosRipperChain(IDs.K38c).setUnlocalizedName(Strings.ChaosripperChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize);
		K39c = new ItemXehanortsKeybladeChain(IDs.K39c).setUnlocalizedName(Strings.XehanortskeybladeChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize);
		K40c = new ItemDarkGnawChain(IDs.K40c).setUnlocalizedName(Strings.DarkgnawChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize);
		K41c = new ItemZeroOneChain(IDs.K41c).setUnlocalizedName(Strings.ZerooneChain).setCreativeTab(KingdomKeys.KHRECODEDTAB).setMaxStackSize(chainStackSize);
		K42c = new ItemDreamSwordChain(IDs.K42c).setUnlocalizedName(Strings.DreamswordChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize);
		K43c = new ItemAubadeChain(IDs.K43c).setUnlocalizedName(Strings.AubadeChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize);
		K44c = new ItemUmbrellaChain(IDs.K44c).setUnlocalizedName(Strings.UmbrellaChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize);
		K45c = new ItemOmegaWeaponChain(IDs.K45c).setUnlocalizedName(Strings.OmegaweaponChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize);
		K46c = new ItemTwilightBlazeChain(IDs.K46c).setUnlocalizedName(Strings.TwilightblazeChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize);
		K47c = new ItemMaverickFlareChain(IDs.K47c).setUnlocalizedName(Strings.MaverickflareChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize);
		K48c = new ItemAstralBlastChain(IDs.K48c).setUnlocalizedName(Strings.AstralblastChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize);
		K49c = new ItemDarkerThanDarkChain(IDs.K49c).setUnlocalizedName(Strings.DarkerthandarkChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize);
		K50c = new ItemLunarEclipseChain(IDs.K50c).setUnlocalizedName(Strings.LunareclipseChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize);
		K51c = new ItemSilentDirgeChain(IDs.K51c).setUnlocalizedName(Strings.SilentdirgeChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize);
		K52c = new ItemTotalEclipseChain(IDs.K52c).setUnlocalizedName(Strings.TotaleclipseChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize);
		K53c = new ItemGlimpseOfDarknessChain(IDs.K53c).setUnlocalizedName(Strings.GlimpseofdarknessChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize);
		K54c = new ItemMidnightRoarChain(IDs.K54c).setUnlocalizedName(Strings.MidnightroarChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize);
		K55c = new ItemRejectionOfFateChain(IDs.K55c).setUnlocalizedName(Strings.RejectionoffateChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize);
		K56c = new ItemTrueLightsFlightChain(IDs.K56c).setUnlocalizedName(Strings.TruelightsflightChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize);
		K57c = new ItemLeviathanChain(IDs.K57c).setUnlocalizedName(Strings.LeviathanChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize);
		K58c = new ItemAbyssalTideChain(IDs.K58c).setUnlocalizedName(Strings.AbyssaltideChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize);
		K59c = new ItemCrownOfGuiltChain(IDs.K59c).setUnlocalizedName(Strings.CrownofguiltChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize);
		K60c = new ItemSignOfInnocenceChain(IDs.K60c).setUnlocalizedName(Strings.SignofinnocenceChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize);
		K61c = new ItemPainOfSolitudeChain(IDs.K61c).setUnlocalizedName(Strings.PainofsolitudeChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize);
		K62c = new ItemAbaddonPlasmaChain(IDs.K62c).setUnlocalizedName(Strings.AbbadonplasmaChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize);
		K63c = new ItemOminousBlightChain(IDs.K63c).setUnlocalizedName(Strings.OminousblightChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize);
		K64c = new ItemMissingAcheChain(IDs.K64c).setUnlocalizedName(Strings.MissingacheChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize);
		K65c = new ItemWinnersProofChain(IDs.K65c).setUnlocalizedName(Strings.WinnersproofChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize);
		K66c = new ItemFatalCrestChain(IDs.K66c).setUnlocalizedName(Strings.FatalcrestChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize);
		K67c = new ItemTwoBecomeOneChain(IDs.K67c).setUnlocalizedName(Strings.TwobecomesoneChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize);
		K68c = new ItemBondOfFlameChain(IDs.K68c).setUnlocalizedName(Strings.BondofflameChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize);
		K69c = new ItemFenrirChain(IDs.K69c).setUnlocalizedName(Strings.FenrirChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize);
		K70c = new ItemSleepingLionChain(IDs.K70c).setUnlocalizedName(Strings.SleepinglionChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize);
		K71c = new ItemGuardianSoulChain(IDs.K71c).setUnlocalizedName(Strings.GuardiansoulChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize);
		K72c = new ItemGullWingChain(IDs.K72c).setUnlocalizedName(Strings.GullwingChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize);
		K73c = new ItemPhotonDebuggerChain(IDs.K73c).setUnlocalizedName(Strings.PhotondebuggerChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize);
		K74c = new ItemSweetMemoriesChain(IDs.K74c).setUnlocalizedName(Strings.SweetmemoriesChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize);
		K75c = new ItemCircleOfLifeChain(IDs.K75c).setUnlocalizedName(Strings.CircleoflifeChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize);
		K76c = new ItemDecisivePumpkinChain(IDs.K76c).setUnlocalizedName(Strings.DecisivepumpkinChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize);
		K77c = new ItemWishingLampChain(IDs.K77c).setUnlocalizedName(Strings.WishinglampChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize);
		K78c = new ItemFollowTheWindChain(IDs.K78c).setUnlocalizedName(Strings.FollowthewindChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize);
		K79c = new ItemMysteriousAbyssChain(IDs.K79c).setUnlocalizedName(Strings.MysteriousabyssChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize);
		K80c = new ItemMonochromeChain(IDs.K80c).setUnlocalizedName(Strings.MonochromeChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize);
		K81c = new ItemHerosCrestChain(IDs.K81c).setUnlocalizedName(Strings.HeroscrestChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize);
		K82c = new ItemRumblingRoseChain(IDs.K82c).setUnlocalizedName(Strings.RumblingroseChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize);
		K83c = new ItemHiddenDragonChain(IDs.K83c).setUnlocalizedName(Strings.HiddendragonChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize);
		K84c = new ItemEndsOfEarthChain(IDs.K84c).setUnlocalizedName(Strings.EndsofearthChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize);
		K85c = new ItemStormFallChain(IDs.K85c).setUnlocalizedName(Strings.StormfallChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize);
		K86c = new ItemDestinysEmbraceChain(IDs.K86c).setUnlocalizedName(Strings.DestinysembraceChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize);
		K87c = new ItemWayToTheDawnChain(IDs.K87c).setUnlocalizedName(Strings.WaytodawnChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize);
		K88c = new ItemOneWingedAngelChain(IDs.K88c).setUnlocalizedName(Strings.OnewingedangelChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize);
		K89c = new ItemDiamondDustChain(IDs.K89c).setUnlocalizedName(Strings.DiamonddustChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize);
		K90c = new ItemLionHeartChain(IDs.K90c).setUnlocalizedName(Strings.LionheartChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize);
		K91c = new ItemMetalChocoboChain(IDs.K91c).setUnlocalizedName(Strings.MetalchocoboChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize);
		K92c = new ItemSpellBinderChain(IDs.K92c).setUnlocalizedName(Strings.SpellbinderChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize);
		K93c = new ItemDivineRoseChain(IDs.K93c).setUnlocalizedName(Strings.DivineroseChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize);
		K94c = new ItemFairyHarpChain(IDs.K94c).setUnlocalizedName(Strings.FairyharpChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize);
		K95c = new ItemCrabClawChain(IDs.K95c).setUnlocalizedName(Strings.CrabclawChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize);
		K96c = new ItemWishingStarChain(IDs.K96c).setUnlocalizedName(Strings.WishingstarChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize);
		K97c = new ItemPumpkinHeadChain(IDs.K97c).setUnlocalizedName(Strings.PumpkinheadChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize);
		K98c = new ItemThreeWishesChain(IDs.K98c).setUnlocalizedName(Strings.ThreewishesChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize);
		K99c = new ItemJunglekingChain(IDs.K99c).setUnlocalizedName(Strings.JunglekingChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize);
		K100c = new ItemOlympiaChain(IDs.K100c).setUnlocalizedName(Strings.OlympiaChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize);
		K101c = new ItemLadyLuckChain(IDs.K101c).setUnlocalizedName(Strings.LadyluckChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize);
		K102c = new ItemPeoplesHeartsChain(IDs.K102c).setUnlocalizedName(Strings.PeoplesheartsChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize);
		K103c = new ItemUltimaWeaponChain(IDs.K103c).setUnlocalizedName(Strings.UltimaweaponChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize);
		K104c = new ItemTreasureTroveChain(IDs.K104c).setUnlocalizedName(Strings.TreasuretroveChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize);
		K105c = new ItemStarSeekerChain(IDs.K105c).setUnlocalizedName(Strings.StarseekerChain).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize);
		K106c = new ItemSoulEaterChain(IDs.K106c).setUnlocalizedName(Strings.SouleaterChain).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize);
		K107c = new ItemStarlightChain(IDs.K107c).setUnlocalizedName(Strings.StarlightChain).setCreativeTab(KingdomKeys.KHCHITAB).setMaxStackSize(chainStackSize);
		K111c = new ItemKingdomKeyChain(IDs.K111c).setUnlocalizedName(Strings.KingdomKeyChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize);
		K113c = new ItemKingdomKeyDChain(IDs.K113c).setUnlocalizedName(Strings.KingdomKeyDChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize);
		K112c = new ItemOathkeeperChain(IDs.K112c).setUnlocalizedName(Strings.OathkeeperChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize);
		K114c = new ItemOblivionChain(IDs.K114c).setUnlocalizedName(Strings.OblivionChain).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize);
		K110c = new ItemWaywardWindChain(IDs.K110c).setUnlocalizedName(Strings.WaywardwindChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize);
		K109c = new ItemEarthShakerChain(IDs.K109c).setUnlocalizedName(Strings.EarthshakerChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize);
		K108c = new ItemRainFellChain(IDs.K108c).setUnlocalizedName(Strings.RainfellChain).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize);
		//Pouch = new ItemPouch(IDs.Pouch).setUnlocalizedName(Strings.Pouch).setCreativeTab(KingdomKeys.KKTAB);
		
		//Org XIII Weapons
		EternalFlamesMaterial = EnumHelper.addToolMaterial(Strings.EternalFlames, 3, -1, 6.0F, 17, 30); EternalFlames = new ItemEternalFlames(IDs.EternalFlames, EternalFlamesMaterial).setFull3D().setUnlocalizedName(Strings.EternalFlames); GameRegistry.registerItem(EternalFlames, Strings.EternalFlames);
		BookOfRetributionMaterial = EnumHelper.addToolMaterial(Strings.BookOfRetribution, 3, -1, 6.0F, 17, 30); BookOfRetribution = new ItemBookOfRetribution(IDs.BookofRetribution, BookOfRetributionMaterial).setFull3D().setUnlocalizedName(Strings.BookOfRetribution); GameRegistry.registerItem(BookOfRetribution, Strings.BookOfRetribution);
		InterdictionMaterial = EnumHelper.addToolMaterial(Strings.Interdiction, 3, -1, 6.0F, 17, 30); Interdiction = new ItemInterdiction(IDs.Interdiction, InterdictionMaterial).setFull3D().setUnlocalizedName(Strings.Interdiction); GameRegistry.registerItem(Interdiction, Strings.Interdiction);
		SharpShooterMaterial = EnumHelper.addToolMaterial(Strings.SharpShooter, 3, -1, 6.0F, 17, 30); SharpShooter = new ItemSharpShooter(IDs.Sharpshooter, SharpShooterMaterial).setFull3D().setUnlocalizedName(Strings.SharpShooter); GameRegistry.registerItem(SharpShooter, Strings.SharpShooter);
		LindWormMaterial = EnumHelper.addToolMaterial(Strings.LindWorm, 3, -1, 6.0F, 17, 30); LindWorm = new ItemLindWorm(IDs.Lindworm, LindWormMaterial).setFull3D().setUnlocalizedName(Strings.LindWorm); GameRegistry.registerItem(LindWorm, Strings.LindWorm);
		FrozenPrideMaterial = EnumHelper.addToolMaterial(Strings.FrozenPride, 3, -1, 6.0F, 17, 30); FrozenPride = new ItemFrozenPride(IDs.Frozenpride, FrozenPrideMaterial).setFull3D().setUnlocalizedName(Strings.FrozenPride); GameRegistry.registerItem(FrozenPride, Strings.FrozenPride);
		SkySplitterMaterial = EnumHelper.addToolMaterial(Strings.Skysplitter, 3, -1, 6.0F, 17, 30); SkySplitter = new ItemSkySplitter(IDs.Skysplitter, SkySplitterMaterial).setFull3D().setUnlocalizedName(Strings.Skysplitter); GameRegistry.registerItem(SkySplitter, Strings.Skysplitter);
		LunaticMaterial = EnumHelper.addToolMaterial(Strings.Lunatic, 3, -1, 6.0F, 17, 30); Lunatic = new ItemLunatic(IDs.Lunatic, LunaticMaterial).setFull3D().setUnlocalizedName(Strings.Lunatic); GameRegistry.registerItem(Lunatic, Strings.Lunatic);
		AppregioMaterial = EnumHelper.addToolMaterial(Strings.Appregio, 3, -1, 6.0F, 17, 30); Appregio = new ItemLindWorm(IDs.Appregio, AppregioMaterial).setFull3D().setUnlocalizedName(Strings.Appregio); GameRegistry.registerItem(Appregio, Strings.Appregio);
		FairGameMaterial = EnumHelper.addToolMaterial(Strings.FairGame, 3, -1, 6.0F, 17, 30); FairGame = new ItemLindWorm(IDs.Fairgame, FairGameMaterial).setFull3D().setUnlocalizedName(Strings.FairGame); GameRegistry.registerItem(FairGame, Strings.FairGame);
		GracefulDahliaMaterial = EnumHelper.addToolMaterial(Strings.GracefulDahlia, 3, -1, 6.0F, 17, 30); GracefulDahlia = new ItemLindWorm(IDs.GracefulDahlia, GracefulDahliaMaterial).setFull3D().setUnlocalizedName(Strings.GracefulDahlia); GameRegistry.registerItem(GracefulDahlia, Strings.GracefulDahlia);
		FoudreMaterial = EnumHelper.addToolMaterial(Strings.Foudre, 3, -1, 6.0F, 17, 30); Foudre = new ItemFoudre(IDs.Foudre, FoudreMaterial).setFull3D().setUnlocalizedName(Strings.Foudre); GameRegistry.registerItem(Foudre, Strings.Foudre);
	}
	
	public static void initBooks(){
		K1r = new ItemVulpeusRecipe(IDs.K1r).setUnlocalizedName(Strings.VulpeusRecipe).setCreativeTab(KingdomKeys.KHCHITAB).setMaxStackSize(chainStackSize);
		K2r = new ItemUrsusRecipe(IDs.K2r).setUnlocalizedName(Strings.UrsusRecipe).setCreativeTab(KingdomKeys.KHCHITAB).setMaxStackSize(chainStackSize);
		K3r = new ItemUnicornisRecipe(IDs.K3r).setUnlocalizedName(Strings.UnicornisRecipe).setCreativeTab(KingdomKeys.KHCHITAB).setMaxStackSize(chainStackSize);
		K4r = new ItemLeopardosRecipe(IDs.K4r).setUnlocalizedName(Strings.LeopardosRecipe).setCreativeTab(KingdomKeys.KHCHITAB).setMaxStackSize(chainStackSize);
		K5r = new ItemAnguisRecipe(IDs.K5r).setUnlocalizedName(Strings.AnguisRecipe).setCreativeTab(KingdomKeys.KHCHITAB).setMaxStackSize(chainStackSize);
		K6r = new ItemLeasKeybladeRecipe(IDs.K6r).setUnlocalizedName(Strings.LeaskeybladeRecipe).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize);
		K7r = new ItemYoungXehanortsRecipe(IDs.K7r).setUnlocalizedName(Strings.YoungxehanortskeybladeRecipe).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize);
		K8r = new ItemOceanRageRecipe(IDs.K8r).setUnlocalizedName(Strings.OceanrageRecipe).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize);
		K9r = new ItemEndofpainRecipe(IDs.K9r).setUnlocalizedName(Strings.EndofpainRecipe).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize);
		K10r = new ItemUnboundRecipe(IDs.K10r).setUnlocalizedName(Strings.UnboundRecipe).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize);
		K11r = new ItemSweetDreamsRecipe(IDs.K11r).setUnlocalizedName(Strings.SweetdreamsRecipe).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize);
		K12r = new ItemDivewingRecipe(IDs.K12r).setUnlocalizedName(Strings.DivewingRecipe).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize);
		K13r = new ItemCounterpointRecipe(IDs.K13r).setUnlocalizedName(Strings.CounterpointRecipe).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize);
		K14r = new ItemAllForOneRecipe(IDs.K14r).setUnlocalizedName(Strings.AllforoneRecipe).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize);
		K15r = new ItemKnockoutPunchRecipe(IDs.K15r).setUnlocalizedName(Strings.KnockoutpunchRecipe).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize);
		K16r = new ItemFerrisgearRecipe(IDs.K16r).setUnlocalizedName(Strings.FerrisgearRecipe).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize);
		K17r = new ItemDualDiscRecipe(IDs.K17r).setUnlocalizedName(Strings.DualdiscRecipe).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize);
		K18r = new ItemGuardianBellRecipe(IDs.K18r).setUnlocalizedName(Strings.GuardianbellRecipe).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize);
		K19r = new ItemSkullNoiseRecipe(IDs.K19r).setUnlocalizedName(Strings.SkullnoiseRecipe).setCreativeTab(KingdomKeys.KHDDDTAB).setMaxStackSize(chainStackSize);
		K20r = new ItemWoodenKeybladeRecipe(IDs.K20r).setUnlocalizedName(Strings.WoodenkeybladeRecipe).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize);
		K21r = new ItemIncompleteKyebladeRecipe(IDs.K21r).setUnlocalizedName(Strings.KyebladebrokenRecipe).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize);
		K22r = new ItemKyebladeRecipe(IDs.K22r).setUnlocalizedName(Strings.KyebladeRecipe).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize);
		K23r = new ItemLightSeekerRecipe(IDs.K23r).setUnlocalizedName(Strings.LightseekerRecipe).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize);
		K24r = new ItemLostMemoryRecipe(IDs.K24r).setUnlocalizedName(Strings.LostmemoryRecipe).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize);
		K25r = new ItemFrolicflameRecipe(IDs.K25r).setUnlocalizedName(Strings.FrolicflameRecipe).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize);
		K26r = new ItemMasterKeeperRecipe(IDs.K26r).setUnlocalizedName(Strings.MasterkeeperRecipe).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize);
		K27r = new ItemBrightCrestRecipe(IDs.K27r).setUnlocalizedName(Strings.BrigthcrestRecipe).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize);
		K28r = new ItemCrownUnlimitRecipe(IDs.K28r).setUnlocalizedName(Strings.CrownunlimitRecipe).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize);
		K29r = new ItemNoNameRecipe(IDs.K29r).setUnlocalizedName(Strings.NonameRecipe).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize);
		K30r = new ItemVoidGearRecipe(IDs.K30r).setUnlocalizedName(Strings.VoidgearRecipe).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize);
		K31r = new ItemSweetStackRecipe(IDs.K31r).setUnlocalizedName(Strings.SweetstackRecipe).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize);
		K32r = new ItemPixiePetalRecipe(IDs.K32r).setUnlocalizedName(Strings.PixiepetalRecipe).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize);
		K33r = new ItemHyperdriveRecipe(IDs.K33r).setUnlocalizedName(Strings.HyperdriveRecipe).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize);
		K34r = new ItemMarkOfAHeroRecipe(IDs.K34r).setUnlocalizedName(Strings.MarkofaheroRecipe).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize);
		K35r = new ItemVictoryLineRecipe(IDs.K35r).setUnlocalizedName(Strings.VictorylineRecipe).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize);
		K36r = new ItemFairyStarsRecipe(IDs.K36r).setUnlocalizedName(Strings.FairystarsRecipe).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize);
		K37r = new ItemStrokeOfMidnightRecipe(IDs.K37r).setUnlocalizedName(Strings.StrokeofmidnightRecipe).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize);
		K38r = new ItemChaosRipperRecipe(IDs.K38r).setUnlocalizedName(Strings.ChaosripperRecipe).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize);
		K39r = new ItemMasterXehanortsKeyRecipe(IDs.K39r).setUnlocalizedName(Strings.XehanortskeybladeRecipe).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize);
		K40r = new ItemDarkgnawRecipe(IDs.K40r).setUnlocalizedName(Strings.DarkgnawRecipe).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize);
		K41r = new ItemZeroOneRecipe(IDs.K41r).setUnlocalizedName(Strings.ZerooneRecipe).setCreativeTab(KingdomKeys.KHRECODEDTAB).setMaxStackSize(chainStackSize);
		K42r = new ItemDreamswordRecipe(IDs.K42r).setUnlocalizedName(Strings.DreamswordRecipe).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize);
		K43r = new ItemAubadeRecipe(IDs.K43r).setUnlocalizedName(Strings.AubadeRecipe).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize);
		K44r = new ItemUmbrellaRecipe(IDs.K44r).setUnlocalizedName(Strings.UmbrellaRecipe).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize);
		K45r = new ItemOmegaWeaponRecipe(IDs.K45r).setUnlocalizedName(Strings.OmegaweaponRecipe).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize);
		K46r = new ItemTwilightBlazeRecipe(IDs.K46r).setUnlocalizedName(Strings.TwilightblazeRecipe).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize);
		K47r = new ItemMaverickFlameRecipe(IDs.K47r).setUnlocalizedName(Strings.MaverickflareRecipe).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize);
		K48r = new ItemAstralBlastRecipe(IDs.K48r).setUnlocalizedName(Strings.AstralblastRecipe).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize);
		K49r = new ItemDarkerThanDarkRecipe(IDs.K49r).setUnlocalizedName(Strings.DarkerthandarkRecipe).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize);
		K50r = new ItemLunarEclipseRecipe(IDs.K50r).setUnlocalizedName(Strings.LunareclipseRecipe).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize);
		K51r = new ItemSilentDirgeRecipe(IDs.K51r).setUnlocalizedName(Strings.SilentdirgeRecipe).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize);
		K52r = new ItemTotalEclipseRecipe(IDs.K52r).setUnlocalizedName(Strings.TotaleclipseRecipe).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize);
		K53r = new ItemGlimpseofdarknessRecipe(IDs.K53r).setUnlocalizedName(Strings.GlimpseofdarknessRecipe).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize);
		K54r = new ItemMidnightRoarRecipe(IDs.K54r).setUnlocalizedName(Strings.MidnightroarRecipe).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize);
		K55r = new ItemRejectionOfFateRecipe(IDs.K55r).setUnlocalizedName(Strings.RejectionoffateRecipe).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize);
		K56r = new ItemTrueLightsFlightRecipe(IDs.K56r).setUnlocalizedName(Strings.TruelightsflightRecipe).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize);
		K57r = new ItemLeviathanRecipe(IDs.K57r).setUnlocalizedName(Strings.LeviathanRecipe).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize);
		K58r = new ItemAbyssalTideRecipe(IDs.K58r).setUnlocalizedName(Strings.AbyssaltideRecipe).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize);
		K59r = new ItemCrownOfGuiltRecipe(IDs.K59r).setUnlocalizedName(Strings.CrownofguiltRecipe).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize);
		K60r = new ItemSignOfInnocenceRecipe(IDs.K60r).setUnlocalizedName(Strings.SignofinnocenceRecipe).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize);
		K61r = new ItemPainOfSolitudeRecipe(IDs.K61r).setUnlocalizedName(Strings.PainofsolitudeRecipe).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize);
		K62r = new ItemAbaddonPlasmaRecipe(IDs.K62r).setUnlocalizedName(Strings.AbbadonplasmaRecipe).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize);
		K63r = new ItemOminousBlightRecipe(IDs.K63r).setUnlocalizedName(Strings.OminousblightRecipe).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize);
		K64r = new ItemMissingAcheRecipe(IDs.K64r).setUnlocalizedName(Strings.MissingacheRecipe).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize);
		K65r = new ItemWinnersProofRecipe(IDs.K65r).setUnlocalizedName(Strings.WinnersproofRecipe).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize);
		K66r = new ItemFatalcrestRecipe(IDs.K66r).setUnlocalizedName(Strings.FatalcrestRecipe).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize);
		K67r = new ItemTwoBecomeOneRecipe(IDs.K67r).setUnlocalizedName(Strings.TwobecomesoneRecipe).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize);
		K68r = new ItemBondOfFlamesRecipe(IDs.K68r).setUnlocalizedName(Strings.BondofflameRecipe).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize);
		K69r = new ItemFenrirRecipe(IDs.K69r).setUnlocalizedName(Strings.FenrirRecipe).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize);
		K70r = new ItemSleepingLionRecipe(IDs.K70r).setUnlocalizedName(Strings.SleepinglionRecipe).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize);
		K71r = new ItemGuardianSoulRecipe(IDs.K71r).setUnlocalizedName(Strings.GuardiansoulRecipe).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize);
		K72r = new ItemGullwingRecipe(IDs.K72r).setUnlocalizedName(Strings.GullwingRecipe).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize);
		K73r = new ItemPhotonDebuggerRecipe(IDs.K73r).setUnlocalizedName(Strings.PhotondebuggerRecipe).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize);
		K74r = new ItemSweetMemoriesRecipe(IDs.K74r).setUnlocalizedName(Strings.SweetmemoriesRecipe).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize);
		K75r = new ItemCircleOfLifeRecipe(IDs.K75r).setUnlocalizedName(Strings.CircleoflifeRecipe).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize);
		K76r = new ItemDecisivePumpkinRecipe(IDs.K76r).setUnlocalizedName(Strings.DecisivepumpkinRecipe).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize);
		K77r = new ItemWishingLampRecipe(IDs.K77r).setUnlocalizedName(Strings.WishinglampRecipe).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize);
		K78r = new ItemFollowthewindRecipe(IDs.K78r).setUnlocalizedName(Strings.FollowthewindRecipe).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize);
		K79r = new ItemMysteriousAbyssRecipe(IDs.K79r).setUnlocalizedName(Strings.MysteriousabyssRecipe).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize);
		K80r = new ItemMonochromeRecipe(IDs.K80r).setUnlocalizedName(Strings.MonochromeRecipe).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize);
		K81r = new ItemHeroscrestRecipe(IDs.K81r).setUnlocalizedName(Strings.HeroscrestRecipe).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize);
		K82r = new ItemRumblingRoseRecipe(IDs.K82r).setUnlocalizedName(Strings.RumblingroseRecipe).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize);
		K83r = new ItemHiddenDragonRecipe(IDs.K83r).setUnlocalizedName(Strings.HiddendragonRecipe).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize);
		K84r = new ItemEndsofearthRecipe(IDs.K84r).setUnlocalizedName(Strings.EndsofearthRecipe).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize);
		K85r = new ItemStormFallRecipe(IDs.K85r).setUnlocalizedName(Strings.StormfallRecipe).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize);
		K86r = new ItemDestinysembraceRecipe(IDs.K86r).setUnlocalizedName(Strings.DestinysembraceRecipe).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize);
		K87r = new ItemWayToDawnRecipe(IDs.K87r).setUnlocalizedName(Strings.WaytodawnRecipe).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize);
		K88r = new ItemOneWingedAngelRecipe(IDs.K88r).setUnlocalizedName(Strings.OnewingedangelRecipe).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize);
		K89r = new ItemDiamonddustRecipe(IDs.K89r).setUnlocalizedName(Strings.DiamonddustRecipe).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize);
		K90r = new ItemLionHeartRecipe(IDs.K90r).setUnlocalizedName(Strings.LionheartRecipe).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize);
		K91r = new ItemMetalChocoboRecipe(IDs.K91r).setUnlocalizedName(Strings.MetalchocoboRecipe).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize);
		K92r = new ItemSpellBinderRecipe(IDs.K92r).setUnlocalizedName(Strings.SpellbinderRecipe).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize);
		K93r = new ItemDivineRoseRecipe(IDs.K93r).setUnlocalizedName(Strings.DivineroseRecipe).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize);
		K94r = new ItemFairyharpRecipe(IDs.K94r).setUnlocalizedName(Strings.FairyharpRecipe).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize);
		K95r = new ItemCrabClawRecipe(IDs.K95r).setUnlocalizedName(Strings.CrabclawRecipe).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize);
		K96r = new ItemWishingStarRecipe(IDs.K96r).setUnlocalizedName(Strings.WishingstarRecipe).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize);
		K97r = new ItemPumpkinHeadRecipe(IDs.K97r).setUnlocalizedName(Strings.PumpkinheadRecipe).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize);
		K98r = new ItemThreeWishesRecipe(IDs.K98r).setUnlocalizedName(Strings.ThreewishesRecipe).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize);
		K99r = new ItemJungleKingRecipe(IDs.K99r).setUnlocalizedName(Strings.JunglekingRecipe).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize);
		K100r = new ItemOlympiaRecipe(IDs.K100r).setUnlocalizedName(Strings.OlympiaRecipe).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize);
		K101r = new ItemLadyLuckRecipe(IDs.K101r).setUnlocalizedName(Strings.LadyluckRecipe).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize);
		K102r = new ItemKeybladeOfPeoplesHeartsRecipe(IDs.K102r).setUnlocalizedName(Strings.PeoplesheartsRecipe).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize);
		K103r = new ItemUltimaWeaponRecipe(IDs.K103r).setUnlocalizedName(Strings.UltimaweaponRecipe).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize);
		K104r = new ItemTreasureTroveRecipe(IDs.K104r).setUnlocalizedName(Strings.TreasuretroveRecipe).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize);
		K105r = new ItemStarseekerRecipe(IDs.K105r).setUnlocalizedName(Strings.StarseekerRecipe).setCreativeTab(KingdomKeys.KHIITAB).setMaxStackSize(chainStackSize);
		K106r = new ItemSoulEaterRecipe(IDs.K106r).setUnlocalizedName(Strings.SouleaterRecipe).setCreativeTab(KingdomKeys.KHDAYSTAB).setMaxStackSize(chainStackSize);
		K107r = new ItemStarlightRecipe(IDs.K107r).setUnlocalizedName(Strings.StarlightRecipe).setCreativeTab(KingdomKeys.KHCHITAB).setMaxStackSize(chainStackSize);
		K111r = new ItemKingdomKeyRecipe(IDs.K111r).setUnlocalizedName(Strings.KingdomKeyRecipe).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize); GameRegistry.registerItem(K111r, Strings.KingdomKeyRecipe);
		K113r = new ItemKingdomKeyDRecipe(IDs.K113r).setUnlocalizedName(Strings.KingdomKeyDRecipe).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize);
		K112r = new ItemOathkeeperRecipe(IDs.K112r).setUnlocalizedName(Strings.OathkeeperRecipe).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize);
		K114r = new ItemOblivionRecipe(IDs.K114r).setUnlocalizedName(Strings.OblivionRecipe).setCreativeTab(KingdomKeys.KHTAB).setMaxStackSize(chainStackSize);
		K110r = new ItemWaywardWindRecipe(IDs.K110r).setUnlocalizedName(Strings.WaywardwindRecipe).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize);
		K109r = new ItemEarthshakerRecipe(IDs.K109r).setUnlocalizedName(Strings.EarthshakerRecipe).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize);
		K108r = new ItemRainfellRecipe(IDs.K108r).setUnlocalizedName(Strings.RainfellRecipe).setCreativeTab(KingdomKeys.KHBBSTAB).setMaxStackSize(chainStackSize);
	}

	public static void intiArmour(){
		//Organization
		OrganizationArmourMaterial = EnumHelper.addArmorMaterial("ORGANIZATION", 28, new int[] { 4, 8, 6, 3 }, 30);
		OrganizationHood = new OrganizationArmor(IDs.OHelm, OrganizationArmourMaterial , KingdomKeys.proxy.addArmor(OrganizationArmourMaterial.name()), 0, "ORGANIZATION_1", Strings.OHood);
		OrganizationCoat = new OrganizationArmor(IDs.OChest, OrganizationArmourMaterial, KingdomKeys.proxy.addArmor(OrganizationArmourMaterial.name()), 1, "ORGANIZATION_1", Strings.OCoat);
		OrganizationLegs = new OrganizationArmor(IDs.OLegs, OrganizationArmourMaterial, KingdomKeys.proxy.addArmor(OrganizationArmourMaterial.name()), 2, "ORGANIZATION_2", Strings.OLegs);
		OrganizationBoots = new OrganizationArmor(IDs.OBoots, OrganizationArmourMaterial, KingdomKeys.proxy.addArmor(OrganizationArmourMaterial.name()), 3, "ORGANIZATION_1", Strings.OBoots);
		//Keyblade
		//Aqua
		KeybladeAArmourMaterial = EnumHelper.addArmorMaterial("KEYBLADEA", 34, new int[] { 5, 8, 6, 4 }, 30);
		KeybladeAHelm = new KeybladeAArmor(IDs.KAHelm, KeybladeAArmourMaterial , KingdomKeys.proxy.addArmor(KeybladeAArmourMaterial.name()), 0, "KEYBLADEA_1", Strings.KAHelm);
		KeybladeAChest = new KeybladeAArmor(IDs.KAChest, KeybladeAArmourMaterial, KingdomKeys.proxy.addArmor(KeybladeAArmourMaterial.name()), 1, "KEYBLADEA_1", Strings.KAChest);
		KeybladeALegs = new KeybladeAArmor(IDs.KALegs, KeybladeAArmourMaterial, KingdomKeys.proxy.addArmor(KeybladeAArmourMaterial.name()), 2, "KEYBLADEA_2", Strings.KALegs);
		KeybladeABoots = new KeybladeAArmor(IDs.KABoots, KeybladeAArmourMaterial, KingdomKeys.proxy.addArmor(KeybladeAArmourMaterial.name()), 3, "KEYBLADEA_1", Strings.KABoots);
		//Terra
		KeybladeTArmourMaterial = EnumHelper.addArmorMaterial("KEYBLADET", 40, new int[] { 6, 8, 7, 4 }, 30);
		KeybladeTHelm = new KeybladeTArmor(IDs.KTHelm, KeybladeTArmourMaterial , KingdomKeys.proxy.addArmor(KeybladeTArmourMaterial.name()), 0, "KEYBLADET_1", Strings.KTHelm);
		KeybladeTChest = new KeybladeTArmor(IDs.KTChest, KeybladeTArmourMaterial, KingdomKeys.proxy.addArmor(KeybladeTArmourMaterial.name()), 1, "KEYBLADET_1", Strings.KTChest);
		KeybladeTLegs = new KeybladeTArmor(IDs.KTLegs, KeybladeTArmourMaterial, KingdomKeys.proxy.addArmor(KeybladeTArmourMaterial.name()), 2, "KEYBLADET_2", Strings.KTLegs);
		KeybladeTBoots = new KeybladeTArmor(IDs.KTBoots, KeybladeTArmourMaterial, KingdomKeys.proxy.addArmor(KeybladeTArmourMaterial.name()), 3, "KEYBLADET_1", Strings.KTBoots);
		//Ventus
		KeybladeVArmourMaterial = EnumHelper.addArmorMaterial("KEYBLADEV", 30, new int[] { 4, 8, 5, 4 }, 30);
		KeybladeVHelm = new KeybladeVArmor(IDs.KVHelm, KeybladeAArmourMaterial , KingdomKeys.proxy.addArmor(KeybladeVArmourMaterial.name()), 0, "KEYBLADEV_1", Strings.KVHelm);
		KeybladeVChest = new KeybladeVArmor(IDs.KVChest, KeybladeAArmourMaterial, KingdomKeys.proxy.addArmor(KeybladeVArmourMaterial.name()), 1, "KEYBLADEV_1", Strings.KVChest);
		KeybladeVLegs = new KeybladeVArmor(IDs.KVLegs, KeybladeAArmourMaterial, KingdomKeys.proxy.addArmor(KeybladeVArmourMaterial.name()), 2, "KEYBLADEV_2", Strings.KVLegs);
		KeybladeVBoots = new KeybladeVArmor(IDs.KVBoots, KeybladeAArmourMaterial, KingdomKeys.proxy.addArmor(KeybladeVArmourMaterial.name()), 3, "KEYBLADEV_1", Strings.KVBoots);
		//Eraqus
		KeybladeEArmourMaterial = EnumHelper.addArmorMaterial("KEYBLADEE", 42, new int[] { 5, 7, 7, 5 }, 30);
		KeybladeEHelm = new KeybladeEArmor(IDs.KEHelm, KeybladeEArmourMaterial , KingdomKeys.proxy.addArmor(KeybladeEArmourMaterial.name()), 0, "KEYBLADEE_1", Strings.KEHelm);
		KeybladeEChest = new KeybladeEArmor(IDs.KEChest, KeybladeEArmourMaterial, KingdomKeys.proxy.addArmor(KeybladeEArmourMaterial.name()), 1, "KEYBLADEE_1", Strings.KEChest);
		KeybladeELegs = new KeybladeEArmor(IDs.KELegs, KeybladeEArmourMaterial, KingdomKeys.proxy.addArmor(KeybladeEArmourMaterial.name()), 2, "KEYBLADEE_2", Strings.KELegs);
		KeybladeEBoots = new KeybladeEArmor(IDs.KEBoots, KeybladeEArmourMaterial, KingdomKeys.proxy.addArmor(KeybladeEArmourMaterial.name()), 3, "KEYBLADEE_1", Strings.KEBoots);
		
		OrganizationArmourMaterial.customCraftingMaterial = DarkLeather;
		KeybladeVArmourMaterial.customCraftingMaterial = OrichalcumPlus;
		KeybladeTArmourMaterial.customCraftingMaterial = OrichalcumPlus;
		KeybladeAArmourMaterial.customCraftingMaterial = OrichalcumPlus;
		KeybladeEArmourMaterial.customCraftingMaterial = OrichalcumPlus;
	}

	public static void initHearts(){
		PureHeart = new ItemPureHeart(IDs.PureHeart);
		DarkHeart = new ItemDarkHeart(IDs.DarkHeart);
		Heart = new ItemHeart(IDs.Heart);
		KingdomHearts = new ItemKingdomHearts(IDs.KingdomHearts);
		Guide = new ItemGuide(IDs.Guide);
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
		//Keyblade Recipes chest generation
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K1r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K1r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K1r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K1r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K1r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K1r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K2r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K2r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K2r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K2r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K2r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K2r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K3r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K3r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K3r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K3r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K3r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K3r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K4r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K4r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K4r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K4r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K4r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K4r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K5r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K5r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K5r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K5r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K5r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K5r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K6r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K6r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K6r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K6r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K6r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K6r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K7r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K7r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K7r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K7r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K7r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K7r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K8r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K8r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K8r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K8r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K8r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K8r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K9r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K9r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K9r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K9r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K9r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K9r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K10r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K10r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K10r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K10r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K10r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K10r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K11r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K1r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K1r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K1r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K1r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K1r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K12r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K12r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K12r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K12r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K12r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K12r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K13r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K13r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K13r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K13r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K13r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K13r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K14r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K14r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K14r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K14r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K14r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K14r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K15r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K15r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K15r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K15r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K15r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K15r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K16r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K16r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K16r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K16r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K16r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K16r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K17r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K17r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K17r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K17r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K17r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K17r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K18r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K18r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K18r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K18r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K18r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K18r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K19r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K19r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K19r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K19r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K19r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K19r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K20r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K20r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K20r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K20r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K20r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K20r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K21r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K21r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K21r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K21r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K21r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K21r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K22r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K22r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K22r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K22r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K22r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K22r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K23r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K23r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K23r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K23r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K23r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K23r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K24r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K24r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K24r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K24r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K24r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K24r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K25r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K25r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K25r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K25r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K25r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K25r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K26r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K26r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K26r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K26r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K26r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K26r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K27r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K27r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K27r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K27r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K27r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K27r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K28r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K28r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K28r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K28r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K28r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K28r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K29r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K29r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K29r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K29r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K29r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K29r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K30r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K30r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K30r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K30r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K30r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K30r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K31r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K31r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K31r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K31r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K31r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K31r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K32r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K32r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K32r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K32r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K32r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K32r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K33r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K33r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K33r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K33r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K33r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K33r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K34r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K34r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K34r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K34r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K34r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K34r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K35r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K35r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K35r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K35r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K35r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K35r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K36r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K36r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K36r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K36r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K36r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K36r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K37r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K37r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K37r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K37r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K37r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K37r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K38r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K38r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K38r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K38r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K38r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K38r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K39r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K39r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K39r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K39r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K39r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K39r),0,1,1));
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K40r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K40r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(K40r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(K40r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(K40r),0,1,1));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(K40r),0,1,1));
		
		
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
		Munny = new ItemMunny(IDs.Munny).setCreativeTab(KingdomKeys.KKSMTAB);
		Munny1 = new ItemMunny1(IDs.Munny1).setCreativeTab(KingdomKeys.KKSMTAB);
		Munny5 = new ItemMunny5(IDs.Munny5).setCreativeTab(KingdomKeys.KKSMTAB);
		Munny10 = new ItemMunny10(IDs.Munny10).setCreativeTab(KingdomKeys.KKSMTAB);
		Munny50 = new ItemMunny50(IDs.Munny50).setCreativeTab(KingdomKeys.KKSMTAB);
		Munny100 = new ItemMunny100(IDs.Munny100).setCreativeTab(KingdomKeys.KKSMTAB);
		Munny200 = new ItemMunny200(IDs.Munny200).setCreativeTab(KingdomKeys.KKSMTAB);
		Munny500 = new ItemMunny500(IDs.Munny500).setCreativeTab(KingdomKeys.KKSMTAB);
		Munny800 = new ItemMunny800(IDs.Munny800).setCreativeTab(KingdomKeys.KKSMTAB);
		Munny1000 = new ItemMunny1000(IDs.Munny1000).setCreativeTab(KingdomKeys.KKSMTAB);
		Munny1200 = new ItemMunny1200(IDs.Munny1200).setCreativeTab(KingdomKeys.KKSMTAB);
		Munny1500 = new ItemMunny1500(IDs.Munny1500).setCreativeTab(KingdomKeys.KKSMTAB);
		Munny1800 = new ItemMunny1800(IDs.Munny1800).setCreativeTab(KingdomKeys.KKSMTAB);
		Munny2000 = new ItemMunny2000(IDs.Munny2000).setCreativeTab(KingdomKeys.KKSMTAB);
		Munny3000 = new ItemMunny3000(IDs.Munny3000).setCreativeTab(KingdomKeys.KKSMTAB);
		Munny4000 = new ItemMunny4000(IDs.Munny4000).setCreativeTab(KingdomKeys.KKSMTAB);
		Munny5000 = new ItemMunny5000(IDs.Munny5000).setCreativeTab(KingdomKeys.KKSMTAB);
		Munny6000 = new ItemMunny6000(IDs.Munny6000).setCreativeTab(KingdomKeys.KKSMTAB);
		Potion = new ItemPotion(IDs.Potion, 0, 0, true);
		
		
		//Synthesis
		BlazingShard = new ItemBlazingShard(IDs.BlazingShard).setUnlocalizedName(Strings.BlazingShard).setCreativeTab(KingdomKeys.KKSMTAB);
		BlazingStone = new ItemBlazingStone(IDs.BlazingStone).setUnlocalizedName(Strings.BlazingStone).setCreativeTab(KingdomKeys.KKSMTAB);
		BlazingGem = new ItemBlazingGem(IDs.BlazingGem).setUnlocalizedName(Strings.BlazingGem).setCreativeTab(KingdomKeys.KKSMTAB);
		BlazingCrystal = new ItemBlazingCrystal(IDs.BlazingCrystal).setUnlocalizedName(Strings.BlazingCrystal).setCreativeTab(KingdomKeys.KKSMTAB);
		
		FrostShard = new ItemFrostShard(IDs.FrostShard).setUnlocalizedName(Strings.FrostShard).setCreativeTab(KingdomKeys.KKSMTAB);
		FrostStone = new ItemFrostStone(IDs.FrostStone).setUnlocalizedName(Strings.FrostStone).setCreativeTab(KingdomKeys.KKSMTAB);
		FrostGem = new ItemFrostGem(IDs.FrostGem).setUnlocalizedName(Strings.FrostGem).setCreativeTab(KingdomKeys.KKSMTAB);
		FrostCrystal = new ItemFrostCrystal(IDs.FrostCrystal).setUnlocalizedName(Strings.FrostCrystal).setCreativeTab(KingdomKeys.KKSMTAB);
		
		LightningShard = new ItemLightningShard(IDs.LightningShard).setUnlocalizedName(Strings.LightningShard).setCreativeTab(KingdomKeys.KKSMTAB);
		LightningStone = new ItemLightningStone(IDs.LightningStone).setUnlocalizedName(Strings.LightningStone).setCreativeTab(KingdomKeys.KKSMTAB);
		LightningGem = new ItemLightningGem(IDs.LightningGem).setUnlocalizedName(Strings.LightningGem).setCreativeTab(KingdomKeys.KKSMTAB);
		LightningCrystal = new ItemLightningCrystal(IDs.LightningCrystal).setUnlocalizedName(Strings.LightningCrystal).setCreativeTab(KingdomKeys.KKSMTAB);
		
		LucidShard = new ItemLucidShard(IDs.LucidShard).setUnlocalizedName(Strings.LucidShard).setCreativeTab(KingdomKeys.KKSMTAB);
		LucidStone = new ItemLucidStone(IDs.LucidStone).setUnlocalizedName(Strings.LucidStone).setCreativeTab(KingdomKeys.KKSMTAB);
		LucidGem = new ItemLucidGem(IDs.LucidGem).setUnlocalizedName(Strings.LucidGem).setCreativeTab(KingdomKeys.KKSMTAB);
		LucidCrystal = new ItemLucidCrystal(IDs.LucidCrystal).setUnlocalizedName(Strings.LucidCrystal).setCreativeTab(KingdomKeys.KKSMTAB);
		
		PowerShard = new ItemPowerShard(IDs.PowerShard).setUnlocalizedName(Strings.PowerShard).setCreativeTab(KingdomKeys.KKSMTAB);
		PowerStone = new ItemPowerStone(IDs.PowerStone).setUnlocalizedName(Strings.PowerStone).setCreativeTab(KingdomKeys.KKSMTAB);
		PowerGem = new ItemPowerGem(IDs.PowerGem).setUnlocalizedName(Strings.PowerGem).setCreativeTab(KingdomKeys.KKSMTAB);
		PowerCrystal = new ItemPowerCrystal(IDs.PowerCrystal).setUnlocalizedName(Strings.PowerCrystal).setCreativeTab(KingdomKeys.KKSMTAB);
		
		DarkShard = new ItemDarkShard(IDs.DarkShard).setUnlocalizedName(Strings.DarkShard).setCreativeTab(KingdomKeys.KKSMTAB);
		DarkStone = new ItemDarkStone(IDs.DarkStone).setUnlocalizedName(Strings.DarkStone).setCreativeTab(KingdomKeys.KKSMTAB);
		DarkGem = new ItemDarkGem(IDs.DarkGem).setUnlocalizedName(Strings.DarkGem).setCreativeTab(KingdomKeys.KKSMTAB);
		DarkCrystal = new ItemDarkCrystal(IDs.DarkCrystal).setUnlocalizedName(Strings.DarkCrystal).setCreativeTab(KingdomKeys.KKSMTAB);
		DarkMatter = new ItemDarkMatter(IDs.DarkMatter).setUnlocalizedName(Strings.DarkMatter).setCreativeTab(KingdomKeys.KKSMTAB);
		
		DenseShard = new ItemDenseShard(IDs.DenseShard).setUnlocalizedName(Strings.DenseShard).setCreativeTab(KingdomKeys.KKSMTAB);
		DenseStone = new ItemDenseStone(IDs.DenseStone).setUnlocalizedName(Strings.DenseStone).setCreativeTab(KingdomKeys.KKSMTAB);
		DenseGem = new ItemDenseGem(IDs.DenseGem).setUnlocalizedName(Strings.DenseGem).setCreativeTab(KingdomKeys.KKSMTAB);
		DenseCrystal = new ItemDenseCrystal(IDs.DenseCrystal).setUnlocalizedName(Strings.DenseCrystal).setCreativeTab(KingdomKeys.KKSMTAB);
		
		TwilightShard = new ItemTwilightShard(IDs.TwilightShard).setUnlocalizedName(Strings.TwilightShard).setCreativeTab(KingdomKeys.KKSMTAB);
		TwilightStone = new ItemTwilightStone(IDs.TwilightStone).setUnlocalizedName(Strings.TwilightStone).setCreativeTab(KingdomKeys.KKSMTAB);
		TwilightGem = new ItemTwilightGem(IDs.TwilightGem).setUnlocalizedName(Strings.TwilightGem).setCreativeTab(KingdomKeys.KKSMTAB);
		TwilightCrystal = new ItemTwilightCrystal(IDs.TwilightCrystal).setUnlocalizedName(Strings.TwilightCrystal).setCreativeTab(KingdomKeys.KKSMTAB);
		
		MythrilShard = new ItemMythrilShard(IDs.MythrilShard).setUnlocalizedName(Strings.MythrilShard).setCreativeTab(KingdomKeys.KKSMTAB);
		MythrilStone = new ItemMythrilStone(IDs.MythrilStone).setUnlocalizedName(Strings.MythrilStone).setCreativeTab(KingdomKeys.KKSMTAB);
		MythrilGem = new ItemMythrilGem(IDs.MythrilGem).setUnlocalizedName(Strings.MythrilGem).setCreativeTab(KingdomKeys.KKSMTAB);
		MythrilCrystal = new ItemMythrilCrystal(IDs.MythrilCrystal).setUnlocalizedName(Strings.MythrilCrystal).setCreativeTab(KingdomKeys.KKSMTAB);
		
		BrightShard = new ItemBrightShard(IDs.BrightShard).setUnlocalizedName(Strings.BrightShard).setCreativeTab(KingdomKeys.KKSMTAB);
		BrightStone = new ItemBrightStone(IDs.BrightStone).setUnlocalizedName(Strings.BrightStone).setCreativeTab(KingdomKeys.KKSMTAB);
		BrightGem = new ItemBrightGem(IDs.BrightGem).setUnlocalizedName(Strings.BrightGem).setCreativeTab(KingdomKeys.KKSMTAB);
		BrightCrystal = new ItemBrightCrystal(IDs.BrightCrystal).setUnlocalizedName(Strings.BrightCrystal).setCreativeTab(KingdomKeys.KKSMTAB);
		
		EnergyShard = new ItemEnergyShard(IDs.EnergyShard).setUnlocalizedName(Strings.EnergyShard).setCreativeTab(KingdomKeys.KKSMTAB);
		EnergyStone = new ItemEnergyStone(IDs.EnergyStone).setUnlocalizedName(Strings.EnergyStone).setCreativeTab(KingdomKeys.KKSMTAB);
		EnergyGem = new ItemEnergyGem(IDs.EnergyGem).setUnlocalizedName(Strings.EnergyGem).setCreativeTab(KingdomKeys.KKSMTAB);
		EnergyCrystal = new ItemEnergyCrystal(IDs.EnergyCrystal).setUnlocalizedName(Strings.EnergyCrystal).setCreativeTab(KingdomKeys.KKSMTAB);
		
		SerenityShard = new ItemSerenityShard(IDs.SerenityShard).setUnlocalizedName(Strings.SerenityShard).setCreativeTab(KingdomKeys.KKSMTAB);
		SerenityStone = new ItemSerenityStone(IDs.SerenityStone).setUnlocalizedName(Strings.SerenityStone).setCreativeTab(KingdomKeys.KKSMTAB);
		SerenityGem = new ItemSerenityGem(IDs.SerenityGem).setUnlocalizedName(Strings.SerenityGem).setCreativeTab(KingdomKeys.KKSMTAB);
		SerenityCrystal = new ItemSerenityCrystal(IDs.SerenityCrystal).setUnlocalizedName(Strings.SerenityCrystal).setCreativeTab(KingdomKeys.KKSMTAB);
		
		Orichalcum = new ItemOrichalcum(IDs.Orichalcum).setUnlocalizedName(Strings.Orichalcum).setCreativeTab(KingdomKeys.KKSMTAB);
		OrichalcumPlus = new ItemOrichalcumPlus(IDs.OrichalcumPlus).setUnlocalizedName(Strings.OrichalcumPlus).setCreativeTab(KingdomKeys.KKSMTAB);
		
		RemembranceShard = new ItemRemembranceShard(IDs.RemembranceShard).setUnlocalizedName(Strings.RemembranceShard).setCreativeTab(KingdomKeys.KKSMTAB);
		RemembranceStone = new ItemRemembranceStone(IDs.RemembranceStone).setUnlocalizedName(Strings.RemembranceStone).setCreativeTab(KingdomKeys.KKSMTAB);
		RemembranceGem = new ItemRemembranceGem(IDs.RemembranceGem).setUnlocalizedName(Strings.RemembranceGem).setCreativeTab(KingdomKeys.KKSMTAB);
		RemembranceCrystal = new ItemRemembranceCrystal(IDs.RemembranceCrystal).setUnlocalizedName(Strings.RemembranceCrystal).setCreativeTab(KingdomKeys.KKSMTAB);
		
		TranquilShard = new ItemTranquilShard(IDs.TranquilShard).setUnlocalizedName(Strings.TranquilShard).setCreativeTab(KingdomKeys.KKSMTAB);
		TranquilStone = new ItemTranquilStone(IDs.TranquilStone).setUnlocalizedName(Strings.TranquilStone).setCreativeTab(KingdomKeys.KKSMTAB);
		TranquilGem = new ItemTranquilGem(IDs.TranquilGem).setUnlocalizedName(Strings.TranquilGem).setCreativeTab(KingdomKeys.KKSMTAB);
		TranquilCrystal = new ItemTranquilCrystal(IDs.TranquilCrystal).setUnlocalizedName(Strings.TranquilCrystal).setCreativeTab(KingdomKeys.KKSMTAB);
		
		ShinyCrystal = new ItemShinyCrystal(IDs.ShinyCrystal).setUnlocalizedName(Strings.ShinyCrystal).setCreativeTab(KingdomKeys.KKSMTAB);
	}

}