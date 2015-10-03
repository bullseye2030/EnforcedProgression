package net.whcuk.enforcedprogression;

import java.io.File;

import cpw.mods.fml.common.FMLCommonHandler;
// Forge Imports
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
// My Imports
import net.whcuk.enforcedprogression.utils.Utils;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.whcuk.enforcedprogression.items.Register;
import net.whcuk.enforcedprogression.listener.JoinListener;
import net.whcuk.enforcedprogression.recipes.RecipeHandler;
import net.whcuk.enforcedprogression.utils.Logging;

@Mod(modid = Utils.MODID, version = Utils.VERSION, name = Utils.NAME)
public class EnforcedProgression
{
	String ConfigDir;
	public static Boolean modifyPicks;
	public static Boolean modifySwords;

	@EventHandler
	public void preinit(FMLPreInitializationEvent event)
	{
		ConfigDir = event.getModConfigurationDirectory() + "/" + Utils.MODID; //My Mod's Config Directory
		Logging.logInfo("Begin Loading...");
		
		//Begin Config
		Configuration featuresConfig = new Configuration(new File(ConfigDir , "features.cfg")); //
		featuresConfig.load();
		
		modifyPicks = featuresConfig.getBoolean("modifyPicks", "Features", true, "Set to false to disable modified pickaxes");
		modifySwords = featuresConfig.getBoolean("modifySwords", "Features", true, "Set to false to disable modified swords");
		//TODO: More Config Stuff
		
		featuresConfig.save();
		//End Config Stuff
		Register.doCreateItems();
		Logging.logInfo("Finished Stage 1 Loading...");
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		Logging.logInfo("Entering Main Loading Sequence");
		RecipeHandler.RemoveVanillaRecipes(); //Remove Certain Vanilla Recipes
		//Event Listening Below
		MinecraftForge.EVENT_BUS.register(new JoinListener());
		FMLCommonHandler.instance().bus().register(new JoinListener());
		//End Event Listening
		RecipeHandler.AddShapedRecipes(); //Add my Shaped Recipes
		RecipeHandler.AddShapelessRecipes(); //Add my Shapeless Recipes
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

}
