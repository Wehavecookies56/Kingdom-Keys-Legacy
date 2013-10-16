package wehavecookies56.kk.client;

import java.util.EnumSet;

import net.minecraft.client.settings.KeyBinding;
import net.minecraft.network.packet.Packet250CustomPayload;
import wehavecookies56.kk.item.keyblades.*;
import wehavecookies56.kk.lib.Reference;
import cpw.mods.fml.client.registry.KeyBindingRegistry.KeyHandler;
import cpw.mods.fml.common.TickType;
import cpw.mods.fml.common.network.PacketDispatcher;

public class KeyBind extends KeyHandler{

	public static boolean keyPressed = false;
	public static boolean keyHasBeenPressed = false;
	public static boolean keyPressedK1 = false;
	public static boolean keyHasBeenPressedK1 = false;
	public static boolean keyPressedK2 = false;
	public static boolean keyHasBeenPressedK2 = false;
	public static boolean keyPressedK3 = false;
	public static boolean keyHasBeenPressedK3 = false;
	public static boolean keyPressedK4 = false;
	public static boolean keyHasBeenPressedK4 = false;
	public static boolean keyPressedK5 = false;
	public static boolean keyHasBeenPressedK5 = false;
	public static boolean keyPressedK6 = false;
	public static boolean keyHasBeenPressedK6 = false;
	public static boolean keyPressedK7 = false;
	public static boolean keyHasBeenPressedK7 = false;
	public static boolean keyPressedK8 = false;
	public static boolean keyHasBeenPressedK8 = false;
	public static boolean keyPressedK9 = false;
	public static boolean keyHasBeenPressedK9 = false;
	public static boolean keyPressedK10 = false;
	public static boolean keyHasBeenPressedK10 = false;
	public static boolean keyPressedK11 = false;
	public static boolean keyHasBeenPressedK11 = false;
	public static boolean keyPressedK12 = false;
	public static boolean keyHasBeenPressedK12 = false;
	public static boolean keyPressedK13 = false;
	public static boolean keyHasBeenPressedK13 = false;
	public static boolean keyPressedK14 = false;
	public static boolean keyHasBeenPressedK14 = false;
	public static boolean keyPressedK15 = false;
	public static boolean keyHasBeenPressedK15 = false;
	public static boolean keyPressedK16 = false;
	public static boolean keyHasBeenPressedK16 = false;
	public static boolean keyPressedK17 = false;
	public static boolean keyHasBeenPressedK17 = false;
	public static boolean keyPressedK18 = false;
	public static boolean keyHasBeenPressedK18 = false;
	public static boolean keyPressedK19 = false;
	public static boolean keyHasBeenPressedK19 = false;
	public static boolean keyPressedK20 = false;
	public static boolean keyHasBeenPressedK20 = false;
	public static boolean keyPressedK21 = false;
	public static boolean keyHasBeenPressedK21 = false;
	public static boolean keyPressedK22 = false;
	public static boolean keyHasBeenPressedK22 = false;
	public static boolean keyPressedK23 = false;
	public static boolean keyHasBeenPressedK23 = false;
	public static boolean keyPressedK24 = false;
	public static boolean keyHasBeenPressedK24 = false;
	public static boolean keyPressedK25 = false;
	public static boolean keyHasBeenPressedK25 = false;
	public static boolean keyPressedK26 = false;
	public static boolean keyHasBeenPressedK26 = false;
	public static boolean keyPressedK27 = false;
	public static boolean keyHasBeenPressedK27 = false;
	public static boolean keyPressedK28 = false;
	public static boolean keyHasBeenPressedK28 = false;
	public static boolean keyPressedK29 = false;
	public static boolean keyHasBeenPressedK29 = false;
	public static boolean keyPressedK30 = false;
	public static boolean keyHasBeenPressedK30 = false;
	public static boolean keyPressedK31 = false;
	public static boolean keyHasBeenPressedK31 = false;
	public static boolean keyPressedK32 = false;
	public static boolean keyHasBeenPressedK32 = false;
	public static boolean keyPressedK33 = false;
	public static boolean keyHasBeenPressedK33 = false;
	public static boolean keyPressedK34 = false;
	public static boolean keyHasBeenPressedK34 = false;
	public static boolean keyPressedK35 = false;
	public static boolean keyHasBeenPressedK35 = false;
	public static boolean keyPressedK36 = false;
	public static boolean keyHasBeenPressedK36 = false;
	public static boolean keyPressedK37 = false;
	public static boolean keyHasBeenPressedK37 = false;
	public static boolean keyPressedK38 = false;
	public static boolean keyHasBeenPressedK38 = false;
	public static boolean keyPressedK39 = false;
	public static boolean keyHasBeenPressedK39 = false;
	public static boolean keyPressedK40 = false;
	public static boolean keyHasBeenPressedK40 = false;
	public static boolean keyPressedK41 = false;
	public static boolean keyHasBeenPressedK41 = false;
	public static boolean keyPressedK42 = false;
	public static boolean keyHasBeenPressedK42 = false;
	public static boolean keyPressedK43 = false;
	public static boolean keyHasBeenPressedK43 = false;
	public static boolean keyPressedK44 = false;
	public static boolean keyHasBeenPressedK44 = false;
	public static boolean keyPressedK45 = false;
	public static boolean keyHasBeenPressedK45 = false;
	public static boolean keyPressedK46 = false;
	public static boolean keyHasBeenPressedK46 = false;
	public static boolean keyPressedK47 = false;
	public static boolean keyHasBeenPressedK47 = false;
	public static boolean keyPressedK48 = false;
	public static boolean keyHasBeenPressedK48 = false;
	public static boolean keyPressedK49 = false;
	public static boolean keyHasBeenPressedK49 = false;
	public static boolean keyPressedK50 = false;
	public static boolean keyHasBeenPressedK50 = false;
	public static boolean keyPressedK51 = false;
	public static boolean keyHasBeenPressedK51 = false;
	public static boolean keyPressedK52 = false;
	public static boolean keyHasBeenPressedK52 = false;
	public static boolean keyPressedK53 = false;
	public static boolean keyHasBeenPressedK53 = false;
	public static boolean keyPressedK54 = false;
	public static boolean keyHasBeenPressedK54 = false;
	public static boolean keyPressedK55 = false;
	public static boolean keyHasBeenPressedK55 = false;
	public static boolean keyPressedK56 = false;
	public static boolean keyHasBeenPressedK56 = false;
	public static boolean keyPressedK57 = false;
	public static boolean keyHasBeenPressedK57 = false;
	public static boolean keyPressedK58 = false;
	public static boolean keyHasBeenPressedK58 = false;
	public static boolean keyPressedK59 = false;
	public static boolean keyHasBeenPressedK59 = false;
	public static boolean keyPressedK60 = false;
	public static boolean keyHasBeenPressedK60 = false;
	public static boolean keyPressedK61 = false;
	public static boolean keyHasBeenPressedK61 = false;
	public static boolean keyPressedK62 = false;
	public static boolean keyHasBeenPressedK62 = false;
	public static boolean keyPressedK63 = false;
	public static boolean keyHasBeenPressedK63 = false;
	public static boolean keyPressedK64 = false;
	public static boolean keyHasBeenPressedK64 = false;
	public static boolean keyPressedK65 = false;
	public static boolean keyHasBeenPressedK65 = false;
	public static boolean keyPressedK66 = false;
	public static boolean keyHasBeenPressedK66 = false;
	public static boolean keyPressedK67 = false;
	public static boolean keyHasBeenPressedK67 = false;
	public static boolean keyPressedK68 = false;
	public static boolean keyHasBeenPressedK68 = false;
	public static boolean keyPressedK69 = false;
	public static boolean keyHasBeenPressedK69 = false;
	public static boolean keyPressedK70 = false;
	public static boolean keyHasBeenPressedK70 = false;
	public static boolean keyPressedK71 = false;
	public static boolean keyHasBeenPressedK71 = false;
	public static boolean keyPressedK72 = false;
	public static boolean keyHasBeenPressedK72 = false;
	public static boolean keyPressedK73 = false;
	public static boolean keyHasBeenPressedK73 = false;
	public static boolean keyPressedK74 = false;
	public static boolean keyHasBeenPressedK74 = false;
	public static boolean keyPressedK75 = false;
	public static boolean keyHasBeenPressedK75 = false;
	public static boolean keyPressedK76 = false;
	public static boolean keyHasBeenPressedK76 = false;
	public static boolean keyPressedK77 = false;
	public static boolean keyHasBeenPressedK77 = false;
	public static boolean keyPressedK78 = false;
	public static boolean keyHasBeenPressedK78 = false;
	public static boolean keyPressedK79 = false;
	public static boolean keyHasBeenPressedK79 = false;
	public static boolean keyPressedK80 = false;
	public static boolean keyHasBeenPressedK80 = false;
	public static boolean keyPressedK81 = false;
	public static boolean keyHasBeenPressedK81 = false;
	public static boolean keyPressedK82 = false;
	public static boolean keyHasBeenPressedK82 = false;
	public static boolean keyPressedK83 = false;
	public static boolean keyHasBeenPressedK83 = false;
	public static boolean keyPressedK84 = false;
	public static boolean keyHasBeenPressedK84 = false;
	public static boolean keyPressedK85 = false;
	public static boolean keyHasBeenPressedK85 = false;
	public static boolean keyPressedK86 = false;
	public static boolean keyHasBeenPressedK86 = false;
	public static boolean keyPressedK87 = false;
	public static boolean keyHasBeenPressedK87 = false;
	public static boolean keyPressedK88 = false;
	public static boolean keyHasBeenPressedK88 = false;
	public static boolean keyPressedK89 = false;
	public static boolean keyHasBeenPressedK89 = false;
	public static boolean keyPressedK90 = false;
	public static boolean keyHasBeenPressedK90 = false;
	public static boolean keyPressedK91 = false;
	public static boolean keyHasBeenPressedK91 = false;
	public static boolean keyPressedK92 = false;
	public static boolean keyHasBeenPressedK92 = false;
	public static boolean keyPressedK93 = false;
	public static boolean keyHasBeenPressedK93 = false;
	public static boolean keyPressedK94 = false;
	public static boolean keyHasBeenPressedK94 = false;
	public static boolean keyPressedK95 = false;
	public static boolean keyHasBeenPressedK95 = false;
	public static boolean keyPressedK96 = false;
	public static boolean keyHasBeenPressedK96 = false;
	public static boolean keyPressedK97 = false;
	public static boolean keyHasBeenPressedK97 = false;
	public static boolean keyPressedK98 = false;
	public static boolean keyHasBeenPressedK98 = false;
	public static boolean keyPressedK99 = false;
	public static boolean keyHasBeenPressedK99 = false;
	public static boolean keyPressedK100 = false;
	public static boolean keyHasBeenPressedK100 = false;
	public static boolean keyPressedK101 = false;
	public static boolean keyHasBeenPressedK101 = false;
	public static boolean keyPressedK102 = false;
	public static boolean keyHasBeenPressedK102 = false;
	public static boolean keyPressedK103 = false;
	public static boolean keyHasBeenPressedK103 = false;
	public static boolean keyPressedK104 = false;
	public static boolean keyHasBeenPressedK104 = false;
	public static boolean keyPressedK105 = false;
	public static boolean keyHasBeenPressedK105 = false;
	public static boolean keyPressedK106 = false;
	public static boolean keyHasBeenPressedK106 = false;
	public static boolean keyPressedK107 = false;
	public static boolean keyHasBeenPressedK107 = false;
	public static boolean keyPressedK108 = false;
	public static boolean keyHasBeenPressedK108 = false;
	public static boolean keyPressedK109 = false;
	public static boolean keyHasBeenPressedK109 = false;
	public static boolean keyPressedK110 = false;
	public static boolean keyHasBeenPressedK110 = false;
	public static boolean keyPressedK111 = false;
	public static boolean keyHasBeenPressedK111 = false;
	public static boolean keyPressedK112 = false;
	public static boolean keyHasBeenPressedK112 = false;
	public static boolean keyPressedK113 = false;
	public static boolean keyHasBeenPressedK113 = false;
	public static boolean keyPressedK114 = false;
	public static boolean keyHasBeenPressedK114 = false;
	
