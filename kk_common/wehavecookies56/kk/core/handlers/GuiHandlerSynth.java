package wehavecookies56.kk.core.handlers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import wehavecookies56.kk.block.AddedBlocks;
import wehavecookies56.kk.client.gui.SynthGui;
import wehavecookies56.kk.container.ContainerSynth;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandlerSynth implements IGuiHandler{
	@Override
	public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
	{
		TileEntity tile_entity = world.getBlockTileEntity(x, y, z);
		switch(id)
		{
		case 0: return id == 0 && world.getBlockId(x, y, z) == AddedBlocks.Synthesiser.blockID ? new ContainerSynth(player.inventory, world, x, y, z) : null;
		}
		return null;
	}
	@Override
	public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
	{
		TileEntity tile_entity = world.getBlockTileEntity(x, y, z);
		switch(id)
		{
		case 0: return id == 0 && world.getBlockId(x, y, z) == AddedBlocks.Synthesiser.blockID ? new SynthGui(player.inventory, world, x, y, z) : null;
		}
		return null;
	}
}
