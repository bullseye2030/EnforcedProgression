package net.whcuk.enforcedprogression.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.whcuk.enforcedprogression.items.furnace.*;
import net.whcuk.enforcedprogression.items.pickaxe.PickaxeHeadDiamond;
import net.whcuk.enforcedprogression.items.pickaxe.PickaxeHeadGold;
import net.whcuk.enforcedprogression.items.pickaxe.PickaxeHeadIron;
import net.whcuk.enforcedprogression.items.pickaxe.PickaxeHeadStone;
import net.whcuk.enforcedprogression.items.pickaxe.PickaxeHeadWood;

public class Register
{

	public static Item ToolHandle;
	public static Item PickaxeHeadWood;
	public static Item PickaxeHeadStone;
	public static Item PickaxeHeadIron;
	public static Item PickaxeHeadGold;
	public static Item PickaxeHeadDiamond;
	public static Item ToolHandleReinforced;
	public static Item Firebox;
	public static Item FurnaceFrame;
	public static Item SmeltingCompartment;

	public static void doCreateItems()
	{
		ToolHandle = new ToolHandle();
		PickaxeHeadWood = new PickaxeHeadWood();
		PickaxeHeadStone = new PickaxeHeadStone();
		PickaxeHeadIron = new PickaxeHeadIron();
		PickaxeHeadGold = new PickaxeHeadGold();
		PickaxeHeadDiamond = new PickaxeHeadDiamond();
		ToolHandleReinforced = new ToolHandleReinforced();
		Firebox = new FireBox();
		FurnaceFrame = new FurnaceFrame();
		SmeltingCompartment = new SmeltingCompartment();
		
		GameRegistry.registerItem(ToolHandle, "item1");
		GameRegistry.registerItem(PickaxeHeadWood, "item2");
		GameRegistry.registerItem(PickaxeHeadStone, "item3");
		GameRegistry.registerItem(PickaxeHeadIron, "item4");
		GameRegistry.registerItem(PickaxeHeadGold, "item5");
		GameRegistry.registerItem(PickaxeHeadDiamond, "item6");
		GameRegistry.registerItem(ToolHandleReinforced, "item7");
		GameRegistry.registerItem(Firebox, "item8");
		GameRegistry.registerItem(FurnaceFrame, "item9");
		GameRegistry.registerItem(SmeltingCompartment, "item10");
	}
}