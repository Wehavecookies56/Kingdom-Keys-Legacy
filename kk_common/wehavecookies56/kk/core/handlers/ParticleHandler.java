package wehavecookies56.kk.core.handlers;

import java.util.EnumSet;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import scala.tools.nsc.ast.Trees;
import wehavecookies56.kk.entities.EntityPagesFX;
import wehavecookies56.kk.item.AddedItems;
import wehavecookies56.kk.item.ItemBookOfRetribution;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class ParticleHandler implements ITickHandler
{
        @Override
        public void tickStart(EnumSet<TickType> type, Object... tickData)
        {
                playerTick((EntityPlayer) tickData[0]);
        }
        @Override
        public void tickEnd(EnumSet<TickType> type, Object... tickData)
        {
        }
        @Override
        public EnumSet<TickType> ticks()
        {
                return EnumSet.of(TickType.PLAYER);
        }
        @Override
        public String getLabel()
        {
                return null;
        }

        public void playerTick(EntityPlayer player)
        {
                if (player.getCurrentEquippedItem() != null)
                {
                        if (player.getCurrentEquippedItem().itemID == AddedItems.BookOfRetribution.itemID)
                        {
                            Minecraft.getMinecraft().effectRenderer.addEffect(new EntityPagesFX(Minecraft.getMinecraft().theWorld, player.posX, player.posY, player.posZ));
                        }
                }
        }
}
