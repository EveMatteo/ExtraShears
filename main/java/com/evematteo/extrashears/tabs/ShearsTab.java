package com.evematteo.extrashears.tabs;

import com.evematteo.extrashears.init.ItemsInit;

import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ShearsTab extends CreativeTabs {
	public ShearsTab(String label) {
		super("shearstab");
	}
	
	public ItemStack getTabIconItem() { return new ItemStack(ItemsInit.GOLDEN_SHEARS);}
}
