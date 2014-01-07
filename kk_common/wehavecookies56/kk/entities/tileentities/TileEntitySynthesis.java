package wehavecookies56.kk.entities.tileentities;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import wehavecookies56.kk.item.AddedItems;

public class TileEntitySynthesis extends TileEntity implements IInventory {

	private ItemStack[] items;
	
	public TileEntitySynthesis(){
		items = new ItemStack[1];
	}
	
	@Override
	public int getSizeInventory() {
		return items.length;
	}

	@Override
	public ItemStack getStackInSlot(int i) {
		return items[i];
	}

	@Override
	public ItemStack decrStackSize(int i, int count) {
		ItemStack itemstack = getStackInSlot(i);
		if(itemstack != null){
			if(itemstack.stackSize <= count){
				setInventorySlotContents(i, null);
			}else{
				itemstack = itemstack.splitStack(count);
				onInventoryChanged();
			}
		}
		int type = itemstack.itemID;
		return itemstack;
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int i) {
		ItemStack item = getStackInSlot(i);
		setInventorySlotContents(i, null);
		return item;
	}

	@Override
	public void setInventorySlotContents(int i, ItemStack itemstack) {
		items[i] = itemstack;
		if(itemstack != null && itemstack.stackSize > getInventoryStackLimit()){
			itemstack.stackSize = getInventoryStackLimit();
		}
		onInventoryChanged();
	}

	@Override
	public String getInvName() {
		return "Synthesis";
	}

	@Override
	public boolean isInvNameLocalized() {
		return false;
	}

	@Override
	public int getInventoryStackLimit() {
		return 1;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer entityplayer) {
		return entityplayer.getDistanceSq(xCoord + 0.5, yCoord + 0.5, zCoord + 0.5) <= 64;
	}

	@Override
	public void openChest() {}

	@Override
	public void closeChest() {}

	@Override
	public boolean isItemValidForSlot(int i, ItemStack stack) {
		if(stack.itemID == AddedItems.K1r.itemID){
			return stack.itemID == AddedItems.K1r.itemID;
		}else if(stack.itemID == AddedItems.K111r.itemID){
			return stack.itemID == AddedItems.K111r.itemID;
		}else{
			return false;
		}
	}
	
	@Override
	public void writeToNBT(NBTTagCompound compound){
		super.writeToNBT(compound);
		
		NBTTagList items = new NBTTagList();
		
		for(int i = 0; i< getSizeInventory(); i++){
			ItemStack stack = getStackInSlot(i);
			if(stack != null){
				NBTTagCompound item = new NBTTagCompound();
				item.setByte("Slot", (byte)i);
				stack.writeToNBT(item);
				items.appendTag(item);
			}
		}
		compound.setTag("Items", items);
	}
	
	@Override
	public void readFromNBT(NBTTagCompound compound){
		super.readFromNBT(compound);
		NBTTagList items = compound.getTagList("Items");
		for(int i = 0; i < items.tagCount(); i++){
			NBTTagCompound item = (NBTTagCompound)items.tagAt(i);
			int slot = item.getByte("Slot");
			if(slot >= 0 && slot < getSizeInventory()){
				setInventorySlotContents(slot, ItemStack.loadItemStackFromNBT(item));
			}
		}
	}
	
	private int item = -1;
	
	public int checkItems(){
		if(item == -1){
			getItemIDInSlot();
		}
		return item;
		
	}
	
	public void getItemIDInSlot(){

		for(int i = 0; i < getSizeInventory(); i++){
			ItemStack stack = getStackInSlot(i);
			if(stack != null && isItemValidForSlot(i, stack)){
				item = stack.itemID;
			}
		}
	}
	
	@Override
	public void onInventoryChanged() {
		super.onInventoryChanged();
		
		item = -1;
	}
	
	public void receiveButtonEvent(byte buttonId) {
		switch (buttonId) {
			case 0:
				
				break;
			default:
				buttonId -= 2;
				
		}
	}

}
