package wehavecookies56.kk.entities.mob;

import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityRedNocturne extends EntityMob {
	
	public EntityRedNocturne(World par1World) {
		super(par1World);
		this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(7, new EntityAILookIdle(this));
        this.tasks.addTask(6, new EntityAIWander(this, 0.25D));
        this.getNavigator().setAvoidsWater(true);
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(1, new EntityAIPanic(this, 1.25D));
        
        this.setSize(0.9F, 0.9F);
	}

	public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.UNDEAD;
    }
}
