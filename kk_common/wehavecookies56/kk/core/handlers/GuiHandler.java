package wehavecookies56.kk.core.handlers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.client.gui.GuiSynthesis;
import wehavecookies56.kk.container.ContainerSynthesis;
import wehavecookies56.kk.entities.tileentities.TileEntitySynthesis;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;

public class GuiHandler implements IGuiHandler {
	
	public GuiHandler(){
		NetworkRegistry.instance().registerGuiHandler(KingdomKeys.instance, this);
	}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		switch (ID){
		case 0:
			TileEntity te = world.getBlockTileEntity(x, y, z);
			if(te != null && te instanceof TileEntitySynthesis){
				return new ContainerSynthesis(player.inventory, (TileEntitySynthesis)te);
			}
			break;
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		switch(ID){
		case 0:
			TileEntity te = world.getBlockTileEntity(x, y, z);
			if (te != null && te instanceof TileEntitySynthesis){
				return new GuiSynthesis(player.inventory, (TileEntitySynthesis)te);
			}
			break;
		}
		return null;
	}

}
