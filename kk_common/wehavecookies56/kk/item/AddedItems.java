package wehavecookies56.kk.item;

import net.minecraft.block.Block;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagString;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.EnumHelper;
import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.item.keyblades.*;
import wehavecookies56.kk.item.keychains.*;
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
import wehavecookies56.kk.lib.ConfigBooleans;
import wehavecookies56.kk.lib.IDs;
import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.lib.Strings;
import cpw.mods.fml.common.registry.GameRegistry;

public class AddedItems {

	public static Item Munny1, Munny5, Munny10, Munny20, Munny50, Munny100, Munny200, Munny500, Munny800, Munny1000, Munny1200, Munny1500, Munny1800, Munny2000, Munny3000, Munny4000, Munny5000, Munny6000, BlazingShard, BlazingStone, BlazingGem, BlazingCrystal, FrostShard, FrostStone, FrostGem, FrostCrystal, LightningShard, LightningStone, LightningGem, LightningCrystal, LucidShard, LucidStone, LucidGem, LucidCrystal, PowerShard, PowerStone, PowerGem, PowerCrystal, DarkShard, DarkStone, DarkGem, DarkCrystal, DarkMatter, DenseShard, DenseStone, DenseGem, DenseCrystal, TwilightShard, TwilightStone, TwilightGem, TwilightCrystal, MythrilShard, MythrilStone, MythrilGem, MythrilCrystal, BrightShard, BrightStone, BrightGem, BrightCrystal, EnergyShard, EnergyStone, EnergyGem, EnergyCrystal, SerenityShard, SerenityStone, SerenityGem, SerenityCrystal, Orichalcum, OrichalcumPlus, RemembranceShard, RemembranceStone, RemembranceGem, RemembranceCrystal, TranquilShard, TranquilStone, TranquilGem, TranquilCrystal, MysteryGoo, ShinyCrystal, Disc1, Disc2, PureHeart, DarkHeart, Heart, KingdomHearts, OrganizationHood, OrganizationCoat, OrganizationLegs, OrganizationBoots, DarkLeather, HP, Munny, Potion, Disc3, Disc4, Disc5, Disc6, Disc7, Disc8, Disc9, WaywardWindChain, KeybladeAHelm, KeybladeAChest, KeybladeALegs, KeybladeABoots, KeybladeTHelm, KeybladeTChest, KeybladeTLegs, KeybladeTBoots, KeybladeVHelm, KeybladeVChest, KeybladeVLegs, KeybladeVBoots, Vulpeus, Ursus, Unicornis, K4, K5, K6, K7, K8, K9, K10, K11, K12, K13, K14, K15, K16, K17, K18, K19, K20, K21, K22, K23, K24, K25, K26, K27, K28, K29, K30, K31, K32, K33, K34, K35, K36, K37, K38, K39, K40, K41, K42, K43, K44, K45, K46, K47, K48, K49, K50, K51, K52, K53, K54, K55, K56, K57, K58, K59, K60, K61, K62, K63, K64, K65, K66, K67, K68, K69, K70, K71, K72, K73, K74, K75, K76, K77, K78, K79, K80, K81, K82, K83, K84, K85, K86, K87, K88, K89, K90, K91, K92, K93, K94, K95, K96, K97, K98, K99, K100, K101, K102, K103, K104, K105, K106, K107, K108, K109, K110, K111, K112, K113, K114, K1c, K2c, K3c, K4c, K5c, K6c, K7c, K8c, K9c, K10c, K11c, K12c, K13c, K14c, K15c, K16c, K17c, K18c, K19c, K20c, K21c, K22c, K23c, K24c, K25c, K26c, K27c, K28c, K29c, K30c, K31c, K32c, K33c, K34c, K35c, K36c, K37c, K38c, K39c, K40c, K41c, K42c, K43c, K44c, K45c, K46c, K47c, K48c, K49c, K50c, K51c, K52c, K53c, K54c, K55c, K56c, K57c, K58c, K59c, K60c, K61c, K62c, K63c, K64c, K65c, K66c, K67c, K68c, K69c, K70c, K71c, K72c, K73c, K74c, K75c, K76c, K77c, K78c, K79c, K80c, K81c, K82c, K83c, K84c, K85c, K86c, K87c, K88c, K89c, K90c, K91c, K92c, K93c, K94c, K95c, K96c, K97c, K98c, K99c, K100c, K101c, K102c, K103c, K104c, K105c, K106c, K107c, K108c, K109c, K110c, K111c, K112c, K113c, K114c, EternalFlames;
	public static EnumArmorMaterial OrganizationArmourMaterial, KeybladeAArmourMaterial, KeybladeTArmourMaterial, KeybladeVArmourMaterial;
	public static EnumToolMaterial VulpeusMaterial, UrsusMaterial, UnicornisMaterial, K4m, K5m, K6m, K7m, K8m, K9m, K10m, K11m, K12m, K13m, K14m, K15m, K16m, K17m, K18m, K19m, K20m, K21m, K22m, K23m, K24m, K25m, K26m, K27m, K28m, K29m, K30m, K31m, K32m, K33m, K34m, K35m, K36m, K37m, K38m, K39m, K40m, K41m, K42m, K43m, K44m, K45m, K46m, K47m, K48m, K49m, K50m, K51m, K52m, K53m, K54m, K55m, K56m, K57m, K58m, K59m, K60m, K61m, K62m, K63m, K64m, K65m, K66m, K67m, K68m, K69m, K70m, K71m, K72m, K73m, K74m, K75m, K76m, K77m, K78m, K79m, K80m, K81m, K82m, K83m, K84m, K85m, K86m, K87m, K88m, K89m, K90m, K91m, K92m, K93m, K94m, K95m, K96m, K97m, K98m, K99m, K100m, K101m, K102m, K103m, K104m, K105m, K106m, K107m, K108m, K109m, K110m, K111m, K112m, K113m, K114m, EternalFlamesMaterial;

