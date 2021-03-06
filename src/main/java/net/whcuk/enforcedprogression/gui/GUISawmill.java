package net.whcuk.enforcedprogression.gui;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.whcuk.enforcedprogression.container.ContainerSawmill;
import net.whcuk.enforcedprogression.tileentity.TileEntitySawmill;

public class GUISawmill extends GuiContainer
{

	public GUISawmill(InventoryPlayer inventoryPlayer, TileEntitySawmill tileEntity)
	{
		// the container is instantiated and passed to the superclass for handling
		super(new ContainerSawmill(inventoryPlayer, tileEntity));
	}

	@Override
	public void drawGuiContainerForegroundLayer(int param1, int param2)
	{
		// draw text and stuff here
		// the parameters for drawString are: string, x, y, colour
		Minecraft.getMinecraft().fontRenderer.drawString("Sawmill", 8, 6, 4210752);
		// draws "Inventory" or your regional equivalent
		Minecraft.getMinecraft().fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), 8, ySize - 96 + 2, 4210752);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
	{
		ResourceLocation location = new ResourceLocation("textures/gui/sawmill.png");
		// draw the GUI here, only thing you need to change is the path
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.renderEngine.bindTexture(location);
		int x = (width - xSize) / 2;
		int y = (height - ySize) / 2;
		this.drawTexturedModalRect(x, y, 0, 0, xSize, ySize);
	}

}