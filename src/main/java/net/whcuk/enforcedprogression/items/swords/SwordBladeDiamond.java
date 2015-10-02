package net.whcuk.enforcedprogression.items.swords;

import net.minecraft.item.Item;
import net.whcuk.enforcedprogression.EnforcedProgression;
import net.whcuk.enforcedprogression.utils.Utils;

public class SwordBladeDiamond extends Item
{
	public SwordBladeDiamond()
	{
		setUnlocalizedName(Utils.MODID + ".item11");
		setTextureName(Utils.MODID + ":item11"");
		setCreativeTab(EnforcedProgression.tabEnforcedProgression);
	}
}
