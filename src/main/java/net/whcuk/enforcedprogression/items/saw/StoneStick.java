package net.whcuk.enforcedprogression.items.saw;

import net.minecraft.item.Item;
import net.whcuk.enforcedprogression.EnforcedProgression;
import net.whcuk.enforcedprogression.utils.Utils;

public class StoneStick extends Item
{
	public StoneStick()
	{
		setUnlocalizedName(Utils.MODID + ".item19");
		setTextureName(Utils.MODID + ":item19");
		setCreativeTab(EnforcedProgression.tabEnforcedProgression);
	}
}
