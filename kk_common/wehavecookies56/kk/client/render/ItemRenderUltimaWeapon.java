package wehavecookies56.kk.client.render;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import wehavecookies56.kk.client.model.ModelUltimaWeapon;

import cpw.mods.fml.client.FMLClientHandler;

public class ItemRenderUltimaWeapon implements IItemRenderer
{
	private ModelUltimaWeapon modelTutBox;
	public ItemRenderUltimaWeapon()
	{
		modelTutBox = new ModelUltimaWeapon();
	}
	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type)
	{
		switch(type){
        case EQUIPPED_FIRST_PERSON: return true;
        case EQUIPPED: return true; 
        default: return false;
		}
	}
	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper)
	{
		return true;
	}
	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data)
	{
		switch(type)
		{
		case ENTITY:{
			renderTutBox(0f, 0f, 0f, 0.04f);
			return;
		}
		case EQUIPPED:{
			renderTutBox(1f, 0.8f, 1f, 0.04f);
			return;
		}
		case EQUIPPED_FIRST_PERSON:{
			GL11.glPushMatrix();
			GL11.glDisable(GL11.GL_LIGHTING);
			GL11.glTranslatef(1f, 0.5f, 1f);
			GL11.glScalef(0.04f, 0.04f, 0.04f);
			GL11.glRotatef(180f, 1f, 0f, 0f);
			GL11.glRotatef(130f, 0f, 0.5f, 1f);
			GL11.glRotatef(230f, 0f, 1f, 0f);
			FMLClientHandler.instance().getClient().renderEngine.bindTexture(resourceloc2);
			modelTutBox.render();
			GL11.glEnable(GL11.GL_LIGHTING);
			GL11.glPopMatrix();
		}
		default:return;
		}
	}
	public ResourceLocation resourceloc2 = new ResourceLocation(("kk:textures/entities/UltimaWeapon.png"));
	private void renderTutBox(float x, float y, float z, float scale)
	{
		GL11.glPushMatrix();
		GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glTranslatef(x, y, z);
		GL11.glScalef(scale, scale, scale);
		GL11.glRotatef(70f, 1f, 0f, 0f);
		GL11.glRotatef(35f, 0f, 0f, 1f);
		GL11.glRotatef(230f, 0f, 1f, 0f);
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(resourceloc2);
		modelTutBox.render();
		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glPopMatrix();
	}
}