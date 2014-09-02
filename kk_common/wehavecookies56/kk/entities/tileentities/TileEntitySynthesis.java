package wehavecookies56.kk.entities.tileentities;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet132TileEntityData;
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
		setInventorySlotContents(i, item);
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
		}else if(stack.itemID == AddedItems.K2r.itemID){
			return stack.itemID == AddedItems.K2r.itemID;
		}else if(stack.itemID == AddedItems.K3r.itemID){
			return stack.itemID == AddedItems.K3r.itemID;
		}else if(stack.itemID == AddedItems.K4r.itemID){
			return stack.itemID == AddedItems.K4r.itemID;
		}else if(stack.itemID == AddedItems.K5r.itemID){
			return stack.itemID == AddedItems.K5r.itemID;
		}else if(stack.itemID == AddedItems.K6r.itemID){
			return stack.itemID == AddedItems.K6r.itemID;
		}else if(stack.itemID == AddedItems.K7r.itemID){
			return stack.itemID == AddedItems.K7r.itemID;
		}else if(stack.itemID == AddedItems.K8r.itemID){
			return stack.itemID == AddedItems.K8r.itemID;
		}else if(stack.itemID == AddedItems.K9r.itemID){
			return stack.itemID == AddedItems.K9r.itemID;
		}else if(stack.itemID == AddedItems.K10r.itemID){
			return stack.itemID == AddedItems.K10r.itemID;
		}else if(stack.itemID == AddedItems.K11r.itemID){
			return stack.itemID == AddedItems.K11r.itemID;
		}else if(stack.itemID == AddedItems.K12r.itemID){
			return stack.itemID == AddedItems.K12r.itemID;
		}else if(stack.itemID == AddedItems.K13r.itemID){
			return stack.itemID == AddedItems.K13r.itemID;
		}else if(stack.itemID == AddedItems.K14r.itemID){
			return stack.itemID == AddedItems.K14r.itemID;
		}else if(stack.itemID == AddedItems.K15r.itemID){
			return stack.itemID == AddedItems.K15r.itemID;
		}else if(stack.itemID == AddedItems.K16r.itemID){
			return stack.itemID == AddedItems.K16r.itemID;
		}else if(stack.itemID == AddedItems.K17r.itemID){
			return stack.itemID == AddedItems.K17r.itemID;
		}else if(stack.itemID == AddedItems.K18r.itemID){
			return stack.itemID == AddedItems.K18r.itemID;
		}else if(stack.itemID == AddedItems.K19r.itemID){
			return stack.itemID == AddedItems.K19r.itemID;
		}else if(stack.itemID == AddedItems.K20r.itemID){
			return stack.itemID == AddedItems.K20r.itemID;
		}else if(stack.itemID == AddedItems.K21r.itemID){
			return stack.itemID == AddedItems.K21r.itemID;
		}else if(stack.itemID == AddedItems.K22r.itemID){
			return stack.itemID == AddedItems.K22r.itemID;
		}else if(stack.itemID == AddedItems.K23r.itemID){
			return stack.itemID == AddedItems.K23r.itemID;
		}else if(stack.itemID == AddedItems.K24r.itemID){
			return stack.itemID == AddedItems.K24r.itemID;
		}else if(stack.itemID == AddedItems.K25r.itemID){
			return stack.itemID == AddedItems.K25r.itemID;
		}else if(stack.itemID == AddedItems.K26r.itemID){
			return stack.itemID == AddedItems.K26r.itemID;
		}else if(stack.itemID == AddedItems.K27r.itemID){
			return stack.itemID == AddedItems.K27r.itemID;
		}else if(stack.itemID == AddedItems.K28r.itemID){
			return stack.itemID == AddedItems.K28r.itemID;
		}else if(stack.itemID == AddedItems.K29r.itemID){
			return stack.itemID == AddedItems.K29r.itemID;
		}else if(stack.itemID == AddedItems.K30r.itemID){
			return stack.itemID == AddedItems.K30r.itemID;
		}else if(stack.itemID == AddedItems.K31r.itemID){
			return stack.itemID == AddedItems.K31r.itemID;
		}else if(stack.itemID == AddedItems.K32r.itemID){
			return stack.itemID == AddedItems.K32r.itemID;
		}else if(stack.itemID == AddedItems.K33r.itemID){
			return stack.itemID == AddedItems.K33r.itemID;
		}else if(stack.itemID == AddedItems.K34r.itemID){
			return stack.itemID == AddedItems.K34r.itemID;
		}else if(stack.itemID == AddedItems.K35r.itemID){
			return stack.itemID == AddedItems.K35r.itemID;
		}else if(stack.itemID == AddedItems.K36r.itemID){
			return stack.itemID == AddedItems.K36r.itemID;
		}else if(stack.itemID == AddedItems.K37r.itemID){
			return stack.itemID == AddedItems.K37r.itemID;
		}else if(stack.itemID == AddedItems.K38r.itemID){
			return stack.itemID == AddedItems.K38r.itemID;
		}else if(stack.itemID == AddedItems.K39r.itemID){
			return stack.itemID == AddedItems.K39r.itemID;
		}else if(stack.itemID == AddedItems.K40r.itemID){
			return stack.itemID == AddedItems.K40r.itemID;
		}else if(stack.itemID == AddedItems.K41r.itemID){
			return stack.itemID == AddedItems.K41r.itemID;
		}else if(stack.itemID == AddedItems.K42r.itemID){
			return stack.itemID == AddedItems.K42r.itemID;
		}else if(stack.itemID == AddedItems.K43r.itemID){
			return stack.itemID == AddedItems.K43r.itemID;
		}else if(stack.itemID == AddedItems.K44r.itemID){
			return stack.itemID == AddedItems.K44r.itemID;
		}else if(stack.itemID == AddedItems.K45r.itemID){
			return stack.itemID == AddedItems.K45r.itemID;
		}else if(stack.itemID == AddedItems.K46r.itemID){
			return stack.itemID == AddedItems.K46r.itemID;
		}else if(stack.itemID == AddedItems.K47r.itemID){
			return stack.itemID == AddedItems.K47r.itemID;
		}else if(stack.itemID == AddedItems.K48r.itemID){
			return stack.itemID == AddedItems.K48r.itemID;
		}else if(stack.itemID == AddedItems.K49r.itemID){
			return stack.itemID == AddedItems.K49r.itemID;
		}else if(stack.itemID == AddedItems.K50r.itemID){
			return stack.itemID == AddedItems.K50r.itemID;
		}else if(stack.itemID == AddedItems.K51r.itemID){
			return stack.itemID == AddedItems.K51r.itemID;
		}else if(stack.itemID == AddedItems.K52r.itemID){
			return stack.itemID == AddedItems.K52r.itemID;
		}else if(stack.itemID == AddedItems.K53r.itemID){
			return stack.itemID == AddedItems.K53r.itemID;
		}else if(stack.itemID == AddedItems.K54r.itemID){
			return stack.itemID == AddedItems.K54r.itemID;
		}else if(stack.itemID == AddedItems.K55r.itemID){
			return stack.itemID == AddedItems.K55r.itemID;
		}else if(stack.itemID == AddedItems.K56r.itemID){
			return stack.itemID == AddedItems.K56r.itemID;
		}else if(stack.itemID == AddedItems.K57r.itemID){
			return stack.itemID == AddedItems.K57r.itemID;
		}else if(stack.itemID == AddedItems.K58r.itemID){
			return stack.itemID == AddedItems.K58r.itemID;
		}else if(stack.itemID == AddedItems.K59r.itemID){
			return stack.itemID == AddedItems.K59r.itemID;
		}else if(stack.itemID == AddedItems.K60r.itemID){
			return stack.itemID == AddedItems.K60r.itemID;
		}else if(stack.itemID == AddedItems.K61r.itemID){
			return stack.itemID == AddedItems.K61r.itemID;
		}else if(stack.itemID == AddedItems.K62r.itemID){
			return stack.itemID == AddedItems.K62r.itemID;
		}else if(stack.itemID == AddedItems.K63r.itemID){
			return stack.itemID == AddedItems.K63r.itemID;
		}else if(stack.itemID == AddedItems.K64r.itemID){
			return stack.itemID == AddedItems.K64r.itemID;
		}else if(stack.itemID == AddedItems.K65r.itemID){
			return stack.itemID == AddedItems.K65r.itemID;
		}else if(stack.itemID == AddedItems.K66r.itemID){
			return stack.itemID == AddedItems.K66r.itemID;
		}else if(stack.itemID == AddedItems.K67r.itemID){
			return stack.itemID == AddedItems.K67r.itemID;
		}else if(stack.itemID == AddedItems.K68r.itemID){
			return stack.itemID == AddedItems.K68r.itemID;
		}else if(stack.itemID == AddedItems.K69r.itemID){
			return stack.itemID == AddedItems.K69r.itemID;
		}else if(stack.itemID == AddedItems.K70r.itemID){
			return stack.itemID == AddedItems.K70r.itemID;
		}else if(stack.itemID == AddedItems.K71r.itemID){
			return stack.itemID == AddedItems.K71r.itemID;
		}else if(stack.itemID == AddedItems.K72r.itemID){
			return stack.itemID == AddedItems.K72r.itemID;
		}else if(stack.itemID == AddedItems.K73r.itemID){
			return stack.itemID == AddedItems.K73r.itemID;
		}else if(stack.itemID == AddedItems.K74r.itemID){
			return stack.itemID == AddedItems.K74r.itemID;
		}else if(stack.itemID == AddedItems.K75r.itemID){
			return stack.itemID == AddedItems.K75r.itemID;
		}else if(stack.itemID == AddedItems.K76r.itemID){
			return stack.itemID == AddedItems.K76r.itemID;
		}else if(stack.itemID == AddedItems.K77r.itemID){
			return stack.itemID == AddedItems.K77r.itemID;
		}else if(stack.itemID == AddedItems.K78r.itemID){
			return stack.itemID == AddedItems.K78r.itemID;
		}else if(stack.itemID == AddedItems.K79r.itemID){
			return stack.itemID == AddedItems.K79r.itemID;
		}else if(stack.itemID == AddedItems.K80r.itemID){
			return stack.itemID == AddedItems.K80r.itemID;
		}else if(stack.itemID == AddedItems.K81r.itemID){
			return stack.itemID == AddedItems.K81r.itemID;
		}else if(stack.itemID == AddedItems.K82r.itemID){
			return stack.itemID == AddedItems.K82r.itemID;
		}else if(stack.itemID == AddedItems.K83r.itemID){
			return stack.itemID == AddedItems.K83r.itemID;
		}else if(stack.itemID == AddedItems.K84r.itemID){
			return stack.itemID == AddedItems.K84r.itemID;
		}else if(stack.itemID == AddedItems.K85r.itemID){
			return stack.itemID == AddedItems.K85r.itemID;
		}else if(stack.itemID == AddedItems.K86r.itemID){
			return stack.itemID == AddedItems.K86r.itemID;
		}else if(stack.itemID == AddedItems.K87r.itemID){
			return stack.itemID == AddedItems.K87r.itemID;
		}else if(stack.itemID == AddedItems.K88r.itemID){
			return stack.itemID == AddedItems.K88r.itemID;
		}else if(stack.itemID == AddedItems.K89r.itemID){
			return stack.itemID == AddedItems.K89r.itemID;
		}else if(stack.itemID == AddedItems.K90r.itemID){
			return stack.itemID == AddedItems.K90r.itemID;
		}else if(stack.itemID == AddedItems.K91r.itemID){
			return stack.itemID == AddedItems.K91r.itemID;
		}else if(stack.itemID == AddedItems.K92r.itemID){
			return stack.itemID == AddedItems.K92r.itemID;
		}else if(stack.itemID == AddedItems.K93r.itemID){
			return stack.itemID == AddedItems.K93r.itemID;
		}else if(stack.itemID == AddedItems.K94r.itemID){
			return stack.itemID == AddedItems.K94r.itemID;
		}else if(stack.itemID == AddedItems.K95r.itemID){
			return stack.itemID == AddedItems.K95r.itemID;
		}else if(stack.itemID == AddedItems.K96r.itemID){
			return stack.itemID == AddedItems.K96r.itemID;
		}else if(stack.itemID == AddedItems.K97r.itemID){
			return stack.itemID == AddedItems.K97r.itemID;
		}else if(stack.itemID == AddedItems.K98r.itemID){
			return stack.itemID == AddedItems.K98r.itemID;
		}else if(stack.itemID == AddedItems.K99r.itemID){
			return stack.itemID == AddedItems.K99r.itemID;
		}else if(stack.itemID == AddedItems.K100r.itemID){
			return stack.itemID == AddedItems.K100r.itemID;
		}else if(stack.itemID == AddedItems.K101r.itemID){
			return stack.itemID == AddedItems.K101r.itemID;
		}else if(stack.itemID == AddedItems.K102r.itemID){
			return stack.itemID == AddedItems.K102r.itemID;
		}else if(stack.itemID == AddedItems.K103r.itemID){
			return stack.itemID == AddedItems.K103r.itemID;
		}else if(stack.itemID == AddedItems.K104r.itemID){
			return stack.itemID == AddedItems.K104r.itemID;
		}else if(stack.itemID == AddedItems.K105r.itemID){
			return stack.itemID == AddedItems.K105r.itemID;
		}else if(stack.itemID == AddedItems.K106r.itemID){
			return stack.itemID == AddedItems.K106r.itemID;
		}else if(stack.itemID == AddedItems.K107r.itemID){
			return stack.itemID == AddedItems.K107r.itemID;
		}else if(stack.itemID == AddedItems.K108r.itemID){
			return stack.itemID == AddedItems.K108r.itemID;
		}else if(stack.itemID == AddedItems.K109r.itemID){
			return stack.itemID == AddedItems.K109r.itemID;
		}else if(stack.itemID == AddedItems.K110r.itemID){
			return stack.itemID == AddedItems.K110r.itemID;
		}else if(stack.itemID == AddedItems.K111r.itemID){
			return stack.itemID == AddedItems.K111r.itemID;
		}else if(stack.itemID == AddedItems.K112r.itemID){
			return stack.itemID == AddedItems.K112r.itemID;
		}else if(stack.itemID == AddedItems.K113r.itemID){
			return stack.itemID == AddedItems.K113r.itemID;
		}else if(stack.itemID == AddedItems.K114r.itemID){
			return stack.itemID == AddedItems.K114r.itemID;
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
	
	public Packet getDescriptionPacket() {
        NBTTagCompound nbtTag = new NBTTagCompound();
        this.writeToNBT(nbtTag);
        return new Packet132TileEntityData(this.xCoord, this.yCoord, this.zCoord, 1, nbtTag);
}

	public void onDataPacket(INetworkManager net, Packet132TileEntityData packet) {
        readFromNBT(packet.data);
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
