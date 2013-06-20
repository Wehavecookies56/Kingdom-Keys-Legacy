package wehavecookies56.kk.client.audio;

import wehavecookies56.kk.item.AddedItems;
import wehavecookies56.kk.lib.Strings;
import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;

public class Sounds {
    @ForgeSubscribe
    public void onSound(SoundLoadEvent event)
    {
             try
             {
                     String [] soundFiles = {
                     //these are your sounds
                     Strings.Disc1 + ".ogg",
                     Strings.Disc2 + ".ogg",
                     };
                     for (int i = 0; i < soundFiles.length; i++){
                     event.manager.soundPoolSounds.addSound(soundFiles[i], AddedItems.class.getResource("/mods/kk/sound/" + soundFiles[i]));
                     }
            
             }
             catch (Exception e)
             {
                     System.err.println("Failed to register one or more sounds.");
             }
    }
}
