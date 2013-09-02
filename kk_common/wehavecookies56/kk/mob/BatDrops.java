package wehavecookies56.kk.mob;

import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.item.AddedItems;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EntityDamageSource;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

public class BatDrops {
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
			ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart.itemID, 1, 0), 0.5F);
		}
		if (EnchantmentHelper.getEnchantmentLevel(KingdomKeys.HarvestHearts.effectId, wpn) == 2){
			ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart.itemID, 1, 0), 0.8F);
		}
		if (EnchantmentHelper.getEnchantmentLevel(KingdomKeys.HarvestHearts.effectId, wpn) == 3){
			ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart.itemID, 1, 0), 1.0F);
		}
		if (EnchantmentHelper.getEnchantmentLevel(KingdomKeys.HarvestHearts.effectId, wpn) == 3){
			ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart.itemID, 2, 0), 0.5F);
		}
		if (EnchantmentHelper.getEnchantmentLevel(KingdomKeys.HarvestHearts.effectId, wpn) == 4){
			ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart.itemID, 2, 0), 0.8F);
		}
		if (EnchantmentHelper.getEnchantmentLevel(KingdomKeys.HarvestHearts.effectId, wpn) == 5){
			ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart.itemID, 2, 0), 1.0F);
		}
		if (EnchantmentHelper.getEnchantmentLevel(KingdomKeys.HarvestHearts.effectId, wpn) == 6){
			ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart.itemID, 3, 0), 0.5F);
		}
		if (EnchantmentHelper.getEnchantmentLevel(KingdomKeys.HarvestHearts.effectId, wpn) == 7){
			ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart.itemID, 3, 0), 0.8F);
		}
		if (EnchantmentHelper.getEnchantmentLevel(KingdomKeys.HarvestHearts.effectId, wpn) == 8){
			ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart.itemID, 3, 0), 1.0F);
		}
		if (EnchantmentHelper.getEnchantmentLevel(KingdomKeys.HarvestHearts.effectId, wpn) == 9){
			ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart.itemID, 4, 0), 0.5F);
		}
		if (EnchantmentHelper.getEnchantmentLevel(KingdomKeys.HarvestHearts.effectId, wpn) == 10){
			ev.entityLiving.entityDropItem(new ItemStack(AddedItems.Heart.itemID, 4, 0), 0.8F);
		}
	}
}