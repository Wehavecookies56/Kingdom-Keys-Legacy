package wehavecookies56.kk.client.gui;

import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiGuide extends GuiScreen {
	
	@SideOnly(Side.CLIENT)
	public GuiGuide(EntityPlayer player){

	}
	
	private final int xSize = 146;
	private final int ySize = 180;
	
	int posX = (Minecraft.getMinecraft().displayWidth / 2 - xSize) / 2;
	int posY = (Minecraft.getMinecraft().displayHeight / 2 - ySize) / 2;
	
	int currentPage = 1;
	final int maxPages = 20;
	public boolean inBoxN = false;
	public boolean inBoxP = false;
	final int prevX = 20;
	int prevSrcX = 0;
	final int prevY = 170;
	int prevSrcY = 190;
	final int nextX = 136;
	int nextSrcX = 0;
	final int nextY = 170;
	int nextSrcY = 180;
	final int arrowW = 18;
	final int arrowH = 10;

	private static final ResourceLocation texture = new ResourceLocation("kk", "textures/gui/Guide.png");
	
	@Override
	public void drawScreen(int par1, int par2, float par3) {
		System.out.println(Minecraft.getMinecraft().displayWidth + " Display Width " + this.width + " Width");
		drawDefaultBackground();
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		Minecraft.getMinecraft().renderEngine.bindTexture(texture);
		
		final int defaultTextLocX = posX + 20;
		final int defaultTextLocY = posY + 25;
		
		drawTexturedModalRect(posX, posY, 0, 0, xSize, ySize);
		
		if(currentPage != 1){
			drawTexturedModalRect(prevX, prevY, prevSrcX, prevSrcY, 18, 10);
		}
		if(currentPage != maxPages){
			drawTexturedModalRect(nextX, nextY, nextSrcX, nextSrcY, 18, 10);
		}
		
		int x = Mouse.getX();
		int y = Mouse.getY();
		
		
		switch(currentPage){
		case 1:{
			fontRenderer.drawSplitString(currentPage + ": Welcome", posX + 20, posY + 5, 120, 0x404040);
			fontRenderer.drawString("-------------------------------", posX + 20, posY + 6, 0x404040);
			fontRenderer.drawString("Page " + currentPage, posX + 20, posY + 165, 0x404040);
			fontRenderer.drawSplitString("Welcome to the guide for Kingdom Keys", defaultTextLocX, defaultTextLocY, 120, 0x404040);
		}
		case 2:{
			fontRenderer.drawSplitString(currentPage + ": Goodbye", posX + 20, posY + 5, 120, 0x404040);
			fontRenderer.drawString("-------------------------------", posX + 20, posY + 6, 0x404040);
			fontRenderer.drawString("Page " + currentPage, posX + 20, posY + 165, 0x404040);
		}
		}
		
		super.drawScreen(par1, par2, par3);
	}
	
	@Override
	protected void mouseClicked(int x, int y, int button) {
		GuiTabs tab = new GuiTabs(button, button, button, button);
		super.mouseClicked(x, y, button);
		if(nextX + posX <= x && x <= nextX + posX + arrowW && nextY + posY <= y && y <= nextY + posY + arrowH && currentPage != maxPages){
			nextSrcX = 18;
			currentPage++;
			
		}else{
			nextSrcX = 0;
		}
		if(prevX + posX <= x && x <= prevX + posX + arrowW && prevY + posY <= y && y <= prevY + posY + arrowH && currentPage != 1){
			currentPage--;
			prevSrcX = 18;
			
		}else{
			prevSrcX = 0;
		}
		
	}
	
	@Override
	public boolean doesGuiPauseGame() {
		return false;
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

}
