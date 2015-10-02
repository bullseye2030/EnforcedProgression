package net.whcuk.enforcedprogression.recipes;

import java.util.ArrayList;
import java.util.Iterator;

import scala.Int;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.RecipesTools;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.whcuk.enforcedprogression.items.Register;
import net.whcuk.enforcedprogression.utils.Logging;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.FMLLog;

public class RecipeHandler
{
	public static void AddRecipeShaped(ItemStack result, Object[]...Args)
	{
		GameRegistry.addRecipe(result, Args)
		Logging.logInfo("Adding Recipe for " + result)
	}
	public static void AddShapedRecipes()
	{
		// Components
		GameRegistry.addRecipe(new ItemStack(Register.ToolHandle), new Object[] { "  s", " s ", "s  ", 's', Items.stick });
		GameRegistry.addRecipe(new ItemStack(Register.ToolHandleReinforced), new Object[] { " is", "isi", "si ", 's', Register.ToolHandle, 'i', Items.iron_ingot });
		GameRegistry.addRecipe(new ItemStack(Register.PickaxeHeadWood), new Object[] { " l ", "l l", "   ", 'l', Blocks.log }); // This is for oak, birch, spruce and jungle
		GameRegistry.addRecipe(new ItemStack(Register.PickaxeHeadWood), new Object[] { " l ", "l l", "   ", 'l', Blocks.log2 }); // And this is for acacia and dark oak...
		GameRegistry.addRecipe(new ItemStack(Register.PickaxeHeadStone), new Object[] { " l ", "l l", "   ", 'l', Blocks.stone });
		GameRegistry.addRecipe(new ItemStack(Register.PickaxeHeadIron), new Object[] { " l ", "l l", "   ", 'l', Items.iron_ingot });
		GameRegistry.addRecipe(new ItemStack(Register.PickaxeHeadGold), new Object[] { " l ", "l l", "   ", 'l', Items.gold_ingot });
		GameRegistry.addRecipe(new ItemStack(Register.PickaxeHeadDiamond), new Object[] { " l ", "l l", "   ", 'l', Items.diamond });
		GameRegistry.addRecipe(new ItemStack(Register.Firebox), new Object[] { " c ", "c c", "cCc", 'c', Blocks.cobblestone, 'C', Items.coal});
		GameRegistry.addRecipe(new ItemStack(Register.Firebox), new Object[] { " c ", "c c", "cCc", 'c', Blocks.cobblestone, 'C', new ItemStack(Items.coal, 1, 1)});
		GameRegistry.addRecipe(new ItemStack(Register.FurnaceFrame), new Object[] { "ccc", "c c", "ccc", 'c', Blocks.cobblestone});
		GameRegistry.addRecipe(new ItemStack(Register.SmeltingCompartment), new Object[] { "c c", "c c", " c ", 'c', Blocks.cobblestone});

		// Pickaxes
		GameRegistry.addRecipe(new ItemStack(Items.wooden_pickaxe), new Object[] { " h ", " s ", " s ", 's', Register.ToolHandle, 'h', Register.PickaxeHeadWood });
		GameRegistry.addRecipe(new ItemStack(Items.stone_pickaxe), new Object[] { " h ", " s ", " s ", 's', Register.ToolHandle, 'h', Register.PickaxeHeadStone });
		GameRegistry.addRecipe(new ItemStack(Items.golden_pickaxe), new Object[] { " h ", " s ", " s ", 's', Register.ToolHandleReinforced, 'h', Register.PickaxeHeadGold });
		GameRegistry.addRecipe(new ItemStack(Items.iron_pickaxe), new Object[] { " h ", " s ", " s ", 's', Register.ToolHandleReinforced, 'h', Register.PickaxeHeadIron });
		GameRegistry.addRecipe(new ItemStack(Items.diamond_pickaxe), new Object[] { " h ", " s ", " s ", 's', Register.ToolHandleReinforced, 'h', Register.PickaxeHeadDiamond });
		
		//Other
		GameRegistry.addRecipe(new ItemStack(Blocks.furnace), new Object[] {"csc", "cfc", "cFc", 's', Register.SmeltingCompartment, 'f', Register.FurnaceFrame, 'F', Register.Firebox, 'c', Blocks.cobblestone});
	}

