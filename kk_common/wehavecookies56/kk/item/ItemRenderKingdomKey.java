package wehavecookies56.kk.item;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainerCreative;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.IItemRenderer.ItemRenderType;
import wehavecookies56.kk.client.model.ModelKingdomKey;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


@SideOnly(Side.CLIENT)
public class ItemRenderKingdomKey implements IItemRenderer {

    protected ModelKingdomKey modelKingdomKey;

    public ItemRenderKingdomKey() {

        modelKingdomKey = new ModelKingdomKey();
    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {

        switch(type){
            case EQUIPPED: return true;
            case EQUIPPED_FIRST_PERSON: return true;
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
                
                Minecraft.getMinecraft().renderEngine.func_110577_a(new ResourceLocation("kk:/textures/entities/Kingdom Key.png"));
                
                GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
                GL11.glRotatef(45.0F, 0.0F, 0.0F, 1.0F);
                
                GL11.glTranslatef(0.0F, -0.8F, 0.0F);
                
                GL11.glScalef(1.2F, 1.2F, 1.2F);
                
                modelKingdomKey.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
                
                GL11.glPopMatrix();

            }
            
            case EQUIPPED_FIRST_PERSON: {
                GL11.glPushMatrix();
                
                Minecraft.getMinecraft().renderEngine.func_110577_a(new ResourceLocation("kk:/textures/entities/Kingdom Key.png"));
                
                GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
                GL11.glRotatef(45.0F, 0.0F, 0.0F, 1.0F);
                
                GL11.glTranslatef(0.0F, -0.8F, 0.0F);
                
                GL11.glScalef(1.2F, 1.2F, 1.2F);
                
                modelKingdomKey.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
                
                GL11.glPopMatrix();

            }
            default:
                break;
        }
    }
}