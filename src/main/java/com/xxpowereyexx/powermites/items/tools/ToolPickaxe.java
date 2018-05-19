package com.xxpowereyexx.powermites.items.tools;

import com.xxpowereyexx.powermites.Main;
import com.xxpowereyexx.powermites.init.ModItems;
import com.xxpowereyexx.powermites.util.IHasModel;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.world.World;

public class ToolPickaxe extends ItemPickaxe implements IHasModel
{
	public ToolPickaxe(String name, ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.PowerMites);
		
		ModItems.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this,0,"invnetory");
	}
	
@Override
public void onCreated(ItemStack stack, World worldIn, EntityPlayer playerIn) {
	
	stack.addEnchantment(Enchantment.getEnchantmentByID(35), 4);
	stack.addEnchantment(Enchantment.getEnchantmentByID(32),4);

}
	
	
}
