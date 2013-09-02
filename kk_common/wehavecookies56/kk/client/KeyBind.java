package wehavecookies56.kk.client;

import java.util.EnumSet;

import net.minecraft.client.settings.KeyBinding;

import cpw.mods.fml.client.registry.KeyBindingRegistry.KeyHandler;
import cpw.mods.fml.common.TickType;

public class KeyBind extends KeyHandler{

	public static boolean keyPressed = false;
	private EnumSet tickTypes = EnumSet.of(TickType.CLIENT);

	public KeyBind(KeyBinding[] keyBindings, boolean[] repeatings)
	{
		super(keyBindings, repeatings);
	}
	@Override
	public void keyDown(EnumSet<TickType> types, KeyBinding kb, boolean tickEnd, boolean isRepeat)
	{

	}
	@Override
	public void keyUp(EnumSet<TickType> types, KeyBinding kb, boolean tickEnd)
	{

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





