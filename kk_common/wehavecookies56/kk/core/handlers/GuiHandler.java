package wehavecookies56.kk.core.handlers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.client.gui.GuiSynthesiser;
import wehavecookies56.kk.container.ContainerSynthesiser;
import wehavecookies56.kk.entities.tileentities.TileEntitySynthesiser;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;

public class GuiHandler implements IGuiHandler {

	public GuiHandler() {
		NetworkRegistry.instance().registerGuiHandler(KingdomKeys.instance, this);
		}
	@Override
	public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getBlockTileEntity(x, y, z);

		switch(id) {
		case 0:
		if(entity != null && entity instanceof TileEntitySynthesiser) {
		return new ContainerSynthesiser(player.inventory, (TileEntitySynthesiser) entity);
		} else {
		return null;
		}
		default:
		return null;
		}

	}
	
	@Override
	public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getBlockTileEntity(x, y, z);

		switch(id) {
		case 0:
		if(entity != null && entity instanceof TileEntitySynthesiser) {
		return new GuiSynthesiser(player.inventory, (TileEntitySynthesiser) entity);
		} else {
		return null;
		}
		default:
		return null;
		}
		
	}
}
