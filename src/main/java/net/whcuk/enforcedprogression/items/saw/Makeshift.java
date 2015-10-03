package net.whcuk.enforcedprogression.items.saw;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.whcuk.enforcedprogression.EnforcedProgression;
import net.whcuk.enforcedprogression.utils.Utils;

public class Makeshift extends Item
{
	public Makeshift()
	{
		super();
		setUnlocalizedName(Utils.MODID + ".item16");
		setTextureName(Utils.MODID + ":item16");
		setCreativeTab(EnforcedProgression.tabEnforcedProgression);
		maxStackSize = 1;
		setMaxDamage(4 - 1);
		setNoRepair();
	}


@Override
    public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemStack)
    {
        return false;
    }

    @Override
    public boolean getShareTag()
    {
        return true;
    }

    public boolean hasContainerItem(ItemStack itemStack)
    {
       return true;
    }
   
    @Override
    public ItemStack getContainerItem(ItemStack itemStack)
    {
        ItemStack stack = itemStack.copy();

        stack.setItemDamage(stack.getItemDamage() + 1);
        stack.stackSize = 1;

        return stack;
    }

}
