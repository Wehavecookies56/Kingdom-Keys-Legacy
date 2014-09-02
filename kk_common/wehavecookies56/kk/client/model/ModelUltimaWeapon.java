package wehavecookies56.kk.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelUltimaWeapon extends ModelBase
{
	private IModelCustom modelTutBox;
	public ModelUltimaWeapon()
	{
		modelTutBox = AdvancedModelLoader.loadModel("/assets/kk/models/UltimaWeapon.obj");
	}
	public void render()
	{
		modelTutBox.renderAll();
	}
	public ResourceLocation resourceloc2 = new ResourceLocation("kk:textures/entities/UltimaWeapon.png");
	public void render(Item item, double x, double y, double z)
	{
		// Push a blank matrix onto the stack
		GL11.glPushMatrix();

		// Move the object into the correct position on the block (because the OBJ's origin is the center of the object)
		GL11.glTranslatef((float)x + 0.5f, (float)y + 0.5f, (float)z + 0.5f);
		// Scale our object to about half-size in all directions (the OBJ file is a little large)
		GL11.glScalef(0.1f, 0.1f, 0.1f);

		// Bind the texture, so that OpenGL properly textures our block.
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(resourceloc2);

		// Render the object, using modelTutBox.renderAll();
		this.render();

		// Pop this matrix from the stack.
		GL11.glPopMatrix();
	}
}
