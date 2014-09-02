package wehavecookies56.kk.client.gui;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.ICrafting;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.container.ContainerSynthesis;
import wehavecookies56.kk.core.handlers.PacketHandler;
import wehavecookies56.kk.core.handlers.SummonPacketHandler;
import wehavecookies56.kk.entities.tileentities.TileEntitySynthesis;
import wehavecookies56.kk.item.AddedItems;
import wehavecookies56.kk.item.keyblades.ItemAbaddonplasma;
import wehavecookies56.kk.item.keychains.ItemHerosCrestChain;
import wehavecookies56.kk.item.keychains.ItemPeoplesHeartsChain;
import wehavecookies56.kk.item.keychains.ItemWayToTheDawnChain;
import wehavecookies56.kk.item.recipes.*;
import wehavecookies56.kk.lib.LocalStrings;
import wehavecookies56.kk.lib.UsefulArrays;
import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class GuiSynthesis extends GuiContainer {


	TileEntitySynthesis synthesis = new TileEntitySynthesis();
	public static boolean ClickedTab1 = true;
	public static boolean ClickedTab2 = false;
	public static boolean ClickedTab3 = false;

	public String SynthesizeText = "You lack the required materials to Synthesize";
	int colour = 0xFF0000;


	@SideOnly(Side.CLIENT)
	public GuiSynthesis(InventoryPlayer invPlayer, TileEntitySynthesis synthesis) {
		super(new ContainerSynthesis(invPlayer, synthesis));

		this.synthesis = synthesis;

		xSize = 176;
		ySize = 166;
		
	}	

	private static final ResourceLocation texture = new ResourceLocation("kk", "textures/gui/Moogle.png");

	@Override
	@SideOnly(Side.CLIENT)
	protected void drawGuiContainerBackgroundLayer(float f, int x, int y) {
		GL11.glColor4f(1F, 1F, 1F, 1F);

		Minecraft.getMinecraft().renderEngine.bindTexture(texture);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);

	}

	public void drawTexture(int x, int y, int w, int h)
	{
		GL11.glColor4f(1F, 1F, 1F, 1F);
		Tessellator tessellator = Tessellator.instance;
		tessellator.startDrawingQuads();
		tessellator.addVertexWithUV(x + 0, y + h, this.zLevel, 0D, 1D);
		tessellator.addVertexWithUV(x + w, y + h, this.zLevel, 1D, 1D);
		tessellator.addVertexWithUV(x + w, y + 0, this.zLevel, 1D, 0D);
		tessellator.addVertexWithUV(x + 0, y + 0, this.zLevel, 0D, 0D);
		tessellator.draw();
	}

	boolean ableToSynth = false;

	int Tab1X = 5 + guiLeft;
	int Tab1Y = 26 + guiTop;
	int Tab2X = 5 + guiLeft;
	int Tab2Y = 45 + guiTop;
	int Tab3X = 5 + guiLeft;
	int Tab3Y = 64 + guiTop;
	int Tab1SrcX = xSize;
	int Tab1SrcY = 0;
	int Tab2SrcX = xSize;
	int Tab2SrcY = 0;
	int Tab3SrcX = xSize;
	int Tab3SrcY = 0;
	int DimensionsOfTabW = 21;
	int DimensionsOfTabH = 17;
	
	int Tab1iconX = 14 + guiLeft;
	int Tab1iconY = 29 + guiTop;
	int Tab1iconSrcX = 16;
	int Tab1iconSrcY = ySize;
	int Tab2iconX = 10 + guiLeft;
	int Tab2iconY = 47 + guiTop;
	int Tab2iconSrcX = 21;
	int Tab2iconSrcY = ySize;
	int Tab3iconX = 12 + guiLeft;
	int Tab3iconY = 67 + guiTop;
	int Tab3iconSrcX = 34;
	int Tab3iconSrcY = ySize;
	int Tab1iconDimW = 5;
	int Tab1iconDimH = 11;
	int Tab2iconDimWH = 13;
	int Tab3iconDimW = 10;
	int Tab3iconDimH = 12;
		
	@Override
	@SideOnly(Side.CLIENT)
	protected void drawGuiContainerForegroundLayer(int x, int y) {
		
		fontRenderer.drawString("Synthesis", 38, 14, 0x404040);
		GL11.glColor4f(1F, 1F, 1F, 1F);
		Minecraft.getMinecraft().renderEngine.bindTexture(texture);
		if(Tab1X + guiLeft <= x && x <= Tab1X + guiLeft + DimensionsOfTabW && Tab1Y + guiTop <= y && y <= Tab1Y + guiTop + DimensionsOfTabH){
			Tab1SrcY = 34;
		}else if(ClickedTab1){
			Tab1SrcY = 17;
		}else{
			Tab1SrcY = 0;
		}
		drawTexturedModalRect(Tab1X, Tab1Y, Tab1SrcX, Tab1SrcY, DimensionsOfTabW, DimensionsOfTabH);
		drawTexturedModalRect(Tab1iconX, Tab1iconY, Tab1iconSrcX, Tab1iconSrcY, Tab1iconDimW, Tab1iconDimH);
		if(Tab2X + guiLeft <= x && x <= Tab2X + guiLeft + DimensionsOfTabW && Tab2Y + guiTop <= y && y <= Tab2Y + guiTop + DimensionsOfTabH){
			Tab2SrcY = 34;
		}else if(ClickedTab2){
			Tab2SrcY = 17;
		}else{
			Tab2SrcY = 0;
		}
		drawTexturedModalRect(Tab2X, Tab2Y, Tab2SrcX, Tab2SrcY, DimensionsOfTabW, DimensionsOfTabH);
		drawTexturedModalRect(Tab2iconX, Tab2iconY, Tab2iconSrcX, Tab2iconSrcY, Tab2iconDimWH, Tab2iconDimWH);
		if(Tab3X + guiLeft <= x && x <= Tab3X + guiLeft + DimensionsOfTabW && Tab3Y + guiTop <= y && y <= Tab3Y + guiTop + DimensionsOfTabH){
			Tab3SrcY = 34;
		}else if(ClickedTab3){
			Tab3SrcY = 17;
		}else{
			Tab3SrcY = 0;
		}
		drawTexturedModalRect(Tab3X, Tab3Y, Tab3SrcX, Tab3SrcY, DimensionsOfTabW, DimensionsOfTabH);
		drawTexturedModalRect(Tab3iconX, Tab3iconY, Tab3iconSrcX, Tab3iconSrcY, Tab3iconDimW, Tab3iconDimH);
		
		if(synthesis.checkItems() == -1){
			if(ClickedTab1){
				fontRenderer.drawSplitString("Place an Attack Recipe or a Material Recipe in the slot", 30, 48, 120, 0xFF0000);
			}
			else if(ClickedTab2){
				fontRenderer.drawSplitString("Place an Attack Recipe or a Material Recipe in the slot", 30, 30, 120, 0xFF0000);
			}
			else if(ClickedTab3){
				fontRenderer.drawSplitString("Place an Attack Recipe or a Material Recipe in the slot", 30, 30, 120, 0xFF0000);
			}
		}
		
		addSynthesisRecipe(AddedItems.K1r, AddedItems.K1c, LocalStrings.Vulpeus, ItemVulpeusRecipe.texture, AddedItems.VulpeusMaterial, true, AddedItems.Orichalcum, AddedItems.SerenityCrystal, AddedItems.MythrilGem, AddedItems.EnergyStone, AddedItems.BrightStone, AddedItems.BlazingShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K2r, AddedItems.K2c, LocalStrings.Ursus, ItemUrsusRecipe.texture, AddedItems.UrsusMaterial, true, AddedItems.Orichalcum, AddedItems.SerenityCrystal, AddedItems.MythrilGem, AddedItems.PowerStone, AddedItems.BrightStone, AddedItems.BlazingShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K3r, AddedItems.K3c, LocalStrings.Unicornis, ItemUnicornisRecipe.texture, AddedItems.UnicornisMaterial, true, AddedItems.Orichalcum, AddedItems.SerenityCrystal, AddedItems.MythrilGem, AddedItems.TwilightStone, AddedItems.BrightStone, AddedItems.BlazingStone, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K4r, AddedItems.K4c, LocalStrings.Leopardos, ItemLeopardosRecipe.texture, AddedItems.K4m, true, AddedItems.Orichalcum, AddedItems.SerenityCrystal, AddedItems.MythrilGem, AddedItems.DarkStone, AddedItems.BrightStone, AddedItems.BlazingShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K5r, AddedItems.K5c, LocalStrings.Anguis, ItemAnguisRecipe.texture, AddedItems.K5m, true, AddedItems.Orichalcum, AddedItems.SerenityCrystal, AddedItems.MythrilGem, AddedItems.DenseStone, AddedItems.BrightStone, AddedItems.BlazingShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K6r, AddedItems.K6c, LocalStrings.Leaskeyblade, ItemLeasKeybladeRecipe.texture, AddedItems.K6m, true, AddedItems.BlazingCrystal, AddedItems.DarkShard, AddedItems.MythrilShard, AddedItems.BrightGem, AddedItems.BlazingShard, AddedItems.DarkStone, AddedItems.BlazingStone, AddedItems.DarkMatter, null, null, null);
		addSynthesisRecipe(AddedItems.K7r, AddedItems.K7c, LocalStrings.Youngxehanortskeyblade, ItemYoungXehanortsRecipe.texture, AddedItems.K7m, true, AddedItems.DarkCrystal, AddedItems.PowerCrystal, AddedItems.LucidGem, AddedItems.DenseShard, AddedItems.PowerStone, AddedItems.LucidStone, AddedItems.Orichalcum, AddedItems.DarkShard, AddedItems.LucidShard, null, null);
		addSynthesisRecipe(AddedItems.K8r, AddedItems.K8c, LocalStrings.Oceanrage, ItemOceanRageRecipe.texture, AddedItems.K8m, true, AddedItems.PowerCrystal, AddedItems.BrightGem, AddedItems.FrostCrystal, AddedItems.FrostGem, AddedItems.PowerStone, AddedItems.LucidShard, AddedItems.FrostStone, AddedItems.FrostShard, null, null, null);
		addSynthesisRecipe(AddedItems.K9r, AddedItems.K8c, LocalStrings.Endofpain, ItemEndofpainRecipe.texture, AddedItems.K9m, true, AddedItems.TranquilCrystal, AddedItems.TwilightGem, AddedItems.TwilightStone, AddedItems.PowerShard, AddedItems.DenseShard, AddedItems.PowerCrystal, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K10r, AddedItems.K10c, LocalStrings.Unbound, ItemUnboundRecipe.texture, AddedItems.K10m, true, AddedItems.DarkCrystal, AddedItems.DenseGem, AddedItems.LucidGem, AddedItems.EnergyShard, AddedItems.LucidShard, AddedItems.DenseStone, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K11r, AddedItems.K11c, LocalStrings.Sweetdreams, ItemSweetDreamsRecipe.texture, AddedItems.K11m, true, AddedItems.BrightCrystal, AddedItems.TwilightCrystal, AddedItems.BrightGem, AddedItems.EnergyStone, AddedItems.EnergyShard, AddedItems.PowerStone, AddedItems.BlazingShard, null, null, null, null);
		addSynthesisRecipe(AddedItems.K12r, AddedItems.K12c, LocalStrings.Divewing, ItemDivewingRecipe.texture, AddedItems.K12m, true, AddedItems.PowerCrystal, AddedItems.LightningCrystal, AddedItems.LightningGem, AddedItems.BlazingStone, AddedItems.BrightGem, AddedItems.Orichalcum, Item.ingotIron, null, null, null, null);
		addSynthesisRecipe(AddedItems.K13r, AddedItems.K13c, LocalStrings.Counterpoint, ItemCounterpointRecipe.texture, AddedItems.K13m, true, AddedItems.RemembranceCrystal, AddedItems.DarkGem, AddedItems.BlazingShard, AddedItems.LucidShard, AddedItems.DenseStone, AddedItems.LucidShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K14r, AddedItems.K14c, LocalStrings.Allforone, ItemAllForOneRecipe.texture, AddedItems.K14m, true, AddedItems.DenseCrystal, AddedItems.MythrilShard, AddedItems.MythrilGem, AddedItems.BrightShard, AddedItems.BrightStone, AddedItems.FrostShard, AddedItems.LightningShard, null, null, null, null);
		addSynthesisRecipe(AddedItems.K15r, AddedItems.K15c, LocalStrings.Knockoutpunch, ItemKnockoutPunchRecipe.texture, AddedItems.K15m, true, AddedItems.PowerShard, AddedItems.EnergyShard, AddedItems.MythrilCrystal, AddedItems.DenseShard, AddedItems.DenseStone, AddedItems.DarkStone, AddedItems.LucidGem, AddedItems.DenseCrystal, AddedItems.BlazingShard, null, null);
		addSynthesisRecipe(AddedItems.K16r, AddedItems.K16c, LocalStrings.Ferrisgear, ItemFerrisgearRecipe.texture, AddedItems.K16m, true, AddedItems.PowerCrystal, AddedItems.BrightShard, AddedItems.LucidGem, AddedItems.TranquilStone, AddedItems.TranquilGem, AddedItems.MythrilShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K17r, AddedItems.K17c, LocalStrings.Dualdisc, ItemDualDiscRecipe.texture, AddedItems.K17m, true, AddedItems.EnergyGem, AddedItems.PowerGem, AddedItems.DenseStone, AddedItems.DenseShard, AddedItems.BrightStone, AddedItems.BrightGem, AddedItems.EnergyCrystal, null, null, null, null);
		addSynthesisRecipe(AddedItems.K18r, AddedItems.K18c, LocalStrings.Guardianbell, ItemGuardianBellRecipe.texture, AddedItems.K18m, true, AddedItems.DarkCrystal, AddedItems.ShinyCrystal, AddedItems.MythrilShard, AddedItems.DenseStone, AddedItems.BrightStone, AddedItems.BlazingShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K19r, AddedItems.K19c, LocalStrings.Skullnoise, ItemSkullNoiseRecipe.texture, AddedItems.K19m, true, AddedItems.Orichalcum, AddedItems.DarkMatter, AddedItems.LucidGem, AddedItems.MythrilGem, AddedItems.BlazingStone, AddedItems.DarkShard, AddedItems.BlazingShard, AddedItems.DarkStone, null, null, null);
		addSynthesisRecipe(AddedItems.K20r, AddedItems.K20c, LocalStrings.Woodenkeyblade, ItemWoodenKeybladeRecipe.texture, AddedItems.K20m, true, AddedItems.TranquilGem, AddedItems.SerenityShard, AddedItems.BrightShard, AddedItems.DenseStone, AddedItems.DenseShard, null, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K21r, AddedItems.K21c, LocalStrings.Kyebladebroken, ItemIncompleteKyebladeRecipe.texture, AddedItems.K21m, true, AddedItems.OrichalcumPlus, AddedItems.Orichalcum, AddedItems.DarkMatter, AddedItems.DarkCrystal, AddedItems.DarkHeart, AddedItems.KingdomHearts, AddedItems.BrightCrystal, AddedItems.BrightGem, AddedItems.PureHeart, AddedItems.BrightStone, AddedItems.Heart);
		addSynthesisRecipe(AddedItems.K22r, AddedItems.K22c, LocalStrings.Kyeblade, ItemKyebladeRecipe.texture, AddedItems.K22m, true, AddedItems.OrichalcumPlus, AddedItems.Orichalcum, AddedItems.DarkMatter, AddedItems.DarkCrystal, AddedItems.DarkHeart, AddedItems.KingdomHearts, AddedItems.BrightCrystal, AddedItems.BrightGem, AddedItems.PureHeart, AddedItems.K21, AddedItems.Heart);
		addSynthesisRecipe(AddedItems.K23r, AddedItems.K23c, LocalStrings.Lightseeker, ItemLightSeekerRecipe.texture, AddedItems.K23m, true, AddedItems.SerenityCrystal, AddedItems.BrightCrystal, AddedItems.MythrilGem, AddedItems.DenseStone, AddedItems.BrightStone, AddedItems.BlazingShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K24r, AddedItems.K24c, LocalStrings.Lostmemory, ItemLostMemoryRecipe.texture, AddedItems.K24m, true, AddedItems.OrichalcumPlus, AddedItems.RemembranceCrystal, AddedItems.RemembranceShard, AddedItems.DarkStone, AddedItems.BrightStone, AddedItems.TwilightGem, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K25r, AddedItems.K25c, LocalStrings.Frolicflame, ItemFrolicflameRecipe.texture, AddedItems.K25m, true, AddedItems.Orichalcum, AddedItems.BlazingCrystal, AddedItems.BlazingGem, AddedItems.MythrilGem, AddedItems.DenseStone, AddedItems.BrightStone, AddedItems.BlazingShard, AddedItems.BlazingStone, AddedItems.TwilightGem, null, null);
		addSynthesisRecipe(AddedItems.K26r, AddedItems.K26c, LocalStrings.Masterkeeper, ItemMasterKeeperRecipe.texture, AddedItems.K26m, true, AddedItems.OrichalcumPlus, AddedItems.MythrilGem, AddedItems.PowerShard, AddedItems.BlazingStone, AddedItems.BrightShard, null, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K27r, AddedItems.K27c, LocalStrings.Brigthcrest, ItemBrightCrestRecipe.texture, AddedItems.K27m, true, AddedItems.SerenityCrystal, AddedItems.MythrilCrystal, AddedItems.MythrilShard, AddedItems.BrightGem, AddedItems.BrightStone, AddedItems.BrightShard, AddedItems.SerenityShard, null, null, null, null);
		addSynthesisRecipe(AddedItems.K28r, AddedItems.K28c, LocalStrings.Crownunlimit, ItemCrownUnlimitRecipe.texture, AddedItems.K28m, true, AddedItems.OrichalcumPlus, AddedItems.Orichalcum, AddedItems.MythrilCrystal, AddedItems.BrightStone, AddedItems.PowerShard, AddedItems.EnergyGem, AddedItems.EnergyShard, null, null, null, null);
		addSynthesisRecipe(AddedItems.K29r, AddedItems.K29c, LocalStrings.Noname, ItemNoNameRecipe.texture, AddedItems.K29m, true, AddedItems.DarkMatter, AddedItems.DarkCrystal, AddedItems.DarkShard, AddedItems.EnergyStone, AddedItems.PowerStone, AddedItems.PowerShard, AddedItems.EnergyShard, AddedItems.PowerCrystal, null, null, null);
		addSynthesisRecipe(AddedItems.K30r, AddedItems.K30c, LocalStrings.Voidgear, ItemVoidGearRecipe.texture, AddedItems.K30m, true, AddedItems.Orichalcum, AddedItems.DarkMatter, AddedItems.DarkCrystal, AddedItems.DarkGem, AddedItems.DarkStone, AddedItems.DarkShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K31r, AddedItems.K31c, LocalStrings.Sweetstack, ItemSweetStackRecipe.texture, AddedItems.K31m, true, AddedItems.ShinyCrystal, AddedItems.SerenityCrystal, AddedItems.SerenityShard, AddedItems.FrostGem, AddedItems.FrostShard, AddedItems.TranquilStone, AddedItems.BrightGem, null, null, null, null);
		addSynthesisRecipe(AddedItems.K32r, AddedItems.K32c, LocalStrings.Pixiepetal, ItemPixiePetalRecipe.texture, AddedItems.K32m, true, AddedItems.MythrilCrystal, AddedItems.SerenityStone, AddedItems.TranquilStone, AddedItems.MythrilShard, AddedItems.TranquilShard, AddedItems.BrightCrystal, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K33r, AddedItems.K33c, LocalStrings.Hyperdrive, ItemHyperdriveRecipe.texture, AddedItems.K33m, true, AddedItems.PowerCrystal, AddedItems.EnergyCrystal, AddedItems.MythrilGem, AddedItems.DenseStone, AddedItems.LightningShard, AddedItems.LightningStone, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K34r, AddedItems.K34c, LocalStrings.Markofahero, ItemMarkOfAHeroRecipe.texture, AddedItems.K34m, true, AddedItems.BrightCrystal, AddedItems.SerenityCrystal, AddedItems.LucidGem, AddedItems.LucidShard, AddedItems.BrightStone, AddedItems.LightningStone, AddedItems.SerenityGem, null, null, null, null);
		addSynthesisRecipe(AddedItems.K35r, AddedItems.K35c, LocalStrings.Victoryline, ItemVictoryLineRecipe.texture, AddedItems.K35m, true, AddedItems.Orichalcum, AddedItems.DarkCrystal, AddedItems.BrightCrystal, AddedItems.LightningGem, AddedItems.BrightStone, AddedItems.LucidShard, AddedItems.LightningStone, AddedItems.DarkShard, null, null, null);
		addSynthesisRecipe(AddedItems.K36r, AddedItems.K36c, LocalStrings.Fairystars, ItemFairyStarsRecipe.texture, AddedItems.K36m, true, AddedItems.MythrilCrystal, AddedItems.ShinyCrystal, AddedItems.DenseGem, AddedItems.DenseStone, AddedItems.BrightStone, AddedItems.BrightShard, AddedItems.DenseShard, null, null, null, null);
		addSynthesisRecipe(AddedItems.K37r, AddedItems.K37c, LocalStrings.Strokeofmidnight, ItemStrokeOfMidnightRecipe.texture, AddedItems.K37m, true, AddedItems.FrostCrystal, AddedItems.FrostGem, AddedItems.FrostShard, AddedItems.MythrilStone, AddedItems.MythrilShard, AddedItems.BrightGem, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K38r, AddedItems.K38c, LocalStrings.Chaosripper, ItemChaosRipperRecipe.texture, AddedItems.K38m, true, AddedItems.LucidCrystal, AddedItems.LucidShard, AddedItems.DarkCrystal, AddedItems.DarkMatter, AddedItems.DarkStone, AddedItems.DarkStone, AddedItems.DenseGem, AddedItems.DenseStone, null, null, null);
		addSynthesisRecipe(AddedItems.K39r, AddedItems.K39c, LocalStrings.Xehanortskeyblade, ItemMasterXehanortsKeyRecipe.texture, AddedItems.K39m, true, AddedItems.OrichalcumPlus, AddedItems.DarkCrystal, AddedItems.MythrilCrystal, AddedItems.DenseCrystal, AddedItems.DarkGem, AddedItems.DarkStone, AddedItems.DenseStone, AddedItems.MythrilShard, AddedItems.DenseShard, AddedItems.DarkShard, AddedItems.DarkMatter);
		addSynthesisRecipe(AddedItems.K40r, AddedItems.K40c, LocalStrings.Darkgnaw, ItemDarkgnawRecipe.texture, AddedItems.K40m, true, AddedItems.LucidCrystal, AddedItems.DarkGem, AddedItems.LucidGem, AddedItems.DarkShard, AddedItems.LucidShard, AddedItems.LucidStone, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K41r, AddedItems.K41c, LocalStrings.Zeroone, ItemZeroOneRecipe.texture, AddedItems.K41m, true, AddedItems.Orichalcum, AddedItems.EnergyCrystal, AddedItems.EnergyGem, AddedItems.EnergyStone, AddedItems.EnergyShard, AddedItems.PowerCrystal, AddedItems.PowerGem, AddedItems.PowerStone, AddedItems.PowerShard, null, null);
		addSynthesisRecipe(AddedItems.K42r, AddedItems.K42c, LocalStrings.Dreamsword, ItemDreamswordRecipe.texture, AddedItems.K42m, true, AddedItems.RemembranceCrystal, AddedItems.TranquilCrystal, AddedItems.MythrilGem, AddedItems.TranquilGem, AddedItems.RemembranceStone, AddedItems.TranquilStone, AddedItems.TranquilShard, AddedItems.RemembranceShard, null, null, null);
		addSynthesisRecipe(AddedItems.K43r, AddedItems.K43c, LocalStrings.Aubade, ItemAubadeRecipe.texture, AddedItems.K43m, true, AddedItems.BrightCrystal, AddedItems.PowerCrystal, AddedItems.ShinyCrystal, AddedItems.BrightGem, AddedItems.BrightStone, AddedItems.BrightShard, AddedItems.PowerShard, null, null, null, null);
		addSynthesisRecipe(AddedItems.K44r, AddedItems.K44c, LocalStrings.Umbrella, ItemUmbrellaRecipe.texture, AddedItems.K44m, true, AddedItems.FrostCrystal, AddedItems.FrostShard, AddedItems.FrostGem, AddedItems.LightningCrystal, AddedItems.LightningShard, AddedItems.LightningStone, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K45r, AddedItems.K45c, LocalStrings.Omegaweapon, ItemOmegaWeaponRecipe.texture, AddedItems.K45m, true, AddedItems.OrichalcumPlus, AddedItems.Orichalcum, AddedItems.MythrilShard, AddedItems.DenseShard, AddedItems.DenseStone, AddedItems.MythrilCrystal, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K46r, AddedItems.K46c, LocalStrings.Twilightblaze, ItemTwilightBlazeRecipe.texture, AddedItems.K46m, true, AddedItems.TwilightCrystal, AddedItems.BlazingCrystal, AddedItems.TwilightGem, AddedItems.BlazingStone, AddedItems.TwilightShard, AddedItems.BlazingShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K47r, AddedItems.K47c, LocalStrings.Maverickflare, ItemMaverickFlameRecipe.texture, AddedItems.K47m, true, AddedItems.DarkCrystal, AddedItems.BlazingGem, AddedItems.DarkStone, AddedItems.BlazingShard, AddedItems.BlazingStone, AddedItems.DarkShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K48r, AddedItems.K48c, LocalStrings.Astralblast, ItemAstralBlastRecipe.texture, AddedItems.K48m, true, AddedItems.Orichalcum, AddedItems.MythrilCrystal, AddedItems.BlazingShard, AddedItems.BlazingStone, AddedItems.BlazingShard, AddedItems.MythrilStone, AddedItems.MythrilShard, null, null, null, null);
		addSynthesisRecipe(AddedItems.K49r, AddedItems.K49c, LocalStrings.Darkerthandark, ItemDarkerThanDarkRecipe.texture, AddedItems.K49m, true, AddedItems.DarkMatter, AddedItems.DarkCrystal, AddedItems.LucidGem, AddedItems.LucidShard, AddedItems.DarkShard, AddedItems.DarkStone, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K50r, AddedItems.K50c, LocalStrings.Lunareclipse, ItemLunarEclipseRecipe.texture, AddedItems.K50m, true, AddedItems.Orichalcum, AddedItems.RemembranceCrystal, AddedItems.DarkGem, AddedItems.BrightGem, AddedItems.BrightStone, AddedItems.DarkStone, AddedItems.RemembranceShard, null, null, null, null);
		addSynthesisRecipe(AddedItems.K51r, AddedItems.K51c, LocalStrings.Silentdirge, ItemSilentDirgeRecipe.texture, AddedItems.K51m, true, AddedItems.SerenityCrystal, AddedItems.TranquilCrystal, AddedItems.FrostStone, AddedItems.TranquilShard, AddedItems.SerenityShard, AddedItems.FrostGem, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K52r, AddedItems.K52c, LocalStrings.Totaleclipse, ItemTotalEclipseRecipe.texture, AddedItems.K52m, true, AddedItems.Orichalcum, AddedItems.TwilightCrystal, AddedItems.DarkGem, AddedItems.BrightGem, AddedItems.BrightStone, AddedItems.DarkStone, AddedItems.TwilightShard, null, null, null, null);
		addSynthesisRecipe(AddedItems.K53r, AddedItems.K53c, LocalStrings.Glimpseofdarkness, ItemGlimpseofdarknessRecipe.texture, AddedItems.K53m, true, AddedItems.Orichalcum, AddedItems.SerenityCrystal, AddedItems.MythrilGem, AddedItems.DenseStone, AddedItems.BrightStone, AddedItems.BlazingShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K54r, AddedItems.K54c, LocalStrings.Midnightroar, ItemMidnightRoarRecipe.texture, AddedItems.K54m, true, AddedItems.DarkGem, AddedItems.SerenityCrystal, AddedItems.MythrilGem, AddedItems.DenseStone, AddedItems.BrightStone, AddedItems.BlazingShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K55r, AddedItems.K55c, LocalStrings.Rejectionoffate, ItemRejectionOfFateRecipe.texture, AddedItems.K55m, true, AddedItems.RemembranceCrystal, AddedItems.DarkCrystal, AddedItems.DenseShard, AddedItems.EnergyCrystal, AddedItems.EnergyStone, AddedItems.PowerShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K56r, AddedItems.K56c, LocalStrings.Truelightsflight, ItemTrueLightsFlightRecipe.texture, AddedItems.K56m, true, AddedItems.Orichalcum, AddedItems.BrightCrystal, AddedItems.BrightStone, AddedItems.BrightShard, AddedItems.PowerCrystal, AddedItems.PowerShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K57r, AddedItems.K57c, LocalStrings.Leviathan, ItemLeviathanRecipe.texture, AddedItems.K57m, true, AddedItems.MythrilCrystal, AddedItems.MythrilGem, AddedItems.MythrilStone, AddedItems.MythrilShard, AddedItems.EnergyCrystal, AddedItems.PowerCrystal, AddedItems.PowerStone, null, null, null, null);
		addSynthesisRecipe(AddedItems.K58r, AddedItems.K58c, LocalStrings.Abyssaltide, ItemAbyssalTideRecipe.texture, AddedItems.K58m, true, AddedItems.FrostCrystal, AddedItems.FrostGem, AddedItems.MythrilGem, AddedItems.FrostShard, AddedItems.DenseStone, AddedItems.FrostShard, AddedItems.FrostGem, null, null, null, null);
		addSynthesisRecipe(AddedItems.K59r, AddedItems.K59c, LocalStrings.Crownofguilt, ItemCrownOfGuiltRecipe.texture, AddedItems.K59m, true, AddedItems.Orichalcum, AddedItems.DarkGem, AddedItems.DenseStone, AddedItems.DenseShard, null, null, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K60r, AddedItems.K60c, LocalStrings.Signofinnocence, ItemSignOfInnocenceRecipe.texture, AddedItems.K60m, true, AddedItems.BrightCrystal, AddedItems.SerenityCrystal, AddedItems.BrightStone, AddedItems.SerenityShard, AddedItems.SerenityStone, AddedItems.BrightShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K61r, AddedItems.K61c, LocalStrings.Painofsolitude, ItemPainOfSolitudeRecipe.texture, AddedItems.K61m, true, AddedItems.DenseCrystal, AddedItems.LucidGem, AddedItems.MythrilGem, AddedItems.DenseStone, AddedItems.LucidShard, AddedItems.DenseShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K62r, AddedItems.K62c, LocalStrings.Abbadonplasma, ItemAbaddonPlasmaRecipe.texture, AddedItems.K62m, true, AddedItems.Orichalcum, AddedItems.DarkCrystal, AddedItems.DarkGem, AddedItems.LucidGem, AddedItems.DarkShard, null, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K63r, AddedItems.K63c, LocalStrings.Ominousblight, ItemOminousBlightRecipe.texture, AddedItems.K63m, true, AddedItems.MythrilCrystal, AddedItems.MythrilGem, AddedItems.BlazingShard, AddedItems.MythrilShard, AddedItems.BlazingGem, AddedItems.EnergyShard, AddedItems.EnergyStone, null, null, null, null);
		addSynthesisRecipe(AddedItems.K64r, AddedItems.K64c, LocalStrings.Missingache, ItemMissingAcheRecipe.texture, AddedItems.K64m, true, AddedItems.RemembranceCrystal, AddedItems.ShinyCrystal, AddedItems.RemembranceGem, AddedItems.RemembranceStone, AddedItems.BrightStone, null, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K65r, AddedItems.K65c, LocalStrings.Winnersproof, ItemWinnersProofRecipe.texture, AddedItems.K65m, true, AddedItems.OrichalcumPlus, AddedItems.Orichalcum, AddedItems.MythrilGem, AddedItems.BlazingGem, AddedItems.FrostGem, AddedItems.LightningGem, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K66r, AddedItems.K66c, LocalStrings.Fatalcrest, ItemFatalcrestRecipe.texture, AddedItems.K66m, true, AddedItems.DarkCrystal, AddedItems.LucidCrystal, AddedItems.DarkGem, AddedItems.DenseGem, AddedItems.DenseStone, AddedItems.DarkShard, AddedItems.DenseShard, null, null, null, null);
		addSynthesisRecipe(AddedItems.K67r, AddedItems.K67c, LocalStrings.Twobecomesone, ItemTwoBecomeOneRecipe.texture, AddedItems.K67m, true, AddedItems.PowerCrystal, AddedItems.EnergyCrystal, AddedItems.PowerStone, AddedItems.EnergyStone, AddedItems.PowerStone, AddedItems.PowerShard, AddedItems.EnergyShard, null, null, null, null);
		addSynthesisRecipe(AddedItems.K68r, AddedItems.K68c, LocalStrings.Bondofflame, ItemBondOfFlamesRecipe.texture, AddedItems.K68m, true, AddedItems.DarkCrystal, AddedItems.BlazingCrystal, AddedItems.BlazingStone, AddedItems.BlazingShard, AddedItems.BrightShard, null, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K69r, AddedItems.K69c, LocalStrings.Fenrir, ItemFenrirRecipe.texture, AddedItems.K69m, true, AddedItems.LightningCrystal, AddedItems.MythrilCrystal, AddedItems.LightningGem, AddedItems.DenseStone, AddedItems.LightningShard, AddedItems.DenseShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K70r, AddedItems.K70c, LocalStrings.Sleepinglion, ItemSleepingLionRecipe.texture, AddedItems.K70m, true, AddedItems.TranquilCrystal, AddedItems.SerenityCrystal, AddedItems.SerenityGem, AddedItems.TranquilStone, AddedItems.SerenityShard, AddedItems.SerenityStone, AddedItems.TranquilGem, AddedItems.DarkShard, null, null, null);
		addSynthesisRecipe(AddedItems.K71r, AddedItems.K71c, LocalStrings.Guardiansoul, ItemGuardianSoulRecipe.texture, AddedItems.K71m, true, AddedItems.Orichalcum, AddedItems.DenseCrystal, AddedItems.MythrilGem, AddedItems.BrightStone, AddedItems.DenseShard, AddedItems.BrightShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K72r, AddedItems.K72c, LocalStrings.Gullwing, ItemGullwingRecipe.texture, AddedItems.K72m, true, AddedItems.LightningCrystal, AddedItems.LightningGem, AddedItems.LightningStone, AddedItems.LightningShard, AddedItems.SerenityStone, AddedItems.TranquilCrystal, AddedItems.TranquilShard, AddedItems.SerenityGem, null, null, null);
		addSynthesisRecipe(AddedItems.K73r, AddedItems.K73c, LocalStrings.Photondebugger, ItemPhotonDebuggerRecipe.texture, AddedItems.K73m, true, AddedItems.PowerCrystal, AddedItems.PowerGem, AddedItems.MythrilGem, AddedItems.PowerStone, AddedItems.PowerShard, AddedItems.EnergyShard, AddedItems.EnergyStone, null, null, null, null);
		addSynthesisRecipe(AddedItems.K74r, AddedItems.K74c, LocalStrings.Sweetmemories, ItemSweetMemoriesRecipe.texture, AddedItems.K74m, true, AddedItems.ShinyCrystal, AddedItems.TranquilGem, AddedItems.FrostGem, AddedItems.FrostStone, AddedItems.FrostShard, AddedItems.BrightCrystal, AddedItems.TranquilShard, AddedItems.BrightShard, null, null, null);
		addSynthesisRecipe(AddedItems.K75r, AddedItems.K75c, LocalStrings.Circleoflife, ItemCircleOfLifeRecipe.texture, AddedItems.K75m, true, AddedItems.RemembranceCrystal, AddedItems.SerenityCrystal, AddedItems.MythrilGem, AddedItems.SerenityStone, AddedItems.SerenityShard, AddedItems.TranquilShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K76r, AddedItems.K76c, LocalStrings.Decisivepumpkin, ItemDecisivePumpkinRecipe.texture, AddedItems.K76m, true, AddedItems.RemembranceCrystal, AddedItems.SerenityCrystal, AddedItems.DarkCrystal, AddedItems.LucidStone, AddedItems.BrightShard, AddedItems.DarkShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K77r, AddedItems.K77c, LocalStrings.Wishinglamp, ItemWishingLampRecipe.texture, AddedItems.K77m, true, AddedItems.ShinyCrystal, AddedItems.SerenityCrystal, AddedItems.BrightGem, AddedItems.MythrilGem, AddedItems.BrightStone, AddedItems.BrightShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K78r, AddedItems.K78c, LocalStrings.Followthewind, ItemFollowthewindRecipe.texture, AddedItems.K78m, true, AddedItems.Orichalcum, AddedItems.SerenityCrystal, AddedItems.LightningGem, AddedItems.LightningStone, AddedItems.LightningShard, null, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K79r, AddedItems.K79c, LocalStrings.Mysteriousabyss, ItemMysteriousAbyssRecipe.texture, AddedItems.K79m, true, AddedItems.FrostCrystal, AddedItems.PowerCrystal, AddedItems.MythrilGem, AddedItems.MythrilShard, AddedItems.FrostShard, AddedItems.PowerStone, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K80r, AddedItems.K80c, LocalStrings.Monochrome, ItemMonochromeRecipe.texture, AddedItems.K80m, true, AddedItems.Orichalcum, AddedItems.LucidCrystal, AddedItems.TwilightGem, AddedItems.MythrilGem, AddedItems.TwilightStone, AddedItems.LucidStone, AddedItems.LucidShard, AddedItems.TwilightShard, null, null, null);
		addSynthesisRecipe(AddedItems.K81r, AddedItems.K81c, LocalStrings.Heroscrest, ItemHeroscrestRecipe.texture, AddedItems.K81m, true, AddedItems.BrightCrystal, AddedItems.TwilightCrystal, AddedItems.BrightStone, AddedItems.DenseStone, AddedItems.BrightShard, AddedItems.SerenityShard, AddedItems.TranquilStone, AddedItems.TranquilCrystal, null, null, null);
		addSynthesisRecipe(AddedItems.K82r, AddedItems.K82c, LocalStrings.Rumblingrose, ItemRumblingRoseRecipe.texture, AddedItems.K82m, true, AddedItems.Orichalcum, AddedItems.SerenityCrystal, AddedItems.MythrilGem, AddedItems.EnergyStone, AddedItems.PowerShard, AddedItems.MythrilShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K83r, AddedItems.K83c, LocalStrings.Hiddendragon, ItemHiddenDragonRecipe.texture, AddedItems.K83m, true, AddedItems.OrichalcumPlus, AddedItems.BlazingCrystal, AddedItems.DarkGem, AddedItems.BlazingStone, AddedItems.DarkStone, AddedItems.BlazingShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K84r, AddedItems.K84c, LocalStrings.Endsofearth, ItemEndsofearthRecipe.texture, AddedItems.K84m, true, AddedItems.DenseCrystal, AddedItems.DenseGem, AddedItems.DenseStone, AddedItems.DarkStone, AddedItems.DarkShard, AddedItems.DenseShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K85r, AddedItems.K85c, LocalStrings.Stormfall, ItemStormFallRecipe.texture, AddedItems.K85m, true, AddedItems.FrostCrystal, AddedItems.FrostGem, AddedItems.FrostStone, AddedItems.BrightStone, AddedItems.BrightShard, AddedItems.FrostShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K86r, AddedItems.K86c, LocalStrings.Destinysembrace, ItemDestinysembraceRecipe.texture, AddedItems.K86m, true, AddedItems.SerenityCrystal, AddedItems.ShinyCrystal, AddedItems.MythrilGem, AddedItems.MythrilStone, AddedItems.TranquilStone, AddedItems.BrightShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K87r, AddedItems.K87c, LocalStrings.Waytodawn, ItemWayToDawnRecipe.texture, AddedItems.K87m, true, AddedItems.Orichalcum, AddedItems.DarkCrystal, AddedItems.LightningGem, AddedItems.TwilightGem, AddedItems.DarkStone, AddedItems.LightningShard, AddedItems.TwilightShard, null, null, null, null);
		addSynthesisRecipe(AddedItems.K88r, AddedItems.K88c, LocalStrings.Onewingedangel, ItemOneWingedAngelRecipe.texture, AddedItems.K88m, true, AddedItems.OrichalcumPlus, AddedItems.Orichalcum, AddedItems.BlazingGem, AddedItems.BlazingStone, AddedItems.BlazingShard, null, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K89r, AddedItems.K89c, LocalStrings.Diamonddust, ItemDiamonddustRecipe.texture, AddedItems.K89m, true, AddedItems.Orichalcum, AddedItems.FrostCrystal, AddedItems.FrostGem, AddedItems.FrostStone, AddedItems.FrostShard, AddedItems.MythrilCrystal, AddedItems.TwilightGem, null, null, null, null);
		addSynthesisRecipe(AddedItems.K90r, AddedItems.K90c, LocalStrings.Lionheart, ItemLionHeartRecipe.texture, AddedItems.K90m, true, AddedItems.BlazingCrystal, AddedItems.PowerCrystal, AddedItems.PowerStone, AddedItems.BlazingStone, AddedItems.BlazingShard, AddedItems.PowerShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K91r, AddedItems.K91c, LocalStrings.Metalchocobo, ItemMetalChocoboRecipe.texture, AddedItems.K91m, true, AddedItems.SerenityCrystal, AddedItems.LightningGem, AddedItems.SerenityStone, AddedItems.LightningShard, AddedItems.DenseCrystal, AddedItems.DenseShard, AddedItems.TranquilCrystal, null, null, null, null);
		addSynthesisRecipe(AddedItems.K92r, AddedItems.K92c, LocalStrings.Spellbinder, ItemSpellBinderRecipe.texture, AddedItems.K92m, true, AddedItems.Orichalcum, AddedItems.MythrilCrystal, AddedItems.MythrilGem, AddedItems.MythrilStone, AddedItems.MythrilShard, AddedItems.BrightCrystal, AddedItems.EnergyCrystal, null, null, null, null);
		addSynthesisRecipe(AddedItems.K93r, AddedItems.K93c, LocalStrings.Divinerose, ItemDivineRoseRecipe.texture, AddedItems.K93m, true, AddedItems.BrightCrystal, AddedItems.BrightGem, AddedItems.DenseStone, AddedItems.BrightShard, null, null, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K94r, AddedItems.K94c, LocalStrings.Fairyharp, ItemFairyharpRecipe.texture, AddedItems.K94m, true, AddedItems.TwilightCrystal, AddedItems.TranquilCrystal, AddedItems.MythrilCrystal, AddedItems.TranquilGem, AddedItems.DenseStone, AddedItems.TwilightStone, AddedItems.TranquilShard, null, null, null, null);
		addSynthesisRecipe(AddedItems.K95r, AddedItems.K95c, LocalStrings.Crabclaw, ItemCrabClawRecipe.texture, AddedItems.K95m, true, AddedItems.FrostCrystal, AddedItems.MythrilGem, AddedItems.FrostGem, AddedItems.FrostStone, AddedItems.MythrilStone, AddedItems.FrostShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K96r, AddedItems.K96c, LocalStrings.Wishingstar, ItemWishingStarRecipe.texture, AddedItems.K96m, true, AddedItems.DenseCrystal, AddedItems.RemembranceCrystal, AddedItems.DenseGem, AddedItems.RemembranceGem, AddedItems.RemembranceStone, AddedItems.RemembranceShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K97r, AddedItems.K97c, LocalStrings.Pumpkinhead, ItemPumpkinHeadRecipe.texture, AddedItems.K97m, true, AddedItems.DarkCrystal, AddedItems.LucidCrystal, AddedItems.DarkGem, AddedItems.LucidGem, AddedItems.DarkStone, AddedItems.LucidShard, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K98r, AddedItems.K98c, LocalStrings.Threewishes, ItemThreeWishesRecipe.texture, AddedItems.K98m, true, AddedItems.DenseCrystal, AddedItems.SerenityCrystal, AddedItems.MythrilCrystal, AddedItems.MythrilGem, AddedItems.DenseGem, AddedItems.SerenityGem, AddedItems.DenseStone, AddedItems.SerenityStone, AddedItems.MythrilShard, AddedItems.DenseShard, AddedItems.SerenityShard);
		addSynthesisRecipe(AddedItems.K99r, AddedItems.K99c, LocalStrings.Jungleking, ItemJungleKingRecipe.texture, AddedItems.K99m, true, AddedItems.EnergyCrystal, AddedItems.EnergyStone, AddedItems.EnergyShard, AddedItems.PowerCrystal, AddedItems.PowerGem, AddedItems.EnergyCrystal, AddedItems.PowerShard, AddedItems.PowerStone, null, null, null);
		addSynthesisRecipe(AddedItems.K100r, AddedItems.K100c, LocalStrings.Olympia, ItemOlympiaRecipe.texture, AddedItems.K100m, true, AddedItems.OrichalcumPlus, AddedItems.Orichalcum, AddedItems.MythrilGem, AddedItems.SerenityGem, AddedItems.SerenityShard, AddedItems.PowerCrystal, AddedItems.PowerGem, null, null, null, null);
		addSynthesisRecipe(AddedItems.K101r, AddedItems.K101c, LocalStrings.Ladyluck, ItemLadyLuckRecipe.texture, AddedItems.K101m, true, AddedItems.TranquilGem, AddedItems.SerenityGem, AddedItems.BrightCrystal, AddedItems.TranquilStone, AddedItems.SerenityShard, AddedItems.TranquilShard, AddedItems.BrightShard, null, null, null, null);
		//addSynthesisRecipe(AddedItems.K102r, AddedItems.K102c, LocalStrings.Peopleshearts, ItemKeybladeOfPeoplesHeartsRecipe.texture, AddedItems.K102m, true, AddedItems.DarkMatter, AddedItems.DarkCrystal, AddedItems., item4, item5, item6, item7, item8, item9, item10, item11);
		//addSynthesisRecipe(AddedItems.K103r, AddedItems.K103c, LocalStrings.Ultimaweapon, ItemUltimaWeaponRecipe.texture, AddedItems.K103m, true, item1, item2, item3, item4, item5, item6, item7, item8, item9, item10, item11);
		//addSynthesisRecipe(AddedItems.K104r, AddedItems.K104c, LocalStrings.Treasuretrove, ItemTreasureTroveRecipe.texture, AddedItems.K104m, true, item1, item2, item3, item4, item5, item6, item7, item8, item9, item10, item11);
		//addSynthesisRecipe(AddedItems.K105r, AddedItems.K105c, LocalStrings.Starseeker, ItemStarseekerRecipe.texture, AddedItems.K105m, true, item1, item2, item3, item4, item5, item6, item7, item8, item9, item10, item11);
		//addSynthesisRecipe(AddedItems.K106r, AddedItems.K106c, LocalStrings.Souleater, ItemSoulEaterRecipe.texture, AddedItems.K106m, true, item1, item2, item3, item4, item5, item6, item7, item8, item9, item10, item11);
		//addSynthesisRecipe(AddedItems.K107r, AddedItems.K107c, LocalStrings.Starlight, ItemStarlightRecipe.texture, AddedItems.K107m, true, item1, item2, item3, item4, item5, item6, item7, item8, item9, item10, item11);
		//addSynthesisRecipe(AddedItems.K108r, AddedItems.K108c, LocalStrings.Rainfell, ItemRainfellRecipe.texture, AddedItems.K108m, true, item1, item2, item3, item4, item5, item6, item7, item8, item9, item10, item11);
		//addSynthesisRecipe(AddedItems.K109r, AddedItems.K109c, LocalStrings.Earthshaker, ItemEarthshakerRecipe.texture, AddedItems.K109m, true, item1, item2, item3, item4, item5, item6, item7, item8, item9, item10, item11);
		addSynthesisRecipe(AddedItems.K110r, AddedItems.K110c, LocalStrings.Waywardwind, ItemWaywardWindRecipe.texture, AddedItems.K110m, true, AddedItems.LightningCrystal, AddedItems.LightningStone, AddedItems.DenseShard, AddedItems.LightningGem, AddedItems.PowerCrystal, AddedItems.PowerGem, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K111r, AddedItems.K111c, LocalStrings.KingdomKey, ItemKingdomKeyRecipe.texture, AddedItems.K111m, true, AddedItems.SerenityCrystal, AddedItems.BrightGem, AddedItems.DenseStone, AddedItems.BrightStone, AddedItems.BrightShard, null, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K112r, AddedItems.K112c, LocalStrings.Oathkeeper, ItemOathkeeperRecipe.texture, AddedItems.K112m, true, AddedItems.SerenityCrystal, AddedItems.BrightGem, AddedItems.DenseStone, AddedItems.BrightStone, AddedItems.BrightShard, null, null, null, null, null, null);
		addSynthesisRecipe(AddedItems.K113r, AddedItems.K113c, LocalStrings.KingdomKeyD, ItemKingdomKeyDRecipe.texture, AddedItems.K113m, true, AddedItems.SerenityCrystal, AddedItems.BrightGem, AddedItems.DenseStone, AddedItems.BrightStone, AddedItems.BrightShard, AddedItems.PowerCrystal, AddedItems.DenseGem, null, null, null, null);
		addSynthesisRecipe(AddedItems.K114r, AddedItems.K114c, LocalStrings.Oblivion, ItemOblivionRecipe.texture, AddedItems.K114m, true, AddedItems.OrichalcumPlus, AddedItems.DarkCrystal, AddedItems.DenseCrystal, AddedItems.PowerGem, AddedItems.TwilightCrystal, AddedItems.TwilightStone, AddedItems.DarkShard, AddedItems.LucidStone, AddedItems.DarkMatter, null, null);
		
		
		if(ClickedTab1){
			Tab2SrcY = 0;
			Tab1SrcY = 17;
			mc.renderEngine.bindTexture(texture);
			drawTexturedModalRect(28, 28, 0, 166, 16, 16);
		}else if(ClickedTab2){
			Tab1SrcY = 0;
			Tab2SrcY = 17;
		}else if(ClickedTab3){
			
		}

		if(Tab1X + guiLeft <= x && x <= Tab1X + guiLeft + DimensionsOfTabW && Tab1Y + guiTop <= y && y <= Tab1Y + guiTop + DimensionsOfTabH){
			ArrayList<String> Tab1ToolTip = new ArrayList<String>();
			Tab1ToolTip.add("Information");
			drawHoveringText(Tab1ToolTip, x - guiLeft, y - guiTop, fontRenderer);
		}
		
		if(Tab2X + guiLeft <= x && x <= Tab2X + guiLeft + DimensionsOfTabW && Tab2Y + guiTop <= y && y <= Tab2Y + guiTop + DimensionsOfTabH){
			ArrayList<String> Tab2ToolTip = new ArrayList<String>();
			Tab2ToolTip.add("Required Synthesis Materials");
			drawHoveringText(Tab2ToolTip, x - guiLeft, y - guiTop, fontRenderer);
		}
		
		if(Tab3X + guiLeft <= x && x <= Tab3X + guiLeft + DimensionsOfTabW && Tab3Y + guiTop <= y && y <= Tab3Y + guiTop + DimensionsOfTabH){
			ArrayList<String> Tab3ToolTip = new ArrayList<String>();
			Tab3ToolTip.add("Help");
			drawHoveringText(Tab3ToolTip, x - guiLeft, y - guiTop, fontRenderer);
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void initGui(){
		super.initGui();
		ButtonPressed = false;
		buttonList.clear();
		Minecraft.getMinecraft().sndManager.playSoundFX("kk:kupo", 1, 1F);
		GuiButton Synthesize = new GuiButton(0, guiLeft + 108, guiTop + 4, 60, 20, "Synthesize");
		buttonList.add(Synthesize);
	}
	
	public static boolean ButtonPressed = false;

	@Override
	protected void actionPerformed(GuiButton button){
		if(button.id == 0){
			ButtonPressed = true;
		}else{
			ButtonPressed = false;
		}

	}
	
	@Override
	protected void mouseClicked(int x, int y, int button) {
		GuiTabs tab = new GuiTabs(button, button, button, button);
		super.mouseClicked(x, y, button);
		if(Tab1X + guiLeft <= x && x <= Tab1X + guiLeft + DimensionsOfTabW && Tab1Y + guiTop <= y && y <= Tab1Y + guiTop + DimensionsOfTabH){
			ClickedTab1 = true;
			ClickedTab2 = false;
			ClickedTab3 = false;
		}
		if(Tab2X + guiLeft <= x && x <= Tab2X + guiLeft + DimensionsOfTabW && Tab2Y + guiTop <= y && y <= Tab2Y + guiTop + DimensionsOfTabH){
			ClickedTab1 = false;
			ClickedTab2 = true;
			ClickedTab3 = false;
		}
		if(Tab3X + guiLeft <= x && x <= Tab3X + guiLeft + DimensionsOfTabW && Tab3Y + guiTop <= y && y <= Tab3Y + guiTop + DimensionsOfTabH){
			ClickedTab1 = false;
			ClickedTab2 = false;
			ClickedTab3 = true;
			
			x = mouseX;
			y = mouseY;
		}
		
	}
	
	int mouseX;
	int mouseY;
	
	protected int getLeft() {
		return guiLeft;
	}
	
	protected int getTop() {
		return guiTop;
	}
	
	protected int getX(){
		return mouseX;
	}
	
	protected int getY(){
		return mouseY;
	}
	/**
	 * 
	 * @param recipe The item for the recipe that goes in the slot on the gui
	 * @param result The item made when clicking 'Synthesize'
	 * @param resultName The name of the item
	 * @param texture The resource location for the item
	 * @param material The EnumToolMaterial for the item
	 * @param isKeyblade If the result is a keyblade
	 * @param item1 The first material required for the recipe
	 * @param item2 The second material required for the recipe
	 * @param item3 The third material required for the recipe
	 * @param item4 The fourth material required for the recipe
	 * @param item5 The fifth material required for the recipe
	 * @param item6 The sixth material required for the recipe
	 * @param item7 The seventh material required for the recipe
	 * @param item8 The eighth material required for the recipe
	 * @param item9 The ninth material required for the recipe
	 * @param item10 The tenth material required for the recipe
	 * @param item11 The eleventh material required for the recipe
	 */
	public void addSynthesisRecipe(Item recipe, Item result, String resultName, ResourceLocation texture, EnumToolMaterial material, boolean isKeyblade, Item item1, Item item2, Item item3, Item item4, Item item5, Item item6, Item item7, Item item8, Item item9, Item item10, Item item11){
		//Boolean for checking items
		boolean hasItems = false;
		//Colour for colour changing text
		int colour = 0x404040;
		/**
		*
		* Vanquish level converting to roman numerals
		*
		**/
		EnchantmentHelper.getEnchantmentLevel(KingdomKeys.HarvestHearts.effectId, new ItemStack(result));
		
		String vanquishN;
		switch(EnchantmentHelper.getEnchantmentLevel(KingdomKeys.HarvestHearts.effectId, new ItemStack(result))){
		case 1: {
			vanquishN = "I";
		}
		break;
		case 2: {
			vanquishN = "II";
		}
		break;
		case 3: {
			vanquishN = "III";
		}
		break;
		case 4: {
			vanquishN = "IV";
		}
		break;
		case 5: {
			vanquishN = "V";
		}
		break;
		case 6: {
			vanquishN = "VI";
		}
		break;
		case 7: {
			vanquishN = "VII";
		}
		break;
		case 8: {
			vanquishN = "VIII";
		}
		break;
		case 9: {
			vanquishN = "IX";
		}
		break;
		case 10: {
			vanquishN = "X";
		}
		default: {
			vanquishN = "0";
		}
		}
		//Checking item1 only if only one is specified
		if(item1 != null && item2 == null){
			String item1str = item1.getUnlocalizedName();
			if(synthesis.checkItems() == recipe.itemID && ClickedTab2){
			ResourceLocation item1Icon = new ResourceLocation("kk", "textures/items/" + item1str.replace("item.", "") + ".png");
			mc.renderEngine.bindTexture(item1Icon);
			drawTexture(26, 32, 16, 16);
			//if(26 + guiLeft <= getX() && getX() <= 26 + guiLeft + 16 && 32 + guiTop <= getY() && getY() <= 32 + guiTop + 16){
				//ArrayList<String> Item1ToolTip = new ArrayList<String>();
				//Item1ToolTip.add();
				//drawHoveringText(SeCToolTip, x - guiLeft, y - guiTop, fontRenderer);
			//}
			}
			if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1.itemID)){
				hasItems = true;
				SynthesizeText = "You have the materials required to Synthesize";
				colour = 0x00B330;
			}else{
				hasItems = false;
				SynthesizeText = "You lack the required materials to Synthesize";
				colour = 0xFF0000;
			}
		}
		//Checking item1 and item2 if only 2 are specified
		if(item2 != null && item3 == null){
			String item1str = item1.getUnlocalizedName();
			String item2str = item2.getUnlocalizedName();
			ResourceLocation item1Icon = new ResourceLocation("kk", "textures/items/" + item1str.replace("item.", "") + ".png");
			mc.renderEngine.bindTexture(item1Icon);
			drawTexture(26, 32, 16, 16);
			ResourceLocation item2Icon = new ResourceLocation("kk", "textures/items/" + item2str.replace("item.", "") + ".png");
			mc.renderEngine.bindTexture(item2Icon);
			drawTexture(43, 32, 16, 16);
			if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2.itemID)){
				hasItems = true;
				SynthesizeText = "You have the materials required to Synthesize";
				colour = 0x00B330;
			}else{
				hasItems = false;
				SynthesizeText = "You lack the required materials to Synthesize";
				colour = 0xFF0000;
			}
		}
		//Checking item1, item2 and item3 if only 3 are specified
		if(item3 != null && item4 == null){
			String item1str = item1.getUnlocalizedName();
			String item2str = item2.getUnlocalizedName();
			String item3str = item3.getUnlocalizedName();
			if(synthesis.checkItems() == recipe.itemID && ClickedTab2){
			ResourceLocation item1Icon = new ResourceLocation("kk", "textures/items/" + item1str.replace("item.", "") + ".png");
			mc.renderEngine.bindTexture(item1Icon);
			drawTexture(26, 32, 16, 16);
			ResourceLocation item2Icon = new ResourceLocation("kk", "textures/items/" + item2str.replace("item.", "") + ".png");
			mc.renderEngine.bindTexture(item2Icon);
			drawTexture(43, 32, 16, 16);
			ResourceLocation item3Icon = new ResourceLocation("kk", "textures/items/" + item3str.replace("item.", "") + ".png");
			mc.renderEngine.bindTexture(item3Icon);
			drawTexture(60, 32, 16, 16);
			}
			if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3.itemID)){
				hasItems = true;
				SynthesizeText = "You have the materials required to Synthesize";
				colour = 0x00B330;
			}else{
				hasItems = false;
				SynthesizeText = "You lack the required materials to Synthesize";
				colour = 0xFF0000;
			}
		}
		//Checking item1, item2, item3 and item4 if only 4 are specified	
		if(item4 != null && item5 == null){
			String item1str = item1.getUnlocalizedName();
			String item2str = item2.getUnlocalizedName();
			String item3str = item3.getUnlocalizedName();
			String item4str = item4.getUnlocalizedName();
			if(synthesis.checkItems() == recipe.itemID && ClickedTab2){
			ResourceLocation item1Icon = new ResourceLocation("kk", "textures/items/" + item1str.replace("item.", "") + ".png");
			mc.renderEngine.bindTexture(item1Icon);
			drawTexture(26, 32, 16, 16);
			ResourceLocation item2Icon = new ResourceLocation("kk", "textures/items/" + item2str.replace("item.", "") + ".png");
			mc.renderEngine.bindTexture(item2Icon);
			drawTexture(43, 32, 16, 16);
			ResourceLocation item3Icon = new ResourceLocation("kk", "textures/items/" + item3str.replace("item.", "") + ".png");
			mc.renderEngine.bindTexture(item3Icon);
			drawTexture(60, 32, 16, 16);
			ResourceLocation item4Icon = new ResourceLocation("kk", "textures/items/" + item4str.replace("item.", "") + ".png");
			mc.renderEngine.bindTexture(item4Icon);
			drawTexture(77, 32, 16, 16);
			}
			if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4.itemID)){
				hasItems = true;
				SynthesizeText = "You have the materials required to Synthesize";
				colour = 0x00B330;
			}else{
				hasItems = false;
				SynthesizeText = "You lack the required materials to Synthesize";
				colour = 0xFF0000;
			}
		}
		//Check item1, item2, item3, item4 and item5 if only 5 are specified
		if(item5 != null && item6 == null){
			String item1str = item1.getUnlocalizedName();
			String item2str = item2.getUnlocalizedName();
			String item3str = item3.getUnlocalizedName();
			String item4str = item4.getUnlocalizedName();
			String item5str = item5.getUnlocalizedName();
			if(synthesis.checkItems() == recipe.itemID && ClickedTab2){
			ResourceLocation item1Icon = new ResourceLocation("kk", "textures/items/" + item1str.replace("item.", "") + ".png");
			mc.renderEngine.bindTexture(item1Icon);
			drawTexture(26, 32, 16, 16);
			ResourceLocation item2Icon = new ResourceLocation("kk", "textures/items/" + item2str.replace("item.", "") + ".png");
			mc.renderEngine.bindTexture(item2Icon);
			drawTexture(43, 32, 16, 16);
			ResourceLocation item3Icon = new ResourceLocation("kk", "textures/items/" + item3str.replace("item.", "") + ".png");
			mc.renderEngine.bindTexture(item3Icon);
			drawTexture(60, 32, 16, 16);
			ResourceLocation item4Icon = new ResourceLocation("kk", "textures/items/" + item4str.replace("item.", "") + ".png");
			mc.renderEngine.bindTexture(item4Icon);
			drawTexture(77, 32, 16, 16);
			ResourceLocation item5Icon = new ResourceLocation("kk", "textures/items/" + item5str.replace("item.", "") + ".png");
			mc.renderEngine.bindTexture(item5Icon);
			drawTexture(94, 32, 16, 16);
			}
			if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item5.itemID)){
				hasItems = true;
				SynthesizeText = "You have the materials required to Synthesize";
				colour = 0x00B330;
			}else{
				hasItems = false;
				SynthesizeText = "You lack the required materials to Synthesize";
				colour = 0xFF0000;
			}
		}
		//Check item1, item2, item3, item4, item5 and item6 if only 6 are specified
		if(item6 != null && item7 == null){
			String item1str = item1.getUnlocalizedName();
			String item2str = item2.getUnlocalizedName();
			String item3str = item3.getUnlocalizedName();
			String item4str = item4.getUnlocalizedName();
			String item5str = item5.getUnlocalizedName();
			String item6str = item6.getUnlocalizedName();
			if(synthesis.checkItems() == recipe.itemID && ClickedTab2){
				ResourceLocation item1Icon = new ResourceLocation("kk", "textures/items/" + item1str.replace("item.", "") + ".png");
				mc.renderEngine.bindTexture(item1Icon);
				drawTexture(26, 32, 16, 16);
				ResourceLocation item2Icon = new ResourceLocation("kk", "textures/items/" + item2str.replace("item.", "") + ".png");
				mc.renderEngine.bindTexture(item2Icon);
				drawTexture(43, 32, 16, 16);
				ResourceLocation item3Icon = new ResourceLocation("kk", "textures/items/" + item3str.replace("item.", "") + ".png");
				mc.renderEngine.bindTexture(item3Icon);
				drawTexture(60, 32, 16, 16);
				ResourceLocation item4Icon = new ResourceLocation("kk", "textures/items/" + item4str.replace("item.", "") + ".png");
				mc.renderEngine.bindTexture(item4Icon);
				drawTexture(77, 32, 16, 16);
				ResourceLocation item5Icon = new ResourceLocation("kk", "textures/items/" + item5str.replace("item.", "") + ".png");
				mc.renderEngine.bindTexture(item5Icon);
				drawTexture(94, 32, 16, 16);
				ResourceLocation item6Icon = new ResourceLocation("kk", "textures/items/" + item6str.replace("item.", "") + ".png");
				mc.renderEngine.bindTexture(item6Icon);
				drawTexture(111, 32, 16, 16);
			}
			if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item5.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item6.itemID)){
				hasItems = true;
				SynthesizeText = "You have the materials required to Synthesize";
				colour = 0x00B330;
			}else{
				hasItems = false;
				SynthesizeText = "You lack the required materials to Synthesize";
				colour = 0xFF0000;
			}
		}
		//Check item1, item2, item3, item4, item5, item6 and item7 if only 7 are specified
		if(item7 != null && item8 == null){
			String item1str = item1.getUnlocalizedName();
			String item2str = item2.getUnlocalizedName();
			String item3str = item3.getUnlocalizedName();
			String item4str = item4.getUnlocalizedName();
			String item5str = item5.getUnlocalizedName();
			String item6str = item6.getUnlocalizedName();
			String item7str = item7.getUnlocalizedName();
			if(synthesis.checkItems() == recipe.itemID && ClickedTab2){
				ResourceLocation item1Icon = new ResourceLocation("kk", "textures/items/" + item1str.replace("item.", "") + ".png");
				mc.renderEngine.bindTexture(item1Icon);
				drawTexture(26, 32, 16, 16);
				ResourceLocation item2Icon = new ResourceLocation("kk", "textures/items/" + item2str.replace("item.", "") + ".png");
				mc.renderEngine.bindTexture(item2Icon);
				drawTexture(43, 32, 16, 16);
				ResourceLocation item3Icon = new ResourceLocation("kk", "textures/items/" + item3str.replace("item.", "") + ".png");
				mc.renderEngine.bindTexture(item3Icon);
				drawTexture(60, 32, 16, 16);
				ResourceLocation item4Icon = new ResourceLocation("kk", "textures/items/" + item4str.replace("item.", "") + ".png");
				mc.renderEngine.bindTexture(item4Icon);
				drawTexture(77, 32, 16, 16);
				ResourceLocation item5Icon = new ResourceLocation("kk", "textures/items/" + item5str.replace("item.", "") + ".png");
				mc.renderEngine.bindTexture(item5Icon);
				drawTexture(94, 32, 16, 16);
				ResourceLocation item6Icon = new ResourceLocation("kk", "textures/items/" + item6str.replace("item.", "") + ".png");
				mc.renderEngine.bindTexture(item6Icon);
				drawTexture(111, 32, 16, 16);
				ResourceLocation item7Icon = new ResourceLocation("kk", "textures/items/" + item7str.replace("item.", "") + ".png");
				mc.renderEngine.bindTexture(item7Icon);
				drawTexture(128, 32, 16, 16);
			}
			if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item5.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item6.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item7.itemID)){
				hasItems = true;
				SynthesizeText = "You have the materials required to Synthesize";
				colour = 0x00B330;
			}else{
				hasItems = false;
				SynthesizeText = "You lack the required materials to Synthesize";
				colour = 0xFF0000;
			}
		}
		//Check item1, item2, item3, item4, item5, item6, item7 and item8 if only 8 are specified
		if(item8 != null && item9 == null){
			String item1str = item1.getUnlocalizedName();
			String item2str = item2.getUnlocalizedName();
			String item3str = item3.getUnlocalizedName();
			String item4str = item4.getUnlocalizedName();
			String item5str = item5.getUnlocalizedName();
			String item6str = item6.getUnlocalizedName();
			String item7str = item7.getUnlocalizedName();
			String item8str = item8.getUnlocalizedName();
			if(synthesis.checkItems() == recipe.itemID && ClickedTab2){
				ResourceLocation item1Icon = new ResourceLocation("kk", "textures/items/" + item1str.replace("item.", "") + ".png");
				mc.renderEngine.bindTexture(item1Icon);
				drawTexture(26, 32, 16, 16);
				ResourceLocation item2Icon = new ResourceLocation("kk", "textures/items/" + item2str.replace("item.", "") + ".png");
				mc.renderEngine.bindTexture(item2Icon);
				drawTexture(43, 32, 16, 16);
				ResourceLocation item3Icon = new ResourceLocation("kk", "textures/items/" + item3str.replace("item.", "") + ".png");
				mc.renderEngine.bindTexture(item3Icon);
				drawTexture(60, 32, 16, 16);
				ResourceLocation item4Icon = new ResourceLocation("kk", "textures/items/" + item4str.replace("item.", "") + ".png");
				mc.renderEngine.bindTexture(item4Icon);
				drawTexture(77, 32, 16, 16);
				ResourceLocation item5Icon = new ResourceLocation("kk", "textures/items/" + item5str.replace("item.", "") + ".png");
				mc.renderEngine.bindTexture(item5Icon);
				drawTexture(94, 32, 16, 16);
				ResourceLocation item6Icon = new ResourceLocation("kk", "textures/items/" + item6str.replace("item.", "") + ".png");
				mc.renderEngine.bindTexture(item6Icon);
				drawTexture(111, 32, 16, 16);
				ResourceLocation item7Icon = new ResourceLocation("kk", "textures/items/" + item7str.replace("item.", "") + ".png");
				mc.renderEngine.bindTexture(item7Icon);
				drawTexture(128, 32, 16, 16);
				ResourceLocation item8Icon = new ResourceLocation("kk", "textures/items/" + item8str.replace("item.", "") + ".png");
				mc.renderEngine.bindTexture(item8Icon);
				drawTexture(26, 49, 16, 16);
			}
			if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item5.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item6.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item7.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item8.itemID)){
				hasItems = true;
				SynthesizeText = "You have the materials required to Synthesize";
				colour = 0x00B330;
			}else{
				hasItems = false;
				SynthesizeText = "You lack the required materials to Synthesize";
				colour = 0xFF0000;
			}
		}
		//Checks item1, item2, item3, item4, item5, item6, item7, item8 and item9 if only 9 are specified
		if(item9 != null && item10 == null){
			String item1str = item1.getUnlocalizedName();
			String item2str = item2.getUnlocalizedName();
			String item3str = item3.getUnlocalizedName();
			String item4str = item4.getUnlocalizedName();
			String item5str = item5.getUnlocalizedName();
			String item6str = item6.getUnlocalizedName();
			String item7str = item7.getUnlocalizedName();
			String item8str = item8.getUnlocalizedName();
			String item9str = item9.getUnlocalizedName();
			if(synthesis.checkItems() == recipe.itemID && ClickedTab2){
				ResourceLocation item1Icon = new ResourceLocation("kk", "textures/items/" + item1str.replace("item.", "") + ".png");
				mc.renderEngine.bindTexture(item1Icon);
				drawTexture(26, 32, 16, 16);
				ResourceLocation item2Icon = new ResourceLocation("kk", "textures/items/" + item2str.replace("item.", "") + ".png");
				mc.renderEngine.bindTexture(item2Icon);
				drawTexture(43, 32, 16, 16);
				ResourceLocation item3Icon = new ResourceLocation("kk", "textures/items/" + item3str.replace("item.", "") + ".png");
				mc.renderEngine.bindTexture(item3Icon);
				drawTexture(60, 32, 16, 16);
				ResourceLocation item4Icon = new ResourceLocation("kk", "textures/items/" + item4str.replace("item.", "") + ".png");
				mc.renderEngine.bindTexture(item4Icon);
				drawTexture(77, 32, 16, 16);
				ResourceLocation item5Icon = new ResourceLocation("kk", "textures/items/" + item5str.replace("item.", "") + ".png");
				mc.renderEngine.bindTexture(item5Icon);
				drawTexture(94, 32, 16, 16);
				ResourceLocation item6Icon = new ResourceLocation("kk", "textures/items/" + item6str.replace("item.", "") + ".png");
				mc.renderEngine.bindTexture(item6Icon);
				drawTexture(111, 32, 16, 16);
				ResourceLocation item7Icon = new ResourceLocation("kk", "textures/items/" + item7str.replace("item.", "") + ".png");
				mc.renderEngine.bindTexture(item7Icon);
				drawTexture(128, 32, 16, 16);
				ResourceLocation item8Icon = new ResourceLocation("kk", "textures/items/" + item8str.replace("item.", "") + ".png");
				mc.renderEngine.bindTexture(item8Icon);
				drawTexture(26, 49, 16, 16);
				ResourceLocation item9Icon = new ResourceLocation("kk", "textures/items/" + item9str.replace("item.", "") + ".png");
				mc.renderEngine.bindTexture(item9Icon);
				drawTexture(43, 49, 16, 16);
			}
			if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item5.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item6.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item7.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item8.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item9.itemID)){
				hasItems = true;
				SynthesizeText = "You have the materials required to Synthesize";
				colour = 0x00B330;
			}else{
				hasItems = false;
				SynthesizeText = "You lack the required materials to Synthesize";
				colour = 0xFF0000;
			}
		}
		//Checks item1, item2, item3, item4, item5, item6, item7, item8, item9 and item10 if only 10 are specified
		if(item10 != null && item11 == null){
			String item1str = item1.getUnlocalizedName();
			String item2str = item2.getUnlocalizedName();
			String item3str = item3.getUnlocalizedName();
			String item4str = item4.getUnlocalizedName();
			String item5str = item5.getUnlocalizedName();
			String item6str = item6.getUnlocalizedName();
			String item7str = item7.getUnlocalizedName();
			String item8str = item8.getUnlocalizedName();
			String item9str = item9.getUnlocalizedName();
			String item10str = item10.getUnlocalizedName();
			if(synthesis.checkItems() == recipe.itemID && ClickedTab2){
				ResourceLocation item1Icon = new ResourceLocation("kk", "textures/items/" + item1str.replace("item.", "") + ".png");
				mc.renderEngine.bindTexture(item1Icon);
				drawTexture(26, 32, 16, 16);
				ResourceLocation item2Icon = new ResourceLocation("kk", "textures/items/" + item2str.replace("item.", "") + ".png");
				mc.renderEngine.bindTexture(item2Icon);
				drawTexture(43, 32, 16, 16);
				ResourceLocation item3Icon = new ResourceLocation("kk", "textures/items/" + item3str.replace("item.", "") + ".png");
				mc.renderEngine.bindTexture(item3Icon);
				drawTexture(60, 32, 16, 16);
				ResourceLocation item4Icon = new ResourceLocation("kk", "textures/items/" + item4str.replace("item.", "") + ".png");
				mc.renderEngine.bindTexture(item4Icon);
				drawTexture(77, 32, 16, 16);
				ResourceLocation item5Icon = new ResourceLocation("kk", "textures/items/" + item5str.replace("item.", "") + ".png");
				mc.renderEngine.bindTexture(item5Icon);
				drawTexture(94, 32, 16, 16);
				ResourceLocation item6Icon = new ResourceLocation("kk", "textures/items/" + item6str.replace("item.", "") + ".png");
				mc.renderEngine.bindTexture(item6Icon);
				drawTexture(111, 32, 16, 16);
				ResourceLocation item7Icon = new ResourceLocation("kk", "textures/items/" + item7str.replace("item.", "") + ".png");
				mc.renderEngine.bindTexture(item7Icon);
				drawTexture(128, 32, 16, 16);
				ResourceLocation item8Icon = new ResourceLocation("kk", "textures/items/" + item8str.replace("item.", "") + ".png");
				mc.renderEngine.bindTexture(item8Icon);
				drawTexture(26, 49, 16, 16);
				ResourceLocation item9Icon = new ResourceLocation("kk", "textures/items/" + item9str.replace("item.", "") + ".png");
				mc.renderEngine.bindTexture(item9Icon);
				drawTexture(43, 49, 16, 16);
				ResourceLocation item10Icon = new ResourceLocation("kk", "textures/items/" + item10str.replace("item.", "") + ".png");
				mc.renderEngine.bindTexture(item10Icon);
				drawTexture(60, 49, 16, 16);
			}
			if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item5.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item6.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item7.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item8.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item9.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item10.itemID)){
				hasItems = true;
				SynthesizeText = "You have the materials required to Synthesize";
				colour = 0x00B330;
			}else{
				hasItems = false;
				SynthesizeText = "You lack the required materials to Synthesize";
				colour = 0xFF0000;
			}
		}
		//Checks all items if 11 are specified
		if(item11 != null){
			String item1str = item1.getUnlocalizedName();
			String item2str = item2.getUnlocalizedName();
			String item3str = item3.getUnlocalizedName();
			String item4str = item4.getUnlocalizedName();
			String item5str = item5.getUnlocalizedName();
			String item6str = item6.getUnlocalizedName();
			String item7str = item7.getUnlocalizedName();
			String item8str = item8.getUnlocalizedName();
			String item9str = item9.getUnlocalizedName();
			String item10str = item10.getUnlocalizedName();
			String item11str = item11.getUnlocalizedName();
			if(synthesis.checkItems() == recipe.itemID && ClickedTab2){
				ResourceLocation item1Icon = new ResourceLocation("kk", "textures/items/" + item1str.replace("item.", "") + ".png");
				mc.renderEngine.bindTexture(item1Icon);
				drawTexture(26, 32, 16, 16);
				ResourceLocation item2Icon = new ResourceLocation("kk", "textures/items/" + item2str.replace("item.", "") + ".png");
				mc.renderEngine.bindTexture(item2Icon);
				drawTexture(43, 32, 16, 16);
				ResourceLocation item3Icon = new ResourceLocation("kk", "textures/items/" + item3str.replace("item.", "") + ".png");
				mc.renderEngine.bindTexture(item3Icon);
				drawTexture(60, 32, 16, 16);
				ResourceLocation item4Icon = new ResourceLocation("kk", "textures/items/" + item4str.replace("item.", "") + ".png");
				mc.renderEngine.bindTexture(item4Icon);
				drawTexture(77, 32, 16, 16);
				ResourceLocation item5Icon = new ResourceLocation("kk", "textures/items/" + item5str.replace("item.", "") + ".png");
				mc.renderEngine.bindTexture(item5Icon);
				drawTexture(94, 32, 16, 16);
				ResourceLocation item6Icon = new ResourceLocation("kk", "textures/items/" + item6str.replace("item.", "") + ".png");
				mc.renderEngine.bindTexture(item6Icon);
				drawTexture(111, 32, 16, 16);
				ResourceLocation item7Icon = new ResourceLocation("kk", "textures/items/" + item7str.replace("item.", "") + ".png");
				mc.renderEngine.bindTexture(item7Icon);
				drawTexture(128, 32, 16, 16);
				ResourceLocation item8Icon = new ResourceLocation("kk", "textures/items/" + item8str.replace("item.", "") + ".png");
				mc.renderEngine.bindTexture(item8Icon);
				drawTexture(26, 49, 16, 16);
				ResourceLocation item9Icon = new ResourceLocation("kk", "textures/items/" + item9str.replace("item.", "") + ".png");
				mc.renderEngine.bindTexture(item9Icon);
				drawTexture(43, 49, 16, 16);
				ResourceLocation item10Icon = new ResourceLocation("kk", "textures/items/" + item10str.replace("item.", "") + ".png");
				mc.renderEngine.bindTexture(item10Icon);
				drawTexture(60, 49, 16, 16);
				ResourceLocation item11Icon = new ResourceLocation("kk", "textures/items/" + item11str.replace("item.", "") + ".png");
				mc.renderEngine.bindTexture(item11Icon);
				drawTexture(77, 49, 16, 16);
			}
			if(Minecraft.getMinecraft().thePlayer.inventory.hasItem(item1.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item2.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item3.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item4.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item5.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item6.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item7.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item8.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item9.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item10.itemID) && Minecraft.getMinecraft().thePlayer.inventory.hasItem(item11.itemID)){
				hasItems = true;
				SynthesizeText = "You have the materials required to Synthesize";
				colour = 0x00B330;
			}else{
				hasItems = false;
				SynthesizeText = "You lack the required materials to Synthesize";
				colour = 0xFF0000;
			}

		}
		
		if(synthesis.checkItems() == recipe.itemID){
			//Stuff displayed on the first tab
			if(GuiSynthesis.ClickedTab1){
				Minecraft.getMinecraft().renderEngine.bindTexture(texture);
				drawTexture(28, 28, 16, 16);
				fontRenderer.drawSplitString(SynthesizeText, 28, 60, 120, colour);
				fontRenderer.drawSplitString(resultName, 46, 28, 120, 0x404040);
				if(isKeyblade){
					fontRenderer.drawString("+" + ((int)material.getDamageVsEntity() + 4) + " Attack Damage", 28, 48, 0x004CFF);
				}else{
					fontRenderer.drawString("Material", 28, 40, 0x004CFF);
				}
				//Stuff displayed on the second tab
			}else if(GuiSynthesis.ClickedTab2){
				fontRenderer.drawString("Required Materials", 30, 27, colour);
				//Stuff displayed on the third tab
			}else if(GuiSynthesis.ClickedTab3){
				if(isKeyblade){
					fontRenderer.drawSplitString("This keyblade has the enchantment Vanquish. It allows you to collect hearts from mobs when they are slain.", 30, 30, 120, 0x004CFF);
				}else{
					fontRenderer.drawSplitString("This item is material used for crafting or another synthesis recipe.", 30, 30, 120, 0x004CFF);
				}
			}
		}
		//Checking if the player has all the items required
		if(hasItems){
			if(ButtonPressed){
				Minecraft.getMinecraft().sndManager.playSoundFX("kk:summon", 1, 1F);
				ByteArrayOutputStream bt = new ByteArrayOutputStream();
				DataOutputStream out = new DataOutputStream(bt);
				try
				{
					if(synthesis.checkItems() == AddedItems.K1r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(1);
					}else if(synthesis.checkItems() == AddedItems.K2r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(2);
					}else if(synthesis.checkItems() == AddedItems.K3r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(3);
					}else if(synthesis.checkItems() == AddedItems.K4r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(4);
					}else if(synthesis.checkItems() == AddedItems.K5r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(5);
					}else if(synthesis.checkItems() == AddedItems.K6r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(item7.itemID);
						out.writeInt(item8.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(6);
					}else if(synthesis.checkItems() == AddedItems.K7r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(item7.itemID);
						out.writeInt(item8.itemID);
						out.writeInt(item9.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(7);
					}else if(synthesis.checkItems() == AddedItems.K8r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(item7.itemID);
						out.writeInt(item8.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(8);
					}else if(synthesis.checkItems() == AddedItems.K9r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(9);
					}else if(synthesis.checkItems() == AddedItems.K10r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(10);	
					}else if(synthesis.checkItems() == AddedItems.K11r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(item7.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(11);
					}else if(synthesis.checkItems() == AddedItems.K12r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(12);
					}else if(synthesis.checkItems() == AddedItems.K13r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(13);
					}else if(synthesis.checkItems() == AddedItems.K14r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(item7.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(14);
					}else if(synthesis.checkItems() == AddedItems.K15r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(item7.itemID);
						out.writeInt(item8.itemID);
						out.writeInt(item9.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(15);
					}else if(synthesis.checkItems() == AddedItems.K16r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(16);
					}else if(synthesis.checkItems() == AddedItems.K17r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(item7.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(17);
					}else if(synthesis.checkItems() == AddedItems.K18r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(18);
					}else if(synthesis.checkItems() == AddedItems.K19r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(item7.itemID);
						out.writeInt(item8.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(19);
					}else if(synthesis.checkItems() == AddedItems.K20r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(20);
					}else if(synthesis.checkItems() == AddedItems.K21r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(item7.itemID);
						out.writeInt(item8.itemID);
						out.writeInt(item9.itemID);
						out.writeInt(item10.itemID);
						out.writeInt(item11.itemID);
						out.writeInt(21);
					}else if(synthesis.checkItems() == AddedItems.K22r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(item7.itemID);
						out.writeInt(item8.itemID);
						out.writeInt(item9.itemID);
						out.writeInt(item10.itemID);
						out.writeInt(item11.itemID);
						out.writeInt(22);
					}else if(synthesis.checkItems() == AddedItems.K23r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(23);
					}else if(synthesis.checkItems() == AddedItems.K24r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(24);
					}else if(synthesis.checkItems() == AddedItems.K25r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(item7.itemID);
						out.writeInt(item8.itemID);
						out.writeInt(item9.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(25);
					}else if(synthesis.checkItems() == AddedItems.K26r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(26);
					}else if(synthesis.checkItems() == AddedItems.K27r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(item7.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(27);
					}else if(synthesis.checkItems() == AddedItems.K28r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(item7.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(28);
					}else if(synthesis.checkItems() == AddedItems.K29r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(item7.itemID);
						out.writeInt(item8.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(29);
					}else if(synthesis.checkItems() == AddedItems.K30r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(30);
					}else if(synthesis.checkItems() == AddedItems.K31r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(item7.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(31);
					}else if(synthesis.checkItems() == AddedItems.K32r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(item7.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(32);
					}else if(synthesis.checkItems() == AddedItems.K33r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(item7.itemID);
						out.writeInt(item8.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(33);
					}else if(synthesis.checkItems() == AddedItems.K34r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(34);
					}else if(synthesis.checkItems() == AddedItems.K35r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(item7.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(35);
					}else if(synthesis.checkItems() == AddedItems.K36r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(36);
					}else if(synthesis.checkItems() == AddedItems.K37r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(37);
					}else if(synthesis.checkItems() == AddedItems.K38r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(item7.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(38);
					}else if(synthesis.checkItems() == AddedItems.K39r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(item7.itemID);
						out.writeInt(item8.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(39);
					}else if(synthesis.checkItems() == AddedItems.K40r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(item7.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(40);
					}else if(synthesis.checkItems() == AddedItems.K41r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(41);
					}else if(synthesis.checkItems() == AddedItems.K42r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(item7.itemID);
						out.writeInt(item8.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(42);
					}else if(synthesis.checkItems() == AddedItems.K43r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(item7.itemID);
						out.writeInt(item8.itemID);
						out.writeInt(item9.itemID);
						out.writeInt(item10.itemID);
						out.writeInt(item11.itemID);
						out.writeInt(43);
					}else if(synthesis.checkItems() == AddedItems.K44r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(44);
					}else if(synthesis.checkItems() == AddedItems.K45r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(item7.itemID);
						out.writeInt(item8.itemID);
						out.writeInt(item9.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(45);
					}else if(synthesis.checkItems() == AddedItems.K46r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(item7.itemID);
						out.writeInt(item8.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(46);
					}else if(synthesis.checkItems() == AddedItems.K47r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(item7.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(47);
					}else if(synthesis.checkItems() == AddedItems.K48r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(48);
					}else if(synthesis.checkItems() == AddedItems.K49r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(49);
					}else if(synthesis.checkItems() == AddedItems.K50r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(50);
					}else if(synthesis.checkItems() == AddedItems.K51r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(51);
					}else if(synthesis.checkItems() == AddedItems.K52r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(item7.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(52);
					}else if(synthesis.checkItems() == AddedItems.K53r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(53);
					}else if(synthesis.checkItems() == AddedItems.K54r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(item7.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(54);
					}else if(synthesis.checkItems() == AddedItems.K55r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(item7.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(55);
					}else if(synthesis.checkItems() == AddedItems.K56r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(item7.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(56);
					}else if(synthesis.checkItems() == AddedItems.K57r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(57);
					}else if(synthesis.checkItems() == AddedItems.K58r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(58);
					}else if(synthesis.checkItems() == AddedItems.K59r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(59);
					}else if(synthesis.checkItems() == AddedItems.K60r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(60);
					}else if(synthesis.checkItems() == AddedItems.K61r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(61);
					}else if(synthesis.checkItems() == AddedItems.K62r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(62);
					}else if(synthesis.checkItems() == AddedItems.K63r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(item7.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(63);
					}else if(synthesis.checkItems() == AddedItems.K64r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(item7.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(64);
					}else if(synthesis.checkItems() == AddedItems.K65r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(65);
					}else if(synthesis.checkItems() == AddedItems.K66r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(66);
					}else if(synthesis.checkItems() == AddedItems.K67r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(67);
					}else if(synthesis.checkItems() == AddedItems.K68r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(68);
					}else if(synthesis.checkItems() == AddedItems.K69r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(item7.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(69);
					}else if(synthesis.checkItems() == AddedItems.K70r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(70);
					}else if(synthesis.checkItems() == AddedItems.K71r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(71);
					}else if(synthesis.checkItems() == AddedItems.K72r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(item7.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(72);
					}else if(synthesis.checkItems() == AddedItems.K73r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(item7.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(73);
					}else if(synthesis.checkItems() == AddedItems.K74r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(74);
					}else if(synthesis.checkItems() == AddedItems.K75r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(75);
					}else if(synthesis.checkItems() == AddedItems.K76r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(item7.itemID);
						out.writeInt(item8.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(76);
					}else if(synthesis.checkItems() == AddedItems.K77r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(77);
					}else if(synthesis.checkItems() == AddedItems.K78r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(item7.itemID);
						out.writeInt(item8.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(78);
					}else if(synthesis.checkItems() == AddedItems.K79r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(item7.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(79);
					}else if(synthesis.checkItems() == AddedItems.K80r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(item7.itemID);
						out.writeInt(item8.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(80);
					}else if(synthesis.checkItems() == AddedItems.K81r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(item7.itemID);
						out.writeInt(item8.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(81);
					}else if(synthesis.checkItems() == AddedItems.K82r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(82);
					}else if(synthesis.checkItems() == AddedItems.K83r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(83);
					}else if(synthesis.checkItems() == AddedItems.K84r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(84);
					}else if(synthesis.checkItems() == AddedItems.K85r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(85);
					}else if(synthesis.checkItems() == AddedItems.K86r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(86);
					}else if(synthesis.checkItems() == AddedItems.K87r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(item7.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(87);
					}else if(synthesis.checkItems() == AddedItems.K88r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(88);
					}else if(synthesis.checkItems() == AddedItems.K89r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(item7.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(89);
					}else if(synthesis.checkItems() == AddedItems.K90r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(item7.itemID);
						out.writeInt(item8.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(90);
					}else if(synthesis.checkItems() == AddedItems.K91r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(item7.itemID);
						out.writeInt(item8.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(91);
					}else if(synthesis.checkItems() == AddedItems.K92r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(92);
					}else if(synthesis.checkItems() == AddedItems.K93r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(93);
					}else if(synthesis.checkItems() == AddedItems.K94r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(94);
					}else if(synthesis.checkItems() == AddedItems.K95r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(95);
					}else if(synthesis.checkItems() == AddedItems.K96r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(96);
					}else if(synthesis.checkItems() == AddedItems.K97r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(item7.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(97);
					}else if(synthesis.checkItems() == AddedItems.K98r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(98);
					}else if(synthesis.checkItems() == AddedItems.K99r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(item7.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(99);
					}else if(synthesis.checkItems() == AddedItems.K100r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(item7.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(100);
					}else if(synthesis.checkItems() == AddedItems.K101r.itemID){
						out.writeInt(item1.itemID);
						out.writeInt(item2.itemID);
						out.writeInt(item3.itemID);
						out.writeInt(item4.itemID);
						out.writeInt(item5.itemID);
						out.writeInt(item6.itemID);
						out.writeInt(item7.itemID);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(0);
						out.writeInt(101);
					}
					Packet250CustomPayload packet = new Packet250CustomPayload("summon", bt.toByteArray());
					PacketDispatcher.sendPacketToServer(packet);
				}
				catch (IOException ex)
				{
					System.out.println("Couldn't send int packet!");
				}
				ButtonPressed = false;
			}
		}
	}
}


