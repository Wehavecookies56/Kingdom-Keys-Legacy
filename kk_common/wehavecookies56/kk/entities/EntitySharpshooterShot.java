package wehavecookies56.kk.entities;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import cpw.mods.fml.common.network.PacketDispatcher;
import wehavecookies56.kk.client.TickerClient;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntitySharpshooterShot extends EntityThrowable{

	public EntitySharpshooterShot(World world) {
		super(world);
	}

	public EntitySharpshooterShot(World world, EntityLivingBase entity) {
		super(world, entity);
	}

	public EntitySharpshooterShot(World world, double x, double y, double z) {
		super(world, x, y, z);
	}

	/**
	 * Called when this EntityThrowable hits a block or entity.
	 */
	@Override
	protected void onImpact(MovingObjectPosition mop) {
		if (mop.entityHit != null) {
			ByteArrayOutputStream bt = new ByteArrayOutputStream();
			DataOutputStream out = new DataOutputStream(bt);
			try
			{
				//+ MP
				out.writeFloat(1);
				//- MP
				out.writeFloat(0);

				Packet250CustomPayload packet = new Packet250CustomPayload("summon", bt.toByteArray());
				PacketDispatcher.sendPacketToServer(packet);
			}
			catch (IOException ex)
			{
				System.out.println("Couldn't send float packet!");
			}
			float shotDamage = 3;
			mop.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), shotDamage);
		}

		for (int l = 0; l < 4; ++l) {
			this.worldObj.spawnParticle("crit", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
		}

		if (!worldObj.isRemote) {
			setDead();
		}
	}
}