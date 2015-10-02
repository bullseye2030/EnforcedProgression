package net.whcuk.enforcedprogression.items.swords;

import net.minecraft.item.Item;
import net.whcuk.enforcedprogression.EnforcedProgression;
import net.whcuk.enforcedprogression.utils.Utils;

public class SwordBladeIron extends Item
{
	public SwordBladeIron()
	{
		setUnlocalizedName(Utils.MODID + ".item13");
		setTextureName(Utils.MODID + ":item13");
		setCreativeTab(EnforcedProgression.tabEnforcedProgression);
	}
}
