package wehavecookies56.kk.client;

import java.util.EnumSet;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import wehavecookies56.kk.core.handlers.SummonEventHandler;

import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class TickerClient implements ITickHandler {
	
	public TickerClient(){
		Minecraft mc = Minecraft.getMinecraft();
	}

	public static int MP = 100;
	
	@Override
	public void tickStart(EnumSet type, Object... tickData)
	{

	}
	
	@Override
	public void tickEnd(EnumSet type, Object... tickData)
	{
		ScaledResolution scaledresolution = new ScaledResolution(Minecraft.getMinecraft().gameSettings, Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight);
        FontRenderer fontrenderer = Minecraft.getMinecraft().fontRenderer;
        int width = scaledresolution.getScaledWidth();
        int height = scaledresolution.getScaledHeight();
        Minecraft.getMinecraft().entityRenderer.setupOverlayRendering();

        if (type.equals(EnumSet.of(TickType.RENDER)))
        {
        	onRenderTick();
        }
	}

	@Override
	public EnumSet<TickType> ticks()
	{
		EnumSet a;
		a = EnumSet.of(TickType.RENDER);
		return a;
	}

	private void onRenderTick()
	{
		Minecraft mc = Minecraft.getMinecraft();
		int xSize = 124;
		int ySize = 13;
		final ResourceLocation mpbar = new ResourceLocation("kk", "textures/gui/MPBar.png");
		if (mc.currentScreen == null)
		{
			GuiIngame gui = mc.ingameGUI;
			GL11.glPushMatrix();
			Minecraft.getMinecraft().renderEngine.bindTexture(mpbar);
			GL11.glScalef(0.75f, 0.75f, 0.75f);
			gui.drawTexturedModalRect(0, 0, 0, 0, 124, 13);
			gui.drawTexturedModalRect(0, 0, 102 - (int)SummonEventHandler.barPercent, 13, 124, 13);
			GL11.glPopMatrix();

		}
		
	}

	@Override
	public String getLabel(){
		return "TickHandler.CLIENT";
	}
}
