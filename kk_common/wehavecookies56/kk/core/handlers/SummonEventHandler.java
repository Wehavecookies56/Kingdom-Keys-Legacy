package wehavecookies56.kk.core.handlers;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;

import wehavecookies56.kk.client.gui.GuiSynthesis;
import wehavecookies56.kk.item.AddedItems;
import wehavecookies56.kk.lib.UsefulArrays;

import cpw.mods.fml.client.FMLClientHandler;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.Packet250CustomPayload;

public class SummonEventHandler {

	public static KeyTickHandler event;

	public static void sendPacket(EntityPlayer player) {
		ByteArrayOutputStream byteOutputStream = new ByteArrayOutputStream();
		DataOutputStream dataOutputStream = new DataOutputStream(
				byteOutputStream);
		try {
			dataOutputStream.writeInt(player.entityId);//this info is unused when handling the packet ??
		} catch (Exception e) {
			e.printStackTrace();
		}
		Packet250CustomPayload packet = new Packet250CustomPayload(
				SummonPacketHandler.summon,
				byteOutputStream.toByteArray());

		FMLClientHandler.instance().sendPacket(packet);
	}
	
	public static boolean item1 = false;
	public static boolean item2 = false;
	public static boolean item3 = false;
	public static boolean item4 = false;
	public static boolean item5 = false;
	public static boolean item6 = false;
	public static boolean item7 = false;
	public static boolean item8 = false;
	public static boolean item9 = false;
	public static boolean item10 = false;
	public static boolean item11 = false;


	
	public static void handlePacket(Packet250CustomPayload packet,
			EntityPlayer player) {
		if (event.KeyPressed1 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[1])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[1], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed1 = false;
		}
		if (event.KeyPressed1c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[1])
			{
				Minecraft.getMinecraft().sndManager.playSoundFX("kk:summon", 1, 1F);
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[1], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed1c = false;
		}
		if (event.KeyPressed2 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[2])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[2], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed2 = false;
		}
		if (event.KeyPressed2c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[2])
			{
				Minecraft.getMinecraft().sndManager.playSoundFX("kk:summon", 1, 1F);
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[2], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed2c = false;
		}
		if (event.KeyPressed3 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[3])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[3], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed3 = false;
		}
		if (event.KeyPressed3c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[3])
			{
				Minecraft.getMinecraft().sndManager.playSoundFX("kk:summon", 1, 1F);
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[3], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed3c = false;
		}
		if (event.KeyPressed4 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[4])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[4], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed4 = false;
		}
		if (event.KeyPressed4c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[4])
			{
				Minecraft.getMinecraft().sndManager.playSoundFX("kk:summon", 1, 1F);
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[4], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed4c = false;
		}
		if (event.KeyPressed5 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[5])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[5], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed5 = false;
		}
		if (event.KeyPressed5c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[5])
			{
				Minecraft.getMinecraft().sndManager.playSoundFX("kk:summon", 1, 1F);
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[5], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed5c = false;
		}
		if (event.KeyPressed6 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[6])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[6], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed6 = false;
		}
		if (event.KeyPressed6c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[6])
			{
				Minecraft.getMinecraft().sndManager.playSoundFX("kk:summon", 1, 1F);
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[6], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed6c = false;
		}
		if (event.KeyPressed7 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[7])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[7], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed7 = false;
		}
		if (event.KeyPressed7c == true) {
			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[7])
			{
				Minecraft.getMinecraft().sndManager.playSoundFX("kk:summon", 1, 1F);
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[7], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed7c = false;
		}
		if (event.KeyPressed8 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[8])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[8], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed8 = false;
		}
		if (event.KeyPressed8c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[8])
			{
				Minecraft.getMinecraft().sndManager.playSoundFX("kk:summon", 1, 1F);
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[8], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed8c = false;
		}
		if (event.KeyPressed9 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[9])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[9], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed9 = false;
		}
		if (event.KeyPressed9c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[9])
			{
				Minecraft.getMinecraft().sndManager.playSoundFX("kk:summon", 1, 1F);
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[9], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed9c = false;
		}
		if (event.KeyPressed10 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[10])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[10], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed10 = false;
		}
		if (event.KeyPressed10c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[10])
			{
				Minecraft.getMinecraft().sndManager.playSoundFX("kk:summon", 1, 1F);
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[10], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed10c = false;
		}
		if (event.KeyPressed11 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[11])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[11], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed11 = false;
		}
		if (event.KeyPressed11c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[11])
			{
				Minecraft.getMinecraft().sndManager.playSoundFX("kk:summon", 1, 1F);
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[11], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed11c = false;
		}
		if (event.KeyPressed12 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[12])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[12], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed12 = false;
		}
		if (event.KeyPressed12c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[12])
			{
				Minecraft.getMinecraft().sndManager.playSoundFX("kk:summon", 1, 1F);
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[12], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed12c = false;
		}
		if (event.KeyPressed13 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[13])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[13], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed13 = false;
		}
		if (event.KeyPressed13c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[13])
			{
				Minecraft.getMinecraft().sndManager.playSoundFX("kk:summon", 1, 1F);
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[13], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed13c = false;
		}
		if (event.KeyPressed14 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[14])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[14], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed14 = false;
		}
		if (event.KeyPressed14c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[14])
			{
				Minecraft.getMinecraft().sndManager.playSoundFX("kk:summon", 1, 1F);
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[14], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed14c = false;
		}
		if (event.KeyPressed15 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[15])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[15], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed15 = false;
		}
		if (event.KeyPressed15c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[15])
			{
				Minecraft.getMinecraft().sndManager.playSoundFX("kk:summon", 1, 1F);
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[15], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed15c = false;
		}
		if (event.KeyPressed16 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[16])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[16], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed16 = false;
		}
		if (event.KeyPressed16c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			Minecraft.getMinecraft().sndManager.playSoundFX("kk:summon", 1, 1F);
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[16])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[16], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed16c = false;
		}
		if (event.KeyPressed17 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[17])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[17], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed17 = false;
		}
		if (event.KeyPressed17c == true) {
			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[17])
			{
				Minecraft.getMinecraft().sndManager.playSoundFX("kk:summon", 1, 1F);
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[17], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed17c = false;
		}
		if (event.KeyPressed18 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[18])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[18], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed18 = false;
		}
		if (event.KeyPressed18c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[18])
			{
				Minecraft.getMinecraft().sndManager.playSoundFX("kk:summon", 1, 1F);
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[18], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed18c = false;
		}
		if (event.KeyPressed19 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[19])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[19], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed19 = false;
		}
		if (event.KeyPressed19c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[19])
			{
				Minecraft.getMinecraft().sndManager.playSoundFX("kk:summon", 1, 1F);
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[19], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed19c = false;
		}
		if (event.KeyPressed20 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[20])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[20], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed20 = false;
		}
		if (event.KeyPressed20c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[20])
			{
				Minecraft.getMinecraft().sndManager.playSoundFX("kk:summon", 1, 1F);
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[20], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed20c = false;
		}
		if (event.KeyPressed21 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[21])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[21], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed21 = false;
		}
		if (event.KeyPressed21c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[21])
			{
				Minecraft.getMinecraft().sndManager.playSoundFX("kk:summon", 1, 1F);
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[21], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed21c = false;
		}
		if (event.KeyPressed22 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[22])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[22], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed22 = false;
		}
		if (event.KeyPressed22c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[22])
			{
				Minecraft.getMinecraft().sndManager.playSoundFX("kk:summon", 1, 1F);
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[22], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed22c = false;
		}
		if (event.KeyPressed23 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[23])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[23], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed23 = false;
		}
		if (event.KeyPressed23c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[23])
			{
				Minecraft.getMinecraft().sndManager.playSoundFX("kk:summon", 1, 1F);
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[23], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed23c = false;
		}
		if (event.KeyPressed24 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[24])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[24], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed24 = false;
		}
		if (event.KeyPressed24c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[24])
			{
				Minecraft.getMinecraft().sndManager.playSoundFX("kk:summon", 1, 1F);
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[24], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed24c = false;
		}
		if (event.KeyPressed25 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[25])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[25], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed25 = false;
		}
		if (event.KeyPressed25c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[25])
			{
				Minecraft.getMinecraft().sndManager.playSoundFX("kk:summon", 1, 1F);
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[25], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed25c = false;
		}
		if (event.KeyPressed26 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[26])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[26], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed26 = false;
		}
		if (event.KeyPressed26c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[26])
			{
				Minecraft.getMinecraft().sndManager.playSoundFX("kk:summon", 1, 1F);
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[26], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed26c = false;
		}
		if (event.KeyPressed27 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[27])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[27], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed27 = false;
		}
		if (event.KeyPressed27c == true) {
			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[27])
			{
				Minecraft.getMinecraft().sndManager.playSoundFX("kk:summon", 1, 1F);
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[27], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed27c = false;
		}
		if (event.KeyPressed28 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[28])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[28], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed28 = false;
		}
		if (event.KeyPressed28c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[28])
			{
				Minecraft.getMinecraft().sndManager.playSoundFX("kk:summon", 1, 1F);
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[28], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed28c = false;
		}
		if (event.KeyPressed29 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[29])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[29], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed29 = false;
		}
		if (event.KeyPressed29c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[29])
			{
				Minecraft.getMinecraft().sndManager.playSoundFX("kk:summon", 1, 1F);
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[29], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed29c = false;
		}
		if (event.KeyPressed30 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[30])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[30], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed30 = false;
		}
		if (event.KeyPressed30c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[30])
			{
				Minecraft.getMinecraft().sndManager.playSoundFX("kk:summon", 1, 1F);
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[30], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed30c = false;
		}
		if (event.KeyPressed31 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[31])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[31], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed31 = false;
		}
		if (event.KeyPressed31c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[31])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[31], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed31c = false;
		}
		if (event.KeyPressed32 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[32])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[32], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed32 = false;
		}
		if (event.KeyPressed32c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[32])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[32], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed32c = false;
		}
		if (event.KeyPressed33 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[33])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[33], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed33 = false;
		}
		if (event.KeyPressed33c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[33])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[33], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed33c = false;
		}
		if (event.KeyPressed34 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[34])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[34], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed34 = false;
		}
		if (event.KeyPressed34c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[34])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[34], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed34c = false;
		}
		if (event.KeyPressed35 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[35])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[35], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed35 = false;
		}
		if (event.KeyPressed35c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[35])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[35], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed35c = false;
		}
		if (event.KeyPressed36 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[36])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[36], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed36 = false;
		}
		if (event.KeyPressed36c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[36])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[36], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed36c = false;
		}
		if (event.KeyPressed37 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[37])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[37], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed37 = false;
		}
		if (event.KeyPressed37c == true) {
			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[37])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[37], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed37c = false;
		}
		if (event.KeyPressed38 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[38])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[38], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed38 = false;
		}
		if (event.KeyPressed38c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[38])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[38], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed38c = false;
		}
		if (event.KeyPressed39 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[39])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[39], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed39 = false;
		}
		if (event.KeyPressed39c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[39])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[39], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed39c = false;
		}
		if (event.KeyPressed40 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[40])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[40], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed40 = false;
		}
		if (event.KeyPressed40c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[40])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[40], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed40c = false;
		}
		if (event.KeyPressed41 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[41])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[41], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed41 = false;
		}
		if (event.KeyPressed41c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[41])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[41], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed41c = false;
		}
		if (event.KeyPressed42 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[42])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[42], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed42 = false;
		}
		if (event.KeyPressed42c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[42])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[42], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed42c = false;
		}
		if (event.KeyPressed43 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[43])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[43], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed43 = false;
		}
		if (event.KeyPressed43c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[43])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[43], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed43c = false;
		}
		if (event.KeyPressed44 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[44])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[44], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed44 = false;
		}
		if (event.KeyPressed44c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[44])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[44], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed44c = false;
		}
		if (event.KeyPressed45 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[45])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[45], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed45 = false;
		}
		if (event.KeyPressed45c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[45])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[45], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed45c = false;
		}
		if (event.KeyPressed46 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[46])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[46], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed46 = false;
		}
		if (event.KeyPressed46c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[46])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[46], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed46c = false;
		}
		if (event.KeyPressed47 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[47])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[47], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed47 = false;
		}
		if (event.KeyPressed47c == true) {
			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[47])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[47], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed47c = false;
		}
		if (event.KeyPressed48 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[48])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[48], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed48 = false;
		}
		if (event.KeyPressed48c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[48])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[48], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed48c = false;
		}
		if (event.KeyPressed49 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[49])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[49], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed49 = false;
		}
		if (event.KeyPressed49c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[49])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[49], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed49c = false;
		}
		if (event.KeyPressed50 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[50])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[50], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed50 = false;
		}
		if (event.KeyPressed50c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[50])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[50], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed50c = false;
		}
		if (event.KeyPressed51 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[51])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[51], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed51 = false;
		}
		if (event.KeyPressed51c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[51])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[51], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed51c = false;
		}
		if (event.KeyPressed52 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[52])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[52], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed52 = false;
		}
		if (event.KeyPressed52c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[52])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[52], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed52c = false;
		}
		if (event.KeyPressed53 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[53])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[53], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed53 = false;
		}
		if (event.KeyPressed53c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[53])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[53], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed53c = false;
		}
		if (event.KeyPressed54 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[54])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[54], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed54 = false;
		}
		if (event.KeyPressed54c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[54])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[54], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed54c = false;
		}
		if (event.KeyPressed55 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[55])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[55], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed55 = false;
		}
		if (event.KeyPressed55c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[55])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[55], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed55c = false;
		}
		if (event.KeyPressed56 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[56])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[56], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed56 = false;
		}
		if (event.KeyPressed56c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[56])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[56], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed56c = false;
		}
		if (event.KeyPressed57 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[57])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[57], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed57 = false;
		}
		if (event.KeyPressed57c == true) {
			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[57])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[57], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed57c = false;
		}
		if (event.KeyPressed58 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[58])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[58], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed58 = false;
		}
		if (event.KeyPressed58c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[58])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[58], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed58c = false;
		}
		if (event.KeyPressed59 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[59])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[59], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed59 = false;
		}
		if (event.KeyPressed59c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[59])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[59], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed59c = false;
		}
		if (event.KeyPressed60 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[60])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[60], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed60 = false;
		}
		if (event.KeyPressed60c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[60])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[60], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed60c = false;
		}
		if (event.KeyPressed61 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[61])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[61], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed61 = false;
		}
		if (event.KeyPressed61c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[61])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[61], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed61c = false;
		}
		if (event.KeyPressed62 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[62])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[62], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed62 = false;
		}
		if (event.KeyPressed62c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[62])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[62], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed62c = false;
		}
		if (event.KeyPressed63 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[63])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[63], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed63 = false;
		}
		if (event.KeyPressed63c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[63])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[63], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed63c = false;
		}
		if (event.KeyPressed64 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[64])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[64], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed64 = false;
		}
		if (event.KeyPressed64c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[64])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[64], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed64c = false;
		}
		if (event.KeyPressed65 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[65])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[65], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed65 = false;
		}
		if (event.KeyPressed65c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[65])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[65], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed65c = false;
		}
		if (event.KeyPressed66 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[66])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[66], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed66 = false;
		}
		if (event.KeyPressed66c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[66])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[66], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed66c = false;
		}
		if (event.KeyPressed67 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[67])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[67], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed67 = false;
		}
		if (event.KeyPressed67c == true) {
			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[67])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[67], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed67c = false;
		}
		if (event.KeyPressed68 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[68])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[68], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed68 = false;
		}
		if (event.KeyPressed68c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[68])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[68], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed68c = false;
		}
		if (event.KeyPressed69 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[69])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[69], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed69 = false;
		}
		if (event.KeyPressed69c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[69])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[69], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed69c = false;
		}
		if (event.KeyPressed70 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[70])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[70], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed70 = false;
		}
		if (event.KeyPressed70c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[70])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[70], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed70c = false;
		}
		if (event.KeyPressed71 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[71])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[71], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed71 = false;
		}
		if (event.KeyPressed71c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[71])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[71], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed71c = false;
		}
		if (event.KeyPressed72 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[72])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[72], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed72 = false;
		}
		if (event.KeyPressed72c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[72])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[72], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed72c = false;
		}
		if (event.KeyPressed73 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[73])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[73], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed73 = false;
		}
		if (event.KeyPressed73c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[73])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[73], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed73c = false;
		}
		if (event.KeyPressed74 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[74])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[74], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed74 = false;
		}
		if (event.KeyPressed74c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[74])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[74], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed74c = false;
		}
		if (event.KeyPressed75 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[75])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[75], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed75 = false;
		}
		if (event.KeyPressed75c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[75])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[75], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed75c = false;
		}
		if (event.KeyPressed76 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[76])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[76], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed76 = false;
		}
		if (event.KeyPressed76c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[76])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[76], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed76c = false;
		}
		if (event.KeyPressed77 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[77])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[77], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed77 = false;
		}
		if (event.KeyPressed77c == true) {
			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[77])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[77], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed77c = false;
		}
		if (event.KeyPressed78 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[78])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[78], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed78 = false;
		}
		if (event.KeyPressed78c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[78])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[78], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed78c = false;
		}
		if (event.KeyPressed79 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[79])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[79], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed79 = false;
		}
		if (event.KeyPressed79c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[79])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[79], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed79c = false;
		}
		if (event.KeyPressed80 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[80])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[80], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed80 = false;
		}
		if (event.KeyPressed80c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[80])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[80], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed80c = false;
		}
		if (event.KeyPressed81 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[81])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[81], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed81 = false;
		}
		if (event.KeyPressed81c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[81])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[81], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed81c = false;
		}
		if (event.KeyPressed82 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[82])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[82], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed82 = false;
		}
		if (event.KeyPressed82c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[82])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[82], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed82c = false;
		}
		if (event.KeyPressed83 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[83])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[83], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed83 = false;
		}
		if (event.KeyPressed83c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[83])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[83], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed83c = false;
		}
		if (event.KeyPressed84 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[84])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[84], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed84 = false;
		}
		if (event.KeyPressed84c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[84])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[84], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed84c = false;
		}
		if (event.KeyPressed85 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[85])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[85], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed85 = false;
		}
		if (event.KeyPressed85c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[85])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[85], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed85c = false;
		}
		if (event.KeyPressed86 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[86])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[86], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed86 = false;
		}
		if (event.KeyPressed86c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[86])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[86], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed86c = false;
		}
		if (event.KeyPressed87 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[87])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[87], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed87 = false;
		}
		if (event.KeyPressed87c == true) {
			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[87])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[87], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed87c = false;
		}
		if (event.KeyPressed88 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[88])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[88], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed88 = false;
		}
		if (event.KeyPressed88c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[88])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[88], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed88c = false;
		}
		if (event.KeyPressed89 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[89])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[89], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed89 = false;
		}
		if (event.KeyPressed89c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[89])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[89], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed89c = false;
		}
		if (event.KeyPressed90 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[90])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[90], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed90 = false;
		}
		if (event.KeyPressed90c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[90])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[90], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed90c = false;
		}
		if (event.KeyPressed91 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[91])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[91], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed91 = false;
		}
		if (event.KeyPressed91c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[91])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[91], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed91c = false;
		}
		if (event.KeyPressed92 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[92])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[92], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed92 = false;
		}
		if (event.KeyPressed92c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[92])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[92], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed92c = false;
		}
		if (event.KeyPressed93 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[93])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[93], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed93 = false;
		}
		if (event.KeyPressed93c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[93])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[93], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed93c = false;
		}
		if (event.KeyPressed94 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[94])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[94], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed94 = false;
		}
		if (event.KeyPressed94c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[94])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[94], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed94c = false;
		}
		if (event.KeyPressed95 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[95])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[95], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed95 = false;
		}
		if (event.KeyPressed95c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[95])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[95], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed95c = false;
		}
		if (event.KeyPressed96 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[96])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[96], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed96 = false;
		}
		if (event.KeyPressed96c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[96])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[96], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed96c = false;
		}
		if (event.KeyPressed97 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[97])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[97], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed97 = false;
		}
		if (event.KeyPressed97c == true) {
			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[97])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[97], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed97c = false;
		}
		if (event.KeyPressed98 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[98])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[98], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed98 = false;
		}
		if (event.KeyPressed98c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[98])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[98], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed98c = false;
		}
		if (event.KeyPressed99 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[99])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[99], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed99 = false;
		}
		if (event.KeyPressed99c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[99])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[99], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed99c = false;
		}
		if (event.KeyPressed100 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[100])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[100], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed100 = false;
		}
		if (event.KeyPressed100c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[100])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[100], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed100c = false;
		}
		if (event.KeyPressed101 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[101])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[101], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed101 = false;
		}
		if (event.KeyPressed101c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[101])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[101], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed101c = false;
		}
		if (event.KeyPressed102 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[102])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[102], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed102 = false;
		}
		if (event.KeyPressed102c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[102])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[102], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed102c = false;
		}
		if (event.KeyPressed103 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[103])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[103], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed103 = false;
		}
		if (event.KeyPressed103c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[103])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[103], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed103c = false;
		}
		if (event.KeyPressed104 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[104])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[104], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed104 = false;
		}
		if (event.KeyPressed104c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[104])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[104], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed104c = false;
		}
		if (event.KeyPressed105 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[105])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[105], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed105 = false;
		}
		if (event.KeyPressed105c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[105])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[105], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed105c = false;
		}
		if (event.KeyPressed106 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[106])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[106], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed106 = false;
		}
		if (event.KeyPressed106c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[106])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[106], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed106c = false;
		}
		if (event.KeyPressed107 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[107])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[107], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed107 = false;
		}
		if (event.KeyPressed107c == true) {
			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[107])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[107], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed107c = false;
		}
		if (event.KeyPressed108 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[108])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[108], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed108 = false;
		}
		if (event.KeyPressed108c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[108])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[108], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed108c = false;
		}
		if (event.KeyPressed109 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[109])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[109], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed109 = false;
		}
		if (event.KeyPressed109c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[109])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[109], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed109c = false;
		}
		if (event.KeyPressed110 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[110])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[110], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed110 = false;
		}
		if (event.KeyPressed110c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[110])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[110], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed110c = false;
		}
		if (event.KeyPressed111 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[111])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[111], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed111 = false;
		}
		if (event.KeyPressed111c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[111])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[111], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed111c = false;
		}
		if (event.KeyPressed112 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[112])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[112], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed112 = false;
		}
		if (event.KeyPressed112c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[112])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[112], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed112c = false;
		}
		if (event.KeyPressed113 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[113])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[113], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed113 = false;
		}
		if (event.KeyPressed113c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[113])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[113], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed113c = false;
		}
		if (event.KeyPressed114 == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keybladeid[114])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keychain[114], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed114 = false;
		}
		if (event.KeyPressed114c == true) {

			ArrayList<ItemStack> itemListToSend = new ArrayList<ItemStack>();
			EntityPlayerMP thePlayer = (EntityPlayerMP)player;
			
			if (thePlayer.getHeldItem() != null && thePlayer.getHeldItem().itemID == UsefulArrays.keychainid[114])
			{
				thePlayer.inventory.setInventorySlotContents(thePlayer.inventory.currentItem, new ItemStack(UsefulArrays.keyblade[114], 1));
				thePlayer.sendContainerAndContentsToPlayer(thePlayer.openContainer, itemListToSend);
			}
			
			event.KeyPressed114c = false;
		}

	}
}
