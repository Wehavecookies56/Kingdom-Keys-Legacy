package wehavecookies56.kk.Slot;

import wehavecookies56.kk.item.AddedItems;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotSynthesis extends Slot {

	public SlotSynthesis(IInventory par1iInventory, int id, int x, int y) {
		super(par1iInventory, id, x, y);
	}
	
	@Override
	public boolean isItemValid(ItemStack stack){
		if(stack.itemID == AddedItems.K1r.itemID){
			return stack.itemID == AddedItems.K1r.itemID;
		}else if(stack.itemID == AddedItems.K111r.itemID){
			return stack.itemID == AddedItems.K111r.itemID;
		}else{
			return false;
		}
	}

}
