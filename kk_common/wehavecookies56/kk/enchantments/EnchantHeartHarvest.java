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

//overides enchantments constructor makes it public
public EnchantHeartHarvest(int par1, int par2, EnumEnchantmentType par3EnumEnchantmentType)
{
super(par1, par2, par3EnumEnchantmentType);
}

//Returns the minimal value of enchantability needed on the enchantment level passed.
public int getMinEnchantability(int par1)
{
return 1;
}

//Returns the maximum value of enchantability needed on the enchantment level passed.
public int getMaxEnchantability(int par1)
{
return 60;
}

//Returns the maximum level that the enchantment can have.
public int getMaxLevel()
{
return 10;
}

//sets the visual name of our enchantment
public String getTranslatedName(int par1)
{
String enchantmentName = "Vanquish";
return enchantmentName + " " + StatCollector.translateToLocal("enchantment.level." + par1);
}
}