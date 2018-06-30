package com.xxpowereyexx.powermites.items.tools;

import com.xxpowereyexx.powermites.Main;
import com.xxpowereyexx.powermites.init.ModItems;
import com.xxpowereyexx.powermites.util.IHasModel;

import net.minecraft.client.Minecraft;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;

public class ToolSword extends ItemSword implements IHasModel
{
	public ToolSword(String name, ToolMaterial material)
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
		stack.addEnchantment(Enchantment.getEnchantmentByID(34), 4);//unbreaking
		stack.addEnchantment(Enchantment.getEnchantmentByID(16),10);//sharpness
		stack.addEnchantment(Enchantment.getEnchantmentByID(21),4);//looting
	}

}
