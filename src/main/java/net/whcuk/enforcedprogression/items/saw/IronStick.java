package net.whcuk.enforcedprogression.items.saw;

import net.minecraft.item.Item;
import net.whcuk.enforcedprogression.EnforcedProgression;
import net.whcuk.enforcedprogression.utils.Utils;

public class IronStick extends Item
{
	public IronStick()
	{
		setUnlocalizedName(Utils.MODID + ".item21");
		setTextureName(Utils.MODID + ":item21");
		setCreativeTab(EnforcedProgression.tabEnforcedProgression);
	}
}
