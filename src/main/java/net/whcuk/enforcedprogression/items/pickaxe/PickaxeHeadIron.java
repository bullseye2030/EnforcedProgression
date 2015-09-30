package net.whcuk.enforcedprogression.items.pickaxe;

import net.minecraft.item.Item;
import net.whcuk.enforcedprogression.EnforcedProgression;
import net.whcuk.enforcedprogression.utils.Utils;

public class PickaxeHeadIron extends Item
{
	public PickaxeHeadIron()
	{
		setUnlocalizedName(Utils.MODID + ".item4");
		setTextureName(Utils.MODID + ":item4");
		setCreativeTab(EnforcedProgression.tabEnforcedProgression);
	}
}
