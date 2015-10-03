package net.whcuk.enforcedprogression.items.saw;

import net.minecraft.item.Item;
import net.whcuk.enforcedprogression.EnforcedProgression;
import net.whcuk.enforcedprogression.utils.Utils;

public class GoldStick extends Item
{
	public GoldStick()
	{
		setUnlocalizedName(Utils.MODID + ".item23");
		setTextureName(Utils.MODID + ":item23");
		setCreativeTab(EnforcedProgression.tabEnforcedProgression);
	}
}
