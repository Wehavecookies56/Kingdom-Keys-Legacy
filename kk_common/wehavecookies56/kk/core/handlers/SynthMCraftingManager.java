package wehavecookies56.kk.core.handlers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import wehavecookies56.kk.item.AddedItems;
import wehavecookies56.kk.lib.UsefulArrays;
import net.minecraft.block.Block;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraft.world.World;

public class SynthMCraftingManager
{
    /** The static instance of this class */
    private static final SynthMCraftingManager instance = new SynthMCraftingManager();

    /** A list of all the recipes added */
    private List recipes = new ArrayList();

    /**
     * Returns the static instance of this class
     */
    public static final SynthMCraftingManager getInstance()
    {
        return instance;
    }

    private SynthMCraftingManager()
    {
        
        this.addRecipe(new ItemStack(AddedItems.KeybladeTHelm, 1), new Object[] {
        	"DED", 
        	"PGP", 
        	" K ", 
        	'D', AddedItems.DarkMatter, 'E', UsefulArrays.keyblade[109], 'P', AddedItems.PureHeart, 'G', Block.glass, 'K', AddedItems.KingdomHearts
        });
        this.addRecipe(new ItemStack(AddedItems.KeybladeTChest, 1), new Object[] {
        	"DED", 
        	"DKD", 
        	"PKP", 
        	'D', AddedItems.DarkMatter, 'E', UsefulArrays.keyblade[109], 'P', AddedItems.PureHeart, 'K', AddedItems.KingdomHearts
        });
        this.addRecipe(new ItemStack(AddedItems.KeybladeTLegs, 1), new Object[] {
        	"DDD", 
        	"DED", 
        	"PKP", 
        	'D', AddedItems.DarkMatter, 'E', UsefulArrays.keyblade[109], 'P', AddedItems.PureHeart, 'K', AddedItems.KingdomHearts
        });
        this.addRecipe(new ItemStack(AddedItems.KeybladeTBoots, 1), new Object[] {
        	"DED",
        	"PKP",
        	'D', AddedItems.DarkMatter, 'E', UsefulArrays.keyblade[109], 'P', AddedItems.PureHeart, 'K', AddedItems.KingdomHearts
        });
        
        this.addRecipe(new ItemStack(AddedItems.KeybladeVHelm, 1), new Object[] {
        	"BWB", 
        	"PGP", 
        	" K ", 
        	'B', AddedItems.BrightCrystal, 'W', UsefulArrays.keyblade[110], 'P', AddedItems.PureHeart, 'G', Block.glass, 'K', AddedItems.KingdomHearts
        });
        this.addRecipe(new ItemStack(AddedItems.KeybladeVChest, 1), new Object[] {
        	"BWB", 
        	"BKB", 
        	"PKP", 
        	'B', AddedItems.BrightCrystal, 'W', UsefulArrays.keyblade[110], 'P', AddedItems.PureHeart, 'K', AddedItems.KingdomHearts
        });
        this.addRecipe(new ItemStack(AddedItems.KeybladeVLegs, 1), new Object[] {
        	"BBB", 
        	"BWB", 
        	"PKP", 
        	'B', AddedItems.BrightCrystal, 'W', UsefulArrays.keyblade[110], 'P', AddedItems.PureHeart, 'K', AddedItems.KingdomHearts
        });
        this.addRecipe(new ItemStack(AddedItems.KeybladeVBoots, 1), new Object[] {
        	"BWB",
        	"PKP",
        	'B', AddedItems.BrightCrystal, 'W', UsefulArrays.keyblade[110], 'P', AddedItems.PureHeart, 'K', AddedItems.KingdomHearts
        });
        
        this.addRecipe(new ItemStack(AddedItems.KeybladeAHelm, 1), new Object[] {
        	"MRM", 
        	"PGP", 
        	" K ", 
        	'M', AddedItems.MythrilCrystal, 'R', UsefulArrays.keyblade[108], 'P', AddedItems.PureHeart, 'G', Block.glass, 'K', AddedItems.KingdomHearts
        });
        this.addRecipe(new ItemStack(AddedItems.KeybladeAChest, 1), new Object[] {
        	"MRM", 
        	"MKM", 
        	"PKP", 
        	'M', AddedItems.MythrilCrystal, 'R', UsefulArrays.keyblade[108], 'P', AddedItems.PureHeart, 'K', AddedItems.KingdomHearts
        });
        this.addRecipe(new ItemStack(AddedItems.KeybladeALegs, 1), new Object[] {
        	"MMM", 
        	"MRM", 
        	"PKP", 
        	'M', AddedItems.MythrilCrystal, 'R', UsefulArrays.keyblade[108], 'P', AddedItems.PureHeart, 'K', AddedItems.KingdomHearts
        });
        this.addRecipe(new ItemStack(AddedItems.KeybladeABoots, 1), new Object[] {
        	"MRM",
        	"PKP",
        	'M', AddedItems.MythrilCrystal, 'R', UsefulArrays.keyblade[108], 'P', AddedItems.PureHeart, 'K', AddedItems.KingdomHearts
        });
        
        this.addRecipe(new ItemStack(AddedItems.KeybladeEHelm, 1), new Object[] {
        	"SMS", 
        	"PGP", 
        	" K ", 
        	'S', AddedItems.ShinyCrystal, 'M', UsefulArrays.keyblade[26], 'P', AddedItems.PureHeart, 'G', Block.glass, 'K', AddedItems.KingdomHearts
        });
        this.addRecipe(new ItemStack(AddedItems.KeybladeEChest, 1), new Object[] {
        	"SMS", 
        	"SKS", 
        	"PKP", 
        	'S', AddedItems.ShinyCrystal, 'M', UsefulArrays.keyblade[26], 'P', AddedItems.PureHeart, 'K', AddedItems.KingdomHearts
        });
        this.addRecipe(new ItemStack(AddedItems.KeybladeELegs, 1), new Object[] {
        	"SSS", 
        	"SMS", 
        	"PKP", 
        	'S', AddedItems.ShinyCrystal, 'M', UsefulArrays.keyblade[26], 'P', AddedItems.PureHeart, 'K', AddedItems.KingdomHearts
        });
        this.addRecipe(new ItemStack(AddedItems.KeybladeEBoots, 1), new Object[] {
        	"SMS",
        	"PKP",
        	'S', AddedItems.ShinyCrystal, 'M', UsefulArrays.keyblade[26], 'P', AddedItems.PureHeart, 'K', AddedItems.KingdomHearts
        });
        //this.addShapelessRecipe(new ItemStack(Item.book, 1), new Object[] {Item.paper, Item.paper, Item.paper, Item.leather});
        Collections.sort(this.recipes, new SynthMRecipeSorter(this));
    }

