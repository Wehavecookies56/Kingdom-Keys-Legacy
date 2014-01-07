package wehavecookies56.kk.mob;

import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import wehavecookies56.kk.item.AddedItems;
import wehavecookies56.kk.lib.ConfigBooleans;

public class Munny5Drops {
	public static double rand; 
	@ForgeSubscribe
	public void onEntityDrop(LivingDropsEvent event) {
		if (event.source.getDamageType().equals("player")) {
			rand = Math.random();
			if (event.entityLiving instanceof EntityBat || event.entityLiving instanceof EntitySheep || event.entityLiving instanceof EntityCow || event.entityLiving instanceof EntityPig || event.entityLiving instanceof EntityChicken || event.entityLiving instanceof EntityHorse || event.entityLiving instanceof EntityOcelot || event.entityLiving instanceof EntitySquid || event.entityLiving instanceof EntityWolf || event.entityLiving instanceof EntitySnowman) {
				//The integer at the end relates to how many Items will be dropped(percentage). 
				if (rand < 0.20d && ConfigBooleans.munnyDrops){
					//The integer at the end relates to how many Items will be dropped(amount). 
					event.entityLiving.dropItem(AddedItems.Munny5.itemID, 1);
				}
			}
		}
	}
	@ForgeSubscribe
	public void onHostileEntityDrop(LivingDropsEvent event) {
		if (event.source.getDamageType().equals("player")) {
			rand = Math.random();
			if (event.entityLiving instanceof EntitySkeleton || event.entityLiving instanceof EntityCreeper || event.entityLiving instanceof EntitySpider || event.entityLiving instanceof EntityCaveSpider || event.entityLiving instanceof EntityEnderman || event.entityLiving instanceof EntityZombie || event.entityLiving instanceof EntityPigZombie || event.entityLiving instanceof EntityIronGolem || event.entityLiving instanceof EntityBlaze || event.entityLiving instanceof EntitySlime || event.entityLiving instanceof EntityMagmaCube || event.entityLiving instanceof EntityWitch || event.entityLiving instanceof EntitySilverfish || event.entityLiving instanceof EntityGhast) {
				//The integer at the end relates to how many Items will be dropped(percentage). 
				if (rand < 0.40d && ConfigBooleans.munnyDrops){
					//The integer at the end relates to how many Items will be dropped(amount). 
					event.entityLiving.dropItem(AddedItems.Munny5.itemID, 1);
				}
			}
		}
	}
	@ForgeSubscribe
	public void onBossEntityDrop(LivingDropsEvent event) {
		if (event.source.getDamageType().equals("player")) {
			rand = Math.random();
			if (event.entityLiving instanceof EntityDragon) {
				//The integer at the end relates to how many Items will be dropped(percentage). 
				if (rand < 0.70d && ConfigBooleans.munnyDrops){
					//The integer at the end relates to how many Items will be dropped(amount). 
					event.entityLiving.dropItem(AddedItems.Munny5.itemID, 20);
				}
			}
		}
	}
}

