package wehavecookies56.kk.mob;

import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityPig;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import wehavecookies56.kk.item.AddedItems;

public class ChickenDrops {
    
    public static double rand;
    
    @ForgeSubscribe
    public void onEntityDrop(LivingDropsEvent event) {
    if (event.source.getDamageType().equals("player")) {
        rand = Math.random();
if (event.entityLiving instanceof EntityChicken) {
    //The integer at the end relates to how many Items will be dropped(percentage). 
     if (rand < 0.25d){
        //The integer at the end relates to how many Items will be dropped(amount). 
        event.entityLiving.dropItem(AddedItems.Heart.itemID, 1);
     
   }
}
}
}
}
