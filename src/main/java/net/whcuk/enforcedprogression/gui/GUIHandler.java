package net.whcuk.enforcedprogression.gui;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.whcuk.enforcedprogression.container.ContainerTestGUI;
import net.whcuk.enforcedprogression.tileentity.TileEntityTestGUI;

public class GUIHandler implements IGuiHandler
{
	// returns an instance of the Container you made earlier
	@Override
	public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
	{
		TileEntity tileEntity = world.getTileEntity(x, y, z);
		if (tileEntity instanceof TileEntityTestGUI)
		{
			return new ContainerTestGUI(player.inventory, (TileEntityTestGUI) tileEntity);
		}
		return null;
	}

	// returns an instance of the Gui you made earlier
	@Override
	public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
	{
		TileEntity tileEntity = world.getTileEntity(x, y, z);
		if (tileEntity instanceof TileEntityTestGUI)
		{
			return new TestGUI(player.inventory, (TileEntityTestGUI) tileEntity);
		}
		return null;

	}
}
