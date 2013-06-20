package wehavecookies56.kk.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelKingdomKey extends ModelBase
{
  //fields
    ModelRenderer Handle01;
    ModelRenderer Handle02;
    ModelRenderer Handle03;
    ModelRenderer Handle04;
    ModelRenderer Handle05;
    ModelRenderer Handle06;
    ModelRenderer Handle07;
    ModelRenderer Handle08;
    ModelRenderer Handle09;
    ModelRenderer Handle10;
    ModelRenderer Blade01;
    ModelRenderer Bind01;
    ModelRenderer Blade02;
    ModelRenderer Blade03;
    ModelRenderer Blade04;
    ModelRenderer Blade05;
    ModelRenderer Blade06;
  
  public ModelKingdomKey()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Handle01 = new ModelRenderer(this, 0, 0);
      Handle01.addBox(0F, 0F, 0F, 6, 1, 1);
      Handle01.setRotationPoint(-6F, 20F, 0F);
      Handle01.setTextureSize(64, 32);
      Handle01.mirror = true;
      setRotation(Handle01, 0F, 0F, 0F);
      Handle02 = new ModelRenderer(this, 24, 0);
      Handle02.addBox(0F, 0F, 0F, 7, 1, 1);
      Handle02.setRotationPoint(-7F, 23F, 0F);
      Handle02.setTextureSize(64, 32);
      Handle02.mirror = true;
      setRotation(Handle02, 0F, 0F, -0.0349066F);
      Handle03 = new ModelRenderer(this, 37, 11);
      Handle03.addBox(0F, 0F, 0F, 7, 1, 1);
      Handle03.setRotationPoint(-7F, 17F, 0F);
      Handle03.setTextureSize(64, 32);
      Handle03.mirror = true;
      setRotation(Handle03, 0F, 0F, 0.0349066F);
      Handle04 = new ModelRenderer(this, 33, 17);
      Handle04.addBox(0F, 0F, 0F, 1, 5, 1);
      Handle04.setRotationPoint(-7F, 18F, 0F);
      Handle04.setTextureSize(64, 32);
      Handle04.mirror = true;
      setRotation(Handle04, 0F, 0F, 0F);
      Handle05 = new ModelRenderer(this, 14, 7);
      Handle05.addBox(0F, 0F, 0F, 1, 2, 1);
      Handle05.setRotationPoint(0F, 18F, 0F);
      Handle05.setTextureSize(64, 32);
      Handle05.mirror = true;
      setRotation(Handle05, 0F, 0F, -0.1047198F);
      Handle06 = new ModelRenderer(this, 24, 15);
      Handle06.addBox(0F, 0F, 0F, 1, 3, 1);
      Handle06.setRotationPoint(0F, 19F, 0F);
      Handle06.setTextureSize(64, 32);
      Handle06.mirror = true;
      setRotation(Handle06, 0F, 0F, 0F);
      Handle07 = new ModelRenderer(this, 17, 16);
      Handle07.addBox(0F, 0F, 0F, 1, 2, 1);
      Handle07.setRotationPoint(0.2F, 21F, 0F);
      Handle07.setTextureSize(64, 32);
      Handle07.mirror = true;
      setRotation(Handle07, 0F, 0F, 0.1047198F);
      Handle08 = new ModelRenderer(this, 11, 16);
      Handle08.addBox(0F, 0F, 0F, 1, 3, 1);
      Handle08.setRotationPoint(-7.1F, 17F, 0F);
      Handle08.setTextureSize(64, 32);
      Handle08.mirror = true;
      setRotation(Handle08, 0F, 0F, 0.2443461F);
      Handle09 = new ModelRenderer(this, 11, 22);
      Handle09.addBox(0F, 0F, 0F, 1, 3, 1);
      Handle09.setRotationPoint(-7.8F, 21F, 0F);
      Handle09.setTextureSize(64, 32);
      Handle09.mirror = true;
      setRotation(Handle09, 0F, 0F, -0.2443461F);
      Handle10 = new ModelRenderer(this, 55, 0);
      Handle10.addBox(0F, 0F, 0F, 1, 1, 1);
      Handle10.setRotationPoint(-8F, 20F, 0F);
      Handle10.setTextureSize(64, 32);
      Handle10.mirror = true;
      setRotation(Handle10, 0F, 0F, 0F);
      Blade01 = new ModelRenderer(this, 25, 7);
      Blade01.addBox(0F, 0F, 0F, 17, 1, 1);
      Blade01.setRotationPoint(2F, 20F, 0F);
      Blade01.setTextureSize(64, 32);
      Blade01.mirror = true;
      setRotation(Blade01, 0F, 0F, 0F);
      Bind01 = new ModelRenderer(this, 7, 12);
      Bind01.addBox(0F, 0F, 0F, 1, 1, 1);
      Bind01.setRotationPoint(1F, 20F, 0F);
      Bind01.setTextureSize(64, 32);
      Bind01.mirror = true;
      setRotation(Bind01, 0F, 0F, 0F);
      Blade02 = new ModelRenderer(this, 0, 8);
      Blade02.addBox(0F, 0F, 0F, 5, 1, 1);
      Blade02.setRotationPoint(13F, 19F, 0F);
      Blade02.setTextureSize(64, 32);
      Blade02.mirror = true;
      setRotation(Blade02, 0F, 0F, 0F);
      Blade03 = new ModelRenderer(this, 0, 11);
      Blade03.addBox(0F, 0F, 0F, 1, 4, 1);
      Blade03.setRotationPoint(13F, 16F, 0F);
      Blade03.setTextureSize(64, 32);
      Blade03.mirror = true;
      setRotation(Blade03, 0F, 0F, 0.1745329F);
      Blade04 = new ModelRenderer(this, 0, 17);
      Blade04.addBox(0F, 0F, 0F, 1, 4, 1);
      Blade04.setRotationPoint(17.3F, 16.3F, 0F);
      Blade04.setTextureSize(64, 32);
      Blade04.mirror = true;
      setRotation(Blade04, 0F, 0F, -0.1745329F);
      Blade05 = new ModelRenderer(this, 0, 23);
      Blade05.addBox(0F, 0F, 0F, 2, 3, 1);
      Blade05.setRotationPoint(14.6F, 17.5F, 0F);
      Blade05.setTextureSize(64, 32);
      Blade05.mirror = true;
      setRotation(Blade05, 0F, 0F, 0.7853982F);
      Blade06 = new ModelRenderer(this, 0, 28);
      Blade06.addBox(0F, 0F, 0F, 2, 3, 1);
      Blade06.setRotationPoint(15F, 18.9F, 0F);
      Blade06.setTextureSize(64, 32);
      Blade06.mirror = true;
      setRotation(Blade06, 0F, 0F, -0.7853982F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Handle01.render(f5);
    Handle02.render(f5);
    Handle03.render(f5);
    Handle04.render(f5);
    Handle05.render(f5);
    Handle06.render(f5);
    Handle07.render(f5);
    Handle08.render(f5);
    Handle09.render(f5);
    Handle10.render(f5);
    Blade01.render(f5);
    Bind01.render(f5);
    Blade02.render(f5);
    Blade03.render(f5);
    Blade04.render(f5);
    Blade05.render(f5);
    Blade06.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity ent)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, ent);
  }

}
