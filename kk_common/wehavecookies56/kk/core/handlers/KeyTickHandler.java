package wehavecookies56.kk.core.handlers;

import java.util.EnumSet;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import wehavecookies56.kk.entities.tileentities.TileEntitySynthesis;
import wehavecookies56.kk.item.AddedItems;
import wehavecookies56.kk.lib.UsefulArrays;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class KeyTickHandler implements ITickHandler {
	
	public static float counter = 0.0F;
	
	public void onPlayerTick(EntityPlayer player){
		EntityPlayerMP thePlayer = (EntityPlayerMP)player;
		counter+= 0.1;
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[1] && counter > 0.5F && KeyPressed1 == false)
		{
			KeyPressed1 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[1] && counter > 0.5F && KeyPressed1c == false)
		{
			KeyPressed1c = true;
		}
		
		if (KeyPressed1 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed1c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[2] && counter > 0.5F && KeyPressed2 == false)
		{
			KeyPressed2 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[2] && counter > 0.5F && KeyPressed2c == false)
		{
			KeyPressed2c = true;
		}
		
		if (KeyPressed2 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed2c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[3] && counter > 0.5F && KeyPressed3 == false)
		{
			KeyPressed3 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[3] && counter > 0.5F && KeyPressed3c == false)
		{
			KeyPressed3c = true;
		}
		
		if (KeyPressed3 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed3c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[4] && counter > 0.5F && KeyPressed4 == false)
		{
			KeyPressed4 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[4] && counter > 0.5F && KeyPressed4c == false)
		{
			KeyPressed4c = true;
		}
		
		if (KeyPressed4 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed4c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[5] && counter > 0.5F && KeyPressed5 == false)
		{
			KeyPressed5 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[5] && counter > 0.5F && KeyPressed5c == false)
		{
			KeyPressed5c = true;
		}
		
		if (KeyPressed5 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed5c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[6] && counter > 0.5F && KeyPressed6 == false)
		{
			KeyPressed6 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[6] && counter > 0.5F && KeyPressed6c == false)
		{
			KeyPressed6c = true;
		}
		
		if (KeyPressed6 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed6c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[7] && counter > 0.5F && KeyPressed7 == false)
		{
			KeyPressed7 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[7] && counter > 0.5F && KeyPressed7c == false)
		{
			KeyPressed7c = true;
		}
		
		if (KeyPressed7 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed7c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[8] && counter > 0.5F && KeyPressed8 == false)
		{
			KeyPressed8 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[8] && counter > 0.5F && KeyPressed8c == false)
		{
			KeyPressed8c = true;
		}
		
		if (KeyPressed8 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed8c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[9] && counter > 0.5F && KeyPressed9 == false)
		{
			KeyPressed9 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[9] && counter > 0.5F && KeyPressed9c == false)
		{
			KeyPressed9c = true;
		}
		
		if (KeyPressed9 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed9c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[10] && counter > 0.5F && KeyPressed10 == false)
		{
			KeyPressed10 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[10] && counter > 0.5F && KeyPressed10c == false)
		{
			KeyPressed10c = true;
		}
		
		if (KeyPressed10 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed10c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[11] && counter > 0.5F && KeyPressed11 == false)
		{
			KeyPressed11 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[11] && counter > 0.5F && KeyPressed11c == false)
		{
			KeyPressed11c = true;
		}
		
		if (KeyPressed11 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed11c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[12] && counter > 0.5F && KeyPressed12 == false)
		{
			KeyPressed12 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[12] && counter > 0.5F && KeyPressed12c == false)
		{
			KeyPressed12c = true;
		}
		
		if (KeyPressed12 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed12c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[13] && counter > 0.5F && KeyPressed13 == false)
		{
			KeyPressed13 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[13] && counter > 0.5F && KeyPressed13c == false)
		{
			KeyPressed13c = true;
		}
		
		if (KeyPressed13 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed13c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[14] && counter > 0.5F && KeyPressed14 == false)
		{
			KeyPressed14 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[14] && counter > 0.5F && KeyPressed14c == false)
		{
			KeyPressed14c = true;
		}
		
		if (KeyPressed14 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed14c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[15] && counter > 0.5F && KeyPressed15 == false)
		{
			KeyPressed15 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[15] && counter > 0.5F && KeyPressed15c == false)
		{
			KeyPressed15c = true;
		}
		
		if (KeyPressed15 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed15c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[16] && counter > 0.5F && KeyPressed16 == false)
		{
			KeyPressed16 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[16] && counter > 0.5F && KeyPressed16c == false)
		{
			KeyPressed16c = true;
		}
		
		if (KeyPressed16 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed16c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[17] && counter > 0.5F && KeyPressed17 == false)
		{
			KeyPressed17 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[17] && counter > 0.5F && KeyPressed17c == false)
		{
			KeyPressed17c = true;
		}
		
		if (KeyPressed17 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed17c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[18] && counter > 0.5F && KeyPressed18 == false)
		{
			KeyPressed18 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[18] && counter > 0.5F && KeyPressed18c == false)
		{
			KeyPressed18c = true;
		}
		
		if (KeyPressed18 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed18c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[19] && counter > 0.5F && KeyPressed19 == false)
		{
			KeyPressed19 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[19] && counter > 0.5F && KeyPressed19c == false)
		{
			KeyPressed19c = true;
		}
		
		if (KeyPressed19 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed19c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[20] && counter > 0.5F && KeyPressed20 == false)
		{
			KeyPressed20 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[20] && counter > 0.5F && KeyPressed20c == false)
		{
			KeyPressed20c = true;
		}
		
		if (KeyPressed20 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed20c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[21] && counter > 0.5F && KeyPressed21 == false)
		{
			KeyPressed21 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[21] && counter > 0.5F && KeyPressed21c == false)
		{
			KeyPressed21c = true;
		}
		
		if (KeyPressed21 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed21c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[22] && counter > 0.5F && KeyPressed22 == false)
		{
			KeyPressed22 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[22] && counter > 0.5F && KeyPressed22c == false)
		{
			KeyPressed22c = true;
		}
		
		if (KeyPressed22 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed22c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[23] && counter > 0.5F && KeyPressed23 == false)
		{
			KeyPressed23 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[23] && counter > 0.5F && KeyPressed23c == false)
		{
			KeyPressed23c = true;
		}
		
		if (KeyPressed23 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed23c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[24] && counter > 0.5F && KeyPressed24 == false)
		{
			KeyPressed24 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[24] && counter > 0.5F && KeyPressed24c == false)
		{
			KeyPressed24c = true;
		}
		
		if (KeyPressed24 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed24c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[25] && counter > 0.5F && KeyPressed25 == false)
		{
			KeyPressed25 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[25] && counter > 0.5F && KeyPressed25c == false)
		{
			KeyPressed25c = true;
		}
		
		if (KeyPressed25 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed25c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[26] && counter > 0.5F && KeyPressed26 == false)
		{
			KeyPressed26 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[26] && counter > 0.5F && KeyPressed26c == false)
		{
			KeyPressed26c = true;
		}
		
		if (KeyPressed26 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed26c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[27] && counter > 0.5F && KeyPressed27 == false)
		{
			KeyPressed27 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[27] && counter > 0.5F && KeyPressed27c == false)
		{
			KeyPressed27c = true;
		}
		
		if (KeyPressed27 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed27c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[28] && counter > 0.5F && KeyPressed28 == false)
		{
			KeyPressed28 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[28] && counter > 0.5F && KeyPressed28c == false)
		{
			KeyPressed28c = true;
		}
		
		if (KeyPressed28 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed28c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[29] && counter > 0.5F && KeyPressed29 == false)
		{
			KeyPressed29 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[29] && counter > 0.5F && KeyPressed29c == false)
		{
			KeyPressed29c = true;
		}
		
		if (KeyPressed29 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed29c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[30] && counter > 0.5F && KeyPressed30 == false)
		{
			KeyPressed30 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[30] && counter > 0.5F && KeyPressed30c == false)
		{
			KeyPressed30c = true;
		}
		
		if (KeyPressed30 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed30c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[31] && counter > 0.5F && KeyPressed31 == false)
		{
			KeyPressed31 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[31] && counter > 0.5F && KeyPressed31c == false)
		{
			KeyPressed31c = true;
		}
		
		if (KeyPressed31 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed31c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[32] && counter > 0.5F && KeyPressed32 == false)
		{
			KeyPressed32 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[32] && counter > 0.5F && KeyPressed32c == false)
		{
			KeyPressed32c = true;
		}
		
		if (KeyPressed32 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed32c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[33] && counter > 0.5F && KeyPressed33 == false)
		{
			KeyPressed33 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[33] && counter > 0.5F && KeyPressed33c == false)
		{
			KeyPressed33c = true;
		}
		
		if (KeyPressed33 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed33c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[34] && counter > 0.5F && KeyPressed34 == false)
		{
			KeyPressed34 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[34] && counter > 0.5F && KeyPressed34c == false)
		{
			KeyPressed34c = true;
		}
		
		if (KeyPressed34 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed34c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[35] && counter > 0.5F && KeyPressed35 == false)
		{
			KeyPressed35 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[35] && counter > 0.5F && KeyPressed35c == false)
		{
			KeyPressed35c = true;
		}
		
		if (KeyPressed35 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed35c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[36] && counter > 0.5F && KeyPressed36 == false)
		{
			KeyPressed36 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[36] && counter > 0.5F && KeyPressed36c == false)
		{
			KeyPressed36c = true;
		}
		
		if (KeyPressed36 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed36c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[37] && counter > 0.5F && KeyPressed37 == false)
		{
			KeyPressed37 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[37] && counter > 0.5F && KeyPressed37c == false)
		{
			KeyPressed37c = true;
		}
		
		if (KeyPressed37 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed37c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[38] && counter > 0.5F && KeyPressed38 == false)
		{
			KeyPressed38 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[38] && counter > 0.5F && KeyPressed38c == false)
		{
			KeyPressed38c = true;
		}
		
		if (KeyPressed38 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed38c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[39] && counter > 0.5F && KeyPressed39 == false)
		{
			KeyPressed39 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[39] && counter > 0.5F && KeyPressed39c == false)
		{
			KeyPressed39c = true;
		}
		
		if (KeyPressed39 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed39c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[40] && counter > 0.5F && KeyPressed40 == false)
		{
			KeyPressed40 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[40] && counter > 0.5F && KeyPressed40c == false)
		{
			KeyPressed40c = true;
		}
		
		if (KeyPressed40 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed40c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[41] && counter > 0.5F && KeyPressed41 == false)
		{
			KeyPressed41 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[41] && counter > 0.5F && KeyPressed41c == false)
		{
			KeyPressed41c = true;
		}
		
		if (KeyPressed41 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed41c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[42] && counter > 0.5F && KeyPressed42 == false)
		{
			KeyPressed42 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[42] && counter > 0.5F && KeyPressed42c == false)
		{
			KeyPressed42c = true;
		}
		
		if (KeyPressed42 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed42c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[43] && counter > 0.5F && KeyPressed43 == false)
		{
			KeyPressed43 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[43] && counter > 0.5F && KeyPressed43c == false)
		{
			KeyPressed43c = true;
		}
		
		if (KeyPressed43 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed43c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[44] && counter > 0.5F && KeyPressed44 == false)
		{
			KeyPressed44 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[44] && counter > 0.5F && KeyPressed44c == false)
		{
			KeyPressed44c = true;
		}
		
		if (KeyPressed44 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed44c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[45] && counter > 0.5F && KeyPressed45 == false)
		{
			KeyPressed45 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[45] && counter > 0.5F && KeyPressed45c == false)
		{
			KeyPressed45c = true;
		}
		
		if (KeyPressed45 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed45c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[46] && counter > 0.5F && KeyPressed46 == false)
		{
			KeyPressed46 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[46] && counter > 0.5F && KeyPressed46c == false)
		{
			KeyPressed46c = true;
		}
		
		if (KeyPressed46 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed46c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[47] && counter > 0.5F && KeyPressed47 == false)
		{
			KeyPressed47 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[47] && counter > 0.5F && KeyPressed47c == false)
		{
			KeyPressed47c = true;
		}
		
		if (KeyPressed47 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed47c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[48] && counter > 0.5F && KeyPressed48 == false)
		{
			KeyPressed48 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[48] && counter > 0.5F && KeyPressed48c == false)
		{
			KeyPressed48c = true;
		}
		
		if (KeyPressed48 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed48c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[49] && counter > 0.5F && KeyPressed49 == false)
		{
			KeyPressed49 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[49] && counter > 0.5F && KeyPressed49c == false)
		{
			KeyPressed49c = true;
		}
		
		if (KeyPressed49 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed49c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[50] && counter > 0.5F && KeyPressed50 == false)
		{
			KeyPressed50 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[50] && counter > 0.5F && KeyPressed50c == false)
		{
			KeyPressed50c = true;
		}
		
		if (KeyPressed50 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed50c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[51] && counter > 0.5F && KeyPressed51 == false)
		{
			KeyPressed51 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[51] && counter > 0.5F && KeyPressed51c == false)
		{
			KeyPressed51c = true;
		}
		
		if (KeyPressed51 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed51c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[52] && counter > 0.5F && KeyPressed52 == false)
		{
			KeyPressed52 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[52] && counter > 0.5F && KeyPressed52c == false)
		{
			KeyPressed52c = true;
		}
		
		if (KeyPressed52 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed52c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[53] && counter > 0.5F && KeyPressed53 == false)
		{
			KeyPressed53 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[53] && counter > 0.5F && KeyPressed53c == false)
		{
			KeyPressed53c = true;
		}
		
		if (KeyPressed53 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed53c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[54] && counter > 0.5F && KeyPressed54 == false)
		{
			KeyPressed54 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[54] && counter > 0.5F && KeyPressed54c == false)
		{
			KeyPressed54c = true;
		}
		
		if (KeyPressed54 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed54c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[55] && counter > 0.5F && KeyPressed55 == false)
		{
			KeyPressed55 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[55] && counter > 0.5F && KeyPressed55c == false)
		{
			KeyPressed55c = true;
		}
		
		if (KeyPressed55 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed55c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[56] && counter > 0.5F && KeyPressed56 == false)
		{
			KeyPressed56 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[56] && counter > 0.5F && KeyPressed56c == false)
		{
			KeyPressed56c = true;
		}
		
		if (KeyPressed56 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed56c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[57] && counter > 0.5F && KeyPressed57 == false)
		{
			KeyPressed57 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[57] && counter > 0.5F && KeyPressed57c == false)
		{
			KeyPressed57c = true;
		}
		
		if (KeyPressed57 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed57c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[58] && counter > 0.5F && KeyPressed58 == false)
		{
			KeyPressed58 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[58] && counter > 0.5F && KeyPressed58c == false)
		{
			KeyPressed58c = true;
		}
		
		if (KeyPressed58 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed58c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[59] && counter > 0.5F && KeyPressed59 == false)
		{
			KeyPressed59 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[59] && counter > 0.5F && KeyPressed59c == false)
		{
			KeyPressed59c = true;
		}
		
		if (KeyPressed59 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed59c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[60] && counter > 0.5F && KeyPressed60 == false)
		{
			KeyPressed60 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[60] && counter > 0.5F && KeyPressed60c == false)
		{
			KeyPressed60c = true;
		}
		
		if (KeyPressed60 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed60c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[61] && counter > 0.5F && KeyPressed61 == false)
		{
			KeyPressed61 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[61] && counter > 0.5F && KeyPressed61c == false)
		{
			KeyPressed61c = true;
		}
		
		if (KeyPressed61 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed61c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[62] && counter > 0.5F && KeyPressed62 == false)
		{
			KeyPressed62 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[62] && counter > 0.5F && KeyPressed62c == false)
		{
			KeyPressed62c = true;
		}
		
		if (KeyPressed62 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed62c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[63] && counter > 0.5F && KeyPressed63 == false)
		{
			KeyPressed63 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[63] && counter > 0.5F && KeyPressed63c == false)
		{
			KeyPressed63c = true;
		}
		
		if (KeyPressed63 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed63c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[64] && counter > 0.5F && KeyPressed64 == false)
		{
			KeyPressed64 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[64] && counter > 0.5F && KeyPressed64c == false)
		{
			KeyPressed64c = true;
		}
		
		if (KeyPressed64 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed64c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[65] && counter > 0.5F && KeyPressed65 == false)
		{
			KeyPressed65 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[65] && counter > 0.5F && KeyPressed65c == false)
		{
			KeyPressed65c = true;
		}
		
		if (KeyPressed65 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed65c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[66] && counter > 0.5F && KeyPressed66 == false)
		{
			KeyPressed66 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[66] && counter > 0.5F && KeyPressed66c == false)
		{
			KeyPressed66c = true;
		}
		
		if (KeyPressed66 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed66c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[67] && counter > 0.5F && KeyPressed67 == false)
		{
			KeyPressed67 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[67] && counter > 0.5F && KeyPressed67c == false)
		{
			KeyPressed67c = true;
		}
		
		if (KeyPressed67 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed67c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[68] && counter > 0.5F && KeyPressed68 == false)
		{
			KeyPressed68 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[68] && counter > 0.5F && KeyPressed68c == false)
		{
			KeyPressed68c = true;
		}
		
		if (KeyPressed68 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed68c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[69] && counter > 0.5F && KeyPressed69 == false)
		{
			KeyPressed69 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[69] && counter > 0.5F && KeyPressed69c == false)
		{
			KeyPressed69c = true;
		}
		
		if (KeyPressed69 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed69c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[70] && counter > 0.5F && KeyPressed70 == false)
		{
			KeyPressed70 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[70] && counter > 0.5F && KeyPressed70c == false)
		{
			KeyPressed70c = true;
		}
		
		if (KeyPressed70 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed70c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[71] && counter > 0.5F && KeyPressed71 == false)
		{
			KeyPressed71 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[71] && counter > 0.5F && KeyPressed71c == false)
		{
			KeyPressed71c = true;
		}
		
		if (KeyPressed71 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed71c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[72] && counter > 0.5F && KeyPressed72 == false)
		{
			KeyPressed72 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[72] && counter > 0.5F && KeyPressed72c == false)
		{
			KeyPressed72c = true;
		}
		
		if (KeyPressed72 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed72c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[73] && counter > 0.5F && KeyPressed73 == false)
		{
			KeyPressed73 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[73] && counter > 0.5F && KeyPressed73c == false)
		{
			KeyPressed73c = true;
		}
		
		if (KeyPressed73 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed73c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[74] && counter > 0.5F && KeyPressed74 == false)
		{
			KeyPressed74 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[74] && counter > 0.5F && KeyPressed74c == false)
		{
			KeyPressed74c = true;
		}
		
		if (KeyPressed74 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed74c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[75] && counter > 0.5F && KeyPressed75 == false)
		{
			KeyPressed75 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[75] && counter > 0.5F && KeyPressed75c == false)
		{
			KeyPressed75c = true;
		}
		
		if (KeyPressed75 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed75c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[76] && counter > 0.5F && KeyPressed76 == false)
		{
			KeyPressed76 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[76] && counter > 0.5F && KeyPressed76c == false)
		{
			KeyPressed76c = true;
		}
		
		if (KeyPressed76 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed76c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[77] && counter > 0.5F && KeyPressed77 == false)
		{
			KeyPressed77 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[77] && counter > 0.5F && KeyPressed77c == false)
		{
			KeyPressed77c = true;
		}
		
		if (KeyPressed77 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed77c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[78] && counter > 0.5F && KeyPressed78 == false)
		{
			KeyPressed78 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[78] && counter > 0.5F && KeyPressed78c == false)
		{
			KeyPressed78c = true;
		}
		
		if (KeyPressed78 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed78c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[79] && counter > 0.5F && KeyPressed79 == false)
		{
			KeyPressed79 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[79] && counter > 0.5F && KeyPressed79c == false)
		{
			KeyPressed79c = true;
		}
		
		if (KeyPressed79 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed79c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[80] && counter > 0.5F && KeyPressed80 == false)
		{
			KeyPressed80 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[80] && counter > 0.5F && KeyPressed80c == false)
		{
			KeyPressed80c = true;
		}
		
		if (KeyPressed80 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed80c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[81] && counter > 0.5F && KeyPressed81 == false)
		{
			KeyPressed81 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[81] && counter > 0.5F && KeyPressed81c == false)
		{
			KeyPressed81c = true;
		}
		
		if (KeyPressed81 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed81c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[82] && counter > 0.5F && KeyPressed82 == false)
		{
			KeyPressed82 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[82] && counter > 0.5F && KeyPressed82c == false)
		{
			KeyPressed82c = true;
		}
		
		if (KeyPressed82 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed82c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[83] && counter > 0.5F && KeyPressed83 == false)
		{
			KeyPressed83 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[83] && counter > 0.5F && KeyPressed83c == false)
		{
			KeyPressed83c = true;
		}
		
		if (KeyPressed83 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed83c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[84] && counter > 0.5F && KeyPressed84 == false)
		{
			KeyPressed84 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[84] && counter > 0.5F && KeyPressed84c == false)
		{
			KeyPressed84c = true;
		}
		
		if (KeyPressed84 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed84c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[85] && counter > 0.5F && KeyPressed85 == false)
		{
			KeyPressed85 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[85] && counter > 0.5F && KeyPressed85c == false)
		{
			KeyPressed85c = true;
		}
		
		if (KeyPressed85 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed85c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[86] && counter > 0.5F && KeyPressed86 == false)
		{
			KeyPressed86 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[86] && counter > 0.5F && KeyPressed86c == false)
		{
			KeyPressed86c = true;
		}
		
		if (KeyPressed86 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed86c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[87] && counter > 0.5F && KeyPressed87 == false)
		{
			KeyPressed87 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[87] && counter > 0.5F && KeyPressed87c == false)
		{
			KeyPressed87c = true;
		}
		
		if (KeyPressed87 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed87c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[88] && counter > 0.5F && KeyPressed88 == false)
		{
			KeyPressed88 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[88] && counter > 0.5F && KeyPressed88c == false)
		{
			KeyPressed88c = true;
		}
		
		if (KeyPressed88 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed88c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[89] && counter > 0.5F && KeyPressed89 == false)
		{
			KeyPressed89 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[89] && counter > 0.5F && KeyPressed89c == false)
		{
			KeyPressed89c = true;
		}
		
		if (KeyPressed89 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed89c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[90] && counter > 0.5F && KeyPressed90 == false)
		{
			KeyPressed90 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[90] && counter > 0.5F && KeyPressed90c == false)
		{
			KeyPressed90c = true;
		}
		
		if (KeyPressed90 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed90c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[91] && counter > 0.5F && KeyPressed91 == false)
		{
			KeyPressed91 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[91] && counter > 0.5F && KeyPressed91c == false)
		{
			KeyPressed91c = true;
		}
		
		if (KeyPressed91 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed91c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[92] && counter > 0.5F && KeyPressed92 == false)
		{
			KeyPressed92 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[92] && counter > 0.5F && KeyPressed92c == false)
		{
			KeyPressed92c = true;
		}
		
		if (KeyPressed92 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed92c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[93] && counter > 0.5F && KeyPressed93 == false)
		{
			KeyPressed93 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[93] && counter > 0.5F && KeyPressed93c == false)
		{
			KeyPressed93c = true;
		}
		
		if (KeyPressed93 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed93c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[94] && counter > 0.5F && KeyPressed94 == false)
		{
			KeyPressed94 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[94] && counter > 0.5F && KeyPressed94c == false)
		{
			KeyPressed94c = true;
		}
		
		if (KeyPressed94 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed94c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[95] && counter > 0.5F && KeyPressed95 == false)
		{
			KeyPressed95 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[95] && counter > 0.5F && KeyPressed95c == false)
		{
			KeyPressed95c = true;
		}
		
		if (KeyPressed95 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed95c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[96] && counter > 0.5F && KeyPressed96 == false)
		{
			KeyPressed96 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[96] && counter > 0.5F && KeyPressed96c == false)
		{
			KeyPressed96c = true;
		}
		
		if (KeyPressed96 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed96c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[97] && counter > 0.5F && KeyPressed97 == false)
		{
			KeyPressed97 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[97] && counter > 0.5F && KeyPressed97c == false)
		{
			KeyPressed97c = true;
		}
		
		if (KeyPressed97 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed97c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[98] && counter > 0.5F && KeyPressed98 == false)
		{
			KeyPressed98 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[98] && counter > 0.5F && KeyPressed98c == false)
		{
			KeyPressed98c = true;
		}
		
		if (KeyPressed98 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed98c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[99] && counter > 0.5F && KeyPressed99 == false)
		{
			KeyPressed99 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[99] && counter > 0.5F && KeyPressed99c == false)
		{
			KeyPressed99c = true;
		}
		
		if (KeyPressed99 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed99c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[100] && counter > 0.5F && KeyPressed100 == false)
		{
			KeyPressed100 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[100] && counter > 0.5F && KeyPressed100c == false)
		{
			KeyPressed100c = true;
		}
		
		if (KeyPressed100 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed100c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[101] && counter > 0.5F && KeyPressed101 == false)
		{
			KeyPressed101 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[101] && counter > 0.5F && KeyPressed101c == false)
		{
			KeyPressed101c = true;
		}
		
		if (KeyPressed101 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed101c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[102] && counter > 0.5F && KeyPressed102 == false)
		{
			KeyPressed102 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[102] && counter > 0.5F && KeyPressed102c == false)
		{
			KeyPressed102c = true;
		}
		
		if (KeyPressed102 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed102c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[103] && counter > 0.5F && KeyPressed103 == false)
		{
			KeyPressed103 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[103] && counter > 0.5F && KeyPressed103c == false)
		{
			KeyPressed103c = true;
		}
		
		if (KeyPressed103 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed103c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[104] && counter > 0.5F && KeyPressed104 == false)
		{
			KeyPressed104 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[104] && counter > 0.5F && KeyPressed104c == false)
		{
			KeyPressed104c = true;
		}
		
		if (KeyPressed104 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed104c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[105] && counter > 0.5F && KeyPressed105 == false)
		{
			KeyPressed105 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[105] && counter > 0.5F && KeyPressed105c == false)
		{
			KeyPressed105c = true;
		}
		
		if (KeyPressed105 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed105c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[106] && counter > 0.5F && KeyPressed106 == false)
		{
			KeyPressed106 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[106] && counter > 0.5F && KeyPressed106c == false)
		{
			KeyPressed106c = true;
		}
		
		if (KeyPressed106 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed106c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[107] && counter > 0.5F && KeyPressed107 == false)
		{
			KeyPressed107 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[107] && counter > 0.5F && KeyPressed107c == false)
		{
			KeyPressed107c = true;
		}
		
		if (KeyPressed107 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed107c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[108] && counter > 0.5F && KeyPressed108 == false)
		{
			KeyPressed108 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[108] && counter > 0.5F && KeyPressed108c == false)
		{
			KeyPressed108c = true;
		}
		
		if (KeyPressed108 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed108c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[109] && counter > 0.5F && KeyPressed109 == false)
		{
			KeyPressed109 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[109] && counter > 0.5F && KeyPressed109c == false)
		{
			KeyPressed109c = true;
		}
		
		if (KeyPressed109 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed109c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[110] && counter > 0.5F && KeyPressed110 == false)
		{
			KeyPressed110 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[110] && counter > 0.5F && KeyPressed110c == false)
		{
			KeyPressed110c = true;
		}
		
		if (KeyPressed110 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed110c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[111] && counter > 0.5F && KeyPressed111 == false)
		{
			KeyPressed111 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[111] && counter > 0.5F && KeyPressed111c == false)
		{
			KeyPressed111c = true;
		}
		
		if (KeyPressed111 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed111c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[112] && counter > 0.5F && KeyPressed112 == false)
		{
			KeyPressed112 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[112] && counter > 0.5F && KeyPressed112c == false)
		{
			KeyPressed112c = true;
		}
		
		if (KeyPressed112 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed112c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[113] && counter > 0.5F && KeyPressed113 == false)
		{
			KeyPressed113 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[113] && counter > 0.5F && KeyPressed113c == false)
		{
			KeyPressed113c = true;
		}
		
		if (KeyPressed113 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed113c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[114] && counter > 0.5F && KeyPressed114 == false)
		{
			KeyPressed114 = true;
			
		}
		if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[114] && counter > 0.5F && KeyPressed114c == false)
		{
			KeyPressed114c = true;
		}
		
		if (KeyPressed114 == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (KeyPressed114c == true) {
			counter -= 1F;
			if (counter < 0F) {
				counter = 0F;
			}
		}
		if (counter == 20F){
			counter = 0F;
		}
		
		TileEntitySynthesis synthesis = new TileEntitySynthesis();
		
		if(thePlayer.inventory.hasItemStack(new ItemStack(AddedItems.BlazingCrystal))){
			HasKingdomKeyMats = true;
		}

	}

	public static boolean KeyPressed1 = false;
	public static boolean KeyPressed1c = false;
	public static boolean KeyPressed2 = false;
	public static boolean KeyPressed2c = false;
	public static boolean KeyPressed3 = false;
	public static boolean KeyPressed3c = false;
	public static boolean KeyPressed4 = false;
	public static boolean KeyPressed4c = false;
	public static boolean KeyPressed5 = false;
	public static boolean KeyPressed5c = false;
	public static boolean KeyPressed6 = false;
	public static boolean KeyPressed6c = false;
	public static boolean KeyPressed7 = false;
	public static boolean KeyPressed7c = false;
	public static boolean KeyPressed8 = false;
	public static boolean KeyPressed8c = false;
	public static boolean KeyPressed9 = false;
	public static boolean KeyPressed9c = false;
	public static boolean KeyPressed10 = false;
	public static boolean KeyPressed10c = false;
	public static boolean KeyPressed11 = false;
	public static boolean KeyPressed11c = false;
	public static boolean KeyPressed12 = false;
	public static boolean KeyPressed12c = false;
	public static boolean KeyPressed13 = false;
	public static boolean KeyPressed13c = false;
	public static boolean KeyPressed14 = false;
	public static boolean KeyPressed14c = false;
	public static boolean KeyPressed15 = false;
	public static boolean KeyPressed15c = false;
	public static boolean KeyPressed16 = false;
	public static boolean KeyPressed16c = false;
	public static boolean KeyPressed17 = false;
	public static boolean KeyPressed17c = false;
	public static boolean KeyPressed18 = false;
	public static boolean KeyPressed18c = false;
	public static boolean KeyPressed19 = false;
	public static boolean KeyPressed19c = false;
	public static boolean KeyPressed20 = false;
	public static boolean KeyPressed20c = false;
	public static boolean KeyPressed21 = false;
	public static boolean KeyPressed21c = false;
	public static boolean KeyPressed22 = false;
	public static boolean KeyPressed22c = false;
	public static boolean KeyPressed23 = false;
	public static boolean KeyPressed23c = false;
	public static boolean KeyPressed24 = false;
	public static boolean KeyPressed24c = false;
	public static boolean KeyPressed25 = false;
	public static boolean KeyPressed25c = false;
	public static boolean KeyPressed26 = false;
	public static boolean KeyPressed26c = false;
	public static boolean KeyPressed27 = false;
	public static boolean KeyPressed27c = false;
	public static boolean KeyPressed28 = false;
	public static boolean KeyPressed28c = false;
	public static boolean KeyPressed29 = false;
	public static boolean KeyPressed29c = false;
	public static boolean KeyPressed30 = false;
	public static boolean KeyPressed30c = false;
	public static boolean KeyPressed31 = false;
	public static boolean KeyPressed31c = false;
	public static boolean KeyPressed32 = false;
	public static boolean KeyPressed32c = false;
	public static boolean KeyPressed33 = false;
	public static boolean KeyPressed33c = false;
	public static boolean KeyPressed34 = false;
	public static boolean KeyPressed34c = false;
	public static boolean KeyPressed35 = false;
	public static boolean KeyPressed35c = false;
	public static boolean KeyPressed36 = false;
	public static boolean KeyPressed36c = false;
	public static boolean KeyPressed37 = false;
	public static boolean KeyPressed37c = false;
	public static boolean KeyPressed38 = false;
	public static boolean KeyPressed38c = false;
	public static boolean KeyPressed39 = false;
	public static boolean KeyPressed39c = false;
	public static boolean KeyPressed40 = false;
	public static boolean KeyPressed40c = false;
	public static boolean KeyPressed41 = false;
	public static boolean KeyPressed41c = false;
	public static boolean KeyPressed42 = false;
	public static boolean KeyPressed42c = false;
	public static boolean KeyPressed43 = false;
	public static boolean KeyPressed43c = false;
	public static boolean KeyPressed44 = false;
	public static boolean KeyPressed44c = false;
	public static boolean KeyPressed45 = false;
	public static boolean KeyPressed45c = false;
	public static boolean KeyPressed46 = false;
	public static boolean KeyPressed46c = false;
	public static boolean KeyPressed47 = false;
	public static boolean KeyPressed47c = false;
	public static boolean KeyPressed48 = false;
	public static boolean KeyPressed48c = false;
	public static boolean KeyPressed49 = false;
	public static boolean KeyPressed49c = false;
	public static boolean KeyPressed50 = false;
	public static boolean KeyPressed50c = false;
	public static boolean KeyPressed51 = false;
	public static boolean KeyPressed51c = false;
	public static boolean KeyPressed52 = false;
	public static boolean KeyPressed52c = false;
	public static boolean KeyPressed53 = false;
	public static boolean KeyPressed53c = false;
	public static boolean KeyPressed54 = false;
	public static boolean KeyPressed54c = false;
	public static boolean KeyPressed55 = false;
	public static boolean KeyPressed55c = false;
	public static boolean KeyPressed56 = false;
	public static boolean KeyPressed56c = false;
	public static boolean KeyPressed57 = false;
	public static boolean KeyPressed57c = false;
	public static boolean KeyPressed58 = false;
	public static boolean KeyPressed58c = false;
	public static boolean KeyPressed59 = false;
	public static boolean KeyPressed59c = false;
	public static boolean KeyPressed60 = false;
	public static boolean KeyPressed60c = false;
	public static boolean KeyPressed61 = false;
	public static boolean KeyPressed61c = false;
	public static boolean KeyPressed62 = false;
	public static boolean KeyPressed62c = false;
	public static boolean KeyPressed63 = false;
	public static boolean KeyPressed63c = false;
	public static boolean KeyPressed64 = false;
	public static boolean KeyPressed64c = false;
	public static boolean KeyPressed65 = false;
	public static boolean KeyPressed65c = false;
	public static boolean KeyPressed66 = false;
	public static boolean KeyPressed66c = false;
	public static boolean KeyPressed67 = false;
	public static boolean KeyPressed67c = false;
	public static boolean KeyPressed68 = false;
	public static boolean KeyPressed68c = false;
	public static boolean KeyPressed69 = false;
	public static boolean KeyPressed69c = false;
	public static boolean KeyPressed70 = false;
	public static boolean KeyPressed70c = false;
	public static boolean KeyPressed71 = false;
	public static boolean KeyPressed71c = false;
	public static boolean KeyPressed72 = false;
	public static boolean KeyPressed72c = false;
	public static boolean KeyPressed73 = false;
	public static boolean KeyPressed73c = false;
	public static boolean KeyPressed74 = false;
	public static boolean KeyPressed74c = false;
	public static boolean KeyPressed75 = false;
	public static boolean KeyPressed75c = false;
	public static boolean KeyPressed76 = false;
	public static boolean KeyPressed76c = false;
	public static boolean KeyPressed77 = false;
	public static boolean KeyPressed77c = false;
	public static boolean KeyPressed78 = false;
	public static boolean KeyPressed78c = false;
	public static boolean KeyPressed79 = false;
	public static boolean KeyPressed79c = false;
	public static boolean KeyPressed80 = false;
	public static boolean KeyPressed80c = false;
	public static boolean KeyPressed81 = false;
	public static boolean KeyPressed81c = false;
	public static boolean KeyPressed82 = false;
	public static boolean KeyPressed82c = false;
	public static boolean KeyPressed83 = false;
	public static boolean KeyPressed83c = false;
	public static boolean KeyPressed84 = false;
	public static boolean KeyPressed84c = false;
	public static boolean KeyPressed85 = false;
	public static boolean KeyPressed85c = false;
	public static boolean KeyPressed86 = false;
	public static boolean KeyPressed86c = false;
	public static boolean KeyPressed87 = false;
	public static boolean KeyPressed87c = false;
	public static boolean KeyPressed88 = false;
	public static boolean KeyPressed88c = false;
	public static boolean KeyPressed89 = false;
	public static boolean KeyPressed89c = false;
	public static boolean KeyPressed90 = false;
	public static boolean KeyPressed90c = false;
	public static boolean KeyPressed91 = false;
	public static boolean KeyPressed91c = false;
	public static boolean KeyPressed92 = false;
	public static boolean KeyPressed92c = false;
	public static boolean KeyPressed93 = false;
	public static boolean KeyPressed93c = false;
	public static boolean KeyPressed94 = false;
	public static boolean KeyPressed94c = false;
	public static boolean KeyPressed95 = false;
	public static boolean KeyPressed95c = false;
	public static boolean KeyPressed96 = false;
	public static boolean KeyPressed96c = false;
	public static boolean KeyPressed97 = false;
	public static boolean KeyPressed97c = false;
	public static boolean KeyPressed98 = false;
	public static boolean KeyPressed98c = false;
	public static boolean KeyPressed99 = false;
	public static boolean KeyPressed99c = false;
	public static boolean KeyPressed100 = false;
	public static boolean KeyPressed100c = false;
	public static boolean KeyPressed101 = false;
	public static boolean KeyPressed101c = false;
	public static boolean KeyPressed102 = false;
	public static boolean KeyPressed102c = false;
	public static boolean KeyPressed103 = false;
	public static boolean KeyPressed103c = false;
	public static boolean KeyPressed104 = false;
	public static boolean KeyPressed104c = false;
	public static boolean KeyPressed105 = false;
	public static boolean KeyPressed105c = false;
	public static boolean KeyPressed106 = false;
	public static boolean KeyPressed106c = false;
	public static boolean KeyPressed107 = false;
	public static boolean KeyPressed107c = false;
	public static boolean KeyPressed108 = false;
	public static boolean KeyPressed108c = false;
	public static boolean KeyPressed109 = false;
	public static boolean KeyPressed109c = false;
	public static boolean KeyPressed110 = false;
	public static boolean KeyPressed110c = false;
	public static boolean KeyPressed111 = false;
	public static boolean KeyPressed111c = false;
	public static boolean KeyPressed112 = false;
	public static boolean KeyPressed112c = false;
	public static boolean KeyPressed113 = false;
	public static boolean KeyPressed113c = false;
	public static boolean KeyPressed114 = false;
	public static boolean KeyPressed114c = false;
	public static boolean HasKingdomKeyMats = false;
	
	@Override
	public void tickStart(EnumSet<TickType> type, Object... tickData) {
		if (type.equals(EnumSet.of(TickType.PLAYER))) {
			onPlayerTick((EntityPlayer) tickData[0]);
		}
	}
@Override
public void tickEnd(EnumSet<TickType> type, Object... tickData) {
	// TODO Auto-generated method stub

}
@Override
public EnumSet<TickType> ticks() {
	return EnumSet.of(TickType.PLAYER, TickType.SERVER);
}
@Override
public String getLabel() {
	return "Key Tick Handler";
}
}