	public static void initKeyBlades(){
		//EternalFlamesMaterial = EnumHelper.addToolMaterial(Strings.EternalFlames, 3, -1, 6.0F, 16, 30); EternalFlames = new ItemEternalFlames(IDs.EternalFlames, EternalFlamesMaterial).setFull3D().setUnlocalizedName(Strings.EternalFlames);
		VulpeusMaterial = EnumHelper.addToolMaterial(Strings.Vulpeus, 3, -1, 6.0F, 16, 30); Vulpeus = new ItemVulpeus(IDs.Vulpeus, VulpeusMaterial).setFull3D().setUnlocalizedName(Strings.Vulpeus);
		UrsusMaterial = EnumHelper.addToolMaterial(Strings.Ursus, 3, -1, 6.0F, 18, 30); Ursus = new ItemUrsus(IDs.Ursus, UrsusMaterial).setFull3D().setUnlocalizedName(Strings.Ursus);
		UnicornisMaterial = EnumHelper.addToolMaterial(Strings.Unicornis, 3, -1, 6.0F, 15, 30); Unicornis = new ItemUnicornis(IDs.Unicornis, UnicornisMaterial).setFull3D().setUnlocalizedName(Strings.Unicornis);
		K4m = EnumHelper.addToolMaterial(Strings.Leopardos, 3, -1, 6.0F, 17, 30); K4 = new ItemLeopardos(IDs.K4, K4m).setFull3D().setUnlocalizedName(Strings.Leopardos);
		K5m = EnumHelper.addToolMaterial(Strings.Anguis, 3, -1, 6.0F, 9, 30); K5 = new ItemAnguis(IDs.K5, K5m).setFull3D().setUnlocalizedName(Strings.Anguis);
		K6m = EnumHelper.addToolMaterial(Strings.Leaskeyblade, 3, -1, 6.0F, 8, 30); K6 = new ItemLeasKeyblade(IDs.K6, K6m).setFull3D().setUnlocalizedName(Strings.Leaskeyblade);
		K7m = EnumHelper.addToolMaterial(Strings.Youngxehanortskeyblade, 3, -1, 6.0F, 15, 30); K7 = new ItemYoungXehanort(IDs.K7, K7m).setFull3D().setUnlocalizedName(Strings.Youngxehanortskeyblade);
		K8m = EnumHelper.addToolMaterial(Strings.Oceanrage, 3, -1, 6.0F, 8, 30); K8 = new ItemOceanRage(IDs.K8, K8m).setFull3D().setUnlocalizedName(Strings.Oceanrage);
		K9m = EnumHelper.addToolMaterial(Strings.Endofpain, 3, -1, 6.0F, 9, 30); K9 = new ItemEndOfPain(IDs.K9, K9m).setFull3D().setUnlocalizedName(Strings.Endofpain);
		K10m = EnumHelper.addToolMaterial(Strings.Unbound, 3, -1, 6.0F, 13, 30); K10 = new ItemUnbound(IDs.K10, K10m).setFull3D().setUnlocalizedName(Strings.Unbound);
		K11m = EnumHelper.addToolMaterial(Strings.Sweetdreams, 3, -1, 6.0F, 9, 30); K11 = new ItemSweetDreams(IDs.K11, K11m).setFull3D().setUnlocalizedName(Strings.Sweetdreams);
		K12m = EnumHelper.addToolMaterial(Strings.Divewing, 3, -1, 6.0F, 7, 30); K12 = new ItemDiveWing(IDs.K12, K12m).setFull3D().setUnlocalizedName(Strings.Divewing);
		K13m = EnumHelper.addToolMaterial(Strings.Counterpoint, 3, -1, 6.0F, 7, 30); K13 = new ItemCounterPoint(IDs.K13, K13m).setFull3D().setUnlocalizedName(Strings.Counterpoint);
		K14m = EnumHelper.addToolMaterial(Strings.Allforone, 3, -1, 6.0F, 5, 30); K14 = new ItemAllForOne(IDs.K14, K14m).setFull3D().setUnlocalizedName(Strings.Allforone);
		K15m = EnumHelper.addToolMaterial(Strings.Knockoutpunch, 3, -1, 6.0F, 5, 30); K15 = new ItemKnockoutPunch(IDs.K15, K15m).setFull3D().setUnlocalizedName(Strings.Knockoutpunch);
		K16m = EnumHelper.addToolMaterial(Strings.Ferrisgear, 3, -1, 6.0F, 6, 30); K16 = new ItemFerrisGear(IDs.K16, K16m).setFull3D().setUnlocalizedName(Strings.Ferrisgear); 
		K17m = EnumHelper.addToolMaterial(Strings.Dualdisc, 3, -1, 6.0F, 7, 30); K17 = new ItemDualDisc(IDs.K17, K17m).setFull3D().setUnlocalizedName(Strings.Dualdisc);
		K18m = EnumHelper.addToolMaterial(Strings.Guardianbell, 3, -1, 6.0F, 7, 30); K18 = new ItemGuardianBell(IDs.K18, K18m).setFull3D().setUnlocalizedName(Strings.Guardianbell);
		K19m = EnumHelper.addToolMaterial(Strings.Skullnoise, 3, -1, 6.0F, 6, 30); K19 = new ItemSkullNoise(IDs.K19, K19m).setFull3D().setUnlocalizedName(Strings.Skullnoise);
		K20m = EnumHelper.addToolMaterial(Strings.Woodenkeyblade, 3, -1, 6.0F, 2, 30); K20 = new ItemWoodenKeyBlade(IDs.K20, K20m).setFull3D().setUnlocalizedName(Strings.Woodenkeyblade);
		K21m = EnumHelper.addToolMaterial(Strings.Kyebladebroken, 3, -1, 6.0F, 13, 30); K21 = new ItemkyeBladeBroken(IDs.K21, K21m).setFull3D().setUnlocalizedName(Strings.Kyebladebroken);
		K22m = EnumHelper.addToolMaterial(Strings.Kyeblade, 3, -1, 6.0F, 25, 30); K22 = new ItemkyeBlade(IDs.K22, K22m).setFull3D().setUnlocalizedName(Strings.Kyeblade);
		K23m = EnumHelper.addToolMaterial(Strings.Lightseeker, 3, -1, 6.0F, 9, 30); K23 = new ItemLightSeeker(IDs.K23, K23m).setFull3D().setUnlocalizedName(Strings.Lightseeker);
		K24m = EnumHelper.addToolMaterial(Strings.Lostmemory, 3, -1, 6.0F, 12, 30); K24 = new ItemLostMemory(IDs.K24, K24m).setFull3D().setUnlocalizedName(Strings.Lostmemory);
		K25m = EnumHelper.addToolMaterial(Strings.Frolicflame, 3, -1, 6.0F, 6, 30); K25 = new ItemFrolicFlame(IDs.K25, K25m).setFull3D().setUnlocalizedName(Strings.Frolicflame);
		K26m = EnumHelper.addToolMaterial(Strings.Masterkeeper, 3, -1, 6.0F, 13, 30); K26 = new ItemMasterKeeper(IDs.K26, K26m).setFull3D().setUnlocalizedName(Strings.Masterkeeper);
		K27m = EnumHelper.addToolMaterial(Strings.Brigthcrest, 3, -1, 6.0F, 7, 30); K27 = new ItemBrightCrest(IDs.K27, K27m).setFull3D().setUnlocalizedName(Strings.Brigthcrest);
		K28m = EnumHelper.addToolMaterial(Strings.Crownunlimit, 3, -1, 6.0F, 10, 30); K28 = new ItemCrownUnLimit(IDs.K28, K28m).setFull3D().setUnlocalizedName(Strings.Crownunlimit);
		K29m = EnumHelper.addToolMaterial(Strings.Noname, 3, -1, 6.0F, 12, 30); K29 = new ItemNoName(IDs.K29, K29m).setFull3D().setUnlocalizedName(Strings.Noname);
		K30m = EnumHelper.addToolMaterial(Strings.Voidgear, 3, -1, 6.0F, 11, 30); K30 = new ItemVoidGear(IDs.K30, K30m).setFull3D().setUnlocalizedName(Strings.Voidgear);
		K31m = EnumHelper.addToolMaterial(Strings.Sweetstack, 3, -1, 6.0F, 8, 30); K31 = new ItemSweetStack(IDs.K31, K31m).setFull3D().setUnlocalizedName(Strings.Sweetstack);
		K32m = EnumHelper.addToolMaterial(Strings.Pixiepetal, 3, -1, 6.0F, 6, 30); K32 = new ItemPixiePetal(IDs.K32, K32m).setFull3D().setUnlocalizedName(Strings.Pixiepetal);
		K33m = EnumHelper.addToolMaterial(Strings.Hyperdrive, 3, -1, 6.0F, 8, 30); K33 = new ItemHyperDrive(IDs.K33, K33m).setFull3D().setUnlocalizedName(Strings.Hyperdrive);
		K34m = EnumHelper.addToolMaterial(Strings.Markofahero, 3, -1, 6.0F, 7, 30); K34 = new ItemMarkOfAHero(IDs.K34, K34m).setFull3D().setUnlocalizedName(Strings.Markofahero);
		K35m = EnumHelper.addToolMaterial(Strings.Victoryline, 3, -1, 6.0F, 7, 30); K35 = new ItemVictoryLine(IDs.K35, K35m).setFull3D().setUnlocalizedName(Strings.Victoryline);
		K36m = EnumHelper.addToolMaterial(Strings.Fairystars, 3, -1, 6.0F, 6, 30); K36 = new ItemFairyStars(IDs.K36, K36m).setFull3D().setUnlocalizedName(Strings.Fairystars);
		K37m = EnumHelper.addToolMaterial(Strings.Strokeofmidnight, 3, -1, 6.0F, 6, 30); K37 = new ItemStrokeOfMidnight(IDs.K37, K37m).setFull3D().setUnlocalizedName(Strings.Strokeofmidnight);
		K38m = EnumHelper.addToolMaterial(Strings.Chaosripper, 3, -1, 6.0F, 7, 30); K38 = new ItemChaosRipper(IDs.K38, K38m).setFull3D().setUnlocalizedName(Strings.Chaosripper);
		K39m = EnumHelper.addToolMaterial(Strings.Xehanortskeyblade, 3, -1, 6.0F, 18, 30); K39 = new ItemXehanortsKeyblade(IDs.K39, K39m).setFull3D().setUnlocalizedName(Strings.Xehanortskeyblade);
		K40m = EnumHelper.addToolMaterial(Strings.Darkgnaw, 3, -1, 6.0F, 10, 30); K40 = new ItemDarkGnaw(IDs.K40, K40m).setFull3D().setUnlocalizedName(Strings.Darkgnaw);
		K41m = EnumHelper.addToolMaterial(Strings.Zeroone, 3, -1, 6.0F, 12, 30); K41 = new ItemZeroOne(IDs.K41, K41m).setFull3D().setUnlocalizedName(Strings.Zeroone);
		K42m = EnumHelper.addToolMaterial(Strings.Dreamsword, 3, -1, 6.0F, 5, 30); K42 = new ItemDreamSword(IDs.K42, K42m).setFull3D().setUnlocalizedName(Strings.Dreamsword);
		K43m = EnumHelper.addToolMaterial(Strings.Aubade, 3, -1, 6.0F, 9, 30); K43 = new ItemAubade(IDs.K43, K43m).setFull3D().setUnlocalizedName(Strings.Aubade);
		K44m = EnumHelper.addToolMaterial(Strings.Umbrella, 3, -1, 6.0F, 4, 30); K44 = new ItemUmbrella(IDs.K44, K44m).setFull3D().setUnlocalizedName(Strings.Umbrella);
		K45m = EnumHelper.addToolMaterial(Strings.Omegaweapon, 3, -1, 6.0F, 13, 30); K45 = new ItemOmegaWeapon(IDs.K45, K45m).setFull3D().setUnlocalizedName(Strings.Omegaweapon);
		K46m = EnumHelper.addToolMaterial(Strings.Twilightblaze, 3, -1, 6.0F, 11, 30); K46 = new ItemTwilightBlaze(IDs.K46, K46m).setFull3D().setUnlocalizedName(Strings.Twilightblaze);
		K47m = EnumHelper.addToolMaterial(Strings.Maverickflare, 3, -1, 6.0F, 9, 30); K47 = new ItemMaverickFlare(IDs.K47, K47m).setFull3D().setUnlocalizedName(Strings.Maverickflare);
		K48m = EnumHelper.addToolMaterial(Strings.Astralblast, 3, -1, 6.0F, 9, 30); K48 = new ItemAstralBlast(IDs.K48, K48m).setFull3D().setUnlocalizedName(Strings.Astralblast);
		K49m = EnumHelper.addToolMaterial(Strings.Darkerthandark, 3, -1, 6.0F, 8, 30); K49 = new ItemDarkerThanDark(IDs.K49, K49m).setFull3D().setUnlocalizedName(Strings.Darkerthandark);
		K50m = EnumHelper.addToolMaterial(Strings.Lunareclipse, 3, -1, 6.0F, 6, 30); K50 = new ItemLunarEclipse(IDs.K50, K50m).setFull3D().setUnlocalizedName(Strings.Lunareclipse);
		K51m = EnumHelper.addToolMaterial(Strings.Silentdirge, 3, -1, 6.0F, 7, 30); K51 = new ItemSilentDirge(IDs.K51, K51m).setFull3D().setUnlocalizedName(Strings.Silentdirge);
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
		K1c = new ItemVulpeusChain(IDs.K1c).setUnlocalizedName(Strings.VulpeusChain).setCreativeTab(KingdomKeys.KHCHITAB);
		K2c = new ItemUrsusChain(IDs.K2c).setUnlocalizedName(Strings.UrsusChain).setCreativeTab(KingdomKeys.KHCHITAB);
		K3c = new ItemUnicornisChain(IDs.K3c).setUnlocalizedName(Strings.UnicornisChain).setCreativeTab(KingdomKeys.KHCHITAB);
		K4c = new ItemLeopardosChain(IDs.K4c).setUnlocalizedName(Strings.LeopardosChain).setCreativeTab(KingdomKeys.KHCHITAB);
		K5c = new ItemAnguisChain(IDs.K5c).setUnlocalizedName(Strings.AnguisChain).setCreativeTab(KingdomKeys.KHCHITAB);
		K6c = new ItemLeasKeybladeChain(IDs.K6c).setUnlocalizedName(Strings.LeaskeybladeChain).setCreativeTab(KingdomKeys.KHDDDTAB);
		K7c = new ItemYoungXehanortChain(IDs.K7c).setUnlocalizedName(Strings.YoungxehanortskeybladeChain).setCreativeTab(KingdomKeys.KHDDDTAB);
		K8c = new ItemOceanRageChain(IDs.K8c).setUnlocalizedName(Strings.OceanrageChain).setCreativeTab(KingdomKeys.KHDDDTAB);
		K9c = new ItemEndOfPainChain(IDs.K9c).setUnlocalizedName(Strings.EndofpainChain).setCreativeTab(KingdomKeys.KHDDDTAB);
		K10c = new ItemUnboundChain(IDs.K10c).setUnlocalizedName(Strings.UnboundChain).setCreativeTab(KingdomKeys.KHDDDTAB);
		K11c = new ItemSweetDreamsChain(IDs.K11c).setUnlocalizedName(Strings.SweetdreamsChain).setCreativeTab(KingdomKeys.KHDDDTAB);
		K12c = new ItemDiveWingChain(IDs.K12c).setUnlocalizedName(Strings.DivewingChain).setCreativeTab(KingdomKeys.KHDDDTAB);
		K13c = new ItemCounterPointChain(IDs.K13c).setUnlocalizedName(Strings.CounterpointChain).setCreativeTab(KingdomKeys.KHDDDTAB);
		K14c = new ItemAllForOneChain(IDs.K14c).setUnlocalizedName(Strings.AllforoneChain).setCreativeTab(KingdomKeys.KHDDDTAB);
		K15c = new ItemKnockoutPunchChain(IDs.K15c).setUnlocalizedName(Strings.KnockoutpunchChain).setCreativeTab(KingdomKeys.KHDDDTAB);
		K16c = new ItemFerrisGearChain(IDs.K16c).setUnlocalizedName(Strings.FerrisgearChain).setCreativeTab(KingdomKeys.KHDDDTAB);
		K17c = new ItemDualDiscChain(IDs.K17c).setUnlocalizedName(Strings.DualdiscChain).setCreativeTab(KingdomKeys.KHDDDTAB);
		K18c = new ItemGuardianBellChain(IDs.K18c).setUnlocalizedName(Strings.GuardianbellChain).setCreativeTab(KingdomKeys.KHDDDTAB);
		K19c = new ItemSkullNoiseChain(IDs.K19c).setUnlocalizedName(Strings.SkullnoiseChain).setCreativeTab(KingdomKeys.KHDDDTAB);
		K20c = new ItemWoodenKeybladeChain(IDs.K20c).setUnlocalizedName(Strings.WoodenkeybladeChain).setCreativeTab(KingdomKeys.KHBBSTAB);
		K21c = new ItemKyeBladeBrokenChain(IDs.K21c).setUnlocalizedName(Strings.KyebladebrokenChain).setCreativeTab(KingdomKeys.KHBBSTAB);
		K22c = new ItemKyeBladeChain(IDs.K22c).setUnlocalizedName(Strings.KyebladeChain).setCreativeTab(KingdomKeys.KHBBSTAB);
		K23c = new ItemLightSeekerChain(IDs.K23c).setUnlocalizedName(Strings.LightseekerChain).setCreativeTab(KingdomKeys.KHBBSTAB);
		K24c = new ItemLostMemoryChain(IDs.K24c).setUnlocalizedName(Strings.LostmemoryChain).setCreativeTab(KingdomKeys.KHBBSTAB);
		K25c = new ItemFrolicFlameChain(IDs.K25c).setUnlocalizedName(Strings.FrolicflameChain).setCreativeTab(KingdomKeys.KHBBSTAB);
		K26c = new ItemMasterKeeperChain(IDs.K26c).setUnlocalizedName(Strings.MasterkeeperChain).setCreativeTab(KingdomKeys.KHBBSTAB);
		K27c = new ItemBrightCrestChain(IDs.K27c).setUnlocalizedName(Strings.BrigthcrestChain).setCreativeTab(KingdomKeys.KHBBSTAB);
		K28c = new ItemCrownUnlimitChain(IDs.K28c).setUnlocalizedName(Strings.CrownunlimitChain).setCreativeTab(KingdomKeys.KHBBSTAB);
		K29c = new ItemNoNameChain(IDs.K29c).setUnlocalizedName(Strings.NonameChain).setCreativeTab(KingdomKeys.KHBBSTAB);
		K30c = new ItemVoidGearChain(IDs.K30c).setUnlocalizedName(Strings.VoidgearChain).setCreativeTab(KingdomKeys.KHBBSTAB);
		K31c = new ItemSweetStackChain(IDs.K31c).setUnlocalizedName(Strings.SweetstackChain).setCreativeTab(KingdomKeys.KHBBSTAB);
		K32c = new ItemPixiePetalChain(IDs.K32c).setUnlocalizedName(Strings.PixiepetalChain).setCreativeTab(KingdomKeys.KHBBSTAB);
		K33c = new ItemHyperDriveChain(IDs.K33c).setUnlocalizedName(Strings.HyperdriveChain).setCreativeTab(KingdomKeys.KHBBSTAB);
		K34c = new ItemMarkOfAHeroChain(IDs.K34c).setUnlocalizedName(Strings.MarkofaheroChain).setCreativeTab(KingdomKeys.KHBBSTAB);
		K35c = new ItemVictoryLineChain(IDs.K35c).setUnlocalizedName(Strings.VictorylineChain).setCreativeTab(KingdomKeys.KHBBSTAB);
		K36c = new ItemFairyStarsChain(IDs.K36c).setUnlocalizedName(Strings.FairystarsChain).setCreativeTab(KingdomKeys.KHBBSTAB);
		K37c = new ItemStrokeOfMidnightChain(IDs.K37c).setUnlocalizedName(Strings.StrokeofmidnightChain).setCreativeTab(KingdomKeys.KHBBSTAB);
		K38c = new ItemChaosRipperChain(IDs.K38c).setUnlocalizedName(Strings.ChaosripperChain).setCreativeTab(KingdomKeys.KHBBSTAB);
		K39c = new ItemXehanortsKeybladeChain(IDs.K39c).setUnlocalizedName(Strings.XehanortskeybladeChain).setCreativeTab(KingdomKeys.KHBBSTAB);
		K40c = new ItemDarkGnawChain(IDs.K40c).setUnlocalizedName(Strings.DarkgnawChain).setCreativeTab(KingdomKeys.KHBBSTAB);
		K41c = new ItemZeroOneChain(IDs.K41c).setUnlocalizedName(Strings.ZerooneChain).setCreativeTab(KingdomKeys.KHRECODEDTAB);
		K42c = new ItemDreamSwordChain(IDs.K42c).setUnlocalizedName(Strings.DreamswordChain).setCreativeTab(KingdomKeys.KHDAYSTAB);
		K43c = new ItemAubadeChain(IDs.K43c).setUnlocalizedName(Strings.AubadeChain).setCreativeTab(KingdomKeys.KHDAYSTAB);
		K44c = new ItemUmbrellaChain(IDs.K44c).setUnlocalizedName(Strings.UmbrellaChain).setCreativeTab(KingdomKeys.KHDAYSTAB);
		K45c = new ItemOmegaWeaponChain(IDs.K45c).setUnlocalizedName(Strings.OmegaweaponChain).setCreativeTab(KingdomKeys.KHDAYSTAB);
		K46c = new ItemTwilightBlazeChain(IDs.K46c).setUnlocalizedName(Strings.TwilightblazeChain).setCreativeTab(KingdomKeys.KHDAYSTAB);
		K47c = new ItemMaverickFlareChain(IDs.K47c).setUnlocalizedName(Strings.MaverickflareChain).setCreativeTab(KingdomKeys.KHDAYSTAB);
		K48c = new ItemAstralBlastChain(IDs.K48c).setUnlocalizedName(Strings.AstralblastChain).setCreativeTab(KingdomKeys.KHDAYSTAB);
		K49c = new ItemDarkerThanDarkChain(IDs.K49c).setUnlocalizedName(Strings.DarkerthandarkChain).setCreativeTab(KingdomKeys.KHDAYSTAB);
		K50c = new ItemLunarEclipseChain(IDs.K50c).setUnlocalizedName(Strings.LunareclipseChain).setCreativeTab(KingdomKeys.KHDAYSTAB);
		K51c = new ItemSilentDirgeChain(IDs.K51c).setUnlocalizedName(Strings.SilentdirgeChain).setCreativeTab(KingdomKeys.KHDAYSTAB);
		K52c = new ItemTotalEclipseChain(IDs.K52c).setUnlocalizedName(Strings.TotaleclipseChain).setCreativeTab(KingdomKeys.KHDAYSTAB);
		K53c = new ItemGlimpseOfDarknessChain(IDs.K53c).setUnlocalizedName(Strings.GlimpseofdarknessChain).setCreativeTab(KingdomKeys.KHDAYSTAB);
		K54c = new ItemMidnightRoarChain(IDs.K54c).setUnlocalizedName(Strings.MidnightroarChain).setCreativeTab(KingdomKeys.KHDAYSTAB);
		K55c = new ItemRejectionOfFateChain(IDs.K55c).setUnlocalizedName(Strings.RejectionoffateChain).setCreativeTab(KingdomKeys.KHDAYSTAB);
		K56c = new ItemTrueLightsFlightChain(IDs.K56c).setUnlocalizedName(Strings.TruelightsflightChain).setCreativeTab(KingdomKeys.KHDAYSTAB);
		K57c = new ItemLeviathanChain(IDs.K57c).setUnlocalizedName(Strings.LeviathanChain).setCreativeTab(KingdomKeys.KHDAYSTAB);
		K58c = new ItemAbyssalTideChain(IDs.K58c).setUnlocalizedName(Strings.AbyssaltideChain).setCreativeTab(KingdomKeys.KHDAYSTAB);
		K59c = new ItemCrownOfGuiltChain(IDs.K59c).setUnlocalizedName(Strings.CrownofguiltChain).setCreativeTab(KingdomKeys.KHDAYSTAB);
		K60c = new ItemSignOfInnocenceChain(IDs.K60c).setUnlocalizedName(Strings.SignofinnocenceChain).setCreativeTab(KingdomKeys.KHDAYSTAB);
		K61c = new ItemPainOfSolitudeChain(IDs.K61c).setUnlocalizedName(Strings.PainofsolitudeChain).setCreativeTab(KingdomKeys.KHDAYSTAB);
		K62c = new ItemAbaddonPlasmaChain(IDs.K62c).setUnlocalizedName(Strings.AbbadonplasmaChain).setCreativeTab(KingdomKeys.KHDAYSTAB);
		K63c = new ItemOminousBlightChain(IDs.K63c).setUnlocalizedName(Strings.OminousblightChain).setCreativeTab(KingdomKeys.KHDAYSTAB);
		K64c = new ItemMissingAcheChain(IDs.K64c).setUnlocalizedName(Strings.MissingacheChain).setCreativeTab(KingdomKeys.KHDAYSTAB);
		K65c = new ItemWinnersProofChain(IDs.K65c).setUnlocalizedName(Strings.WinnersproofChain).setCreativeTab(KingdomKeys.KHIITAB);
		K66c = new ItemFatalCrestChain(IDs.K66c).setUnlocalizedName(Strings.FatalcrestChain).setCreativeTab(KingdomKeys.KHIITAB);
		K67c = new ItemTwoBecomeOneChain(IDs.K67c).setUnlocalizedName(Strings.TwobecomesoneChain).setCreativeTab(KingdomKeys.KHIITAB);
		K68c = new ItemBondOfFlameChain(IDs.K68c).setUnlocalizedName(Strings.BondofflameChain).setCreativeTab(KingdomKeys.KHIITAB);
		K69c = new ItemFenrirChain(IDs.K69c).setUnlocalizedName(Strings.FenrirChain).setCreativeTab(KingdomKeys.KHIITAB);
		K70c = new ItemSleepingLionChain(IDs.K70c).setUnlocalizedName(Strings.SleepinglionChain).setCreativeTab(KingdomKeys.KHIITAB);
		K71c = new ItemGuardianSoulChain(IDs.K71c).setUnlocalizedName(Strings.GuardiansoulChain).setCreativeTab(KingdomKeys.KHIITAB);
		K72c = new ItemGullWingChain(IDs.K72c).setUnlocalizedName(Strings.GullwingChain).setCreativeTab(KingdomKeys.KHIITAB);
		K73c = new ItemPhotonDebuggerChain(IDs.K73c).setUnlocalizedName(Strings.PhotondebuggerChain).setCreativeTab(KingdomKeys.KHIITAB);
		K74c = new ItemSweetMemoriesChain(IDs.K74c).setUnlocalizedName(Strings.SweetmemoriesChain).setCreativeTab(KingdomKeys.KHIITAB);
		K75c = new ItemCircleOfLifeChain(IDs.K75c).setUnlocalizedName(Strings.CircleoflifeChain).setCreativeTab(KingdomKeys.KHIITAB);
		K76c = new ItemDecisivePumpkinChain(IDs.K76c).setUnlocalizedName(Strings.DecisivepumpkinChain).setCreativeTab(KingdomKeys.KHIITAB);
		K77c = new ItemWishingLampChain(IDs.K77c).setUnlocalizedName(Strings.WishinglampChain).setCreativeTab(KingdomKeys.KHIITAB);
		K78c = new ItemFollowTheWindChain(IDs.K78c).setUnlocalizedName(Strings.FollowthewindChain).setCreativeTab(KingdomKeys.KHIITAB);
		K79c = new ItemMysteriousAbyssChain(IDs.K79c).setUnlocalizedName(Strings.MysteriousabyssChain).setCreativeTab(KingdomKeys.KHIITAB);
		K80c = new ItemMonochromeChain(IDs.K80c).setUnlocalizedName(Strings.MonochromeChain).setCreativeTab(KingdomKeys.KHIITAB);
		K81c = new ItemHerosCrestChain(IDs.K81c).setUnlocalizedName(Strings.HeroscrestChain).setCreativeTab(KingdomKeys.KHIITAB);
		K82c = new ItemRumblingRoseChain(IDs.K82c).setUnlocalizedName(Strings.RumblingroseChain).setCreativeTab(KingdomKeys.KHIITAB);
		K83c = new ItemHiddenDragonChain(IDs.K83c).setUnlocalizedName(Strings.HiddendragonChain).setCreativeTab(KingdomKeys.KHIITAB);
		K84c = new ItemEndsOfEarthChain(IDs.K84c).setUnlocalizedName(Strings.EndsofearthChain).setCreativeTab(KingdomKeys.KHIITAB);
		K85c = new ItemStormFallChain(IDs.K85c).setUnlocalizedName(Strings.StormfallChain).setCreativeTab(KingdomKeys.KHIITAB);
		K86c = new ItemDestinysEmbraceChain(IDs.K86c).setUnlocalizedName(Strings.DestinysembraceChain).setCreativeTab(KingdomKeys.KHIITAB);
		K87c = new ItemWayToTheDawnChain(IDs.K87c).setUnlocalizedName(Strings.WaytodawnChain).setCreativeTab(KingdomKeys.KHIITAB);
		K88c = new ItemOneWingedAngelChain(IDs.K88c).setUnlocalizedName(Strings.OnewingedangelChain).setCreativeTab(KingdomKeys.KHTAB);
		K89c = new ItemDiamondDustChain(IDs.K89c).setUnlocalizedName(Strings.DiamonddustChain).setCreativeTab(KingdomKeys.KHTAB);
		K90c = new ItemLionHeartChain(IDs.K90c).setUnlocalizedName(Strings.LionheartChain).setCreativeTab(KingdomKeys.KHTAB);
		K91c = new ItemMetalChocoboChain(IDs.K91c).setUnlocalizedName(Strings.MetalchocoboChain).setCreativeTab(KingdomKeys.KHTAB);
		K92c = new ItemSpellBinderChain(IDs.K92c).setUnlocalizedName(Strings.SpellbinderChain).setCreativeTab(KingdomKeys.KHTAB);
		K93c = new ItemDivineRoseChain(IDs.K93c).setUnlocalizedName(Strings.DivineroseChain).setCreativeTab(KingdomKeys.KHTAB);
		K94c = new ItemFairyHarpChain(IDs.K94c).setUnlocalizedName(Strings.FairyharpChain).setCreativeTab(KingdomKeys.KHTAB);
		K95c = new ItemCrabClawChain(IDs.K95c).setUnlocalizedName(Strings.CrabclawChain).setCreativeTab(KingdomKeys.KHTAB);
		K96c = new ItemWishingStarChain(IDs.K96c).setUnlocalizedName(Strings.WishingstarChain).setCreativeTab(KingdomKeys.KHTAB);
		K97c = new ItemPumpkinHeadChain(IDs.K97c).setUnlocalizedName(Strings.PumpkinheadChain).setCreativeTab(KingdomKeys.KHTAB);
		K98c = new ItemThreeWishesChain(IDs.K98c).setUnlocalizedName(Strings.ThreewishesChain).setCreativeTab(KingdomKeys.KHTAB);
		K99c = new ItemJunglekingChain(IDs.K99c).setUnlocalizedName(Strings.JunglekingChain).setCreativeTab(KingdomKeys.KHTAB);
		K100c = new ItemOlympiaChain(IDs.K100c).setUnlocalizedName(Strings.OlympiaChain).setCreativeTab(KingdomKeys.KHTAB);
		K101c = new ItemLadyLuckChain(IDs.K101c).setUnlocalizedName(Strings.LadyluckChain).setCreativeTab(KingdomKeys.KHTAB);
		K102c = new ItemPeoplesHeartsChain(IDs.K102c).setUnlocalizedName(Strings.PeoplesheartsChain).setCreativeTab(KingdomKeys.KHTAB);
		K103c = new ItemUltimaWeaponChain(IDs.K103c).setUnlocalizedName(Strings.UltimaweaponChain).setCreativeTab(KingdomKeys.KHTAB);
		K104c = new ItemTreasureTroveChain(IDs.K104c).setUnlocalizedName(Strings.TreasuretroveChain).setCreativeTab(KingdomKeys.KHBBSTAB);
		K105c = new ItemStarSeekerChain(IDs.K105c).setUnlocalizedName(Strings.StarseekerChain).setCreativeTab(KingdomKeys.KHIITAB);
		K106c = new ItemSoulEaterChain(IDs.K106c).setUnlocalizedName(Strings.SouleaterChain).setCreativeTab(KingdomKeys.KHDAYSTAB);
		K107c = new ItemStarlightChain(IDs.K107c).setUnlocalizedName(Strings.StarlightChain).setCreativeTab(KingdomKeys.KHCHITAB);
		K111c = new ItemKingdomKeyChain(IDs.K111c).setUnlocalizedName(Strings.KingdomKeyChain).setCreativeTab(KingdomKeys.KHTAB);
		K113c = new ItemKingdomKeyDChain(IDs.K113c).setUnlocalizedName(Strings.KingdomKeyDChain).setCreativeTab(KingdomKeys.KHTAB);
		K112c = new ItemOathkeeperChain(IDs.K112c).setUnlocalizedName(Strings.OathkeeperChain).setCreativeTab(KingdomKeys.KHTAB);
		K114c = new ItemOblivionChain(IDs.K114c).setUnlocalizedName(Strings.OblivionChain).setCreativeTab(KingdomKeys.KHTAB);
		K110c = new ItemWaywardWindChain(IDs.K110c).setUnlocalizedName(Strings.WaywardwindChain).setCreativeTab(KingdomKeys.KHBBSTAB);
		K109c = new ItemEarthShakerChain(IDs.K109c).setUnlocalizedName(Strings.EarthshakerChain).setCreativeTab(KingdomKeys.KHBBSTAB);
		K108c = new ItemRainFellChain(IDs.K108c).setUnlocalizedName(Strings.RainfellChain).setCreativeTab(KingdomKeys.KHBBSTAB);
	}
	