	private EnumSet tickTypes = EnumSet.of(TickType.CLIENT);

	public KeyBind(KeyBinding[] keyBindings, boolean[] repeatings)
	{
		super(keyBindings, repeatings);
	}
	@Override
	public void keyDown(EnumSet<TickType> types, KeyBinding kb, boolean tickEnd, boolean isRepeat)
	{
		keyHasBeenPressed = true;
		keyHasBeenPressedK1 = true;
		keyHasBeenPressedK2 = true;
		keyHasBeenPressedK3 = true;
		PacketDispatcher.sendPacketToServer(new Packet250CustomPayload(Reference.CHANNEL_NAME, new byte[]{1}));
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
		
		if (keyHasBeenPressedK1) {
			keyHasBeenPressedK1 = false;
			keyPressedK1 = true;
		}
		
		if (keyHasBeenPressedK2) {
			keyHasBeenPressedK2 = false;
			keyPressedK2 = true;
		}
		
		if (keyHasBeenPressedK3) {
			keyHasBeenPressedK3 = false;
			keyPressedK3 = true;
		}
		
		if (keyHasBeenPressedK4) {
			keyHasBeenPressedK4 = false;
			keyPressedK4 = true;
		}
		
		if (keyHasBeenPressedK5) {
			keyHasBeenPressedK5 = false;
			keyPressedK5 = true;
		}
		
		if (keyHasBeenPressedK6) {
			keyHasBeenPressedK6 = false;
			keyPressedK6 = true;
		}
		
		if (keyHasBeenPressedK7) {
			keyHasBeenPressedK7 = false;
			keyPressedK7 = true;
		}
		
		if (keyHasBeenPressedK8) {
			keyHasBeenPressedK8 = false;
			keyPressedK8 = true;
		}
		
		if (keyHasBeenPressedK9) {
			keyHasBeenPressedK9 = false;
			keyPressedK9 = true;
		}
		
		if (keyHasBeenPressedK10) {
			keyHasBeenPressedK10 = false;
			keyPressedK10 = true;
		}
		
		if (keyHasBeenPressedK11) {
			keyHasBeenPressedK11 = false;
			keyPressedK11 = true;
		}
		
		if (keyHasBeenPressedK12) {
			keyHasBeenPressedK12 = false;
			keyPressedK12 = true;
		}
		
		if (keyHasBeenPressedK13) {
			keyHasBeenPressedK13 = false;
			keyPressedK13 = true;
		}
		
		if (keyHasBeenPressedK14) {
			keyHasBeenPressedK14 = false;
			keyPressedK14 = true;
		}
		
		if (keyHasBeenPressedK15) {
			keyHasBeenPressedK15 = false;
			keyPressedK15 = true;
		}
		
		if (keyHasBeenPressedK16) {
			keyHasBeenPressedK16 = false;
			keyPressedK16 = true;
		}
		
		if (keyHasBeenPressedK17) {
			keyHasBeenPressedK17 = false;
			keyPressedK17 = true;
		}
		
		if (keyHasBeenPressedK18) {
			keyHasBeenPressedK18 = false;
			keyPressedK18 = true;
		}
		
		if (keyHasBeenPressedK19) {
			keyHasBeenPressedK19 = false;
			keyPressedK19 = true;
		}
		
		if (keyHasBeenPressedK20) {
			keyHasBeenPressedK20 = false;
			keyPressedK20 = true;
		}
		
		if (keyHasBeenPressedK21) {
			keyHasBeenPressedK21 = false;
			keyPressedK21 = true;
		}
		
		if (keyHasBeenPressedK22) {
			keyHasBeenPressedK22 = false;
			keyPressedK22 = true;
		}
		
		if (keyHasBeenPressedK23) {
			keyHasBeenPressedK23 = false;
			keyPressedK23 = true;
		}
		
		if (keyHasBeenPressedK24) {
			keyHasBeenPressedK24 = false;
			keyPressedK24 = true;
		}
		
		if (keyHasBeenPressedK25) {
			keyHasBeenPressedK25 = false;
			keyPressedK25 = true;
		}
		
		if (keyHasBeenPressedK26) {
			keyHasBeenPressedK26 = false;
			keyPressedK26 = true;
		}
		
		if (keyHasBeenPressedK27) {
			keyHasBeenPressedK27 = false;
			keyPressedK27 = true;
		}
		
		if (keyHasBeenPressedK28) {
			keyHasBeenPressedK28 = false;
			keyPressedK28 = true;
		}
		
		if (keyHasBeenPressedK29) {
			keyHasBeenPressedK29 = false;
			keyPressedK29 = true;
		}
		
		if (keyHasBeenPressedK30) {
			keyHasBeenPressedK30 = false;
			keyPressedK30 = true;
		}
		
		if (keyHasBeenPressedK31) {
			keyHasBeenPressedK31 = false;
			keyPressedK31 = true;
		}
		
		if (keyHasBeenPressedK32) {
			keyHasBeenPressedK12 = false;
			keyPressedK32 = true;
		}
		
		if (keyHasBeenPressedK33) {
			keyHasBeenPressedK33 = false;
			keyPressedK33 = true;
		}
		
		if (keyHasBeenPressedK34) {
			keyHasBeenPressedK34 = false;
			keyPressedK34 = true;
		}
		
		if (keyHasBeenPressedK35) {
			keyHasBeenPressedK35 = false;
			keyPressedK35 = true;
		}
		
		if (keyHasBeenPressedK36) {
			keyHasBeenPressedK36 = false;
			keyPressedK36 = true;
		}
		
		if (keyHasBeenPressedK37) {
			keyHasBeenPressedK37 = false;
			keyPressedK37 = true;
		}
		
		if (keyHasBeenPressedK38) {
			keyHasBeenPressedK38 = false;
			keyPressedK38 = true;
		}
		
		if (keyHasBeenPressedK39) {
			keyHasBeenPressedK39 = false;
			keyPressedK39 = true;
		}
		
		if (keyHasBeenPressedK40) {
			keyHasBeenPressedK40 = false;
			keyPressedK40 = true;
		}
		
		if (keyHasBeenPressedK41) {
			keyHasBeenPressedK41 = false;
			keyPressedK41 = true;
		}
		
		if (keyHasBeenPressedK42) {
			keyHasBeenPressedK42 = false;
			keyPressedK42 = true;
		}
		
		if (keyHasBeenPressedK43) {
			keyHasBeenPressedK43 = false;
			keyPressedK43 = true;
		}
		
		if (keyHasBeenPressedK44) {
			keyHasBeenPressedK44 = false;
			keyPressedK44 = true;
		}
		
		if (keyHasBeenPressedK45) {
			keyHasBeenPressedK45 = false;
			keyPressedK45 = true;
		}
		
		if (keyHasBeenPressedK46) {
			keyHasBeenPressedK46 = false;
			keyPressedK46 = true;
		}
		
		if (keyHasBeenPressedK47) {
			keyHasBeenPressedK47 = false;
			keyPressedK47 = true;
		}
		
		if (keyHasBeenPressedK48) {
			keyHasBeenPressedK48 = false;
			keyPressedK48 = true;
		}
		
		if (keyHasBeenPressedK49) {
			keyHasBeenPressedK49 = false;
			keyPressedK49 = true;
		}
		
		if (keyHasBeenPressedK50) {
			keyHasBeenPressedK50 = false;
			keyPressedK50 = true;
		}
		
		if (keyHasBeenPressedK51) {
			keyHasBeenPressedK51 = false;
			keyPressedK51 = true;
		}
		
		if (keyHasBeenPressedK52) {
			keyHasBeenPressedK52 = false;
			keyPressedK52 = true;
		}
		
		if (keyHasBeenPressedK53) {
			keyHasBeenPressedK53 = false;
			keyPressedK53 = true;
		}
		
		if (keyHasBeenPressedK54) {
			keyHasBeenPressedK54 = false;
			keyPressedK54 = true;
		}
		
		if (keyHasBeenPressedK55) {
			keyHasBeenPressedK55 = false;
			keyPressedK55 = true;
		}
		
		if (keyHasBeenPressedK56) {
			keyHasBeenPressedK56 = false;
			keyPressedK56 = true;
		}
		
		if (keyHasBeenPressedK57) {
			keyHasBeenPressedK57 = false;
			keyPressedK57 = true;
		}
		
		if (keyHasBeenPressedK58) {
			keyHasBeenPressedK58 = false;
			keyPressedK58 = true;
		}
		
		if (keyHasBeenPressedK59) {
			keyHasBeenPressedK59 = false;
			keyPressedK59 = true;
		}
		
		if (keyHasBeenPressedK60) {
			keyHasBeenPressedK60 = false;
			keyPressedK60 = true;
		}
		
		if (keyHasBeenPressedK61) {
			keyHasBeenPressedK61 = false;
			keyPressedK61 = true;
		}
		
		if (keyHasBeenPressedK62) {
			keyHasBeenPressedK62 = false;
			keyPressedK62 = true;
		}
		
		if (keyHasBeenPressedK63) {
			keyHasBeenPressedK63 = false;
			keyPressedK63 = true;
		}
		
		if (keyHasBeenPressedK64) {
			keyHasBeenPressedK64 = false;
			keyPressedK64 = true;
		}
		
		if (keyHasBeenPressedK65) {
			keyHasBeenPressedK65 = false;
			keyPressedK65 = true;
		}
		
		if (keyHasBeenPressedK66) {
			keyHasBeenPressedK66 = false;
			keyPressedK66 = true;
		}
		
		if (keyHasBeenPressedK67) {
			keyHasBeenPressedK67 = false;
			keyPressedK67 = true;
		}
		
		if (keyHasBeenPressedK68) {
			keyHasBeenPressedK68 = false;
			keyPressedK68 = true;
		}
		
		if (keyHasBeenPressedK69) {
			keyHasBeenPressedK69 = false;
			keyPressedK69 = true;
		}
		
		if (keyHasBeenPressedK70) {
			keyHasBeenPressedK70 = false;
			keyPressedK70 = true;
		}
		
		if (keyHasBeenPressedK71) {
			keyHasBeenPressedK71 = false;
			keyPressedK71 = true;
		}
		
		if (keyHasBeenPressedK72) {
			keyHasBeenPressedK72 = false;
			keyPressedK72 = true;
		}
		
		if (keyHasBeenPressedK73) {
			keyHasBeenPressedK73 = false;
			keyPressedK73 = true;
		}
		
		if (keyHasBeenPressedK74) {
			keyHasBeenPressedK74 = false;
			keyPressedK74 = true;
		}
		
		if (keyHasBeenPressedK75) {
			keyHasBeenPressedK75 = false;
			keyPressedK75 = true;
		}
		
		if (keyHasBeenPressedK76) {
			keyHasBeenPressedK76 = false;
			keyPressedK76 = true;
		}
		
		if (keyHasBeenPressedK77) {
			keyHasBeenPressedK77 = false;
			keyPressedK77 = true;
		}
		
		if (keyHasBeenPressedK78) {
			keyHasBeenPressedK78 = false;
			keyPressedK78 = true;
		}
		
		if (keyHasBeenPressedK79) {
			keyHasBeenPressedK79 = false;
			keyPressedK79 = true;
		}
		
		if (keyHasBeenPressedK80) {
			keyHasBeenPressedK80 = false;
			keyPressedK80 = true;
		}
		
		if (keyHasBeenPressedK81) {
			keyHasBeenPressedK81 = false;
			keyPressedK81 = true;
		}
		
		if (keyHasBeenPressedK82) {
			keyHasBeenPressedK82 = false;
			keyPressedK82 = true;
		}
		
		if (keyHasBeenPressedK83) {
			keyHasBeenPressedK83 = false;
			keyPressedK83 = true;
		}
		
		if (keyHasBeenPressedK84) {
			keyHasBeenPressedK84 = false;
			keyPressedK84 = true;
		}
		
		if (keyHasBeenPressedK85) {
			keyHasBeenPressedK85 = false;
			keyPressedK85 = true;
		}
		
		if (keyHasBeenPressedK86) {
			keyHasBeenPressedK86 = false;
			keyPressedK86 = true;
		}
		
		if (keyHasBeenPressedK87) {
			keyHasBeenPressedK87 = false;
			keyPressedK87 = true;
		}
		
		if (keyHasBeenPressedK88) {
			keyHasBeenPressedK88 = false;
			keyPressedK88 = true;
		}
		
		if (keyHasBeenPressedK89) {
			keyHasBeenPressedK89 = false;
			keyPressedK89 = true;
		}
		
		if (keyHasBeenPressedK90) {
			keyHasBeenPressedK90 = false;
			keyPressedK90 = true;
		}
		
		if (keyHasBeenPressedK91) {
			keyHasBeenPressedK91 = false;
			keyPressedK91 = true;
		}
		
		if (keyHasBeenPressedK92) {
			keyHasBeenPressedK92 = false;
			keyPressedK92 = true;
		}
		
		if (keyHasBeenPressedK93) {
			keyHasBeenPressedK93 = false;
			keyPressedK93 = true;
		}
		
		if (keyHasBeenPressedK94) {
			keyHasBeenPressedK94 = false;
			keyPressedK94 = true;
		}
		
		if (keyHasBeenPressedK95) {
			keyHasBeenPressedK95 = false;
			keyPressedK95 = true;
		}
		
		if (keyHasBeenPressedK96) {
			keyHasBeenPressedK96 = false;
			keyPressedK96 = true;
		}
		
		if (keyHasBeenPressedK97) {
			keyHasBeenPressedK97 = false;
			keyPressedK97 = true;
		}
		
		if (keyHasBeenPressedK98) {
			keyHasBeenPressedK98 = false;
			keyPressedK98 = true;
		}
		
		if (keyHasBeenPressedK99) {
			keyHasBeenPressedK99 = false;
			keyPressedK99 = true;
		}
		
		if (keyHasBeenPressedK100) {
			keyHasBeenPressedK100 = false;
			keyPressedK100 = true;
		}
		
		if (keyHasBeenPressedK101) {
			keyHasBeenPressedK101 = false;
			keyPressedK101 = true;
		}
		
		if (keyHasBeenPressedK102) {
			keyHasBeenPressedK102 = false;
			keyPressedK102 = true;
		}
		
		if (keyHasBeenPressedK103) {
			keyHasBeenPressedK103 = false;
			keyPressedK103 = true;
		}
		
		if (keyHasBeenPressedK104) {
			keyHasBeenPressedK104 = false;
			keyPressedK104 = true;
		}
		
		if (keyHasBeenPressedK105) {
			keyHasBeenPressedK105 = false;
			keyPressedK105 = true;
		}
		
		if (keyHasBeenPressedK106) {
			keyHasBeenPressedK106 = false;
			keyPressedK106 = true;
		}
		
		if (keyHasBeenPressedK107) {
			keyHasBeenPressedK107 = false;
			keyPressedK107 = true;
		}
		
		if (keyHasBeenPressedK108) {
			keyHasBeenPressedK108 = false;
			keyPressedK108 = true;
		}
		
		if (keyHasBeenPressedK109) {
			keyHasBeenPressedK109 = false;
			keyPressedK109 = true;
		}
		
		if (keyHasBeenPressedK110) {
			keyHasBeenPressedK110 = false;
			keyPressedK110 = true;
		}
		
		if (keyHasBeenPressedK111) {
			keyHasBeenPressedK111 = false;
			keyPressedK111 = true;
		}
		
		if (keyHasBeenPressedK112) {
			keyHasBeenPressedK112 = false;
			keyPressedK112 = true;
		}
		
		if (keyHasBeenPressedK113) {
			keyHasBeenPressedK113 = false;
			keyPressedK113 = true;
		}
		
		if (keyHasBeenPressedK114) {
			keyHasBeenPressedK114 = false;
			keyPressedK114 = true;
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





