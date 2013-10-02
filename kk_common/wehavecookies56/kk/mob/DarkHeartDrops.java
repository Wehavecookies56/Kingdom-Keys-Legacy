package wehavecookies56.kk.mob;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
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
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EntityDamageSource;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.item.AddedItems;

public class DarkHeartDrops {
	@ForgeSubscribe
	public void onDeath(LivingDeathEvent ev) { 
		if (!(ev.source instanceof EntityDamageSource)){
			return;
		}
		EntityDamageSource eds = (EntityDamageSource)ev.source;

		Entity ent = eds.getEntity();
		if (!(ent instanceof EntityPlayer)) {
			return;
		}
		
		EntityPlayer epl = (EntityPlayer)ent;

		ItemStack wpn = epl.getHeldItem();
		if (EnchantmentHelper.getEnchantmentLevel(KingdomKeys.HarvestHearts.effectId, wpn) == 0)
		{
			return;
		}
		if (EnchantmentHelper.getEnchantmentLevel(KingdomKeys.HarvestHearts.effectId, wpn) == 1){
			if(ev.entityLiving instanceof EntityCaveSpider){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 1, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntitySpider){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 1, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityIronGolem){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 1, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntitySkeleton){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 1, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityBlaze){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 1, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityMagmaCube){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 1, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntitySlime){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 1, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityZombie){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 1, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityCreeper){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 1, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityEnderman){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 1, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityGhast){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 1, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityPigZombie){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 1, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityWitch){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 1, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntitySilverfish){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 1, 0), 0.5F);
			}
		}
		if (EnchantmentHelper.getEnchantmentLevel(KingdomKeys.HarvestHearts.effectId, wpn) == 2){
			if(ev.entityLiving instanceof EntityCaveSpider){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 1, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntitySpider){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 1, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntityIronGolem){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 1, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntitySkeleton){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 1, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntityBlaze){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 1, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntityMagmaCube){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 1, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntitySlime){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 1, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntityZombie){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 1, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntityCreeper){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 1, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntityEnderman){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 1, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntityGhast){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 1, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntityPigZombie){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 1, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntityWitch){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 1, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntitySilverfish){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 1, 0), 0.8F);
			}
		}
		if (EnchantmentHelper.getEnchantmentLevel(KingdomKeys.HarvestHearts.effectId, wpn) == 3){
			if(ev.entityLiving instanceof EntityCaveSpider){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 1, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntitySpider){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 1, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntityIronGolem){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 1, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntitySkeleton){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 1, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntityBlaze){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 1, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntityMagmaCube){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 1, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntitySlime){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 1, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntityZombie){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 1, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntityCreeper){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 1, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntityEnderman){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 1, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntityGhast){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 1, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntityPigZombie){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 1, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntityWitch){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 1, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntitySilverfish){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 1, 0), 1.0F);
			}
		}
		if (EnchantmentHelper.getEnchantmentLevel(KingdomKeys.HarvestHearts.effectId, wpn) == 4){
			if(ev.entityLiving instanceof EntityCaveSpider){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 2, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntitySpider){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 2, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityIronGolem){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 2, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntitySkeleton){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 2, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityBlaze){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 2, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityMagmaCube){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 2, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntitySlime){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 2, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityZombie){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 2, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityCreeper){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 2, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityEnderman){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 2, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityGhast){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 2, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityPigZombie){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 2, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityWitch){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 2, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntitySilverfish){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 2, 0), 0.5F);
			}
		}
		if (EnchantmentHelper.getEnchantmentLevel(KingdomKeys.HarvestHearts.effectId, wpn) == 5){
			if(ev.entityLiving instanceof EntityCaveSpider){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 2, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntitySpider){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 2, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntityIronGolem){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 2, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntitySkeleton){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 2, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntityBlaze){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 2, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntityMagmaCube){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 2, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntitySlime){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 2, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntityZombie){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 2, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntityCreeper){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 2, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntityEnderman){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 2, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntityGhast){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 2, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntityPigZombie){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 2, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntityWitch){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 2, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntitySilverfish){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 2, 0), 0.8F);
			}
		}
		if (EnchantmentHelper.getEnchantmentLevel(KingdomKeys.HarvestHearts.effectId, wpn) == 6){
			if(ev.entityLiving instanceof EntityCaveSpider){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 2, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntitySpider){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 2, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntityIronGolem){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 2, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntitySkeleton){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 2, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntityBlaze){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 2, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntityMagmaCube){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 2, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntitySlime){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 2, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntityZombie){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 2, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntityCreeper){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 2, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntityEnderman){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 2, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntityGhast){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 2, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntityPigZombie){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 2, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntityWitch){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 2, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntitySilverfish){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 2, 0), 1.0F);
			}
		}
		if (EnchantmentHelper.getEnchantmentLevel(KingdomKeys.HarvestHearts.effectId, wpn) == 7){
			if(ev.entityLiving instanceof EntityCaveSpider){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 3, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntitySpider){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 3, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityIronGolem){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 3, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntitySkeleton){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 3, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityBlaze){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 3, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityMagmaCube){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 3, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntitySlime){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 3, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityZombie){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 3, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityCreeper){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 3, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityEnderman){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 3, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityGhast){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 3, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityPigZombie){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 3, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityWitch){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 3, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntitySilverfish){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 3, 0), 0.5F);
			}
		}
		if (EnchantmentHelper.getEnchantmentLevel(KingdomKeys.HarvestHearts.effectId, wpn) == 8){
			if(ev.entityLiving instanceof EntityCaveSpider){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 3, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntitySpider){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 3, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntityIronGolem){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 3, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntitySkeleton){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 3, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntityBlaze){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 3, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntityMagmaCube){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 3, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntitySlime){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 3, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntityZombie){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 3, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntityCreeper){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 3, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntityEnderman){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 3, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntityGhast){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 3, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntityPigZombie){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 3, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntityWitch){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 3, 0), 0.8F);
			}
			if(ev.entityLiving instanceof EntitySilverfish){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 3, 0), 0.8F);
			}
		}
		if (EnchantmentHelper.getEnchantmentLevel(KingdomKeys.HarvestHearts.effectId, wpn) == 9){
			if(ev.entityLiving instanceof EntityCaveSpider){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 3, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntitySpider){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 3, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntityIronGolem){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 3, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntitySkeleton){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 3, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntityBlaze){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 3, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntityMagmaCube){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 3, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntitySlime){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 3, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntityZombie){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 3, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntityCreeper){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 3, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntityEnderman){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 3, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntityGhast){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 3, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntityPigZombie){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 3, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntityWitch){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 3, 0), 1.0F);
			}
			if(ev.entityLiving instanceof EntitySilverfish){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 3, 0), 1.0F);
			}
		}
		if (EnchantmentHelper.getEnchantmentLevel(KingdomKeys.HarvestHearts.effectId, wpn) == 10){
			if(ev.entityLiving instanceof EntityCaveSpider){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 4, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntitySpider){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 4, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityIronGolem){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 4, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntitySkeleton){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 4, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityBlaze){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 4, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityMagmaCube){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 4, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntitySlime){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 4, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityZombie){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 4, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityCreeper){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 4, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityEnderman){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 4, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityGhast){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 4, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityPigZombie){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 4, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntityWitch){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 4, 0), 0.5F);
			}
			if(ev.entityLiving instanceof EntitySilverfish){
				ev.entityLiving.entityDropItem(new ItemStack(AddedItems.DarkHeart.itemID, 4, 0), 0.5F);
			}
		}
	}
}