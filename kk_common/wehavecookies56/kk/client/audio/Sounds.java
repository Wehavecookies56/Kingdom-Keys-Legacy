package wehavecookies56.kk.client.audio;

import net.minecraft.client.Minecraft;
import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.lib.Strings;

public enum Sounds {
	KEYBLADE_SUMMON(Strings.Summon);
	
	public static final String SOUND_LOCATION = Reference.MOD_ID;
	public String name;
	
	Sounds(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void play(double x, double y, double z, float volume, float pitch) {
		Minecraft.getMinecraft().sndManager.playSound(SOUND_LOCATION + ":" + name, (float)x, (float)y, (float)z, volume, pitch);
	}
}
