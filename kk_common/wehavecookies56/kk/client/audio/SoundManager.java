package wehavecookies56.kk.client.audio;

import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;
import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SoundManager {
	
	@SideOnly(Side.CLIENT)
    @ForgeSubscribe
    public void onSoundsLoaded(SoundLoadEvent event){
		event.manager.soundPoolStreaming.addSound(Reference.MOD_ID + ":" + Strings.Disc1 + ".ogg");
        event.manager.soundPoolStreaming.addSound(Reference.MOD_ID + ":" + Strings.Disc2 + ".ogg");
        event.manager.soundPoolStreaming.addSound(Reference.MOD_ID + ":" + Strings.Disc3 + ".ogg");
        event.manager.soundPoolStreaming.addSound(Reference.MOD_ID + ":" + Strings.Disc4 + ".ogg");
        event.manager.soundPoolStreaming.addSound(Reference.MOD_ID + ":" + Strings.Disc5 + ".ogg");
        event.manager.soundPoolStreaming.addSound(Reference.MOD_ID + ":" + Strings.Disc6 + ".ogg");
        event.manager.soundPoolStreaming.addSound(Reference.MOD_ID + ":" + Strings.Disc7 + ".ogg");
        event.manager.soundPoolStreaming.addSound(Reference.MOD_ID + ":" + Strings.Disc8 + ".ogg");
        event.manager.soundPoolStreaming.addSound(Reference.MOD_ID + ":" + Strings.Disc9 + ".ogg");
	}
}
