/*package wehavecookies56.kk.client.model;

import org.lwjgl.opengl.GL11;

import wehavecookies56.kk.entity.TileEntityTestBlock;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelKingdomKeyV2 extends ModelBase implements IModelCustom{

    private IModelCustom modelKingdomKey;
    
    public ModelKingdomKeyV2(){
        modelKingdomKey = AdvancedModelLoader.loadModel("/mods/kk/models/KK.obj");
    }

    private void render()
    {
        modelKingdomKey.renderAll();
    }
    

    public void render(TileEntityTestBlock box, double x, double y, double z)
    {
        // Push a blank matrix onto the stack
        GL11.glPushMatrix();
     
        // Move the object into the correct position on the block (because the OBJ's origin is the center of the object)
        GL11.glTranslatef((float)x + 0.5f, (float)y + 0.5f, (float)z + 0.5f);
     
        // Scale our object to about half-size in all directions (the OBJ file is a little large)
        GL11.glScalef(0.5f, 0.5f, 0.5f);
     
        // Bind the texture, so that OpenGL properly textures our block.
        FMLClientHandler.instance().getClient().renderEngine.bindTexture("/mods/OBJTutorial/textures/models/TutBox.png");
     
        // Render the object, using modelTutBox.renderAll();
        this.render();
     
        // Pop this matrix from the stack.
        GL11.glPopMatrix();
    }

    @Override
    public String getType() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void renderAll() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void renderPart(String partName) {
        // TODO Auto-generated method stub
        
    }
}
*/
