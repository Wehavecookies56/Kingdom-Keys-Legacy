package wehavecookies56.kk.client.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.util.ResourceLocation;
import wehavecookies56.kk.entities.mob.EntityRedNocturne;
import wehavecookies56.kk.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class EntityRenderRedNocturne extends RenderLiving{
	
	public EntityRenderRedNocturne(ModelBase par1ModelBase, float par2)
	{
		super(par1ModelBase, par2);
	}

	public void renderRedNocturne(EntityRedNocturne par1Entity, double par2, double par4, double par6, float par8, float par9)
	{
		super.doRenderLiving(par1Entity, par2, par4, par6, par8, par9);
	}

	public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
	{
		this.renderRedNocturne((EntityRedNocturne)par1EntityLiving, par2, par4, par6, par8, par9);
	}

	/**
	 * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
	 * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
	 * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
	 * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
	 */
	public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
	{
		this.renderRedNocturne((EntityRedNocturne)par1Entity, par2, par4, par6, par8, par9);
	}
	
	ResourceLocation texture = new ResourceLocation(Reference.MOD_ID, "textures/entities/Red Nocturne.png");
	
	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return texture;
	}
}