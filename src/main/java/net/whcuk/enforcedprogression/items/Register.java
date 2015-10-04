package net.whcuk.enforcedprogression.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.whcuk.enforcedprogression.blocks.TestGui;
import net.whcuk.enforcedprogression.items.furnace.FireBox;
import net.whcuk.enforcedprogression.items.furnace.FurnaceFrame;
import net.whcuk.enforcedprogression.items.furnace.SmeltingCompartment;
import net.whcuk.enforcedprogression.items.pickaxe.PickaxeHeadDiamond;
import net.whcuk.enforcedprogression.items.pickaxe.PickaxeHeadGold;
import net.whcuk.enforcedprogression.items.pickaxe.PickaxeHeadIron;
import net.whcuk.enforcedprogression.items.pickaxe.PickaxeHeadStone;
import net.whcuk.enforcedprogression.items.pickaxe.PickaxeHeadWood;
import net.whcuk.enforcedprogression.items.saw.Diamond;
import net.whcuk.enforcedprogression.items.saw.DiamondStick;
import net.whcuk.enforcedprogression.items.saw.Gold;
import net.whcuk.enforcedprogression.items.saw.GoldStick;
import net.whcuk.enforcedprogression.items.saw.Iron;
import net.whcuk.enforcedprogression.items.saw.IronStick;
import net.whcuk.enforcedprogression.items.saw.Makeshift;
import net.whcuk.enforcedprogression.items.saw.Stone;
import net.whcuk.enforcedprogression.items.saw.StoneStick;
import net.whcuk.enforcedprogression.items.saw.Wood;
import net.whcuk.enforcedprogression.items.swords.SwordBladeDiamond;
import net.whcuk.enforcedprogression.items.swords.SwordBladeGold;
import net.whcuk.enforcedprogression.items.swords.SwordBladeIron;
import net.whcuk.enforcedprogression.items.swords.SwordBladeStone;
import net.whcuk.enforcedprogression.items.swords.SwordBladeWood;

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
	public static Item SawStone;
	public static Item StickStone;
	public static Item SawIron;
	public static Item StickIron;
	public static Item SawGold;
	public static Item StickGold;
	public static Item SawDiamond;
	public static Item StickDiamond;

	public static Block TestGUI;

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
		SawMakeshift = new Makeshift();
		SawWood = new Wood();
		SawStone = new Stone();
		StickStone = new StoneStick();
		SawIron = new Iron();
		StickIron = new IronStick();
		SawGold = new Gold();
		StickGold = new GoldStick();
		SawDiamond = new Diamond();
		StickDiamond = new DiamondStick();

		TestGUI = new TestGui();

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
		GameRegistry.registerItem(SawStone, "item18");
		GameRegistry.registerItem(StickStone, "item19");
		GameRegistry.registerItem(SawIron, "item20");
		GameRegistry.registerItem(StickIron, "item21");
		GameRegistry.registerItem(SawGold, "item22");
		GameRegistry.registerItem(StickGold, "item23");
		GameRegistry.registerItem(SawDiamond, "item24");
		GameRegistry.registerItem(StickDiamond, "item25");

		GameRegistry.registerBlock(TestGUI, "block1");
	}

}