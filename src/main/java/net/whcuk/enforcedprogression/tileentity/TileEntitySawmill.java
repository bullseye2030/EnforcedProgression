package net.whcuk.enforcedprogression.tileentity;

import java.util.ArrayList;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;

public class TileEntitySawmill extends TileEntity implements IInventory
{
	private ItemStack[] inv;

	public static ArrayList<ArrayList<ItemStack>> recipeList = new ArrayList<ArrayList<ItemStack>>(); // That's complex, isn't it :D

	public static void addRecipe(ItemStack input, ItemStack output)
	{
		ArrayList<ItemStack> tmpArray = new ArrayList<ItemStack>();
		tmpArray.add(input);
		tmpArray.add(output);
		recipeList.add(tmpArray);
	}

	public TileEntitySawmill()
	{
		inv = new ItemStack[2];
	}

	@Override
	public int getSizeInventory()
	{
		return inv.length;
	}

	@Override
	public ItemStack getStackInSlot(int p_70301_1_)
	{
		return inv[p_70301_1_];
	}

	@Override
	public ItemStack decrStackSize(int slot, int amt)
	{
		System.out.println("Slot=" + String.format("%d", slot));
		ItemStack stack = getStackInSlot(slot);
		if (stack != null)
		{
			if (stack.stackSize <= amt)
			{
				setInventorySlotContents(slot, null);
			} else
			{
				stack = stack.splitStack(amt);
				if (stack.stackSize == 0)
				{
					setInventorySlotContents(slot, null);
				}
			}
		}
		return stack;
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int slot)
	{
		ItemStack stack = getStackInSlot(slot);
		if (stack != null)
		{
			setInventorySlotContents(slot, null);
		}
		return stack;
	}

	@Override
	public void setInventorySlotContents(int slot, ItemStack stack)
	{
		inv[slot] = stack;
		if (stack != null && stack.stackSize > getInventoryStackLimit())
		{
			stack.stackSize = getInventoryStackLimit();
		}

	}

	@Override
	public String getInventoryName()
	{
		return "EF.TileEntityTestGUI";
	}

	@Override
	public boolean hasCustomInventoryName()
	{
		return true;
	}

	@Override
	public int getInventoryStackLimit()
	{
		return 64;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer player)
	{
		return worldObj.getTileEntity(xCoord, yCoord, zCoord) == this && player.getDistanceSq(xCoord + 0.5, yCoord + 0.5, zCoord + 0.5) < 64;
	}

	@Override
	public void openInventory()
	{
		// Do Nothing
	}

	@Override
	public void closeInventory()
	{
		// Do Nothing
	}

	@Override
	public boolean isItemValidForSlot(int p_94041_1_, ItemStack p_94041_2_)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Packet getDescriptionPacket()
	{
		NBTTagCompound nbtTag = new NBTTagCompound();
		this.writeToNBT(nbtTag);
		return new S35PacketUpdateTileEntity(this.xCoord, this.yCoord, this.zCoord, 1, nbtTag);
	}

	@Override
	public void readFromNBT(NBTTagCompound tagCompound)
	{
		super.readFromNBT(tagCompound);

		NBTTagList tagList = tagCompound.getTagList("Inventory", 1);
		for (int i = 0; i < tagList.tagCount(); i++)
		{
			NBTTagCompound tag = tagList.getCompoundTagAt(i);
			byte slot = tag.getByte("Slot");
			if (slot >= 0 && slot < inv.length)
			{
				inv[slot] = ItemStack.loadItemStackFromNBT(tag);
			}
		}
	}

	@Override
	public void writeToNBT(NBTTagCompound tagCompound)
	{
		super.writeToNBT(tagCompound);

		NBTTagList itemList = new NBTTagList();
		for (int i = 0; i < inv.length; i++)
		{
			ItemStack stack = inv[i];
			if (stack != null)
			{
				NBTTagCompound tag = new NBTTagCompound();
				tag.setByte("Slot", (byte) i);
				stack.writeToNBT(tag);
				itemList.appendTag(tag);
			}
		}
		tagCompound.setTag("Inventory", itemList);
	}

	@Override
	public void updateEntity()
	{
		// Called once per tick (20 times/sec)

		// TODO: *Arrow Rendering Code*?

		for (int i = 0; i < recipeList.size(); i++)
		{
			ArrayList<ItemStack> tmpArray = recipeList.get(i);
			IInventory inventory = this;
			// if (!(inventory.getStackInSlot(0) == null))
			// {
			// System.out.println("Inventory Slot 1 is " + inventory.getStackInSlot(1).getDisplayName());
			// } else
			// {
			// System.out.println("Inventory Slot 1 is nothing");
			// }
			//System.out.println(inventory.getStackInSlot(0));
			if (inventory.getStackInSlot(0).areItemStacksEqual(tmpArray.get(0)) && inventory.getStackInSlot(1) == null)
			{
				if ((inventory.getStackInSlot(0).stackSize * tmpArray.get(1).stackSize) < 65)
				{
					ItemStack output = new ItemStack(tmpArray.get(1),tmpArray.get(1).stackSize*inventory.getStackInSlot(0).stackSize,tmpArray.get(1).getDamageValue())
					inventory.setInventorySlotContents(1, output);
					inventory.setInventorySlotContents(0, null); //TODO: Fix :D
				}
				
				
			}
		}

	}

}
