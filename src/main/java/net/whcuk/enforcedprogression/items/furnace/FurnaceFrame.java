package net.whcuk.enforcedprogression.items.furnace;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.whcuk.enforcedprogression.EnforcedProgression;
import net.whcuk.enforcedprogression.utils.Utils;

public class FurnaceFrame extends Item
{

	public FurnaceFrame()
	{
		setUnlocalizedName(Utils.MODID + ".item9");
		setTextureName(Utils.MODID + ":item9");
		setCreativeTab(EnforcedProgression.tabEnforcedProgression);
	}

}
