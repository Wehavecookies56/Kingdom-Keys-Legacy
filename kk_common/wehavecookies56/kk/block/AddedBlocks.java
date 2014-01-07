package wehavecookies56.kk.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import wehavecookies56.kk.entities.tileentities.TileEntitySynthesis;
import wehavecookies56.kk.item.AddedItems;
import wehavecookies56.kk.lib.IDs;
import wehavecookies56.kk.lib.Strings;
import cpw.mods.fml.common.registry.GameRegistry;

public class AddedBlocks {

    public static Block
    SynthesiserMini, NormalBlox, HardBlox, MetalBlox, PrizeBlox, RarePrizeBlox, BounceBlox, DangerBlox, BlastBlox, Synthesiser, BlazingOre, BlazingOreN, LightningOre, FrostOre, DenseOre, PowerOre, PowerOreE, EnergyOre, EnergyOreN, RemembranceOre, RemembranceOreN, SerenityOre, TwilightOre, TwilightOreN, TranquilOre, BrightOre, DarkOre, DarkOreN, DarkOreE, LucidOre;

    public static void preinit(){
    	//Bug Blox
        NormalBlox = new BlockNormalBlox(IDs.NBlox, Material.rock); GameRegistry.registerBlock(NormalBlox, Strings.NBlox);
        HardBlox = new BlockHardBlox(IDs.HBlox, Material.rock); GameRegistry.registerBlock(HardBlox, Strings.HBlox);
        MetalBlox = new BlockMetalBlox(IDs.MBlox, Material.iron); GameRegistry.registerBlock(MetalBlox, Strings.MBlox);
        PrizeBlox = new BlockPrizeBlox(IDs.PBlox, Material.sand); GameRegistry.registerBlock(PrizeBlox, Strings.PBlox);
        RarePrizeBlox = new BlockRarePrizeBlox(IDs.RPBlox, Material.sand); GameRegistry.registerBlock(RarePrizeBlox, Strings.RPBlox);
        BounceBlox = new BlockBounceBlox(IDs.BBlox, Material.iron); GameRegistry.registerBlock(BounceBlox, Strings.BBlox);
        DangerBlox = new BlockDangerBlox(IDs.DBlox, Material.iron); GameRegistry.registerBlock(DangerBlox, Strings.DBlox);
        BlastBlox = new BlockBlastBlox(IDs.BLBlox); GameRegistry.registerBlock(BlastBlox, Strings.BLBlox);
        Synthesiser = new BlockSynthesis(IDs.Synthesis); GameRegistry.registerBlock(Synthesiser, Strings.Synthesiser);      
        SynthesiserMini = new BlockSynthesisMini(IDs.SynthesisMini); GameRegistry.registerBlock(SynthesiserMini, Strings.SynthesiserMini);      
        //Synthesis ores
        BlazingOre = new BlockBlazingOre(IDs.BlazingOre, Material.rock); GameRegistry.registerBlock(BlazingOre, Strings.BlazingOre); MinecraftForge.setBlockHarvestLevel(BlazingOre, "pickaxe", 1);
        //BlazingOreN = new BlockBlazingOreN(IDs.BlazingOreN, Material.rock); GameRegistry.registerBlock(BlazingOreN, Strings.BlazingOreN); MinecraftForge.setBlockHarvestLevel(BlazingOreN, "pickaxe", 1);
        LightningOre = new BlockLightningOre(IDs.LightningOre, Material.rock); GameRegistry.registerBlock(LightningOre, Strings.LightningOre); MinecraftForge.setBlockHarvestLevel(LightningOre, "pickaxe", 1);
        FrostOre = new BlockFrostOre(IDs.FrostOre, Material.rock); GameRegistry.registerBlock(FrostOre, Strings.FrostOre); MinecraftForge.setBlockHarvestLevel(FrostOre, "pickaxe", 1);
        DenseOre = new BlockDenseOre(IDs.DenseOre, Material.rock); GameRegistry.registerBlock(DenseOre, Strings.DenseOre); MinecraftForge.setBlockHarvestLevel(DenseOre, "pickaxe", 2);
        PowerOre = new BlockPowerOre(IDs.PowerOre, Material.rock); GameRegistry.registerBlock(PowerOre, Strings.PowerOre); MinecraftForge.setBlockHarvestLevel(PowerOre, "pickaxe", 2);
        PowerOreE = new BlockPowerOreE(IDs.PowerOreE, Material.rock); GameRegistry.registerBlock(PowerOreE, Strings.PowerOreE); MinecraftForge.setBlockHarvestLevel(PowerOreE, "pickaxe", 2);
        EnergyOre = new BlockEnergyOre(IDs.EnergyOre, Material.rock); GameRegistry.registerBlock(EnergyOre, Strings.EnergyOre); MinecraftForge.setBlockHarvestLevel(EnergyOre, "pickaxe", 2);
        //EnergyOreN = new BlockEnergyOreN(IDs.EnergyOreN, Material.rock); GameRegistry.registerBlock(EnergyOreN, Strings.EnergyOreN); MinecraftForge.setBlockHarvestLevel(EnergyOreN, "pickaxe", 2);
        RemembranceOre = new BlockRemembranceOre(IDs.RemembranceOre, Material.rock); GameRegistry.registerBlock(RemembranceOre, Strings.RemembranceOre); MinecraftForge.setBlockHarvestLevel(RemembranceOre, "pickaxe", 1);
        //RemembranceOreN = new BlockRemembranceOreN(IDs.RemembranceOreN, Material.rock); GameRegistry.registerBlock(RemembranceOreN, Strings.RemembranceOreN); MinecraftForge.setBlockHarvestLevel(RemembranceOreN, "pickaxe", 1);
        SerenityOre = new BlockSerenityOre(IDs.SerenityOre, Material.rock); GameRegistry.registerBlock(SerenityOre, Strings.SerenityOre); MinecraftForge.setBlockHarvestLevel(SerenityOre, "pickaxe", 2);
        TwilightOre = new BlockTwilightOre(IDs.TwilightOre, Material.rock); GameRegistry.registerBlock(TwilightOre, Strings.TwilightOre); MinecraftForge.setBlockHarvestLevel(TwilightOre, "pickaxe", 3);
        //TwilightOreN = new BlockTwilightOreN(IDs.TwilightOreN, Material.rock); GameRegistry.registerBlock(TwilightOreN, Strings.TwilightOreN); MinecraftForge.setBlockHarvestLevel(TwilightOreN, "pickaxe", 3);
        TranquilOre = new BlockTranquilOre(IDs.TranquilOre, Material.rock); GameRegistry.registerBlock(TranquilOre, Strings.TranquilOre); MinecraftForge.setBlockHarvestLevel(TranquilOre, "pickaxe", 2);
        BrightOre = new BlockBrightOre(IDs.BrightOre, Material.rock); GameRegistry.registerBlock(BrightOre, Strings.BrightOre); MinecraftForge.setBlockHarvestLevel(BrightOre, "pickaxe", 3);
        DarkOre = new BlockDarkOre(IDs.DarkOre, Material.rock); GameRegistry.registerBlock(DarkOre, Strings.DarkOre); MinecraftForge.setBlockHarvestLevel(DarkOre, "pickaxe", 3);
        //DarkOreN = new BlockDarkOreN(IDs.DarkOreN, Material.rock); GameRegistry.registerBlock(DarkOreN, Strings.DarkOreN); MinecraftForge.setBlockHarvestLevel(DarkOreN, "pickaxe", 3);
        DarkOreE = new BlockDarkOreE(IDs.DarkOreE, Material.rock); GameRegistry.registerBlock(DarkOreE, Strings.DarkOreE); MinecraftForge.setBlockHarvestLevel(DarkOreE, "pickaxe", 3);
        LucidOre = new BlockLucidOre(IDs.LucidOre, Material.rock); GameRegistry.registerBlock(LucidOre, Strings.LucidOre); MinecraftForge.setBlockHarvestLevel(LucidOre, "pickaxe", 2);
        GameRegistry.registerTileEntity(TileEntitySynthesis.class, Strings.Synthesiser);
    } 
    
}