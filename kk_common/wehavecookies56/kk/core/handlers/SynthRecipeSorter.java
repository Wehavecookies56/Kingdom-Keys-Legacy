package wehavecookies56.kk.core.handlers;

import java.util.Comparator;

import net.minecraft.item.crafting.IRecipe;

public class SynthRecipeSorter implements Comparator{
	final SynthCraftingManager betterCraftingManager;

	public SynthRecipeSorter(SynthCraftingManager par1SynthCraftingManager)
	{
	         this.betterCraftingManager = par1SynthCraftingManager;
	}

	public int compareRecipes(IRecipe par1IRecipe, IRecipe par2IRecipe)
	{
	         return par1IRecipe instanceof SynthShaplessRecipes && par2IRecipe instanceof SynthShapedRecipes ? 1 : (par2IRecipe instanceof SynthShaplessRecipes && par1IRecipe instanceof SynthShapedRecipes ? -1 : (par2IRecipe.getRecipeSize() < par1IRecipe.getRecipeSize() ? -1 : (par2IRecipe.getRecipeSize() > par1IRecipe.getRecipeSize() ? 1 : 0)));
	}

	public int compare(Object par1Obj, Object par2Obj)
	{
	         return this.compareRecipes((IRecipe)par1Obj, (IRecipe)par2Obj);
	}
	}
