package net.whcuk.enforcedprogression.items.pickaxe;

import net.minecraft.item.Item;
import net.whcuk.enforcedprogression.EnforcedProgression;
import net.whcuk.enforcedprogression.utils.Utils;

public class PickaxeHeadStone extends Item
{
	public PickaxeHeadStone()
	{
		setUnlocalizedName(Utils.MODID + ".item3");
		setTextureName(Utils.MODID + ":item3");
		setCreativeTab(EnforcedProgression.tabEnforcedProgression);
	}
}
