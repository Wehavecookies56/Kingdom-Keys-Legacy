package wehavecookies56.kk.client.gui;

import org.lwjgl.opengl.GL11;

import wehavecookies56.kk.container.ContainerSynthesiser;
import wehavecookies56.kk.entities.tileentities.TileEntitySynthesiser;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;

public class GuiMagic extends GuiContainer {

	public static final ResourceLocation texture = new ResourceLocation("kk", "textures/gui/KeybladeGui.png");
	
	public GuiMagic(InventoryPlayer invPlayer, TileEntitySynthesiser entity) {
		super(new ContainerSynthesiser(invPlayer, entity));
		
		xSize = 176;
		ySize = 166;
	}
	
	@Override
	public void drawGuiContainerBackgroundLayer(float f, int j, int i) {
		GL11.glColor4f(1F, 1F, 1F, 1F);
		Minecraft.getMinecraft().func_110434_K().func_110577_a(texture);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
	}
}
