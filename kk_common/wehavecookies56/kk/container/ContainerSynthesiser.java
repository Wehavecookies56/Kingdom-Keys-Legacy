package wehavecookies56.kk.container;

import wehavecookies56.kk.entities.tileentities.TileEntitySynthesiser;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

public class ContainerSynthesiser extends Container {

	private TileEntitySynthesiser synthesiser;
	
	public ContainerSynthesiser(InventoryPlayer invPlayer, TileEntitySynthesiser entity) {
		this.synthesiser = entity;
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return synthesiser.isUseableByPlayer(player);
		
	}

}
