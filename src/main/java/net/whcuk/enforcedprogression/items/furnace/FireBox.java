package net.whcuk.enforcedprogression.items.furnace;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.whcuk.enforcedprogression.EnforcedProgression;
import net.whcuk.enforcedprogression.utils.Utils;

public class FireBox extends Item
{

	public FireBox()
	{
		setUnlocalizedName(Utils.MODID + ".item8");
		setTextureName(Utils.MODID + ":item8");
		setCreativeTab(EnforcedProgression.tabEnforcedProgression);
	}

}