	public static void initBooks(){

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

	public static void initItemrecipes(){
		ItemStack kkGuide = new ItemStack(Item.writableBook);
		NBTTagList bookPages = new NBTTagList("pages");
		bookPages.appendTag(new NBTTagString("1", "Insert text here."));
		bookPages.appendTag(new NBTTagString("2", "Insert moar text here."));
		kkGuide.setTagInfo("pages", bookPages);
		kkGuide.setTagInfo("author", new NBTTagString("author", "Wehavecookies56"));
		kkGuide.setTagInfo("title", new NBTTagString("title", "Kingdom Keys"));
		kkGuide.itemID = Item.writtenBook.itemID;
		
		ItemStack greenDye = new ItemStack(Item.dyePowder, 1, 2);
		ItemStack blueDye = new ItemStack(Item.dyePowder, 1, 4);
		ItemStack blackDye = new ItemStack(Item.dyePowder, 1, 0);
		ItemStack yellowDye = new ItemStack(Item.dyePowder, 1, 11);
		if(ConfigBooleans.heartRecipe == false){
			GameRegistry.addRecipe(new ItemStack(Heart), new Object[]{
				" D ",
				"DSD",
				" D ",
				'S', Block.slowSand, 'D', DarkHeart
			});
		}
		if(ConfigBooleans.heartRecipe == true){
			GameRegistry.addRecipe(new ItemStack(Heart), new Object[]{
				"DDD",
				"DSD",
				"DDD",
				'S', Block.slowSand, 'D', DarkHeart
			});
		}
		if(ConfigBooleans.heartRecipe == false){
			GameRegistry.addRecipe(new ItemStack(PureHeart), new Object[]{
				" D ",
				"DSD",
				" D ",
				'S', Block.slowSand, 'D', Heart
			});
		}
		if(ConfigBooleans.heartRecipe == true){
			GameRegistry.addRecipe(new ItemStack(PureHeart), new Object[]{
				"DDD",
				"DSD",
				"DDD",
				'S', Block.slowSand, 'D', Heart
			});
		}
		if(ConfigBooleans.heartRecipe == false){
			GameRegistry.addRecipe(new ItemStack(KingdomHearts), new Object[]{
				" D ",
				"DSD",
				" D ",
				'S', Block.slowSand, 'D', PureHeart
			});
		}
		if(ConfigBooleans.heartRecipe == true){
			GameRegistry.addRecipe(new ItemStack(KingdomHearts), new Object[]{
				"DDD",
				"DSD",
				"DDD",
				'S', Block.slowSand, 'D', PureHeart
			});
		}
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
		GameRegistry.addRecipe(new ItemStack(K111c), new Object[]{
			"IPI",
			"IPI",
			"IPI",
			'P', PureHeart, 'I', Item.ingotIron
		});
		GameRegistry.addRecipe(new ItemStack(K113c), new Object[]{
			"GPG",
			"GPG",
			"GPG",
			'P', PureHeart, 'G', Item.ingotGold
		});
		GameRegistry.addRecipe(new ItemStack(K112c), new Object[]{
			"GPG",
			"GKG",
			"GPG",
			'P', PureHeart, 'G', Item.ingotIron, 'K', KingdomHearts
		});
		GameRegistry.addRecipe(new ItemStack(K110c), new Object[]{
			"IPI",
			"GKG",
			"IPI",
			'P', PureHeart, 'I', Item.ingotIron, 'K', KingdomHearts, 'G', greenDye 
		});
		GameRegistry.addRecipe(new ItemStack(K109c), new Object[]{
			"GPG",
			"IKI",
			"IPI",
			'P', PureHeart, 'I', Item.ingotIron, 'K', KingdomHearts, 'G', Item.ingotGold
		});
		GameRegistry.addRecipe(new ItemStack(K108c), new Object[]{
			"IPI",
			"LKW",
			"IPI",
			'P', PureHeart, 'I', Item.ingotIron, 'K', KingdomHearts, 'L', blueDye, 'W', Item.bucketWater 
		});
		GameRegistry.addRecipe(new ItemStack(KeybladeTHelm), new Object[]{
			"DED",
			"PKP",
			'P', PureHeart, 'D', DarkHeart, 'K', KingdomHearts, 'E', K109
		});
		GameRegistry.addRecipe(new ItemStack(KeybladeAHelm), new Object[]{
			"HRH",
			"PKP",
			'P', PureHeart, 'H', Heart, 'K', KingdomHearts, 'R', K108
		});
		GameRegistry.addRecipe(new ItemStack(KeybladeVHelm), new Object[]{
			"PWP",
			"PKP",
			'P', PureHeart, 'K', KingdomHearts, 'W', K110
		});
		GameRegistry.addRecipe(new ItemStack(KeybladeTChest), new Object[]{
			"DED",
			"PKP",
			"PKP",
			'P', PureHeart, 'D', DarkHeart, 'K', KingdomHearts, 'E', K109
		});
		GameRegistry.addRecipe(new ItemStack(KeybladeAChest), new Object[]{
			"HRH",
			"PKP",
			"PKP",
			'P', PureHeart, 'H', Heart, 'K', KingdomHearts, 'R', K108
		});
		GameRegistry.addRecipe(new ItemStack(KeybladeVChest), new Object[]{
			"PWP",
			"PKP",
			"PKP",
			'P', PureHeart, 'K', KingdomHearts, 'W', K110
		});
		GameRegistry.addRecipe(new ItemStack(KeybladeTLegs), new Object[]{
			"DED",
			"PKP",
			"PKP",
			'P', PureHeart, 'D', DarkHeart, 'K', KingdomHearts, 'E', K109
		});
		GameRegistry.addRecipe(new ItemStack(KeybladeALegs), new Object[]{
			"HRH",
			"PKP",
			"P P",
			'P', PureHeart, 'H', Heart, 'K', KingdomHearts, 'R', K108
		});
		GameRegistry.addRecipe(new ItemStack(KeybladeVLegs), new Object[]{
			"PWP",
			"PKP",
			"P P",
			'P', PureHeart, 'K', KingdomHearts, 'W', K110
		});
		GameRegistry.addRecipe(new ItemStack(KeybladeTBoots), new Object[]{
			"DED",
			"HKH",
			'P', PureHeart, 'D', DarkHeart, 'K', KingdomHearts, 'E', K109, 'H', Heart
		});
		GameRegistry.addRecipe(new ItemStack(KeybladeABoots), new Object[]{
			"HWH",
			"HKH",
			'P', PureHeart, 'H', Heart, 'K', KingdomHearts, 'R', K108
		});
		GameRegistry.addRecipe(new ItemStack(KeybladeVBoots), new Object[]{
			"PWP",
			"HKH",
			'P', PureHeart, 'K', KingdomHearts, 'W', K110, 'H', Heart
		});
		
		GameRegistry.addRecipe(new ItemStack(BlazingShard), new Object[]{
			"F F",
			"NRN",
			'F', Item.flint, 'R', Item.blazeRod, 'N', Block.netherrack
		});
		
		GameRegistry.addRecipe(new ItemStack(BlazingStone), new Object[]{
			"FGF",
			"NRN",
			"&  ",
			'F', Item.flint, 'R', Item.blazeRod, 'N', Block.netherrack, '&', Item.flintAndSteel, 'G', Item.gunpowder
		});
		
		GameRegistry.addRecipe(new ItemStack(BlazingGem), new Object[]{
			"DGD",
			"NRN",
			"&  ",
			'D', Item.redstone, 'R', Item.blazeRod, 'N', Block.netherrack, '&', Item.flintAndSteel, 'G', Item.gunpowder
		});
		
		GameRegistry.addRecipe(new ItemStack(BlazingCrystal), new Object[]{
			"DGD",
			"NRN",
			"&  ",
			'D', Item.redstone, 'R', Item.blazeRod, 'N', Block.netherrack, '&', Item.flintAndSteel, 'G', Item.diamond
		});
		
		GameRegistry.addRecipe(new ItemStack(FrostShard), new Object[]{
			"B B",
			"SWS",
			'B', Item.snowball, 'S', Block.snow, 'W', Item.bucketWater
		});
		
		GameRegistry.addRecipe(new ItemStack(FrostStone), new Object[]{
			"BGB",
			"SWS",
			"&  ",
			'B', Item.snowball, 'W', Item.bucketWater, 'S', Block.snow, '&', Block.ice, 'G', Item.gunpowder
		});
		
		GameRegistry.addRecipe(new ItemStack(FrostGem), new Object[]{
			"LGL",
			"SWS",
			"&  ",
			'L', blueDye, 'W', Item.bucketWater, 'S', Block.snow, '&', Block.ice, 'G', Item.gunpowder
		});
		
		GameRegistry.addRecipe(new ItemStack(FrostCrystal), new Object[]{
			"LGL",
			"NRN",
			"&  ",
			'L', blueDye, 'W', Item.bucketWater, 'S', Block.snow, '&', Block.ice, 'G', Item.diamond
		});
		
		GameRegistry.addRecipe(new ItemStack(LightningShard), new Object[]{
			"B B",
			"SYS",
			'B', Item.redstone, 'S', Block.stone, 'Y', yellowDye
		});
		
		GameRegistry.addRecipe(new ItemStack(LightningStone), new Object[]{
			"BGB",
			"SYS",
			"&  ",
			'B', Item.redstone, 'Y', yellowDye, 'S', Block.stone, '&', Block.blockRedstone, 'G', Item.gunpowder
		});
		
		GameRegistry.addRecipe(new ItemStack(LightningGem), new Object[]{
			"LGL",
			"SWS",
			"&  ",
			'L', Item.blazePowder, 'W', yellowDye, 'S', Block.stone, '&', Block.blockRedstone, 'G', Item.gunpowder
		});
		
		GameRegistry.addRecipe(new ItemStack(LightningCrystal), new Object[]{
			"DGD",
			"NRN",
			"&  ",
			'D', Item.blazePowder, 'W', yellowDye, 'S', Block.stone, '&', Block.blockRedstone, 'G', Item.diamond
		});
		

		GameRegistry.addShapelessRecipe(kkGuide = new ItemStack(Item.writableBook), new ItemStack(Item.book, 1), new ItemStack(Heart, 1), new ItemStack(DarkHeart, 1));
		//GameRegistry.addShapelessRecipe(new ItemStack(K114), new ItemStack(K114c, 1), new ItemStack(Item.swordIron, 1));
		//GameRegistry.addSmelting(K111.itemID, new ItemStack(Disc1), 0.1f);

	}
}