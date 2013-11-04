package wehavecookies56.kk.client.audio;

import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.ForgeSubscribe;
import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class SoundManager {
	
	public SoundManager() {
		MinecraftForge.EVENT_BUS.register(this);
	}
	
    @ForgeSubscribe
    public void onSoundsLoaded(SoundLoadEvent event){
    	for (Sounds sound : Sounds.values()) {
    		addSound(event, sound);
    	}
		event.manager.soundPoolStreaming.addSound(Reference.MOD_ID + ":" + Strings.Summon + ".ogg");
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
    public void addSound(SoundLoadEvent event, Sounds sound){
    	event.manager.soundPoolSounds.addSound(Sounds.SOUND_LOCATION + sound.getName() + ".ogg");
    }
}
