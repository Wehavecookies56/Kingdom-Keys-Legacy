package wehavecookies56.kk.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.util.StatCollector;

public class EnchantHeartHarvest extends Enchantment
{
//main constructor
public EnchantHeartHarvest(int par1, int par2)
{
super(par1, par2, EnumEnchantmentType.weapon);
this.setName("Vanquish");
}

public EnchantHeartHarvest(int par1, int par2, EnumEnchantmentType par3EnumEnchantmentType)
{
super(par1, par2, par3EnumEnchantmentType);
}

public int getMinEnchantability(int par1)
{
return 1;
}

public int getMaxEnchantability(int par1)
{
return 60;
}

public int getMaxLevel()
{
return 10;
}

public String getTranslatedName(int par1)
{
String enchantmentName = "Vanquish";
return enchantmentName + " " + StatCollector.translateToLocal("enchantment.level." + par1);
}
}