package net.whcuk.enforcedprogression.items.saw;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.whcuk.enforcedprogression.EnforcedProgression;
import net.whcuk.enforcedprogression.utils.Utils;

public class Stone extends Item
{
	public Stone()
	{
		super();
		setUnlocalizedName(Utils.MODID + ".item18");
		setTextureName(Utils.MODID + ":item18");
		setCreativeTab(EnforcedProgression.tabEnforcedProgression);
		maxStackSize = 1; //Sets the max stack size
		setMaxDamage(60 - 1); //Sets the Damage this can take
		setNoRepair(); //Disable Repairing
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
        ItemStack stack = itemStack.copy(); //Duplicate the Item

        stack.setItemDamage(stack.getItemDamage() + 1); //Increase its damage by one
        stack.stackSize = 1; //Reset the stack size as a precaution

        return stack; //Return the modified stack
    }

}
