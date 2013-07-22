package wehavecookies56.kk.item;

import net.minecraft.entity.Entity;
import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.lib.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class OrganizationArmor extends ItemArmor{
    private String armorFile;
    private String name;
    

    public OrganizationArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4, String armorFile, String name) {
      super(par1, par2EnumArmorMaterial, par3, par4);
      this.armorFile = armorFile; // sets this instance of the armor file to
      // what's in the constructor
      this.setCreativeTab(KingdomKeys.KKTAB);
      this.name = name;
      this.setUnlocalizedName(this.name);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer)
    {

if (stack.toString().contains("leggings")) 
{
return "kk:textures/armor/ORGANIZATION_2.png";
}
if (stack.toString().contains("Leggings")) 
{
return "kk:textures/armor/ORGANIZATION_2.png";
}
return "kk:textures/armor/ORGANIZATION_1.png";
}

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconReg) {
      // sets the icon of this armor whenever it is in any inventory
      this.itemIcon = iconReg.registerIcon(Reference.MOD_ID + ":" + this.name);

    }

  }



