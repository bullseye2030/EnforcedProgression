package net.whcuk.enforcedprogression.items.pickaxe;

import net.minecraft.item.Item;
import net.whcuk.enforcedprogression.EnforcedProgression;
import net.whcuk.enforcedprogression.utils.Utils;

public class PickaxeHeadWood extends Item
{
	public PickaxeHeadWood()
	{
		setUnlocalizedName(Utils.MODID + ".item2");
		setTextureName(Utils.MODID + ":item2");
		setCreativeTab(EnforcedProgression.tabEnforcedProgression);
	}
}
