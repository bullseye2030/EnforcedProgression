package net.whcuk.enforcedprogression.recipes;

import java.util.ArrayList;
import java.util.Iterator;

import scala.Int;
import scala.util.control.Exception;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.RecipesTools;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import net.whcuk.enforcedprogression.items.Register;
import net.whcuk.enforcedprogression.utils.Logging;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.FMLLog;

public class RecipeHandler
{
	public static void AddRecipeShaped(ItemStack result, Object... Args)
	{
		GameRegistry.addRecipe(result, Args);
		Logging.logDebug("Success in Adding Shaped EnforcedProgression Recipe for " + result.getDisplayName());
	}

	public static void AddRecipeShapeless(ItemStack result, Object... Args)
	{
		GameRegistry.addShapelessRecipe(result, Args);
		Logging.logDebug("Success in Adding Shapeless EnforcedProgression Recipe for " + result.getDisplayName());
	}

	public static void AddShapedRecipes()
	{
		// Components
		AddRecipeShaped(new ItemStack(Register.ToolHandle), new Object[] { "  s", " s ", "s  ", 's', Items.stick });
		AddRecipeShaped(new ItemStack(Register.ToolHandleReinforced), new Object[] { " is", "isi", "si ", 's', Register.ToolHandle, 'i', Items.iron_ingot });
		AddRecipeShaped(new ItemStack(Register.PickaxeHeadWood), new Object[] { " l ", "l l", "   ", 'l', Blocks.log }); // This is for oak, birch, spruce and jungle
		AddRecipeShaped(new ItemStack(Register.PickaxeHeadWood), new Object[] { " l ", "l l", "   ", 'l', Blocks.log2 }); // And this is for acacia and dark oak...
		AddRecipeShaped(new ItemStack(Register.PickaxeHeadStone), new Object[] { " l ", "l l", "   ", 'l', Blocks.stone });
		AddRecipeShaped(new ItemStack(Register.PickaxeHeadIron), new Object[] { " l ", "l l", "   ", 'l', Items.iron_ingot });
		AddRecipeShaped(new ItemStack(Register.PickaxeHeadGold), new Object[] { " l ", "l l", "   ", 'l', Items.gold_ingot });
		AddRecipeShaped(new ItemStack(Register.PickaxeHeadDiamond), new Object[] { " l ", "l l", "   ", 'l', Items.diamond });
		AddRecipeShaped(new ItemStack(Register.Firebox), new Object[] { " c ", "c c", "cCc", 'c', Blocks.cobblestone, 'C', Items.coal });
		AddRecipeShaped(new ItemStack(Register.Firebox), new Object[] { " c ", "c c", "cCc", 'c', Blocks.cobblestone, 'C', new ItemStack(Items.coal, 1, 1) });
		AddRecipeShaped(new ItemStack(Register.FurnaceFrame), new Object[] { "ccc", "c c", "ccc", 'c', Blocks.cobblestone });
		AddRecipeShaped(new ItemStack(Register.SmeltingCompartment), new Object[] { "c c", "c c", " c ", 'c', Blocks.cobblestone });

		// Pickaxes
		AddRecipeShaped(new ItemStack(Items.wooden_pickaxe), new Object[] { " h ", " s ", " s ", 's', Register.ToolHandle, 'h', Register.PickaxeHeadWood });
		AddRecipeShaped(new ItemStack(Items.stone_pickaxe), new Object[] { " h ", " s ", " s ", 's', Register.ToolHandle, 'h', Register.PickaxeHeadStone });
		AddRecipeShaped(new ItemStack(Items.golden_pickaxe), new Object[] { " h ", " s ", " s ", 's', Register.ToolHandleReinforced, 'h', Register.PickaxeHeadGold });
		AddRecipeShaped(new ItemStack(Items.iron_pickaxe), new Object[] { " h ", " s ", " s ", 's', Register.ToolHandleReinforced, 'h', Register.PickaxeHeadIron });
		AddRecipeShaped(new ItemStack(Items.diamond_pickaxe), new Object[] { " h ", " s ", " s ", 's', Register.ToolHandleReinforced, 'h', Register.PickaxeHeadDiamond });
		
		//Saws
		AddRecipeShaped(new ItemStack(Register.SawMakeshift), new Object[] { "lll", "   ", "   ", 'l', Blocks.log});
		AddRecipeShaped(new ItemStack(Register.SawMakeshift), new Object[] { "lll", "   ", "   ", 'l', Blocks.log2}); //For Acacia + DarkOak

		// Other
		AddRecipeShaped(new ItemStack(Blocks.furnace), new Object[] { "csc", "cfc", "cFc", 's', Register.SmeltingCompartment, 'f', Register.FurnaceFrame, 'F', Register.Firebox, 'c', Blocks.cobblestone });
	}

	public static void AddShapelessRecipes()
	{
		AddRecipeShapeless(new ItemStack(Blocks.planks,1,0), new Object[]{new ItemStack(Register.SawMakeshift,1,OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.log,1,0)});
		AddRecipeShapeless(new ItemStack(Blocks.planks,1,1), new Object[]{new ItemStack(Register.SawMakeshift,1,OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.log,1,1)});
		AddRecipeShapeless(new ItemStack(Blocks.planks,1,2), new Object[]{new ItemStack(Register.SawMakeshift,1,OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.log,1,2)});
		AddRecipeShapeless(new ItemStack(Blocks.planks,1,3), new Object[]{new ItemStack(Register.SawMakeshift,1,OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.log,1,3)});
		AddRecipeShapeless(new ItemStack(Blocks.planks,1,4), new Object[]{new ItemStack(Register.SawMakeshift,1,OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.log2,1,0)});
		AddRecipeShapeless(new ItemStack(Blocks.planks,1,5), new Object[]{new ItemStack(Register.SawMakeshift,1,OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.log2,1,1)});
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
		RemoveRecipe(new ItemStack(Blocks.planks,4));
		RemoveRecipe(new ItemStack(Blocks.planks,4,1));
		RemoveRecipe(new ItemStack(Blocks.planks,4,2));
		RemoveRecipe(new ItemStack(Blocks.planks,4,3));
		RemoveRecipe(new ItemStack(Blocks.planks,4,4));
		RemoveRecipe(new ItemStack(Blocks.planks,4,5));
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
			if (tmpRecipe instanceof ShapelessOreRecipe) // If it's another forge absurdity :D
			{
				ShapelessOreRecipe recipe = (ShapelessOreRecipe) tmpRecipe; // Decode it
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
