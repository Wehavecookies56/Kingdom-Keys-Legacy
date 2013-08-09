package wehavecookies56.kk.block;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import wehavecookies56.kk.lib.IDs;
import wehavecookies56.kk.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class AddedBlocks {

    public static Block NormalBlox;
    public static Block HardBlox;
    public static Block MetalBlox;
    public static Block PrizeBlox;
    public static Block RarePrizeBlox;
    public static Block BounceBlox;
    public static Block DangerBlox;
    public static Block HeartPurifyer;
    
    public static void preinit(){
        
        NormalBlox = new BlockNormalBlox(IDs.NBlox, Material.rock);
        GameRegistry.registerBlock(NormalBlox, Strings.NBlox);
        
        HardBlox = new BlockHardBlox(IDs.HBlox, Material.rock);
        GameRegistry.registerBlock(HardBlox, Strings.HBlox);
        
        //HeartPurifyer = new BlockHeartPurifyer(IDs.HPurify, Material.rock);
        //GameRegistry.registerBlock(HeartPurifyer, Strings.HPurify);
        //LanguageRegistry.addName(HeartPurifyer, Strings.HPurify);
        
        MetalBlox = new BlockMetalBlox(IDs.MBlox, Material.iron);
        GameRegistry.registerBlock(MetalBlox, Strings.MBlox);
        
        PrizeBlox = new BlockPrizeBlox(IDs.PBlox, Material.sand);
        GameRegistry.registerBlock(PrizeBlox, Strings.PBlox);
        
        RarePrizeBlox = new BlockRarePrizeBlox(IDs.RPBlox, Material.sand);
        GameRegistry.registerBlock(RarePrizeBlox, Strings.RPBlox);
        
        BounceBlox = new BlockBounceBlox(IDs.BBlox, Material.iron);
        GameRegistry.registerBlock(BounceBlox, Strings.BBlox);
        
        DangerBlox = new BlockDangerBlox(IDs.DBlox, Material.iron);
        GameRegistry.registerBlock(DangerBlox, Strings.DBlox);
    }
    
    
}
