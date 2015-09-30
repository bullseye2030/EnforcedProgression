package net.whcuk.enforcedprogression.items;

import net.minecraft.item.Item;
import net.whcuk.enforcedprogression.EnforcedProgression;
import net.whcuk.enforcedprogression.utils.Utils;

public class ToolHandleReinforced extends Item
{
	public ToolHandleReinforced()
	{
		setUnlocalizedName(Utils.MODID + ".item7");
		setTextureName(Utils.MODID + ":item7");
		setCreativeTab(EnforcedProgression.tabEnforcedProgression);
	}
}
