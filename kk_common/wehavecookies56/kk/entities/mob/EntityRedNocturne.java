package wehavecookies56.kk.entities.mob;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import wehavecookies56.kk.item.AddedItems;
import wehavecookies56.kk.lib.Reference;

public class EntityRedNocturne extends EntityMob{

	Double maxHealth = 20.0D;
	Double followRange = 32.0D;
	Double knockbackResistance = 0.0D;
	Double movementSpeed = 0.699D;
	Double attackDamage = 2.0D;
	
	public EntityRedNocturne(World par1World) {
		super(par1World);
        this.setSize(0.9F, 1.3F);
		//this.tasks.addTask(0, new EntityAISwimming(this));
		//this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityPlayer.class, this.movementSpeed, false));
		//this.tasks.addTask(2, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
		//this.tasks.addTask(3, new EntityAIWander(this, this.movementSpeed));
		//this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
		//this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
	}
	/*
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		// Max Health - default 20.0D - min 0.0D - max Double.MAX_VALUE
		//this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(maxHealth);
		// Follow Range - default 32.0D - min 0.0D - max 2048.0D
		this.getEntityAttribute(SharedMonsterAttributes.followRange).setAttribute(followRange);
		// Knockback Resistance - default 0.0D - min 0.0D - max 1.0D
		this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setAttribute(knockbackResistance);
		// Movement Speed - default 0.699D - min 0.0D - max Double.MAX_VALUE
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(movementSpeed);
		// Attack Damage - default 2.0D - min 0.0D - max Doubt.MAX_VALUE
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(attackDamage);
	}
	*/
	
	protected String getLivingSound() {
		return "mob.bat.idle";
		}

		protected String getHurtSound() {
		return "mob.bat.hurt";
		}

		protected String getDeathSound() {
		return "mob.bat.death";
		}
		
		protected int getDropItemId() {
            return AddedItems.BlazingShard.itemID;
    }

}