package wehavecookies56.kk.container;

import wehavecookies56.kk.entities.tileentities.TileEntitySynthesiser;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;

public class ContainerSynthesiser extends Container {

	private TileEntitySynthesiser synthesiser;
	
	public ContainerSynthesiser(InventoryPlayer invPlayer, TileEntitySynthesiser entity) {
		this.synthesiser = entity;
		
		for(int x = 0; x < 9; x++) {
			  this.addSlotToContainer(new Slot(invPlayer, x, 8 + x * 18, 142));
			}
		for(int y = 0; y < 3; y++) {
			  for(int x = 0; x < 9; x++) {
			        this.addSlotToContainer(new Slot(invPlayer, 9 + x + y * 9, 8 + x * 18, 84 + y * 18));
			  }
			}
		for(int y = 0; y < 3; y++) {
			  for(int x = 0; x < 3; x++) {
			        addSlotToContainer(new Slot(entity, x + y * 3, 62 + x * 18, 17 + y * 18));
			  }
			}
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return synthesiser.isUseableByPlayer(player);
		
	}

}
