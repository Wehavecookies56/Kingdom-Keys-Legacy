package wehavecookies56.kk.battlegear;

import java.text.DecimalFormat;
import java.util.List;
import java.util.UUID;

import wehavecookies56.kk.KingdomKeys;

import mods.battlegear2.api.weapons.IBackStabbable;
import mods.battlegear2.api.weapons.IBattlegearWeapon;
import mods.battlegear2.api.weapons.IExtendedReachWeapon;
import mods.battlegear2.api.weapons.IHitTimeModifier;
import mods.battlegear2.api.weapons.IPenetrateWeapon;
import mods.battlegear2.api.weapons.ISpecialEffect;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.RangedAttribute;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

public abstract class ItemWeapon extends ItemSword implements IBattlegearWeapon {


	    protected final EnumToolMaterial material;
		protected static String name;
		protected float baseDamage;
		
		public ItemWeapon(int par1, EnumToolMaterial material) {
			super(par1, material);
			//May be unsafe, but will allow others to add weapons using custom materials (also more efficent)
			this.material = material;

	        this.setCreativeTab(KingdomKeys.KKTAB);
			this.maxStackSize = 1;
			
			this.baseDamage = 4 + material.getDamageVsEntity();
		}
		
		
		public EnumToolMaterial getMaterial() {
			return this.material;
		}
		
		@Override
		public Multimap getItemAttributeModifiers()
	    {
			Multimap map = HashMultimap.create();
			map.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Weapon modifier", (double)this.baseDamage, 0));

	        return map;
	    }

	}

