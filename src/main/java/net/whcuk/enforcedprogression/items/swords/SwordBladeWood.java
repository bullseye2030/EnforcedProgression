package net.whcuk.enforcedprogression.items.swords;

import net.minecraft.item.Item;
import net.whcuk.enforcedprogression.EnforcedProgression;
import net.whcuk.enforcedprogression.utils.Utils;

public class SwordBladeWood extends Item
{
	public SwordBladeWood()
	{
		setUnlocalizedName(Utils.MODID + ".item15");
		setTextureName(Utils.MODID + ":item15");
		setCreativeTab(EnforcedProgression.tabEnforcedProgression);
	}
}
