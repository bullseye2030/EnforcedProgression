package net.whcuk.enforcedprogression;

// Forge Imports
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
// My Imports
import net.whcuk.enforcedprogression.utils.Utils;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.whcuk.enforcedprogression.items.Register;
import net.whcuk.enforcedprogression.recipes.RecipeHandler;
import net.whcuk.enforcedprogression.utils.Logging;

@Mod(modid = Utils.MODID, version = Utils.VERSION, name = Utils.NAME)
public class EnforcedProgression
{

	@EventHandler
	public void preinit(FMLPreInitializationEvent event)
	{
		Logging.logInfo("Entering PreInit Stage");
		Register.doCreateItems();
		Logging.logInfo("Finished PreInit Stage");
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		Logging.logInfo("Entering Init Stage");
		RecipeHandler.RemoveVanillaRecipes();
		RecipeHandler.AddShapedRecipes();
		Logging.logInfo("Exiting Init Stage");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		Logging.logInfo("Entering PostInit Stage");
		//Stuff
		Logging.logInfo("Exiting PostInit Stage");
	}

	public static CreativeTabs tabEnforcedProgression = new CreativeTabs("ep")//Create a tab in the creative menu
	{
		@Override
		@SideOnly(Side.CLIENT) // Only run on the client
		public Item getTabIconItem() // Called to register the icon on the creative tab
		{
			return Register.ToolHandle; // Tell it to use a pickaxe handle.
		}
	};

}