    public ShapedRecipes addRecipe(ItemStack par1ItemStack, Object ... par2ArrayOfObj)
    {
        String s = "";
        int i = 0;
        int j = 0;
        int k = 0;

        if (par2ArrayOfObj[i] instanceof String[])
        {
            String[] astring = (String[])((String[])par2ArrayOfObj[i++]);

            for (int l = 0; l < astring.length; ++l)
            {
                String s1 = astring[l];
                ++k;
                j = s1.length();
                s = s + s1;
            }
        }
        else
        {
            while (par2ArrayOfObj[i] instanceof String)
            {
                String s2 = (String)par2ArrayOfObj[i++];
                ++k;
                j = s2.length();
                s = s + s2;
            }
        }

        HashMap hashmap;

        for (hashmap = new HashMap(); i < par2ArrayOfObj.length; i += 2)
        {
            Character character = (Character)par2ArrayOfObj[i];
            ItemStack itemstack1 = null;

            if (par2ArrayOfObj[i + 1] instanceof Item)
            {
                itemstack1 = new ItemStack((Item)par2ArrayOfObj[i + 1]);
            }
            else if (par2ArrayOfObj[i + 1] instanceof Block)
            {
                itemstack1 = new ItemStack((Block)par2ArrayOfObj[i + 1], 1, 32767);
            }
            else if (par2ArrayOfObj[i + 1] instanceof ItemStack)
            {
                itemstack1 = (ItemStack)par2ArrayOfObj[i + 1];
            }

            hashmap.put(character, itemstack1);
        }

        ItemStack[] aitemstack = new ItemStack[j * k];

        for (int i1 = 0; i1 < j * k; ++i1)
        {
            char c0 = s.charAt(i1);

            if (hashmap.containsKey(Character.valueOf(c0)))
            {
                aitemstack[i1] = ((ItemStack)hashmap.get(Character.valueOf(c0))).copy();
            }
            else
            {
                aitemstack[i1] = null;
            }
        }

        ShapedRecipes shapedrecipes = new ShapedRecipes(j, k, aitemstack, par1ItemStack);
        this.recipes.add(shapedrecipes);
        return shapedrecipes;
    }

    public void addShapelessRecipe(ItemStack par1ItemStack, Object ... par2ArrayOfObj)
    {
        ArrayList arraylist = new ArrayList();
        Object[] aobject = par2ArrayOfObj;
        int i = par2ArrayOfObj.length;

        for (int j = 0; j < i; ++j)
        {
            Object object1 = aobject[j];

            if (object1 instanceof ItemStack)
            {
                arraylist.add(((ItemStack)object1).copy());
            }
            else if (object1 instanceof Item)
            {
                arraylist.add(new ItemStack((Item)object1));
            }
            else
            {
                if (!(object1 instanceof Block))
                {
                    throw new RuntimeException("Invalid shapeless recipy!");
                }

                arraylist.add(new ItemStack((Block)object1));
            }
        }

        this.recipes.add(new ShapelessRecipes(par1ItemStack, arraylist));
    }

    public ItemStack findMatchingRecipe(InventoryCrafting par1InventoryCrafting, World par2World)
    {
        int i = 0;
        ItemStack itemstack = null;
        ItemStack itemstack1 = null;
        int j;

        for (j = 0; j < par1InventoryCrafting.getSizeInventory(); ++j)
        {
            ItemStack itemstack2 = par1InventoryCrafting.getStackInSlot(j);

            if (itemstack2 != null)
            {
                if (i == 0)
                {
                    itemstack = itemstack2;
                }

                if (i == 1)
                {
                    itemstack1 = itemstack2;
                }

                ++i;
            }
        }

        if (i == 2 && itemstack.itemID == itemstack1.itemID && itemstack.stackSize == 1 && itemstack1.stackSize == 1 && Item.itemsList[itemstack.itemID].isRepairable())
        {
            Item item = Item.itemsList[itemstack.itemID];
            int k = item.getMaxDamage() - itemstack.getItemDamageForDisplay();
            int l = item.getMaxDamage() - itemstack1.getItemDamageForDisplay();
            int i1 = k + l + item.getMaxDamage() * 5 / 100;
            int j1 = item.getMaxDamage() - i1;

            if (j1 < 0)
            {
                j1 = 0;
            }

            return new ItemStack(itemstack.itemID, 1, j1);
        }
        else
        {
            for (j = 0; j < this.recipes.size(); ++j)
            {
                IRecipe irecipe = (IRecipe)this.recipes.get(j);

                if (irecipe.matches(par1InventoryCrafting, par2World))
                {
                    return irecipe.getCraftingResult(par1InventoryCrafting);
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
