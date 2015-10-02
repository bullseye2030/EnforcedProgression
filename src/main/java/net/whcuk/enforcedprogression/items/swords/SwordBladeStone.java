package net.whcuk.enforcedprogression.items.swords;

import net.minecraft.item.Item;
import net.whcuk.enforcedprogression.EnforcedProgression;
import net.whcuk.enforcedprogression.utils.Utils;

public class SwordBladeStone extends Item
{
	public SwordBladeStone()
	{
		setUnlocalizedName(Utils.MODID + ".item14");
		setTextureName(Utils.MODID + ":item14");
		setCreativeTab(EnforcedProgression.tabEnforcedProgression);
	}
}
