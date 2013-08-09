package wehavecookies56.kk.client.sound;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;

public class SoundManager {
	
	@SideOnly(Side.CLIENT)
    @ForgeSubscribe
    public void onSoundsLoaded(SoundLoadEvent event){
		net.minecraft.client.audio.SoundManager manager = event.manager;
        manager.soundPoolStreaming.addSound("kk:Sanctuary.ogg");
         }
}
