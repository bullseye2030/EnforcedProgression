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
import net.whcuk.enforcedprogression.EnforcedProgression;
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
		if (EnforcedProgression.modifyPicks)
		{
			AddRecipeShaped(new ItemStack(Register.PickaxeHeadWood), new Object[] { " l ", "l l", "   ", 'l', Blocks.log }); // This is for oak, birch, spruce and jungle
			AddRecipeShaped(new ItemStack(Register.PickaxeHeadWood), new Object[] { " l ", "l l", "   ", 'l', Blocks.log2 }); // And this is for acacia and dark oak...
			AddRecipeShaped(new ItemStack(Register.PickaxeHeadStone), new Object[] { " l ", "l l", "   ", 'l', Blocks.stone });
			AddRecipeShaped(new ItemStack(Register.PickaxeHeadIron), new Object[] { " l ", "l l", "   ", 'l', Items.iron_ingot });
			AddRecipeShaped(new ItemStack(Register.PickaxeHeadGold), new Object[] { " l ", "l l", "   ", 'l', Items.gold_ingot });
			AddRecipeShaped(new ItemStack(Register.PickaxeHeadDiamond), new Object[] { " l ", "l l", "   ", 'l', Items.diamond });
		} else
		{
			Logging.logInfo("Not using Pickaxe Heads - modifyPicks is disabled!");
		}
		if (EnforcedProgression.modifySwords)
		{
			AddRecipeShaped(new ItemStack(Register.SwordBladeWood), new Object[] { " l ", "lll", "   ", 'l', Blocks.log }); // This is for oak, birch, spruce and jungle
			AddRecipeShaped(new ItemStack(Register.SwordBladeWood), new Object[] { " l ", "lll", "   ", 'l', Blocks.log2 }); // And this is for acacia and dark oak...
			AddRecipeShaped(new ItemStack(Register.SwordBladeStone), new Object[] { " l ", "lwl", "   ", 'l', Blocks.stone, 'w', Blocks.log });
			AddRecipeShaped(new ItemStack(Register.SwordBladeIron), new Object[] { " l ", "lwl", "   ", 'l', Items.iron_ingot, 'w', Blocks.log });
			AddRecipeShaped(new ItemStack(Register.SwordBladeGold), new Object[] { " l ", "lwl", "   ", 'l', Items.gold_ingot, 'w', Blocks.log });
			AddRecipeShaped(new ItemStack(Register.SwordBladeDiamond), new Object[] { " l ", "lwl", "   ", 'l', Items.diamond, 'w', Blocks.log });
			AddRecipeShaped(new ItemStack(Register.SwordBladeStone), new Object[] { " l ", "lwl", "   ", 'l', Blocks.stone, 'w', Blocks.log2 });
			AddRecipeShaped(new ItemStack(Register.SwordBladeIron), new Object[] { " l ", "lwl", "   ", 'l', Items.iron_ingot, 'w', Blocks.log2 });
			AddRecipeShaped(new ItemStack(Register.SwordBladeGold), new Object[] { " l ", "lwl", "   ", 'l', Items.gold_ingot, 'w', Blocks.log2 });
			AddRecipeShaped(new ItemStack(Register.SwordBladeDiamond), new Object[] { " l ", "lwl", "   ", 'l', Items.diamond, 'w', Blocks.log2 });
		} else
		{
			Logging.logInfo("Not using Sword Blades - modifySwords is disabled!");
		}
		AddRecipeShaped(new ItemStack(Register.Firebox), new Object[] { " c ", "c c", "cCc", 'c', Blocks.cobblestone, 'C', Items.coal });
		AddRecipeShaped(new ItemStack(Register.Firebox), new Object[] { " c ", "c c", "cCc", 'c', Blocks.cobblestone, 'C', new ItemStack(Items.coal, 1, 1) });
		AddRecipeShaped(new ItemStack(Register.FurnaceFrame), new Object[] { "ccc", "c c", "ccc", 'c', Blocks.cobblestone });
		AddRecipeShaped(new ItemStack(Register.SmeltingCompartment), new Object[] { "c c", "c c", " c ", 'c', Blocks.cobblestone });

		// Pickaxes
		if (EnforcedProgression.modifyPicks)
		{
			AddRecipeShaped(new ItemStack(Items.wooden_pickaxe), new Object[] { " h ", " s ", " s ", 's', Register.ToolHandle, 'h', Register.PickaxeHeadWood });
			AddRecipeShaped(new ItemStack(Items.stone_pickaxe), new Object[] { " h ", " s ", " s ", 's', Register.ToolHandle, 'h', Register.PickaxeHeadStone });
			AddRecipeShaped(new ItemStack(Items.golden_pickaxe), new Object[] { " h ", " s ", " s ", 's', Register.ToolHandleReinforced, 'h', Register.PickaxeHeadGold });
			AddRecipeShaped(new ItemStack(Items.iron_pickaxe), new Object[] { " h ", " s ", " s ", 's', Register.ToolHandleReinforced, 'h', Register.PickaxeHeadIron });
			AddRecipeShaped(new ItemStack(Items.diamond_pickaxe), new Object[] { " h ", " s ", " s ", 's', Register.ToolHandleReinforced, 'h', Register.PickaxeHeadDiamond });
		}

		// Swords
		if (EnforcedProgression.modifySwords)
		{
			AddRecipeShaped(new ItemStack(Items.wooden_sword), new Object[] { " b ", " s ", " s ", 's', Register.ToolHandle, 'b', Register.SwordBladeWood });
			AddRecipeShaped(new ItemStack(Items.stone_sword), new Object[] { " b ", " s ", " s ", 's', Register.ToolHandle, 'b', Register.SwordBladeStone });
			AddRecipeShaped(new ItemStack(Items.golden_sword), new Object[] { " b ", " s ", " s ", 's', Register.ToolHandleReinforced, 'b', Register.SwordBladeGold });
			AddRecipeShaped(new ItemStack(Items.iron_sword), new Object[] { " b ", " s ", " s ", 's', Register.ToolHandleReinforced, 'b', Register.SwordBladeIron });
			AddRecipeShaped(new ItemStack(Items.diamond_sword), new Object[] { " b ", " s ", " s ", 's', Register.ToolHandleReinforced, 'b', Register.SwordBladeDiamond });
		}

		if (EnforcedProgression.modifySwords)
		{
			// Saws
			AddRecipeShaped(new ItemStack(Register.SawMakeshift), new Object[] { "lll", "   ", "   ", 'l', Blocks.log });
			AddRecipeShaped(new ItemStack(Register.SawMakeshift), new Object[] { "lll", "   ", "   ", 'l', Blocks.log2 }); // For Acacia + DarkOak
			
			AddRecipeShaped(new ItemStack(Register.SawWood), new Object[] { "ppp", "ssp", "   ", 'p', Blocks.planks, 's', Items.stick });
			
			AddRecipeShaped(new ItemStack(Register.StickStone), new Object[] { "s  ", "s  ", "   ", 's', Blocks.cobblestone });
			AddRecipeShaped(new ItemStack(Register.SawStone), new Object[] { "ppp", "ssp", "   ", 'p', Blocks.planks, 's', Register.StickStone });
			
			AddRecipeShaped(new ItemStack(Register.StickIron), new Object[] { "isi", "isi", "   ", 's', Register.StickStone, 'i', Items.iron_ingot });
			AddRecipeShaped(new ItemStack(Register.SawIron), new Object[] { "ppp", "ssp", "   ", 'p', Blocks.planks, 's', Register.StickIron });
			
			AddRecipeShaped(new ItemStack(Register.StickGold), new Object[] { "isi", "isi", "   ", 's', Register.StickIron, 'i', Items.gold_ingot });
			AddRecipeShaped(new ItemStack(Register.SawGold), new Object[] { "ppp", "ssp", "   ", 'p', Blocks.planks, 's', Register.StickGold});
			// Crafting Tables
			AddRecipeShaped(new ItemStack(Blocks.crafting_table), new Object[] { "ll ", "ll ", "   ", 'l', Blocks.log });
			AddRecipeShaped(new ItemStack(Blocks.crafting_table), new Object[] { "ll ", "ll ", "   ", 'l', Blocks.log2 });
		} else
		{
			Logging.logInfo("Not using Saws - modifyWood is disabled!");
		}

		// Other
		AddRecipeShaped(new ItemStack(Blocks.furnace), new Object[] { "csc", "cfc", "cFc", 's', Register.SmeltingCompartment, 'f', Register.FurnaceFrame, 'F', Register.Firebox, 'c', Blocks.cobblestone });
	}

	public static void AddShapelessRecipes()
	{
		if (EnforcedProgression.modifySwords)
		{
			// Sawing - Makeshift
			for (int i = 0; i <= 5; i++)
			{
				if (i < 4)
				{
					AddRecipeShapeless(new ItemStack(Blocks.planks, 1, i), new Object[] { new ItemStack(Register.SawMakeshift, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.log, 1, i) }); // For Oak, Birch, Spruce + Jungle
				} else
				{
					AddRecipeShapeless(new ItemStack(Blocks.planks, 1, i), new Object[] { new ItemStack(Register.SawMakeshift, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.log2, 1, i - 4) }); // For Acacia + DarkOak
				}
			}
			// Sawing - Wood
			for (int i = 0; i <= 5; i++)
			{
				if (i < 4)
				{
					AddRecipeShapeless(new ItemStack(Blocks.planks, 2, i), new Object[] { new ItemStack(Register.SawWood, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.log, 1, i) }); // For Oak, Birch, Spruce + Jungle
				} else
				{
					AddRecipeShapeless(new ItemStack(Blocks.planks, 2, i), new Object[] { new ItemStack(Register.SawWood, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.log2, 1, i - 4) }); // For Acacia + DarkOak
				}
			}
			// Sawing - Stone
			for (int i = 0; i <= 5; i++)
			{
				if (i < 4)
				{
					AddRecipeShapeless(new ItemStack(Blocks.planks, 3, i), new Object[] { new ItemStack(Register.SawStone, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.log, 1, i) }); // For Oak, Birch, Spruce + Jungle
				} else
				{
					AddRecipeShapeless(new ItemStack(Blocks.planks, 3, i), new Object[] { new ItemStack(Register.SawStone, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.log2, 1, i - 4) }); // For Acacia + DarkOak
				}
			}
			// Sawing - Iron
			for (int i = 0; i <= 5; i++)
			{
				if (i < 4)
				{
					AddRecipeShapeless(new ItemStack(Blocks.planks, 4, i), new Object[] { new ItemStack(Register.SawIron, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.log, 1, i) }); // For Oak, Birch, Spruce + Jungle
				} else
				{
					AddRecipeShapeless(new ItemStack(Blocks.planks, 4, i), new Object[] { new ItemStack(Register.SawIron, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.log2, 1, i - 4) }); // For Acacia + DarkOak
				}
			}
			// Sawing - Gold
			for (int i = 0; i <= 5; i++)
			{
				if (i < 4)
				{
					AddRecipeShapeless(new ItemStack(Blocks.planks, 5, i), new Object[] { new ItemStack(Register.SawGold, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.log, 1, i) }); // For Oak, Birch, Spruce + Jungle
				} else
				{
					AddRecipeShapeless(new ItemStack(Blocks.planks, 5, i), new Object[] { new ItemStack(Register.SawGold, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.log2, 1, i - 4) }); // For Acacia + DarkOak
				}
			}
			// Sticks
			AddRecipeShapeless(new ItemStack(Items.stick, 2), new Object[] { new ItemStack(Register.SawMakeshift, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.planks, 1, OreDictionary.WILDCARD_VALUE) });
			AddRecipeShapeless(new ItemStack(Items.stick, 3), new Object[] { new ItemStack(Register.SawWood, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.planks, 1, OreDictionary.WILDCARD_VALUE) });
			AddRecipeShapeless(new ItemStack(Items.stick, 4), new Object[] { new ItemStack(Register.SawStone, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.planks, 1, OreDictionary.WILDCARD_VALUE) });
			AddRecipeShapeless(new ItemStack(Items.stick, 5), new Object[] { new ItemStack(Register.SawIron, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.planks, 1, OreDictionary.WILDCARD_VALUE) });
			AddRecipeShapeless(new ItemStack(Items.stick, 6), new Object[] { new ItemStack(Register.SawGold, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Blocks.planks, 1, OreDictionary.WILDCARD_VALUE) });
		}
	}

	public static void RemoveVanillaRecipes()
	{
		if (EnforcedProgression.modifyPicks)
		{
			RemoveRecipe(new ItemStack(Items.wooden_pickaxe)); // Remove the recipe for a wooden pick
			RemoveRecipe(new ItemStack(Items.stone_pickaxe)); // Remove the recipe for a stone pick
			RemoveRecipe(new ItemStack(Items.iron_pickaxe)); // Remove the recipe for a iron pick
			RemoveRecipe(new ItemStack(Items.golden_pickaxe)); // Remove the recipe for a gold pick
			RemoveRecipe(new ItemStack(Items.diamond_pickaxe)); // Remove the recipe for a diamond pick
		}
		if (EnforcedProgression.modifySwords)
		{
			RemoveRecipe(new ItemStack(Items.wooden_sword)); // Remove the recipe for a wooden sword
			RemoveRecipe(new ItemStack(Items.stone_sword)); // Remove the recipe for a stone sword
			RemoveRecipe(new ItemStack(Items.iron_sword)); // Remove the recipe for a iron sword
			RemoveRecipe(new ItemStack(Items.golden_sword)); // Remove the recipe for a gold sword
			RemoveRecipe(new ItemStack(Items.diamond_sword)); // Remove the recipe for a diamond sword
		}

		RemoveRecipe(new ItemStack(Blocks.furnace)); // Remove the recipe for a furnace
		if (EnforcedProgression.modifySwords)
		{
			RemoveRecipe(new ItemStack(Items.stick, 4)); // Remove the recipe for a furnace
			RemoveRecipe(new ItemStack(Blocks.crafting_table)); // Remove the recipe for a crafting table

			for (int i = 0; i <= 5; i++) // Remove recipe for planks
			{
				RemoveRecipe(new ItemStack(Blocks.planks, 4, i)); // ...z
			}
		}
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
