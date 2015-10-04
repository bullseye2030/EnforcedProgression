package net.whcuk.enforcedprogression;

import java.io.File;

import cpw.mods.fml.common.FMLCommonHandler;
// Forge Imports
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.whcuk.enforcedprogression.gui.GUIHandler;
import net.whcuk.enforcedprogression.items.Register;
import net.whcuk.enforcedprogression.listener.JoinListener;
import net.whcuk.enforcedprogression.recipes.RecipeHandler;
import net.whcuk.enforcedprogression.tileentity.TileEntitySawmill;
import net.whcuk.enforcedprogression.utils.Logging;
// My Imports
import net.whcuk.enforcedprogression.utils.Utils;

@Mod(modid = Utils.MODID, version = Utils.VERSION, name = Utils.NAME)
public class EnforcedProgression
{
	String ConfigDir;
	public static Boolean modifyPicks;
	public static Boolean modifySwords;
	public static Boolean modifyWood;

	@EventHandler
	public void preinit(FMLPreInitializationEvent event)
	{
		ConfigDir = event.getModConfigurationDirectory() + "/" + Utils.MODID; // My Mod's Config Directory
		Logging.logInfo("Begin Loading...");

		// Begin Config
		Configuration featuresConfig = new Configuration(new File(ConfigDir, "features.cfg")); //
		featuresConfig.load();

		modifyPicks = featuresConfig.getBoolean("modifyPicks", "Features", true, "Set to false to disable modified pickaxes");
		modifySwords = featuresConfig.getBoolean("modifySwords", "Features", true, "Set to false to disable modified swords");
		modifyWood = featuresConfig.getBoolean("modifyWood", "Features", true, "Set to false to disable modifying wooden blocks");
		// TODO: More Config Stuff

		featuresConfig.save();
		// End Config Stuff
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GUIHandler());
		Register.doCreateItems();
		Logging.logInfo("Finished Stage 1 Loading...");
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		Logging.logInfo("Entering Main Loading Sequence");
		RecipeHandler.RemoveVanillaRecipes(); // Remove Certain Vanilla Recipes
		// Event Listening Below
		MinecraftForge.EVENT_BUS.register(new JoinListener());
		FMLCommonHandler.instance().bus().register(new JoinListener());
		// End Event Listening
		RecipeHandler.AddShapedRecipes(); // Add my Shaped Recipes
		RecipeHandler.AddShapelessRecipes(); // Add my Shapeless Recipes
		RecipeHandler.AddSawmillRecipes(); // Add my Sawmill Recipes

		GameRegistry.registerTileEntity(TileEntitySawmill.class, "TestGUI");
		Logging.logInfo("Finished Main Loading Sequence");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		Logging.logInfo("Beginning Final Loading Sequence...");
		// Stuff
		Logging.logInfo("Finished Loading...");
	}

	public static CreativeTabs tabEnforcedProgression = new CreativeTabs("ep")//Create a tab in the creative menu

	{
		@Override
		@SideOnly(Side.CLIENT) // Only run on the client
		public Item getTabIconItem() // Called to register the icon on the creative tab
		{
			return Register.PickaxeHeadDiamond; // Tell it to use a diamond pickaxe head.
		}
	};
	@Instance(Utils.MODID) // A thing.
	public static EnforcedProgression instance; // Junk

	public void saveData()
	{ // Called to save data

	}

}
