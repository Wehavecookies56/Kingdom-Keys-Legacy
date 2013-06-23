package wehavecookies56.kk.mob;

import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import wehavecookies56.kk.item.AddedItems;

public class VillagerDrops {
    public static double rand;
    
    @ForgeSubscribe
    public void onEntityDrop(LivingDropsEvent event) {
    if (event.source.getDamageType().equals("player")) {
        rand = Math.random();
if (event.entityLiving instanceof EntityVillager) {
    //The integer at the end relates to how many Items will be dropped(percentage). 
     if (rand < 1d){
        //The integer at the end relates to how many Items will be dropped(amount). 
        event.entityLiving.dropItem(AddedItems.PureHeart.itemID, 1);
     
   }
}
}
}
}


