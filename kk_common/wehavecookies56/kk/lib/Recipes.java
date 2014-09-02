package wehavecookies56.kk.lib;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import wehavecookies56.kk.block.AddedBlocks;
import wehavecookies56.kk.item.AddedItems;

public class Recipes {

	public static void initShapedRecipes(){
		ItemStack greenDye = new ItemStack(Item.dyePowder, 1, 2);
		ItemStack blueDye = new ItemStack(Item.dyePowder, 1, 4);
		ItemStack blackDye = new ItemStack(Item.dyePowder, 1, 0);
		ItemStack yellowDye = new ItemStack(Item.dyePowder, 1, 11);
		if(ConfigBooleans.heartRecipe == false){
			GameRegistry.addRecipe(new ItemStack(AddedItems.Heart), new Object[]{
				" D ",
				"DSD",
				" D ",
				'S', Block.slowSand, 'D', AddedItems.DarkHeart
			});
		}
		if(ConfigBooleans.heartRecipe == true){
			GameRegistry.addRecipe(new ItemStack(AddedItems.Heart), new Object[]{
				"DDD",
				"DSD",
				"DDD",
				'S', Block.slowSand, 'D', AddedItems.DarkHeart
			});
		}
		if(ConfigBooleans.heartRecipe == false){
			GameRegistry.addRecipe(new ItemStack(AddedItems.PureHeart), new Object[]{
				" D ",
				"DSD",
				" D ",
				'S', Block.slowSand, 'D', AddedItems.Heart
			});
		}
		if(ConfigBooleans.heartRecipe == true){
			GameRegistry.addRecipe(new ItemStack(AddedItems.PureHeart), new Object[]{
				"DDD",
				"DSD",
				"DDD",
				'S', Block.slowSand, 'D', AddedItems.Heart
			});
		}
		if(ConfigBooleans.heartRecipe == false){
			GameRegistry.addRecipe(new ItemStack(AddedItems.KingdomHearts), new Object[]{
				" D ",
				"DSD",
				" D ",
				'S', Block.slowSand, 'D', AddedItems.PureHeart
			});
		}
		if(ConfigBooleans.heartRecipe == true){
			GameRegistry.addRecipe(new ItemStack(AddedItems.KingdomHearts), new Object[]{
				"DDD",
				"DSD",
				"DDD",
				'S', Block.slowSand, 'D', AddedItems.PureHeart
			});
		}
		GameRegistry.addRecipe(new ItemStack(AddedItems.OrganizationHood), new Object[]{
			"LLL",
			"LOL",
			"SIS",
			'O', Block.obsidian, 'L', AddedItems.DarkLeather, 'S', Item.silk, 'I', blackDye
		});
		GameRegistry.addRecipe(new ItemStack(AddedItems.OrganizationCoat), new Object[]{
			"LIL",
			"LOL",
			"LLL",
			'O', Block.obsidian, 'L', AddedItems.DarkLeather, 'I', blackDye
		});
		GameRegistry.addRecipe(new ItemStack(AddedItems.OrganizationLegs), new Object[]{
			"LLL",
			"LOL",
			"LIL",
			'O', Block.obsidian, 'L', AddedItems.DarkLeather, 'I', blackDye
		});
		GameRegistry.addRecipe(new ItemStack(AddedItems.OrganizationBoots), new Object[]{
			"LOL",
			"LIL",
			'O', Block.obsidian, 'L', AddedItems.DarkLeather, 'I', blackDye
		});
		GameRegistry.addRecipe(new ItemStack(AddedItems.Potion), new Object[]{
			"HHH",
			"HHH",
			"HPH",
			'P', Item.glassBottle, 'H', AddedItems.HP
		});
		//Blast blox recipe
		GameRegistry.addRecipe(new ItemStack(AddedBlocks.BlastBlox), new Object[]{
			"NLN",
			"HTH",
			"NHN",
			'N', AddedBlocks.NormalBlox, 'L', Item.bucketLava , 'H', AddedBlocks.HardBlox, 'T', Block.tnt  
		});
		//Bounce blox recipe
		GameRegistry.addRecipe(new ItemStack(AddedBlocks.BounceBlox), new Object[]{
			"MMM",
			"HPH",
			"NNN",
			'N', AddedBlocks.NormalBlox, 'P', Block.pistonBase , 'H', AddedBlocks.HardBlox, 'M', AddedBlocks.MetalBlox  
		});
		GameRegistry.addRecipe(new ItemStack(AddedBlocks.NormalBlox), new Object[]{
			"ED",
			"DE",
			'E', Block.whiteStone, 'D', Block.dirt
		});
		GameRegistry.addRecipe(new ItemStack(AddedBlocks.HardBlox), new Object[]{
			"ES",
			"SE",
			'E', Block.whiteStone, 'S', Block.stone
		});
		GameRegistry.addRecipe(new ItemStack(AddedBlocks.MetalBlox), new Object[]{
			"EI",
			"IE",
			'E', Block.whiteStone, 'I', Item.ingotIron
		});
		GameRegistry.addRecipe(new ItemStack(AddedBlocks.NormalBlox), new Object[]{
			"ED",
			"DE",
			'E', Block.whiteStone, 'D', Block.dirt
		});
		GameRegistry.addRecipe(new ItemStack(AddedBlocks.Synthesiser), new Object[]{
			"MCM",
			"H5N",
			"OHO",
			'M', AddedBlocks.MetalBlox, 'C', Block.workbench, 'H', AddedBlocks.HardBlox, '5', AddedItems.Munny500, 'N', AddedBlocks.NormalBlox, 'O', AddedItems.HP
		});
	}
	public static void initShapelessRecipes(){
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.Munny5), new ItemStack(AddedItems.Munny1), new ItemStack(AddedItems.Munny1), new ItemStack(AddedItems.Munny1), new ItemStack(AddedItems.Munny1), new ItemStack(AddedItems.Munny1));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.Munny), new ItemStack(AddedItems.Munny5), new ItemStack(AddedItems.Munny5), new ItemStack(AddedItems.Munny5), new ItemStack(AddedItems.Munny5));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.Munny50), new ItemStack(AddedItems.Munny10), new ItemStack(AddedItems.Munny10), new ItemStack(AddedItems.Munny10, 1), new ItemStack(AddedItems.Munny10, 1), new ItemStack(AddedItems.Munny10, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.Munny10), new ItemStack(AddedItems.Munny5), new ItemStack(AddedItems.Munny5));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.Munny), new ItemStack(AddedItems.Munny10), new ItemStack(AddedItems.Munny10));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.Munny50), new ItemStack(AddedItems.Munny), new ItemStack(AddedItems.Munny), new ItemStack(AddedItems.Munny10));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.Munny100), new ItemStack(AddedItems.Munny50), new ItemStack(AddedItems.Munny50));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.Munny100), new ItemStack(AddedItems.Munny), new ItemStack(AddedItems.Munny), new ItemStack(AddedItems.Munny), new ItemStack(AddedItems.Munny), new ItemStack(AddedItems.Munny));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.Munny200), new ItemStack(AddedItems.Munny100), new ItemStack(AddedItems.Munny100));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.Munny200), new ItemStack(AddedItems.Munny50), new ItemStack(AddedItems.Munny50), new ItemStack(AddedItems.Munny50), new ItemStack(AddedItems.Munny50));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.Munny500), new ItemStack(AddedItems.Munny100), new ItemStack(AddedItems.Munny100), new ItemStack(AddedItems.Munny100), new ItemStack(AddedItems.Munny100), new ItemStack(AddedItems.Munny100));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.Munny800), new ItemStack(AddedItems.Munny200), new ItemStack(AddedItems.Munny200), new ItemStack(AddedItems.Munny200), new ItemStack(AddedItems.Munny200));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.Munny1000), new ItemStack(AddedItems.Munny200), new ItemStack(AddedItems.Munny200), new ItemStack(AddedItems.Munny200), new ItemStack(AddedItems.Munny200), new ItemStack(AddedItems.Munny200));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.Munny1200), new ItemStack(AddedItems.Munny1000), new ItemStack(AddedItems.Munny200));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.Munny1500), new ItemStack(AddedItems.Munny1000), new ItemStack(AddedItems.Munny500));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.Munny1800), new ItemStack(AddedItems.Munny1000), new ItemStack(AddedItems.Munny800));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.Munny2000), new ItemStack(AddedItems.Munny1000), new ItemStack(AddedItems.Munny1000));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.Munny3000), new ItemStack(AddedItems.Munny2000), new ItemStack(AddedItems.Munny1000));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.Munny3000), new ItemStack(AddedItems.Munny1500), new ItemStack(AddedItems.Munny1500));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.Munny4000), new ItemStack(AddedItems.Munny3000), new ItemStack(AddedItems.Munny1000));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.Munny5000), new ItemStack(AddedItems.Munny4000), new ItemStack(AddedItems.Munny1000));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.Munny5000), new ItemStack(AddedItems.Munny3000), new ItemStack(AddedItems.Munny2000));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.Munny6000), new ItemStack(AddedItems.Munny5000), new ItemStack(AddedItems.Munny1000));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.Munny6000), new ItemStack(AddedItems.Munny3000), new ItemStack(AddedItems.Munny3000));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.KeybladeVHelm), new ItemStack(AddedItems.KeybladeVHelm), new ItemStack(AddedItems.OrichalcumPlus));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.KeybladeVChest), new ItemStack(AddedItems.KeybladeVChest), new ItemStack(AddedItems.OrichalcumPlus));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.KeybladeVLegs), new ItemStack(AddedItems.KeybladeVLegs), new ItemStack(AddedItems.OrichalcumPlus));
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.KeybladeVBoots), new ItemStack(AddedItems.KeybladeVBoots), new ItemStack(AddedItems.OrichalcumPlus));
		if(ConfigBooleans.munnyDrops){
		GameRegistry.addShapelessRecipe(new ItemStack(AddedItems.Munny1), new ItemStack(Item.goldNugget));
		}
	}




}
