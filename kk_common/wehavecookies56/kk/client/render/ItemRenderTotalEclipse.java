package wehavecookies56.kk.client.render;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import wehavecookies56.kk.client.model.ModelTotalEclipse;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


@SideOnly(Side.CLIENT)
public class ItemRenderTotalEclipse implements IItemRenderer {

    protected ModelTotalEclipse modelTotalEclipse;

    public ItemRenderTotalEclipse() {

        modelTotalEclipse = new ModelTotalEclipse();
    }

    
    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {

        switch(type){
            case EQUIPPED_FIRST_PERSON: return true;
            case EQUIPPED: return true; 
            default: return false;
        }
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {

        return false;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {

        switch (type) {
         
            case EQUIPPED: {
                GL11.glPushMatrix();
                
                Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("kk", "textures/entities/TotalEclipse.png"));
                
                GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
                GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
                GL11.glRotatef(-45.0F, 0.0F, 0.0F, 1.0F);
                GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
                
                GL11.glTranslatef(-0.6F, -1.2F, 0.0F); 
                
                GL11.glScalef(0.9F, 0.9F, 0.9F);
                
                modelTotalEclipse.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
                
                GL11.glPopMatrix();

            }
            case EQUIPPED_FIRST_PERSON: {
                GL11.glPushMatrix();
                
                Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("kk", "textures/entities/TotalEclipse.png"));
                
                GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
                GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
                GL11.glRotatef(-45.0F, 0.0F, 0.0F, 1.0F);
                GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
                
                GL11.glTranslatef(-0.6F, -1.2F, 0.0F);
                
                GL11.glScalef(0.9F, 0.9F, 0.9F);
                
                modelTotalEclipse.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
                
                GL11.glPopMatrix();

            }
            default:
                break;
        }
    }
}
