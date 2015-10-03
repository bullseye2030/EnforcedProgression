package net.whcuk.enforcedprogression.items.saw;

import net.minecraft.item.Item;
import net.whcuk.enforcedprogression.EnforcedProgression;
import net.whcuk.enforcedprogression.utils.Utils;

public class DiamondStick extends Item
{
	public DiamondStick()
	{
		setUnlocalizedName(Utils.MODID + ".item25");
		setTextureName(Utils.MODID + ":item25");
		setCreativeTab(EnforcedProgression.tabEnforcedProgression);
	}
}