	public static void RemoveVanillaRecipes()
	{
		RemoveRecipe(new ItemStack(Items.wooden_pickaxe)); // Remove the recipe for a wooden pick
		RemoveRecipe(new ItemStack(Items.stone_pickaxe)); // Remove the recipe for a stone pick
		RemoveRecipe(new ItemStack(Items.iron_pickaxe)); // Remove the recipe for a iron pick
		RemoveRecipe(new ItemStack(Items.golden_pickaxe)); // Remove the recipe for a gold pick
		RemoveRecipe(new ItemStack(Items.diamond_pickaxe)); // Remove the recipe for a diamond pick
		
		RemoveRecipe(new ItemStack(Items.wooden_sword)); // Remove the recipe for a wooden sword
		RemoveRecipe(new ItemStack(Items.stone_sword)); // Remove the recipe for a stone sword
		RemoveRecipe(new ItemStack(Items.iron_sword)); // Remove the recipe for a iron sword
		RemoveRecipe(new ItemStack(Items.golden_sword)); // Remove the recipe for a gold sword
		RemoveRecipe(new ItemStack(Items.diamond_sword)); // Remove the recipe for a diamond sword
		
		RemoveRecipe(new ItemStack(Blocks.furnace)); // Remove the recipe for a furnace
	}

	private static void RemoveRecipe(ItemStack resultItem)
	{
		Boolean Success = false; // Blank success true/false
		ItemStack recipeResult = null; // Used to store the output item of the recipe
		ArrayList recipes = (ArrayList) CraftingManager.getInstance().getRecipeList(); // Gets the recipe list
		for (int scan = 0; scan < recipes.size(); scan++) // Go through the list
		{
			IRecipe tmpRecipe = (IRecipe) recipes.get(scan); // Get the current recipe
			if (tmpRecipe instanceof ShapedRecipes) // If it's shaped
			{
				ShapedRecipes recipe = (ShapedRecipes) tmpRecipe; // Decode it
				// Logging.logDebug("Scanning SHAPED Recipe " + recipe + "--> " + recipe.getRecipeOutput()); // Debug Log.
				recipeResult = recipe.getRecipeOutput(); // Get the output
				if (ItemStack.areItemStacksEqual(resultItem, recipeResult)) // If the item is what we were looking for
				{
					Success = true;
					recipes.remove(scan); // Remove the recipe
					Logging.logInfo("Successfully Removed Recipe: " + recipes.get(scan) + " -> " + recipeResult.getDisplayName()); // Log that it was removed.
				}
			}
			if (tmpRecipe instanceof ShapelessRecipes) // If it's shapeless
			{
				ShapelessRecipes recipe = (ShapelessRecipes) tmpRecipe; // Decode it
				// Logging.logDebug("Scanning SHAPELESS Recipe " + recipe + "--> " + recipe.getRecipeOutput()); // Debug Log.
				recipeResult = recipe.getRecipeOutput(); // Get the output
				if (ItemStack.areItemStacksEqual(resultItem, recipeResult)) // If the item is what we were looking for
				{
					Success = true;
					recipes.remove(scan); // Remove the recipe
					Logging.logInfo("Successfully Removed Recipe: " + recipes.get(scan) + " -> " + recipeResult.getDisplayName()); // Log that it was removed.
				}

			}
			if (tmpRecipe instanceof ShapedOreRecipe) // If it's a forge absurdity :D
			{
				ShapedOreRecipe recipe = (ShapedOreRecipe) tmpRecipe; // Decode it
				// Logging.logDebug("Scanning OREDICT Recipe " + recipe + "--> " + recipe.getRecipeOutput()); // Debug Log.
				recipeResult = recipe.getRecipeOutput(); // Get the output
				if (ItemStack.areItemStacksEqual(resultItem, recipeResult)) // If the item is what we were looking for
				{
					Success = true;
					recipes.remove(scan); // Remove the recipe
					Logging.logInfo("Successfully Removed Recipe: " + recipes.get(scan) + " -> " + recipeResult.getDisplayName()); // Log that it was removed.
				}
			}
		}
		if (Success == false)
		{
			Logging.logErr("FAILED to Remove Recipe: " + resultItem); // Log that it failed to be removed.
		}
	}
}
