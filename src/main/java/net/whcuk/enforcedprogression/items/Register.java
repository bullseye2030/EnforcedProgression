package net.whcuk.enforcedprogression.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.whcuk.enforcedprogression.items.furnace.*;
import net.whcuk.enforcedprogression.items.pickaxe.*;
import net.whcuk.enforcedprogression.items.saw.*;
import net.whcuk.enforcedprogression.items.swords.*;
import net.whcuk.enforcedprogression.utils.Utils;

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
	public static Item SwordBladeWood;
	public static Item SwordBladeStone;
	public static Item SwordBladeIron;
	public static Item SwordBladeGold;
	public static Item SwordBladeDiamond;
	public static Item SawMakeshift;
	public static Item SawWood;
	

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
		SwordBladeWood = new SwordBladeWood();
		SwordBladeStone = new SwordBladeStone();
		SwordBladeIron = new SwordBladeIron();
		SwordBladeGold = new SwordBladeGold();
		SwordBladeDiamond = new SwordBladeDiamond();
		SawMakeshift= new Makeshift();
		SawWood= new Wood();

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
		GameRegistry.registerItem(SwordBladeWood, "item11");
		GameRegistry.registerItem(SwordBladeStone, "item12");
		GameRegistry.registerItem(SwordBladeIron, "item13");
		GameRegistry.registerItem(SwordBladeGold, "item14");
		GameRegistry.registerItem(SwordBladeDiamond, "item15");
		GameRegistry.registerItem(SawMakeshift, "item16");
		GameRegistry.registerItem(SawWood, "item17");
	}

}