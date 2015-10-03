package net.whcuk.enforcedprogression.listener;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import net.minecraft.util.ChatComponentText;
import net.whcuk.enforcedprogression.EnforcedProgression;
import net.whcuk.enforcedprogression.utils.Logging;

public class JoinListener
{
	@SubscribeEvent
	public void onLogin(PlayerLoggedInEvent event)
	{
		Logging.logInfo("Player " + event.player.getDisplayName() + " logged in!");
		event.player.addChatComponentMessage(new ChatComponentText("String set to " + EnforcedProgression.TestString));
	}
}
