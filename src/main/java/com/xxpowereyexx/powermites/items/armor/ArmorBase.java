package com.xxpowereyexx.powermites.items.armor;

import com.xxpowereyexx.powermites.Main;
import com.xxpowereyexx.powermites.init.ModItems;
import com.xxpowereyexx.powermites.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

public class ArmorBase extends ItemArmor implements IHasModel
{

	public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
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
	public void onArmorTick(World world, EntityPlayer player, ItemStack stack)
	{
		if(player.inventory.armorItemInSlot(3).getItem()==ModItems.POWER_HELMET&&
				player.inventory.armorItemInSlot(2).getItem()==ModItems.POWER_CHESTPLATE&&
				player.inventory.armorItemInSlot(1).getItem()==ModItems.POWER_LEGGINGS&&
				player.inventory.armorItemInSlot(0).getItem()==ModItems.POWER_BOOTS)
		{
			 //public PotionEffect(potionIn, duration, amplifier, ambientIn, showParticlesIn)
			player.addPotionEffect(new PotionEffect(Potion.getPotionById(16),220, 0, false, false));//night vision
			player.addPotionEffect(new PotionEffect(Potion.getPotionById(10),220, 1, false, false));//regen
			player.addPotionEffect(new PotionEffect(Potion.getPotionById(22),220, 2, false, false));//absorption
		}
			
		
	}
	
	 

}
