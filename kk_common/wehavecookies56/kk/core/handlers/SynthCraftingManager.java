package wehavecookies56.kk.core.handlers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;
import wehavecookies56.kk.item.AddedItems;

public class SynthCraftingManager {
	public static final int WILDCARD_VALUE = Short.MAX_VALUE;
	private static final SynthCraftingManager instance = new SynthCraftingManager();
	private List recipes = new ArrayList();

	public static final SynthCraftingManager getInstance()
	{
	         return instance;
	}

	private SynthCraftingManager()
	{
	recipes = new ArrayList();
	
	ItemStack brightGem = new ItemStack(AddedItems.BrightGem, 1);
	ItemStack remembranceShard = new ItemStack(AddedItems.RemembranceShard, 1);
	ItemStack blazingStone = new ItemStack(AddedItems.BlazingStone, 1);
	ItemStack tranquilStone = new ItemStack(AddedItems.TranquilStone, 1);
	ItemStack powerCrystal = new ItemStack(AddedItems.PowerCrystal, 1);
	ItemStack powerGem = new ItemStack(AddedItems.PowerGem, 1);
	ItemStack energyGem = new ItemStack(AddedItems.EnergyGem, 1);
	ItemStack lucidGem = new ItemStack(AddedItems.LucidGem, 1);
	ItemStack energyCrystal = new ItemStack(AddedItems.EnergyCrystal, 1);
	ItemStack blazingCrystal = new ItemStack(AddedItems.BlazingCrystal, 1);
	ItemStack blazingGem = new ItemStack(AddedItems.BlazingGem, 1);
	ItemStack tranquilGem = new ItemStack(AddedItems.TranquilGem, 1);
	ItemStack tranquilShard = new ItemStack(AddedItems.TranquilShard, 1);
	ItemStack shimmeringCrystal = new ItemStack(AddedItems.ShinyCrystal, 1);
	ItemStack darkCrystal = new ItemStack(AddedItems.DarkCrystal, 1);
	ItemStack darkShard = new ItemStack(AddedItems.DarkShard, 1);
	ItemStack energyShard = new ItemStack(AddedItems.EnergyShard, 1);
	ItemStack frostShard = new ItemStack(AddedItems.FrostShard, 1);
	ItemStack blazingShard = new ItemStack(AddedItems.BlazingShard, 1);
	ItemStack lightningShard = new ItemStack(AddedItems.LightningShard, 1);
	ItemStack lucidShard = new ItemStack(AddedItems.LucidShard, 1);
	ItemStack mythrilShard = new ItemStack(AddedItems.MythrilShard, 1);
	ItemStack darkGem = new ItemStack(AddedItems.DarkGem, 1);
	ItemStack darkMatter = new ItemStack(AddedItems.DarkMatter, 1);
	ItemStack frostGem = new ItemStack(AddedItems.FrostGem, 1);
	ItemStack denseStone = new ItemStack(AddedItems.DenseStone, 1);
	ItemStack mythrilStone = new ItemStack(AddedItems.MythrilStone, 1);
	ItemStack denseShard = new ItemStack(AddedItems.DenseShard, 1);
	ItemStack brightShard = new ItemStack(AddedItems.BrightShard, 1);
	ItemStack powerShard = new ItemStack(AddedItems.PowerShard, 1);
	ItemStack twilightStone = new ItemStack(AddedItems.TwilightStone, 1);
	ItemStack remembranceStone = new ItemStack(AddedItems.RemembranceStone, 1);
	ItemStack remembranceGem = new ItemStack(AddedItems.RemembranceGem, 1);
	ItemStack twilightShard = new ItemStack(AddedItems.TwilightShard, 1);
	ItemStack serenityShard = new ItemStack(AddedItems.SerenityShard, 1);
	ItemStack serenityStone = new ItemStack(AddedItems.SerenityStone, 1);
	ItemStack denseCrystal = new ItemStack(AddedItems.DenseCrystal, 1);
	ItemStack denseGem = new ItemStack(AddedItems.DenseGem, 1);
	ItemStack twilightGem = new ItemStack(AddedItems.TwilightGem, 1);
	ItemStack twilightCrystal = new ItemStack(AddedItems.TwilightCrystal, 1);
	ItemStack tranquilCrystal = new ItemStack(AddedItems.TranquilCrystal, 1);
	ItemStack remembranceCrystal = new ItemStack(AddedItems.RemembranceCrystal, 1);
	ItemStack brightCrystal = new ItemStack(AddedItems.BrightCrystal, 1);
	ItemStack orichalcumPlus = new ItemStack(AddedItems.OrichalcumPlus, 1);
	ItemStack orichalcum = new ItemStack(AddedItems.Orichalcum, 1);
	ItemStack mythrilCrystal = new ItemStack(AddedItems.MythrilCrystal, 1);
	ItemStack mythrilGem = new ItemStack(AddedItems.MythrilGem, 1);
	ItemStack serenityCrystal = new ItemStack(AddedItems.SerenityCrystal, 1);
	ItemStack waywardWind = new ItemStack(AddedItems.K110, 1);
	ItemStack voidGear = new ItemStack(AddedItems.K30, 1);
	ItemStack darkHeart = new ItemStack(AddedItems.DarkHeart, 1);
	ItemStack pureHeart = new ItemStack(AddedItems.Heart, 1);
	ItemStack kingdomKey = new ItemStack(AddedItems.K111, 1);
	ItemStack incompKyeBlade = new ItemStack(AddedItems.K21, 1);
	ItemStack energyStone = new ItemStack(AddedItems.EnergyStone, 1);
	ItemStack stick = new ItemStack(Item.stick, 1);
	ItemStack plank = new ItemStack(Block.planks, 1);
	ItemStack powerStone = new ItemStack(AddedItems.PowerStone, 1);
	ItemStack brightStone = new ItemStack(AddedItems.BrightStone, 1);
	ItemStack lucidStone = new ItemStack(AddedItems.LucidStone, 1);
	ItemStack darkStone = new ItemStack(AddedItems.DarkStone, 1);
	ItemStack munny1000 = new ItemStack(AddedItems.Munny1000, 1);
	ItemStack munny3000 = new ItemStack(AddedItems.Munny3000, 1);
	ItemStack munny500 = new ItemStack(AddedItems.Munny500, 1);
	//this.func_92051_a(new ItemStack(AddedItems.K111, 1), new Object[] {"ROOOR", "OOOOO", "OOROO", "OOOOO", "ROOOR", Character.valueOf('O'), Block.dirt, Character.valueOf('R'), Item.redstone});
	//this.addShapelessRecipe(new ItemStack(AddedItems.K111c), new ItemStack(Item.ingotIron, 1), new ItemStack(Item.ingotIron, 1));
	//SHAPED
	this.func_92051_a(new ItemStack(AddedItems.DarkLeather, 8), new Object[] {"LDHDL", "DLHLD", "LDHDL", Character.valueOf('L'), Item.leather, Character.valueOf('D'), AddedItems.DarkMatter, Character.valueOf('H'), AddedItems.DarkHeart});
	this.func_92051_a(new ItemStack(AddedItems.K21c, 1), new Object[] {"OWDVO", "OKPKO", "DDDDD", "12345", "67890", Character.valueOf('O'), AddedItems.OrichalcumPlus, Character.valueOf('P'), AddedItems.PureHeart, Character.valueOf('D'), AddedItems.DarkHeart, Character.valueOf('W'), AddedItems.K110, Character.valueOf('V'), AddedItems.K30, Character.valueOf('K'), AddedItems.K111, Character.valueOf('1'), AddedItems.BlazingCrystal, Character.valueOf('2'), AddedItems.FrostCrystal, Character.valueOf('3'), AddedItems.LightningCrystal, Character.valueOf('4'), AddedItems.LucidCrystal, Character.valueOf('5'), AddedItems.PowerCrystal, Character.valueOf('6'), AddedItems.DarkCrystal, Character.valueOf('7'), AddedItems.DenseCrystal, Character.valueOf('8'), AddedItems.TwilightCrystal, Character.valueOf('9'), AddedItems.MythrilCrystal, Character.valueOf('0'), AddedItems.BrightCrystal});
	this.func_92051_a(new ItemStack(AddedItems.K22c, 1), new Object[] {"ODKDO", "OPCPO", "PPPPP", "12345", Character.valueOf('O'), AddedItems.OrichalcumPlus, Character.valueOf('P'), AddedItems.PureHeart, Character.valueOf('D'), AddedItems.DarkHeart, Character.valueOf('K'), AddedItems.KingdomHearts, Character.valueOf('C'), AddedItems.K21c, Character.valueOf('1'), AddedItems.EnergyCrystal, Character.valueOf('2'), AddedItems.SerenityCrystal, Character.valueOf('3'), AddedItems.RemembranceCrystal, Character.valueOf('4'), AddedItems.TranquilCrystal, Character.valueOf('5'), AddedItems.ShinyCrystal});
	//SHAPELESS
	this.addShapelessRecipe(new ItemStack(AddedItems.DarkMatter), lucidShard, lucidShard, lucidShard, lucidShard, lucidShard, lucidShard, lucidShard, lucidShard, lucidShard, darkGem, mythrilShard, mythrilShard);
	this.addShapelessRecipe(new ItemStack(AddedItems.MythrilShard), denseStone, denseShard, denseShard, denseShard, twilightStone, twilightShard, twilightShard, twilightShard);
	this.addShapelessRecipe(new ItemStack(AddedItems.MythrilStone), denseStone, denseShard, denseShard, denseShard, twilightStone, twilightShard, twilightShard, twilightShard, serenityShard);
	this.addShapelessRecipe(new ItemStack(AddedItems.MythrilGem), denseCrystal, denseGem, denseGem, denseGem, twilightGem, twilightGem, twilightGem, twilightCrystal);
	this.addShapelessRecipe(new ItemStack(AddedItems.MythrilCrystal), denseCrystal, denseGem, denseGem, denseGem, twilightCrystal, twilightGem, twilightGem, twilightGem, serenityStone);
	this.addShapelessRecipe(new ItemStack(AddedItems.SerenityCrystal), tranquilCrystal, remembranceCrystal, brightCrystal, brightCrystal, brightCrystal, brightCrystal, brightCrystal, brightCrystal, brightCrystal, brightCrystal, brightCrystal);
	this.addShapelessRecipe(new ItemStack(AddedItems.K1c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, energyStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K2c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, powerStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K3c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, twilightStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K4c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, darkStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K5c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K6c), blazingCrystal, darkShard, darkShard, mythrilShard, brightGem, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K7c), orichalcumPlus, twilightCrystal, mythrilCrystal, darkGem, darkGem, lucidStone, lucidStone, lucidStone, lucidStone, brightShard, brightShard, frostGem, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K8c), frostGem, frostGem, frostShard, mythrilStone, mythrilStone, darkShard, lucidStone, powerShard, powerShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K9c), denseGem, denseShard, denseShard, darkCrystal, darkGem, twilightStone, twilightShard, twilightShard, darkShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K10c), shimmeringCrystal, tranquilGem, lightningShard, lightningShard, lightningShard, brightStone, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K11c), shimmeringCrystal, serenityCrystal, remembranceStone, tranquilShard, tranquilShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K12c), lucidShard, energyCrystal, powerShard, mythrilGem, frostGem, brightStone, blazingShard, blazingShard, lightningShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K13c), orichalcum, darkCrystal, twilightCrystal, brightCrystal, frostShard, lucidStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K14c), denseCrystal, mythrilShard, mythrilGem, mythrilGem, brightShard, brightStone, brightShard, frostShard, lightningShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K15c), powerShard, energyShard, mythrilCrystal, denseShard, denseStone, darkStone, lucidGem, denseCrystal, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K16c), powerCrystal, brightShard, brightShard, lucidGem, tranquilStone, tranquilGem, mythrilShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K17c), energyGem, powerGem, denseStone, denseShard, denseShard, brightStone, brightGem, energyCrystal,  munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K18c), darkCrystal, shimmeringCrystal, mythrilShard, mythrilShard, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K19c), orichalcum, darkMatter, lucidGem, mythrilGem, blazingShard, darkShard, darkShard, darkShard, blazingStone, darkStone, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K20c), tranquilGem, stick, plank, plank, denseShard, munny500);
	this.addShapelessRecipe(new ItemStack(AddedItems.K23c), serenityCrystal, brightCrystal, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny3000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K24c), orichalcumPlus, remembranceCrystal, remembranceShard, remembranceShard, remembranceShard, remembranceShard, remembranceShard, darkStone, brightStone, twilightStone, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K25c), orichalcum, blazingCrystal, blazingGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, blazingStone, blazingStone, denseStone, twilightGem, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K26c), orichalcumPlus, mythrilGem, mythrilGem, powerShard, powerShard, brightStone, brightShard, brightShard, brightShard, brightShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K27c), serenityCrystal, mythrilCrystal, mythrilShard, brightGem, brightStone, brightShard, serenityShard, serenityShard, munny1000);
	/*
	this.addShapelessRecipe(new ItemStack(AddedItems.K28c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K29c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K30c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K31c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K32c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K33c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K34c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K35c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K36c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K37c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K38c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K39c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K40c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K41c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K42c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K43c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K44c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K45c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K46c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K47c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K48c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K49c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K50c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K51c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K52c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K53c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K54c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K55c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K56c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K57c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K58c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K59c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K60c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K61c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K62c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K63c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K64c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K65c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K66c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K67c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K68c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K69c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K70c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K71c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K72c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K73c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K74c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K75c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K76c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K77c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K78c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K79c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K80c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K81c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K82c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K83c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K84c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K85c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K86c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K87c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K88c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K89c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K90c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K91c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K92c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K93c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K94c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K95c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K96c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K97c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K98c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K99c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K100c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K101c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K102c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	*/
	this.addShapelessRecipe(new ItemStack(AddedItems.K103c), orichalcumPlus, orichalcumPlus, orichalcumPlus, orichalcumPlus, orichalcumPlus, orichalcumPlus, orichalcumPlus, orichalcumPlus, orichalcumPlus, orichalcumPlus, orichalcumPlus, orichalcumPlus, orichalcum, mythrilCrystal, denseCrystal, twilightCrystal, serenityCrystal, serenityCrystal, serenityCrystal, serenityCrystal, serenityCrystal, serenityCrystal, serenityCrystal);
	/*
	this.addShapelessRecipe(new ItemStack(AddedItems.K104c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K105c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K106c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K107c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K108c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K109c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K110c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K111c), orichalcum, serenityCrystal, mythrilGem, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	*/
	this.addShapelessRecipe(new ItemStack(AddedItems.K112c), orichalcum, brightCrystal, mythrilGem, mythrilGem, denseStone, brightStone, denseShard, denseShard, denseShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K113c), serenityCrystal, brightCrystal, mythrilGem, denseStone, brightStone, blazingShard, blazingShard, blazingShard, munny1000);
	this.addShapelessRecipe(new ItemStack(AddedItems.K114c), orichalcum, darkCrystal, darkMatter, mythrilGem, denseStone, denseStone, powerShard, energyShard, twilightShard, munny1000);
	
	Collections.sort(this.recipes, new SynthRecipeSorter(this));
	         System.out.println(this.recipes.size() + " recipes");
	}

	public SynthShapedRecipes func_92051_a(ItemStack par1ItemStack, Object ... par2ArrayOfObj)
	{
	         String var3 = "";
	         int var4 = 0;
	         int var5 = 0;
	         int var6 = 0;

	         if (par2ArrayOfObj[var4] instanceof String[])
	         {
	                 String[] var7 = (String[])((String[])par2ArrayOfObj[var4++]);

	                 for (int var8 = 0; var8 < var7.length; ++var8)
	                 {
	                         String var9 = var7[var8];
	                         ++var6;
	                         var5 = var9.length();
	                         var3 = var3 + var9;
	                 }
	         }
	         else
	         {
	                 while (par2ArrayOfObj[var4] instanceof String)
	                 {
	                         String var11 = (String)par2ArrayOfObj[var4++];
	                         ++var6;
	                         var5 = var11.length();
	                         var3 = var3 + var11;
	                 }
	         }

	         HashMap var12;

	         for (var12 = new HashMap(); var4 < par2ArrayOfObj.length; var4 += 2)
	         {
	                 Character var13 = (Character)par2ArrayOfObj[var4];
	                 ItemStack var14 = null;

	                 if (par2ArrayOfObj[var4 + 1] instanceof Item)
	                 {
	                         var14 = new ItemStack((Item)par2ArrayOfObj[var4 + 1]);
	                 }
	                 else if (par2ArrayOfObj[var4 + 1] instanceof Block)
	                 {
	                         var14 = new ItemStack((Block)par2ArrayOfObj[var4 + 1], 1, -1);
	                 }
	                 else if (par2ArrayOfObj[var4 + 1] instanceof ItemStack)
	                 {
	                         var14 = (ItemStack)par2ArrayOfObj[var4 + 1];
	                 }

	                 var12.put(var13, var14);
	         }

	         ItemStack[] var15 = new ItemStack[var5 * var6];

	         for (int var16 = 0; var16 < var5 * var6; ++var16)
	         {
	                 char var10 = var3.charAt(var16);

	                 if (var12.containsKey(Character.valueOf(var10)))
	                 {
	                         var15[var16] = ((ItemStack)var12.get(Character.valueOf(var10))).copy();
	                 }
	                 else
	                 {
	                         var15[var16] = null;
	                 }
	         }

	         SynthShapedRecipes var17 = new SynthShapedRecipes(var5, var6, var15, par1ItemStack);
	         this.recipes.add(var17);
	         return var17;
	}

	public void addShapelessRecipe(ItemStack par1ItemStack, Object ... par2ArrayOfObj)
	{
	         ArrayList var3 = new ArrayList();
	         Object[] var4 = par2ArrayOfObj;
	         int var5 = par2ArrayOfObj.length;

	         for (int var6 = 0; var6 < var5; ++var6)
	         {
	                 Object var7 = var4[var6];

	                 if (var7 instanceof ItemStack)
	                 {
	                         var3.add(((ItemStack)var7).copy());
	                 }
	                 else if (var7 instanceof Item)
	                 {
	                         var3.add(new ItemStack((Item)var7));
	                 }
	                 else
	                 {
	                         if (!(var7 instanceof Block))
	                         {
	                                 throw new RuntimeException("Invalid shapeless recipy!");
	                         }

	                         var3.add(new ItemStack((Block)var7));
	                 }
	         }

	         this.recipes.add(new SynthShaplessRecipes(par1ItemStack, var3));
	}

	public ItemStack findMatchingRecipe(InventoryCrafting par1InventoryCrafting, World par2World)
	{
	         int var3 = 0;
	         ItemStack var4 = null;
	         ItemStack var5 = null;
	         int var6;

	         for (var6 = 0; var6 < par1InventoryCrafting.getSizeInventory(); ++var6)
	         {
	                 ItemStack var7 = par1InventoryCrafting.getStackInSlot(var6);

	                 if (var7 != null)
	                 {
	                         if (var3 == 0)
	                         {
	                                 var4 = var7;
	                         }

	                         if (var3 == 1)
	                         {
	                                 var5 = var7;
	                         }

	                         ++var3;
	                 }
	         }

	         if (var3 == 2 && var4.itemID == var5.itemID && var4.stackSize == 1 && var5.stackSize == 1 && Item.itemsList[var4.itemID].isRepairable())
	         {
	                 Item var11 = Item.itemsList[var4.itemID];
	                 int var13 = var11.getMaxDamage() - var4.getItemDamageForDisplay();
	                 int var8 = var11.getMaxDamage() - var5.getItemDamageForDisplay();
	                 int var9 = var13 + var8 + var11.getMaxDamage() * 5 / 100;
	                 int var10 = var11.getMaxDamage() - var9;

	                 if (var10 < 0)
	                 {
	                         var10 = 0;
	                 }

	                 return new ItemStack(var4.itemID, 1, var10);
	         }
	         else
	         {
	                 for (var6 = 0; var6 < this.recipes.size(); ++var6)
	                 {
	                         IRecipe var12 = (IRecipe)this.recipes.get(var6);

	                         if (var12.matches(par1InventoryCrafting, par2World))
	                         {
	                                 return var12.getCraftingResult(par1InventoryCrafting);
	                         }
	                 }

	                 return null;
	         }
	}

	/**
	         * returns the List<> of all recipes
	         */
	public List getRecipeList()
	{
	         return this.recipes;
	}
	}