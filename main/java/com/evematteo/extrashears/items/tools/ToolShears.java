package com.evematteo.extrashears.items.tools;

import com.evematteo.extrashears.Main;
import com.evematteo.extrashears.init.ItemsInit;
import com.evematteo.extrashears.util.IHasModel;

import net.minecraft.item.ItemShears;

public class ToolShears extends ItemShears implements IHasModel {
	public ToolShears(String name, int uses)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.shearstab);
		setMaxDamage(uses);
		
		ItemsInit.ITEMS.add(this);
	}
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
}