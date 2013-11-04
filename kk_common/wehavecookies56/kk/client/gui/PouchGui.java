package wehavecookies56.kk.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import wehavecookies56.kk.container.ContainerPouch;
import wehavecookies56.kk.lib.Reference;

public class PouchGui extends GuiContainer{
	
	ResourceLocation texture = new ResourceLocation(Reference.MOD_ID, "textures/gui/pouchGui.png");
	
	public final int xSizeOfTexture = 176;
	public final int ySizeOfTexture = 168;

	private IInventory lowerChestInventory;

	/**
	 * window height is calculated with this values, the more rows, the heigher
	 */
	private int inventoryRows;

	public PouchGui(IInventory par1IInventory, IInventory par2IInventory)
	{
		super(new ContainerPouch(par1IInventory, par2IInventory));
		this.lowerChestInventory = par2IInventory;
		this.allowUserInput = false;
		short short1 = 222;
		int i = short1 - 108;
		this.inventoryRows = par2IInventory.getSizeInventory() / 9;
		this.ySize = i + this.inventoryRows * 18;
	}
	
	@Override
	public void drawScreen(int x, int y, float f) {

	}

	@Override
	public boolean doesGuiPauseGame() {
		return false;
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j) {
		drawDefaultBackground();

		GL11.glColor4f(1F, 1F, 1F, 1F);

		Minecraft.getMinecraft().renderEngine.bindTexture(texture);

		int posX = (this.width - xSizeOfTexture) / 2;
		int posY = (this.height - ySizeOfTexture) / 2;

		drawTexturedModalRect(posX, posY, 0, 0,xSizeOfTexture, ySizeOfTexture);

		super.drawScreen(i, j, f);
	}
}
