package com.evematteo.extrashears.init;

import java.util.ArrayList;
import java.util.List;

import com.evematteo.extrashears.items.tools.ToolShears;

import net.minecraft.item.Item;
import net.minecraft.item.ItemShears;

public class ItemsInit {
	public static final List<Item> ITEMS = new ArrayList<Item>();

	public static final ItemShears WOODEN_SHEARS = new ToolShears("wooden_shears", 59);
	public static final ItemShears STONE_SHEARS = new ToolShears("stone_shears", 131);
	public static final ItemShears DIAMOND_SHEARS = new ToolShears("diamond_shears", 1561);
	public static final ItemShears GOLDEN_SHEARS = new ToolShears("golden_shears", 258);
}
