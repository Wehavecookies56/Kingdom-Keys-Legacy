package wehavecookies56.kk.client;

import java.util.EnumSet;

import net.minecraft.client.settings.KeyBinding;
import wehavecookies56.kk.item.keyblades.*;
import cpw.mods.fml.client.registry.KeyBindingRegistry.KeyHandler;
import cpw.mods.fml.common.TickType;

public class KeyBind extends KeyHandler{

	public static boolean keyPressed = false;
	public static boolean keyHasBeenPressed = false;
	private EnumSet tickTypes = EnumSet.of(TickType.CLIENT);

	public KeyBind(KeyBinding[] keyBindings, boolean[] repeatings)
	{
		super(keyBindings, repeatings);
	}
	@Override
	public void keyDown(EnumSet<TickType> types, KeyBinding kb, boolean tickEnd, boolean isRepeat)
	{
		keyHasBeenPressed = true;
		ItemAbaddonplasma.keyHasBeenPressed = true;
		ItemAbyssalTide.keyHasBeenPressed = true;
		ItemAllForOne.keyHasBeenPressed = true;
		ItemVulpeus.keyHasBeenPressed = true;
		ItemUrsus.keyHasBeenPressed = true;
		ItemUnicornis.keyHasBeenPressed = true;
		ItemLeopardos.keyHasBeenPressed = true;
		ItemAnguis.keyHasBeenPressed = true;
		ItemLeasKeyblade.keyHasBeenPressed = true;
		ItemYoungXehanort.keyHasBeenPressed = true;
		ItemOceanRage.keyHasBeenPressed = true;
		ItemEndOfPain.keyHasBeenPressed = true;
		ItemUnbound.keyHasBeenPressed = true;
		ItemSweetDreams.keyHasBeenPressed = true;
		ItemDiveWing.keyHasBeenPressed = true;
		ItemCounterPoint.keyHasBeenPressed = true;
		ItemKnockoutPunch.keyHasBeenPressed = true;
		ItemFerrisGear.keyHasBeenPressed = true;
		ItemDualDisc.keyHasBeenPressed = true;
		ItemGuardianBell.keyHasBeenPressed = true;
		ItemSkullNoise.keyHasBeenPressed = true;
		ItemWoodenKeyBlade.keyHasBeenPressed = true;
		ItemkyeBladeBroken.keyHasBeenPressed = true;
		ItemkyeBlade.keyHasBeenPressed = true;
		ItemLightSeeker.keyHasBeenPressed = true;
		ItemLostMemory.keyHasBeenPressed = true;
		ItemFrolicFlame.keyHasBeenPressed = true;
		ItemMasterKeeper.keyHasBeenPressed = true;
		ItemBrightCrest.keyHasBeenPressed = true;
		ItemCrownUnLimit.keyHasBeenPressed = true;
		ItemNoName.keyHasBeenPressed = true;
		ItemVoidGear.keyHasBeenPressed = true;
		ItemSweetStack.keyHasBeenPressed = true;
		ItemPixiePetal.keyHasBeenPressed = true;
		ItemHyperDrive.keyHasBeenPressed = true;
		ItemMarkOfAHero.keyHasBeenPressed = true;
		ItemVictoryLine.keyHasBeenPressed = true;
		ItemFairyStars.keyHasBeenPressed = true;
		ItemStrokeOfMidnight.keyHasBeenPressed = true;
		ItemChaosRipper.keyHasBeenPressed = true;
		ItemXehanortsKeyblade.keyHasBeenPressed = true;
		ItemDarkGnaw.keyHasBeenPressed = true;
		ItemZeroOne.keyHasBeenPressed = true;
		ItemDreamSword.keyHasBeenPressed = true;
		ItemAubade.keyHasBeenPressed = true;
		ItemUmbrella.keyHasBeenPressed = true;
		ItemOmegaWeapon.keyHasBeenPressed = true;
		ItemTwilightBlaze.keyHasBeenPressed = true;
		ItemMaverickFlare.keyHasBeenPressed = true;
		ItemAstralBlast.keyHasBeenPressed = true;
		ItemDarkerThanDark.keyHasBeenPressed = true;
		ItemLunarEclipse.keyHasBeenPressed = true;
		ItemSilentDirge.keyHasBeenPressed = true;
		ItemTotalEclipse.keyHasBeenPressed = true;
		ItemGlimpseOfDarkness.keyHasBeenPressed = true;
		ItemMidnightRoar.keyHasBeenPressed = true;
		ItemRejectionOfFate.keyHasBeenPressed = true;
		ItemTrueLightsFlight.keyHasBeenPressed = true;
		ItemLeviathan.keyHasBeenPressed = true;
		ItemCrownOfGuilt.keyHasBeenPressed = true;
		ItemSignOfInnocence.keyHasBeenPressed = true;
		ItemPainOfSolitude.keyHasBeenPressed = true;
		ItemOminousBlight.keyHasBeenPressed = true;
		ItemMissingAche.keyHasBeenPressed = true;
		ItemWinnersProof.keyHasBeenPressed = true;
		ItemFatalCrest.keyHasBeenPressed = true;
		ItemTwoBecomeOne.keyHasBeenPressed = true;
		ItemBondOfFlame.keyHasBeenPressed = true;
		ItemFenrir.keyHasBeenPressed = true;
		ItemSleepingLion.keyHasBeenPressed = true;
		ItemGuardianSoul.keyHasBeenPressed = true;
		ItemGullWing.keyHasBeenPressed = true;
		ItemPhotonDebugger.keyHasBeenPressed = true;
		ItemSweetMemories.keyHasBeenPressed = true;
		ItemCircleOfLife.keyHasBeenPressed = true;
		ItemDecisivePumpkin.keyHasBeenPressed = true;
		ItemWishingLamp.keyHasBeenPressed = true;
		ItemFollowTheWind.keyHasBeenPressed = true;
		ItemMysteriousAbyss.keyHasBeenPressed = true;
		ItemMonochrome.keyHasBeenPressed = true;
		ItemHerosCrest.keyHasBeenPressed = true;
		ItemRumblingRose.keyHasBeenPressed = true;
		ItemHiddenDragon.keyHasBeenPressed = true;
		ItemEndsOfEarth.keyHasBeenPressed = true;
		ItemStormFall.keyHasBeenPressed = true;
		ItemDestinysEmbrace.keyHasBeenPressed = true;
		ItemWayToDawn.keyHasBeenPressed = true;
		ItemOneWingedAngel.keyHasBeenPressed = true;
		ItemDiamondDust.keyHasBeenPressed = true;
		ItemLionHeart.keyHasBeenPressed = true;
		ItemMetalChocobo.keyHasBeenPressed = true;
		ItemSpellbinder.keyHasBeenPressed = true;
		ItemDivineRose.keyHasBeenPressed = true;
		ItemFairyHarp.keyHasBeenPressed = true;
		ItemCrabClaw.keyHasBeenPressed = true;
		ItemWishingStar.keyHasBeenPressed = true;
		ItemPumpkinHead.keyHasBeenPressed = true;
		ItemThreeWishes.keyHasBeenPressed = true;
		ItemJungleKing.keyHasBeenPressed = true;
		ItemOlympia.keyHasBeenPressed = true;
		ItemLadyLuck.keyHasBeenPressed = true;
		ItemKeybladeOfPeoplesHearts.keyHasBeenPressed = true;
		ItemUltimaWeapon.keyHasBeenPressed = true;
		ItemTreasureTrove.keyHasBeenPressed = true;
		ItemStarseeker.keyHasBeenPressed = true;
		ItemSoulEater.keyHasBeenPressed = true;
		ItemStarLight.keyHasBeenPressed = true;
		ItemRainFell.keyHasBeenPressed = true;
		ItemEarthShaker.keyHasBeenPressed = true;
		ItemWaywardWind.keyHasBeenPressed = true;
		ItemKingdomKey.keyHasBeenPressed = true;
		ItemOathKeeper.keyHasBeenPressed = true;
		ItemKingdomKeyD.keyHasBeenPressed = true;
		ItemOblivion.keyHasBeenPressed = true;
	}
	@Override
	public void keyUp(EnumSet<TickType> types, KeyBinding kb, boolean tickEnd)
	{
		if (keyHasBeenPressed) {
			keyHasBeenPressed = false;
			keyPressed = true;
		}
		
		if (ItemAbaddonplasma.keyHasBeenPressed) {
			ItemAbaddonplasma.keyHasBeenPressed = false;
			ItemAbaddonplasma.keyPressed = true;
		}
		
		if (ItemAbyssalTide.keyHasBeenPressed) {
			ItemAbyssalTide.keyHasBeenPressed = false;
			ItemAbyssalTide.keyPressed = true;
		}
		
		if (ItemAllForOne.keyHasBeenPressed) {
			ItemAllForOne.keyHasBeenPressed = false;
			ItemAllForOne.keyPressed = true;
		}
		
		if (ItemVulpeus.keyHasBeenPressed) {
			ItemVulpeus.keyHasBeenPressed = false;
			ItemVulpeus.keyPressed = true;
		}
		
		if (ItemUrsus.keyHasBeenPressed) {
			ItemUrsus.keyHasBeenPressed = false;
			ItemUrsus.keyPressed = true;
		}
		
		if (ItemUnicornis.keyHasBeenPressed) {
			ItemUnicornis.keyHasBeenPressed = false;
			ItemUnicornis.keyPressed = true;
		}
		
		if (ItemLeopardos.keyHasBeenPressed) {
			ItemLeopardos.keyHasBeenPressed = false;
			ItemLeopardos.keyPressed = true;
		}
		
		if (ItemAnguis.keyHasBeenPressed) {
			ItemAnguis.keyHasBeenPressed = false;
			ItemAnguis.keyPressed = true;
		}
		
		if (ItemLeasKeyblade.keyHasBeenPressed) {
			ItemLeasKeyblade.keyHasBeenPressed = false;
			ItemLeasKeyblade.keyPressed = true;
		}
		
		if (ItemYoungXehanort.keyHasBeenPressed) {
			ItemYoungXehanort.keyHasBeenPressed = false;
			ItemYoungXehanort.keyPressed = true;
		}
		
		if (ItemOceanRage.keyHasBeenPressed) {
			ItemOceanRage.keyHasBeenPressed = false;
			ItemOceanRage.keyPressed = true;
		}
		
		if (ItemEndOfPain.keyHasBeenPressed) {
			ItemEndOfPain.keyHasBeenPressed = false;
			ItemEndOfPain.keyPressed = true;
		}
		
		if (ItemUnbound.keyHasBeenPressed) {
			ItemUnbound.keyHasBeenPressed = false;
			ItemUnbound.keyPressed = true;
		}
		
		if (ItemSweetDreams.keyHasBeenPressed) {
			ItemSweetDreams.keyHasBeenPressed = false;
			ItemSweetDreams.keyPressed = true;
		}
		
		if (ItemDiveWing.keyHasBeenPressed) {
			ItemDiveWing.keyHasBeenPressed = false;
			ItemDiveWing.keyPressed = true;
		}
		
		if (ItemCounterPoint.keyHasBeenPressed) {
			ItemCounterPoint.keyHasBeenPressed = false;
			ItemCounterPoint.keyPressed = true;
		}
		
		if (ItemKnockoutPunch.keyHasBeenPressed) {
			ItemKnockoutPunch.keyHasBeenPressed = false;
			ItemKnockoutPunch.keyPressed = true;
		}
		
		if (ItemFerrisGear.keyHasBeenPressed) {
			ItemFerrisGear.keyHasBeenPressed = false;
			ItemFerrisGear.keyPressed = true;
		}
		
		if (ItemDualDisc.keyHasBeenPressed) {
			ItemDualDisc.keyHasBeenPressed = false;
			ItemDualDisc.keyPressed = true;
		}
		
		if (ItemGuardianBell.keyHasBeenPressed) {
			ItemGuardianBell.keyHasBeenPressed = false;
			ItemGuardianBell.keyPressed = true;
		}
		
		if (ItemSkullNoise.keyHasBeenPressed) {
			ItemSkullNoise.keyHasBeenPressed = false;
			ItemSkullNoise.keyPressed = true;
		}
		
		if (ItemWoodenKeyBlade.keyHasBeenPressed) {
			ItemWoodenKeyBlade.keyHasBeenPressed = false;
			ItemWoodenKeyBlade.keyPressed = true;
		}
		
		if (ItemkyeBladeBroken.keyHasBeenPressed) {
			ItemkyeBladeBroken.keyHasBeenPressed = false;
			ItemkyeBladeBroken.keyPressed = true;
		}
		
		if (ItemkyeBlade.keyHasBeenPressed) {
			ItemkyeBlade.keyHasBeenPressed = false;
			ItemkyeBlade.keyPressed = true;
		}
		
		if (ItemLightSeeker.keyHasBeenPressed) {
			ItemLightSeeker.keyHasBeenPressed = false;
			ItemLightSeeker.keyPressed = true;
		}
		
		if (ItemLostMemory.keyHasBeenPressed) {
			ItemLostMemory.keyHasBeenPressed = false;
			ItemLostMemory.keyPressed = true;
		}
		
		if (ItemFrolicFlame.keyHasBeenPressed) {
			ItemFrolicFlame.keyHasBeenPressed = false;
			ItemFrolicFlame.keyPressed = true;
		}
		
		if (ItemMasterKeeper.keyHasBeenPressed) {
			ItemMasterKeeper.keyHasBeenPressed = false;
			ItemMasterKeeper.keyPressed = true;
		}
		
		if (ItemBrightCrest.keyHasBeenPressed) {
			ItemBrightCrest.keyHasBeenPressed = false;
			ItemBrightCrest.keyPressed = true;
		}
		
		if (ItemCrownUnLimit.keyHasBeenPressed) {
			ItemCrownUnLimit.keyHasBeenPressed = false;
			ItemCrownUnLimit.keyPressed = true;
		}
		
		if (ItemNoName.keyHasBeenPressed) {
			ItemNoName.keyHasBeenPressed = false;
			ItemNoName.keyPressed = true;
		}
		
		if (ItemVoidGear.keyHasBeenPressed) {
			ItemVoidGear.keyHasBeenPressed = false;
			ItemVoidGear.keyPressed = true;
		}
		
		if (ItemSweetStack.keyHasBeenPressed) {
			ItemSweetStack.keyHasBeenPressed = false;
			ItemSweetStack.keyPressed = true;
		}
		
		if (ItemPixiePetal.keyHasBeenPressed) {
			ItemPixiePetal.keyHasBeenPressed = false;
			ItemPixiePetal.keyPressed = true;
		}
		
		if (ItemHyperDrive.keyHasBeenPressed) {
			ItemHyperDrive.keyHasBeenPressed = false;
			ItemHyperDrive.keyPressed = true;
		}
		
		if (ItemMarkOfAHero.keyHasBeenPressed) {
			ItemMarkOfAHero.keyHasBeenPressed = false;
			ItemMarkOfAHero.keyPressed = true;
		}
		
		if (ItemVictoryLine.keyHasBeenPressed) {
			ItemVictoryLine.keyHasBeenPressed = false;
			ItemVictoryLine.keyPressed = true;
		}
		
		if (ItemFairyStars.keyHasBeenPressed) {
			ItemFairyStars.keyHasBeenPressed = false;
			ItemFairyStars.keyPressed = true;
		}
		
		if (ItemStrokeOfMidnight.keyHasBeenPressed) {
			ItemStrokeOfMidnight.keyHasBeenPressed = false;
			ItemStrokeOfMidnight.keyPressed = true;
		}
		
		if (ItemChaosRipper.keyHasBeenPressed) {
			ItemChaosRipper.keyHasBeenPressed = false;
			ItemChaosRipper.keyPressed = true;
		}
		
		if (ItemXehanortsKeyblade.keyHasBeenPressed) {
			ItemXehanortsKeyblade.keyHasBeenPressed = false;
			ItemXehanortsKeyblade.keyPressed = true;
		}
		
		if (ItemDarkGnaw.keyHasBeenPressed) {
			ItemDarkGnaw.keyHasBeenPressed = false;
			ItemDarkGnaw.keyPressed = true;
		}
		
		if (ItemZeroOne.keyHasBeenPressed) {
			ItemZeroOne.keyHasBeenPressed = false;
			ItemZeroOne.keyPressed = true;
		}
		
		if (ItemDreamSword.keyHasBeenPressed) {
			ItemDreamSword.keyHasBeenPressed = false;
			ItemDreamSword.keyPressed = true;
		}
		
		if (ItemAubade.keyHasBeenPressed) {
			ItemAubade.keyHasBeenPressed = false;
			ItemAubade.keyPressed = true;
		}
		
		if (ItemUmbrella.keyHasBeenPressed) {
			ItemUmbrella.keyHasBeenPressed = false;
			ItemUmbrella.keyPressed = true;
		}
		
		if (ItemOmegaWeapon.keyHasBeenPressed) {
			ItemOmegaWeapon.keyHasBeenPressed = false;
			ItemOmegaWeapon.keyPressed = true;
		}
		
		if (ItemTwilightBlaze.keyHasBeenPressed) {
			ItemTwilightBlaze.keyHasBeenPressed = false;
			ItemTwilightBlaze.keyPressed = true;
		}
		
		if (ItemMaverickFlare.keyHasBeenPressed) {
			ItemMaverickFlare.keyHasBeenPressed = false;
			ItemMaverickFlare.keyPressed = true;
		}
		
		if (ItemAstralBlast.keyHasBeenPressed) {
			ItemAstralBlast.keyHasBeenPressed = false;
			ItemAstralBlast.keyPressed = true;
		}
		
		if (ItemDarkerThanDark.keyHasBeenPressed) {
			ItemDarkerThanDark.keyHasBeenPressed = false;
			ItemDarkerThanDark.keyPressed = true;
		}
		
		if (ItemLunarEclipse.keyHasBeenPressed) {
			ItemLunarEclipse.keyHasBeenPressed = false;
			ItemLunarEclipse.keyPressed = true;
		}
		
		if (ItemSilentDirge.keyHasBeenPressed) {
			ItemSilentDirge.keyHasBeenPressed = false;
			ItemSilentDirge.keyPressed = true;
		}
		
		if (ItemTotalEclipse.keyHasBeenPressed) {
			ItemTotalEclipse.keyHasBeenPressed = false;
			ItemTotalEclipse.keyPressed = true;
		}
		
		if (ItemGlimpseOfDarkness.keyHasBeenPressed) {
			ItemGlimpseOfDarkness.keyHasBeenPressed = false;
			ItemGlimpseOfDarkness.keyPressed = true;
		}
		
		if (ItemMidnightRoar.keyHasBeenPressed) {
			ItemMidnightRoar.keyHasBeenPressed = false;
			ItemMidnightRoar.keyPressed = true;
		}
		
		if (ItemRejectionOfFate.keyHasBeenPressed) {
			ItemRejectionOfFate.keyHasBeenPressed = false;
			ItemRejectionOfFate.keyPressed = true;
		}
		
		if (ItemTrueLightsFlight.keyHasBeenPressed) {
			ItemTrueLightsFlight.keyHasBeenPressed = false;
			ItemTrueLightsFlight.keyPressed = true;
		}
		
		if (ItemLeviathan.keyHasBeenPressed) {
			ItemLeviathan.keyHasBeenPressed = false;
			ItemLeviathan.keyPressed = true;
		}
		
		if (ItemCrownOfGuilt.keyHasBeenPressed) {
			ItemCrownOfGuilt.keyHasBeenPressed = false;
			ItemCrownOfGuilt.keyPressed = true;
		}
		
		if (ItemSignOfInnocence.keyHasBeenPressed) {
			ItemSignOfInnocence.keyHasBeenPressed = false;
			ItemSignOfInnocence.keyPressed = true;
		}
		
		if (ItemPainOfSolitude.keyHasBeenPressed) {
			ItemPainOfSolitude.keyHasBeenPressed = false;
			ItemPainOfSolitude.keyPressed = true;
		}
		
		if (ItemOminousBlight.keyHasBeenPressed) {
			ItemOminousBlight.keyHasBeenPressed = false;
			ItemOminousBlight.keyPressed = true;
		}
		
		if (ItemMissingAche.keyHasBeenPressed) {
			ItemMissingAche.keyHasBeenPressed = false;
			ItemMissingAche.keyPressed = true;
		}
		
		if (ItemWinnersProof.keyHasBeenPressed) {
			ItemWinnersProof.keyHasBeenPressed = false;
			ItemWinnersProof.keyPressed = true;
		}
		
		if (ItemFatalCrest.keyHasBeenPressed) {
			ItemFatalCrest.keyHasBeenPressed = false;
			ItemFatalCrest.keyPressed = true;
		}
		
		if (ItemTwoBecomeOne.keyHasBeenPressed) {
			ItemTwoBecomeOne.keyHasBeenPressed = false;
			ItemTwoBecomeOne.keyPressed = true;
		}
		
		if (ItemBondOfFlame.keyHasBeenPressed) {
			ItemBondOfFlame.keyHasBeenPressed = false;
			ItemBondOfFlame.keyPressed = true;
		}
		
		if (ItemFenrir.keyHasBeenPressed) {
			ItemFenrir.keyHasBeenPressed = false;
			ItemFenrir.keyPressed = true;
		}
		
		if (ItemSleepingLion.keyHasBeenPressed) {
			ItemSleepingLion.keyHasBeenPressed = false;
			ItemSleepingLion.keyPressed = true;
		}
		
		if (ItemGuardianSoul.keyHasBeenPressed) {
			ItemGuardianSoul.keyHasBeenPressed = false;
			ItemGuardianSoul.keyPressed = true;
		}
		
		if (ItemGullWing.keyHasBeenPressed) {
			ItemGullWing.keyHasBeenPressed = false;
			ItemGullWing.keyPressed = true;
		}
		
		if (ItemPhotonDebugger.keyHasBeenPressed) {
			ItemPhotonDebugger.keyHasBeenPressed = false;
			ItemPhotonDebugger.keyPressed = true;
		}
		
		if (ItemSweetMemories.keyHasBeenPressed) {
			ItemSweetMemories.keyHasBeenPressed = false;
			ItemSweetMemories.keyPressed = true;
		}
		
		if (ItemCircleOfLife.keyHasBeenPressed) {
			ItemCircleOfLife.keyHasBeenPressed = false;
			ItemCircleOfLife.keyPressed = true;
		}
		
		if (ItemDecisivePumpkin.keyHasBeenPressed) {
			ItemDecisivePumpkin.keyHasBeenPressed = false;
			ItemDecisivePumpkin.keyPressed = true;
		}
		
		if (ItemWishingLamp.keyHasBeenPressed) {
			ItemWishingLamp.keyHasBeenPressed = false;
			ItemWishingLamp.keyPressed = true;
		}
		
		if (ItemFollowTheWind.keyHasBeenPressed) {
			ItemFollowTheWind.keyHasBeenPressed = false;
			ItemFollowTheWind.keyPressed = true;
		}
		
		if (ItemMysteriousAbyss.keyHasBeenPressed) {
			ItemMysteriousAbyss.keyHasBeenPressed = false;
			ItemMysteriousAbyss.keyPressed = true;
		}
		
		if (ItemMonochrome.keyHasBeenPressed) {
			ItemMonochrome.keyHasBeenPressed = false;
			ItemMonochrome.keyPressed = true;
		}
		
		if (ItemHerosCrest.keyHasBeenPressed) {
			ItemHerosCrest.keyHasBeenPressed = false;
			ItemHerosCrest.keyPressed = true;
		}
		
		if (ItemRumblingRose.keyHasBeenPressed) {
			ItemRumblingRose.keyHasBeenPressed = false;
			ItemRumblingRose.keyPressed = true;
		}
		
		if (ItemHiddenDragon.keyHasBeenPressed) {
			ItemHiddenDragon.keyHasBeenPressed = false;
			ItemHiddenDragon.keyPressed = true;
		}
		
		if (ItemEndsOfEarth.keyHasBeenPressed) {
			ItemEndsOfEarth.keyHasBeenPressed = false;
			ItemEndsOfEarth.keyPressed = true;
		}
		
		if (ItemStormFall.keyHasBeenPressed) {
			ItemStormFall.keyHasBeenPressed = false;
			ItemStormFall.keyPressed = true;
		}
		
		if (ItemDestinysEmbrace.keyHasBeenPressed) {
			ItemDestinysEmbrace.keyHasBeenPressed = false;
			ItemDestinysEmbrace.keyPressed = true;
		}
		
		if (ItemWayToDawn.keyHasBeenPressed) {
			ItemWayToDawn.keyHasBeenPressed = false;
			ItemWayToDawn.keyPressed = true;
		}
		
		if (ItemOneWingedAngel.keyHasBeenPressed) {
			ItemOneWingedAngel.keyHasBeenPressed = false;
			ItemOneWingedAngel.keyPressed = true;
		}
		
		if (ItemDiamondDust.keyHasBeenPressed) {
			ItemDiamondDust.keyHasBeenPressed = false;
			ItemDiamondDust.keyPressed = true;
		}
		
		if (ItemLionHeart.keyHasBeenPressed) {
			ItemLionHeart.keyHasBeenPressed = false;
			ItemLionHeart.keyPressed = true;
		}
		
		if (ItemMetalChocobo.keyHasBeenPressed) {
			ItemMetalChocobo.keyHasBeenPressed = false;
			ItemMetalChocobo.keyPressed = true;
		}
		
		if (ItemSpellbinder.keyHasBeenPressed) {
			ItemSpellbinder.keyHasBeenPressed = false;
			ItemSpellbinder.keyPressed = true;
		}
		
		if (ItemDivineRose.keyHasBeenPressed) {
			ItemDivineRose.keyHasBeenPressed = false;
			ItemDivineRose.keyPressed = true;
		}
		
		if (ItemFairyHarp.keyHasBeenPressed) {
			ItemFairyHarp.keyHasBeenPressed = false;
			ItemFairyHarp.keyPressed = true;
		}
		
		if (ItemCrabClaw.keyHasBeenPressed) {
			ItemCrabClaw.keyHasBeenPressed = false;
			ItemCrabClaw.keyPressed = true;
		}
		
		if (ItemWishingStar.keyHasBeenPressed) {
			ItemWishingStar.keyHasBeenPressed = false;
			ItemWishingStar.keyPressed = true;
		}
		
		if (ItemPumpkinHead.keyHasBeenPressed) {
			ItemPumpkinHead.keyHasBeenPressed = false;
			ItemPumpkinHead.keyPressed = true;
		}
		
		if (ItemThreeWishes.keyHasBeenPressed) {
			ItemThreeWishes.keyHasBeenPressed = false;
			ItemThreeWishes.keyPressed = true;
		}
		
		if (ItemJungleKing.keyHasBeenPressed) {
			ItemJungleKing.keyHasBeenPressed = false;
			ItemJungleKing.keyPressed = true;
		}
		
		if (ItemOlympia.keyHasBeenPressed) {
			ItemOlympia.keyHasBeenPressed = false;
			ItemOlympia.keyPressed = true;
		}
		
		if (ItemLadyLuck.keyHasBeenPressed) {
			ItemLadyLuck.keyHasBeenPressed = false;
			ItemLadyLuck.keyPressed = true;
		}
		
		if (ItemKeybladeOfPeoplesHearts.keyHasBeenPressed) {
			ItemKeybladeOfPeoplesHearts.keyHasBeenPressed = false;
			ItemKeybladeOfPeoplesHearts.keyPressed = true;
		}
		
		if (ItemUltimaWeapon.keyHasBeenPressed) {
			ItemUltimaWeapon.keyHasBeenPressed = false;
			ItemUltimaWeapon.keyPressed = true;
		}
		
		if (ItemTreasureTrove.keyHasBeenPressed) {
			ItemTreasureTrove.keyHasBeenPressed = false;
			ItemTreasureTrove.keyPressed = true;
		}
		
		if (ItemStarseeker.keyHasBeenPressed) {
			ItemStarseeker.keyHasBeenPressed = false;
			ItemStarseeker.keyPressed = true;
		}
		
		if (ItemSoulEater.keyHasBeenPressed) {
			ItemSoulEater.keyHasBeenPressed = false;
			ItemSoulEater.keyPressed = true;
		}
		
		if (ItemStarLight.keyHasBeenPressed) {
			ItemStarLight.keyHasBeenPressed = false;
			ItemStarLight.keyPressed = true;
		}
		
		if (ItemRainFell.keyHasBeenPressed) {
			ItemRainFell.keyHasBeenPressed = false;
			ItemRainFell.keyPressed = true;
		}
		
		if (ItemEarthShaker.keyHasBeenPressed) {
			ItemEarthShaker.keyHasBeenPressed = false;
			ItemEarthShaker.keyPressed = true;
		}
		
		if (ItemWaywardWind.keyHasBeenPressed) {
			ItemWaywardWind.keyHasBeenPressed = false;
			ItemWaywardWind.keyPressed = true;
		}
		
		if (ItemKingdomKey.keyHasBeenPressed) {
			ItemKingdomKey.keyHasBeenPressed = false;
			ItemKingdomKey.keyPressed = true;
		}
		
		if (ItemOathKeeper.keyHasBeenPressed) {
			ItemOathKeeper.keyHasBeenPressed = false;
			ItemOathKeeper.keyPressed = true;
		}
		
		if (ItemKingdomKeyD.keyHasBeenPressed) {
			ItemKingdomKeyD.keyHasBeenPressed = false;
			ItemKingdomKeyD.keyPressed = true;
		}
		
		if (ItemOblivion.keyHasBeenPressed) {
			ItemOblivion.keyHasBeenPressed = false;
			ItemOblivion.keyPressed = true;
		}
	}


	@Override
	public EnumSet<TickType> ticks()
	{
		return tickTypes;
	}
	@Override
	public String getLabel()
	{
		return null;
	}
}





