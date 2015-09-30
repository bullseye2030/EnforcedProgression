package net.whcuk.enforcedprogression.items.pickaxe;

import net.minecraft.item.Item;
import net.whcuk.enforcedprogression.EnforcedProgression;
import net.whcuk.enforcedprogression.utils.Utils;

public class PickaxeHeadDiamond extends Item
{
	public PickaxeHeadDiamond()
	{
		setUnlocalizedName(Utils.MODID + ".item6");
		setTextureName(Utils.MODID + ":item6");
		setCreativeTab(EnforcedProgression.tabEnforcedProgression);
	}
}
