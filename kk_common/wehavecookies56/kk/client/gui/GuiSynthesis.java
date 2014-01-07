package wehavecookies56.kk.client.gui;

import java.util.ArrayList;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.minecraft.util.Icon;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import wehavecookies56.kk.container.ContainerSynthesis;
import wehavecookies56.kk.core.handlers.KeyTickHandler;
import wehavecookies56.kk.core.handlers.PacketHandler;
import wehavecookies56.kk.core.handlers.SummonPacketHandler;
import wehavecookies56.kk.entities.tileentities.TileEntitySynthesis;
import wehavecookies56.kk.item.AddedItems;
import wehavecookies56.kk.item.recipes.ItemKingdomKeyRecipe;
import wehavecookies56.kk.item.recipes.ItemVulpeusRecipe;
import wehavecookies56.kk.lib.LocalStrings;
import wehavecookies56.kk.lib.Reference;
import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiSynthesis extends GuiContainer {


	TileEntitySynthesis synthesis = new TileEntitySynthesis();
	public static boolean ClickedTab1 = true;
	public static boolean ClickedTab2 = false;
	public static boolean ClickedTab3 = false;
	public static boolean AbleToSynthesize = false;
	
	public String SynthesizeText = "You lack the required materials to Synthesize";
	int colour = 0x404040;


	public GuiSynthesis(InventoryPlayer invPlayer, TileEntitySynthesis synthesis) {
		super(new ContainerSynthesis(invPlayer, synthesis));

		this.synthesis = synthesis;

		xSize = 176;
		ySize = 166;
	}


	private static final ResourceLocation texture = new ResourceLocation("kk", "textures/gui/Moogle.png");

	@Override
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
	
	final ResourceLocation BrSh = new ResourceLocation("kk", "textures/items/brightShard.png");
	final ResourceLocation BrSt = new ResourceLocation("kk", "textures/items/brightStone.png");
	final ResourceLocation DeSt = new ResourceLocation("kk", "textures/items/denseStone.png");
	final ResourceLocation BrG = new ResourceLocation("kk", "textures/items/brightGem.png");
	final ResourceLocation SeC = new ResourceLocation("kk", "textures/items/serenityCrystal.png");
	final ResourceLocation O = new ResourceLocation("kk", "textures/items/orichalcum.png");
	final ResourceLocation MG = new ResourceLocation("kk", "textures/items/mythrilGem.png");
	final ResourceLocation ESt = new ResourceLocation("kk", "textures/items/energyStone.png");
	final ResourceLocation BlSh = new ResourceLocation("kk", "textures/items/blazingShard.png");
	
	
	@Override
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
				fontRenderer.drawSplitString("Place an Attack Recipe in the slot", 30, 48, 120, 0xFF0000);
			}
			else if(ClickedTab2){
				fontRenderer.drawSplitString("Place an Attack Recipe in the slot", 30, 30, 120, 0xFF0000);
			}
			else if(ClickedTab3){
				fontRenderer.drawSplitString("Place an Attack Recipe in the slot", 30, 30, 120, 0xFF0000);
			}
		}
		/*
		 * 
		 * KINGDOM KEY
		 * 
		*/
		if(synthesis.checkItems() == AddedItems.K111r.itemID){
			if(mc.thePlayer.inventory.hasItem(AddedItems.SerenityCrystal.itemID) && mc.thePlayer.inventory.hasItem(AddedItems.BrightGem.itemID) && mc.thePlayer.inventory.hasItem(AddedItems.DenseStone.itemID) && mc.thePlayer.inventory.hasItem(AddedItems.BrightStone.itemID) && mc.thePlayer.inventory.hasItem(AddedItems.BrightShard.itemID)){
				colour = 0x00B330;
				AbleToSynthesize = true;
				SynthesizeText = "You have the materials required to synthesize";
			}else{
				colour = 0xFF0000;
				AbleToSynthesize = false;
				SynthesizeText = "You lack the required materials to Synthesize";
			}
			if(ClickedTab1){
				fontRenderer.drawSplitString(SynthesizeText, 28, 60, 120, colour);
				fontRenderer.drawString(LocalStrings.KingdomKey, 46, 32, 0x404040);
				fontRenderer.drawString("+" + AddedItems.K111m.getDamageVsEntity() + " Attack Damage + 4", 28, 48, 0x004CFF);
				mc.renderEngine.bindTexture(ItemKingdomKeyRecipe.texture);
				drawTexture(28, 28, 16, 16);
			}
			else if(ClickedTab2){
				//Serenitycrystal, Brightgem, Densestone, Brightstone, Brightshard, Brightshard
				fontRenderer.drawString("Required Materials", 30, 27, colour);
				mc.renderEngine.bindTexture(SeC);
				drawTexture(26, 32, 16, 16);
				if(26 + guiLeft <= x && x <= 26 + guiLeft + 16 && 32 + guiTop <= y && y <= 32 + guiTop + 16){
					ArrayList<String> SeCToolTip = new ArrayList<String>();
					SeCToolTip.add("Serenity Crystal");
					drawHoveringText(SeCToolTip, x - guiLeft, y - guiTop, fontRenderer);
				}
				mc.renderEngine.bindTexture(BrG);
				drawTexture(43, 32, 16, 16);
				if(43 + guiLeft <= x && x <= 43 + guiLeft + 16 && 32 + guiTop <= y && y <= 32 + guiTop + 16){
					ArrayList<String> BrGToolTip = new ArrayList<String>();
					BrGToolTip.add("Bright Gem");
					drawHoveringText(BrGToolTip, x - guiLeft, y - guiTop, fontRenderer);
				}
				mc.renderEngine.bindTexture(DeSt);
				drawTexture(60, 32, 16, 16);
				if(60 + guiLeft <= x && x <= 60 + guiLeft + 16 && 32 + guiTop <= y && y <= 32 + guiTop + 16){
					ArrayList<String> DeStToolTip = new ArrayList<String>();
					DeStToolTip.add("Dense Stone");
					drawHoveringText(DeStToolTip, x - guiLeft, y - guiTop, fontRenderer);
				}
				mc.renderEngine.bindTexture(BrSt);
				drawTexture(77, 32, 16, 16);
				if(77 + guiLeft <= x && x <= 77 + guiLeft + 16 && 32 + guiTop <= y && y <= 32 + guiTop + 16){
					ArrayList<String> BrStToolTip = new ArrayList<String>();
					BrStToolTip.add("Bright Stone");
					drawHoveringText(BrStToolTip, x - guiLeft, y - guiTop, fontRenderer);
				}
				mc.renderEngine.bindTexture(BrSh);
				drawTexture(94, 32, 16, 16);
				if(94 + guiLeft <= x && x <= 94 + guiLeft + 16 && 32 + guiTop <= y && y <= 32 + guiTop + 16){
					ArrayList<String> BrShToolTip = new ArrayList<String>();
					BrShToolTip.add("Bright Shard");
					drawHoveringText(BrShToolTip, x - guiLeft, y - guiTop, fontRenderer);
				}
			}
			else if(ClickedTab3){
				
			}
		}
		/*
		 * 
		 * VULPEUS FORTELLER'S KEYBLADE
		 * 
		*/
		if(synthesis.checkItems() == AddedItems.K1r.itemID){
			if(mc.thePlayer.inventory.hasItem(AddedItems.Orichalcum.itemID) && mc.thePlayer.inventory.hasItem(AddedItems.SerenityCrystal.itemID) && mc.thePlayer.inventory.hasItem(AddedItems.MythrilGem.itemID) && mc.thePlayer.inventory.hasItem(AddedItems.EnergyStone.itemID) && mc.thePlayer.inventory.hasItem(AddedItems.BrightStone.itemID) && mc.thePlayer.inventory.hasItem(AddedItems.BlazingShard.itemID)){
				colour = 0x00B330;
				AbleToSynthesize = true;
				SynthesizeText = "You have the materials required to synthesize";
			}else{
				colour = 0xFF0000;
				AbleToSynthesize = false;
				SynthesizeText = "You lack the required materials to Synthesize";
			}
			if(ClickedTab1){
				fontRenderer.drawSplitString(SynthesizeText, 28, 60, 120, colour);
				fontRenderer.drawSplitString(LocalStrings.Vulpeus, 46, 28, 120, 0x404040);
				fontRenderer.drawString("+" + AddedItems.VulpeusMaterial.getDamageVsEntity() + " Attack Damage + 4", 28, 48, 0x004CFF);
				mc.renderEngine.bindTexture(ItemVulpeusRecipe.texture);
				drawTexture(28, 28, 16, 16);
			}
			else if(ClickedTab2){
				//Orichalcum, Serenitycrystal, Mythrilgem, Energystone, Brightstone, Blazingshard
				fontRenderer.drawString("Required Materials", 30, 27, colour);
				mc.renderEngine.bindTexture(O);
				if(26 + guiLeft <= x && x <= 26 + guiLeft + 16 && 32 + guiTop <= y && y <= 32 + guiTop + 16){
					ArrayList<String> OToolTip = new ArrayList<String>();
					OToolTip.add("Orichalcum");
					drawHoveringText(OToolTip, x - guiLeft, y - guiTop, fontRenderer);
				}
				drawTexture(26, 32, 16, 16);
				mc.renderEngine.bindTexture(SeC);
				if(43 + guiLeft <= x && x <= 43 + guiLeft + 16 && 32 + guiTop <= y && y <= 32 + guiTop + 16){
					ArrayList<String> SeCToolTip = new ArrayList<String>();
					SeCToolTip.add("Serenity Crystal");
					drawHoveringText(SeCToolTip, x - guiLeft, y - guiTop, fontRenderer);
				}
				drawTexture(43, 32, 16, 16);
				mc.renderEngine.bindTexture(MG);
				if(60 + guiLeft <= x && x <= 60 + guiLeft + 16 && 32 + guiTop <= y && y <= 32 + guiTop + 16){
					ArrayList<String> SeCToolTip = new ArrayList<String>();
					SeCToolTip.add("Serenity Crystal");
					drawHoveringText(SeCToolTip, x - guiLeft, y - guiTop, fontRenderer);
				}
				drawTexture(60, 32, 16, 16);
				mc.renderEngine.bindTexture(ESt);
				drawTexture(77, 32, 16, 16);
				mc.renderEngine.bindTexture(BrSt);
				drawTexture(94, 32, 16, 16);
				mc.renderEngine.bindTexture(BlSh);
				drawTexture(111, 32, 16, 16);
			}
			else if(ClickedTab3){
				
			}
		}

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
	public void initGui(){
		super.initGui();
		buttonList.clear();
		Minecraft.getMinecraft().sndManager.playSoundFX("kk:kupo", 1, 1F);
		GuiButton Synthesize = new GuiButton(0, guiLeft + 109, guiTop + 4, 60, 20, "Synthesize");
		buttonList.add(Synthesize);
		drawTexturedModelRectFromIcon(guiLeft, guiTop, AddedItems.K111.getIconFromDamage(0), 16, 16);

	}
	
	public static boolean ButtonPressed = false;

	@Override
	protected void actionPerformed(GuiButton button){
		if(button.id == 0){
			ButtonPressed = true;
			
		}

	}
	
	@Override
	protected void mouseClicked(int x, int y, int button) {
		GuiTabs tab = new GuiTabs(button, button, button, button);
		super.mouseClicked(x, y, button);
		if(Tab1X + guiLeft <= x && x <= Tab1X + guiLeft + DimensionsOfTabW && Tab1Y + guiTop <= y && y <= Tab1Y + guiTop + DimensionsOfTabH){
			SummonPacketHandler.sendButtonPacket((byte)2);
			ClickedTab1 = true;
			ClickedTab2 = false;
			ClickedTab3 = false;
		}
		if(Tab2X + guiLeft <= x && x <= Tab2X + guiLeft + DimensionsOfTabW && Tab2Y + guiTop <= y && y <= Tab2Y + guiTop + DimensionsOfTabH){
			SummonPacketHandler.sendButtonPacket((byte)2);
			ClickedTab1 = false;
			ClickedTab2 = true;
			ClickedTab3 = false;
		}
		if(Tab3X + guiLeft <= x && x <= Tab3X + guiLeft + DimensionsOfTabW && Tab3Y + guiTop <= y && y <= Tab3Y + guiTop + DimensionsOfTabH){
			SummonPacketHandler.sendButtonPacket((byte)2);
			ClickedTab1 = false;
			ClickedTab2 = false;
			ClickedTab3 = true;
		}
		
	}
	
	protected int getLeft() {
		return guiLeft;
	}
	
	protected int getTop() {
		return guiTop;
	}
}
