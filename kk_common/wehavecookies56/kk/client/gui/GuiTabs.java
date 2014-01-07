package wehavecookies56.kk.client.gui;

public class GuiTabs {
	private static int x;
	private static int y;
	private static int w;
	private static int h;
	
	public GuiTabs(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}
	
	public static boolean inRect(GuiSynthesis gui, int mouseX, int mouseY) {
		mouseX -= gui.getLeft();
		mouseY -= gui.getTop();
		
		return x <= mouseX && mouseX <= x + w && y <= mouseY && mouseY <= y + h;
	}
	
	public void draw(GuiSynthesis gui, int srcX, int srcY) {
		gui.drawTexturedModalRect(gui.getLeft() + x, gui.getTop() + y, srcX, srcY, w, h);
	}
}
