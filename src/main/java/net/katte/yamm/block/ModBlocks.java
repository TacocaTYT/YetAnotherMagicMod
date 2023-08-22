package net.katte.yamm.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.katte.yamm.YAMagicM;
import net.katte.yamm.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block PLATINUM_BLOCK = registerBlock("platinum_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(2f).requiresTool()), ModItemGroup.MAGIC_MATERIALS);
    public static final Block PLATINUM_ORE = registerBlock("platinum_ore",
            new OreBlock(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool(), UniformIntProvider.create(2,8)), ModItemGroup.MAGIC_MATERIALS);
    public static final Block SILVER_ORE = registerBlock("silver_ore",
            new OreBlock(FabricBlockSettings.of(Material.METAL).strength(2f).requiresTool(), UniformIntProvider.create(2,8)), ModItemGroup.MAGIC_MATERIALS);
    public static final Block DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore",
            new OreBlock(FabricBlockSettings.of(Material.METAL).strength(3f).requiresTool(), UniformIntProvider.create(2,8)), ModItemGroup.MAGIC_MATERIALS);
    public static final Block SILVER_BLOCK = registerBlock("silver_block",
            new OreBlock(FabricBlockSettings.of(Material.METAL).strength(2f).requiresTool(), UniformIntProvider.create(2,8)), ModItemGroup.MAGIC_MATERIALS);


    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(YAMagicM.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(YAMagicM.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        YAMagicM.LOGGER.debug("Registering Mod Blocks for " + YAMagicM.MOD_ID);
    }
}
