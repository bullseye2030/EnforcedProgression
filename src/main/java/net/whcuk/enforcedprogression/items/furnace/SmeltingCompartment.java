package net.whcuk.enforcedprogression.items.furnace;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.whcuk.enforcedprogression.EnforcedProgression;
import net.whcuk.enforcedprogression.utils.Utils;

public class SmeltingCompartment extends Item
{

	public SmeltingCompartment()
	{
		setUnlocalizedName(Utils.MODID + ".item10");
		setTextureName(Utils.MODID + ":item10");
		setCreativeTab(EnforcedProgression.tabEnforcedProgression);
	}

}
