package net.whcuk.enforcedprogression.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.whcuk.enforcedprogression.EnforcedProgression;
import net.whcuk.enforcedprogression.utils.Utils;

public class ToolHandle extends Item
{

	public ToolHandle()
	{
		setUnlocalizedName(Utils.MODID + ".item1");
		setTextureName(Utils.MODID + ":item1");
		setCreativeTab(EnforcedProgression.tabEnforcedProgression);
	}

}
