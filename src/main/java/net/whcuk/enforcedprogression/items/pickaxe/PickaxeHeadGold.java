package net.whcuk.enforcedprogression.items.pickaxe;

import net.minecraft.item.Item;
import net.whcuk.enforcedprogression.EnforcedProgression;
import net.whcuk.enforcedprogression.utils.Utils;

public class PickaxeHeadGold extends Item
{
	public PickaxeHeadGold()
	{
		setUnlocalizedName(Utils.MODID + ".item5");
		setTextureName(Utils.MODID + ":item5");
		setCreativeTab(EnforcedProgression.tabEnforcedProgression);
	}
}
