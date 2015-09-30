package net.whcuk.enforcedprogression.utils;

import cpw.mods.fml.common.FMLLog;
import org.apache.logging.log4j.Level;

public class Logging
{
	public static void logInfo(String message)
	{
		FMLLog.getLogger().log(Level.INFO, "[EnforcedProgresson] " + message);
	}
	public static void logWarning(String message)
	{
		FMLLog.getLogger().log(Level.WARN, "[EnforcedProgresson] " + message);
	}
	public static void logErr(String message)
	{
		FMLLog.getLogger().log(Level.ERROR, "[EnforcedProgresson] " + message);
	}
	public static void logCrash(String message)
	{
		FMLLog.getLogger().log(Level.FATAL, "[EnforcedProgresson] " + message);
	}
	public static void logDebug(String message)
	{
		FMLLog.getLogger().log(Level.DEBUG, "[EnforcedProgresson] " + message);
	}
}
